package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C01QD;
import X.C09JN;
import X.C0IJT;
import X.C0UKZ;
import X.C0UO0;
import X.C0UQX;
import X.C0UVW;
import X.C0UX6;
import X.C1121950fIn;
import X.C11JF;
import X.C13LE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2660011e;
import X.C474500IjA;
import X.C500260Jjc;
import X.C752700Tfo;
import X.C758400Tp0;
import X.C760180Trs;
import X.C770220UJg;
import X.C770490UKh;
import X.C770500UKi;
import X.ViewOnLayoutChangeListenerC521690Kd5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.api.SMBLegacyBoardsPermission;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.LiveMoreApi;
import com.bytedance.android.livesdk.broadcast.PreviewInteractBubbleType;
import com.bytedance.android.livesdk.broadcast.PreviewMoreClickEvent;
import com.bytedance.android.livesdk.broadcast.PreviewMoreWidgetNotFold;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbGoLivePageUnifyEnable;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.SubInfoResponseChannel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewMoreWidget extends PreviewToolBaseWidget {
    public boolean LLILZLL;
    public boolean LLIZ;
    public Boolean LLIZLLLIL;
    public ViewOnLayoutChangeListenerC521690Kd5 LLJ;
    public C11JF LLJI;
    public boolean LLJIJIL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final long I1() {
        return 500L;
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    public final void Y1() {
        V1(null);
        if (this.LLILZLL) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LIZLLL(C13LE.LIZ(PreviewMoreLessVisibilityChannel.class));
        } else {
            C770220UJg c770220UJg2 = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(PreviewMoreLessVisibilityChannel.class));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        return "more_or_less";
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLILZLL ? R.drawable.eqe : R.drawable.eqd);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL ? 2131842003 : 2131842002;
    }

    public final void W1() {
        if (this.LLIZ) {
            show();
            Y1();
        } else {
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            C0UVW c0uvwLIZ = C01QD.LIZ();
            c0uvwLIZ.getClass();
            ((LiveMoreApi) c0uvwLIZ.LIZJ(LiveMoreApi.class)).updateMoreClickStatus(1, 1).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Lj
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PreviewMoreWidget@97cc.resetMoreLessStatus$1");
                    C1C7U.LIZIZ("PreviewMoreWidget@97cc.resetMoreLessStatus$1");
                }
            }, new C09JN() { // from class: X.00Lk
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PreviewMoreWidget@97cc.resetMoreLessStatus$2");
                    C1C7U.LIZIZ("PreviewMoreWidget@97cc.resetMoreLessStatus$2");
                }
            });
            hide();
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(PreviewMoreLessVisibilityChannel.class));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set keva uid: ");
        sbLIZ.append(this.LLIZ);
        C20441214yg.LIZIZ("PreviewMore2", C2188811AlT.LIZIZ(sbLIZ));
        C0UKZ.LLFII.LIZJ(Boolean.valueOf(this.LLIZ));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C758400Tp0.class, Boolean.valueOf(this.LLILZLL));
        }
        C0UQX.LJIILJJIL(this.dataChannel, this.LLILZLL);
        if (this.LLILZLL) {
            if (!this.LLJIJIL) {
                this.LLJIJIL = true;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_more_sub_reddot_show");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LIZ();
            }
            C0UX6.LIVE_BROADCAST_PREVIEW_MORE.setIds(new String[]{"RedDotFansClubPromoteDirect", "RedDotPromoteDirect", "RedDotPreviewSubscirptionDirect", "GuideLiveEventStickerEntranceSettingsDirect", "RedDotGoLiveCustomDiscountMore", "LiveBroadcastPreviewBoardFullCustomisationGuide", "SubscriptionIntegrateFansClubMoreGuide", "RedDotBoardIntelligenceNewBatchMore", "SubscriptionIntegrateFansClubTransitionMoreGuide", "RedDotGoLiveServicePlusVerificationDirect", "FansClubEntranceDirectMoreGuide"});
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_MORE;
            View view = getView();
            RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, new AwS591S0100000_12(this, 298));
        }
    }

    public final boolean X1() {
        C2660011e c2660011e = (C2660011e) this.dataChannel.gg0(C770500UKi.class);
        C1121950fIn c1121950fIn = (C1121950fIn) (c2660011e != null ? c2660011e.LIZ(C1121950fIn.class) : null);
        return c1121950fIn != null && c1121950fIn.LLILLJJLI > 0;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        boolean z;
        Object parent;
        RoomCreateInfo roomCreateInfo;
        RoomCreateInfo roomCreateInfo2;
        RoomCreateInfo roomCreateInfo3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set keva uid: ");
        sbLIZ.append(this.LLIZ);
        C20441214yg.LIZIZ("PreviewMore", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.dataChannel;
        boolean zBooleanValue = false;
        if (dataChannel == null || (roomCreateInfo3 = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null) {
            Integer numLIZIZ = C0UKZ.LLFFF.LIZIZ();
            z = numLIZIZ != null && numLIZIZ.intValue() == 1;
        } else {
            z = roomCreateInfo3.foldBottomArea;
        }
        this.LLILZLL = z;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C770490UKh.class, Boolean.valueOf(z));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (roomCreateInfo2 = (RoomCreateInfo) dataChannel3.gg0(RoomCreateInfoChannel.class)) == null) {
            Boolean boolLIZ = C0UKZ.LLFII.LIZ();
            if (boolLIZ != null) {
                zBooleanValue = boolLIZ.booleanValue();
            }
        } else {
            zBooleanValue = roomCreateInfo2.hasRecentStream;
        }
        this.LLIZ = zBooleanValue;
        StringBuilder sb = new StringBuilder("set keva uid: ");
        sb.append(this.LLIZ);
        sb.append(", ");
        DataChannel dataChannel4 = this.dataChannel;
        Boolean boolValueOf = null;
        if (dataChannel4 != null && (roomCreateInfo = (RoomCreateInfo) dataChannel4.gg0(RoomCreateInfoChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(roomCreateInfo.hasRecentStream);
        }
        sb.append(boolValueOf);
        C20441214yg.LIZIZ("PreviewMore1", sb.toString());
        super.E1();
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.SX0(C752700Tfo.class, 0L);
        }
        W1();
        DataChannel dataChannel6 = this.dataChannel;
        dataChannel6.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 299));
        dataChannel6.EQ2(this, BroadcastSettingResponseChannel.class, new AwS591S0100000_12(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        dataChannel6.EQ2(this, SubInfoResponseChannel.class, new AwS591S0100000_12(this, 301));
        dataChannel6.BQ2(this, PreviewMoreWidgetNotFold.class, new AwS591S0100000_12(this, 302));
        dataChannel6.EQ2(this, PreviewInteractBubbleType.class, new AwS586S0100000_7(this, 43));
        AwS626S0100000_12 awS626S0100000_12 = new AwS626S0100000_12(this, 12);
        if (SmbGoLivePageUnifyEnable.INSTANCE.getValue()) {
            this.dataChannel.EQ2(this, SMBLegacyBoardsPermission.class, new AwS591S0100000_12(awS626S0100000_12, 303));
        } else {
            this.dataChannel.BQ2(this, SMBLegacyBoardsPermission.class, new AwS591S0100000_12(awS626S0100000_12, 304));
        }
        this.LLJ = new ViewOnLayoutChangeListenerC521690Kd5(this, 0);
        View view = getView();
        if (view == null || (parent = view.getParent()) == null || !(parent instanceof View)) {
            return;
        }
        ((View) parent).addOnLayoutChangeListener(this.LLJ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(C760180Trs.LJFF() ? this.LLILZLL ? R.raw.icon_chevron_down_circle_ltr : R.raw.icon_chevron_up_circle_ltr : 0);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        Object parent;
        C11JF c11jf;
        super.onDestroy();
        C11JF c11jf2 = this.LLJI;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLJI) != null) {
            c11jf.dispose();
        }
        this.LLJIJIL = false;
        if (this.LLJ != null) {
            View view = getView();
            if (view != null && (parent = view.getParent()) != null && (parent instanceof View)) {
                ((View) parent).removeOnLayoutChangeListener(this.LLJ);
            }
            this.LLJ = null;
        }
    }

    public final void a2(boolean z) {
        this.LLILZLL = z;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C758400Tp0.class, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        final int i;
        DataChannel dataChannel;
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_MORE);
        C0UQX.LJIILIIL(C500260Jjc.LJJJI(Boolean.valueOf(S1())) ? 1 : 0, this.dataChannel, this.LLILZLL);
        a2(!this.LLILZLL);
        if (this.LLILZLL) {
            i = 1;
        } else {
            i = 2;
        }
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C0UVW c0uvwLIZ = C01QD.LIZ();
        c0uvwLIZ.getClass();
        this.LLJI = (C11JF) ((LiveMoreApi) c0uvwLIZ.LIZJ(LiveMoreApi.class)).updateMoreClickStatus(1, i).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.013A
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PreviewMoreWidget@97cc.uploadClickStatus$1");
                C0UKZ.LLFFF.LJFF(Integer.valueOf(i));
                C1C7U.LIZIZ("PreviewMoreWidget@97cc.uploadClickStatus$1");
            }
        }, new C09JN() { // from class: X.00Ll
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PreviewMoreWidget@97cc.uploadClickStatus$2");
                C1C7U.LIZIZ("PreviewMoreWidget@97cc.uploadClickStatus$2");
            }
        });
        if (!this.LLILZLL && (dataChannel = this.dataChannel) != null) {
            dataChannel.SX0(C752700Tfo.class, Long.valueOf(System.currentTimeMillis()));
        }
        Y1();
        this.dataChannel.FQ2(PreviewMoreClickEvent.class);
    }
}
