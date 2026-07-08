package com.ss.android.ugc.aweme.live.follow;

import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightColdStartOptSetting;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowLiveDataFetchManager$lifeCycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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
        boolean z = FollowLiveDataFetchManager.LIZ;
        AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(206);
        if (FollowLiveDataFetchManager.LIZ && FollowLiveDataFetchManager.LIZJ() && LiveSkylightColdStartOptSetting.getGlobalFetchStrategy() == 2) {
            aFwS193S0000000_7.invoke();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        boolean z = FollowLiveDataFetchManager.LIZ;
        AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(204);
        if (FollowLiveDataFetchManager.LIZ && FollowLiveDataFetchManager.LIZJ() && LiveSkylightColdStartOptSetting.getGlobalFetchStrategy() == 2) {
            aFwS193S0000000_7.invoke();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        boolean z = FollowLiveDataFetchManager.LIZ;
        AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(205);
        if (FollowLiveDataFetchManager.LIZ && FollowLiveDataFetchManager.LIZJ() && LiveSkylightColdStartOptSetting.getGlobalFetchStrategy() == 2) {
            aFwS193S0000000_7.invoke();
        }
    }
}
