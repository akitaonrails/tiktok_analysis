package com.ss.android.ugc.aweme.arch.widgets.base;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1052980dVY;
import X.C1701330uNH;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: loaded from: classes17.dex */
public abstract class Widget implements ViewModelStoreOwner, GenericLifecycleObserver {
    public Context LL;
    public View LLILLJJLI;
    public View LLILLL;
    public DataCenter LLILZ;
    public C1052980dVY LLILZIL;
    public boolean LLILZLL;
    public ViewModelStore LLIZ;

    public int LJIIJ() {
        return 0;
    }

    public void LJIIL(int i, int i2, Intent intent) {
    }

    public void LJIILIIL(View view) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.LLILZLL = true;
        LJIILIIL(this.LLILLL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LLILZLL = false;
        ViewModelStore viewModelStore = this.LLIZ;
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public final Activity LJIIIZ() {
        return this.LLILZIL.LIZ.getActivity();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        if (this.LLIZ == null) {
            this.LLIZ = new ViewModelStore();
        }
        return this.LLIZ;
    }

    public final void LJIILJJIL(Intent intent, int i) {
        int iIntValue = i;
        Intent intent2 = intent;
        Fragment fragment = this.LLILZIL.LIZ;
        C1701330uNH.LIZ(intent2, fragment);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu6YJeAyzu/qqqTUu3P23JsyJZGohuur3xjb6OZg80=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/ss/android/ugc/aweme/arch/widgets/base/WidgetManager", "startActivityForResult", fragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/ss/android/ugc/aweme/arch/widgets/base/WidgetManager", "startActivityForResult", null, objArr, fragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "com/ss/android/ugc/aweme/arch/widgets/base/WidgetManager", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }
}
