public class Team {
    private String teamName;
    private boolean validity = true;
    Team(){
        this.teamName = "";
    }
    
    Team(String teamName){
        this.teamName = teamName;
    }
    
    Team(Object j){
        validity=false;
        System.err.println("INVALID VALUE");
    }
    void setTeamName(String teamName){
        if(validity)
            this.teamName = teamName;
        else
            System.err.print("INVALID VALUE");
    }
    void setTeamName(Object j){
        validity =false;
        System.err.print("INVALID VALUE");
    }
    boolean equals(Team a){
        return (a.teamName==this.teamName);
    }
    String getTeamName(){
        return this.teamName;
    }
    public String toString(){
        if(validity)
            return "TEAM: " +this.teamName; 
        else
            return "INVALID VALUE";
    }
    
}
