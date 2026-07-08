package com.ss.android.ugc.aweme.legoImp.task;

import X.C0BFO;
import X.C0C64;
import X.C0CCZ;
import X.C0CN5;
import X.C0VZ0;
import X.C10EU;
import X.C1489405sK;
import X.C1BCF;
import X.C202079145d;
import X.C202089145n;
import X.C202092145q;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSnapboostService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@C1BCF(distinctId = 101, taskType = "preload")
public class SnapBoostPreloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SnapBoostPreloadTask";
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

    public static void LJ() {
        IEcomSnapboostService iEcomSnapboostService = (IEcomSnapboostService) PluggableExtentionKt.pluggableSpi(IEcomSnapboostService.class);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_pdp_preload_class", true) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1489405sK c1489405sKLIZIZ = C202079145d.LIZ("snapboost_list_ecommerce_pdp.txt").LIZIZ();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (iEcomSnapboostService != null) {
                iEcomSnapboostService.LIZ(jCurrentTimeMillis2, c1489405sKLIZIZ, "boot_finish", "product_detail");
            }
        }
        if (C202092145q.LIZ().preloadCommonClass) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            C1489405sK c1489405sKLIZIZ2 = C202079145d.LIZ("snapboost_list_ecommerce.txt").LIZIZ();
            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
            if (iEcomSnapboostService != null) {
                iEcomSnapboostService.LIZ(jCurrentTimeMillis4, c1489405sKLIZIZ2, "boot_finish", "common");
            }
        }
        if (C202092145q.LIZ().preloadOspEnable && iEcomSnapboostService != null && iEcomSnapboostService.LIZIZ("snapboost_list_ecommerce_osp.txt")) {
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            C1489405sK c1489405sKLIZIZ3 = C202079145d.LIZ("snapboost_list_ecommerce_osp.txt").LIZIZ();
            iEcomSnapboostService.LIZJ("snapboost_list_ecommerce_osp.txt");
            iEcomSnapboostService.LIZ(System.currentTimeMillis() - jCurrentTimeMillis5, c1489405sKLIZIZ3, "boot_finish", "order_submit");
        }
        if (C202092145q.LIZ().preloadPbClass && iEcomSnapboostService != null && iEcomSnapboostService.LIZIZ("snapboost_list_ecommerce_pb.txt")) {
            long jCurrentTimeMillis6 = System.currentTimeMillis();
            C1489405sK c1489405sKLIZIZ4 = C202079145d.LIZ("snapboost_list_ecommerce_pb.txt").LIZIZ();
            iEcomSnapboostService.LIZJ("snapboost_list_ecommerce_pb.txt");
            iEcomSnapboostService.LIZ(System.currentTimeMillis() - jCurrentTimeMillis6, c1489405sKLIZIZ4, "boot_finish", "protobuf");
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C0BFO.LIZ != -1 ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    public static void LIZ(Context context) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            C202079145d.LIZJ(context);
            C202089145n.LIZ = true;
            LJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() && !C10EU.LJIILIIL()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jUptimeMillis2, "commit_took");
            c2344009Gk.LIZJ(1, "commit_id");
            c2344009Gk.LIZJ(0, "commit_result");
            C20684815ws.LJIILLIIL("tool_performance_profile_editor", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long j = C0BFO.LIZ;
        if (j != -1) {
            C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS130S0100000_30(context, 13));
        } else {
            LIZ(context);
        }
    }
}
