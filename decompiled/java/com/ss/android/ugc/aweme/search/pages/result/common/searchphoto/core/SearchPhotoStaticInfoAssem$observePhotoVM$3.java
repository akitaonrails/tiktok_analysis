package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C301450Brj;
import X.C356901a3;
import X.C631370Opb;
import X.C659750PuH;
import X.C786410Ut5;
import X.InterfaceC657170Pq7;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoStaticInfoAssem$observePhotoVM$3 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ SearchPhotoStaticInfoAssem LL;

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
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public SearchPhotoStaticInfoAssem$observePhotoVM$3(SearchPhotoStaticInfoAssem searchPhotoStaticInfoAssem) {
        this.LL = searchPhotoStaticInfoAssem;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        InterfaceC657170Pq7 interfaceC657170Pq7;
        TuxTextView tuxTextView;
        C356901a3.LJ(this, lifecycleOwner);
        if (C301450Brj.LIZ()) {
            Object obj = ((C659750PuH) C631370Opb.LIZ(this.LL)).LLILZ;
            if ((obj instanceof InterfaceC657170Pq7) && (interfaceC657170Pq7 = (InterfaceC657170Pq7) obj) != null && interfaceC657170Pq7.LIZIZ() && (tuxTextView = this.LL.LLJJLIIIJLLLLLLLZ) != null) {
                C786410Ut5.B5(tuxTextView, 0.0f);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
        TuxTextView tuxTextView = this.LL.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
    }
}
