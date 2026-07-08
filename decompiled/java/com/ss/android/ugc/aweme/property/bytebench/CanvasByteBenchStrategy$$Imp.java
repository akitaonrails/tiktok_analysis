package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class CanvasByteBenchStrategy$$Imp implements CanvasByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy, X.InterfaceC1442440ndi
    public boolean enableCanvasDynamicResolution() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "canvas_enable_dynamic_resolution", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
