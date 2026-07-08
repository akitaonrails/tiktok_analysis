package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;

/* JADX INFO: loaded from: classes29.dex */
public class StickerDowngradeStrategy$$Imp implements StickerDowngradeStrategy {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0ydg
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == StickerPreviewResolutionConfig.class) {
                return (T) new StickerPreviewResolutionConfig();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy, X.InterfaceC1625730sPL
    public boolean enableUseDynamicEffectLabel() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_enable_use_dynamic_effect_label", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy, X.InterfaceC1625730sPL
    public StickerPreviewResolutionConfig getResolutionConfig() {
        try {
            C21308818aE c21308818aE = C21308818aE.LIZJ;
            String strLJ = c21308818aE.LJ(this.mRepoName, "studio_downgrade_sticker_preview_resolution");
            return strLJ != null ? (StickerPreviewResolutionConfig) this.mGson.LJII(strLJ, StickerPreviewResolutionConfig.class) : (StickerPreviewResolutionConfig) c21308818aE.LIZIZ(StickerPreviewResolutionConfig.class, this.mDefaultCreate);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return (StickerPreviewResolutionConfig) C21308818aE.LIZJ.LIZIZ(StickerPreviewResolutionConfig.class, this.mDefaultCreate);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
