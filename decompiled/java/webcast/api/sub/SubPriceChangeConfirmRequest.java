package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPriceChangeConfirmRequest {

    @C09CT("agree_to_price_change")
    public boolean agreeToPriceChange;

    @C09CT("is_first_entrance")
    public boolean isFirstEntrance;

    @C09CT("source")
    public int source;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("order_id")
    public String orderId = "";

    @C09CT("contract_id")
    public String contractId = "";

    @C09CT("sec_user_id")
    public String secUserId = "";
}
