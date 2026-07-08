package com.ss.android.ugc.aweme.sticker.guide;

import X.AnonymousClass1983;
import X.C1624550sNR;
import X.C1624560sNS;
import X.C1628630sU1;
import X.C1628640sU2;
import X.C214881197n;
import X.InterfaceC1628620sU0;
import X.InterfaceC194555119t;
import X.InterfaceC214889197v;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class TikTokDefaultStickerGuidePresenter implements InterfaceC1628620sU0, GenericLifecycleObserver {
    public final FrameLayout LL;
    public InterfaceC194555119t LLILLJJLI;
    public final InterfaceC214889197v LLILLL;
    public final InterfaceC214889197v LLILZ;
    public Effect LLILZIL;

    @Override // X.InterfaceC1628620sU0
    public final void Sr1() {
        this.LLILZIL = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            hideNotice();
        }
    }

    @Override // X.InterfaceC1628620sU0
    public final void hide() {
        InterfaceC194555119t interfaceC194555119t = this.LLILLJJLI;
        if (interfaceC194555119t != null) {
            interfaceC194555119t.LJJJJLL(true);
        }
    }

    @Override // X.InterfaceC1628620sU0
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void hideNotice() {
        InterfaceC194555119t interfaceC194555119t = this.LLILLJJLI;
        if (interfaceC194555119t != null) {
            interfaceC194555119t.LJJJJLL(true);
        }
    }

    @Override // X.InterfaceC1628620sU0
    public final void kg(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC1628620sU0
    public final void s(Effect effect) {
        InterfaceC194555119t interfaceC194555119tLIZ;
        InterfaceC194555119t interfaceC194555119t;
        if (effect != null && Intrinsics.LJFF(effect, this.LLILZIL) && (interfaceC194555119t = this.LLILLJJLI) != null && true == interfaceC194555119t.isShowing()) {
            return;
        }
        InterfaceC194555119t interfaceC194555119t2 = this.LLILLJJLI;
        if (interfaceC194555119t2 != null) {
            interfaceC194555119t2.LJJJJLL(false);
        }
        if (effect != null && ((C1624560sNS.LIZ(effect) || !Intrinsics.LJFF(effect, this.LLILZIL)) && !C1624550sNR.LIZIZ(effect))) {
            this.LLILZIL = effect;
            InterfaceC214889197v interfaceC214889197v = this.LLILLL;
            if (interfaceC214889197v != null) {
                interfaceC194555119tLIZ = interfaceC214889197v.LIZ(effect);
            } else {
                interfaceC194555119tLIZ = null;
            }
            this.LLILLJJLI = interfaceC194555119tLIZ;
            if (interfaceC194555119tLIZ != null) {
                interfaceC194555119tLIZ.LIZ(this.LL);
                return;
            }
            return;
        }
        this.LLILZIL = effect;
    }

    public TikTokDefaultStickerGuidePresenter(C214881197n c214881197n, AnonymousClass1983 anonymousClass1983, FrameLayout frameLayout) {
        this.LL = frameLayout;
        this.LLILLL = c214881197n;
        this.LLILZ = anonymousClass1983;
    }

    @Override // X.InterfaceC1628620sU0
    public final void lE1(Effect effect, C1628630sU1 c1628630sU1, C1628640sU2 c1628640sU2) {
        InterfaceC194555119t interfaceC194555119tLIZIZ;
        this.LLILZIL = effect;
        InterfaceC214889197v interfaceC214889197v = this.LLILZ;
        if (interfaceC214889197v != null) {
            interfaceC194555119tLIZIZ = interfaceC214889197v.LIZIZ(effect, c1628630sU1, c1628640sU2);
        } else {
            interfaceC194555119tLIZIZ = null;
        }
        this.LLILLJJLI = interfaceC194555119tLIZIZ;
        if (interfaceC194555119tLIZIZ != null) {
            interfaceC194555119tLIZIZ.LIZ(this.LL);
        }
    }
}
