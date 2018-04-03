public class student {
    private String cName,id;
    public student(String cName1,String id1){
        this.setcname(cName1);
        this.setId(id1);
    }

    public void setcname(String cName1){
        if(cName1.length()<=10){
            this.cName=cName1;
        }
        else {
            System.out.println(id="輸入錯誤超過10個字");
            this.cName="輸入錯誤超過10個字";
            cName.substring(0,10);
        }
    }

    public String getcName(){
        return cName;
    }

    public void setId(String id1){
        if(id1.matches("[0-9]{9}")){
        this.id=id1;
        }
        else {
        System.out.println("error:你輸入已超過範圍");
        this.id="999999999";
        }
    }
    public String getId(){
        return id;
    }


}
