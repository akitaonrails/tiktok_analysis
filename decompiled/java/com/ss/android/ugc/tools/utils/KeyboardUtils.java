package com.ss.android.ugc.tools.utils;

import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class KeyboardUtils {
    public static final List<ClearCursorDecorator> LIZ = new ArrayList(2);
    public static final List<AndroidBug5497Workaround> LIZIZ = new ArrayList(2);

    public static class AndroidBug5497Workaround implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            for (Object obj : (ArrayList) KeyboardUtils.LIZIZ) {
                if (obj == this) {
                    ((ArrayList) KeyboardUtils.LIZIZ).remove(obj);
                    return;
                }
            }
        }
    }

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

    public static void LIZ(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void LIZIZ(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    public static void LIZJ(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }
}
