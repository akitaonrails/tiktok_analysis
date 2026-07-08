package com.bytedance.memrelief.pressure;

import X.AbstractC1591260rVk;
import X.C01GW;
import X.C09Q3;
import X.C1603770rpv;
import X.C1603830rq1;
import X.C452501pT;
import X.InterfaceC1294060jmO;
import X.InterfaceC1603810rpz;
import com.bytedance.memrelief.pressure.EwmaMemoryPressure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MemoryPressure {
    public final C01GW javaImpl$delegate;
    public final AbstractC1591260rVk javaPressure;
    public final String name;
    public final C01GW nativeImpl$delegate;
    public final boolean usePull;

    public MemoryPressure() {
        this(true, "default");
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getJavaPressure$annotations() {
    }

    public final EwmaMemoryPressure getJavaImpl() {
        return (EwmaMemoryPressure) this.javaImpl$delegate.getValue();
    }

    public C09Q3 getJavaMemoryLevel() {
        return this.usePull ? this.javaPressure.LIZ : getJavaImpl().getCurrentLevel();
    }

    public final EwmaMemoryPressure getNativeImpl() {
        return (EwmaMemoryPressure) this.nativeImpl$delegate.getValue();
    }

    public void start() {
        if (this.usePull) {
            this.javaPressure.LIZ();
        }
        getJavaImpl().start();
        getNativeImpl().start();
    }

    public void stop() {
        if (this.usePull) {
            this.javaPressure.LIZIZ();
        }
        getJavaImpl().stop();
        getNativeImpl().stop();
    }

    public C09Q3 getNativeMemoryLevel() {
        return getNativeImpl().getCurrentLevel();
    }

    public final AbstractC1591260rVk getJavaPressure() {
        return this.javaPressure;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getUsePull() {
        return this.usePull;
    }

    public void registerMemoryLevelChangeListener(InterfaceC1603810rpz interfaceC1603810rpz) {
        if (this.usePull) {
            C1603770rpv c1603770rpv = this.javaPressure.LJFF;
            synchronized (c1603770rpv.LIZ) {
                try {
                    ((ArrayList) c1603770rpv.LIZIZ).add(interfaceC1603810rpz);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        getJavaImpl().register(interfaceC1603810rpz);
        getNativeImpl().register(interfaceC1603810rpz);
    }

    public void unregisterMemoryLevelChangeListener(InterfaceC1603810rpz interfaceC1603810rpz) {
        if (this.usePull) {
            C1603770rpv c1603770rpv = this.javaPressure.LJFF;
            synchronized (c1603770rpv.LIZ) {
                try {
                    ((ArrayList) c1603770rpv.LIZIZ).remove(interfaceC1603810rpz);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        getJavaImpl().unregister(interfaceC1603810rpz);
        getNativeImpl().unregister(interfaceC1603810rpz);
    }

    public MemoryPressure(boolean z, String str) {
        AbstractC1591260rVk c1603830rq1;
        this.usePull = z;
        this.name = str;
        if (z) {
            c1603830rq1 = new C1603830rq1();
        } else {
            c1603830rq1 = new AbstractC1591260rVk() { // from class: X.0rVl
                public final EwmaMemoryPressure LJI = new EwmaMemoryPressure(false, "default", new C1591290rVn(0), false, true, AFwS213S0000000_24.get$arr$(586));

                @Override // X.AbstractC1591260rVk
                public final void LIZ() {
                    this.LJI.start();
                }

                @Override // X.AbstractC1591260rVk
                public final void LIZIZ() {
                    this.LJI.stop();
                }
            };
        }
        this.javaPressure = c1603830rq1;
        this.javaImpl$delegate = C452501pT.LIZIZ(new AwS568S0100000_24(this, 29));
        this.nativeImpl$delegate = C452501pT.LIZIZ(new AwS568S0100000_24(this, 30));
    }
}
