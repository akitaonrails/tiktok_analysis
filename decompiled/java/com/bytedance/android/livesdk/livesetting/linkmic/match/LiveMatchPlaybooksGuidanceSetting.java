package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_playbooks_guidance_enabled")
public final class LiveMatchPlaybooksGuidanceSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchPlaybooksGuidanceSetting INSTANCE = new LiveMatchPlaybooksGuidanceSetting();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(166));

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean isEnabled() {
        return getValue();
    }
}
