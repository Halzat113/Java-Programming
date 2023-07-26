public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

       // Team team1 = new Team("England");

        Team<SoccerPlayer> team1 = new Team<>("England");
        //Team<String> brokenTeam = new Team<>("this wont work !"); only accepts Players

//        team1.addPlayer(joe);
//        team1.addPlayer(pat);
        team1.addPlayer(beckham);

        System.out.println(team1);
        System.out.println("==========");
        System.out.println(team1.numPlayers());
    }
}
