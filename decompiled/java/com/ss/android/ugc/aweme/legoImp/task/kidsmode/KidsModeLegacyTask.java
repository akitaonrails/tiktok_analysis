package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C00RC;
import X.C08Q1;
import X.C09JN;
import X.C0CCZ;
import X.C0CPH;
import X.C0CPO;
import X.C0VZ0;
import X.C10EU;
import X.C1150504el;
import X.C11PQ;
import X.C1701940uOG;
import X.C2078008Cc;
import X.C2114608Qe;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C2206241BWk;
import X.C2206831BYr;
import X.C2210291Bf1;
import X.C2214201BlK;
import X.C2344809Gs;
import X.C2344909Gt;
import X.C303010BuF;
import X.C460020I2e;
import X.C799890VZj;
import X.C799900VZk;
import X.C810660Vr6;
import X.C818630W9l;
import X.C826820Wc4;
import X.C826830Wc5;
import X.C826840Wc6;
import X.C826860Wc8;
import X.C827040WcQ;
import X.C827070WcT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.EnumC818600W9i;
import X.InterfaceC19483011Ki;
import Y.AfS136S0000000_13;
import Y.AfS182S0100000_13;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.ugc.aweme.app.CommandDispatcher;
import com.ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class KidsModeLegacyTask implements C0CCZ {
    public Application LL;
    public boolean LLILLJJLI;
    public String LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeLegacyTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public KidsModeLegacyTask() {
        C827070WcT.LIZ.getClass();
        this.LLILLL = C827070WcT.LIZJ();
    }

    public class DeviceIdChangeTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "KidsModeLegacyTask$DeviceIdChangeTask";
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
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.BOOT_FINISH;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            c0cph.LIZ(new GeckoHighPriorityCheckInRequest());
            c0cph.LIZ(new GeckoCheckInRequest());
            c0cph.LIZIZ();
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        String strLIZ;
        boolean zLJIIIIZZ;
        this.LL = (Application) context;
        this.LLILLJJLI = C2162308dZ.LJI(context);
        C826840Wc6.LIZ = new C826830Wc5();
        C460020I2e.LIZ = this.LL;
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(((IAccountInitializerTaskApi) ServiceManager.get().getService(IAccountInitializerTaskApi.class)).LIZ());
        c799890VZj.LIZIZ();
        List<String> listLIZJ = null;
        if (this.LLILLJJLI) {
            String str = CommandDispatcher.LIZLLL;
            NetworkUtils.setCommandListener(C2344909Gt.LIZ);
            IKidsCommonService iKidsCommonService = (IKidsCommonService) PluggableExtentionKt.pluggableSpi(IKidsCommonService.class);
            if (iKidsCommonService != null) {
                iKidsCommonService.LIZIZ();
            }
            C11PQ<EnumC818600W9i> c11pq = C2206831BYr.LIZ;
            c11pq.LJJIL(new InterfaceC19483011Ki() { // from class: X.0W9k
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    if (obj == EnumC818600W9i.Local) {
                        return true;
                    }
                    return false;
                }
            }).LJJLJLI(new AfS136S0000000_13(8));
            C827040WcQ.LIZ.getClass();
            C827040WcQ.LIZIZ.LJJLIIJ().LJJLJLI(new C09JN() { // from class: X.0WcB
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("I18LauncherRegisterKt@df74.registerForI18KidsMode$3");
                    C827130WcZ.LIZ.getClass();
                    C827130WcZ.LIZ((C827120WcY) obj);
                    C1C7U.LIZIZ("I18LauncherRegisterKt@df74.registerForI18KidsMode$3");
                }
            });
            C2214201BlK.LIZIZ().LJJLJLI(C0CPO.LL);
            C2214201BlK.LJ.LJJLIIJ().LJJLJLI(C00RC.LL);
            C827070WcT.LIZ.getClass();
            C827070WcT.LIZIZ.LJJLIIJ().LJJIFFI().LJJIL(C2078008Cc.LL).LJJIL(C826820Wc4.LL).LJJLJLI(new AfS182S0100000_13(this, 68));
            c11pq.LJJIL(C818630W9l.LL).LJL(C1701940uOG.LIZIZ()).LJJLJLI(new C810660Vr6(this.LL));
            if (!C2206241BWk.LIZJ() && C826860Wc8.LIZIZ == null) {
                try {
                    C826860Wc8.LIZIZ = new C826860Wc8();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Logger.debug();
            }
            strLIZ = null;
        } else {
            strLIZ = C2162308dZ.LIZ(this.LL);
        }
        try {
            AppLog.setUseGoogleAdId(true);
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initApplog startLaunch:");
            sbLIZ.append(System.currentTimeMillis() - C1150504el.LIZ().LJJII);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2344809Gs.LIZ(e2);
        }
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new CommonParamsInitTask());
        c0cph.LIZIZ();
        if (ComplianceServiceProvider.LJII().LIZLLL()) {
            zLJIIIIZZ = C08Q1.LIZJ();
        } else {
            zLJIIIIZZ = C10EU.LJIIIIZZ();
        }
        AppLog.setChildModeBeforeInit(zLJIIIIZZ);
        if (zLJIIIIZZ) {
            listLIZJ = ComplianceServiceProvider.LJII().LIZJ();
        }
        AppLog.setEventFilterByClient(listLIZJ, false);
        C2210291Bf1.LIZ(this.LL);
        if (this.LL.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
        C1150504el.LIZ().LIZLLL("method_init_push_duration", false);
        if (this.LLILLJJLI || C2114608Qe.LIZ(this.LL, strLIZ)) {
            C303010BuF.LIZ().initMessageDepend();
        }
        C1150504el.LIZ().LJI("method_init_push_duration", false);
    }
}
