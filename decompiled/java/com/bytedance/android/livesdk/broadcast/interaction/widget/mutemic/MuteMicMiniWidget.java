package com.bytedance.android.livesdk.broadcast.interaction.widget.mutemic;

import X.C011Z;
import X.C0IJT;
import X.C0UPE;
import X.C0UR5;
import X.C0UR9;
import X.C1161920gLG;
import X.C1834150xpV;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C474500IjA;
import X.C500260Jjc;
import X.C768800UDu;
import X.C768810UDv;
import X.C771670UOv;
import X.C786410Ut5;
import X.EnumC771390UNt;
import X.InterfaceC766480U4w;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.DisableMuteMicEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicMiniWidgetClosedEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicSwitchClosedEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicSwitchClosedFromFloatingEvent;
import com.bytedance.android.livesdk.dataChannel.ResumeMiniWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastCpuOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MuteMicMiniWidget extends BaseSubShortCutPanelWidget {
    public C20743716Ff LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0m;
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        C0UPE c0upeLIZLLL = C771670UOv.LIZLLL();
        if (c0upeLIZLLL != null) {
            c0upeLIZLLL.LIZ = false;
        }
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(MuteMicMiniWidgetClosedEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        String str = this.LLILLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_mute_shortcut_panel_close");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII(str, "close_method");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C768810UDv.LIZ)) ? 1 : 0), "is_open");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - C768800UDu.LIZIZ), "use_time");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), Scene.SCENE_SERVICE);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.y74);
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.e44);
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.c9j, liveIconView.getContext()));
        }
        ((TextView) findViewById(R.id.y7t)).setTextColor(C20736316Cj.LIZIZ(R.attr.fxc, this.context));
        C20743716Ff c20743716Ff = (C20743716Ff) findViewById(R.id.oy8);
        if (c20743716Ff != null) {
            c20743716Ff.setDisabledAlpha(1.0f);
            c20743716Ff.setEnabled(false);
            c20743716Ff.setDebounceClickEnabled(true);
            c20743716Ff.setDelayInterval(500L);
            C1834150xpV.LJIIJ(c20743716Ff, true);
            C786410Ut5.k8(c20743716Ff, new ACListenerS147S0100000_12(this, 134));
        } else {
            c20743716Ff = null;
        }
        this.LLILZIL = c20743716Ff;
        LiveIconView liveIconView2 = (LiveIconView) findViewById(R.id.e1y);
        if (liveIconView2 != null) {
            liveIconView2.setIconTint(C20736316Cj.LIZIZ(R.attr.c9j, liveIconView2.getContext()));
            C500260Jjc.LJLIIIL(500L, liveIconView2, new AwS591S0100000_12(this, 211));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MuteMicChannel.class, new AwS591S0100000_12(this, 212));
            dataChannel.BQ2(this, MuteMicSwitchClosedEvent.class, new AwS591S0100000_12(this, 213));
            dataChannel.BQ2(this, ResumeMiniWidget.class, new AwS591S0100000_12(this, 214));
            dataChannel.BQ2(this, DisableMuteMicEvent.class, new AwS591S0100000_12(this, 215));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && C500260Jjc.LJJIZ(dataChannel2)) {
            this.dataChannel.CQ2(MuteMicSwitchClosedFromFloatingEvent.class, this, new AwS591S0100000_12(this, 216));
        }
        if (LiveBroadcastCpuOptSetting.enableV2WidgetManager()) {
            C20743716Ff c20743716Ff2 = this.LLILZIL;
            if (c20743716Ff2 != null) {
                c20743716Ff2.setChecked(C768810UDv.LIZ);
            }
            A1(null);
        }
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.dataChannel.zQ2(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C0UPE c0upeLIZLLL = C771670UOv.LIZLLL();
        if (c0upeLIZLLL != null) {
            c0upeLIZLLL.LIZ = true;
        }
        DataChannel dataChannel = this.dataChannel;
        C768800UDu.LIZIZ = System.currentTimeMillis();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_mute_shortcut_panel_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC766480U4w.LJJJ.LIZIZ()) ? 1 : 0), "is_sound_shortcut_panel_on");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), Scene.SCENE_SERVICE);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC771390UNt x1() {
        return EnumC771390UNt.MUTE_MIC;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    public MuteMicMiniWidget(C0UR5 c0ur5, C0UR9 c0ur9) {
        super(c0ur5, c0ur9);
    }
}
