package ye9;

import X.C1AF0;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.promote.model.PromoteConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    static {
        new g();
    }

    public static final PromoteConfig LIZ() {
        try {
            return (PromoteConfig) SettingsManager.LIZLLL().LJIIIIZZ("promote_config", PromoteConfig.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }
}
