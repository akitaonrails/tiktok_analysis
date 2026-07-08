package com.ss.android.ugc.aweme.account.org.create;

import X.AbstractC752290Tf9;
import X.AnonymousClass0951;
import X.C095G;
import X.C09IC;
import X.C0PEM;
import X.C1682590tt3;
import X.C1682600tt4;
import X.C1BNE;
import X.C1DEK;
import X.C2252321DDq;
import X.C23250099c;
import X.InterfaceC346201Wa;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: loaded from: classes26.dex */
public final class OrgAccountsListViewModel extends ViewModel {
    public final C1DEK LL;
    public final InterfaceC346201Wa<AbstractC752290Tf9> LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final AnonymousClass0951 LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public String LLIZ;

    public OrgAccountsListViewModel() {
        C1DEK c1dekLIZ = C095G.LIZ(0, null, 7);
        this.LL = c1dekLIZ;
        this.LLILLJJLI = C09IC.LJJIIJ(c1dekLIZ);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(C1682600tt4.LIZ);
        this.LLILZIL = c2252321DDqLIZ2;
        this.LLILZLL = c2252321DDqLIZ2;
    }

    public final void vQ2() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1682590tt3(this, null), 2);
    }
}
