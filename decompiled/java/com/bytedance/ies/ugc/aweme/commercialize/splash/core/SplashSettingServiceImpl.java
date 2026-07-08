package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import X.C04TD;
import X.C0C64;
import X.C1AF0;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes3.dex */
public final class SplashSettingServiceImpl implements ISplashSettingService {
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LIZ() {
        boolean zLIZ = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_force_skip_topview", true);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return zLIZ;
        }
    }

    public static ISplashSettingService LIZJ() {
        Object objLIZ = C04TD.LIZ(ISplashSettingService.class, false);
        if (objLIZ != null) {
            return (ISplashSettingService) objLIZ;
        }
        if (C04TD.LJJIIZI == null) {
            synchronized (ISplashSettingService.class) {
                if (C04TD.LJJIIZI == null) {
                    C04TD.LJJIIZI = new SplashSettingServiceImpl();
                }
            }
        }
        return C04TD.LJJIIZI;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "cold_start_upload_topview_cid_enabled", true, false);
    }
}
