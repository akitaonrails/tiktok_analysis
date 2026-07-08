package defpackage;

import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class c2 {
    public static final HybridABApiRetrySetting LIZ = new HybridABApiRetrySetting(true, 3, 1500, 0, true, 3, true, false);

    public static HybridABApiRetrySetting LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            HybridABApiRetrySetting hybridABApiRetrySetting = LIZ;
            HybridABApiRetrySetting hybridABApiRetrySetting2 = (HybridABApiRetrySetting) c0c64LJIILLIIL.LJJII(HybridABApiRetrySetting.class, hybridABApiRetrySetting, "hybrid_ab_api_settings", true);
            return hybridABApiRetrySetting2 != null ? hybridABApiRetrySetting2 : hybridABApiRetrySetting;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
