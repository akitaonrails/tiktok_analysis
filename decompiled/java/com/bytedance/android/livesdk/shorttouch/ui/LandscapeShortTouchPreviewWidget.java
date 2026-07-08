package com.bytedance.android.livesdk.shorttouch.ui;

import X.AbstractC1101760emE;
import X.C1101610elz;
import X.C1101840emM;
import X.C1101970emZ;
import X.C1102000emc;
import X.EnumC1101860emO;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes18.dex */
public final class LandscapeShortTouchPreviewWidget extends ShortTouchPreviewWidget {
    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, X.InterfaceC1101990emb
    public final void p1(C1101970emZ c1101970emZ) {
        C1101610elz c1101610elz = C1102000emc.LIZ;
        if (c1101610elz.LIZJ(EnumC1101860emO.ID, c1101970emZ.LIZIZ) != null) {
            x1(c1101970emZ);
        } else {
            c1101610elz.LJ();
        }
    }

    @Override // X.InterfaceC1102010emd
    public final void O0(AbstractC1101760emE abstractC1101760emE, C1101840emM c1101840emM) {
        c1101840emM.LIZIZ(false, this.isDestroyed);
        c1101840emM.LIZLLL(false);
    }
}
