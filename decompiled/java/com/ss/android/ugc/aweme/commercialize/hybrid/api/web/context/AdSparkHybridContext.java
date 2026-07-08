package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context;

import X.AbstractC1542100qES;
import X.C1051590dTJ;
import X.C1077560e9C;
import X.InterfaceC1294060jmO;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class AdSparkHybridContext extends SparkContext {
    public static final C1051590dTJ Companion = new Object() { // from class: X.0dTJ
    };
    public final AbstractC1542100qES loadCallbackDelegate;
    public final CopyOnWriteArrayList<AbstractC1542100qES> loadCallbacks = new CopyOnWriteArrayList<>();

    public AdSparkHybridContext() {
        C1077560e9C c1077560e9C = new C1077560e9C(this, 0);
        this.loadCallbackDelegate = c1077560e9C;
        LJJJJLL(c1077560e9C);
    }

    @InterfaceC1294060jmO
    public final void LJJLJ(AbstractC1542100qES abstractC1542100qES) {
        if (abstractC1542100qES != null) {
            this.loadCallbacks.add(abstractC1542100qES);
        }
    }
}
