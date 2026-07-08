package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0R93;
import X.C1ACA;
import X.C2175231ABd;
import X.C2175241ABe;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS167S0100000_33;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ReportWidget extends LiveWatchPreviewWidget {
    public static final C2175241ABe LLJI = new Object() { // from class: X.1ABe
    };
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2096));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.df1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        C2175241ABe c2175241ABe = LLJI;
        C1ACA c1acaZ1 = z1();
        c2175241ABe.getClass();
        if (C0R93.LIZLLL(c1acaZ1 != null ? c1acaZ1.LJ : null)) {
            C2175231ABd.LIZ.getClass();
            if (C2175231ABd.LIZ()) {
                C786410Ut5.O7((FrameLayout) this.LLJ.getValue(), new ACListenerS167S0100000_33(this, 73));
                C786410Ut5.LJZ(0, (FrameLayout) this.LLJ.getValue());
                return;
            }
        }
        C786410Ut5.LJZ(8, (FrameLayout) this.LLJ.getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.dataChannel.zQ2(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
