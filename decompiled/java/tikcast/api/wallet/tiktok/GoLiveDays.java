package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class GoLiveDays {

    @C09CT("value")
    public long value;

    @C09CT("start_date")
    public String startDate = "";

    @C09CT("end_date")
    public String endDate = "";

    @C09CT("weekly_calendar")
    public List<Day> weeklyCalendar = new ArrayList();

    @C09CT("description")
    public String description = "";

    /* JADX INFO: loaded from: classes28.dex */
    public static final class Day {

        @C09CT("date")
        public long date;

        @C09CT("day")
        public String day = "";

        @C09CT("is_today")
        public boolean isToday;

        @C09CT("is_valid")
        public boolean isValid;
    }
}
