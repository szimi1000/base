import java.time.LocalDateTime;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tachograph {

	private Table<LocalDateTime, Integer, Integer> tachograph = HashBasedTable.create();

	public void add (int pos, int speed) {
		tachograph.put(LocalDateTime.now(), pos, speed);
	}
}
