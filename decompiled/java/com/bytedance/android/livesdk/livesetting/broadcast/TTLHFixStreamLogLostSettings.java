package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_fix_stream_log_lost")
public final class TTLHFixStreamLogLostSettings {
    public static final TTLHFixStreamLogLostSettings INSTANCE = new TTLHFixStreamLogLostSettings();
    public static final boolean DEFAULT = true;
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(43));

    private final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }

    public final boolean enabled() {
        return isEnabled();
    }
}
