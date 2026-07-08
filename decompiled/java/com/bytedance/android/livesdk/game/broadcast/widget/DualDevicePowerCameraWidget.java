package com.bytedance.android.livesdk.game.broadcast.widget;

import X.C011Z;
import X.C20736316Cj;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DualDevicePowerCameraWidget extends LiveRecyclableWidget {
    public final boolean LL;
    public ImageView LLILLJJLI;

    public DualDevicePowerCameraWidget() {
        this(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
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
        return this.LL ? R.layout.gmj : R.layout.gmk;
    }

    public DualDevicePowerCameraWidget(boolean z) {
        this.LL = z;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.rn8);
            if (textView != null) {
                textView.setText(C497740JfY.LJIJI(2131843013));
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.rmz);
            this.LLILLJJLI = imageView;
            if (this.LL) {
                if (imageView != null) {
                    imageView.setImageDrawable(C497740JfY.LJIIJ(R.drawable.err));
                }
                x1(false);
            } else if (imageView != null) {
                imageView.setBackground(C497740JfY.LJIIJ(R.drawable.erq));
            }
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 67), view2);
        }
    }

    public final void x1(boolean z) {
        int i;
        if (z) {
            i = R.attr.emt;
        } else {
            i = R.attr.emc;
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null && (imageView instanceof LiveIconView)) {
            LiveIconView liveIconView = (LiveIconView) imageView;
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.c9i, this.context));
            liveIconView.setIcon(C20736316Cj.LIZLLL(i, this.context));
        }
    }
}
