package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C0UFE;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C262100zr;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C753070TgP;
import X.EnumC2636010g;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalPresetWebLinkSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS95S0110000_7;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.perception.MultiViolationStatusResponse;

/* JADX INFO: loaded from: classes8.dex */
public class LiveGoalPreviewWidget extends PreviewWidget implements InterfaceC1141530foN {
    public String LLILZ = "";
    public TextView LLILZIL;
    public View LLILZLL;
    public MultiViolationStatusResponse.ViolationData LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.gzw;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget.E1():void");
    }

    public final void I1() {
        LiveMode liveMode;
        String value = LiveStreamGoalPresetWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("entrance", "golive");
            DataChannel dataChannel = this.dataChannel;
            builderAppendQueryParameter.appendQueryParameter("live_type", (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? null : liveMode.logStreamingType).appendQueryParameter("enable_code_cache", SecondPageCodeCacheABSetting.INSTANCE.isMatch() ? "1" : CardStruct.IStatusCode.DEFAULT);
            value = builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, value);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        LiveLOP0OptSetting liveLOP0OptSetting = LiveLOP0OptSetting.INSTANCE;
        if (liveLOP0OptSetting.enable()) {
            super.show();
        } else if (liveLOP0OptSetting.disable() && C753070TgP.LJFF(this.dataChannel, AFwS237S0000000_7.get$arr$(322), null) == C0UFE.ON) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        LiveLOP0OptSetting liveLOP0OptSetting = LiveLOP0OptSetting.INSTANCE;
        if (liveLOP0OptSetting.enable()) {
            if (C500260Jjc.LJJJJIZL(getView())) {
                return;
            }
            show();
        } else if (liveLOP0OptSetting.disable() && C753070TgP.LJFF(this.dataChannel, AFwS237S0000000_7.get$arr$(322), null) == C0UFE.ON) {
            if (C500260Jjc.LJJJJIZL(getView())) {
                return;
            }
            show();
        } else if (C500260Jjc.LJJJJIZL(getView())) {
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_golive_add_stream_goal_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIL();
        G1(c474500IjALIZIZ);
        c474500IjALIZIZ.LIZ();
    }

    public final void G1(C474500IjA c474500IjA) {
        String str;
        LiveMode liveMode;
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjA.LJJII(this.LLILZ, "enter_from");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            str = liveMode.logStreamingType;
        } else {
            str = null;
        }
        c474500IjA.LJJ(str);
    }

    public final void H1(boolean z) {
        if (z) {
            TextView textView = this.LLILZIL;
            if (textView != null) {
                textView.setText(C497740JfY.LJIJI(2131842711));
            }
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_target_fill_tick);
            }
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.exp);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_edit_live_goal_show");
            G1(c474500IjALIZ);
            c474500IjALIZ.LIZ();
        } else {
            TextView textView2 = this.LLILZIL;
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJI(2131842013));
            }
            TuxIconView tuxIconView3 = this.LLIZLLLIL;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_target_fill);
            }
            TuxIconView tuxIconView4 = this.LLIZLLLIL;
            if (tuxIconView4 != null) {
                tuxIconView4.setTintColorRes(R.attr.exp);
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_golive_add_live_goal_show");
            G1(c474500IjALIZ2);
            c474500IjALIZ2.LIZ();
        }
        View view = this.contentView;
        if (view != null) {
            C500260Jjc.LJLIIIL(1000L, view, new AwS95S0110000_7(this, z, 0));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer numValueOf;
        if (Intrinsics.LJFF("live_goal_update_event", c262100zr.LIZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "goalStatus", 0));
            } else {
                numValueOf = null;
            }
            int code = EnumC2636010g.ONGOING.getCode();
            if (numValueOf != null && numValueOf.intValue() == code) {
                H1(true);
                return;
            }
            int code2 = EnumC2636010g.DELETED.getCode();
            if (numValueOf == null || numValueOf.intValue() != code2) {
                return;
            }
            H1(false);
        }
    }
}
