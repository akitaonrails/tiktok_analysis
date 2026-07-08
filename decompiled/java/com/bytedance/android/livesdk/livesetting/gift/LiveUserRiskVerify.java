package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveUserRiskVerify {
    public static final TypeAdapter ADAPTER;

    @C09CT("email_verify_url")
    public String emailVerifyUrl;

    @C09CT("phone_verify_url")
    public String phoneVerifyUrl;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveUserRiskVerify_OptTypeAdapter();
    }

    public LiveUserRiskVerify() {
        this("", "");
    }

    public LiveUserRiskVerify(String str, String str2) {
        this.emailVerifyUrl = str;
        this.phoneVerifyUrl = str2;
    }
}
