package w1p;

import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.effectplatform.EffectsPredownloadPreloadConfigModel;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final EffectsPredownloadPreloadConfigModel LIZ;

    static {
        new a();
        LIZ = new EffectsPredownloadPreloadConfigModel(false, 2, 2, 2, 2, false, 2, 2, false, new String[]{"", "default", "effect", "editingeffect"});
    }

    public static final EffectsPredownloadPreloadConfigModel LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            EffectsPredownloadPreloadConfigModel effectsPredownloadPreloadConfigModel = LIZ;
            EffectsPredownloadPreloadConfigModel effectsPredownloadPreloadConfigModel2 = (EffectsPredownloadPreloadConfigModel) c0c64LJIILLIIL.LJJII(EffectsPredownloadPreloadConfigModel.class, effectsPredownloadPreloadConfigModel, "creative_tools_effect_pre_download_preload_opt", true);
            return effectsPredownloadPreloadConfigModel2 != null ? effectsPredownloadPreloadConfigModel2 : effectsPredownloadPreloadConfigModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }
}
