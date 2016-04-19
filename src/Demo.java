
public class Demo {

	public static void main(String[] args) {
		Player player = new Player();
		
		new RangedEnemy(player);
		new AggroEnemy(player);
		new AggroEnemy(player);
		
		System.out.println("Player is now defending");
		player.setState("defending");
		
		System.out.println("Player is now attacking");
		player.setState("attacking");

	}

}
