package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PartnershipDrops;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;

/* JADX INFO: loaded from: classes29.dex */
public final class DropsDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("can_join")
        public boolean canJoin;

        @C09CT("cant_join_reason")
        public int cantJoinReason;

        @C09CT("card_show_duration")
        public long cardShowDuration;

        @C09CT("detail")
        public PartnershipDropsV1 detail;

        @C09CT("drops")
        public PartnershipDrops drops;

        @C09CT("improve")
        public boolean improve;

        @C09CT("priority_region")
        public String priorityRegion = "";

        @C09CT("v_region")
        public int vRegion;
    }
}
