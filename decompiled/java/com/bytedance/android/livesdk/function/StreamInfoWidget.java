package com.bytedance.android.livesdk.function;

import X.C16F5;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS150S0100000_15;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInteractMixStreamTypeChannel;
import com.bytedance.android.livesdk.dataChannel.StreamInfoEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class StreamInfoWidget extends LiveRecyclableWidget {
    public C16F5 LL;
    public Object LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hn9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        hide();
        C16F5 c16f5 = this.LL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText("");
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C16F5) findViewById(R.id.wap);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LinkInteractMixStreamTypeChannel.class, new AwS594S0100000_15(this, 570));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, InteractStateChangeEvent.class, new AwS594S0100000_15(this, 571));
            dataChannel2.BQ2(this, StreamInfoEvent.class, new AwS594S0100000_15(this, 572));
        }
        View view = getView();
        if (view != null) {
            view.setBackgroundDrawable(C497740JfY.LJIIJ(R.color.b_));
        }
        C16F5 c16f5 = this.LL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        C786410Ut5.l8(c16f5, new ACListenerS150S0100000_15(this, 170));
    }
}
