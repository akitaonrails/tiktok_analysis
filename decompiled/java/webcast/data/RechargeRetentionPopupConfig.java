package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class RechargeRetentionPopupConfig {

    @C09CT("dialog_id")
    public String dialogId = "";

    @C09CT("event_info")
    public Map<String, EventInfo> eventInfo = new LinkedHashMap();

    @C09CT("show_retention_popup")
    public boolean showRetentionPopup;

    public static final class EventInfo {

        @C09CT("current_count")
        public int currentCount;

        @C09CT("latest_timestamp")
        public long latestTimestamp;

        @C09CT("max_count")
        public long maxCount;

        @C09CT("window_duration_days")
        public int windowDurationDays;
    }
}
