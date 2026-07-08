package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class FrontFlashByteBenchStrategy$$Imp implements FrontFlashByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.FrontFlashByteBenchStrategy
    public int frontFlashStyle() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "studio_front_flash_style", 1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FrontFlashByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FrontFlashByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
