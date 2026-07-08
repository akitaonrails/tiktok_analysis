package com.bytedance.android.livesdk.broadcast.guide;

import X.C01GW;
import X.C1324720kZq;
import X.C292401Bi;
import X.InterfaceC1320850kTb;
import android.graphics.drawable.Animatable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.GuidanceVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class GuidanceBaseWidget extends AnimatableRecyclableWidget {
    public final C01GW LL = C292401Bi.LIZ(new AwS556S0100000_12(this, 158));
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 157));
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 156));

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.gzz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1324720kZq x1() {
        return (C1324720kZq) this.LL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        Animatable animatableLIZ;
        super.hide();
        InterfaceC1320850kTb controller = x1().getController();
        if (controller != null && (animatableLIZ = controller.LIZ()) != null && animatableLIZ.isRunning()) {
            animatableLIZ.stop();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GuidanceVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        super.onHideAnimationEnd();
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        super.onShowAnimationStart();
        show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GuidanceVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        cancelShowAnimation();
        cancelHideAnimation();
        hide();
    }
}
