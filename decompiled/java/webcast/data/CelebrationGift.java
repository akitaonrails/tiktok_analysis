package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class CelebrationGift {

    @C09CT("expire_time_seconds")
    public long expireTimeSeconds;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_image")
    public ImageModel giftImage;

    @C09CT("gift_name")
    public String giftName = "";

    @C09CT("gift_price")
    public long giftPrice;

    @C09CT("highest_unlock_level")
    public long highestUnlockLevel;

    @C09CT("is_unlocked")
    public boolean isUnlocked;

    @C09CT("lowest_unlock_level")
    public long lowestUnlockLevel;

    @C09CT("valid_duration_seconds")
    public long validDurationSeconds;
}
