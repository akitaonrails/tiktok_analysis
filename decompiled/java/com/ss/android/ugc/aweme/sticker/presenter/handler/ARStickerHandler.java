package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1622390sJx;
import X.C01GW;
import X.C1623050sL1;
import X.C1623370sLX;
import X.C1624570sNT;
import X.C1627370sRz;
import X.C19EG;
import X.C385670FAf;
import X.C452501pT;
import X.InterfaceC1623550sLp;
import X.InterfaceC1623560sLq;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class ARStickerHandler extends AbstractC1622390sJx implements GenericLifecycleObserver {
    public final Context LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C385670FAf<Boolean> LLILZ;
    public final InterfaceC1623560sLq LLILZIL;
    public final InterfaceC1623550sLp LLILZLL;
    public final int LLIZ = 10000;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 770));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJ() {
        this.LLILZIL.LJJZZI(true);
        this.LLILZIL.LJLJLJ();
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILZIL.LJJZZI(false);
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624570sNT.LJFF(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILZLL.LIZIZ((BaseSenorPresenter) this.LLIZLLLIL.getValue(), false);
    }

    public ARStickerHandler(C19EG c19eg, LifecycleOwner lifecycleOwner, C385670FAf c385670FAf, InterfaceC1623560sLq interfaceC1623560sLq, C1623050sL1 c1623050sL1) {
        this.LLILLJJLI = c19eg;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c385670FAf;
        this.LLILZIL = interfaceC1623560sLq;
        this.LLILZLL = c1623050sL1;
    }
}
