package com.bytedance.android.livesdk.chatroom.ui.widgetload;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "internal_window_adapter_user_manual_mute")
public final class InternalWindowAdapterUserManualMuteSetting {
    public static final boolean DEFAULT = false;
    public static final InternalWindowAdapterUserManualMuteSetting INSTANCE = new InternalWindowAdapterUserManualMuteSetting();
    public static final C01GW settings$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(38));

    public static /* synthetic */ void getSettings$annotations() {
    }

    public static final boolean getSettings() {
        return ((Boolean) settings$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettings();
    }
}
