
public class AggroEnemy extends Enemy {
	public AggroEnemy (Player player) {
		this.player = player;
		this.player.attach(this);
	}

	@Override
	public void update() {
		System.out.println("This aggro enemy knows that player is " + player.getState());
	}
}
