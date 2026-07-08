package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel;

import X.C013C;
import X.C0Q3E;
import X.C0Q9J;
import X.C356901a3;
import X.C641690PEx;
import X.C684120QsU;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFeedbackManager$Companion$openReportSparkContainer$1$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Function0<Unit> function0;
        boolean z = C0Q9J.LIZ;
        C684120QsU.LJI(this.LLILLJJLI, this.LL, false);
        if (C0Q9J.LIZ) {
            C0Q3E.LJI().Ph1().LIZ(new C641690PEx(false));
        }
        if (this.LLILLL.element && (function0 = this.LLILZ) != null) {
            function0.invoke();
        }
    }

    public SearchFeedbackManager$Companion$openReportSparkContainer$1$2(Fragment fragment, View view, C013C c013c, Function0<Unit> function0) {
        this.LL = fragment;
        this.LLILLJJLI = view;
        this.LLILLL = c013c;
        this.LLILZ = function0;
    }
}
