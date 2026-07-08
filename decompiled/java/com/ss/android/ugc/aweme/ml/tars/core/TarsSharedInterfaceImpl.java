package com.ss.android.ugc.aweme.ml.tars.core;

import X.C01GW;
import X.C0Z0K;
import X.C0Z0Y;
import X.C20684815ws;
import X.C2097608Jq;
import X.C452501pT;
import X.C823050WQl;
import X.C892640Z0c;
import X.InterfaceC892680Z0g;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tars.TarsInstConfig;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.ss.android.ugc.aweme.tars.settings.ITarsConfigSpi;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes15.dex */
public final class TarsSharedInterfaceImpl implements TarsSharedInterface {
    public final Map<String, C0Z0Y> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(155));

    @Override // com.ss.android.ugc.aweme.tars.TarsSharedInterface
    public final ExecutorService LJ() {
        return C823050WQl.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.tars.TarsSharedInterface
    public final void LIZIZ(C0Z0Y c0z0y) {
        this.LIZ.remove(c0z0y.getScene());
    }

    public static void LJFF(String str, Throwable th) {
        C20684815ws.LJIILLIIL("ml_scene_run", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, str), new Pair("success", CardStruct.IStatusCode.DEFAULT), new Pair("is_first_inference", "true"), new Pair("error_description", String.valueOf(th.getMessage()))));
    }

    @Override // com.ss.android.ugc.aweme.tars.TarsSharedInterface
    public final C0Z0K LIZ(String str, List list) {
        TarsConfig tarsConfigLIZ;
        ITarsConfigSpi iTarsConfigSpi = (ITarsConfigSpi) PluggableExtentionKt.pluggableSpi$default(ITarsConfigSpi.class, false, false, false, 14, null);
        if (iTarsConfigSpi != null && (tarsConfigLIZ = iTarsConfigSpi.LIZ(str)) != null) {
            try {
                return new C0Z0K(str, tarsConfigLIZ, (List<? extends InterfaceC892680Z0g>) list, (ExecutorService) this.LIZIZ.getValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJFF(str, th);
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tars.TarsSharedInterface
    public final C0Z0Y LIZJ(String str, TarsInstConfig tarsInstConfig) {
        if (tarsInstConfig != null && !tarsInstConfig.isCachedInstance()) {
            C0Z0K c0z0kLIZ = LIZ(str, null);
            if (c0z0kLIZ != null && c0z0kLIZ.LIZJ) {
                return c0z0kLIZ;
            }
        } else {
            C0Z0Y c0z0y = (C0Z0Y) ((LinkedHashMap) this.LIZ).get(str);
            C0Z0Y c0z0y2 = c0z0y;
            if (c0z0y == null) {
                C0Z0K c0z0kLIZ2 = LIZ(str, null);
                if (c0z0kLIZ2 != null) {
                    boolean z = c0z0kLIZ2.LIZJ;
                    c0z0y2 = c0z0kLIZ2;
                    if (z) {
                        this.LIZ.put(str, c0z0kLIZ2);
                        c0z0y2 = c0z0kLIZ2;
                    }
                }
            }
            return c0z0y2;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tars.TarsSharedInterface
    public final C0Z0K LIZLLL(String str, List list) {
        TarsConfig tarsConfigLIZ;
        ITarsConfigSpi iTarsConfigSpi = (ITarsConfigSpi) PluggableExtentionKt.pluggableSpi$default(ITarsConfigSpi.class, false, false, false, 14, null);
        if (iTarsConfigSpi != null && (tarsConfigLIZ = iTarsConfigSpi.LIZ(str)) != null) {
            try {
                return new C0Z0K(str, tarsConfigLIZ, (ExecutorService) this.LIZIZ.getValue(), (List<C892640Z0c>) list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJFF(str, th);
                return null;
            }
        }
        return null;
    }
}
