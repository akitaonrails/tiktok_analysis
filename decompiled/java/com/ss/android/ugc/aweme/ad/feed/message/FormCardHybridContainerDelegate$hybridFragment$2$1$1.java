package com.ss.android.ugc.aweme.ad.feed.message;

import X.AbstractC2173821A5s;
import X.C1024570clj;
import X.C356901a3;
import X.InterfaceC1008670cM5;
import X.InterfaceC1034470d1h;
import Y.ARunnableS104S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class FormCardHybridContainerDelegate$hybridFragment$2$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1024570clj LL;

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public FormCardHybridContainerDelegate$hybridFragment$2$1$1(C1024570clj c1024570clj) {
        this.LL = c1024570clj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C1024570clj c1024570clj = this.LL;
        ((AbstractC2173821A5s) c1024570clj.LJIIJ.getValue()).LJFF(false);
        InterfaceC1008670cM5 interfaceC1008670cM5 = c1024570clj.LJII;
        if (interfaceC1008670cM5 != null) {
            interfaceC1008670cM5.enable(false);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        ViewGroup viewGroup;
        Fragment fragment;
        C1024570clj c1024570clj = this.LL;
        InterfaceC1034470d1h interfaceC1034470d1h = (InterfaceC1034470d1h) c1024570clj.LJI.getValue();
        View view = null;
        if (interfaceC1034470d1h != null && (fragment = interfaceC1034470d1h.getFragment()) != null) {
            view = fragment.getView();
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.setFitsSystemWindows(true);
            HandlerHook.viewPost(viewGroup, new ARunnableS104S0100000_4(viewGroup, 122));
            if (viewGroup.findViewById(R.id.vs5) == null) {
                FrameLayout frameLayout = new FrameLayout(c1024570clj.LIZ);
                frameLayout.setId(R.id.vs5);
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }
}
