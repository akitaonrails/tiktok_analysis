package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_can_create_repost_note")
public final class LiveCanCreateRepostNoteSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveCanCreateRepostNoteSetting INSTANCE = new LiveCanCreateRepostNoteSetting();
    public static final C01GW enabled$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(55));

    private final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getEnabled();
    }
}
