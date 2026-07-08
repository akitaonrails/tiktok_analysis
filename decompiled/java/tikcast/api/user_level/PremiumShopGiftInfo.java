package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class PremiumShopGiftInfo {

    @C09CT("coins")
    public long coins;

    @C09CT("expire_time_ms")
    public long expireTimeMs;

    @C09CT("gift_id")
    public String giftId = "";

    @C09CT("gift_name")
    public Text giftName;

    @C09CT("gift_resource")
    public PremiumShopGiftResource giftResource;

    @C09CT("is_unlocked")
    public boolean isUnlocked;

    @C09CT("target_score")
    public long targetScore;

    @C09CT("term_of_validity_ms")
    public long termOfValidityMs;

    @C09CT("unlocked_num")
    public long unlockedNum;
}
