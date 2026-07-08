package com.ss.android.ugc.nearby.container;

import X.InterfaceC1055110dYz;
import X.InterfaceC1204310hRd;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyLifecycleManager implements InterfaceC1055110dYz {
    public static final NearbyLifecycleManager LL = new NearbyLifecycleManager();
    public static final List<InterfaceC1204310hRd> LLILLJJLI = new CopyOnWriteArrayList();
    public static boolean LLILLL;

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        LLILLL = false;
        Iterator<InterfaceC1204310hRd> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onNodeHide(bundle);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        LLILLL = true;
        Iterator<InterfaceC1204310hRd> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onNodeShow(bundle);
        }
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, final InterfaceC1204310hRd interfaceC1204310hRd) {
        ((CopyOnWriteArrayList) LLILLJJLI).add(interfaceC1204310hRd);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.nearby.container.NearbyLifecycleManager$addLifecycleListener$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    NearbyLifecycleManager nearbyLifecycleManager = NearbyLifecycleManager.LL;
                    ((CopyOnWriteArrayList) NearbyLifecycleManager.LLILLJJLI).remove(interfaceC1204310hRd);
                }
            }
        });
    }
}
