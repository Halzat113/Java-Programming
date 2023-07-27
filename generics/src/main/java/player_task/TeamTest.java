package player_task;

public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

       // player_task.Team team1 = new player_task.Team("England");

        Team<SoccerPlayer> team1 = new Team<>("England");
        //player_task.Team<String> brokenTeam = new player_task.Team<>("this wont work !"); only accepts Players

//        team1.addPlayer(joe);
//        team1.addPlayer(pat);
        team1.addPlayer(beckham);

        System.out.println(team1);
        System.out.println("==========");
        System.out.println(team1.numPlayers());
    }
}
