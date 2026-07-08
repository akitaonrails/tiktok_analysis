package webcast.api.game;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.BannerInRoom;

/* JADX INFO: loaded from: classes.dex */
public final class GameBanner {

    @C09CT("activity_end_time")
    public long activityEndTime;

    @C09CT("activity_id")
    public String activityId = "";

    @C09CT("activity_start_time")
    public long activityStartTime;

    @C09CT("banner_image")
    public ImageModel bannerImage;

    @C09CT("livechat_banner")
    public BannerInRoom livechatBanner;
}
