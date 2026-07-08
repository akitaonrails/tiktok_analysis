package com.ss.android.ugc.aweme.ml.tars.settings;

import X.C01GW;
import X.C0C59;
import X.C452501pT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tars.settings.ITarsConfigSpi;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes15.dex */
public final class TarsConfigFetcherImpl implements ITarsConfigSpi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(589));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 686));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(283));

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    @Override // com.ss.android.ugc.aweme.tars.settings.ITarsConfigSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.tars.settings.TarsConfig LIZ(java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.tars.settings.TarsConfigFetcherImpl.LIZ(java.lang.String):com.ss.android.ugc.aweme.tars.settings.TarsConfig");
    }

    @Override // com.ss.android.ugc.aweme.tars.settings.ITarsConfigSpi
    public final TarsConfig LIZJ(String str) {
        String string;
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            c0c59LJ.LJIILJJIL(0, false);
            Object objLJIIJJI = c0c59LJ.LJIIJJI(str, true);
            if (objLJIIJJI != null && (string = objLJIIJJI.toString()) != null) {
                return (TarsConfig) ((Gson) this.LIZ.getValue()).LJII(string, TarsConfig.class);
            }
            return (TarsConfig) ((Map) this.LIZIZ.getValue()).get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return (TarsConfig) ((Map) this.LIZIZ.getValue()).get(str);
        } catch (ExceptionInInitializerError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return (TarsConfig) ((Map) this.LIZIZ.getValue()).get(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.tars.settings.ITarsConfigSpi
    public final void LIZIZ(TarsConfig tarsConfig, String str) {
        ((Map) this.LIZIZ.getValue()).containsKey(str);
        ((Map) this.LIZIZ.getValue()).put(str, tarsConfig);
    }
}
