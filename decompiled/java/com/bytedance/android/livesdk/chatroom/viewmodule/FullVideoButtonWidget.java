package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C011Z;
import X.C0IMS;
import X.C0IMT;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C20736316Cj;
import X.C468250IXv;
import X.C494680Jac;
import X.C497740JfY;
import X.C751340Tdc;
import X.C786410Ut5;
import X.C924790aAn;
import Y.ACListenerS142S0100000_7;
import Y.AObjectS350S0100000_7;
import android.content.Context;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.room.ChangeOrientationButtonShowData;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkApplyingChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkInvitedChannel;
import com.bytedance.android.livesdk.dataChannel.AudienceDefinitionSwitchTipsChannel;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.IsVideoViewChangeForHostChannel;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class FullVideoButtonWidget extends RoomWidget {
    public long LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public LiveIconView LLILZIL;
    public boolean LLILZLL;
    public EnterRoomConfig LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C0IMS LLJI = new C0IMT() { // from class: X.0IMS
        @Override // X.C0IMT
        public final void onChanged(Object obj) {
            FullVideoButtonWidget fullVideoButtonWidget = this.LL;
            Integer num = (Integer) obj;
            fullVideoButtonWidget.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkStateObserver state = ");
            sbLIZ.append(num);
            C20441214yg.LJIIIZ("DebugFullVideoButton", C2188811AlT.LIZIZ(sbLIZ));
            if (num != null) {
                fullVideoButtonWidget.LLJIJIL = num.intValue();
                fullVideoButtonWidget.y1();
            }
        }
    };
    public int LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h36;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return false;
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        boolean z = LiveMtMockLandscapeSetting.INSTANCE.getValue() || !(room == null || room.isStar() || (!room.isThirdParty && !room.isScreenshot));
        if (room != null) {
            this.LLILZLL = room.multiStreamScene == 1;
        }
        if (!z) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        return z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C468250IXv.LIZJ(this.dataChannel) || C494680Jac.LJI(this.dataChannel)) {
            return;
        }
        if (this.LLIZLLLIL) {
            Map<String, Object> map = C1338270kvh.LIZ;
        } else {
            if (this.LLJ) {
                return;
            }
            super.show();
            this.dataChannel.zW(ChangeOrientationButtonShowData.class, Boolean.TRUE);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x1() {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            boolean r3 = X.C468250IXv.LIZJ(r0)
            boolean r0 = com.bytedance.android.livesdk.livesetting.other.GameDualDeviceVerticalFullVideoEnabled.enable()
            r2 = 1
            if (r0 == 0) goto L31
            android.graphics.Rect r0 = X.C464030IHp.LJIIIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            boolean r0 = X.C0IKK.LIZ(r0)
            if (r0 == 0) goto L31
            r1 = 1
        L18:
            if (r3 != 0) goto L33
            boolean r0 = r4.LLILLL
            if (r0 == 0) goto L33
            boolean r0 = r4.LLILLJJLI
            if (r0 != 0) goto L30
            com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch.INSTANCE
            boolean r0 = r0.isExperimentGroup()
            if (r0 == 0) goto L2e
            boolean r0 = r4.LLILZLL
            if (r0 != 0) goto L30
        L2e:
            if (r1 == 0) goto L33
        L30:
            return r2
        L31:
            r1 = 0
            goto L18
        L33:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget.x1():boolean");
    }

    public final void y1() {
        if (this.LLILZIL == null) {
            return;
        }
        int i = this.LLJIJIL;
        if (i == 1 || i == 2) {
            this.LLILZ = true;
            C786410Ut5.i5(this.LLILZIL, 0.5f);
        } else if (this.LLJILJIL || this.LLJILJILJ) {
            this.LLILZ = true;
            C786410Ut5.i5(this.LLILZIL, 0.5f);
        } else {
            this.LLILZ = false;
            C786410Ut5.i5(this.LLILZIL, 1.0f);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (getView() != null) {
            this.LLILZIL = (LiveIconView) getView().findViewById(R.id.kez);
        }
        if (this.LLILZIL != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
            this.LLILZIL.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            this.LLILZIL.setBackgroundResource(R.drawable.f1q);
            this.LLILZIL.setIconAttr(R.attr.dss);
            LiveIconView liveIconView = this.LLILZIL;
            liveIconView.setIconTint(C20736316Cj.LIZJ(R.attr.ee, liveIconView));
            this.LLILZIL.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            C786410Ut5.LLJJIJIL(this.LLILZIL, 0);
        }
        this.LL = ((Long) this.dataChannel.gg0(C751340Tdc.class)).longValue();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.EQ2(this, VideoOrientationChangeChannel.class, new AObjectS350S0100000_7(this, 76));
        dataChannel.EQ2(this, FirstFrameChannelEvent.class, new AObjectS350S0100000_7(this, 78));
        dataChannel.BQ2(this, AudienceDefinitionSwitchTipsChannel.class, new AObjectS350S0100000_7(this, 79));
        dataChannel.EQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AObjectS350S0100000_7(this, 80));
        dataChannel.EQ2(this, PaidEventStatusChannel.class, new AObjectS350S0100000_7(this, 81));
        dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AObjectS350S0100000_7(this, 82));
        dataChannel.EQ2(this, IsVideoViewChangeForHostChannel.class, new AObjectS350S0100000_7(this, 83));
        dataChannel.EQ2(this, GameLinkApplyingChannel.class, new AObjectS350S0100000_7(this, 84));
        dataChannel.EQ2(this, GameLinkInvitedChannel.class, new AObjectS350S0100000_7(this, 85));
        dataChannel.EQ2(this, AudienceVideoViewParams.class, new AObjectS350S0100000_7(this, 77));
        C924790aAn.LIZLLL().LIZ(this.LLJI);
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 177), getView());
        String strValueOf = String.valueOf(this.LL);
        IDefinitionService iDefinitionService = (IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.EJ0(this.LLIZ, String.valueOf(strValueOf));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C924790aAn.LIZLLL().LIZJ(this.LLJI);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
        boolean zIo0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Io0(room);
        if (room != null && zIo0) {
            hide();
        }
    }
}
