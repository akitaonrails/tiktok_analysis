package com.ss.android.ugc.aweme.tools.music.utils;

import X.C356901a3;
import X.InterfaceC1662290tMJ;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class VerticalMusicLeakFixHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final Set<String> LL = new LinkedHashSet();

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
        IMusicExternalService iMusicExternalService;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        C356901a3.LIZIZ(this, lifecycleOwner);
        for (String str : this.LL) {
            ServiceManager serviceManager = ServiceManager.get();
            if (serviceManager != null && (iMusicExternalService = (IMusicExternalService) serviceManager.getService(IMusicExternalService.class)) != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
                interfaceC1662290tMJLIZJ.LJI(str);
            }
        }
    }
}
