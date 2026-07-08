package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C0W17;
import X.C356901a3;
import X.C459880I1q;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3PageMobComponent$getDetailLifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ FriendsV3PageMobComponent LL;

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
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public FriendsV3PageMobComponent$getDetailLifecycleObserver$1(FriendsV3PageMobComponent friendsV3PageMobComponent) {
        this.LL = friendsV3PageMobComponent;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        C0W17.LIZJ("FriendsFeedMob", "detail onResume");
        this.LL.fo();
        FriendsV3PageMobComponent friendsV3PageMobComponent = this.LL;
        if (friendsV3PageMobComponent.LLILZIL == -1) {
            friendsV3PageMobComponent.LLILZIL = System.currentTimeMillis();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
        C0W17.LIZJ("FriendsFeedMob", "detail onStop");
        if (C459880I1q.LIZ(this.LL)) {
            C0W17.LIZJ("FriendsFeedMob", "detail onStop, back to friends");
        } else {
            this.LL.m220do(true);
        }
    }
}
