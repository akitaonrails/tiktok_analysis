package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0KYL;
import X.C0UQX;
import X.C1161920gLG;
import X.C20441214yg;
import X.C354201Zc;
import X.C497740JfY;
import X.C760370TsB;
import X.C786410Ut5;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNewGameBroadcastBannerHelpPageScheme;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewHelpWidget extends PreviewToolBaseWidget {
    public final int LLILZLL = 2131841804;
    public final int LLIZ = R.drawable.erp;

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        W1("show");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        ImageView imageView;
        super.E1();
        View view = getView();
        if (view == null || (imageView = (ImageView) view.findViewById(R.id.widget_icon)) == null) {
            return;
        }
        C786410Ut5.Qb(imageView, C497740JfY.LJJ() ? -1.0f : 1.0f);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    public final void W1(String str) {
        String strLIZ;
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = "";
        }
        C0UQX.LJIIIIZZ(this.dataChannel, str, "help_tip_button", strLIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        String value = LiveNewGameBroadcastBannerHelpPageScheme.INSTANCE.getValue();
        if (value.length() > 0) {
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(value);
            c760370TsBLIZ.LJIIIIZZ("bottom");
            c760370TsBLIZ.LJIJJLI("bottom");
            c760370TsBLIZ.LJ(-16777216);
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.context, c760370TsBLIZ.LIZ().toString(), null);
        } else {
            C20441214yg.LJ("PreviewHelpWidget", "open LiveNewGameBroadcastBannerHelpPageScheme but scheme is empty!");
        }
        W1("click");
    }
}
