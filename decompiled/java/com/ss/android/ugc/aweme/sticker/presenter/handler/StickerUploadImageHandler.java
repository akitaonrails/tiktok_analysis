package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.AbstractC1622390sJx;
import X.C1623370sLX;
import X.C1624570sNT;
import X.C1627370sRz;
import X.InterfaceC1623110sL7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerUploadImageHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, GenericLifecycleObserver {
    public Effect LLILLJJLI;

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILLJJLI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624570sNT.LJJI(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILLJJLI = c1627370sRz.LIZ;
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (C1624570sNT.LJJI(this.LLILLJJLI) && i == 69 && i2 == 1) {
            throw null;
        }
    }
}
