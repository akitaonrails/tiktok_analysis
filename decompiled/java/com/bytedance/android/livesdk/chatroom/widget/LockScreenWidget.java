package com.bytedance.android.livesdk.chatroom.widget;

import X.C0J1N;
import X.C11RD;
import X.C473130Igx;
import X.C784440Upu;
import X.C786410Ut5;
import Y.AfS176S0100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.LockScreenEvent;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class LockScreenWidget extends LiveRecyclableWidget implements View.OnClickListener {
    public LiveIconView LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i08;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(LockScreenEvent.class);
            this.dataChannel.zW(LockScreenChannel.class, Boolean.valueOf(!this.LLILLJJLI));
            this.dataChannel.FQ2(ResetSilentTimerEvent.class);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C786410Ut5.I7(this, getView());
        this.LL = (LiveIconView) getView().findViewById(R.id.cr1);
        ((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LIZJ(C11RD.LJ(this))).LIZJ(new AfS176S0100000_7(this, 170));
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.em2);
        }
    }
}
