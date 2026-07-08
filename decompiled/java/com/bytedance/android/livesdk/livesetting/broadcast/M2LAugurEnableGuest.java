package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2l_augur_enable_guest")
public final class M2LAugurEnableGuest {
    public static final boolean DEFAULT = false;
    public static final M2LAugurEnableGuest INSTANCE = new M2LAugurEnableGuest();
    public static final C01GW isEnable$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(38));

    private final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }

    public final boolean enabled() {
        return isEnable();
    }
}
