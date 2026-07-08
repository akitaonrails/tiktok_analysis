package com.ss.android.ugc.aweme.tab.tabclean;

import X.AbstractC1591260rVk;
import X.C01GW;
import X.C0DMM;
import X.C0S4U;
import X.C0XQ7;
import X.C1150504el;
import X.C1591140rVY;
import X.C1591150rVZ;
import X.C1591210rVf;
import X.C1591220rVg;
import X.C1591240rVi;
import X.C1603830rq1;
import X.C1603840rq2;
import X.C1620910sHZ;
import X.C19EG;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS119S0100000_19;
import android.os.Bundle;
import com.bytedance.memrelief.gc.WeakRefMonitor;
import com.bytedance.memrelief.pressure.EwmaMemoryPressure;
import com.bytedance.memrelief.pressure.MemoryPressure;
import com.bytedance.memrelief.pressure.MemoryPressureWatcher;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.setting.ab.MemoryTriggerConfig;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TabCleanAssem extends BaseMainContainerAssem implements ITabCleanAbility, InterfaceC1554640qYg {
    public C1591140rVY LL;
    public MemoryPressure LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1206));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1203));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1205));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1204));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1858));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2071148470) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        HomeTabAbility homeTabAbilityLIZ;
        HomeTabAbility homeTabAbilityLIZ2;
        super.onDestroy();
        MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this);
        if (mainActivityScopeLIZLLL != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZLLL)) != null) {
            homeTabAbilityLIZ2.tx0((C1620910sHZ) this.LLILLL.getValue());
        }
        MainActivityScope mainActivityScopeLIZLLL2 = C0S4U.LIZLLL(this);
        if (mainActivityScopeLIZLLL2 != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZLLL2)) != null) {
            homeTabAbilityLIZ.Ik0((C1620910sHZ) this.LLILZ.getValue());
        }
        MemoryPressure memoryPressure = this.LLILLJJLI;
        if (memoryPressure != null) {
            memoryPressure.unregisterMemoryLevelChangeListener((C1591210rVf) this.LLILZIL.getValue());
        }
        MemoryPressure memoryPressure2 = this.LLILLJJLI;
        if (memoryPressure2 != null) {
            memoryPressure2.stop();
        }
        if (C1591220rVg.LIZJ().trigger.memory.useEwma == 2) {
            MemoryPressureWatcher.getInstance().unregisterMemoryLevelChangeListener((C1591210rVf) this.LLILZIL.getValue());
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI((C1591150rVZ) this.LLILZLL.getValue());
        WeakRefMonitor.removeGcWatcher((ARunnableS119S0100000_19) this.LLIZ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        boolean z;
        C1603830rq1 c1603830rq1;
        HomeTabAbility homeTabAbilityLIZ;
        HomeTabAbility homeTabAbilityLIZ2;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"TabCleanAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LL = new C1591140rVY(c19egLIZ);
        }
        MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this);
        if (mainActivityScopeLIZLLL != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZLLL)) != null) {
            homeTabAbilityLIZ2.ao((C1620910sHZ) this.LLILLL.getValue());
        }
        MainActivityScope mainActivityScopeLIZLLL2 = C0S4U.LIZLLL(this);
        if (mainActivityScopeLIZLLL2 != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZLLL2)) != null) {
            homeTabAbilityLIZ.UC1((C1620910sHZ) this.LLILZ.getValue());
        }
        MemoryTriggerConfig memoryTriggerConfig = C1591220rVg.LIZJ().trigger.memory;
        if (memoryTriggerConfig.enable) {
            int i = memoryTriggerConfig.useEwma;
            if (i >= 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i == 2) {
                    MemoryPressureWatcher.getInstance().registerMemoryLevelChangeListener((C1591210rVf) this.LLILZIL.getValue());
                    MemoryPressureWatcher.getInstance().start();
                } else {
                    MemoryPressure memoryPressure = new MemoryPressure(false, "default");
                    this.LLILLJJLI = memoryPressure;
                    EwmaMemoryPressure javaImpl = memoryPressure.getJavaImpl();
                    if (javaImpl != null) {
                        javaImpl.init(new C1591240rVi(memoryTriggerConfig.period, memoryTriggerConfig.windowSize, memoryTriggerConfig.alpha, memoryTriggerConfig.ewmaRate, memoryTriggerConfig.lowJavaUsageRate, memoryTriggerConfig.extremeJavaUsageRate));
                    }
                    MemoryPressure memoryPressure2 = this.LLILLJJLI;
                    if (memoryPressure2 != null) {
                        memoryPressure2.registerMemoryLevelChangeListener((C1591210rVf) this.LLILZIL.getValue());
                    }
                    MemoryPressure memoryPressure3 = this.LLILLJJLI;
                    if (memoryPressure3 != null) {
                        memoryPressure3.start();
                    }
                }
            } else {
                MemoryPressure memoryPressure4 = new MemoryPressure(true, "default");
                this.LLILLJJLI = memoryPressure4;
                AbstractC1591260rVk javaPressure = memoryPressure4.getJavaPressure();
                if ((javaPressure instanceof C1603830rq1) && (c1603830rq1 = (C1603830rq1) javaPressure) != null) {
                    long j = memoryTriggerConfig.intervalSlow;
                    long j2 = memoryTriggerConfig.intervalFast;
                    float f = memoryTriggerConfig.lowJavaUsageRate;
                    float f2 = memoryTriggerConfig.extremeJavaUsageRate;
                    C1603840rq2 c1603840rq2 = new C1603840rq2(j, j2, f, f2, memoryTriggerConfig.windowSize, memoryTriggerConfig.minGcSize);
                    if (c1603830rq1.LJIIJJI.compareAndSet(false, true)) {
                        c1603830rq1.LJIIL = c1603840rq2;
                        if (f < f2) {
                            float f3 = 0.55f;
                            if (f >= 0.55f) {
                                f3 = f;
                            }
                            c1603830rq1.LIZIZ = f3;
                            float f4 = 0.95f;
                            if (f2 <= 0.95f) {
                                f4 = f2;
                            }
                            c1603830rq1.LJ = f4;
                            float f5 = f2 - f;
                            float f6 = 3;
                            c1603830rq1.LIZJ = (f5 / f6) + f;
                            c1603830rq1.LIZLLL = f + ((2 * f5) / f6);
                        } else {
                            throw new IllegalArgumentException("init fail, lowJavaUsageRate >= extremeJavaUsageRate");
                        }
                    }
                }
                MemoryPressure memoryPressure5 = this.LLILLJJLI;
                if (memoryPressure5 != null) {
                    memoryPressure5.start();
                }
                MemoryPressure memoryPressure6 = this.LLILLJJLI;
                if (memoryPressure6 != null) {
                    memoryPressure6.registerMemoryLevelChangeListener((C1591210rVf) this.LLILZIL.getValue());
                }
            }
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL((C1591150rVZ) this.LLILZLL.getValue());
        WeakRefMonitor.addGcWatcher((ARunnableS119S0100000_19) this.LLIZ.getValue());
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
