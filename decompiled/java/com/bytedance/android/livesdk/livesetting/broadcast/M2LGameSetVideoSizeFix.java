package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2l_game_set_video_size_fix")
public final class M2LGameSetVideoSizeFix {
    public static final M2LGameSetVideoSizeFix INSTANCE = new M2LGameSetVideoSizeFix();
    public static final boolean DEFAULT = true;
    public static final C01GW isEnable$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(41));

    private final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }

    public final boolean enabled() {
        return isEnable();
    }
}
