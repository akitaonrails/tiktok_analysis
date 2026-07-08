package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1BP0;
import X.C1BP1;
import X.C1BP4;
import X.C1BP6;
import X.C1BPO;
import X.C1BQ0;
import X.C1BQX;
import X.C2204051BNz;
import X.C2204191BOn;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import com.bytedance.pia.core.bridge.methods.WorkerPostMessage;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: loaded from: classes35.dex */
public final class WorkerPostMessage implements InterfaceC2204471BPp<Params, Void> {
    public static final C1BP1<Params, Void> LIZ = new C1BP1<>("pia.internal.worker.postMessage", C1BP0.Render, new InterfaceC1537230q6b() { // from class: X.1BQK
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new WorkerPostMessage();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Params {

        @C09CT("message")
        public k message;

        @C09CT("worker")
        public String worker;
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        C1BP4 c1bp4;
        Params params = (Params) obj;
        k kVar = params.message;
        if (kVar != null && (kVar instanceof n)) {
            C2204051BNz c2204051BNz = c1bp6.LIZIZ;
            Object obj2 = c2204051BNz.get(params.worker);
            if ((obj2 instanceof C1BP4) && (c1bp4 = (C1BP4) obj2) != null && c1bp4.LIZ()) {
                c1bp4.LJFF.sendWorkerMessage(C1BQX.LIZIZ(params.message.LJIILIIL()));
                c1bpo.accept(null);
                return;
            } else {
                c2204431BPl.accept(new C2204191BOn(-10004));
                c2204051BNz.remove(params.worker);
                return;
            }
        }
        c2204431BPl.accept(new C1BQ0("Parameter 'message' is required!"));
    }
}
