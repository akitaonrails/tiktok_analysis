package com.bytedance.android.livesdk.billboard.broadcast;

import X.C1085270eLd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.DecorationBulletEditEvent;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBroadcastPreviewBillboardWidget extends PreviewWidget {
    public final C1085270eLd LLILZ = new C1085270eLd(new AwS561S0100000_17(this, 104), true);

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        this.LLILZ.getClass();
        return R.layout.g0x;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZ.LJI();
        this.dataChannel.BQ2(this, DecorationBulletEditEvent.class, new AwS596S0100000_17(this, 89));
    }
}
