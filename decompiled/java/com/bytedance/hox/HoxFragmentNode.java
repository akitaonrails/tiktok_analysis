package com.bytedance.hox;

import X.AbstractC1583720rJa;
import X.C01GW;
import X.C1583820rJk;
import X.C1583840rJm;
import X.C452501pT;
import X.InterfaceC1583770rJf;
import X.InterfaceC1583780rJg;
import X.InterfaceC1583830rJl;
import X.InterfaceC1583850rJn;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes25.dex */
public abstract class HoxFragmentNode extends AbstractC1583720rJa implements InterfaceC1583830rJl {
    public Fragment LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1583820rJk());

    @Override // X.InterfaceC1583830rJl
    public final List<InterfaceC1583850rJn> io1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1583720rJa
    public final void LJIILLIIL(InterfaceC1583780rJg interfaceC1583780rJg) {
        Fragment fragment;
        Lifecycle lifecycle;
        super.LJIILLIIL(interfaceC1583780rJg);
        if (!this.LLILZLL && (fragment = this.LLILZIL) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(this);
            this.LLILZLL = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C1583840rJm.LIZ(this, event);
    }

    @Override // X.AbstractC1583720rJa
    public final void LJIJJ(final AbstractC1583720rJa abstractC1583720rJa, final AbstractC1583720rJa abstractC1583720rJa2, final List<InterfaceC1583770rJf> list) {
        if (this.LLILZIL == null) {
            ((List) this.LLIZ.getValue()).add(new Runnable() { // from class: X.0rJi
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("HoxFragmentNode@ab89.notifyChildNodeVisibleChange$task$1");
                    try {
                        super/*X.0rJa*/.LJIJJ(abstractC1583720rJa, abstractC1583720rJa2, list);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("HoxFragmentNode@ab89.notifyChildNodeVisibleChange$task$1");
                }
            });
        } else {
            super.LJIJJ(abstractC1583720rJa, abstractC1583720rJa2, list);
        }
    }

    @Override // X.AbstractC1583720rJa
    public final void LJIJJLI(final AbstractC1583720rJa abstractC1583720rJa, final AbstractC1583720rJa abstractC1583720rJa2, final CopyOnWriteArrayList<InterfaceC1583770rJf> copyOnWriteArrayList) {
        if (this.LLILZIL == null) {
            ((List) this.LLIZ.getValue()).add(new Runnable() { // from class: X.0rJh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("HoxFragmentNode@ab89.notifyObservers$task$1");
                    try {
                        super/*X.0rJa*/.LJIJJLI(abstractC1583720rJa, abstractC1583720rJa2, copyOnWriteArrayList);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("HoxFragmentNode@ab89.notifyObservers$task$1");
                }
            });
        } else {
            super.LJIJJLI(abstractC1583720rJa, abstractC1583720rJa2, copyOnWriteArrayList);
        }
    }
}
