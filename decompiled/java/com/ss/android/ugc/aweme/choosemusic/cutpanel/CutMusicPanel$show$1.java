package com.ss.android.ugc.aweme.choosemusic.cutpanel;

import X.C118300cf;
import X.C16G0;
import X.C356901a3;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class CutMusicPanel$show$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ CutMusicPanel LL;

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

    public CutMusicPanel$show$1(CutMusicPanel cutMusicPanel) {
        this.LL = cutMusicPanel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        final C16G0 c16g0;
        Lifecycle lifecycle;
        C356901a3.LIZLLL(this, lifecycleOwner);
        TuxSheet tuxSheet = this.LL.LLILLL;
        if (tuxSheet != null && (lifecycle = tuxSheet.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        final CutMusicPanel cutMusicPanel = this.LL;
        View view = cutMusicPanel.LLILZLL;
        if (view != null && cutMusicPanel.LLILLJJLI != null && (c16g0 = (C16G0) view.getRootView().findViewById(R.id.exx)) != null) {
            final C118300cf c118300cf = new C118300cf();
            int height = c16g0.getHeight();
            c118300cf.element = height;
            if (height == 0) {
                C786410Ut5.x3(c16g0.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.15LV
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        if (c16g0.getHeight() != 0) {
                            C786410Ut5.C3(c16g0.getViewTreeObserver(), this);
                            View view2 = cutMusicPanel.LLILZLL;
                            if (view2 == null) {
                                view2 = null;
                            }
                            int height2 = view2.getHeight();
                            c118300cf.element = c16g0.getHeight();
                            int i = c118300cf.element - height2;
                            if (i < 0) {
                                i = 0;
                            }
                            cutMusicPanel.RR(c16g0, i);
                        }
                    }
                });
                return;
            }
            View view2 = cutMusicPanel.LLILZLL;
            if (view2 == null) {
                view2 = null;
            }
            int height2 = c118300cf.element - view2.getHeight();
            if (height2 < 0) {
                height2 = 0;
            }
            cutMusicPanel.RR(c16g0, height2);
        }
    }
}
