package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C1161920gLG;
import X.C1338270kvh;
import X.C20441214yg;
import X.C2188811AlT;
import X.C501080Jkw;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameContinueDefinitionNullOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS63S1000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewDefinitionSelectionWidget extends PreviewToolBaseWidget {
    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return 2131840775;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        if (TtliveGameContinueDefinitionNullOptSetting.INSTANCE.enable()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                PushStreamInfo.Quality qualityWG1 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).WG1();
                if (qualityWG1 != null) {
                    C501080Jkw.LIZ(qualityWG1, true, "PreviewDefinitionSelectionWidget");
                }
                dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS63S1000000_12("PreviewDefinitionSelectionWidget", 0));
            }
        } else {
            PushStreamInfo.Quality qualityWG12 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).WG1();
            if (qualityWG12 != null) {
                W1(qualityWG12, true);
            }
            this.dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 1045));
        }
        this.dataChannel.EQ2(this, GameRoomCreateInfoChannel.class, new AwS591S0100000_12(this, 265));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(R.drawable.ekf);
    }

    public static void W1(PushStreamInfo.Quality quality, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectDefinition. fromDisk=");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        C20441214yg.LJIIIZ("PreviewDefinitionSelectionWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            ((IGameService) C1161920gLG.LIZJ(IGameService.class)).u71(quality);
        } else {
            Map<String, Object> map = C1338270kvh.LIZ;
            DataChannelGlobal.LLILZ.HQ2(BroadcastShareScreenDefinition.class, quality);
        }
    }
}
