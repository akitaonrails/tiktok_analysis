package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.AbstractC1028360crq;
import X.C356901a3;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class AdHybridContainerManager$putContainerInstanceToCache$1$observer$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ ComponentActivity LL;
    public final /* synthetic */ AdHybridContainerManager LLILLJJLI;
    public final /* synthetic */ AbstractC1028360crq LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Object next;
        this.LL.getLifecycle().removeObserver(this);
        AdHybridContainerManager adHybridContainerManager = this.LLILLJJLI;
        AbstractC1028360crq abstractC1028360crq = this.LLILLL;
        Iterator it2 = ((LinkedHashMap) adHybridContainerManager.LIZ).entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Map.Entry) next).getValue() == abstractC1028360crq) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            adHybridContainerManager.LIZ.remove(entry.getKey());
            abstractC1028360crq.LJIJJLI();
            abstractC1028360crq.LJIIIIZZ();
        }
    }

    public AdHybridContainerManager$putContainerInstanceToCache$1$observer$1(ComponentActivity componentActivity, AdHybridContainerManager adHybridContainerManager, AbstractC1028360crq abstractC1028360crq) {
        this.LL = componentActivity;
        this.LLILLJJLI = adHybridContainerManager;
        this.LLILLL = abstractC1028360crq;
    }
}
