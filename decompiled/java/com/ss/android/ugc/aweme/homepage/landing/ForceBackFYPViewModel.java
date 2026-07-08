package com.ss.android.ugc.aweme.homepage.landing;

import X.AbstractC2252651DEx;
import X.AnonymousClass0956;
import X.C01GW;
import X.C09JN;
import X.C0PEM;
import X.C11JF;
import X.C1701940uOG;
import X.C1DFH;
import X.C2147408bA;
import X.C2147708bD;
import X.C2214201BlK;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ForceBackFYPViewModel extends ViewModel {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final HomeTabViewModel LL;
    public final Hox LLILLJJLI;
    public final AbstractC2252651DEx LLILLL;
    public final long LLILZ;
    public C11JF LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public final C01GW LLIZ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C11JF c11jf = this.LLILZIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public ForceBackFYPViewModel(HomeTabViewModel homeTabViewModel, Hox hox) {
        C1DFH c1dfh = C0PEM.LIZ;
        long jLongValue = ((Number) C2147708bD.LIZ.getValue()).longValue();
        this.LL = homeTabViewModel;
        this.LLILLJJLI = hox;
        this.LLILLL = c1dfh;
        this.LLILZ = jLongValue;
        this.LLIZ = C452501pT.LIZIZ(new C2147408bA(this));
        this.LLILZIL = (C11JF) C2214201BlK.LIZLLL().LJL(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.08b9
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ForceBackFYPViewModel@d6ab.subscribeAppBackground$1");
                Boolean bool = (Boolean) obj;
                AnonymousClass0956 anonymousClass0956 = this.LL.LLILZLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                if (bool.booleanValue()) {
                    List list = (List) this.LL.LLIZ.getValue();
                    ForceBackFYPViewModel forceBackFYPViewModel = this.LL;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (forceBackFYPViewModel.LLILLJJLI.KQ2((String) it2.next())) {
                                ForceBackFYPViewModel forceBackFYPViewModel2 = this.LL;
                                forceBackFYPViewModel2.LLILZLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(forceBackFYPViewModel2), forceBackFYPViewModel2.LLILLL, null, new C2147108b7(forceBackFYPViewModel2.LLILZ, forceBackFYPViewModel2, null), 2);
                                break;
                            }
                        }
                    }
                }
                C1C7U.LIZIZ("ForceBackFYPViewModel@d6ab.subscribeAppBackground$1");
            }
        });
    }
}
