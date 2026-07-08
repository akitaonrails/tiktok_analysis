package com.ss.android.ugc.gamora.editorpro.guide.logic;

import X.C01GW;
import X.C09AY;
import X.C0EGY;
import X.C1295960jpS;
import X.C19EG;
import X.C356901a3;
import X.C452501pT;
import X.InterfaceC359850E8x;
import X.InterfaceC362350EIn;
import android.animation.AnimatorSet;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public class BaseFuncItemGuideController implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0EGY LLILLL;
    public final InterfaceC362350EIn LLILZ;
    public final Keva LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public C09AY LLJI;

    public void LJFF() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void LIZ() {
        this.LLILZ.onShow();
    }

    public final InterfaceC359850E8x LIZIZ() {
        return (InterfaceC359850E8x) this.LLILZLL.getValue();
    }

    public final AnimatorSet LIZJ() {
        return (AnimatorSet) this.LLJ.getValue();
    }

    public final C1295960jpS LIZLLL() {
        return (C1295960jpS) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public void LJ() {
        ?? r0 = this.LLJI;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLILLJJLI.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    public BaseFuncItemGuideController(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0egy;
        this.LLILZ = interfaceC362350EIn;
        lifecycle.addObserver(this);
        this.LLILZIL = Keva.getRepo("ep_func_item_guide_repo");
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 919));
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 918));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 921));
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 920));
    }
}
