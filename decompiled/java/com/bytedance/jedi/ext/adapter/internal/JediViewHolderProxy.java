package com.bytedance.jedi.ext.adapter.internal;

import X.C01GW;
import X.C11DL;
import X.C11E6;
import X.C19465511Dp;
import X.C452501pT;
import X.InterfaceC19465811Ds;
import X.InterfaceC874803bO;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.JediViewHolderProxyViewModelStore;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class JediViewHolderProxy implements C11E6, C11DL, InterfaceC19465811Ds, GenericLifecycleObserver {
    public JediViewHolder LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LL = true;
    public final C01GW<JediViewHolderProxyViewModelStore> LLILZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(31));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 44));

    @Override // X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.LLILZIL = false;
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLIZ.getValue();
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        if (this.LLILLL) {
            return null;
        }
        return this.LLILLJJLI;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (this.LLILLL || this.LLILLJJLI == null) {
            return;
        }
        this.LL = true;
        if (this.LLILZLL) {
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.LLILLL || this.LLILLJJLI == null) {
            return;
        }
        this.LL = true;
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Proxy@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("(holder@");
        JediViewHolder jediViewHolder = this.LLILLJJLI;
        sb.append(jediViewHolder != null ? Integer.toHexString(jediViewHolder.hashCode()) : null);
        sb.append(",detached:");
        sb.append(this.LLILLL);
        sb.append(",state:");
        sb.append(getLifecycleRegistry().getCurrentState());
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        if (this.LLILZ.isInitialized()) {
            this.LLILZ.getValue().clear();
        }
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC19465811Ds
    public final boolean O61() {
        return this.LL;
    }

    public final void LIZ(C19465511Dp c19465511Dp, JediViewHolder jediViewHolder) {
        if (jediViewHolder != null) {
            this.LLILLJJLI = jediViewHolder;
            jediViewHolder.LLILZLL = this;
            this.LLILLL = false;
            c19465511Dp.getClass();
            if (c19465511Dp.LIZLLL.add(this)) {
                c19465511Dp.LIZ.addObserver(this);
                return;
            }
            return;
        }
        this.LLILLJJLI = null;
    }
}
