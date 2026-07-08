package com.ss.android.ugc.aweme.legoImp.task.dm;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C823510WSf;
import X.C823520WSg;
import X.C823550WSj;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import X.InterfaceC823600WSo;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.dm.ldp.LDPCalculateParams;
import com.tiktok.pns.ldp.api.ILDPService;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class DMHighPriorityTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DMHighPriorityTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
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
        return !ColdBootTasksDegradeExperiment.LIZ().dmHighPriorityTask;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0WSe] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        new Object() { // from class: X.0WSh
        }.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LDPCalculateParams lDPCalculateParams = C823510WSf.LIZ;
        LDPCalculateParams lDPCalculateParams2 = (LDPCalculateParams) settingsManagerLIZLLL.LJIIIIZZ("tiktok_pns_pet_ldp_config", LDPCalculateParams.class, lDPCalculateParams);
        if (lDPCalculateParams2 != null) {
            lDPCalculateParams = lDPCalculateParams2;
        }
        if (lDPCalculateParams.enable) {
            try {
                C844470XAv.LIZ.getClass();
                String strValueOf = String.valueOf(C844470XAv.LJIIJ);
                C823520WSg c823520WSg = new C823520WSg(Build.VERSION.RELEASE, C844470XAv.LJFF(), strValueOf, C844470XAv.LJIILL, new InterfaceC823600WSo() { // from class: X.0WSe
                    @Override // X.InterfaceC823600WSo
                    public final String LIZIZ() {
                        C0XQ7.LJ();
                        return C0XQ7.LIZ.LJIIJ().isLogin() ? "true" : "false";
                    }

                    @Override // X.InterfaceC823600WSo
                    public final String getPriorityRegion() {
                        return C2222691Bz1.LIZIZ();
                    }

                    @Override // X.InterfaceC823600WSo
                    public final String getRegion() {
                        return C20301014c4.LIZIZ();
                    }

                    @Override // X.InterfaceC823600WSo
                    public final String LIZ() {
                        return C2273401Dyc.LIZLLL;
                    }
                });
                ILDPService iLDPService = (ILDPService) PluggableExtentionKt.pluggableSpi$default(ILDPService.class, false, false, false, 14, null);
                if (iLDPService != null) {
                    iLDPService.LIZ(C823550WSj.LIZ, c823520WSg);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
