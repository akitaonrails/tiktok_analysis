package com.ss.android.ugc.aweme.ecommerce.search.page.ai;

import X.AbstractC1156400gCM;
import X.AnonymousClass0956;
import X.C1205700hTs;
import X.C1205730hTv;
import X.C1205760hTy;
import X.C1209000hZC;
import X.C2097608Jq;
import X.C2129108Vt;
import X.C23250099c;
import X.InterfaceC0148002o;
import X.InterfaceC346201Wa;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class EcAISearchViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final NextLiveData<n> LL;
    public final NextLiveData<n> LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public final List<n> LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public final NextLiveData<C1205760hTy> LLJI;
    public final NextLiveData<C1205760hTy> LLJIJIL;
    public boolean LLJILJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1209000hZC(0);
    }

    public EcAISearchViewModel() {
        NextLiveData<n> nextLiveData = new NextLiveData<>();
        this.LL = nextLiveData;
        this.LLILLJJLI = nextLiveData;
        this.LLILLL = new MutableLiveData<>(Boolean.FALSE);
        this.LLILZ = new ArrayList();
        NextLiveData<C1205760hTy> nextLiveData2 = new NextLiveData<>();
        this.LLJI = nextLiveData2;
        this.LLJIJIL = nextLiveData2;
    }

    public static n vQ2(List list) {
        n nVar = new n();
        nVar.LJJIII(0, "status_code");
        h hVar = new h();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hVar.LJJIFFI((k) it2.next());
        }
        nVar.LJJIFFI("data", hVar);
        return nVar;
    }

    public final void wQ2(n nVar) {
        if (Intrinsics.LJFF(this.LLILLL.getValue(), Boolean.TRUE)) {
            this.LL.postValue(nVar);
        } else {
            ((ArrayList) this.LLILZ).add(nVar);
        }
    }

    public final void xQ2(String str, Function2<? super C1205700hTs, ? super String, ? extends InterfaceC346201Wa<? extends AbstractC1156400gCM<n>>> function2) {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C2129108Vt.LIZ.clear();
        this.LLJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1205730hTv(this, str, function2, null), 3);
    }

    public static void yQ2(EcAISearchViewModel ecAISearchViewModel, String str, Map map, int i) {
        Map mapLJ;
        Map mapLJ2 = map;
        if ((i & 2) != 0) {
            mapLJ2 = C2097608Jq.LJ();
        }
        if ((i & 4) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if (ecAISearchViewModel.LLJILJIL) {
            ecAISearchViewModel.LLJI.postValue(new C1205760hTy(str, mapLJ2, mapLJ, SystemClock.elapsedRealtime()));
        }
    }
}
