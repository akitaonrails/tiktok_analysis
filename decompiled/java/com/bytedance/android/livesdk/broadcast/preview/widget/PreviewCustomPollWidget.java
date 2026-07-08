package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01C3;
import X.C0KWM;
import X.C0KX8;
import X.C1161920gLG;
import X.C19EG;
import X.C354201Zc;
import X.C499890Jj1;
import X.C500260Jjc;
import X.C766270U4b;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.PreviewInteractHasEntranceEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class PreviewCustomPollWidget extends PreviewToolBaseWidget {
    public final int LLILZLL = 2131844495;
    public final int LLIZ = R.drawable.eqb;
    public long LLIZLLLIL;
    public Boolean LLJ;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel = this.dataChannel;
        LiveMode liveMode = dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null;
        C499890Jj1.LIZ(liveMode);
        super.show();
        if (C500260Jjc.LJJJI(liveMode != null ? Boolean.valueOf(C354201Zc.LJFF(liveMode)) : null) && Intrinsics.LJFF(this.LLJ, Boolean.FALSE)) {
            hide();
        } else {
            DataChannelGlobal.LLILZ.CQ2(LiveBanCapabilityGlobalChannel.class, this, new AwS586S0100000_7(this, 41));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        DataChannel dataChannel = this.dataChannel;
        LiveMode liveMode = dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null;
        C499890Jj1.LIZ(liveMode);
        show();
        if (!C500260Jjc.LJJJJIZL(getView()) || liveMode == null) {
            return;
        }
        C01C3.LJ(this.dataChannel, "go_live", C354201Zc.LIZ(liveMode), false, false, true);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        DataChannel dataChannel;
        LiveMode liveMode;
        super.E1();
        DataChannel dataChannel2 = this.dataChannel;
        if (!C500260Jjc.LJJJI((dataChannel2 == null || (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null) ? null : Boolean.valueOf(C354201Zc.LJFF(liveMode))) || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.EQ2(this, PreviewInteractHasEntranceEvent.class, new AwS586S0100000_7(this, 40));
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        LiveMode liveMode;
        RoomCreateInfo roomCreateInfo;
        C0KX8 c0kx8 = (C0KX8) DataChannelGlobal.LLILZ.gg0(LiveBanCapabilityGlobalChannel.class);
        boolean zLIZJ = false;
        if (c0kx8 != null && c0kx8.LIZLLL) {
            C766270U4b.LIZLLL(2131844184);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLIZLLLIL < 500) {
            return;
        }
        this.LLIZLLLIL = jUptimeMillis;
        H1();
        C19EG c19egLJ = C500260Jjc.LJ(this.context);
        if (c19egLJ != null) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null) {
                zLIZJ = C0KWM.LIZJ(Long.valueOf(roomCreateInfo.pollTemplateOptimizeGroup));
            }
            if (zLIZJ) {
                IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
                if (iRoomFunctionService != null) {
                    iRoomFunctionService.TU(c19egLJ, this.dataChannel, "go_live");
                }
            } else {
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Sc2("go_live", c19egLJ, this.dataChannel, false, "");
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
            C01C3.LIZJ(this.dataChannel, "go_live", false, false, false, true, C354201Zc.LIZ(liveMode), PreviewToolBaseWidget.G1(view));
        }
    }
}
