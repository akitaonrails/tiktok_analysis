package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_repost_new_panel")
public final class LiveRepostNewPanelSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveRepostNewPanelSetting INSTANCE = new LiveRepostNewPanelSetting();
    public static final C01GW enabled$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(56));

    private final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getEnabled();
    }
}
