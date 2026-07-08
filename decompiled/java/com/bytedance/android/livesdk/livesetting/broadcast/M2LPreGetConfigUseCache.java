package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("pre_get_config_use_cache")
public final class M2LPreGetConfigUseCache {
    public static final boolean DEFAULT = false;
    public static final M2LPreGetConfigUseCache INSTANCE = new M2LPreGetConfigUseCache();
    public static final C01GW isEnable$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(42));

    private final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return isEnable();
    }
}
