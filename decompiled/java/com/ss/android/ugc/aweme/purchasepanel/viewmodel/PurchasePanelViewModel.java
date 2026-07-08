package com.ss.android.ugc.aweme.purchasepanel.viewmodel;

import X.C01GW;
import X.C11NJ;
import X.C1615430s8j;
import X.C1BNE;
import X.C2252321DDq;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasePanelViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final C01GW LLILLL;
    public final C11NJ LLILZ;

    public PurchasePanelViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1615430s8j(0));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(610));
        this.LLILZ = new C11NJ();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZ.dispose();
    }
}
