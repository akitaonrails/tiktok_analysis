package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.C2218921Bsw;
import X.InterfaceC2218911Bsv;
import X.InterfaceC2218931Bsx;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes35.dex */
public final class ARSenorPresenter extends BaseSenorPresenter {
    public final boolean LLIZ;
    public final InterfaceC2218911Bsv LLIZLLLIL;
    public final int LLJ;
    public C2218921Bsw LLJI;
    public final InterfaceC2218931Bsx LLJIJIL;

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7 A[PHI: r13
      0x00e7: PHI (r13v2 android.hardware.Sensor) = (r13v1 android.hardware.Sensor), (r13v3 android.hardware.Sensor) binds: [B:23:0x00d4, B:25:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC1623040sL0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void register() {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter.register():void");
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC1623040sL0
    public final void unRegister() {
        super.unRegister();
        C2218921Bsw c2218921Bsw = this.LLJI;
        if (c2218921Bsw != null) {
            c2218921Bsw.disable();
        }
    }

    public ARSenorPresenter(Context context, LifecycleOwner lifecycleOwner, boolean z, InterfaceC2218911Bsv interfaceC2218911Bsv, Handler handler, int i) {
        super(context, lifecycleOwner, handler);
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC2218911Bsv;
        this.LLJ = i;
        this.LLJIJIL = interfaceC2218911Bsv.LIZIZ();
    }
}
