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
        if(teamName==null)
            System.out.println("INVALID VALUE");
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
