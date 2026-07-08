package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1BP0;
import X.C1BP1;
import X.C1BP4;
import X.C1BP6;
import X.C1BPO;
import X.C1BQ0;
import X.C2204051BNz;
import X.C2204191BOn;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import android.text.TextUtils;
import com.bytedance.pia.core.bridge.methods.WorkerTerminate;

/* JADX INFO: loaded from: classes35.dex */
public final class WorkerTerminate implements InterfaceC2204471BPp<Params, Void> {
    public static final C1BP1<Params, Void> LIZ = new C1BP1<>("pia.internal.worker.terminate", C1BP0.Render, new InterfaceC1537230q6b() { // from class: X.1BQM
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new WorkerTerminate();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Params {

        @C09CT("worker")
        public String worker;
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        C1BP4 c1bp4;
        Params params = (Params) obj;
        if (TextUtils.isEmpty(params.worker)) {
            c2204431BPl.accept(new C1BQ0("Parameter 'worker' is required!"));
            return;
        }
        C2204051BNz c2204051BNz = c1bp6.LIZIZ;
        Object obj2 = c2204051BNz.get(params.worker);
        if ((obj2 instanceof C1BP4) && (c1bp4 = (C1BP4) obj2) != null) {
            c1bp4.LJFF(null);
            c2204051BNz.remove(params.worker);
            c1bpo.accept(null);
            return;
        }
        c2204431BPl.accept(new C2204191BOn(-10004));
    }
}
