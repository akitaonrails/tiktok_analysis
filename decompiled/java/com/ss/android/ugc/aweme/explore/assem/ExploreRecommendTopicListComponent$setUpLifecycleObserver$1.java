package com.ss.android.ugc.aweme.explore.assem;

import X.C356901a3;
import X.C786410Ut5;
import android.os.Handler;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreRecommendTopicListComponent$setUpLifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ ExploreRecommendTopicListComponent LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
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

    public ExploreRecommendTopicListComponent$setUpLifecycleObserver$1(ExploreRecommendTopicListComponent exploreRecommendTopicListComponent) {
        this.LL = exploreRecommendTopicListComponent;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        ((Handler) this.LL.LLLIIIIL.getValue()).removeCallbacks(this.LL.LLLIIL);
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        ExploreRecommendTopicListComponent exploreRecommendTopicListComponent = this.LL;
        if (exploreRecommendTopicListComponent.LLLIILIL) {
            return;
        }
        if (exploreRecommendTopicListComponent.jq()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (exploreRecommendTopicListComponent.LLLIIII == 0) {
                exploreRecommendTopicListComponent.LLLIIII = jCurrentTimeMillis;
            }
            if ((jCurrentTimeMillis - exploreRecommendTopicListComponent.LLLIIII) - exploreRecommendTopicListComponent.LLLIL >= 0) {
                this.LL.qq();
                return;
            }
        }
        if (!this.LL.jq()) {
            return;
        }
        long jCurrentTimeMillis2 = this.LL.LLLIL - System.currentTimeMillis();
        ExploreRecommendTopicListComponent exploreRecommendTopicListComponent2 = this.LL;
        long j = jCurrentTimeMillis2 + exploreRecommendTopicListComponent2.LLLIIII;
        if (j <= 0) {
            return;
        }
        C786410Ut5.LJLIIL(j, (Handler) exploreRecommendTopicListComponent2.LLLIIIIL.getValue(), this.LL.LLLIIL);
    }
}
