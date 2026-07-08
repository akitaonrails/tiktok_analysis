package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1BO6;
import X.C1BP0;
import X.C1BP1;
import X.C1BP6;
import X.C1BPO;
import X.C2204041BNy;
import X.C2204191BOn;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import com.bytedance.pia.core.bridge.methods.BootGet;
import com.bytedance.pia.core.plugins.BootPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;

/* JADX INFO: loaded from: classes35.dex */
public final class BootGet implements InterfaceC2204471BPp<Void, Result> {
    public static final C1BP1<Void, Result> LIZ = new C1BP1<>("pia.internal.boot.get", C1BP0.All, new InterfaceC1537230q6b() { // from class: X.1BQF
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new BootGet();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Result {

        @C09CT("results")
        public h results;

        public Result(h hVar) {
            this.results = hVar;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        try {
            C1BO6 c1bo6LJFF = ((C2204041BNy) c1bp6.LIZIZ).LJFF("boot");
            if (c1bo6LJFF instanceof BootPlugin) {
                c1bpo.accept(new Result(((BootPlugin) c1bo6LJFF).LIZJ));
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2204431BPl.accept(new C2204191BOn(th.toString()));
        }
        c2204431BPl.accept(new C2204191BOn());
    }
}
