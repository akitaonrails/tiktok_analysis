package com.bytedance.pia.core.plugins;

import X.C1BO6;
import X.C1BO8;
import X.C2204041BNy;
import X.C2204191BOn;
import X.InterfaceC1530550pvp;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class RenderingPlugin extends C1BO6 {
    public final Map<String, ?> LIZJ;
    public final InterfaceC1530550pvp<Map<String, ?>> LIZLLL;
    public final InterfaceC1530550pvp<C2204191BOn> LJ;

    @Override // X.C1BO6
    public final String LIZ() {
        return "rendering";
    }

    public RenderingPlugin(C2204041BNy c2204041BNy, C1BO8 c1bo8) {
        super(c2204041BNy);
        this.LIZJ = c1bo8.LIZ;
        this.LIZLLL = c1bo8.LIZIZ;
        this.LJ = c1bo8.LIZJ;
    }

    @Override // X.C1BO6
    public final void LJ(String str, Object... objArr) {
        if (!"event-on-manifest-error".equals(str) && !"event-on-html-error".equals(str)) {
            if ("event-on-manifest-ready".equals(str)) {
                Object obj = objArr[0];
                if (obj instanceof n) {
                    try {
                        n nVar = (n) obj;
                        if (!nVar.LJJIJIIJIL("rendering")) {
                            this.LJ.accept(new C2204191BOn("'rendering' is required!"));
                            return;
                        }
                        n nVarLJIILIIL = nVar.LJJIIZ("rendering").LJIILIIL();
                        if (this.LIZJ != null) {
                            nVarLJIILIIL.LJJIFFI("params", GsonUtils.LIZ().LJIJJLI(this.LIZJ));
                        }
                        this.LIZIZ.LJIJJ.LIZIZ(new InterfaceC1530550pvp<n>() { // from class: X.1BO9
                            @Override // X.InterfaceC1530550pvp
                            public final void accept(n nVar2) {
                                this.LIZ.LIZLLL.accept((Map<String, ?>) GsonProtectorUtils.fromJson(GsonUtils.LIZ(), (k) nVar2, Map.class));
                            }
                        }, new InterfaceC1530550pvp<C2204191BOn>() { // from class: X.1BOD
                            @Override // X.InterfaceC1530550pvp
                            public final void accept(C2204191BOn c2204191BOn) {
                                this.LIZ.LJ.accept(c2204191BOn);
                            }
                        }, nVarLJIILIIL, "pia.internal.worker.runTask");
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LJ.accept(new C2204191BOn(th.toString()));
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.LJ.accept(new C2204191BOn("Request manifest error!"));
    }
}
