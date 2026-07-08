package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C09IR;
import X.C0D0E;
import X.C0D0J;
import X.C0D16;
import X.C0D1E;
import X.C0D27;
import X.C0D3K;
import X.C0D4G;
import X.C0D5X;
import X.C1BNE;
import X.C2097608Jq;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C331730CzT;
import X.C331930Czn;
import X.C332760D2s;
import X.C332920D3i;
import X.C332930D3j;
import X.C332940D3k;
import X.InterfaceC331700CzQ;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class OnestepCheckoutViewModel extends ViewModel {
    public final C332920D3i LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;
    public final AnonymousClass0950 LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public C332760D2s LLIZLLLIL;
    public C0D3K LLJ;
    public CheckoutIntent LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public C0D5X LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public Map<String, String> LLJJI;

    public OnestepCheckoutViewModel() {
        C332920D3i c332920D3i = new C332920D3i(new C331730CzT(new C0D0J(), new C0D16(0), new C0D1E(), new C331930Czn(), C0D0E.LJ.LIZ(), new InterfaceC331700CzQ() { // from class: X.0Czk
            /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0135 A[PHI: r6
              0x0135: PHI (r6v7 com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto) = 
              (r6v2 com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto)
              (r6v5 com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto)
              (r6v12 com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto)
             binds: [B:77:0x012f, B:73:0x0123, B:62:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC331700CzQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0D3K LIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r24, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r25, java.lang.String r26, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData r27) {
                /*
                    Method dump skipped, instruction units count: 353
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C331900Czk.LIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, java.lang.String, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData):X.0D3K");
            }
        }), ViewModelKt.getViewModelScope(this));
        this.LL = c332920D3i;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C0D4G.LIZ);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILZ = c2252331DDrLIZIZ;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLILZLL = c332920D3i.LJ;
        this.LLIZ = c332920D3i.LJFF;
        this.LLJIJIL = 1;
        this.LLJJI = C2097608Jq.LJ();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C332930D3j(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C332940D3k(this, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C332920D3i c332920D3i = this.LL;
        C0D27<C0D3K> c0d27 = c332920D3i.LJIIJJI.LJFF;
        if (c0d27 != null) {
            c0d27.LIZ();
        }
        c332920D3i.LJIIIZ.LJ.LIZ();
        AnonymousClass0956 anonymousClass0956 = c332920D3i.LJIIJ.LJIIJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }
}
