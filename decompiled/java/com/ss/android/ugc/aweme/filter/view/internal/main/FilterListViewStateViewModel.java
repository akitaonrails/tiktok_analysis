package com.ss.android.ugc.aweme.filter.view.internal.main;

import X.C11JF;
import X.C15438062q;
import X.C1701940uOG;
import X.C19487811Me;
import X.C2097908Jt;
import X.EnumC1641340soW;
import X.InterfaceC1639870sm9;
import X.InterfaceC1640160smc;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public final class FilterListViewStateViewModel extends HumbleViewModel implements InterfaceC1640160smc {
    public final Function0<InterfaceC1639870sm9> LL;
    public final MutableLiveData<Map<FilterBean, EnumC1641340soW>> LLILLJJLI;
    public List<? extends FilterBean> LLILLL;
    public C11JF LLILZ;
    public final AfS194S0100000_25 LLILZIL;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZ = null;
    }

    @Override // X.InterfaceC1640160smc
    public final MutableLiveData cK0() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1640160smc
    public final void w21(List<? extends FilterBean> list) {
        this.LLILLL = list;
        MutableLiveData<Map<FilterBean, EnumC1641340soW>> mutableLiveData = this.LLILLJJLI;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : (ArrayList) list) {
            linkedHashMap.put(obj, this.LL.invoke().LJIIJJI(((FilterBean) obj).getId()));
        }
        mutableLiveData.setValue(linkedHashMap);
        if ((!r8.isEmpty()) && !isDestroyed() && this.LLILZ == null) {
            this.LLILZ = (C11JF) this.LL.invoke().LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(this.LLILZIL, C19487811Me.LIZLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterListViewStateViewModel(LifecycleOwner lifecycleOwner, Function0<? extends InterfaceC1639870sm9> function0) {
        super(lifecycleOwner);
        this.LL = function0;
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILZIL = new AfS194S0100000_25(this, 5);
    }
}
