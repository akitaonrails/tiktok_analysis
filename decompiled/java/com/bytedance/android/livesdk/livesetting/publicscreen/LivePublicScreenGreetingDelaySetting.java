package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.AnonymousClass0206;
import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_public_screen_greeting_delay")
public final class LivePublicScreenGreetingDelaySetting {
    public static final long DEFAULT = 3500;
    public static final LivePublicScreenGreetingDelaySetting INSTANCE = new LivePublicScreenGreetingDelaySetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(78));

    private final long getSolidifyValue() {
        return ((Number) solidifyValue$delegate.getValue()).longValue();
    }

    public final long getValue() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_public_screen_greeting_delay") ? getSolidifyValue() : SettingsManager.INSTANCE.getLongValue("live_public_screen_greeting_delay", DEFAULT);
    }
}
