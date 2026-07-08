package com.bytedance.pia.core;

import X.C1BPP;
import X.C2201341BDo;
import X.C2204311BOz;
import android.net.Uri;
import com.bytedance.pia.core.PiaManifest;
import com.bytedance.pia.core.plugins.BridgeDowngradePlugin;
import com.bytedance.pia.core.plugins.BridgePlugin;
import com.bytedance.pia.core.plugins.NsrPlugin;
import com.bytedance.pia.core.plugins.PrefetchPlugin;
import com.bytedance.pia.core.plugins.SnapshotPlugin;
import com.bytedance.pia.page.bridge.PiaPostWorkerMessageMethod;
import com.google.gson.Gson;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public class CompatEntry {
    public static void initialize() {
        C2201341BDo c2201341BDo;
        C1BPP.LJ("Initialize PIA-Core-Compat.");
        C2201341BDo c2201341BDo2 = new C2201341BDo() { // from class: X.1BDm
            @Override // X.C2201341BDo
            public final void LIZ(C2204041BNy c2204041BNy) {
                super.LIZ(c2204041BNy);
                if (c2204041BNy.LJIIIZ()) {
                    return;
                }
                C1287750jcD c1287750jcD = c2204041BNy.LJII;
                EnumC1287770jcF enumC1287770jcF = EnumC1287770jcF.NSR_ENABLED;
                c1287750jcD.LIZJ(enumC1287770jcF, 0);
                C1287750jcD c1287750jcD2 = c2204041BNy.LJII;
                EnumC1287770jcF enumC1287770jcF2 = EnumC1287770jcF.SNAPSHOT_ENABLED;
                c1287750jcD2.LIZJ(enumC1287770jcF2, 0);
                C1287750jcD c1287750jcD3 = c2204041BNy.LJII;
                EnumC1287770jcF enumC1287770jcF3 = EnumC1287770jcF.PREFETCH_ENABLED;
                c1287750jcD3.LIZJ(enumC1287770jcF3, 0);
                if (c2204041BNy.LJ.getBooleanQueryParameter("__pia_manifest__", false)) {
                    Gson gson = PiaManifest.LJI;
                    PiaManifest piaManifestLIZ = C1B13.LIZ(c2204041BNy, c2204041BNy.LJ.toString());
                    if (piaManifestLIZ == null) {
                        return;
                    }
                    Uri uri = piaManifestLIZ.LIZJ;
                    if (!C2203961BNq.LIZ().LIZIZ(uri)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[CompatPluginRegistry]: register failed, public path not support. Public path = ");
                        sbLIZ.append(uri);
                        C1BPP.LJII(6, C2188811AlT.LIZIZ(sbLIZ), null);
                        return;
                    }
                    c2204041BNy.LJIIIIZZ(BridgePlugin.class, null);
                    c2204041BNy.LJIIIIZZ(BridgeDowngradePlugin.class, piaManifestLIZ);
                    if (piaManifestLIZ.LJFF && C2203961BNq.LIZ().isNsrV1Enabled) {
                        c2204041BNy.LJIIIIZZ(NsrPlugin.class, piaManifestLIZ);
                        c2204041BNy.LJII.LIZJ(enumC1287770jcF, 1);
                    }
                    if (piaManifestLIZ.LJ && C2203961BNq.LIZ().isSnapshotV1Enabled) {
                        c2204041BNy.LJIIIIZZ(SnapshotPlugin.class, piaManifestLIZ);
                        c2204041BNy.LJII.LIZJ(enumC1287770jcF2, 1);
                    }
                    if (piaManifestLIZ.LIZLLL && C2203961BNq.LIZ().isPrefetchV1Enabled) {
                        c2204041BNy.LJIIIIZZ(PrefetchPlugin.class, piaManifestLIZ);
                        c2204041BNy.LJII.LIZJ(enumC1287770jcF3, 1);
                        c2204041BNy.LJIILJJIL.LIZIZ(1);
                    }
                    C1BPP.LJII(6, "[CompatPluginRegistry]: register success.", null);
                }
            }
        };
        C2201341BDo c2201341BDo3 = C2201341BDo.LIZIZ;
        C2201341BDo c2201341BDo4 = c2201341BDo3.LIZ;
        if (c2201341BDo4 == null) {
            c2201341BDo3.LIZ = c2201341BDo2;
        } else {
            C2201341BDo c2201341BDo5 = c2201341BDo4.LIZ;
            while (true) {
                c2201341BDo = c2201341BDo4;
                c2201341BDo4 = c2201341BDo5;
                if (c2201341BDo4 == null) {
                    break;
                } else {
                    c2201341BDo5 = c2201341BDo4.LIZ;
                }
            }
            c2201341BDo.LIZ = c2201341BDo2;
        }
        ((HashMap) C2204311BOz.LIZIZ).put("pia.postWorkerMessage", PiaPostWorkerMessageMethod.LIZ);
    }
}
