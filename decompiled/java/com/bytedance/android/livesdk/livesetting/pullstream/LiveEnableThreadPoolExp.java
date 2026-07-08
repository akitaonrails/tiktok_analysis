package com.bytedance.android.livesdk.livesetting.pullstream;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enable_thread_pool_exp")
public final class LiveEnableThreadPoolExp {
    public static final boolean DEFAULT = false;
    public static final LiveEnableThreadPoolExp INSTANCE = new LiveEnableThreadPoolExp();
    public static final C01GW enable$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(54));

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
