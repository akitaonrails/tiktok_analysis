package com.ss.android.ugc.aweme.utils;

import X.InterfaceC459810I1j;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes7.dex */
public final class FixedKeyboardMonitor extends KeyBoardMonitor implements InterfaceC459810I1j {
    public boolean LLILLL;
    public InterfaceC459810I1j LLILZ;

    @Override // X.InterfaceC459810I1j
    public final void V3() {
        this.LLILLL = true;
        InterfaceC459810I1j interfaceC459810I1j = this.LLILZ;
        if (interfaceC459810I1j != null) {
            interfaceC459810I1j.V3();
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.KeyBoardMonitor, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC459810I1j
    public final void ub() {
        InterfaceC459810I1j interfaceC459810I1j;
        if (this.LLILLL && (interfaceC459810I1j = this.LLILZ) != null) {
            interfaceC459810I1j.ub();
        }
        this.LLILLL = false;
    }

    public FixedKeyboardMonitor(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.utils.KeyBoardMonitor
    public final void LIZ(View view, InterfaceC459810I1j interfaceC459810I1j) {
        super.LIZ(view, this);
        this.LLILZ = interfaceC459810I1j;
    }
}
