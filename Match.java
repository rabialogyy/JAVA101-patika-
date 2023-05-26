public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("----- YENİ ROUND----");
                if (firstToAttack() == true) {
                    this.f2.health = f1.hit(this.f2);
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);

                    if (iswin()) {
                        break;
                    }
                } else {
                    this.f1.health = f2.hit(this.f1);
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                    if (iswin()) {
                        break;
                    }
                }


            }


        } else {
            System.out.println("Sporcu sıkletlerı uyuşmadı.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean iswin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandı");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandı");
            return true;
        }
        return false;
    }

    boolean firstToAttack() {
        int number = (int) (Math.random() * 10);
        if (number <= 5) {
            return true; // if it is true, then f1 will start.
        }
        return false;
    }

}
