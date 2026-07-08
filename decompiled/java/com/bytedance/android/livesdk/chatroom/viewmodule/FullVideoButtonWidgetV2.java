package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C0IMQ;
import X.C0IMT;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C20736316Cj;
import X.C468250IXv;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751340Tdc;
import X.C786410Ut5;
import X.C924790aAn;
import Y.ACListenerS142S0100000_7;
import android.view.View;
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
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidgetV2;
import com.bytedance.android.livesdk.dataChannel.AudienceDefinitionSwitchTipsChannel;
import com.bytedance.android.livesdk.dataChannel.IsVideoViewChangeForHostChannel;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class FullVideoButtonWidgetV2 extends LiveRecyclableWidget {
    public long LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public LiveIconView LLILZ;
    public boolean LLILZIL;
    public EnterRoomConfig LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C0IMQ LLJ = new C0IMT() { // from class: X.0IMQ
        @Override // X.C0IMT
        public final void onChanged(Object obj) {
            Integer num = (Integer) obj;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkStateObserver state = ");
            sbLIZ.append(num);
            C20441214yg.LJIIIZ("DebugFullVideoButton", C2188811AlT.LIZIZ(sbLIZ));
            if (num != null) {
                num.intValue();
                if (num.intValue() != 1 && num.intValue() != 2) {
                    FullVideoButtonWidgetV2 fullVideoButtonWidgetV2 = this.LL;
                    fullVideoButtonWidgetV2.LLILLL = false;
                    LiveIconView liveIconView = fullVideoButtonWidgetV2.LLILZ;
                    if (liveIconView != null) {
                        C786410Ut5.i5(liveIconView, 1.0f);
                        return;
                    }
                    return;
                }
                FullVideoButtonWidgetV2 fullVideoButtonWidgetV22 = this.LL;
                fullVideoButtonWidgetV22.LLILLL = true;
                LiveIconView liveIconView2 = fullVideoButtonWidgetV22.LLILZ;
                if (liveIconView2 == null) {
                    return;
                }
                C786410Ut5.i5(liveIconView2, 0.5f);
            }
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h36;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLILLJJLI = false;
        this.LLILLL = false;
        this.LL = 0L;
        C924790aAn.LIZLLL().LIZJ(this.LLJ);
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
            this.LLILZIL = room.multiStreamScene == 1;
        }
        if (!z) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        return z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C468250IXv.LIZJ(this.dataChannel) || C494680Jac.LJI(this.dataChannel) || this.LLIZ || this.LLIZLLLIL) {
            return;
        }
        super.show();
        this.dataChannel.zW(ChangeOrientationButtonShowData.class, Boolean.TRUE);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final boolean x1() {
        if (C468250IXv.LIZJ(this.dataChannel) || !this.LLILLJJLI) {
            return LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && this.LLILZIL;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LiveIconView liveIconView;
        Map<String, Object> map = C1338270kvh.LIZ;
        View view = getView();
        if (view != null) {
            liveIconView = (LiveIconView) view.findViewById(R.id.kez);
        } else {
            liveIconView = null;
        }
        this.LLILZ = liveIconView;
        if (liveIconView != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
            liveIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            liveIconView.setBackgroundResource(R.drawable.f1q);
            liveIconView.setIconAttr(R.attr.dss);
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.ee, liveIconView.getContext()));
            liveIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            C786410Ut5.LLJJIJIL(liveIconView, 0);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long jLongValue;
        Long l = (Long) this.dataChannel.gg0(C751340Tdc.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LL = jLongValue;
        if (C500260Jjc.LJJJI(Boolean.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Io0((Room) this.dataChannel.gg0(RoomChannel.class))))) {
            hide();
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.EQ2(this, VideoOrientationChangeChannel.class, new AwS586S0100000_7(this, 71));
        dataChannel.BQ2(this, AudienceDefinitionSwitchTipsChannel.class, new AwS586S0100000_7(this, 72));
        dataChannel.EQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AwS586S0100000_7(this, 73));
        dataChannel.EQ2(this, PaidEventStatusChannel.class, new AwS586S0100000_7(this, 74));
        dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS586S0100000_7(this, 75));
        dataChannel.EQ2(this, IsVideoViewChangeForHostChannel.class, new AwS586S0100000_7(this, 76));
        dataChannel.EQ2(this, AudienceVideoViewParams.class, new AwS586S0100000_7(this, 77));
        C924790aAn.LIZLLL().LIZ(this.LLJ);
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 37), view);
        }
        String strValueOf = String.valueOf(this.LL);
        IDefinitionService iDefinitionService = (IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.EJ0(this.LLILZLL, strValueOf);
        }
    }
}
