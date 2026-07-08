package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C01QD;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0IPN;
import X.C0IUQ;
import X.C0J1R;
import X.C0UO0;
import X.C0UVW;
import X.C0UX6;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C1161920gLG;
import X.C1322110kVd;
import X.C158B;
import X.C189200o6;
import X.C20337914i1;
import X.C418440Gaw;
import X.C452501pT;
import X.C473410IhP;
import X.C474500IjA;
import X.C500260Jjc;
import X.C5182020e;
import X.C760180Trs;
import X.C814420VxA;
import X.InterfaceC1093910eZZ;
import X.InterfaceC772190UQv;
import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.schema.PreviewSchemaOpenPanelEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoFailEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenter50FollowerDisplay;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterInLiveTakePageSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterPriorityCreateInfoSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubLiveCenterRedIdSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.TopRightContainerComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveCenterWidget extends PreviewToolBaseWidget {
    public boolean LLIZLLLIL;
    public TopRightContainerComponent LLJ;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(63));
    public final String LLIZ = FansClubLiveCenterRedIdSettings.INSTANCE.getValue();
    public final int LLJI = 2131842903;
    public final int LLJIJIL = R.drawable.enc;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1g;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLJIJIL);
    }

    public final String W1() {
        return UriProtector.parse(OptLiveCenterInLiveTakePageSchema.INSTANCE.getValue()).buildUpon().appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis())).appendQueryParameter("is_textmessage", this.LLIZLLLIL ? "1" : CardStruct.IStatusCode.DEFAULT).appendQueryParameter("enable_code_cache", SecondPageCodeCacheABSetting.INSTANCE.isMatch() ? "1" : CardStruct.IStatusCode.DEFAULT).build().toString();
    }

    public final void a2() {
        TopRightContainerComponent topRightContainerComponent = this.LLJ;
        String strW1 = topRightContainerComponent != null ? topRightContainerComponent.schema : null;
        if (!OptLiveCenterPriorityCreateInfoSchema.INSTANCE.enable() || strW1 == null || strW1.length() == 0) {
            strW1 = W1();
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, strW1);
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(S1()));
        Integer numValueOf = Integer.valueOf(PreviewToolBaseWidget.G1(getView()));
        if (dataChannel != null) {
            Boolean bool = (Boolean) dataChannel.gg0(LiveEducationTouchChannel.class);
            zBooleanValue = bool != null ? bool.booleanValue() : false;
            dataChannel.zW(LiveEducationTouchChannel.class, Boolean.FALSE);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_takepage_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "local_time_ms");
        c474500IjALIZ.LJJII(zBooleanValue ? "1" : CardStruct.IStatusCode.DEFAULT, "is_touched");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJJJI ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LJJII(numValueOf, "index");
        c474500IjALIZ.LIZ();
    }

    public final void b2() {
        if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.x3;
            if (!c20337914i1.LIZIZ().booleanValue()) {
                X1();
                c20337914i1.LJFF(Boolean.TRUE);
            }
            this.dataChannel.EQ2(this, BroadcastSettingResponseChannel.class, new AwS591S0100000_12(this, 278));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C0IUQ.LIZ(new C5182020e(this, 465));
        C473410IhP.LIZJ(new ARunnableS112S0100000_12(this, 78), 1500L);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        return LiveCenter50FollowerDisplay.INSTANCE.enable() ? "live_center" : "";
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C0IUQ.LIZ(new C5182020e(this, 465));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 274));
        }
        if (C760180Trs.LJFF()) {
            View view = getView();
            (view != null ? view.findViewById(R.id.widget_icon) : null).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            View view2 = getView();
            C1143680frq.LJ(view2 != null ? view2.findViewById(R.id.widget_icon) : null, "tiktok_live_broadcast_demand_8", "open_live_icon_live_center_new.png", ImageView.ScaleType.CENTER_CROP);
        }
        C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE;
        View view3 = getView();
        RedDotExtensionKt.LJI(view3 != null ? view3.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, null);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 275));
            dataChannel2.EQ2(this, RoomCreateInfoFailEvent.class, new AwS591S0100000_12(this, 276));
        }
        if (InterfaceC772190UQv.k3.LIZIZ().booleanValue()) {
            try {
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                C189200o6.m2constructorimpl(C01QD.LIZ().LIZ().checkLiveCenterBubble(1).LJIILIIL(C0J1R.LIZIZ(this.widgetCallback.getFragment())).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(this, 273), new C09JN() { // from class: X.00Lm
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("PreviewLiveCenterWidget@1a44.showBubble$1$2");
                        C1C7U.LIZIZ("PreviewLiveCenterWidget@1a44.showBubble$1$2");
                    }
                }));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSchemaOpenPanelEvent.class, new AwS591S0100000_12(this, 277));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(C760180Trs.LJFF() ? R.raw.icon_house_play : 0);
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    public final void X1() {
        View view = getView();
        if (view != null) {
            View view2 = getView();
            (view2 != null ? view2.findViewById(R.id.widget_icon) : null).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            final C1143920fsE c1143920fsE = new C1143920fsE();
            c1143920fsE.LJIILJJIL = true;
            c1143920fsE.LIZ = (C1322110kVd) view.findViewById(R.id.widget_icon);
            c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1");
            c1143920fsE.LIZJ = "ttlive_live_center_preview_guide.webp";
            c1143920fsE.LJFF = false;
            c1143920fsE.LJIILIIL = true;
            c1143920fsE.LJ = new C1143950fsH() { // from class: X.0UI5
                @Override // X.C1143950fsH
                public final void LJFF(Animatable animatable) {
                }

                @Override // X.C1143950fsH
                public final void LIZLLL() {
                    c1143920fsE.LJFF();
                    C0UQX.LJIIJ(this.dataChannel, "first_entry");
                }
            };
            C1143680frq.LJIIIIZZ(c1143920fsE);
        }
    }

    public final void Y1() {
        View view = getView();
        if (view != null) {
            final C1143920fsE c1143920fsE = new C1143920fsE();
            View view2 = getView();
            (view2 != null ? view2.findViewById(R.id.widget_icon) : null).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            c1143920fsE.LIZ = (C1322110kVd) view.findViewById(R.id.widget_icon);
            c1143920fsE.LJIILJJIL = true;
            c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
            c1143920fsE.LIZJ = "ttlive_live_academy_reward_new.webp";
            c1143920fsE.LJFF = false;
            c1143920fsE.LJIILIIL = true;
            c1143920fsE.LJ = new C1143950fsH() { // from class: X.0UI3
                @Override // X.C1143950fsH
                public final void LJFF(Animatable animatable) {
                }

                @Override // X.C1143950fsH
                public final void LIZLLL() {
                    C20337914i1<Long> c20337914i1 = InterfaceC772190UQv.y3;
                    if (C445101oH.LIZIZ(c20337914i1.LIZIZ().longValue())) {
                        return;
                    }
                    c1143920fsE.LJFF();
                    c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
                    C0UQX.LJIIJ(this.dataChannel, "course_progress");
                }
            };
            C1143680frq.LJIIIIZZ(c1143920fsE);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        InterfaceC772190UQv.B3.LJFF(Boolean.TRUE);
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE);
        C500260Jjc.LJIILIIL(view.findViewById(R.id.widget_red_dot));
        a2();
        int length = InterfaceC772190UQv.z3.LIZIZ().length;
        for (int i = 0; i < length; i++) {
            InterfaceC772190UQv.z3.LIZIZ()[i] = 0;
        }
        InterfaceC772190UQv.z3.LIZIZ()[0] = C158B.LIZ();
        try {
            if (!TextUtils.isEmpty(this.LLIZ)) {
                InterfaceC1093910eZZ.LLLLLZL.LIZJ(this.LLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
