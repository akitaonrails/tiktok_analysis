package com.bytedance.android.livesdk.game.broadcast.widget;

import X.C011Z;
import X.C1143680frq;
import X.C20736316Cj;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraClickMockChannel;
import com.bytedance.android.livesdk.livesetting.game.GameDualDevicePadModeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceFlipPowerWidget extends LiveRecyclableWidget {
    public final String LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;

    public DualDeviceFlipPowerWidget() {
        this(null, false, 3);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LLILLJJLI ? R.layout.gmj : R.layout.gmk;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (this.LLILLJJLI) {
            ImageView imageView = (ImageView) findViewById(R.id.rmz);
            if (imageView != null && (imageView instanceof LiveIconView)) {
                if (GameDualDevicePadModeSetting.INSTANCE.isEnabled()) {
                    int iLIZIZ = (int) C497740JfY.LIZIZ(11.0f);
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(12.5f);
                    imageView.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ, iLIZIZ2);
                }
                LiveIconView liveIconView = (LiveIconView) imageView;
                liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.c9i, this.context));
                liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.d0v, this.context));
            }
        } else {
            View view = getView();
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.rn8);
                if (textView != null) {
                    String strLJIJI = this.LL;
                    if (strLJIJI == null) {
                        strLJIJI = C497740JfY.LJIJI(2131843014);
                    }
                    textView.setText(strLJIJI);
                }
                View viewFindViewById = view.findViewById(R.id.rmz);
                if (viewFindViewById != null) {
                    C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_game_demand_2", "ttlive_dual_device_camera_flip.png");
                }
            }
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 202), view2);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LiveDualDeviceFlipCameraClickMockChannel.class, new AwS591S0100000_12(this, 542));
        }
    }

    public DualDeviceFlipPowerWidget(String str, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = true;
    }
}
