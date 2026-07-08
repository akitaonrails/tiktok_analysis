package webcast.api.gift;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.GiftGalleryVideoReport;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class GiftGalleryVideoReportResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("gift_gallery_video_report")
        public GiftGalleryVideoReport giftGalleryVideoReport;

        @C09CT("date_range")
        public String dateRange = "";

        @C09CT("sections")
        public List<GiftGalleryVideoReportSection> sections = new ArrayList();

        public static final class GiftGalleryVideoReportSection {

            @C09CT("display_duration_sec")
            public long displayDurationSec;

            @C09CT("end_timestamp_ms")
            public long endTimestampMs;

            @C09CT("start_timestamp_ms")
            public long startTimestampMs;

            @C09CT("description")
            public String description = "";

            @C09CT("cover_url")
            public String coverUrl = "";
        }
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
