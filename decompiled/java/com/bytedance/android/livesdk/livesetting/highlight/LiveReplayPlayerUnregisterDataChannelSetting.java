package com.bytedance.android.livesdk.livesetting.highlight;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_replay_player_unregister_data_channel")
public final class LiveReplayPlayerUnregisterDataChannelSetting {
    public static final LiveReplayPlayerUnregisterDataChannelSetting INSTANCE = new LiveReplayPlayerUnregisterDataChannelSetting();
    public static final boolean DEFAULT = true;
    public static final C01GW enable$delegate = C292401Bi.LIZ(AFwS206S0000000_18.get$arr$(47));

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
