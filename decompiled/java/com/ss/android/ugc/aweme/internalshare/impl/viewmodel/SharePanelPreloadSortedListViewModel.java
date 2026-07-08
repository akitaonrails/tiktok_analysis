package com.ss.android.ugc.aweme.internalshare.impl.viewmodel;

import X.C099G;
import X.C0PEM;
import X.C1361760lXa;
import X.C1363810lat;
import X.C1363820lau;
import X.C1364460lbw;
import X.C1364850lcZ;
import X.C1366160leg;
import X.C1368260li4;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelPreloadSortedListViewModel extends ViewModel {
    public C099G LL;
    public boolean LLILLJJLI;
    public C1366160leg LLILLL;
    public final RecyclerView.RecycledViewPool LLILZ = new RecyclerView.RecycledViewPool();
    public Integer LLILZIL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILZ.clear();
    }

    public final void vQ2(String str, Function1<? super List<IMContact>, Unit> function1) {
        C1366160leg c1366160leg = this.LLILLL;
        if (c1366160leg != null) {
            c1366160leg.LIZIZ("view_attached");
        }
        C1361760lXa.LIZ.put("im_data_load_latency", new C1364460lbw(System.currentTimeMillis(), 2));
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ.LLIILII(), null, new C1363820lau(this, str, function1, null), 2);
    }

    public final void wQ2(C1368260li4 c1368260li4, C1364850lcZ c1364850lcZ) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C099G c099g = this.LL;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        C1366160leg c1366160leg = this.LLILLL;
        if (c1366160leg != null) {
            c1366160leg.LIZJ();
        }
        this.LLILLL = new C1366160leg();
        this.LL = C23250099c.LIZIZ(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1363810lat(c1364850lcZ, c1368260li4, this, jCurrentTimeMillis, null), 2);
    }
}
