package com.bytedance.pia.page.bridge;

import X.C09CT;
import X.C1BO6;
import X.C1BOX;
import X.C1BP0;
import X.C1BP1;
import X.C1BP4;
import X.C1BP6;
import X.C1BPO;
import X.C1BPP;
import X.C1BQ0;
import X.C2188811AlT;
import X.C2204041BNy;
import X.C2204191BOn;
import X.C2204361BPe;
import X.C2204431BPl;
import X.EnumC2204371BPf;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import com.bytedance.pia.core.plugins.PrefetchPlugin;
import com.bytedance.pia.page.bridge.PiaPostWorkerMessageMethod;
import kotlin.Unit;

/* JADX INFO: loaded from: classes35.dex */
public final class PiaPostWorkerMessageMethod implements InterfaceC2204471BPp<Params, Unit> {
    public static final C1BP1<Params, Unit> LIZ = new C1BP1<>("pia.postWorkerMessage", C1BP0.Render, new InterfaceC1537230q6b() { // from class: X.1BPt
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new PiaPostWorkerMessageMethod();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static final class Params {

        @C09CT("data")
        public final String data;

        public Params(String str) {
            this.data = str;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        PrefetchPlugin prefetchPlugin;
        C1BOX c1box;
        C1BP4 c1bp4;
        EnumC2204371BPf enumC2204371BPf;
        Params params = (Params) obj;
        if (params.data == null) {
            c2204431BPl.accept(new C1BQ0("Parameter 'data' requested!"));
            return;
        }
        C1BO6 c1bo6LJFF = ((C2204041BNy) c1bp6.LIZIZ).LJFF("prefetch");
        if ((c1bo6LJFF instanceof PrefetchPlugin) && (prefetchPlugin = (PrefetchPlugin) c1bo6LJFF) != null && (c1box = prefetchPlugin.LIZLLL) != null && (c1bp4 = c1box.LIZIZ) != null && (enumC2204371BPf = c1bp4.LJIJJLI) != null) {
            int i = C2204361BPe.LIZ[enumC2204371BPf.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        c2204431BPl.accept(new C2204191BOn("{\"state\":\"terminate\"}"));
                        return;
                    }
                } else {
                    c2204431BPl.accept(new C2204191BOn("{\"state\":\"fetching\"}"));
                    return;
                }
            } else {
                String str = params.data;
                if (c1bp4.LIZ()) {
                    c1bp4.LJIILIIL.postMessage(str);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1bp4.LJII);
                    sbLIZ.append("Post message to worker (Message: ");
                    sbLIZ.append(str);
                    sbLIZ.append(")");
                    C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
                }
                c1bpo.accept(Unit.LIZ);
                return;
            }
        }
        c2204431BPl.accept(new C2204191BOn("{\"state\":\"unusable\"}"));
    }
}
