package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class NowVQByteBenchStrategy$$Imp implements NowVQByteBenchStrategy {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0neJ
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public boolean enableSplitConfig() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "now_enable_split_config", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public float sourceBitrateFactor() {
        try {
            return C21308818aE.LIZJ.LIZJ(this.mRepoName, "now_video_bitrate", Float.MIN_VALUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Float.MIN_VALUE;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public String compileExternalSetting() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "now_ve_synthesis_settings");
            return strLJ != null ? strLJ : "invalid_str";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "invalid_str";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int compileVideoSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "now_compile_video_size_index", Integer.MIN_VALUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Integer.MIN_VALUE;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public String getNowTakePictureSize() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "now_ve_take_picture_size");
            return strLJ != null ? strLJ : "invalid_str";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "invalid_str";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int recordVideoEncodeSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "now_video_encode_size_index", Integer.MIN_VALUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Integer.MIN_VALUE;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int shotScreenEncodeSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "now_shot_screen_encode_size_index", Integer.MIN_VALUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Integer.MIN_VALUE;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public String sourcePreviewSize() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "now_ve_camera_preview_size");
            return strLJ != null ? strLJ : "invalid_str";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "invalid_str";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int sourceVideoSizeIndex() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "now_video_size_index", Integer.MIN_VALUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Integer.MIN_VALUE;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
