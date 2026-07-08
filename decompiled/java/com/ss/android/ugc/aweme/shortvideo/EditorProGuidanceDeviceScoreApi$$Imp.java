package com.ss.android.ugc.aweme.shortvideo;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class EditorProGuidanceDeviceScoreApi$$Imp implements EditorProGuidanceDeviceScoreApi {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.shortvideo.EditorProGuidanceDeviceScoreApi
    public int getValue() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "bytebench_editor_pro_guide_device_score", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.EditorProGuidanceDeviceScoreApi
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.EditorProGuidanceDeviceScoreApi, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
