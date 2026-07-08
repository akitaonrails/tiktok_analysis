package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class RecodeByteBenchStrategy$$Imp implements RecodeByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy, X.InterfaceC1442580ndw
    public int hdRecodeBitrateThreshold() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "high_quality_bitrate_of_recode_threshold", 10000000);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 10000000;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy, X.InterfaceC1442580ndw
    public int recodeBitrateThreshold() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "bitrate_of_recode_threshold", 10000000);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 10000000;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
