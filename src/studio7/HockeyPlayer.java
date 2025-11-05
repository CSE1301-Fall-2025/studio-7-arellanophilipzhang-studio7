public class HockeyPlayer {
    private String name;
    private int jerseyNumber;
    private String handedness;
    private int totalGoals = 0;
    private int newGoals;
    private int totalAssists = 0;
    private int newAssists;
    private int totalGames = 0;
    private int totalPoints;
    public HockeyPlayer(String name, int jerseyNumber, String handedness, int newGoals, int newAssists, 
    int totalGames, int totalPoints){
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.handedness = handedness;
        this.totalGoals = totalGoals;
        this.totalAssists = totalAssists;
        this.totalGames = totalGames;
        this.totalPoints = totalPoints;
    }
    public HockeyPlayer playGame(HockeyPlayer b){
        totalGames++;
        this.totalGoals+=b.newGoals;
        this.totalAssists+=b.newAssists;
        return b;
    }

}
