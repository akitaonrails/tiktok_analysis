package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkmicPlaybookNonMultiGuestConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("code_tech_switch_for_android")
    public int codeTechSwitchForAndroid;

    static {
        NormalGson.singleton();
        ADAPTER = new LinkmicPlaybookNonMultiGuestConfig_OptTypeAdapter();
    }

    public LinkmicPlaybookNonMultiGuestConfig() {
        this(1);
    }

    public LinkmicPlaybookNonMultiGuestConfig(int i) {
        this.codeTechSwitchForAndroid = i;
    }
}
