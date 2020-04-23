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

    boolean equals(Team a){
        
        if(a.teamName==null||a==null){
            //System.out.println("INVALID VALUE");
            return false;
        }
        
        if(a==this)
            return true;
        
        return (a.teamName.equals(this.teamName));
        
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
