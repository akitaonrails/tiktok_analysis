package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_setting_solidify_enable")
public final class LiveSettingSolidifyExp {
    public static final boolean DEFAULT = false;
    public static final LiveSettingSolidifyExp INSTANCE = new LiveSettingSolidifyExp();
    public static final C01GW isSolidifyEnable$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS206S0000000_18.get$arr$(60));

    public final boolean isSolidifyEnable() {
        return ((Boolean) isSolidifyEnable$delegate.getValue()).booleanValue();
    }

    public final boolean value() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_setting_solidify_enable", DEFAULT);
    }
}
