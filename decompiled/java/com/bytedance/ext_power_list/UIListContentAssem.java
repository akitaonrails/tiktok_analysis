package com.bytedance.ext_power_list;

import X.AbstractC329610Cw3;
import X.C20603715jn;
import X.C2217401BqU;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ext_power_list.AssemListViewModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class UIListContentAssem<VM extends AssemListViewModel<?, ?, ?>> extends UIContentAssem {
    public abstract ViewOnAttachStateChangeListenerC20604515jv Go();

    public abstract C20603715jn Ho();

    /* JADX INFO: renamed from: Jo */
    public abstract VM ip();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Go().setListConfig(Ho());
        final AssemListViewModel assemListViewModelJo = ip();
        assemListViewModelJo.setListState(Go().getState());
        Go().LJIIL((AbstractC329610Cw3) new C2217401BqU(assemListViewModelJo) { // from class: X.0Dam
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
    }
}
