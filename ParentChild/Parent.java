public abstract class Parent {
    private String name;
    public int age;
    public static String type;

    public Parent(){
    }
    public Parent(int a, String n){
        this.age = a;
        this.name = n;
    }
    public abstract String getNameLength();

    public String getType() {
        return this.type;
    }

        public int getAge() {
            return this.age;
        }

            public String getName(){
                return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

}
