package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCoinConsumptionMagicGiftParams {

    @C09CT("gift_id")
    public long giftId;

    @C09CT("magic_gift_id")
    public long magicGiftId;

    @C09CT("specific_magic_result_id")
    public String specificMagicResultId = "";

    @C09CT("request_extra")
    public String requestExtra = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCoinConsumptionMagicGiftParams(giftId=");
        sbLIZ.append(this.giftId);
        sbLIZ.append(", magicGiftId=");
        sbLIZ.append(this.magicGiftId);
        sbLIZ.append(", specificMagicResultId='");
        sbLIZ.append(this.specificMagicResultId);
        sbLIZ.append("', requestExtra='");
        sbLIZ.append(this.requestExtra);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
