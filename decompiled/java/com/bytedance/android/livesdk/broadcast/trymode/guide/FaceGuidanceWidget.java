package com.bytedance.android.livesdk.broadcast.trymode.guide;

import X.C011Z;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class FaceGuidanceWidget extends LiveWidget {
    public final ARunnableS112S0100000_12 LL = new ARunnableS112S0100000_12(this, 101);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hqq;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, ShowFaceGuideEvent.class, new AwS591S0100000_12(this, 463));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJIIIZ();
    }
}
