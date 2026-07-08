package com.ss.android.ugc.aweme.legoImp.task;

import X.C08TN;
import X.C0C64;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1562460qlI;
import X.C1562490qlL;
import X.C1562740qlk;
import X.C725080ScM;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.keva.KevaBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class AssemExperimentParamInitTask implements C0CCZ, InterfaceC799590VYf {
    public static final AssemExperimentParamInitTask LL = new AssemExperimentParamInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AssemExperimentParamInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
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
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        C1562490qlL c1562490qlL = new C1562490qlL();
        C1562460qlI c1562460qlI = c1562490qlL.LIZ;
        if (c1562460qlI == null) {
            synchronized (c1562490qlL) {
                c1562460qlI = c1562490qlL.LIZ;
                if (c1562460qlI == null) {
                    c1562460qlI = new C1562460qlI();
                    c1562490qlL.LIZ = c1562460qlI;
                }
            }
        }
        C725080ScM.LJII = C1562460qlI.LJIIL();
        C725080ScM.LJI = C1562460qlI.LJII();
        C725080ScM.LJIIJ = false;
        C725080ScM.LJIIJJI = c1562460qlI.LIZLLL;
        if (c1562460qlI.LIZJ) {
            c1562490qlL.LIZ().LIZ();
        }
        C08TN.LIZ().LJ("PermissionsProvider", false);
        KevaBuilder.setKevaBuildConfigCallBack(new KevaBuilder.IKevaBuildConfig() { // from class: X.08RP
            @Override // com.bytedance.keva.KevaBuilder.IKevaBuildConfig
            public final void setKevaConfig(KevaBuilder kevaBuilder) {
                kevaBuilder.setContext(C786410Ut5.N3(context));
                kevaBuilder.setIsLoadFromNative(2);
                kevaBuilder.setIsEnableMultiProcessLoadFromNative(1);
            }
        });
        C1562740qlk.LIZ = C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "enable_fix_permission_interceptor_leak", true, false);
        C08TN.LIZ().LJI("PermissionsProvider");
    }
}
