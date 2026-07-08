package com.ss.android.ugc.aweme.setting.performance.publish;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class PrePublishDowngradeStrategyBenchImpl$$Imp implements PrePublishDowngradeStrategyBenchImpl {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.setting.performance.publish.PrePublishDowngradeStrategyBenchImpl, X.InterfaceC2256171DSl
    public boolean disablePreCompile() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_disable_pre_compile", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.publish.PrePublishDowngradeStrategyBenchImpl
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.publish.PrePublishDowngradeStrategyBenchImpl, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
