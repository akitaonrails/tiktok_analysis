package com.bytedance.android.livesdk.broadcast.trymode.guide;

import X.C01GW;
import X.C292401Bi;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class TryModeTopGuidanceWidget extends GuidanceBaseWidget {
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 205));

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h5t;
    }

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, ShowTopGuideChannel.class, new AwS591S0100000_12(this, 464));
        }
        View view = getView();
        if (view != null) {
            view.setClickable(true);
        }
        ((View) this.LLILZ.getValue()).setBackgroundResource(0);
    }
}
