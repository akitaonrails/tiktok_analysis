package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UJW;
import X.C0UKZ;
import X.C500260Jjc;
import X.C760180Trs;
import Y.ARunnableS12S1100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveGoalPreviewButtonRevisionWidget extends LiveGoalPreviewButtonWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String M1() {
        return C0UJW.LIZJ(12);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String P1() {
        return C0UJW.LIZLLL(12);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer R1() {
        return 12;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i1y : R.layout.i1x;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        View view;
        super.onShow();
        if (C760180Trs.LJII()) {
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            Boolean bool = C0UKZ.LLILLL.LIZIZ().get(strValueOf);
            if (!C500260Jjc.LJJIFFI(Boolean.valueOf(bool != null ? bool.booleanValue() : false)) || (view = this.contentView) == null) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS12S1100000_7(this, strValueOf, 0));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        super.onClick(view);
    }
}
