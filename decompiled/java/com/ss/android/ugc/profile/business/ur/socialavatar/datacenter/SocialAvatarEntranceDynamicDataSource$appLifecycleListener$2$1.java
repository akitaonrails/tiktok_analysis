package com.ss.android.ugc.profile.business.ur.socialavatar.datacenter;

import X.AnonymousClass0956;
import X.C0XQ7;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarEntranceDynamicDataSource$appLifecycleListener$2$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        SocialAvatarEntranceDynamicDataSource socialAvatarEntranceDynamicDataSource = SocialAvatarEntranceDynamicDataSource.LL;
        socialAvatarEntranceDynamicDataSource.LIZLLL().LIZ("DynamicEntranceSetting", "SocialAvatarEntranceDynamicDataSource onDestroy");
        AnonymousClass0956 anonymousClass0956 = SocialAvatarEntranceDynamicDataSource.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        SocialAvatarEntranceDynamicDataSource.LLIZ = null;
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI(SocialAvatarEntranceDynamicDataSource.LLJILJIL);
        socialAvatarEntranceDynamicDataSource.LIZLLL().LIZ("DynamicEntranceSetting", "SocialAvatarEntranceDynamicDataSource onDestroy, destroy complete");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        SocialAvatarEntranceDynamicDataSource socialAvatarEntranceDynamicDataSource = SocialAvatarEntranceDynamicDataSource.LL;
        socialAvatarEntranceDynamicDataSource.LIZLLL().LIZ("DynamicEntranceSetting", "SocialAvatarEntranceDynamicDataSource onResume");
        socialAvatarEntranceDynamicDataSource.LJ(SocialAvatarEntranceDynamicDataSource.LLILZIL.getAndSet(false));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        SocialAvatarEntranceDynamicDataSource socialAvatarEntranceDynamicDataSource = SocialAvatarEntranceDynamicDataSource.LL;
        socialAvatarEntranceDynamicDataSource.LIZLLL().LIZ("DynamicEntranceSetting", "SocialAvatarEntranceDynamicDataSource onStop");
        AnonymousClass0956 anonymousClass0956 = SocialAvatarEntranceDynamicDataSource.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        SocialAvatarEntranceDynamicDataSource.LLIZ = null;
        socialAvatarEntranceDynamicDataSource.LIZLLL().LIZ("DynamicEntranceSetting", "SocialAvatarEntranceDynamicDataSource onStop, destroy complete");
    }
}
