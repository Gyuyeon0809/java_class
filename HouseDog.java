public class HouseDog extends Dog{


    public HouseDog(int type){
        if (type == 1) {
            this.setName("yorkshire");
        }else if(type == 2){
            this.setName("bulldog");
        }
    }

    public HouseDog(String name){
        this.setName(name);
    }
    public void sleep() {
        System.out.println(this.name+" zzz in house");
        
    }
    public void sleep(int hour) {
        System.out.println(this.name + " zzz in the house for"+ hour + "hours");
        
    }
    public static void main(String[] args) {
        HouseDog dog = new HouseDog("Happy");
        HouseDog Happy = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(Happy.name);
    }
    
}
