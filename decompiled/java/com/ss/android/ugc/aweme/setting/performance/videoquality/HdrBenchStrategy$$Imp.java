package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class HdrBenchStrategy$$Imp implements HdrBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HdrBenchStrategy
    public boolean enableForceFastImportHDR() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_enable_force_fast_import_hdr", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HdrBenchStrategy
    public boolean enableHdrAllLink() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_enable_hdr_full_link", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HdrBenchStrategy
    public boolean enableRecordHdr() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_is_enable_record_hdr", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HdrBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HdrBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
