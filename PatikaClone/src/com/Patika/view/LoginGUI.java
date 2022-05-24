package com.Patika.view;

import com.Patika.helper.Config;
import com.Patika.helper.Helper;
import com.Patika.model.Educator;
import com.Patika.model.Operator;
import com.Patika.model.Student;
import com.Patika.model.User;

import javax.swing.*;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JTextField fld_user_uname;
    private JPasswordField fld_user_pass;
    private JButton btn_login;
    private JButton btn_sign_info;
    private JPanel wtop;
    private JPanel wbottom;

    public LoginGUI() {
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

//login ekranı giriş yap butonu metodu
        btn_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_uname) || Helper.isFieldEmpty(fld_user_pass)){
                Helper.showMsg("fill");
            }
            else{
                User u = User.getFetch(fld_user_uname.getText(), fld_user_pass.getText());
                if (u == null){
                    Helper.showMsg("Kullanıcı bulunamadı. Kullanıcı adı veya şifre hatalı.");
                }
                else{
                    switch (u.getType()){
                        case "operator":
                            OperatorGUI opGUI = new OperatorGUI((Operator) u);
                            break;
                        case "educator":
                            EducatorGUI edGUI = new EducatorGUI((Educator) u);
                            break;
                        case "student":
                            StudentGUI stGUI = new StudentGUI((Student) u);
                            break;
                    }
                    dispose();
                }
            }
        });

        btn_sign_info.addActionListener(e -> {
            SignUpGUI signGUI = new SignUpGUI();
        });
    }
    public static void main(String[] args){
        Helper.setLayout();
        LoginGUI l = new LoginGUI();

    }
}
