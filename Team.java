public class Team {
    private String teamName;
    Team(){
        this.teamName = "";
    }
    
    Team(String teamName){
        if(teamName!=null)
            this.teamName = teamName;
        else
            System.out.println("INVALID VALUE");
    }
    
    void setTeamName(String teamName){
        if(teamName!=null)
            this.teamName = teamName;
        else
            System.out.println("INVALID VALUE");
    }
    @Override
    public boolean equals(Object obj){
        Team a = (Team) obj;
        
        return (a.teamName==this.teamName||a.teamName==this.teamName||a==this||obj==this);
    }
    public boolean equals(Team a){
        
        if(a==this)
            return true;
        
        return (a.teamName==this.teamName);
        
    }
    
    String getTeamName(){
        if(teamName==null)
            System.out.println("INVALID VALUE");
        return this.teamName;
    }
    public String toString(){
        if(teamName==null)
            System.out.println("INVALID VALUE");
        
        return "TEAM: " +this.teamName; 
    }
    
}
