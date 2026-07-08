package com.ss.android.ugc.aweme.legoImpl.task;

import X.C07RQ;
import X.C098200Yq;
import X.C0B8Z;
import X.C0CAW;
import X.C0CCZ;
import X.C0CD2;
import X.C0COR;
import X.C0OHO;
import X.C0RKZ;
import X.C0SPL;
import X.C0VU1;
import X.C0VZ0;
import X.C1157604fu;
import X.C1300550jwr;
import X.C1351290lGh;
import X.C1570380qy4;
import X.C1589740rTI;
import X.C1594710rbJ;
import X.C1602530rnv;
import X.C1602670ro9;
import X.C1867050ygZ;
import X.C1867110ygf;
import X.C1867820yho;
import X.C189200o6;
import X.C1E77;
import X.C1E8Y;
import X.C2269771Dsl;
import X.C2269801Dso;
import X.C2269831Dsr;
import X.C2277001EAo;
import X.C2456309jt;
import X.C274300Ap2;
import X.C285400BGo;
import X.C309220CAe;
import X.C583980MvM;
import X.C586060Myi;
import X.C586250Mz1;
import X.C705980Rme;
import X.C713300RyS;
import X.C740010T1b;
import X.C740020T1c;
import X.C822030WMn;
import X.EnumC309240CAg;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import com.ss.android.ugc.aweme.experiment.OptValue;
import com.ss.android.ugc.aweme.feed.experiment.FeedTouchProtectionExperiment;
import com.ss.android.ugc.aweme.feed.experiment.LiveStatusBatchUpdateExp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import com.ss.android.ugc.aweme.settings.DisableSparkLynxPrefetchV2;
import com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig;
import com.ss.android.ugc.aweme.settings.SparkLynxPrefetchFallbackToV1;
import defpackage.c2;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20234614Fk
public final class ABPreloadTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ABPreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !((Boolean) C0CD2.LJJJLZIJ.getValue()).booleanValue() && C274300Ap2.LIZ();
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Integer num;
        if (ColdBootPushStartupExperiment.LIZ().preloadABTask && (C2456309jt.LIZJ() || ColdBootPushStartupExperiment.LIZIZ())) {
            return;
        }
        C0CAW.LJII.getClass();
        if (C274300Ap2.LIZ()) {
            C309220CAe.LIZJ(EnumC309240CAg.AB, "frist_brush");
        }
        C309220CAe.LJ(EnumC309240CAg.AB, "frist_brush");
        if (((Boolean) C1E77.LJ.getValue()).booleanValue()) {
            new Object() { // from class: X.0s1c
            }.getClass();
            try {
                C1867110ygf.LIZ();
                ((Boolean) C1867110ygf.LIZJ.getValue()).booleanValue();
                DisableSparkLynxPrefetchV2.LIZ();
                SparkLynxPrefetchFallbackToV1.LIZ();
                DisableSparkLynxPrefetchV2.LIZIZ();
                ((Boolean) SparkIABOptimizeConfig.LIZLLL.getValue()).booleanValue();
                c2.LIZ();
                IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
                if (iEcUgColdBootDowngradeService != null) {
                    iEcUgColdBootDowngradeService.LIZIZ();
                }
                LandInboxExperiment.LIZ();
                ((Number) C285400BGo.LIZJ.getValue()).longValue();
                OptValue optValueLIZ = C1589740rTI.LIZ();
                if (optValueLIZ != null && (num = optValueLIZ.enableHomeTabDynamicText) != null) {
                    num.intValue();
                }
                if (!C583980MvM.LIZ()) {
                    C583980MvM.LIZIZ();
                }
                C586250Mz1.LIZIZ();
                C0OHO.LIZ();
                InnerPushColdStartExp.LIZ();
                C1300550jwr.LIZ();
                LiveStatusBatchUpdateExp.LIZIZ("");
                C586060Myi.LIZ();
                C1867050ygZ.LIZ();
                C822030WMn.LIZ();
                C1570380qy4.LIZ();
                FeedTouchProtectionExperiment.LIZ();
                C1594710rbJ.LIZ();
                C0COR.LIZ("any");
                C1602670ro9.LIZ();
                C1602530rnv.LIZ();
                C822030WMn.LIZ();
                C0SPL.LIZ();
                ((Boolean) C1867820yho.LIZLLL.getValue()).booleanValue();
                C07RQ.LIZ("any");
                C1E8Y.LIZ();
                C0RKZ.LIZ("");
                C705980Rme.LIZ();
                C1351290lGh.LIZIZ();
                C713300RyS.LIZ.getClass();
                C740020T1c.LIZJ();
                C740010T1b.LIZ();
                C189200o6.m2constructorimpl(Boolean.valueOf(((Boolean) C2277001EAo.LIZJ.getValue()).booleanValue()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (C1157604fu.LIZ()) {
            ((Number) C0B8Z.LIZ.getValue()).intValue();
            C2269771Dsl.LIZIZ.getValue();
            C2269831Dsr.LIZIZ.getValue();
            C2269801Dso.LIZIZ.getValue();
        }
    }
}
