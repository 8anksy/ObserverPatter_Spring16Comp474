
public class RangedEnemy extends Enemy {

	public RangedEnemy (Player player) {
		this.player = player;
		this.player.attach(this);
	}

	@Override
	public void update() {
		System.out.println("This ranged enemy knows that player is " + player.getState());
	}
}
