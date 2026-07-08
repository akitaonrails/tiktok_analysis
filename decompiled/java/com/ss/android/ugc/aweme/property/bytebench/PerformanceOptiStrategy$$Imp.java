package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class PerformanceOptiStrategy$$Imp implements PerformanceOptiStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy, X.InterfaceC540790LIv
    public int getOpenAlbumOptiGroup() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "bytebench_creative_tools_album_opti_2021_10", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy
    public boolean isOpenAlbumThreeColumnsOpti() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_three_columns", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy
    public boolean isOpenStopVideoPlayerOpti() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_stop_video_player", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy
    public boolean isOpenTaskDegradationOpti() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_task_degradation_opti", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
