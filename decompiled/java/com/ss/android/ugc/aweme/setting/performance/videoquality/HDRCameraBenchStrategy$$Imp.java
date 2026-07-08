package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.setting.performance.videoquality.HDRCameraConfig;

/* JADX INFO: loaded from: classes29.dex */
public class HDRCameraBenchStrategy$$Imp implements HDRCameraBenchStrategy {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0zMC
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == HDRCameraConfig.class) {
                return (T) new HDRCameraConfig();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HDRCameraBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HDRCameraBenchStrategy, X.InterfaceC2256231DSr
    public HDRCameraConfig hdrCameraConfig() {
        try {
            C21308818aE c21308818aE = C21308818aE.LIZJ;
            String strLJ = c21308818aE.LJ(this.mRepoName, "studio_hdr_camera_config");
            return strLJ != null ? (HDRCameraConfig) this.mGson.LJII(strLJ, HDRCameraConfig.class) : (HDRCameraConfig) c21308818aE.LIZIZ(HDRCameraConfig.class, this.mDefaultCreate);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return (HDRCameraConfig) C21308818aE.LIZJ.LIZIZ(HDRCameraConfig.class, this.mDefaultCreate);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.HDRCameraBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
