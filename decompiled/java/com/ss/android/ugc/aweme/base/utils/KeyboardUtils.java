package com.ss.android.ugc.aweme.base.utils;

import X.C1948707kD;
import X.C786410Ut5;
import X.InterfaceC1242460iRA;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class KeyboardUtils {
    public static final List<ClearCursorDecorator> LIZ = new ArrayList(2);
    public static final List<AndroidBug5497Workaround> LIZIZ = new ArrayList(2);

    public static class AndroidBug5497Workaround implements GenericLifecycleObserver {
        public ViewTreeObserverOnGlobalLayoutListenerC1265990j37 LL;
        public View LLILLJJLI;
        public InterfaceC1242460iRA LLILLL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            Iterator it2 = ((ArrayList) KeyboardUtils.LIZIZ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (next == this) {
                    ((ArrayList) KeyboardUtils.LIZIZ).remove(next);
                    break;
                }
            }
            View view = this.LLILLJJLI;
            if (view != null && view.getViewTreeObserver() != null && this.LLILLJJLI.getViewTreeObserver().isAlive()) {
                C786410Ut5.C3(this.LLILLJJLI.getViewTreeObserver(), this.LL);
            }
            this.LLILLJJLI = null;
            this.LL = null;
            this.LLILLL = null;
        }

        public AndroidBug5497Workaround(LifecycleOwner lifecycleOwner, View view, InterfaceC1242460iRA interfaceC1242460iRA) {
            lifecycleOwner.getLifecycle().addObserver(this);
            this.LLILLL = interfaceC1242460iRA;
            this.LL = new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(this, 6);
            View rootView = view.getRootView();
            this.LLILLJJLI = rootView;
            C786410Ut5.x3(rootView.getViewTreeObserver(), this.LL);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static class ClearCursorDecorator implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            Iterator it2 = ((ArrayList) KeyboardUtils.LIZ).iterator();
            while (it2.hasNext()) {
                if (it2.next() == this) {
                    ((ArrayList) KeyboardUtils.LIZ).remove(this);
                }
            }
        }
    }

    public static void LIZIZ(View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void LIZJ(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    public static void LIZLLL(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, View view, InterfaceC1242460iRA interfaceC1242460iRA) {
        ((ArrayList) LIZIZ).add(new AndroidBug5497Workaround(lifecycleOwner, view, interfaceC1242460iRA));
    }

    public static void LJ(int i, Activity activity, int i2) {
        Window window = activity.getWindow();
        int i3 = window.getAttributes().softInputMode;
        int i4 = i & i2;
        if ((i3 & i2) == i4) {
            return;
        }
        window.setSoftInputMode(i4 ^ ((~i2) & i3));
    }
}
