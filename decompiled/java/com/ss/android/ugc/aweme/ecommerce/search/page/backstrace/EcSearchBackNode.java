package com.ss.android.ugc.aweme.ecommerce.search.page.backstrace;

import X.C0QNB;
import X.C0QUI;
import X.C0QUK;
import X.InterfaceC420801kM;
import X.InterfaceC668950QLt;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchBackNode implements C0QUK, GenericLifecycleObserver {
    public final String LL;
    public final Function1<C0QUK, Unit> LLILLJJLI;
    public final WeakReference<C0QUI> LLILLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onNodeDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onNodeDestroy() {
        this.LLILLJJLI.invoke(this);
        C0QUI c0qui = this.LLILLL.get();
        if (c0qui != null) {
            c0qui.Ly(this);
        }
    }

    @Override // X.C0QUK
    public final C0QNB s0() {
        C0QUI c0qui = this.LLILLL.get();
        if (c0qui != null) {
            return c0qui.s0();
        }
        return null;
    }

    @Override // X.C0QUK
    public final String f1() {
        return this.LL;
    }

    public final InterfaceC420801kM LIZ(InterfaceC668950QLt interfaceC668950QLt) {
        C0QUI c0qui = this.LLILLL.get();
        if (c0qui != null) {
            return c0qui.fb(interfaceC668950QLt);
        }
        return null;
    }

    @Override // X.C0QUK
    public final boolean e1(C0QNB c0qnb) {
        C0QUI c0qui = this.LLILLL.get();
        if (c0qui != null) {
            return c0qui.e1(c0qnb);
        }
        return false;
    }

    @Override // X.C0QUK
    public final void g1(boolean z) {
        C0QUI c0qui = this.LLILLL.get();
        if (c0qui != null) {
            c0qui.Q4(z);
        }
    }

    public EcSearchBackNode(C0QUI c0qui, String str, AFwS241S0000000_10 aFwS241S0000000_10) {
        this.LL = str;
        this.LLILLJJLI = aFwS241S0000000_10;
        this.LLILLL = new WeakReference<>(c0qui);
        c0qui.OK(this);
    }
}
