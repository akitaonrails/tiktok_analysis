package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class PremiumShopGiftBannerInfo {

    @C09CT("expire_time_ms")
    public long expireTimeMs;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_image")
    public ImageModel giftImage;

    @C09CT("target_score")
    public int targetScore;

    @C09CT("unlocked")
    public boolean unlocked;
}
