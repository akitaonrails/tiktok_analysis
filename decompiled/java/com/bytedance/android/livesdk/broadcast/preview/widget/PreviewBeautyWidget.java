package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C0U8H;
import X.C0UF5;
import X.C0UHK;
import X.C0UIM;
import X.C0UJY;
import X.C0UX6;
import X.C1113800f5e;
import X.C13LE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C293501Bt;
import X.C474500IjA;
import X.C500260Jjc;
import X.C748880TZe;
import X.C760180Trs;
import X.C768460UCm;
import X.C770220UJg;
import X.C770730ULf;
import X.C781270Ukn;
import X.DialogInterfaceOnDismissListenerC786080UsY;
import X.EnumC1120860fH2;
import X.EnumC771350UNp;
import X.InterfaceC766480U4w;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.SchemaOpenBeautyPanelEvent;
import com.bytedance.android.live.effect.api.RefreshRedDotEvent;
import com.bytedance.android.live.effect.api.ShowBeautyBubbleEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyCameraParams;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyVEBmfParams;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMakeupEntrySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewBeautyWidget extends PreviewToolBaseWidget {
    public boolean LLILZLL;
    public final int LLIZ = C0UIM.LIZLLL();
    public final int LLIZLLLIL = R.drawable.ejy;
    public boolean LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        return "beauty";
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZLLLIL);
    }

    public final void W1() {
        C0UX6.PREVIEW_BEAUTY_ENTRY_BEAUTY_GUIDE.setValid(true);
        C0UX6.PREVIEW_BEAUTY_TAB.setValid(true);
        C0UX6 c0ux6 = C0UX6.PREVIEW_BEAUTY_ENTRY_BEAUTY_GUIDE;
        View view = getView();
        RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, new AwS591S0100000_12(this, 251));
    }

    public final void X1() {
        C0UX6.PREVIEW_BEAUTY_ENTRY_MAKEUP_GUIDE.setValid(true);
        C0UX6.PREVIEW_MAKEUP_TAB.setValid(true);
        C0UX6 c0ux6 = C0UX6.PREVIEW_BEAUTY_ENTRY_MAKEUP_GUIDE;
        View view = getView();
        RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, new AwS591S0100000_12(this, 252));
    }

    public final void Y1() {
        if (this.LLILZLL || this.context == null || this.dataChannel == null) {
            return;
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZJ(EnumC1120860fH2.GUIDE_ENHANCE);
        LiveDialogFragment liveDialogFragmentLIZ = C768460UCm.LIZ(this.context, this.dataChannel);
        liveDialogFragmentLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC786080UsY(this, 7));
        if (liveDialogFragmentLIZ.isAdded() || liveDialogFragmentLIZ.isShowing()) {
            return;
        }
        FragmentManager fragmentManager = (FragmentManager) this.dataChannel.gg0(C748880TZe.class);
        if (fragmentManager != null) {
            liveDialogFragmentLIZ.show(fragmentManager, "LiveBeautyFilterDialogFragment");
            this.LLILZLL = true;
        }
        C0UJY c0ujyLIZ = C770730ULf.LIZ(this.dataChannel);
        if (c0ujyLIZ != null) {
            c0ujyLIZ.LJIIJJI("beauty");
        }
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(EffectDialogShowChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        DataChannel dataChannel;
        C760180Trs.LJIIJJI(this.dataChannel, "enhance");
        if (LiveBeautyReverseExperiment.INSTANCE.notInExperiment() && LiveBeautySwitchSetting.INSTANCE.inExperiment() && C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJII.LIZIZ()) && (dataChannel = this.dataChannel) != null) {
            dataChannel.EQ2(this, ShowBeautyBubbleEvent.class, new AwS591S0100000_12(this, 253));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannelGlobal.LLILZ.BQ2(this, this, SchemaOpenBeautyPanelEvent.class, new AwS591S0100000_12(this, 254));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RefreshRedDotEvent.class, new AwS591S0100000_12(this, 255));
        }
        Boolean boolLIZIZ = InterfaceC766480U4w.LJJJJL.LIZIZ();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolLIZIZ, bool) && Intrinsics.LJFF(InterfaceC766480U4w.LJJJJJ.LIZIZ(), Boolean.FALSE)) {
            W1();
        } else if (LiveMakeupEntrySetting.INSTANCE.show() && Intrinsics.LJFF(InterfaceC766480U4w.LJJJJLI.LIZIZ(), bool) && Intrinsics.LJFF(InterfaceC766480U4w.LJJJJJL.LIZIZ(), Boolean.FALSE)) {
            X1();
        }
        if (LiveAIBeautySetting.INSTANCE.enableAIBeauty()) {
            C0UX6.PREVIEW_BEAUTY_ENTRY_AI_GUIDE.setValid(true);
            C0UX6.LIVE_BROADCAST_AI_BEAUTY_TAB.setValid(true);
            C0UX6 c0ux6 = C0UX6.PREVIEW_BEAUTY_ENTRY_AI_GUIDE;
            View view = getView();
            RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, new AwS591S0100000_12(this, 1055));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        Integer numValueOf;
        C0U8H c0u8hLIZIZ;
        C781270Ukn.LJI().getLiveBeautyLogManager().LJFF("enter beautify", "");
        boolean zS1 = S1();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_beauty_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJJII(Integer.valueOf(zS1 ? 1 : 0), "is_red_dot");
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        if (S1() && (c0u8hLIZIZ = C0UF5.LIZIZ()) != null) {
            c0u8hLIZIZ.LIZJ = true;
        }
        H1();
        if (!this.LLJI) {
            this.LLJI = true;
            C0UJY c0ujyLIZ = C770730ULf.LIZ(this.dataChannel);
            if (LiveAIBeautySetting.INSTANCE.enableAIBeauty() && ((c0ujyLIZ == null || !c0ujyLIZ.LJIJJLI()) && !C0UHK.LIZ())) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start: ");
                    sbLIZ.append(c0ujyLIZ);
                    C20441214yg.LIZIZ("AIBeauty#initVE", C2188811AlT.LIZIZ(sbLIZ));
                    LiveAIBeautyVEBmfParams.AIBeautyVEParamList value = LiveAIBeautyVEBmfParams.INSTANCE.getValue();
                    if (value != null) {
                        if (c0ujyLIZ == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(c0ujyLIZ.LJJIII(value.getAlgorithmType(), value.getBackend(), value.getPoolSize(), value.getMaxWidth(), EnumC771350UNp.BMF_CACHE.getFullPath(), value.getMaxHeight(), value.getAesBoostParams().getAesBoostAlgType()));
                            c0ujyLIZ.LJIILL(null);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("init result: ");
                        sbLIZ2.append(numValueOf);
                        C20441214yg.LIZIZ("AIBeauty#initVE", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LIZIZ("AIBeauty#initVE", e.getMessage());
                }
                C20441214yg.LIZIZ("AIBeauty#cameraSetting", GsonProtectorUtils.toJson(C293501Bt.LIZ(), LiveAIBeautyCameraParams.INSTANCE.getValue()));
                C20441214yg.LIZIZ("AIBeauty#veSetting", GsonProtectorUtils.toJson(C293501Bt.LIZ(), LiveAIBeautyVEBmfParams.INSTANCE.getValue()));
            }
        }
        Y1();
    }
}
