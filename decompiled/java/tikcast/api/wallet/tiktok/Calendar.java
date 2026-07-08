package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class Calendar {

    @C09CT("month")
    public String month = "";

    @C09CT("days")
    public List<Day> days = new ArrayList();

    public static final class Day {

        @C09CT("day")
        public long day;

        @C09CT("highlight")
        public boolean highlight;
    }
}
