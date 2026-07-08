package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey("live_tab_business_interceptor_allow_list")
public final class LiveTabBusinessInterceptorAllowListSetting {
    public static final LiveTabBusinessInterceptorAllowListSetting INSTANCE = new LiveTabBusinessInterceptorAllowListSetting();
    public static final String[] DEFAULT = {"direct_shoot", "urge_update", "inbox", "story", "push"};
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(89));

    private final String[] getSolidifyValue() {
        return (String[]) solidifyValue$delegate.getValue();
    }

    public final String[] getValue() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_tab_business_interceptor_allow_list") ? getSolidifyValue() : SettingsManager.INSTANCE.getStringArrayValue("live_tab_business_interceptor_allow_list", DEFAULT);
    }
}
