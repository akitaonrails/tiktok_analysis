package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1514430pVp;
import X.C19260510Wt;
import X.C19261010Wy;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2210981Bg8;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FetchUltimateComplianceSettingsTask implements C0CCZ, InterfaceC799590VYf {
    public static Context LL;
    public static final C19261010Wy LLILLJJLI = new InterfaceC2210981Bg8() { // from class: X.10Wy
        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
            if (!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                C19260510Wt.LIZ();
            }
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
            C19260510Wt.LIZ();
        }
    };

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchUltimateComplianceSettingsTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final int level() {
        C1514430pVp.LIZLLL().booleanValue();
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LL = context;
        if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(LLILLJJLI);
        } else {
            C19260510Wt.LIZ();
        }
    }
}
