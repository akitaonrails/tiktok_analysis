package com.bytedance.hybrid.spark.autoservice;

import X.C04TD;
import X.C098200Yq;
import X.C1287700jc8;
import X.C1533070pzt;
import X.C1541620qDg;
import X.C1542450qF1;
import X.C1542560qFC;
import X.C189200o6;
import X.C1963807me;
import X.C1BP1;
import X.C1BVV;
import X.C786410Ut5;
import X.InterfaceC1533190q05;
import X.InterfaceC1541990qEH;
import X.InterfaceC1542670qFN;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkInnerPIA implements ISparkInnerPIA {
    public static ISparkInnerPIA createISparkInnerPIAbyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ISparkInnerPIA.class, z);
        if (objLIZ != null) {
            return (ISparkInnerPIA) objLIZ;
        }
        if (C04TD.LJJI == null) {
            synchronized (ISparkInnerPIA.class) {
                if (C04TD.LJJI == null) {
                    C04TD.LJJI = new SparkInnerPIA();
                }
            }
        }
        return C04TD.LJJI;
    }

    @Override // com.bytedance.hybrid.spark.autoservice.ISparkInnerPIA
    public void initGlobal(Context context) {
        Unit unit;
        Set<C1BP1<?, ?>> set = C1542450qF1.LIZ;
        try {
            Context contextN3 = C786410Ut5.N3(context);
            if (contextN3 != null && C1542560qFC.LIZ == null) {
                C1542560qFC.LIZ = contextN3;
            }
            InterfaceC1542670qFN interfaceC1542670qFN = (InterfaceC1542670qFN) C1963807me.LIZ(InterfaceC1542670qFN.class);
            if (interfaceC1542670qFN != null) {
                interfaceC1542670qFN.LIZ(C1542450qF1.LIZIZ);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.hybrid.spark.autoservice.ISparkInnerPIA
    public boolean isPia(String str) {
        Set<C1BP1<?, ?>> set = C1542450qF1.LIZ;
        InterfaceC1533190q05 interfaceC1533190q05 = (InterfaceC1533190q05) C1963807me.LIZ(InterfaceC1533190q05.class);
        if (interfaceC1533190q05 != null && interfaceC1533190q05.LIZ(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.hybrid.spark.autoservice.ISparkInnerPIA
    public void onPostKitCreated(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1BVV c1bvv;
        C1541620qDg extendableContext;
        if ((interfaceC1541990qEH instanceof WebKitView) && (c1bvv = (C1BVV) interfaceC1541990qEH) != null && (extendableContext = c1bvv.getExtendableContext()) != null) {
            extendableContext.LIZ(Collections.singleton(C1533070pzt.class));
        }
    }

    @Override // com.bytedance.hybrid.spark.autoservice.ISparkInnerPIA
    public void warmup(SparkContext sparkContext, Context context) {
        final ARunnableS85S0200000_16 aRunnableS85S0200000_16 = new ARunnableS85S0200000_16(this, sparkContext, 2);
        C1287700jc8.LIZJ(new Runnable() { // from class: X.0qFG
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable = aRunnableS85S0200000_16;
                C1C7U.LIZ("PiaService@405a.runOnPiaThread$1L");
                try {
                    runnable.run();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1BPP.LIZIZ("Run task on PIA Thread error:", th);
                }
                C1C7U.LIZIZ("PiaService@405a.runOnPiaThread$1L");
            }
        });
    }
}
