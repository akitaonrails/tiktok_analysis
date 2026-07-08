package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("subscribe_renew_enter_setting")
public final class SubscribeRenewEnterDisableSetting {
    public static final boolean DEFAULT = false;
    public static final SubscribeRenewEnterDisableSetting INSTANCE = new SubscribeRenewEnterDisableSetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(83));

    public static /* synthetic */ void isDisable$annotations() {
    }

    private final boolean getSolidifyValue() {
        return ((Boolean) solidifyValue$delegate.getValue()).booleanValue();
    }

    public static final boolean isDisable() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("subscribe_renew_enter_setting") ? INSTANCE.getSolidifyValue() : SettingsManager.INSTANCE.getBooleanValue("subscribe_renew_enter_setting", DEFAULT);
    }
}
