package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C09AY;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.settings.ClearLoginCredentialsSettings;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ClearLoginCredentialsService$clearLoginConfig$2 extends C09AY implements Function0<ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig> {
    public ClearLoginCredentialsService$clearLoginConfig$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig invoke() {
        int i;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig clearLoginCredentialsDefaultConfig = ClearLoginCredentialsSettings.LIZIZ;
        ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig clearLoginCredentialsDefaultConfig2 = (ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig) settingsManagerLIZLLL.LJIIIIZZ("clear_login_credentials_config_android", ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig.class, clearLoginCredentialsDefaultConfig);
        if (clearLoginCredentialsDefaultConfig2 == null) {
            clearLoginCredentialsDefaultConfig2 = clearLoginCredentialsDefaultConfig;
        }
        C01GW c01gw = ClearLoginCredentialsSettings.LIZ;
        int i2 = ((Keva) c01gw.getValue()).getInt("clear_cred_config_version", -1);
        if (Intrinsics.LJFF(clearLoginCredentialsDefaultConfig2, clearLoginCredentialsDefaultConfig) || (i = clearLoginCredentialsDefaultConfig2.configVersion) <= i2) {
            return clearLoginCredentialsDefaultConfig;
        }
        ((Keva) c01gw.getValue()).storeInt("clear_cred_config_version", i);
        return clearLoginCredentialsDefaultConfig2;
    }
}
