package com.ss.android.ugc.aweme.bullet.ab;

import X.C08C7;
import X.C20113813my;
import X.C20115513nF;
import X.EnumC310740CGa;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;

/* JADX INFO: loaded from: classes31.dex */
public final class BulletFragmentABHelper$lifecycleEventObserver$1 implements LifecycleEventObserver {
    public static final /* synthetic */ int LL = 0;

    static {
        new BulletFragmentABHelper$lifecycleEventObserver$1();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IResourceLoaderService iResourceLoaderService;
        int i = C08C7.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2 && (iResourceLoaderService = (IResourceLoaderService) C20113813my.LIZIZ().LIZIZ(IResourceLoaderService.class)) != null) {
                iResourceLoaderService.unregisterCustomLoader(C20115513nF.class, EnumC310740CGa.HIGH);
                return;
            }
            return;
        }
        IResourceLoaderService iResourceLoaderService2 = (IResourceLoaderService) C20113813my.LIZIZ().LIZIZ(IResourceLoaderService.class);
        if (iResourceLoaderService2 == null) {
            return;
        }
        iResourceLoaderService2.registerCustomLoader(C20115513nF.class, EnumC310740CGa.HIGH);
    }
}
