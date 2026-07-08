package com.ss.android.ugc.aweme.sticker.panel.guide;

import X.C1624560sNS;
import X.C1628630sU1;
import X.C1628640sU2;
import X.C214882197o;
import X.InterfaceC1628620sU0;
import X.InterfaceC194555119t;
import X.InterfaceC214889197v;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes33.dex */
public class DefaultStickerGuidePresenter implements InterfaceC1628620sU0 {
    public final FrameLayout LL;
    public InterfaceC194555119t LLILLJJLI;
    public final InterfaceC214889197v LLILLL;
    public InterfaceC194555119t LLILZ;
    public final InterfaceC214889197v LLILZIL;
    public Effect LLILZLL;

    @Override // X.InterfaceC1628620sU0
    public final void Sr1() {
        this.LLILZLL = null;
    }

    @Override // X.InterfaceC1628620sU0
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void hide() {
        InterfaceC194555119t interfaceC194555119t = this.LLILLJJLI;
        if (interfaceC194555119t != null) {
            interfaceC194555119t.LJJJJLL(true);
        }
    }

    @Override // X.InterfaceC1628620sU0
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void hideNotice() {
        InterfaceC194555119t interfaceC194555119t = this.LLILZ;
        if (interfaceC194555119t != null) {
            interfaceC194555119t.LJJJJLL(true);
        }
    }

    @Override // X.InterfaceC1628620sU0
    public final void kg(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC1628620sU0
    public final void s(Effect effect) {
        InterfaceC194555119t interfaceC194555119t;
        if (effect != null && effect.equals(this.LLILZLL) && (interfaceC194555119t = this.LLILLJJLI) != null && interfaceC194555119t.isShowing()) {
            return;
        }
        InterfaceC194555119t interfaceC194555119t2 = this.LLILLJJLI;
        if (interfaceC194555119t2 != null) {
            interfaceC194555119t2.LJJJJLL(false);
        }
        if (effect == null || (!C1624560sNS.LIZ(effect) && effect.equals(this.LLILZLL))) {
            this.LLILZLL = effect;
            return;
        }
        this.LLILZLL = effect;
        InterfaceC194555119t interfaceC194555119tLIZ = this.LLILLL.LIZ(effect);
        this.LLILLJJLI = interfaceC194555119tLIZ;
        interfaceC194555119tLIZ.LIZ(this.LL);
    }

    public DefaultStickerGuidePresenter(C214882197o c214882197o, InterfaceC214889197v interfaceC214889197v, FrameLayout frameLayout) {
        this.LL = frameLayout;
        this.LLILLL = c214882197o;
        this.LLILZIL = interfaceC214889197v;
    }

    @Override // X.InterfaceC1628620sU0
    public final void lE1(Effect effect, C1628630sU1 c1628630sU1, C1628640sU2 c1628640sU2) {
        InterfaceC194555119t interfaceC194555119t = this.LLILZ;
        if (interfaceC194555119t != null) {
            interfaceC194555119t.LJJJJLL(false);
        }
        this.LLILZLL = effect;
        InterfaceC194555119t interfaceC194555119tLIZIZ = this.LLILZIL.LIZIZ(effect, c1628630sU1, c1628640sU2);
        this.LLILZ = interfaceC194555119tLIZIZ;
        interfaceC194555119tLIZIZ.LIZ(this.LL);
    }
}
