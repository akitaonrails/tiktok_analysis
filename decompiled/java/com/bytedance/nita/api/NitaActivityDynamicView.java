package com.bytedance.nita.api;

import X.AbstractC21264018Ji;
import X.C21263318Jb;
import X.C21263818Jg;
import X.C21263918Jh;
import X.EnumC21153717qJ;
import X.InterfaceC21263418Jc;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.nita.Nita$beginDynamicInflate$1;
import com.bytedance.nita.memory.MemoryManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public abstract class NitaActivityDynamicView extends AbstractC21264018Ji implements GenericLifecycleObserver {
    public Activity LLILLJJLI;
    public int LLILLL = 1;
    public LifecycleOwner LLILZ;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        String str = ((Nita$beginDynamicInflate$1) this).LLILZIL;
        Activity activity = this.LLILLJJLI;
        if (activity == null) {
            Intrinsics.LJIIL();
        }
        MemoryManager.LLJIJIL.getClass();
        MemoryManager.LJIIIZ(activity, str);
        this.LLILLJJLI = null;
        this.LLILZ = null;
    }

    @Override // X.InterfaceC21263418Jc
    public final int LIZJ() {
        return 0;
    }

    @Override // X.AbstractC21264018Ji, X.InterfaceC21263418Jc
    public final void LJII() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ComponentCallbacks2 componentCallbacks2 = this.LLILLJJLI;
        if (componentCallbacks2 == null) {
            throw new C21263818Jg(" dynamic use , please invoke withActivity first ");
        }
        if (this.LLILZ == null) {
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) componentCallbacks2;
            this.LLILZ = lifecycleOwner2;
            Lifecycle lifecycle2 = lifecycleOwner2.getLifecycle();
            if (lifecycle2 != null) {
                lifecycle2.addObserver(this);
            }
        }
        Nita$beginDynamicInflate$1 nita$beginDynamicInflate$1 = (Nita$beginDynamicInflate$1) this;
        InterfaceC21263418Jc interfaceC21263418Jc = C21263318Jb.LIZ.get(nita$beginDynamicInflate$1.LLILZIL);
        if (interfaceC21263418Jc != null && (interfaceC21263418Jc instanceof LifecycleObserver) && (lifecycleOwner = this.LLILZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver((LifecycleObserver) interfaceC21263418Jc);
        }
        C21263918Jh.LIZ(this);
        C21263918Jh.LJFF(this.LLILLJJLI, this.LLILLL, nita$beginDynamicInflate$1.LLILZIL);
    }

    @Override // X.InterfaceC21263418Jc
    public EnumC21153717qJ LIZLLL() {
        return EnumC21153717qJ.AT_ONCE;
    }
}
