package com.bytedance.android.livesdk.broadcast.preview.widget.upsell;

import X.C1308910kAL;
import X.C419910GdJ;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class GameSimpleModeIntroductionWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i19;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        TuxIconView tuxIconView;
        super.C1();
        View view = getView();
        if (view == null || (tuxIconView = (TuxIconView) view.findViewById(R.id.widget_icon)) == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_game_controller;
        Context context = this.context;
        c419910GdJ.LIZLLL = context != null ? C1308910kAL.LIZJ(R.attr.exr, context) : null;
        tuxIconView.setTuxIcon(c419910GdJ);
    }
}
