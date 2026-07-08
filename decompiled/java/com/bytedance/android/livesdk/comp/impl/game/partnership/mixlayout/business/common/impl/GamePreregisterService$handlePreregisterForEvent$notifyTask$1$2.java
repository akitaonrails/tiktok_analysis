package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.impl;

import X.C013C;
import X.C1882050z4l;
import X.C1882650z5j;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GamePreregisterResultParam;

/* JADX INFO: loaded from: classes29.dex */
public final class GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C1882050z4l LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (!this.LL.element) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.LLILLJJLI.LL.getPage().getLifecycleOwner();
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        GamePreregisterResultParam gamePreregisterResultParam = new GamePreregisterResultParam();
        String str = this.LLILLL;
        boolean z = this.LLILZ;
        C1882050z4l c1882050z4l = this.LLILLJJLI;
        gamePreregisterResultParam.isRegister = true;
        gamePreregisterResultParam.gameId = str;
        gamePreregisterResultParam.result = z;
        gamePreregisterResultParam.from = c1882050z4l.LL.getPage().LIZLLL();
        C1882650z5j.LIZIZ("gamePartnershipMixViewReserveAndOpenCompletion", gamePreregisterResultParam);
    }

    public GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2(C013C c013c, C1882050z4l c1882050z4l, String str, boolean z) {
        this.LL = c013c;
        this.LLILLJJLI = c1882050z4l;
        this.LLILLL = str;
        this.LLILZ = z;
    }
}
