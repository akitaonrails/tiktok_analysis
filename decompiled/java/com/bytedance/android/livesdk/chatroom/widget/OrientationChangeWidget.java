package com.bytedance.android.livesdk.chatroom.widget;

import X.C0IJT;
import X.C0J1N;
import X.C0TZO;
import X.C1161920gLG;
import X.C11RD;
import X.C473130Igx;
import X.C474500IjA;
import X.C520010KaN;
import X.C751340Tdc;
import X.C784440Upu;
import X.C786410Ut5;
import X.C924790aAn;
import Y.AfS176S0100000_7;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class OrientationChangeWidget extends LiveRecyclableWidget implements View.OnClickListener {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxy;
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
        int requestedOrientation;
        IDefinitionService iDefinitionService;
        int i = 0;
        Activity activityLJIJ = C520010KaN.LJIJ(getContext(), false);
        if (getContext() != null && activityLJIJ != null) {
            requestedOrientation = activityLJIJ.getRequestedOrientation();
        } else {
            requestedOrientation = 0;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(OrientationChangeEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(ResetSilentTimerEvent.class);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screen_rotate");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("landscape_to_portrait", "type");
        c474500IjALIZ.LJJII("landscape", "room_orientation");
        if (C924790aAn.LIZLLL().LJFF() || C924790aAn.LIZLLL().LJI()) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_multi_guest");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIILJJIL("live_landscape");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            Object objGg0 = dataChannel3.gg0(C751340Tdc.class);
            Long l = (Long) this.dataChannel.gg0(AudienceShowOrientationBeginTime.class);
            if (objGg0 != null && l != null && (iDefinitionService = (IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class)) != null) {
                iDefinitionService.vu2(1, requestedOrientation, ((Integer) this.dataChannel.gg0(C0TZO.class)).intValue(), l.longValue(), String.valueOf(objGg0), "click");
                this.dataChannel.zW(AudienceShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C786410Ut5.I7(this, getView());
        ((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LIZJ(C11RD.LJ(this))).LIZJ(new AfS176S0100000_7(this, 171));
    }
}
