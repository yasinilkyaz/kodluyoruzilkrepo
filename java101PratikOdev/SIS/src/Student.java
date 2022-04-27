public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course matSoz;
    Course kimyaSoz;
    Course fizikSoz;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course matSoz, Course kimyaSoz, Course fizikSoz) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matSoz = matSoz;
        this.kimyaSoz = kimyaSoz;
        this.fizikSoz = fizikSoz;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matSoz, int kimyaSoz, int fizikSoz) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (matSoz >= 0 && matSoz <= 100) {
            this.matSoz.note = matSoz;
        }
        if (kimyaSoz >= 0 && kimyaSoz <= 100) {
            this.kimyaSoz.note = kimyaSoz;
        }
        if (fizikSoz >= 0 && fizikSoz <= 100) {
            this.fizikSoz.note = fizikSoz;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.matSoz.note == 0 || this.kimyaSoz.note == 0 || this.fizikSoz.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.8) + (this.fizik.fizikSoz * 0.2)) + ((this.mat.note * 0.8) + (this.mat.matSoz * 0.2)) + ((this.kimya.note * 0.8) + (this.kimya.kimyaSoz * 0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " Matematik Sözlü Notu : " + this.matSoz.note);
        System.out.println("Fizik Notu : " + this.fizik.note + " Fizik Sözlü Notu : " + this.fizikSoz.note);
        System.out.println("Kimya Notu : " + this.kimya.note + " Kimya Sözlü Notu : " + this.kimyaSoz.note);
    }
}
