package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class VipAgreementUpdateConfig {
    public static final TypeAdapter ADAPTER = new VipAgreementUpdateConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("date")
    public long date;

    @C09CT("enable")
    public boolean isEnable;

    @C09CT("vip_link")
    public String virtualItemPolicyUrl = "";

    @C09CT("rp_link")
    public String rewardPolicyUrl = "";
}
