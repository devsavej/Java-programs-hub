package Day7;

public class Demo {
    public Animal[] getanimal(){
        Animal a[]=new Animal[3];
        a[0]=new Dog();
        a[1]=new Cat();
        a[2]=new Tiger();
        return a;
    }

    public static void main(String[] args) {
        Demo d1=new Demo();
        Animal[] animals=d1.getanimal();
        for (Animal a:animals){
            a.eat();
            a.walking();
            a.makeNoise();

            if(a instanceof Dog){
                ((Dog) a).Handshake();
            }

        }



    }

    }
