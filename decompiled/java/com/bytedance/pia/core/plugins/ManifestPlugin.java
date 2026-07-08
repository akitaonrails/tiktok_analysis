package com.bytedance.pia.core.plugins;

import X.C1BO6;
import X.C1BPP;
import X.C20520915Rn;
import X.C2188811AlT;
import X.C2204041BNy;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes35.dex */
public class ManifestPlugin extends C1BO6 {
    public final AtomicReference<n> LIZJ;

    @Override // X.C1BO6
    public final String LIZ() {
        return "manifest";
    }

    @Override // X.C1BO6
    public final void LIZIZ() {
        Object objLIZJ;
        if (this.LIZIZ.LIZLLL.version.length() > 0) {
            C20520915Rn c20520915Rn = this.LIZIZ.LJIILIIL;
            c20520915Rn.getClass();
            try {
                objLIZJ = GsonUtils.LIZ().LIZJ(c20520915Rn.LIZIZ.LJJIIZ("manifest"), n.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1BPP.LIZJ(4, "[PageStorage]Get page info error:", th);
                objLIZJ = null;
            }
            n nVar = (n) objLIZJ;
            if (nVar == null) {
                return;
            }
            try {
                if (nVar.LJJIIZ("version").LJIL().equals(this.LIZIZ.LIZLLL.version)) {
                    nVar.LJJIFFI("from", new q("cache"));
                    LJI(nVar);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1BPP.LIZJ(4, "[Manifest] Get cached manifest version failed:", th2);
            }
        }
    }

    public ManifestPlugin(C2204041BNy c2204041BNy) {
        super(c2204041BNy);
        this.LIZJ = new AtomicReference<>(null);
    }

    public final void LJI(n nVar) {
        if (nVar == null) {
            return;
        }
        AtomicReference<n> atomicReference = this.LIZJ;
        while (!atomicReference.compareAndSet(null, nVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[manifest] use manifest:");
        sbLIZ.append(nVar);
        C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LJIIJJI("event-on-manifest-ready", nVar);
        C1BO6 c1bo6LJFF = this.LIZIZ.LJFF("pia_props");
        if (c1bo6LJFF instanceof PiaPropsPlugin) {
            ((PiaPropsPlugin) c1bo6LJFF).LIZJ.LJJIFFI("getManifest", new q(nVar.toString()));
        }
    }

    @Override // X.C1BO6
    public final void LJ(String str, Object... objArr) {
        if ("event-on-manifest-in-html-ready".equals(str)) {
            Object obj = objArr[0];
            if (obj instanceof n) {
                if (this.LIZIZ.LIZLLL.version.length() > 0) {
                    this.LIZIZ.LJIILIIL.LIZ(obj);
                }
                LJI((n) obj);
            }
        }
    }
}
