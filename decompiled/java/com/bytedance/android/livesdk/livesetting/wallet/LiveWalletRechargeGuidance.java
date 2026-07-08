package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class LiveWalletRechargeGuidance {
    public static final TypeAdapter ADAPTER;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveWalletRechargeGuidance_OptTypeAdapter();
    }
}
