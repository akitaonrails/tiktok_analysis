package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C01C5;
import X.C0IJT;
import X.C0IXQ;
import X.C0IZP;
import X.C1161920gLG;
import X.C465900IOu;
import X.C467800IWc;
import X.C474500IjA;
import X.C500260Jjc;
import X.C751980Tee;
import X.C784440Upu;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.livesdk.dataChannel.HideParentCloseEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdatePerformanceOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class CloseWidget extends PerformProcessWidget {
    public long LL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.InterfaceC1078250eAJ
    public final void LJLIL() {
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(HideParentCloseEvent.class, Boolean.TRUE);
        }
        if (!y1() || (dataChannel = this.dataChannel) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        C0IZP.LIZLLL("close", room, Long.valueOf(this.LL));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return LiveMainFrameworkUpdatePerformanceOptSetting.INSTANCE.enable() ? R.layout.hzs : R.layout.hzr;
    }

    public final boolean y1() {
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            return iRoomFunctionService.Tt1(this.dataChannel);
        }
        return false;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.InterfaceC1078250eAJ
    public final void X0() {
        if (y1()) {
            this.LL = System.currentTimeMillis();
        }
    }

    public final void x1() {
        C784440Upu.LIZ().LIZIZ(new C465900IOu(6));
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_exit_liveroom_click", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJIJJLI(this.dataChannel);
        String str = C467800IWc.LJIJJLI;
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        c474500IjALIZIZ.LJJII(Integer.valueOf(c467800IWc.LJI() ? 1 : 0), str);
        c474500IjALIZIZ.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
        c474500IjALIZIZ.LJJII(c467800IWc.LIZIZ(), "entrance_type");
        c474500IjALIZIZ.LIZ();
        z1("livesdk_liveroom_close_btn_click");
        ((ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class)).clearId();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LiveIconView liveIconView;
        LiveIconView liveIconView2;
        DataChannel dataChannel;
        Room room;
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 176), view);
        }
        if (!y1() && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C0IZP.LIZJ(room, "close");
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(HideParentCloseEvent.class, Boolean.TRUE);
        }
        if (!LiveMainFrameworkUpdatePerformanceOptSetting.INSTANCE.enable()) {
            View view2 = getView();
            if ((view2 instanceof LiveIconView) && (liveIconView2 = (LiveIconView) view2) != null) {
                liveIconView2.setIconAttr(R.attr.cy0);
            }
            View view3 = getView();
            if ((view3 instanceof LiveIconView) && (liveIconView = (LiveIconView) view3) != null) {
                liveIconView.LJ();
            }
        }
        z1("livesdk_liveroom_close_btn_show");
    }

    public final void z1(String str) {
        Long lValueOf;
        String str2;
        Long lValueOf2;
        LiveMode liveModeLIZJ;
        Room roomLJJLIIIIJ;
        User owner;
        Room roomLJJLIIIIJ2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        DataChannel dataChannel = this.dataChannel;
        String str3 = null;
        if (dataChannel != null && (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && C500260Jjc.LJIIZILJ(dataChannel2)) {
            str2 = "anchor";
        } else {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && C01C5.LIZ(dataChannel3)) {
                str2 = "admin";
            } else {
                str2 = "viewer";
            }
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel4)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel5)) != null) {
            str3 = liveModeLIZJ.logStreamingType;
        }
        c474500IjALIZ.LJJII(str3, "live_type");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIILIIL(), "event_page");
        c474500IjALIZ.LIZ();
    }
}
