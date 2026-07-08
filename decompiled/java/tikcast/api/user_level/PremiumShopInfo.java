package tikcast.api.user_level;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PremiumShopInfo {

    @C09CT("eligibility_threshold")
    public long eligibilityThreshold;

    @C09CT("end_time_ms")
    public long endTimeMs;

    @C09CT("has_preview")
    public boolean hasPreview;

    @C09CT("preview_end_time_ms")
    public long previewEndTimeMs;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("warmup_start_time_ms")
    public long warmupStartTimeMs;

    @C09CT("premium_shop_id")
    public String premiumShopId = "";

    @C09CT("gift_infos")
    public List<PremiumShopGiftInfo> giftInfos = new ArrayList();

    @C09CT("preview_gift_infos")
    public List<PreviewGiftInfo> previewGiftInfos = new ArrayList();
}
