package com.bytedance.pumbaa.utility.settings;

import X.C01GW;
import X.C452501pT;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class PerformanceExprSwitchImpl implements IPerformanceExprSwitch {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(774));

    public final PerformanceExprSwitchConfig LJIIJJI() {
        return (PerformanceExprSwitchConfig) this.LIZ.getValue();
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZ() {
        return LJIIJJI().globalInitEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZIZ() {
        return LJIIJJI().utilityEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZJ() {
        return LJIIJJI().engineEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LIZLLL() {
        return LJIIJJI().networkEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJ() {
        return LJIIJJI().permissionPopUpEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJFF() {
        return LJIIJJI().apiCacheEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJI() {
        return LJIIJJI().app2appEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJII() {
        return LJIIJJI().systemApiEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJIIIIZZ() {
        return LJIIJJI().hybridEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJIIIZ() {
        return LJIIJJI().userInputEnable;
    }

    @Override // com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch
    public final boolean LJIIJ() {
        return LJIIJJI().sdkEnable;
    }
}
