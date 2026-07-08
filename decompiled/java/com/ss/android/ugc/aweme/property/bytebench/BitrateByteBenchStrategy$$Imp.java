package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class BitrateByteBenchStrategy$$Imp implements BitrateByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC1442530ndr
    public int videoBitrateCategoryIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "video_bitrate_category_index", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC1442530ndr
    public float syntheticVideoBitrate() {
        try {
            return C21308818aE.LIZJ.LIZJ(this.mRepoName, "synthetic_video_bitrate", 1.0f);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1.0f;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC1442530ndr
    public float videoBitrate() {
        try {
            return C21308818aE.LIZJ.LIZJ(this.mRepoName, "video_bitrate", 1.0f);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1.0f;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
