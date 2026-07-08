package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UKZ;
import X.C500260Jjc;
import X.C760180Trs;
import Y.ARunnableS12S1100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class LiveGoalRevisionPreviewWidget extends LiveGoalPreviewWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gzx;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "live_goal");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        View view;
        super.onShow();
        C760180Trs.LJIIJJI(this.dataChannel, "live_goal");
        if (C760180Trs.LJII()) {
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            Boolean bool = C0UKZ.LLILLJJLI.LIZIZ().get(strValueOf);
            if (!C500260Jjc.LJJIFFI(Boolean.valueOf(bool != null ? bool.booleanValue() : false)) || (view = this.contentView) == null) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS12S1100000_7(this, strValueOf, 1));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
    }
}
