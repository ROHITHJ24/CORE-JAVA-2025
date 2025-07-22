class EncapsulationExample{
private String Name;
private String Dept;
private String Exp;

public String getName(){
    return Name;
}
public void setName(String Name){
    this.Name=Name;
}
public String getDept(){
    return Dept;
}
public void setDept(String Dept){
    this.Dept=Dept;
}
public String getExp(){
    return Exp;
}
public void setExp(String Exp){
    this.Exp=Exp;
}

public static void main(String[] args) {
 EncapsulationExample enc = new EncapsulationExample();
 enc.setName("KSRCE");
 System.out.println(enc.getName());
 enc.setDept("CIVIL");
 System.out.println(enc.getDept());
 enc.setExp("Exp1\nExp2\n");
 System.out.println(enc.getExp());

}
}