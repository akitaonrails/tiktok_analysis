package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.AbstractC1616100s9o;
import X.C09AE;
import X.C13BV;
import X.C1616000s9e;
import X.C1616020s9g;
import X.C1616050s9j;
import X.C1697810uHb;
import X.C356901a3;
import X.C786410Ut5;
import X.EnumC1616060s9k;
import X.InterfaceC497601wk;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PageDispatcher implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final InterfaceC497601wk LLILLJJLI;
    public final C1616000s9e LLILLL;
    public final CopyOnWriteArrayList<AbstractC1616100s9o> LLILZ;

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

    public PageDispatcher(ViewPagerPanelComponent viewPagerPanelComponent) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewPagerPanelComponent);
        this.LL = viewPagerPanelComponent;
        this.LLILLJJLI = lifecycleScope;
        this.LLILLL = new C1616000s9e(new C1616050s9j());
        this.LLILZ = new CopyOnWriteArrayList<>();
        viewPagerPanelComponent.getLifecycle().addObserver(this);
    }

    public final void LIZ(String str) {
        C1616000s9e c1616000s9e = this.LLILLL;
        int i = 0;
        int i2 = 0;
        for (C1616020s9g c1616020s9g : c1616000s9e.LJ) {
            if (i2 >= 0) {
                C1616020s9g c1616020s9g2 = c1616020s9g;
                if (c1616020s9g2.LIZ == EnumC1616060s9k.LL && Intrinsics.LJFF(c1616020s9g2.LIZJ, str)) {
                    for (C1616020s9g c1616020s9g3 : c1616000s9e.LJ) {
                        int i3 = i + 1;
                        if (i >= 0) {
                            C1616020s9g c1616020s9g4 = c1616020s9g3;
                            if (i <= i2) {
                                c1616020s9g4.LIZLLL = true;
                                C09AE c09ae = c1616020s9g4.LJ;
                                if (c09ae != null) {
                                    c09ae.LIZIZ(null);
                                }
                                c1616020s9g4.LJ = null;
                            }
                            i = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    c1616000s9e.LIZ(c1616000s9e.LIZJ, c1616000s9e.LIZLLL);
                    return;
                }
                i2++;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C1616000s9e c1616000s9e = this.LLILLL;
        c1616000s9e.getClass();
        c1616000s9e.LIZJ = C13BV.INSTANCE;
        c1616000s9e.LIZLLL = null;
        c1616000s9e.LIZIZ = true;
        for (C1616020s9g c1616020s9g : c1616000s9e.LJ) {
            C09AE c09ae = c1616020s9g.LJ;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            c1616020s9g.LJ = null;
        }
        c1616000s9e.LJ.clear();
        for (C09AE c09ae2 : c1616000s9e.LJFF.values()) {
            if (c09ae2 != null) {
                c09ae2.LIZIZ(null);
            }
        }
        c1616000s9e.LJFF.clear();
        C1616050s9j c1616050s9j = c1616000s9e.LIZ;
        c1616050s9j.LIZ.clear();
        c1616050s9j.LIZJ = false;
        if (c1616050s9j.LIZIZ) {
            C786410Ut5.v2().removeFrameCallback(c1616050s9j.LIZLLL);
            c1616050s9j.LIZIZ = false;
        }
        this.LLILZ.clear();
        C356901a3.LIZIZ(this, lifecycleOwner);
    }
}
