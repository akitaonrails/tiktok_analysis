package com.ss.android.ugc.aweme.ecommerce.core.services;

import X.C04TD;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcImageMonitorSwitchKeySettings;
import com.ss.android.ugc.aweme.ecommerce.image.IECImageService;

/* JADX INFO: loaded from: classes3.dex */
public final class ECImageService implements IECImageService {
    public static IECImageService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IECImageService.class, false);
        if (objLIZ != null) {
            return (IECImageService) objLIZ;
        }
        if (C04TD.LLZIL == null) {
            synchronized (IECImageService.class) {
                if (C04TD.LLZIL == null) {
                    C04TD.LLZIL = new ECImageService();
                }
            }
        }
        return C04TD.LLZIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.image.IECImageService
    public final boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel ecImageMonitorSwitchKeyModel = EcImageMonitorSwitchKeySettings.LIZ;
        EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel ecImageMonitorSwitchKeyModel2 = (EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel) settingsManagerLIZLLL.LJIIIIZZ("ec_image_monitor_switch_key", EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel.class, ecImageMonitorSwitchKeyModel);
        if (ecImageMonitorSwitchKeyModel2 != null) {
            ecImageMonitorSwitchKeyModel = ecImageMonitorSwitchKeyModel2;
        }
        Boolean bool = ecImageMonitorSwitchKeyModel.isOpen;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
