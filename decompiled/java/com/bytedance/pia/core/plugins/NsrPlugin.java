package com.bytedance.pia.core.plugins;

import X.C01CF;
import X.C01CG;
import X.C1B13;
import X.C1BO6;
import X.C20641415ps;
import X.C20641615pu;
import X.C2203961BNq;
import X.C2204041BNy;
import X.EnumC1287770jcF;
import X.InterfaceC1532650pzD;
import X.InterfaceC1535470q3l;
import com.bytedance.pia.core.PiaManifest;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class NsrPlugin extends C1BO6 {
    @Override // X.C1BO6
    public final String LIZ() {
        return "nsr";
    }

    @Override // X.C1BO6
    public final void LIZIZ() {
    }

    @Override // X.C1BO6
    public final InterfaceC1532650pzD LIZJ(InterfaceC1535470q3l interfaceC1535470q3l) {
        boolean z;
        C20641615pu c20641615pu = C20641615pu.LIZ;
        String string = interfaceC1535470q3l.getUrl().toString();
        C2204041BNy c2204041BNy = this.LIZIZ;
        c20641615pu.getClass();
        Gson gson = PiaManifest.LJI;
        PiaManifest piaManifestLIZ = C1B13.LIZ(c2204041BNy, string);
        if (piaManifestLIZ != null && piaManifestLIZ.LJFF) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2204041BNy.LJII.LIZJ(EnumC1287770jcF.NSR_HIT, 0);
            if (!C2203961BNq.LIZ().isNsrV1Enabled) {
                c2204041BNy.LJII.LIZ("nsr_render", 1007);
            } else {
                C20641415ps c20641415ps = C20641615pu.LIZIZ;
                c20641415ps.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                while ((!c20641415ps.LIZIZ.isEmpty()) && c20641415ps.LIZIZ.peek().getFirst().longValue() <= jCurrentTimeMillis) {
                    ((HashMap) c20641415ps.LIZ).remove(c20641415ps.LIZIZ.poll().getSecond());
                }
                C01CG c01cgLIZ = C01CF.LIZ(string);
                if (c01cgLIZ != null) {
                    Iterator it2 = ((HashMap) c20641415ps.LIZ).keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        C01CG c01cg = (C01CG) next;
                        if (Intrinsics.LJFF(c01cg.LIZ, c01cgLIZ.LIZ) && c01cgLIZ.LIZIZ.containsAll(c01cg.LIZIZ)) {
                            if (next != null) {
                                ((HashMap) c20641415ps.LIZ).get(next);
                            }
                        }
                    }
                }
                c2204041BNy.LJII.LIZ("nsr_render", 1008);
                return null;
            }
        }
        return null;
    }

    public NsrPlugin(C2204041BNy c2204041BNy, PiaManifest piaManifest) {
        super(c2204041BNy);
    }
}
