package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C09AY;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19EG;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoDismissPermissionDialog implements GenericLifecycleObserver {
    public final C19EG LL;
    public final C1397580mTM LLILLJJLI;
    public C1397510mTF LLILLL;
    public C09AY LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        }
    }

    public final boolean LIZ() {
        ICreativeSAAService iCreativeSAAService;
        Lifecycle lifecycleActivityGetLifecycleSafely;
        if (this.LLILLL != null || (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) == null || (lifecycleActivityGetLifecycleSafely = iCreativeSAAService.activityGetLifecycleSafely(this.LL)) == null) {
            return false;
        }
        lifecycleActivityGetLifecycleSafely.addObserver(this);
        this.LLILLJJLI.LIZLLL(new AwS374S0200000_8(this, lifecycleActivityGetLifecycleSafely, 66));
        ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(this.LL, new AwS552S0100000_8(this, 353));
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        C1397510mTF c1397510mTF = this.LLILLL;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    public AutoDismissPermissionDialog(C19EG c19eg, C1397580mTM c1397580mTM) {
        this.LL = c19eg;
        this.LLILLJJLI = c1397580mTM;
    }
}
