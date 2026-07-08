package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public class RechargeReminderConfig {
    public static final TypeAdapter ADAPTER = new RechargeReminderConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("show_live_customized_update_switch")
    public boolean showLiveCustomizedUpdateSwitch;
}
