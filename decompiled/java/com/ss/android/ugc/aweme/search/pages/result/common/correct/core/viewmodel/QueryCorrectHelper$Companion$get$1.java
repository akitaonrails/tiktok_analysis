package com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel;

import X.C1554960qZC;
import X.C1558360qeg;
import X.C19EG;
import X.C2786016a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class QueryCorrectHelper$Companion$get$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ LifecycleOwner LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
    }

    public QueryCorrectHelper$Companion$get$1(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Map<LifecycleOwner, QueryCorrectHelper> map = QueryCorrectHelper.LJ;
        if (((LinkedHashMap) map).get(this.LL) != null) {
            LifecycleOwner lifecycleOwner2 = this.LL;
            if (lifecycleOwner2 instanceof C19EG) {
                C1554960qZC.LIZLLL(C1558360qeg.LJI((C19EG) lifecycleOwner2, null), C2786016a.class, "source_default_key");
            } else if (lifecycleOwner2 instanceof Fragment) {
                C1554960qZC.LIZLLL(C1558360qeg.LJFF((Fragment) lifecycleOwner2, null), C2786016a.class, "source_default_key");
            }
        }
        map.remove(this.LL);
    }
}
