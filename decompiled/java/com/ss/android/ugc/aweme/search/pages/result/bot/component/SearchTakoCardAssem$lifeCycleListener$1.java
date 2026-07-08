package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C0PRC;
import X.C0Q7D;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoCardAssem$lifeCycleListener$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ SearchTakoCardAssem LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public SearchTakoCardAssem$lifeCycleListener$1(SearchTakoCardAssem searchTakoCardAssem) {
        this.LL = searchTakoCardAssem;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.LL.yp();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        String str;
        C0Q7D c0q7d = C0Q7D.LIZ;
        C0PRC c0prcZp = this.LL.zp();
        if (c0prcZp != null) {
            str = c0prcZp.LLILLL;
        } else {
            str = null;
        }
        c0q7d.getClass();
        C0Q7D.LIZ(str);
    }
}
