package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1BP0;
import X.C1BP1;
import X.C1BP6;
import X.C1BPO;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.bridge.methods.TracingGet;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes35.dex */
public final class TracingGet implements InterfaceC2204471BPp<Params, Result> {
    public static final C1BP1<Params, Result> LIZ = new C1BP1<>("pia.internal.tracing.get", C1BP0.All, new InterfaceC1537230q6b() { // from class: X.1BQI
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new TracingGet();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Params {

        @C09CT("resetBuffer")
        public boolean resetBuffer;
    }

    public static class Result {

        @C09CT("tracing")
        public final h tracing;

        public Result(h hVar) {
            this.tracing = hVar;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        Tracing tracing = c1bp6.LIZIZ.LJIILL;
        boolean z = ((Params) obj).resetBuffer;
        tracing.getClass();
        h hVarLJIIL = GsonProtectorUtils.toJsonTree(GsonUtils.LIZ(), tracing.LIZ).LJIIL();
        if (z) {
            ((ArrayList) tracing.LIZ).clear();
        }
        c1bpo.accept(new Result(hVarLJIIL));
    }
}
