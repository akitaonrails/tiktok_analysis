package com.ss.android.ugc.aweme.feed.panel;

import X.C01GW;
import X.C0SZ8;
import X.C2188811AlT;
import X.C356901a3;
import X.C452501pT;
import X.InterfaceC739770T0d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryFeedListHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final InterfaceC739770T0d LL;
    public final IBaseListFragmentPanel LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(113));
    public boolean LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
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

    public final String LIZ() {
        C0SZ8 c0sz8LJLIL = this.LLILLJJLI.LJLIL();
        if (c0sz8LJLIL == null) {
            return "no story list viewholder";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPlay-out success: aid = ");
        Aweme awemeLJIIIIZZ = c0sz8LJLIL.LJIIIIZZ();
        sbLIZ.append(awemeLJIIIIZZ != null ? awemeLJIIIIZZ.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LL.LJJLIIIJILLIZJL(c0sz8LJLIL.LJIIIIZZ(), false, c0sz8LJLIL);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLILZ = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLILZ = false;
    }

    public StoryFeedListHelper(InterfaceC739770T0d interfaceC739770T0d, IBaseListFragmentPanel iBaseListFragmentPanel) {
        this.LL = interfaceC739770T0d;
        this.LLILLJJLI = iBaseListFragmentPanel;
    }
}
