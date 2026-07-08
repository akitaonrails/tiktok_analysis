package webcast.api.sub;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftSubInfoData {

    @C09CT("anchor_gift_sub_auth")
    public boolean anchorGiftSubAuth;

    @C09CT("gift_sub_purchase_threshold")
    public long giftSubPurchaseThreshold;

    @C09CT("gift_sub_quota")
    public long giftSubQuota;

    @C09CT("gift_sub_quota_by_package_id")
    public Map<String, String> giftSubQuotaByPackageId = new LinkedHashMap();

    @C09CT("subscriber_count")
    public long subscriberCount;

    @C09CT("unusable_gift_sub_quota")
    public long unusableGiftSubQuota;
}
