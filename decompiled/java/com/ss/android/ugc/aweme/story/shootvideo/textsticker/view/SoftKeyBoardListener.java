package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import X.C0FWM;
import X.C12YW;
import X.C786410Ut5;
import X.InterfaceC1391500mJY;
import X.InterfaceC1463990oCT;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes30.dex */
public class SoftKeyBoardListener implements GenericLifecycleObserver {
    public final InterfaceC1463990oCT LL;
    public final View LLILLJJLI;
    public int LLILLL;
    public InterfaceC1391500mJY LLILZ;
    public final int LLILZIL;
    public final C12YW LLILZLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        View view = this.LLILLJJLI;
        if (view != null && this.LLILZLL != null) {
            C786410Ut5.C3(view.getViewTreeObserver(), this.LLILZLL);
        }
        this.LLILZ = null;
    }

    public final void LIZJ() {
        Rect rect = new Rect();
        View view = this.LLILLJJLI;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        this.LLILLL = rect.height();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZ();
    }

    public void LIZIZ(InterfaceC1391500mJY interfaceC1391500mJY) {
        this.LLILZ = interfaceC1391500mJY;
        View view = this.LLILLJJLI;
        if (view != null && this.LLILZLL != null) {
            C786410Ut5.x3(view.getViewTreeObserver(), this.LLILZLL);
        }
    }

    public SoftKeyBoardListener(Activity activity, C0FWM c0fwm, Window window, LifecycleOwner lifecycleOwner) {
        View decorView;
        Window window2;
        Lifecycle lifecycle;
        this.LL = c0fwm;
        if (window == null || (decorView = window.getDecorView()) == null) {
            if (activity != null && (window2 = activity.getWindow()) != null) {
                decorView = window2.getDecorView();
            } else {
                decorView = null;
            }
        }
        this.LLILLJJLI = decorView;
        this.LLILZIL = 200;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LLILZLL = new C12YW(this, 4);
    }

    public /* synthetic */ SoftKeyBoardListener(Activity activity, C0FWM c0fwm, Window window, LifecycleOwner lifecycleOwner, int i) {
        this(activity, c0fwm, (i & 4) != 0 ? null : window, (i & 8) != 0 ? null : lifecycleOwner);
    }
}
