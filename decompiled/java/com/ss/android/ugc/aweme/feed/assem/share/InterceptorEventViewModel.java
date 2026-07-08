package com.ss.android.ugc.aweme.feed.assem.share;

import X.AbstractC608770NuF;
import X.C0202004q;
import X.C0PEM;
import X.C14EU;
import X.C1697810uHb;
import X.C1865840yec;
import X.C1DFH;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C23250099c;
import X.C581630MrZ;
import X.C608760NuE;
import X.C608790NuH;
import X.C608800NuI;
import X.C608820NuK;
import X.C608840NuM;
import X.C622680Oba;
import X.C737030Svd;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes10.dex */
public final class InterceptorEventViewModel extends FeedBaseViewModel<C0202004q> {
    public final Map<Integer, AbstractC608770NuF> LL = new LinkedHashMap();
    public final Map<Integer, AbstractC608770NuF> LLILLJJLI = new LinkedHashMap();
    public int LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0202004q(0);
    }

    public InterceptorEventViewModel() {
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C1865840yec.LIZ()) {
            InterfaceC497601wk assemVMScope = getAssemVMScope();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C608840NuM(this, null), 2);
        }
    }

    @C14EU
    public final void onDiggStartEvent(C737030Svd c737030Svd) {
        String str;
        if (c737030Svd != null && c737030Svd.LIZ == 1301) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0) {
                C608820NuK c608820NuK = new C608820NuK();
                c608820NuK.LIZ = 0;
                c608820NuK.LIZIZ = str;
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C608760NuE(c608820NuK, this, null), 2);
            }
        }
    }

    @C14EU
    public final void onPlayStatusEvent(C581630MrZ c581630MrZ) {
        if (c581630MrZ == null || c581630MrZ.LIZ != 7) {
            return;
        }
        C608820NuK c608820NuK = new C608820NuK();
        c608820NuK.LIZ = 1;
        c608820NuK.LIZIZ = c581630MrZ.LIZIZ;
        c608820NuK.LIZJ = c581630MrZ;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C608760NuE(c608820NuK, this, null), 2);
    }

    public final void wQ2(Map<Integer, AbstractC608770NuF> map) {
        SortedMap sortedMapLIZLLL = C2097908Jt.LIZLLL(new Comparator() { // from class: X.0NuJ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List<Integer> list = AbstractC608770NuF.LIZJ;
                return list.indexOf(obj) - list.indexOf(obj2);
            }
        }, map);
        map.clear();
        map.putAll(sortedMapLIZLLL);
        ArrayList arrayList = new ArrayList(map.values());
        if (arrayList.size() > this.LLILLL) {
            this.LLILLL = arrayList.size();
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC608770NuF abstractC608770NuF = (AbstractC608770NuF) obj;
                    abstractC608770NuF.LIZ = null;
                    if (i > 0) {
                        ((AbstractC608770NuF) ListProtector.get(arrayList, i - 1)).LIZ = abstractC608770NuF;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void vQ2(int i, AbstractC608770NuF abstractC608770NuF) {
        if (abstractC608770NuF == null) {
            return;
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C608790NuH(i, this, abstractC608770NuF, null), 2);
    }

    public final void xQ2(int i, AbstractC608770NuF abstractC608770NuF) {
        if (abstractC608770NuF == null) {
            return;
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C608800NuI(i, this, abstractC608770NuF, null), 2);
    }
}
