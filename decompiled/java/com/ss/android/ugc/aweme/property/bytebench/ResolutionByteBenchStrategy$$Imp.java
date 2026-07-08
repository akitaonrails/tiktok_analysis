package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class ResolutionByteBenchStrategy$$Imp implements ResolutionByteBenchStrategy {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0neL
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy
    public boolean enablePreviewResolutionDowngrade() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_enable_preview_resolution_downgrade", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy
    public int previewVideoSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "studio_preview_video_size_index", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC1442520ndq
    public int uploadVideoSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "upload_video_size_index", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC1442520ndq
    public int videoSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "video_size_index", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC1442520ndq
    public int compileVideoSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "compile_video_size_index", 99);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 99;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC1442520ndq
    public int hdCompileVideoSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "high_quality_compile_video_size_index", 99);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 99;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC1442520ndq
    public String previewDowngradeSupportTab() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "studio_preview_downgrade_tab");
            return strLJ != null ? strLJ : "10,11,14,18, 17";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "10,11,14,18, 17";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC1442520ndq
    public int staticVideoSizeIndex() {
        try {
            return this.mStrategyImp.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC1442520ndq
    public String veCameraPreviewSize() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "ve_camera_preview_size");
            return strLJ != null ? strLJ : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
