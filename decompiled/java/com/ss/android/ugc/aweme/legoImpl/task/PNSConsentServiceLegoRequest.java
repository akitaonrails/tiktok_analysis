package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CO3;
import X.C786410Ut5;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PNSConsentServiceLegoRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PNSConsentServiceLegoRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return ColdBootTasksDegradeExperiment.LIZ().pnsConsentServiceLegoRequest ? C0CO3.BOOT_FINISH : C0CO3.NORMAL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (!z) {
            return;
        }
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() != 0) {
            ((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJIIIIZZ("AppLaunch");
        } else {
            C786410Ut5.LJLIIL(2000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0N4g
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PNSConsentServiceLegoRequest@5887.request$1");
                    try {
                        ((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJIIIIZZ("AppLaunchWithDelay");
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PNSConsentServiceLegoRequest@5887.request$1");
                }
            });
        }
    }
}
