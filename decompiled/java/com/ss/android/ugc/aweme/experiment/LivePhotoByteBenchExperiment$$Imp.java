package com.ss.android.ugc.aweme.experiment;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class LivePhotoByteBenchExperiment$$Imp implements LivePhotoByteBenchExperiment {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.experiment.LivePhotoByteBenchExperiment
    public boolean isLivePhotoEnabled() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_album_enable_live_photo_bb", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.experiment.LivePhotoByteBenchExperiment
    public boolean isLivePhotoRememberLastPreviewMode() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_album_live_photo_remember_last_mode_bb", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.experiment.LivePhotoByteBenchExperiment
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.experiment.LivePhotoByteBenchExperiment, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
