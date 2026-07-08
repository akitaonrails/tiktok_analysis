package com.bytedance.hybrid.spark.raven.component.builtin.spark;

import X.C1163080gN8;
import X.C1163100gNA;
import X.C1559260qg8;
import X.C723580SZw;
import X.C786410Ut5;
import Y.ARunnableS118S0100000_18;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.MynaRavenUIAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class RavenBaseGlueDynamicComponent<T extends BaseComponentData> extends BaseRavenComponentDynamicAssem<T> {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1163080gN8.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        ARunnableS118S0100000_18 aRunnableS118S0100000_18 = new ARunnableS118S0100000_18(this, 62);
        if (!(!(this instanceof MynaRavenUIAssem)) && Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            aRunnableS118S0100000_18.run();
        } else {
            C786410Ut5.LJJZZIII(C1163100gNA.LIZ, aRunnableS118S0100000_18);
        }
        ARunnableS118S0100000_18 aRunnableS118S0100000_182 = new ARunnableS118S0100000_18(this, 63);
        BPEAHandler bPEAHandler = C1163100gNA.LIZ;
        C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS118S0100000_182);
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS118S0100000_18(this, 64));
    }
}
