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
        if(obj==this||n1==this){
            return true;
        }else if(obj==obj){
            return true;
        }else if(obj==null){
            return false;
        }
        return (n1.name==this.name);
	}
    public boolean equals(CorporateName n1){
        int var = this.name.compareTo(n1.name);
	    if(n1==this){
		    return true;
	    }else if(var==0){
	        return true;
	    }
	    return false;
    }
}