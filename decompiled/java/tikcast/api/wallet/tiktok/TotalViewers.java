package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TotalViewers {

    @C09CT("value")
    public long value;

    @C09CT("start_date")
    public String startDate = "";

    @C09CT("end_date")
    public String endDate = "";

    @C09CT("records")
    public List<Record> records = new ArrayList();

    @C09CT("description")
    public String description = "";

    public static final class Record {

        @C09CT("end_time")
        public long endTime;

        @C09CT("title")
        public String title = "";

        @C09CT("value")
        public long value;
    }
}
