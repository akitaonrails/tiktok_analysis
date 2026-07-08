package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import X.C1150590g2z;
import X.C2188811AlT;
import X.EnumC1150610g31;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCoinConsumptionInput {
    public C1150590g2z LIZ;

    @C09CT("coin_amount")
    public int coinAmount;

    @C09CT("enigma_params")
    public LiveCoinConsumptionEnigmaParams enigmaParams;

    @C09CT("magic_gift_params")
    public LiveCoinConsumptionMagicGiftParams magicGiftParams;

    @C09CT("retry_times")
    public int retryTimes;

    @C09CT("is_from_jsb")
    public boolean isFromJSB = true;

    @C09CT("scene_type")
    public EnumC1150610g31 sceneType = EnumC1150610g31.TYPE_UNKNOWN;

    @C09CT("scene_source")
    public String sceneSource = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCoinConsumptionInput(isFromJSB=");
        sbLIZ.append(this.isFromJSB);
        sbLIZ.append(", sceneType=");
        sbLIZ.append(this.sceneType);
        sbLIZ.append(", sceneSource=");
        sbLIZ.append(this.sceneSource);
        sbLIZ.append(", coinAmount=");
        sbLIZ.append(this.coinAmount);
        sbLIZ.append(", retryTimes=");
        sbLIZ.append(this.retryTimes);
        sbLIZ.append(", magicGiftParams=");
        sbLIZ.append(this.magicGiftParams);
        sbLIZ.append("), callback=");
        C1150590g2z c1150590g2z = this.LIZ;
        sbLIZ.append(c1150590g2z != null ? Integer.valueOf(c1150590g2z.hashCode()) : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
