package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel;

import X.C0PSS;
import X.C19EG;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedbackHelper$startObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        FeedbackHelper feedbackHelper = FeedbackHelper.LIZ;
        feedbackHelper.getClass();
        if (FeedbackHelper.LIZJ) {
            feedbackHelper.getClass();
            FeedbackHelper.LIZJ = false;
            C0PSS.LIZ(this.LL, this.LLILLJJLI);
        }
        feedbackHelper.getClass();
        if (FeedbackHelper.LIZLLL) {
            feedbackHelper.getClass();
            FeedbackHelper.LIZLLL = false;
            feedbackHelper.getClass();
            FeedbackHelper.LIZIZ = 2;
            C0PSS.LIZ(this.LL, this.LLILLJJLI);
        }
    }

    public FeedbackHelper$startObserver$1(Fragment fragment, C19EG c19eg) {
        this.LL = fragment;
        this.LLILLJJLI = c19eg;
    }
}
