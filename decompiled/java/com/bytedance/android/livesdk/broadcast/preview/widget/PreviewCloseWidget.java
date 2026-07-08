package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C20094213jo;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCloseWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i10;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (B1()) {
            return;
        }
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            DataChannel dataChannel = this.dataChannel;
            if ((dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null) == LiveMode.LIVE_VOICE) {
                return;
            }
            DataChannel dataChannel2 = this.dataChannel;
            if ((dataChannel2 != null ? dataChannel2.gg0(LiveModeChannel.class) : null) == LiveMode.SCREEN_RECORD || A1()) {
                return;
            }
        }
        C500260Jjc.LJLJL(C497740JfY.LJIJ(), getView());
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 142), view);
        }
        View view2 = getView();
        if (view2 != null) {
            final String strLJIJI = C497740JfY.LJIJI(2131840792);
            q0.LJIJ(view2, new C20094213jo() { // from class: X.0ToQ
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view3, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view3, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setContentDescription(strLJIJI);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
    }
}
