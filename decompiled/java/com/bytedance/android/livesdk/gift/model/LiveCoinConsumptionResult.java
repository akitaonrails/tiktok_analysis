package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import X.EnumC1150610g31;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCoinConsumptionResult {

    @C09CT("enigma_result")
    public LiveCoinConsumptionEnigmaResult enigmaResult;

    @C09CT("magic_gift_result")
    public LiveCoinConsumptionMagicGiftResponse magicGiftResult;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("is_from_jsb")
    public boolean isFromJSB = true;

    @C09CT("scene_type")
    public EnumC1150610g31 sceneType = EnumC1150610g31.TYPE_UNKNOWN;
}
