package tikcast.api.boost;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FlareStats {

    @C09CT("cnt")
    public long cnt;

    @C09CT("end_time")
    public long endTime;

    @C09CT("points")
    public List<Point> points = new ArrayList();

    @C09CT("start_time")
    public long startTime;

    public static final class Point {

        @C09CT("cnt")
        public long cnt;

        @C09CT("timestamp")
        public long timestamp;
    }
}
