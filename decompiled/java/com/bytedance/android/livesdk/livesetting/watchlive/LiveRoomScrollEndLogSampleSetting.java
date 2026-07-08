package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_room_scroll_end_log_sample")
public final class LiveRoomScrollEndLogSampleSetting {
    public static final float DEFAULT = 0.0f;
    public static final LiveRoomScrollEndLogSampleSetting INSTANCE = new LiveRoomScrollEndLogSampleSetting();
    public static final C01GW shouldLogForScrollEnd$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(75));

    public final boolean getShouldLogForScrollEnd() {
        return ((Boolean) shouldLogForScrollEnd$delegate.getValue()).booleanValue();
    }

    public final float value() {
        return SettingsManager.INSTANCE.getFloatValue("live_room_scroll_end_log_sample", DEFAULT);
    }

    public final float getDEFAULT() {
        return DEFAULT;
    }
}
