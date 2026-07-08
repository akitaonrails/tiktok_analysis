package com.ss.android.ugc.aweme.refine.base.bytebench;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class PerformanceOptimizeStrategy$$Imp implements PerformanceOptimizeStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.refine.base.bytebench.PerformanceOptimizeStrategy, X.C1D7N
    public int getOpenAlbumGroup() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "bytebench_creative_refine_album_group", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.refine.base.bytebench.PerformanceOptimizeStrategy, X.C1D7N
    public boolean isOpenAlbumThreeColumns() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "bytebench_creative_refine_three_columns", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.refine.base.bytebench.PerformanceOptimizeStrategy
    public boolean isOpenStopVideoPlayer() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "bytebench_creative_refine_stop_video_player", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.refine.base.bytebench.PerformanceOptimizeStrategy, X.C1D7N
    public boolean isOpenTaskDegradation() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "bytebench_creative_refine_task_degradation", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.refine.base.bytebench.PerformanceOptimizeStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.refine.base.bytebench.PerformanceOptimizeStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
