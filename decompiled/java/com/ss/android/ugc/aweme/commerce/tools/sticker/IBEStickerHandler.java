package com.ss.android.ugc.aweme.commerce.tools.sticker;

import X.AbstractC1622390sJx;
import X.C1623370sLX;
import X.C1627370sRz;
import X.C786410Ut5;
import X.InterfaceC1623110sL7;
import Y.ARunnableS5S1101000_22;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes23.dex */
public final class IBEStickerHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, GenericLifecycleObserver {
    public final ShortVideoContext LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public Effect LLILZ;

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        if (shortVideoContext != null) {
            shortVideoContext.creativeModel.commerceModel.getIbeContext().setMetadata(null);
        }
        this.LLILZ = null;
    }

    public IBEStickerHandler(ShortVideoContext shortVideoContext) {
        this.LLILLJJLI = shortVideoContext;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILZ = c1627370sRz.LIZ;
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS5S1101000_22(i, this, str, 0));
    }
}
