package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C356901a3;
import X.EnumC21696919vj;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3PageStateComponent$getQuickChatRoomObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ FriendsV3PageStateComponent LL;

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

    public FriendsV3PageStateComponent$getQuickChatRoomObserver$1(FriendsV3PageStateComponent friendsV3PageStateComponent) {
        this.LL = friendsV3PageStateComponent;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        FriendsV3PageStateComponent friendsV3PageStateComponent = this.LL;
        if (!friendsV3PageStateComponent.LLJIJIL) {
            return;
        }
        friendsV3PageStateComponent.LLJJJJJIL = true;
        this.LL.So(EnumC21696919vj.LIFECYCLE_CHANGE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        FriendsV3PageStateComponent friendsV3PageStateComponent = this.LL;
        if (!friendsV3PageStateComponent.LLJIJIL) {
            return;
        }
        friendsV3PageStateComponent.LLJJJJJIL = false;
        this.LL.So(EnumC21696919vj.LIFECYCLE_CHANGE);
    }
}
