public class Child extends Parent {

    public static String classValue;

    public Child(int a, String n, String c){
        super(a,n);
        classValue = c;
    }
    public Child(String a){
        classValue = a;
    }
    public String getClassValue() {
        return classValue;
    }
    @Override
    public String getNameLength() {
        return null;
    }

    public void setNameinChild(String name){
        setName(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
