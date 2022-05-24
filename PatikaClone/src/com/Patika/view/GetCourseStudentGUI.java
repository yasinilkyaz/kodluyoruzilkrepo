package com.Patika.view;

import com.Patika.helper.Config;
import com.Patika.helper.Helper;
import com.Patika.model.Course;
import com.Patika.model.RegisteredCourse;
import com.Patika.model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class GetCourseStudentGUI extends JFrame {
    private JPanel wrapper;
    private JPanel pnl_top;
    private JPanel pnl_stu_course_list;
    private JScrollPane scrl_course_list;
    private JTable tbl_stu_course_list;
    private JPanel pnl_course_register;
    private JTextField fld_register_course_id;
    private JButton btn_register_course;

    DefaultTableModel mdl_course_list = new DefaultTableModel();
    private Object[] row_course_list;

    private int patika_id;
    private Student student = new Student();

    public GetCourseStudentGUI(int patika_id, Student student) {
        this.patika_id = patika_id;
        this.student = student;
        add(wrapper);
        setSize(900, 400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

//Dersler sekmesi kodları başlangıcı
        mdl_course_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3 || column == 4)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] col_edu_course_list = {"ID", "Dersin Adı", "Programlama Dili", "Patika", "Eğitmen"};
        mdl_course_list.setColumnIdentifiers(col_edu_course_list);
        row_course_list = new Object[col_edu_course_list.length];
        loadCourseModel();
        tbl_stu_course_list.setModel(mdl_course_list);
        tbl_stu_course_list.getColumnModel().getColumn(0).setMaxWidth(75);
        tbl_stu_course_list.getTableHeader().setReorderingAllowed(false);
//Dersler sekmesi kodları bitişi

        tbl_stu_course_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String select_course_id = tbl_stu_course_list.getValueAt(tbl_stu_course_list.getSelectedRow(), 0).toString();
                fld_register_course_id.setText(select_course_id);
            } catch (Exception exception) {

            }
        });

        btn_register_course.addActionListener(e -> {
            ArrayList<Integer> listCorseID = new ArrayList<>();

            if (Helper.isFieldEmpty(fld_register_course_id)) {
                Helper.showMsg("fill");
            } else {
                for (RegisteredCourse c : RegisteredCourse.getList()) { //var olan dersi tekrar eklememek için yazıldı
                    listCorseID.add(c.getCourse_id());
                }
                if (!listCorseID.contains(Integer.parseInt(fld_register_course_id.getText()))) {
                    if (RegisteredCourse.add(Integer.parseInt(fld_register_course_id.getText()), student.getId())) {
                        Helper.showMsg("done");
                        fld_register_course_id.setText(null);

                    } else {
                        Helper.showMsg("error");
                    }
                } else if (listCorseID.contains(Integer.parseInt(fld_register_course_id.getText()))) {
                    Helper.showMsg("Ders zaten ekli");

                }
            }
        });
    }

    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_stu_course_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Course obj : Course.getListByPatikaID(patika_id)) {
            i = 0;
            row_course_list[i++] = obj.getId();
            row_course_list[i++] = obj.getName();
            row_course_list[i++] = obj.getLang();
            row_course_list[i++] = obj.getPatika().getName();
            row_course_list[i++] = obj.getEducator().getName();
            mdl_course_list.addRow(row_course_list);
        }
    }
}
