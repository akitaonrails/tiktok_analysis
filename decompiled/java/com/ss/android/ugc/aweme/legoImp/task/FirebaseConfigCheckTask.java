package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C11S5;
import X.C1356610lPH;
import X.C1701940uOG;
import X.C1913870zu5;
import X.C19258710Wb;
import X.C19336510kt;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2210981Bg8;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.api.FirebaseReportApi;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes29.dex */
public final class FirebaseConfigCheckTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(new C19258710Wb());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FirebaseConfigCheckTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final void LIZ() {
        FirebaseReportApi.LIZ.getUserForceLoginConfig().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336510kt(this, 1));
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().firebaseConfigCheckTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    public static void LJ(boolean z) {
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZJ();
        C1913870zu5.LIZLLL(z);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z = ((Keva) this.LL.getValue()).getBoolean("user_in_forced_login", true);
        if (z) {
            Long lValueOf = Long.valueOf(((Keva) this.LL.getValue()).getLong("last_request_time", 0L));
            Locale locale = C1356610lPH.LIZ;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(lValueOf.longValue()));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new Date());
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            if (((int) ((calendar2.getTime().getTime() - calendar.getTime().getTime()) / 86400000)) >= 1) {
                if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                    DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.10Wc
                        @Override // X.InterfaceC2210981Bg8
                        public final void LIZ(boolean z2) {
                        }

                        @Override // X.InterfaceC2210981Bg8
                        public final void LIZJ(boolean z2) {
                        }

                        @Override // X.InterfaceC2210981Bg8
                        public final void LIZIZ(String str, String str2) {
                            this.LL.LIZ();
                        }
                    });
                    return;
                } else {
                    LIZ();
                    return;
                }
            }
        }
        LJ(z);
    }
}
