package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1BP0;
import X.C1BP1;
import X.C1BP6;
import X.C1BPO;
import X.C1BQ0;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import com.bytedance.pia.core.bridge.methods.CacheUpdateManifestMethod;
import com.google.gson.n;

/* JADX INFO: loaded from: classes35.dex */
public final class CacheUpdateManifestMethod implements InterfaceC2204471BPp<Params, Void> {
    public static final C1BP1<Params, Void> LIZ = new C1BP1<>("pia.internal.cache.updateManifest", C1BP0.All, new InterfaceC1537230q6b() { // from class: X.1BQG
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new CacheUpdateManifestMethod();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Params {

        @C09CT("manifest")
        public n manifest;
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        n nVar = ((Params) obj).manifest;
        if (nVar == null) {
            c2204431BPl.accept(new C1BQ0("'manifest' must bu not null!"));
        } else {
            c1bp6.LIZIZ.LJIILIIL.LIZ(nVar);
            c1bpo.accept(null);
        }
    }
}
