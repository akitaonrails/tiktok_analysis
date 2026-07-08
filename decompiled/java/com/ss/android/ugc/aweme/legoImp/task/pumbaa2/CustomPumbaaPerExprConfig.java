package com.ss.android.ugc.aweme.legoImp.task.pumbaa2;

import X.C01GW;
import X.C04TD;
import X.C452501pT;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import com.bytedance.pumbaa.utility.settings.PerformanceExprSwitchConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomPumbaaPerExprConfig implements IPerformanceExprSwitch {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1729));

    public static IPerformanceExprSwitch LJIIJJI() {
        Object objLIZ = C04TD.LIZ(IPerformanceExprSwitch.class, false);
        if (objLIZ != null) {
            return (IPerformanceExprSwitch) objLIZ;
        }
        if (C04TD.Q1 == null) {
            synchronized (IPerformanceExprSwitch.class) {
                if (C04TD.Q1 == null) {
                    C04TD.Q1 = new CustomPumbaaPerExprConfig();
                }
            }
        }
        return C04TD.Q1;
    }

    public final PerformanceExprSwitchConfig LJIIL() {
        return (PerformanceExprSwitchConfig) this.LIZ.getValue();
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZ() {
        return LJIIL().globalInitEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZIZ() {
        return LJIIL().utilityEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZJ() {
        return LJIIL().engineEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZLLL() {
        return LJIIL().networkEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJ() {
        return LJIIL().permissionPopUpEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJFF() {
        return LJIIL().apiCacheEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJI() {
        return LJIIL().app2appEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJII() {
        return LJIIL().systemApiEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJIIIIZZ() {
        return LJIIL().hybridEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJIIIZ() {
        return LJIIL().userInputEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJIIJ() {
        return LJIIL().sdkEnable;
    }
}
