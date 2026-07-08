package com.ss.android.ugc.aweme.filter.view.internal.main;

import X.C11JF;
import X.C1453230nv7;
import X.C1640210smh;
import X.C1701940uOG;
import X.C19487811Me;
import X.InterfaceC1639870sm9;
import X.InterfaceC1640170smd;
import X.InterfaceC1640220smi;
import X.InterfaceC1640280smo;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class FilterListViewSelectionViewModel extends HumbleViewModel implements InterfaceC1640170smd {
    public final Function0<InterfaceC1639870sm9> LL;
    public final InterfaceC1640280smo LLILLJJLI;
    public final InterfaceC1640220smi LLILLL;
    public final MutableLiveData<C1640210smh> LLILZ;
    public C1640210smh LLILZIL;
    public C11JF LLILZLL;
    public final ArrayList<Function1<FilterBean, Boolean>> LLIZ;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1640170smd
    public final void Qm() {
        InterfaceC1640220smi interfaceC1640220smi = this.LLILLL;
        if (interfaceC1640220smi != null) {
            interfaceC1640220smi.Qm();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11JF c11jf = this.LLILZLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZLL = null;
    }

    @Override // X.InterfaceC1640170smd
    public final MutableLiveData AM2() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1640170smd
    public final void uA(C1640210smh c1640210smh) {
        FilterBean filterBean = c1640210smh.LIZ;
        if (filterBean == null) {
            vQ2(new C1640210smh((FilterBean) null, c1640210smh.LIZIZ, c1640210smh.LIZJ, 8));
        } else if (C1453230nv7.LJIIIZ(filterBean, this.LL.invoke())) {
            vQ2(c1640210smh);
        } else {
            this.LLILZIL = new C1640210smh(c1640210smh.LIZIZ, c1640210smh.LIZ, c1640210smh.LIZJ, true);
            ArrayList<Function1<FilterBean, Boolean>> arrayList = this.LLIZ;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                this.LL.invoke().LJFF(filterBean);
            } else {
                Iterator<Function1<FilterBean, Boolean>> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (it2.next().invoke(filterBean).booleanValue()) {
                        break;
                    }
                }
                this.LL.invoke().LJFF(filterBean);
            }
        }
        if (this.LLILZIL != null && !isDestroyed() && this.LLILZLL == null) {
            this.LLILZLL = (C11JF) this.LL.invoke().LJJIFFI().LJI(1000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 201), C19487811Me.LIZLLL);
        }
    }

    public final void vQ2(C1640210smh c1640210smh) {
        InterfaceC1640280smo interfaceC1640280smo;
        this.LLILZIL = null;
        this.LLILZ.setValue(c1640210smh);
        FilterBean filterBean = c1640210smh.LIZ;
        if (filterBean != null && (interfaceC1640280smo = this.LLILLJJLI) != null) {
            interfaceC1640280smo.LIZJ(filterBean, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterListViewSelectionViewModel(LifecycleOwner lifecycleOwner, Function0<? extends InterfaceC1639870sm9> function0, InterfaceC1640280smo interfaceC1640280smo, InterfaceC1640220smi interfaceC1640220smi) {
        super(lifecycleOwner);
        this.LL = function0;
        this.LLILLJJLI = interfaceC1640280smo;
        this.LLILLL = interfaceC1640220smi;
        this.LLILZ = new MutableLiveData<>();
        this.LLIZ = new ArrayList<>();
    }
}
