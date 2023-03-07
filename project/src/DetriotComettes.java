public class DetriotComettes {
    private int players;
    private int wins;
    private int loses;
    private int draws;
    private String coach;
    
    public DetriotComettes(int players, int wins, int loses, int draws, String coach) {
        this.players = players;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        this.coach = coach;
    }

    public int getPlayers() {
        return players;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public String getCoach() {
        return coach;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String playOffPoints(int winPoints,){
        int winPoints = wins * 5; 
        int losesPoints = loses * -5;
        int drawsPoints = draws * -2;
        int totalPoints = winPoints + losesPoints + drawsPoints;
        return "Total Point for Season: " + totalPoints; 
    }
    public String makePlayOff(){}

    @Override
    public String toString() {
        return "DetriotCommettes [players=" + players + ", wins=" + wins + ", loses=" + loses + ", draws=" + draws
                + ", coach=" + coach + "]";
    }

  
}
