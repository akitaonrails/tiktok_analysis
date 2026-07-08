package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class CameraStabilizationBenchApiBenchStrategy$$Imp implements CameraStabilizationBenchApiBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.CameraStabilizationBenchApiBenchStrategy, X.InterfaceC2256201DSo
    public int getFrontCameraStabilizationStrategy() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "studio_front_camera_stabilization_strategy", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.CameraStabilizationBenchApiBenchStrategy, X.InterfaceC2256201DSo
    public int getRearCameraStabilizationStrategy() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "studio_rear_camera_stabilization_strategy", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.CameraStabilizationBenchApiBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.CameraStabilizationBenchApiBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
