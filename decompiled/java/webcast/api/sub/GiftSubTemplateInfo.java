package webcast.api.sub;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class GiftSubTemplateInfo {

    @C09CT("count")
    public long count;

    @C09CT("is_customize")
    public boolean isCustomize;

    @C09CT("is_default_package")
    public boolean isDefaultPackage;

    @C09CT("max_count")
    public long maxCount;

    @C09CT("price_amount_micros")
    public long priceAmountMicros;

    @C09CT("should_display")
    public boolean shouldDisplay;

    @C09CT("tpl_type")
    public int tplType;

    @C09CT("unit_price_micros")
    public long unitPriceMicros;

    @C09CT("usd_price_amount_micros")
    public long usdPriceAmountMicros;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("iap_id")
    public String iapId = "";

    @C09CT("currency")
    public String currency = "";

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("package_name")
    public String packageName = "";
}
