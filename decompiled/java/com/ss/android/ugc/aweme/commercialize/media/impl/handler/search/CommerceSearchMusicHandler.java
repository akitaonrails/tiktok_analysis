package com.ss.android.ugc.aweme.commercialize.media.impl.handler.search;

import X.C15MA;
import X.C15MF;
import X.C19719612Di;
import X.InterfaceC681390Qo5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceSearchMusicHandler implements InterfaceC681390Qo5 {
    @Override // X.InterfaceC681390Qo5
    public final void Xq0() {
        C15MA.LL.getClass();
        ((ArrayList) C15MA.LLJILJIL).add(new C15MF() { // from class: X.15MH
        });
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C15MA.LL.getClass();
            C19719612Di.LJJIJIIJI(C15MA.LLJILJIL);
        }
    }
}
