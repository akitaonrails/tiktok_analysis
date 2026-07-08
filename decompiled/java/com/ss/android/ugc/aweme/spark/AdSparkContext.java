package com.ss.android.ugc.aweme.spark;

import X.AbstractC1542100qES;
import X.C1077560e9C;
import X.InterfaceC1294060jmO;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC1294060jmO
public final class AdSparkContext extends SparkContext {
    public final List<AbstractC1542100qES> loadCallbacks = new ArrayList();
    public final AbstractC1542100qES loadCallbackDelegate = new C1077560e9C(this, 4);

    public final void LJJLJ(AbstractC1542100qES abstractC1542100qES) {
        this.loadCallbacks.add(abstractC1542100qES);
        LJJJJLL(this.loadCallbackDelegate);
    }
}
