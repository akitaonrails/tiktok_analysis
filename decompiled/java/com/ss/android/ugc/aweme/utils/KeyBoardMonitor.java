package com.ss.android.ugc.aweme.utils;

import X.C786410Ut5;
import X.InterfaceC459810I1j;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes7.dex */
public class KeyBoardMonitor implements ViewTreeObserver.OnGlobalLayoutListener, GenericLifecycleObserver {
    public View LL;
    public InterfaceC459810I1j LLILLJJLI;

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        View view = this.LL;
        if (view != null) {
            C786410Ut5.C3(view.getViewTreeObserver(), this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LL.getWindowVisibleDisplayFrame(new Rect());
        if (this.LL.getBottom() - r2.bottom > this.LL.getResources().getDisplayMetrics().density * 100.0f) {
            this.LLILLJJLI.V3();
        } else {
            this.LLILLJJLI.ub();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LIZIZ();
    }

    public KeyBoardMonitor(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    public void LIZ(View view, InterfaceC459810I1j interfaceC459810I1j) {
        View rootView = view.getRootView();
        this.LL = rootView;
        this.LLILLJJLI = interfaceC459810I1j;
        if (rootView != null) {
            C786410Ut5.x3(rootView.getViewTreeObserver(), this);
        }
    }
}
