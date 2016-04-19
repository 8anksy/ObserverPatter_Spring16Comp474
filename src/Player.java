import java.util.ArrayList;
import java.util.List;

public class Player {
	private List <Enemy> enemies = new ArrayList<Enemy>();
	private String state;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
		notifyAllEnemies();
	}
	
	public void attach (Enemy enemy) {
		enemies.add(enemy);
	}
	
	public void notifyAllEnemies() {
		for (Enemy e : enemies) {
			e.update();
		}
	}
}
