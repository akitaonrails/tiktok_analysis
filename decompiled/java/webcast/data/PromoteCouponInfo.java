package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PromoteCouponInfo {

    @C09CT("currency_code")
    public long currencyCode;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("price")
    public String price = "";

    @C09CT("formatted_price")
    public String formattedPrice = "";
}
