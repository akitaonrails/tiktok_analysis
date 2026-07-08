package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ignore_same_surface_exp")
public final class LiveIgnoreSameSurfaceExp {
    public static final boolean DEFAULT = false;
    public static final LiveIgnoreSameSurfaceExp INSTANCE = new LiveIgnoreSameSurfaceExp();
    public static final C01GW enable$delegate = C292401Bi.LIZ(AFwS206S0000000_18.get$arr$(57));

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
