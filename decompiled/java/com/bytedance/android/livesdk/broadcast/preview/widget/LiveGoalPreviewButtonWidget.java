package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C0UFE;
import X.C0UNN;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C262100zr;
import X.C354201Zc;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C501380JlQ;
import X.C753070TgP;
import X.C760180Trs;
import X.C814420VxA;
import X.EnumC2636010g;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.broadcast.LiveGoalViolationStatusChannel;
import com.bytedance.android.livesdk.broadcast.LiveOnGoingGoalChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalPresetWebLinkSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.perception.MultiViolationStatusResponse;

/* JADX INFO: loaded from: classes8.dex */
public class LiveGoalPreviewButtonWidget extends PreviewToolBaseWidget implements InterfaceC1141530foN {
    public boolean LLIZLLLIL;
    public MultiViolationStatusResponse.ViolationData LLJ;
    public final int LLILZLL = 2131842030;
    public final int LLIZ = R.drawable.eqf;
    public String LLJI = "";
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 32));

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        String str;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (str = (String) dataChannel.gg0(C0UNN.class)) == null) {
            str = "";
        }
        this.LLJI = str;
        super.E1();
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).syncGiftList(1);
        UserService.getInstance().user().LJIJ(UserService.getInstance().user().getCurrentUserId());
        C1548820qPI.LIZLLL("live_goal_update_event", this);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, LiveOnGoingGoalChannel.class, new AwS586S0100000_7(this, 35));
        }
        DataChannel dataChannel3 = this.dataChannel;
        this.LLJ = dataChannel3 != null ? (MultiViolationStatusResponse.ViolationData) dataChannel3.gg0(LiveGoalViolationStatusChannel.class) : null;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.EQ2(this, LiveGoalViolationStatusChannel.class, new AwS586S0100000_7(this, 36));
        }
        if (C760180Trs.LJFF()) {
            X1(false);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        C760180Trs.LJIIJJI(this.dataChannel, "live_goal");
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_golive_add_stream_goal_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIL();
        W1(c474500IjALIZIZ);
        c474500IjALIZIZ.LIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LiveModeChannel.class, new AwS586S0100000_7(this, 34));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C753070TgP.LJFF(this.dataChannel, AFwS237S0000000_7.get$arr$(321), null) == C0UFE.ON) {
            super.show();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C753070TgP.LJFF(this.dataChannel, AFwS237S0000000_7.get$arr$(321), null) == C0UFE.ON) {
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
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    public final void W1(C474500IjA c474500IjA) {
        String str;
        LiveMode liveMode;
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjA.LJJII(this.LLJI, "enter_from");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            str = liveMode.logStreamingType;
        } else {
            str = null;
        }
        c474500IjA.LJJ(str);
    }

    public final void X1(boolean z) {
        ImageView imageView;
        TuxIconView tuxIconView;
        int i;
        View view = getView();
        Integer numLIZJ = null;
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.widget_icon);
        } else {
            imageView = null;
        }
        if ((imageView instanceof TuxIconView) && (tuxIconView = (TuxIconView) imageView) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z) {
                i = R.raw.icon_target_tick_fill;
            } else {
                i = R.raw.icon_target;
            }
            c419910GdJ.LIZ = i;
            Context context = this.context;
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.exp, context);
            }
            c419910GdJ.LIZLLL = numLIZJ;
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    public final void Y1(boolean z) {
        ImageView imageView;
        this.LLIZLLLIL = z;
        if (z) {
            if (C760180Trs.LJFF()) {
                X1(true);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_edit_live_goal_show");
            W1(c474500IjALIZ);
            c474500IjALIZ.LIZ();
            return;
        }
        View view = getView();
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.widget_icon);
        } else {
            imageView = null;
        }
        T1(imageView);
        if (C760180Trs.LJFF()) {
            X1(false);
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_golive_add_live_goal_show");
        W1(c474500IjALIZ2);
        c474500IjALIZ2.LIZ();
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
                Y1(true);
                return;
            }
            int code2 = EnumC2636010g.DELETED.getCode();
            if (numValueOf == null || numValueOf.intValue() != code2) {
                return;
            }
            Y1(false);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        LiveMode liveMode;
        LiveMode liveMode2;
        boolean z = this.LLIZLLLIL;
        C760180Trs.LJIIIZ(this.dataChannel, "live_goal");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode2 = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LJFF(liveMode2) && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.showBottomLiveGoalBtn()) {
            str = "bottom";
        } else {
            str = "outside";
        }
        if (z) {
            str2 = "livesdk_golive_edit_live_goal_click";
        } else {
            str2 = "livesdk_golive_add_stream_goal_click";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        W1(c474500IjALIZ);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LIZ();
        MultiViolationStatusResponse.ViolationData violationData = this.LLJ;
        if (violationData != null && violationData.status == 1) {
            C501380JlQ.LIZ(this.context, this.dataChannel, violationData);
            return;
        }
        String value = LiveStreamGoalPresetWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("entrance", "golive");
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
                str3 = liveMode.logStreamingType;
            } else {
                str3 = null;
            }
            builderAppendQueryParameter.appendQueryParameter("live_type", str3);
            value = builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, value);
    }
}
