package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UJN;
import X.C0UJR;
import X.C0UJW;
import X.C1161920gLG;
import X.C2188811AlT;
import X.C760180Trs;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import webcast.data.BottomContainerComponent;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewRevisionCustomBaseWidget extends PreviewToolBaseWidget {
    public int LLILZLL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return 0;
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return 0;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String M1() {
        LiveMode liveMode;
        BottomContainerComponent bottomContainerComponentLIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            return null;
        }
        int i = C0UJR.LIZ[liveMode.ordinal()];
        if (i == 1) {
            boolean z = C0UJW.LIZ;
            return C0UJW.LIZJ(this.LLILZLL);
        }
        if (i != 2 || (bottomContainerComponentLIZ = C0UJN.LIZ(this.LLILZLL)) == null) {
            return null;
        }
        return bottomContainerComponentLIZ.iconUrl;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String P1() {
        LiveMode liveMode;
        BottomContainerComponent bottomContainerComponentLIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            return null;
        }
        int i = C0UJR.LIZ[liveMode.ordinal()];
        if (i == 1) {
            boolean z = C0UJW.LIZ;
            return C0UJW.LIZLLL(this.LLILZLL);
        }
        if (i != 2 || (bottomContainerComponentLIZ = C0UJN.LIZ(this.LLILZLL)) == null) {
            return null;
        }
        return bottomContainerComponentLIZ.name;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String Q1() {
        LiveMode liveMode;
        BottomContainerComponent bottomContainerComponentLIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            return null;
        }
        int i = C0UJR.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2 || (bottomContainerComponentLIZ = C0UJN.LIZ(this.LLILZLL)) == null) {
                return null;
            }
            return bottomContainerComponentLIZ.tuxUrl;
        }
        boolean z = C0UJW.LIZ;
        BottomContainerComponent bottomContainerComponentLIZ2 = C0UJW.LIZ(this.LLILZLL);
        if (bottomContainerComponentLIZ2 != null) {
            return bottomContainerComponentLIZ2.tuxUrl;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer R1() {
        return Integer.valueOf(this.LLILZLL);
    }

    public final String W1() {
        LiveMode liveMode;
        BottomContainerComponent bottomContainerComponentLIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            return null;
        }
        int i = C0UJR.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2 || (bottomContainerComponentLIZ = C0UJN.LIZ(this.LLILZLL)) == null) {
                return null;
            }
            return bottomContainerComponentLIZ.schema;
        }
        boolean z = C0UJW.LIZ;
        BottomContainerComponent bottomContainerComponentLIZ2 = C0UJW.LIZ(this.LLILZLL);
        if (bottomContainerComponentLIZ2 != null) {
            return bottomContainerComponentLIZ2.schema;
        }
        return null;
    }

    public final String X1() {
        Map<String, String> map;
        BottomContainerComponent bottomContainerComponentLIZ;
        Map<String, String> map2;
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? -1 : C0UJR.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2 || (bottomContainerComponentLIZ = C0UJN.LIZ(this.LLILZLL)) == null || (map2 = bottomContainerComponentLIZ.trackExtra) == null) {
                return null;
            }
            return map2.get("component_name");
        }
        boolean z = C0UJW.LIZ;
        BottomContainerComponent bottomContainerComponentLIZ2 = C0UJW.LIZ(this.LLILZLL);
        if (bottomContainerComponentLIZ2 == null || (map = bottomContainerComponentLIZ2.trackExtra) == null) {
            return null;
        }
        return map.get("component_name");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i1y : R.layout.i1x;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        C760180Trs.LJIIJJI(this.dataChannel, X1());
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        V1(getView());
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("custom_");
        sbLIZ.append(this.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        C760180Trs.LJIIIZ(this.dataChannel, X1());
        try {
            if (!TextUtils.isEmpty(W1())) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(view.getContext(), W1());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
