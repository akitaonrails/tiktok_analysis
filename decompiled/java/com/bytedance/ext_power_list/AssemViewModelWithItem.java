package com.bytedance.ext_power_list;

import X.AbstractC724260Sb2;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AssemViewModelWithItem<S extends InterfaceC0148002o, ITEM> extends AssemViewModel<S> {
    public ITEM item;
    public AbstractC724260Sb2 proxy;

    public final ITEM getItem() {
        ITEM item;
        AbstractC724260Sb2 abstractC724260Sb2 = this.proxy;
        if (abstractC724260Sb2 == null || (item = (ITEM) abstractC724260Sb2.LL) == null) {
            return null;
        }
        return item;
    }

    public final AbstractC724260Sb2 getProxy() {
        return this.proxy;
    }

    public final void setItem(ITEM item) {
        this.item = item;
    }

    public final void setProxy(AbstractC724260Sb2 abstractC724260Sb2) {
        this.proxy = abstractC724260Sb2;
    }
}
