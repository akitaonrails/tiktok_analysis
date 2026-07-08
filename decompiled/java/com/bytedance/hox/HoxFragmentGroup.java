package com.bytedance.hox;

import X.AbstractC1583710rJZ;
import X.AbstractC1583720rJa;
import X.C01GW;
import X.C1583810rJj;
import X.C1583840rJm;
import X.C452501pT;
import X.InterfaceC1583770rJf;
import X.InterfaceC1583780rJg;
import X.InterfaceC1583830rJl;
import X.InterfaceC1583850rJn;
import Y.ARunnableS32S0400000_24;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes25.dex */
public abstract class HoxFragmentGroup extends AbstractC1583710rJZ implements InterfaceC1583830rJl {
    public Fragment LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1583810rJj());

    @Override // X.InterfaceC1583830rJl
    public final List<InterfaceC1583850rJn> io1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1583720rJa
    public final void LJIILLIIL(InterfaceC1583780rJg interfaceC1583780rJg) {
        Fragment fragment;
        Lifecycle lifecycle;
        super.LJIILLIIL(interfaceC1583780rJg);
        if (!this.LLJIJIL && (fragment = this.LLJI) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(this);
            this.LLJIJIL = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C1583840rJm.LIZ(this, event);
    }

    @Override // X.AbstractC1583720rJa
    public final void LJIJJ(AbstractC1583720rJa abstractC1583720rJa, AbstractC1583720rJa abstractC1583720rJa2, List<InterfaceC1583770rJf> list) {
        if (this.LLJI == null) {
            ((List) this.LLJILJIL.getValue()).add(new ARunnableS32S0400000_24(this, abstractC1583720rJa, abstractC1583720rJa2, list, 1));
        } else {
            super.LJIJJ(abstractC1583720rJa, abstractC1583720rJa2, list);
        }
    }

    @Override // X.AbstractC1583720rJa
    public final void LJIJJLI(AbstractC1583720rJa abstractC1583720rJa, AbstractC1583720rJa abstractC1583720rJa2, CopyOnWriteArrayList<InterfaceC1583770rJf> copyOnWriteArrayList) {
        if (this.LLJI == null) {
            ((List) this.LLJILJIL.getValue()).add(new ARunnableS32S0400000_24(this, abstractC1583720rJa, abstractC1583720rJa2, copyOnWriteArrayList, 2));
        } else {
            super.LJIJJLI(abstractC1583720rJa, abstractC1583720rJa2, copyOnWriteArrayList);
        }
    }
}
