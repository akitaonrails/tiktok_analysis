package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class PhotoMVByteBenchStrategy$$Imp implements PhotoMVByteBenchStrategy {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0neK
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == String.class) {
                return (T) new String();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC1442770neF
    public boolean enableMvBindingHDSwitch() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "mv_enable_binding_hd_switch", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC1442770neF
    public boolean enableSynthesisMvTo1080p() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "enable_1080p_photo_to_video", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC1442770neF
    public int mvDynamicResolutionStrategy() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "tool_photo_to_video_resolution_strategy", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC1442770neF
    public int mvFastImportStrategy() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "mv_photo_resize_strategy", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC1442770neF
    public String mvSynthesisSettingsFor1080p() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "avtools_1080p_mv_photo_ve_synthesis_settings");
            return strLJ != null ? strLJ : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
