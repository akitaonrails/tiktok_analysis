package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class FansClubTeamMissionStage {

    @C09CT("gift")
    public Gift gift;

    @C09CT("in_celebration_time")
    public boolean inCelebrationTime;

    @C09CT("target_progress")
    public long targetProgress;

    public static final class Gift {

        @C09CT("activity_type")
        public long activityType;

        @C09CT("expire_time")
        public long expireTime;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_image")
        public ImageModel giftImage;

        @C09CT("gift_name")
        public String giftName = "";
    }
}
