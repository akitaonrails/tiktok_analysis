package com.ss.android.ugc.aweme.publish.business.foreground;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class FastForegroundPublishStrategy$$Imp implements FastForegroundPublishStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.publish.business.foreground.FastForegroundPublishStrategy
    public boolean getValue() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_publish_fast_foreground", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.business.foreground.FastForegroundPublishStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.publish.business.foreground.FastForegroundPublishStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
