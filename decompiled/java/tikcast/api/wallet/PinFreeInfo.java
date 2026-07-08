package tikcast.api.wallet;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PinFreeInfo {

    @C09CT("pin_free_qualified")
    public boolean pinFreeQualified;

    @C09CT("user_pin_free_status")
    public int userPinFreeStatus;

    @C09CT("unqulified_reason")
    public String unqulifiedReason = "";

    @C09CT("pin_free_contract_id")
    public String pinFreeContractId = "";

    @C09CT("pin_free_merchant_scene")
    public String pinFreeMerchantScene = "";
}
