package com.ss.android.ugc.aweme.legacy;

import X.C01GW;
import X.C04TD;
import X.C452501pT;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IGsonService;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class LegacyGsonService implements IGsonService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(575));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(576));

    public static IGsonService LIZ() {
        Object objLIZ = C04TD.LIZ(IGsonService.class, false);
        if (objLIZ != null) {
            return (IGsonService) objLIZ;
        }
        if (C04TD.G1 == null) {
            synchronized (IGsonService.class) {
                if (C04TD.G1 == null) {
                    C04TD.G1 = new LegacyGsonService();
                }
            }
        }
        return C04TD.G1;
    }

    @Override // com.ss.android.ugc.aweme.IGsonService
    public final Gson getGson() {
        return (Gson) this.LIZ.getValue();
    }
}
