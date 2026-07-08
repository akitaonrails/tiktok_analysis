package com.bytedance.widget;

import X.C01GW;
import X.C452501pT;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public class Widget implements LifecycleOwner, GenericLifecycleObserver {
    public WidgetHost LL;
    public boolean LLILLJJLI;
    public ViewGroup LLILLL;
    public View LLILZ;
    public boolean LLILZIL = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 73));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 72));

    public int LIZLLL() {
        return 0;
    }

    public void onCreate() {
        this.LLILLJJLI = false;
    }

    public void onDestroy() {
        this.LLILLJJLI = true;
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            create$widget_release();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            start$widget_release();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            resume$widget_release();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause$widget_release();
        } else if (event == Lifecycle.Event.ON_STOP) {
            stop$widget_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy$widget_release();
        }
    }

    public void onStop() {
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLILZLL.getValue();
    }

    public final ViewGroup LIZIZ() {
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final Object LIZJ() {
        WidgetHost widgetHost = this.LL;
        if (widgetHost != null) {
            Fragment parentFragment = widgetHost.getParentFragment();
            return parentFragment == null ? widgetHost.requireHost() : parentFragment;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create$widget_release() {
        onCreate();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$widget_release() {
        onDestroy();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause$widget_release() {
        onPause();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume$widget_release() {
        onResume();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void start$widget_release() {
        onStart();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void stop$widget_release() {
        onStop();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }
}
