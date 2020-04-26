public class CorporateName{
    private String name = "EXAMPLE";
    public String exchanger;
    public CorporateName(){
    }
    public CorporateName(String name){
        if(name != null)
            this.name = name;
        else
            System.out.println("INVALID VALUE");
    }
    public void setName(String name){
        if(name!=null)
            this.name = name;
        else
            System.out.println("INVALID VALUE");
    }
    public String getName(){
        this.name = name.trim();
        if(name==null){
            System.out.println("INVALID VALUE");
            return null;
        }else if(name.length()==0){
            System.out.println("INVALID VALUE");
            return name = "EXAMPLE";
        }else
            return this.name;
    }
    public String toString(){
		if(name==null)
			System.out.println("INVALID VALUE");
		return this.name; 
    }
    public String domain(){
        if(name==null)
            System.out.println("INVALID VALUE");
        else
            exchanger = name.toLowerCase();
            this.name = exchanger.replace(" ", "-");
            return "www." + this.name + ".com";
    }
    @Override
    public boolean equals(Object obj){
        CorporateName n1 = (CorporateName)obj;
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj == obj){
            return true;
        }

        return false;
    }
    public boolean equals(CorporateName n1){
	    if(n1==this){
		    return true;
	    }
	    return(n1.name==this.name);
    }
}