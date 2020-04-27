public class CorporateName {
    private String name;
    CorporateName(){
        this.name = "EXAMPLE";
    }
    CorporateName(String name){
        if(name==null||name.trim().equals("")){
            System.out.println("INVALID VALUE");
            this.name = "EXAMPLE";
        }else{
        this.name = name.trim();
        }
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        if(name==null||name.trim().equals("")){
            System.out.println("INVALID VALUE");
            this.name = "EXAMPLE";
        }else{
        this.name = name.trim();
        }
    }
    public String toString(){
        return this.name;
    }
    public boolean equals(CorporateName a){
        return (a.name.equals(this.name)||a == this || ((CorporateName)(a)).name.equals(this.name));
    }
    public boolean equals(Object obj){
        CorporateName a = (CorporateName) obj;
        return (a.name.equals(this.name)||a == this || ((CorporateName)(a)).name.equals(this.name));
    }
    String domain(){
        return ("www."+this.name.toLowerCase()+".com").replaceAll("\\s+", "-");
    }
}
