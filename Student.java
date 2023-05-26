public class Student {
    Course fizik;
    Course tarih;
    Course biyo;
    Course fizikS;
    Course tarihS;
    Course biyoS;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course fizik,Course fizikS, Course tarih,Course tarihS, Course biyo,Course biyoS) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.fizik = fizik;
        this.tarih = tarih;
        this.biyo = biyo;
        this.fizikS=fizikS;
       this.tarihS=tarihS;
        this.biyoS=biyoS;
        this.avarage = 0.0;
        this.isPass = false;

    }


    void addBulkExamNote(int fizik,int fizikS, int tarih,int tarihS,int biyo, int biyoS) {
        if (fizik >= 0 && fizik <= 100) {
            if(fizikS>=0&&fizikS<=100) {
                this.fizik.note = ((fizik * 8) / 10 + (fizikS * 2) /10);
            }

        }
        if (tarih >= 0 && tarih <= 100) {
            if (tarihS>=0 && tarihS<=100) {
                this.tarih.note = ((tarih * 8)/10 + (tarihS * 2)/10);
            }
        }
        if (biyo >= 0 && biyo <= 100) {
            if (biyoS >= 0 && biyoS<= 100) {
                this.biyo.note = (( biyo* 8)/10 + (biyoS * 2)/10);
            }

        }



    }
    void isPass(){
        System.out.println("--------------");
        this.avarage=( this.tarih.note+ this.fizik.note+this.biyo.note)/3.0;
        if(this.avarage>55){
            System.out.println("TEBRİKLER SINIFI GEÇTİNİZ :)");
            this.isPass=true;
        }
        else {
            System.out.println("MAALESEF SINIFTA KALDINIZ.SENEYE TEKRAR DENEYİNİZ :(");
            this.isPass=false;
        }

        printNote();
    }
      void printStudentName(){
        this.name=name;
      }




    void printNote(){

        System.out.println("ÖĞRENCİNİN ADI:"+this.name);
        System.out.println(this.fizik.name+" Notu:\t"+ fizik.note);
        System.out.println(this.tarih.name+" Notu:\t"+ tarih.note);
        System.out.println(this.biyo.name+" Notu:\t"+ biyo.note);
        System.out.println("Ortalamanız:"+ this.avarage);

    }
}
