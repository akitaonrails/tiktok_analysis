package com.bytedance.android.livesdk.comp.impl.event.widget;

import X.C0IJT;
import X.C12ES;
import X.C1324720kZq;
import X.C16FS;
import X.C474500IjA;
import X.C497740JfY;
import X.C512970K9v;
import X.C512980K9w;
import X.C786410Ut5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ViewAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.event.api.data.PaidEventAmountChannel;
import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventMaskWidget;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePaidEventMaskWidget extends LiveWidget {
    public final boolean LL = true;
    public final C1324720kZq LLILLJJLI;
    public Room LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0r;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        show();
        this.LLILLL = (Room) this.dataChannel.gg0(RoomChannel.class);
        View viewFindViewById = findViewById(R.id.q0t);
        if (viewFindViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            int iLJIIIIZZ = ((int) (((double) C12ES.LJIIIIZZ(this.context)) * 0.3d)) - C497740JfY.LJIJ();
            int iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
            marginLayoutParams.setMargins(iLIZIZ, iLJIIIIZZ, iLIZIZ, 0);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_paid_event_stop_page_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LIZ();
        C16FS c16fs = (C16FS) findViewById(R.id.q0n);
        C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0K9u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C468250IXv.LIZIZ(this.LL.dataChannel, "purchase");
                LivePaidEventMaskWidget livePaidEventMaskWidget = this.LL;
                Room room = livePaidEventMaskWidget.LLILLL;
                if (room != null) {
                    C0IZS.LIZ(livePaidEventMaskWidget.context, room, "paid_event_stop_page");
                }
            }
        });
        c16fs.LJ();
        this.dataChannel.EQ2(this, PaidEventAmountChannel.class, new C512980K9w(c16fs));
        if (this.LL) {
            C786410Ut5.T4(this.contentView, 0.0f);
            C1324720kZq c1324720kZq = this.LLILLJJLI;
            if (c1324720kZq != null) {
                C786410Ut5.h5(c1324720kZq, 0.0f);
            }
            View view = this.contentView;
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewAnimator.ALPHA, view.getAlpha(), 1.0f).setDuration(700L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<C1324720kZq, Float>) ViewAnimator.ALPHA, this.contentView.getAlpha(), 1.0f).setDuration(700L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(duration, duration2);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.start();
        }
        this.dataChannel.BQ2(this, PaidEventStatusChannel.class, new C512970K9v(this));
    }

    public LivePaidEventMaskWidget(C1324720kZq c1324720kZq) {
        this.LLILLJJLI = c1324720kZq;
    }
}
