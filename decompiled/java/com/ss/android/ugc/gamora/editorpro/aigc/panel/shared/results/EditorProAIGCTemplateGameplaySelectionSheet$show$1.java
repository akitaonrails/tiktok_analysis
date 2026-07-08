package com.ss.android.ugc.gamora.editorpro.aigc.panel.shared.results;

import X.C1766560w4U;
import X.C19EG;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: loaded from: classes5.dex */
public final class EditorProAIGCTemplateGameplaySelectionSheet$show$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ TuxSheet LL;
    public final /* synthetic */ C19EG LLILLJJLI;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        if (this.LL.getDialog() != null) {
            TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(this.LLILLJJLI);
            tuxImmersionBarLJ.LIZJ(false, true);
            tuxImmersionBarLJ.LIZLLL();
        }
    }

    public EditorProAIGCTemplateGameplaySelectionSheet$show$1(TuxSheet tuxSheet, C19EG c19eg) {
        this.LL = tuxSheet;
        this.LLILLJJLI = c19eg;
    }
}
