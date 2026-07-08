package com.ss.android.ugc.aweme.account.login.v2.base;

import X.AbstractC19477911Ij;
import X.AbstractC19483511Kn;
import X.C11ID;
import X.C11J7;
import X.C11NN;
import X.C11PQ;
import X.C19483611Ko;
import X.EnumC19496911Pr;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes20.dex */
public final class MaybeBindLifeCycleTransformer<T> implements GenericLifecycleObserver {
    public final C11PQ<Integer> LL = new C11PQ<>();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            disposeRequest();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void disposeRequest() {
        this.LL.onNext(1);
    }

    public final C11ID<T> LIZ(AbstractC19483511Kn<T> abstractC19483511Kn) {
        final C11PQ<Integer> c11pq = this.LL;
        c11pq.getClass();
        final C11NN<T> c11nnLJLJLJ = new C11J7<T, T>(c11pq) { // from class: X.11Kw
            public final InterfaceC19483011Ki<? super T> LLILLJJLI = new InterfaceC19483011Ki() { // from class: X.0iM2
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    if (((Integer) obj).intValue() == 1) {
                        return true;
                    }
                    return false;
                }
            };

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C19484311Kv(interfaceC626120Oh8, this.LLILLJJLI));
            }
        }.LJLJLJ(EnumC19496911Pr.MISSING);
        final C19483611Ko c19483611Ko = (C19483611Ko) abstractC19483511Kn;
        return new AbstractC19477911Ij<T, T>(c19483611Ko, c11nnLJLJLJ) { // from class: X.11L8
            public final C11LE<U> LLILLJJLI;

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) {
                C11L9 c11l9 = new C11L9(c11ih);
                c11ih.onSubscribe(c11l9);
                this.LLILLJJLI.subscribe(c11l9.LLILLJJLI);
                this.LL.LIZ(c11l9);
            }

            {
                this.LLILLJJLI = c11nnLJLJLJ;
            }
        };
    }
}
