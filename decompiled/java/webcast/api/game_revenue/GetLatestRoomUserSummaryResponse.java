package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GetLatestRoomUserSummaryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("comment_count")
        public long commentCount;

        @C09CT("diamond_count")
        public long diamondCount;

        @C09CT("fans_club_level")
        public long fansClubLevel;

        @C09CT("follow_days")
        public long followDays;

        @C09CT("suggest_message")
        public Text suggestMessage;

        @C09CT("user_level")
        public long userLevel;

        @C09CT("watch_duration_sec")
        public long watchDurationSec;
    }
}
