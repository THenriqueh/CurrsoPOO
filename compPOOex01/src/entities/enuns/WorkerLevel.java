package entities.enuns;

public enum WorkerLevel {
	JUNIOR,
	MID_LEVEL,
	SENIOR;
	
	public String level() {
	WorkerLevel lvl1 = WorkerLevel.JUNIOR;

	WorkerLevel lvl2 = WorkerLevel.valueOf("JUNIOR");
	
	WorkerLevel lvl3 = WorkerLevel.MID_LEVEL;

	WorkerLevel lvl4 = WorkerLevel.valueOf("MID LEVEL");
	
	WorkerLevel lvl5 = WorkerLevel.SENIOR;

	WorkerLevel lvl6 = WorkerLevel.valueOf("SENIOR");
	return level();
	}
	
}
