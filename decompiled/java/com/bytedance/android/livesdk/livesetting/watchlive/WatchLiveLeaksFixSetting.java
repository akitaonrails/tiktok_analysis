package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_leak_fix_v1_setting")
public final class WatchLiveLeaksFixSetting {
    public static final WatchLiveLeaksFixSetting INSTANCE = new WatchLiveLeaksFixSetting();
    public static final FixCtlOptions DEFAULT = new FixCtlOptions(false, false, false, false, false);
    public static final C01GW value$delegate = C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(102));

    public static final boolean enableDataChannelLeakFix() {
        return INSTANCE.getValue().enableDataChannelLeakFix;
    }

    public static final boolean enableLikeableViewLeakOpt() {
        return INSTANCE.getValue().enableLikeableViewLeakOpt;
    }

    public static final boolean enableLiveDialogLeakFix() {
        return INSTANCE.getValue().enableLiveDialogLeakFix;
    }

    public static final boolean enablePortraitAudienceFragmentLeakFix() {
        return INSTANCE.getValue().enablePortraitAudienceFragmentLeakFix;
    }

    public static final boolean enableReuseLeakFix() {
        return INSTANCE.getValue().enableReuseLeakFix;
    }

    private final FixCtlOptions getValue() {
        return (FixCtlOptions) value$delegate.getValue();
    }
}
