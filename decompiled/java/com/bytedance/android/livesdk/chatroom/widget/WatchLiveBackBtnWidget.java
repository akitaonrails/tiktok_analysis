package com.bytedance.android.livesdk.chatroom.widget;

import X.C0J1N;
import X.C1161920gLG;
import X.C11RD;
import X.C473130Igx;
import X.C784440Upu;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class WatchLiveBackBtnWidget extends LiveRecyclableWidget {
    public EnterRoomConfig LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxk;
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

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LiveIconView liveIconView;
        View view = getView();
        if (view != null && (liveIconView = (LiveIconView) view.findViewById(R.id.bn7)) != null) {
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                liveIconView.setIconAttr(R.attr.eny);
                C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0IJj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C784440Upu.LIZ().LIZIZ(new C465900IOu(6));
                        ((ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class)).clearId();
                    }
                });
            } else {
                liveIconView.setIconAttr(R.attr.d3e);
                C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 42));
            }
        }
        ((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LIZJ(C11RD.LJ(this))).LIZJ(new AfS176S0100000_7(this, 52));
    }
}
