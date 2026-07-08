package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0V7X;
import X.C0VU1;
import X.C0VZ0;
import X.C1325700kbQ;
import X.C1325730kbT;
import X.C1330550kjF;
import X.C1330560kjG;
import X.C1330690kjT;
import X.C1AF0;
import X.C1BC2;
import X.C1BCA;
import X.C2222891BzL;
import X.C2354709Kn;
import X.C282120B3y;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1330800kje;
import X.InterfaceC799590VYf;
import Y.ACallableS248S0200000_20;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.experiment.HeifUrlReplaceConfig;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FrescoTask implements C0CCZ, InterfaceC799590VYf {
    public static volatile boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FrescoTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C2222891BzL.LIZ.LJIIIZ() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!LL) {
            synchronized (FrescoTask.class) {
                try {
                    if (!LL) {
                        C2222891BzL c2222891BzL = C2222891BzL.LIZ;
                        if (c2222891BzL.LJII()) {
                            C1330560kjG.LIZIZ = true;
                        }
                        if (c2222891BzL.LJIIIZ()) {
                        }
                        System.currentTimeMillis();
                        context.getClass();
                        C2354709Kn.LIZ = context;
                        try {
                            C1330550kjF.LIZ();
                            LL = true;
                            C0V7X.LIZ.LIZ(new InterfaceC1330800kje() { // from class: X.0kjK
                                @Override // X.InterfaceC1330800kje
                                public final void LIZJ(EnumC1330650kjP enumC1330650kjP) {
                                    try {
                                        double suggestedTrimRatio = enumC1330650kjP.getSuggestedTrimRatio();
                                        if (EnumC1330650kjP.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || EnumC1330650kjP.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || EnumC1330650kjP.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
                                            C1329320khG.LIZ(suggestedTrimRatio);
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            });
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJFF(e, "[Lighten][Fresco][Initializer][Throwable]");
                            throw e;
                        }
                    }
                    final double dDoubleValue = ((Number) C282120B3y.LIZ.getValue()).doubleValue();
                    if (dDoubleValue != 0.0d) {
                        C1BCA.LJIILL(new C1BC2() { // from class: X.0kdQ
                            @Override // X.InterfaceC1006670cIr
                            public final void LJIIJ(C1BC7 c1bc7, C1BC7 c1bc72) {
                                double d = dDoubleValue;
                                if (!c1bc72.LIZ) {
                                    C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                                    Double dValueOf = Double.valueOf(d);
                                    C1326950kdR c1326950kdR = c1325540kbALIZ.LJIIIIZZ;
                                    c1326950kdR.getClass();
                                    try {
                                        C15O7.LIZIZ(new ACallableS248S0200000_20(c1326950kdR, dValueOf, 3), c1326950kdR.LJ, null);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        C1328570kg3.LJIJ(C1326950kdR.LJII, e2, "clearByPercentage, Failed to schedule disk-cache clear", new Object[0]);
                                        C15O7.LJIIIZ(e2);
                                    }
                                }
                            }
                        });
                    }
                    HeifUrlReplaceConfig heifUrlReplaceConfig = (HeifUrlReplaceConfig) C1330690kjT.LIZIZ.getValue();
                    if (heifUrlReplaceConfig.isValid() || !Boolean.FALSE.equals(heifUrlReplaceConfig.isEnable())) {
                        C1325700kbQ.LJJIJLIJ = new C1325730kbT(heifUrlReplaceConfig);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
