
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut ","TRH","5555");
        Teacher t2 = new Teacher("Alev", "FZK", "0000");
        Teacher t3=new Teacher("Sema","BIO","111");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course tarihS=new Course("tarihS","101","TRH");

        Course fizik=new Course("Fizik","102","FZK");
        Course fizikS=new Course("Fizik","102","FZK");

        Course biyo=new Course("Biyoloji","101","BIO");
        Course biyoS=new Course("Biyoloji","101","BIO");




        Student s1=new Student("Rabia","123","4",tarih,fizik,biyo,tarihS,fizikS,biyoS);
        s1.addBulkExamNote(100,78,50,60,75,80);
        s1.isPass();


        Student s2=new Student("Zehra","444","4",tarih,fizik,biyo,tarihS,fizikS,biyoS);
        s2.addBulkExamNote(50,30,70,50,55,60);
        s2.isPass();

        Student s3=new Student("Seyfullah","362","4",tarih,fizik,biyo,tarihS,fizikS,biyoS);
        s3.addBulkExamNote(50,60,70,80,90,60);
        s3.isPass();
    }
}