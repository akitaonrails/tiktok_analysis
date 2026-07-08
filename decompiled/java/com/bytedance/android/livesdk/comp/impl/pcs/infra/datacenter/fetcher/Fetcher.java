package com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher;

import X.C01GW;
import X.C05YC;
import X.C189200o6;
import X.C23250099c;
import X.C357401a8;
import X.C357601aA;
import X.C357701aB;
import X.C357801aC;
import X.C358101aF;
import X.C452501pT;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174708fZ;
import X.InterfaceC346201Wa;
import X.InterfaceC362001as;
import X.InterfaceC497601wk;
import com.google.gson.n;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class Fetcher implements InterfaceC362001as {
    public final C01GW LIZ = C452501pT.LIZIZ(new C357701aB());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C357601aA());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C357801aC());

    public interface FetcherService {
        @InterfaceC1501160pAQ
        Object get(@InterfaceC2174708fZ String str, InterfaceC1364105Vn<? super C470590Icr<n>> interfaceC1364105Vn);
    }

    @Override // X.InterfaceC362001as
    public final void LIZ(String str) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZIZ.getValue(), null, null, new C357401a8(this, str, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.01aF] */
    @Override // X.InterfaceC362001as
    public final C358101aF LIZIZ(final String str) {
        final C05YC c05yc = (C05YC) this.LIZ.getValue();
        return new InterfaceC346201Wa<Pair<? extends String, ? extends C189200o6<? extends n>>>() { // from class: X.01aF
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super Pair<? extends String, ? extends C189200o6<? extends n>>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = c05yc.collect(new C358201aG(interfaceC346701Wf, str), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
    }
}
