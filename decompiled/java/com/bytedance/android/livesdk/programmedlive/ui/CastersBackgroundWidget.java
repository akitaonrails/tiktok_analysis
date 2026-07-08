package com.bytedance.android.livesdk.programmedlive.ui;

import X.C01GW;
import X.C19659111vp;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.InteractiveTopBarShowChannel;
import com.bytedance.android.livesdk.dataChannel.InteractiveTopBarViewTopChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class CastersBackgroundWidget extends LiveRecyclableWidget {
    public Room LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 82));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(85));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxx;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room == null) {
            return;
        }
        this.LL = room;
        View view = getView();
        if (view != null) {
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LJFF = Integer.valueOf(ColorProtector.parseColor("#33000000"));
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(10);
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(4);
            view.setBackground(c19659111vp.LIZ(this.context));
        }
        this.dataChannel.EQ2(this, CastersWidgetVisibleChannel.class, new AwS586S0100000_7(this, 173));
        this.dataChannel.EQ2(this, InteractiveTopBarShowChannel.class, new AwS586S0100000_7(this, 174));
        this.dataChannel.EQ2(this, InteractiveTopBarViewTopChannel.class, new AwS586S0100000_7(this, 175));
    }

    public final void x1(boolean z) {
        if (z) {
            View view = getView();
            if (view != null) {
                C786410Ut5.T4(view, 0.0f);
                view.animate().alpha(1.0f).setDuration(200L).setInterpolator((Interpolator) this.LLILLL.getValue()).withStartAction(new ARunnableS107S0100000_7(this, 98)).start();
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 == null) {
            return;
        }
        view2.animate().alpha(0.0f).setDuration(200L).setInterpolator((Interpolator) this.LLILLL.getValue()).withEndAction(new ARunnableS76S0200000_7(view2, this, 23)).start();
    }
}
