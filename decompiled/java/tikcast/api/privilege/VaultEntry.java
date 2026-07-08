package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes29.dex */
public final class VaultEntry {

    @C09CT("end_time_ms")
    public long endTimeMs;

    @C09CT("is_target_user")
    public boolean isTargetUser;

    @C09CT("main_gift_icon")
    public ImageModel mainGiftIcon;

    @C09CT("premium_shop_id")
    public String premiumShopId = "";

    @C09CT("shop_activated")
    public boolean shopActivated;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT("warmup_start_time_ms")
    public long warmupStartTimeMs;
}
