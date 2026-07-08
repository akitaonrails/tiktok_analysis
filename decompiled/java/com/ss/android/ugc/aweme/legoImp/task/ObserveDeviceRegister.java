package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.C1601760rmg;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2210981Bg8;
import Y.ARunnableS92S0000000_13;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfigExp;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.legoImp.task.FeedCachePreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class ObserveDeviceRegister implements C0CCZ {
    public static final C1601760rmg LL = new InterfaceC2210981Bg8() { // from class: X.0rmg
        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
            CommonFeedLaunchServiceImpl.LJ().LIZ(!z);
            if (z) {
                ObserveDeviceRegister.LIZ();
            }
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
            boolean z2;
            C1602860roS.LIZ.getClass();
            if (C1602860roS.LJ() && C1602860roS.LIZLLL()) {
                boolean zLIZ = C07M8.LIZ();
                C590850NFj c590850NFj = C590850NFj.LL;
                c590850NFj.LJI(2, "after_did", zLIZ);
                if (C1514430pVp.LIZLLL().booleanValue() && !C590980NFw.LJIIIIZZ) {
                    c590850NFj.LJI(30, "paid_ads", zLIZ);
                    return;
                }
                return;
            }
            boolean z3 = false;
            if (!C590950NFt.LIZIZ) {
                C1832307Fp.LIZ.getClass();
                if (C1832307Fp.LIZIZ() || C1832307Fp.LIZ()) {
                    if (NUJAutoRefreshConfigExp.isEnable()) {
                        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                            C1570240qxq.LIZ.setValue("nuj_after_did");
                        } else {
                            C1570240qxq.LIZ.postValue("nuj_after_did");
                        }
                    } else {
                        C1832307Fp.LIZ.getClass();
                        if (C1832307Fp.LIZIZ() && C07M8.LIZ()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(new FeedCachePreloadTask(1, 2, z2));
                        C590950NFt.LIZIZ = true;
                        c799890VZj.LIZIZ();
                    }
                }
            }
            if (!C1514430pVp.LIZLLL().booleanValue() || C590980NFw.LJIIIIZZ) {
                return;
            }
            C1832307Fp.LIZ.getClass();
            if (C1832307Fp.LIZIZ() && C07M8.LIZ()) {
                z3 = true;
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj2 = new C799890VZj();
            c799890VZj2.LIZ(new FeedCachePreloadTask(1, 30, z3));
            C590980NFw.LJIIIIZZ = true;
            c799890VZj2.LIZIZ();
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                ObserveDeviceRegister.LIZ();
                C1602860roS.LIZ.getClass();
                if (C1602860roS.LJ()) {
                    C2280631EOn.LIZ.getClass();
                    if (C2280631EOn.LIZ() && ((Boolean) C2188411Akp.LIZJ.getValue()).booleanValue()) {
                        C0VY3.LIZ(new ARunnableS92S0000000_13(22));
                        return;
                    }
                }
                if (!C1602860roS.LJ() || C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "nuj_force_flush_applog_exp", false) != 1 || C1601770rmh.LIZ) {
                    return;
                }
                C0VY3.LIZ(new ARunnableS92S0000000_13(22));
                C1601770rmh.LIZ = true;
            }
        }
    };

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ObserveDeviceRegister";
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

    public static void LIZ() {
        if (!C1150504el.LIZ().LJIIIZ("app_start_to_get_did")) {
            C1150504el.LIZ().LJI("app_start_to_get_did", false);
        }
        if (C1150504el.LIZ().LJIIIZ("cold_boot_first_request_to_get_did")) {
            return;
        }
        C1150504el.LIZ().LJI("cold_boot_first_request_to_get_did", false);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(LL);
    }
}
