package com.bytedance.android.livesdk.rank.impl.widget;

import X.C20736316Cj;
import X.C497740JfY;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class OnlineAudienceRankLandScapeWidget extends OnlineAudienceRankWidget {
    @Override // com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h8y;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        super.onInit(objArr);
        View view = getView();
        if (view != null) {
            Context context = view.getContext();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exm, context));
            gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(8.0f));
            view.setBackground(gradientDrawable);
        }
    }
}
