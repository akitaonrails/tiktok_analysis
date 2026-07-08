package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C01QD;
import X.C09JN;
import X.C0IJT;
import X.C0UKZ;
import X.C0UO0;
import X.C0UQX;
import X.C0UVW;
import X.C1121950fIn;
import X.C11JF;
import X.C13LE;
import X.C16F5;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2660011e;
import X.C439101nJ;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C752700Tfo;
import X.C758400Tp0;
import X.C770220UJg;
import X.C770490UKh;
import X.C770500UKi;
import X.InterfaceC1106030et7;
import X.ViewOnLayoutChangeListenerC785940UsK;
import Y.ARunnableS17S1100000_12;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.api.SMBLegacyBoardsPermission;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.effect.api.PreviewRevisionClickMoreEvent;
import com.bytedance.android.live.effect.api.PreviewRevisionFoldMoreEvent;
import com.bytedance.android.live.effect.api.PreviewRevisionUnfoldBottomEvent;
import com.bytedance.android.livesdk.api.LiveMoreApi;
import com.bytedance.android.livesdk.broadcast.PreviewMoreClickEvent;
import com.bytedance.android.livesdk.broadcast.PreviewMoreWidgetNotFold;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbGoLivePageUnifyEnable;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.SubInfoResponseChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewBottomFirstLoadABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionPageStyleABSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewRevisionMoreWidget extends PreviewWidget {
    public static final /* synthetic */ int LLJJ = 0;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Boolean LLILZLL;
    public ImageView LLIZ;
    public C16F5 LLIZLLLIL;
    public FrameLayout LLJ;
    public ValueAnimator LLJI;
    public Function0<? extends Map<String, Integer>> LLJIJIL = AFwS199S0000000_12.get$arr$(65);
    public C11JF LLJILJIL;
    public ViewOnLayoutChangeListenerC785940UsK LLJILJILJ;
    public boolean LLJILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hky;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        return "more_or_less";
    }

    public final void G1() {
        if (this.LLILZIL) {
            show();
            J1();
        } else {
            show();
            J1();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set keva uid: ");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("PreviewMore2", C2188811AlT.LIZIZ(sbLIZ));
        C0UKZ.LLFII.LIZJ(Boolean.valueOf(this.LLILZIL));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C758400Tp0.class, Boolean.valueOf(this.LLILZ));
        }
        C0UQX.LJIILJJIL(this.dataChannel, this.LLILZ);
        if (!this.LLILZ || this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_more_sub_reddot_show");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LIZ();
    }

    public final boolean I1() {
        C2660011e c2660011e = (C2660011e) this.dataChannel.gg0(C770500UKi.class);
        C1121950fIn c1121950fIn = (C1121950fIn) (c2660011e != null ? c2660011e.LIZ(C1121950fIn.class) : null);
        return c1121950fIn != null && c1121950fIn.LLILLJJLI > 0;
    }

    public final void J1() {
        if (!this.LLILZ) {
            ImageView imageView = this.LLIZ;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.f_o);
            }
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(PreviewMoreLessVisibilityChannel.class));
            return;
        }
        C770220UJg c770220UJg2 = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(PreviewMoreLessVisibilityChannel.class));
        ImageView imageView2 = this.LLIZ;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.f_p);
        }
    }

    public final void M1() {
        boolean z = this.LLILZ;
        final int i = z ? 1 : 2;
        InterfaceC1106030et7.G9.LIZJ(Boolean.valueOf(z));
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C0UVW c0uvwLIZ = C01QD.LIZ();
        c0uvwLIZ.getClass();
        this.LLJILJIL = (C11JF) ((LiveMoreApi) c0uvwLIZ.LIZJ(LiveMoreApi.class)).updateMoreClickStatus(1, i).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0UKf
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PreviewRevisionMoreWidget@b5de.uploadClickStatus$1");
                C0UKZ.LLFFF.LJFF(Integer.valueOf(i));
                C1C7U.LIZIZ("PreviewRevisionMoreWidget@b5de.uploadClickStatus$1");
            }
        }, new C09JN() { // from class: X.0UKg
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PreviewRevisionMoreWidget@b5de.uploadClickStatus$2");
                C1C7U.LIZIZ("PreviewRevisionMoreWidget@b5de.uploadClickStatus$2");
            }
        });
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C11JF c11jf;
        View view;
        ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK = this.LLJILJILJ;
        if (viewOnLayoutChangeListenerC785940UsK != null && (view = getView()) != null) {
            view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC785940UsK);
        }
        super.onDestroy();
        if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
            M1();
            this.LLJILJIL = null;
        }
        C11JF c11jf2 = this.LLJILJIL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLJILJIL) != null) {
            c11jf.dispose();
        }
        this.LLJILLL = false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        boolean z;
        View viewFindViewById;
        RoomCreateInfo roomCreateInfo;
        RoomCreateInfo roomCreateInfo2;
        RoomCreateInfo roomCreateInfo3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set keva uid: ");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("PreviewMore", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.dataChannel;
        boolean zBooleanValue = false;
        if (dataChannel == null || (roomCreateInfo3 = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null) {
            Integer numLIZIZ = C0UKZ.LLFFF.LIZIZ();
            z = numLIZIZ != null && numLIZIZ.intValue() == 1;
        } else {
            z = roomCreateInfo3.foldBottomArea;
        }
        this.LLILZ = z;
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
        this.LLILZIL = zBooleanValue;
        StringBuilder sb = new StringBuilder("set keva uid: ");
        sb.append(this.LLILZIL);
        sb.append(", ");
        DataChannel dataChannel4 = this.dataChannel;
        sb.append((dataChannel4 == null || (roomCreateInfo = (RoomCreateInfo) dataChannel4.gg0(RoomCreateInfoChannel.class)) == null) ? null : Boolean.valueOf(roomCreateInfo.hasRecentStream));
        C20441214yg.LIZIZ("PreviewMore1", sb.toString());
        super.E1();
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.SX0(C752700Tfo.class, 0L);
        }
        G1();
        View view = getView();
        this.LLIZ = view != null ? (ImageView) view.findViewById(R.id.k24) : null;
        View view2 = getView();
        this.LLIZLLLIL = view2 != null ? (C16F5) view2.findViewById(R.id.xp5) : null;
        View view3 = getView();
        this.LLJ = view3 != null ? (FrameLayout) view3.findViewById(R.id.eqx) : null;
        if (this.LLILZ) {
            ImageView imageView = this.LLIZ;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.f_p);
            }
        } else {
            ImageView imageView2 = this.LLIZ;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.f_o);
            }
        }
        C16F5 c16f5 = this.LLIZLLLIL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131852623));
        }
        View view4 = getView();
        if (view4 != null) {
            C500260Jjc.LJLIIIL(500L, view4, AFwS245S0000000_12.get$arr$(40));
        }
        View view5 = getView();
        if (view5 != null && (viewFindViewById = view5.findViewById(R.id.e0x)) != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 314));
        }
        DataChannel dataChannel6 = this.dataChannel;
        dataChannel6.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 315));
        dataChannel6.EQ2(this, BroadcastSettingResponseChannel.class, new AwS591S0100000_12(this, 316));
        dataChannel6.EQ2(this, SubInfoResponseChannel.class, new AwS591S0100000_12(this, 317));
        dataChannel6.BQ2(this, PreviewMoreWidgetNotFold.class, new AwS591S0100000_12(this, 318));
        dataChannel6.BQ2(this, PreviewRevisionClickMoreEvent.class, new AwS591S0100000_12(this, 319));
        dataChannel6.BQ2(this, PreviewRevisionFoldMoreEvent.class, new AwS591S0100000_12(this, 320));
        dataChannel6.BQ2(this, PreviewRevisionUnfoldBottomEvent.class, new AwS591S0100000_12(this, 321));
        AwS626S0100000_12 awS626S0100000_12 = new AwS626S0100000_12(this, 13);
        if (SmbGoLivePageUnifyEnable.INSTANCE.getValue()) {
            this.dataChannel.EQ2(this, SMBLegacyBoardsPermission.class, new AwS591S0100000_12(awS626S0100000_12, 312));
        } else {
            this.dataChannel.BQ2(this, SMBLegacyBoardsPermission.class, new AwS591S0100000_12(awS626S0100000_12, 313));
        }
        if (AnchorPreviewBottomFirstLoadABSetting.INSTANCE.enable()) {
            boolean zLJFF = Intrinsics.LJFF(InterfaceC1106030et7.G9.LIZ(), Boolean.TRUE);
            this.LLILZ = zLJFF;
            DataChannel dataChannel7 = this.dataChannel;
            if (dataChannel7 != null) {
                dataChannel7.SX0(C770490UKh.class, Boolean.valueOf(zLJFF));
            }
        }
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK = new ViewOnLayoutChangeListenerC785940UsK(this, 0);
            this.LLJILJILJ = viewOnLayoutChangeListenerC785940UsK;
            View view6 = getView();
            if (view6 != null) {
                view6.addOnLayoutChangeListener(viewOnLayoutChangeListenerC785940UsK);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        View view;
        View view2;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Boolean bool = C0UKZ.LLILZ.LIZIZ().get(strValueOf);
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(bool != null ? bool.booleanValue() : false))) {
            if (PreviewRevisionPageStyleABSetting.INSTANCE.isWeakPackage()) {
                if (!this.LLILZ || (view2 = getView()) == null) {
                    return;
                }
                HandlerHook.viewPost(view2, new ARunnableS17S1100000_12(this, strValueOf, 18));
                return;
            }
            if (!this.LLILZ || (view = getView()) == null) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS17S1100000_12(this, strValueOf, 20));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H1(float r7) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionPageStyleABSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionPageStyleABSetting.INSTANCE
            boolean r0 = r0.isWeakPackage()
            r5 = 1
            java.lang.String r4 = "height"
            java.lang.String r2 = "y"
            r3 = 0
            if (r0 == 0) goto L4b
            kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, java.lang.Integer>> r0 = r6.LLJIJIL
            java.lang.Object r1 = r0.invoke()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L96
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Exception -> L46
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L31
            int r2 = r0.intValue()     // Catch: java.lang.Exception -> L46
        L24:
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Exception -> L46
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L35
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L46
            goto L36
        L31:
            r2 = 0
            if (r1 == 0) goto L35
            goto L24
        L35:
            r1 = 0
        L36:
            if (r2 <= 0) goto L96
            if (r1 <= 0) goto L96
            float r0 = (float) r2     // Catch: java.lang.Exception -> L46
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L96
            int r2 = r2 + r1
            float r0 = (float) r2     // Catch: java.lang.Exception -> L46
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L96
            return r5
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        L4b:
            kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, java.lang.Integer>> r0 = r6.LLJIJIL
            java.lang.Object r1 = r0.invoke()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L96
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Exception -> L92
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L6e
            int r2 = r0.intValue()     // Catch: java.lang.Exception -> L92
        L61:
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Exception -> L92
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L72
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L92
            goto L73
        L6e:
            r2 = 0
            if (r1 == 0) goto L72
            goto L61
        L72:
            r1 = 0
        L73:
            if (r2 <= 0) goto L96
            if (r1 <= 0) goto L96
            float r0 = (float) r2     // Catch: java.lang.Exception -> L92
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L96
            int r2 = r2 + r1
            r0 = 52
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L92
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.lang.Exception -> L92
            int r0 = X.C814420VxA.LIZIZ(r0)     // Catch: java.lang.Exception -> L92
            int r2 = r2 - r0
            float r0 = (float) r2     // Catch: java.lang.Exception -> L92
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L96
            return r5
        L92:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionMoreWidget.H1(float):boolean");
    }

    public final void L1(boolean z) {
        this.LLILZ = z;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C758400Tp0.class, Boolean.valueOf(z));
        }
    }

    public final void onClick(View view) {
        DataChannel dataChannel;
        if (PreviewRevisionPageStyleABSetting.INSTANCE.isWeakPackage()) {
            FrameLayout frameLayout = this.LLJ;
            if (frameLayout != null) {
                C500260Jjc.LJJZ(C439101nJ.LIZ(16), frameLayout);
            }
            C16F5 c16f5 = this.LLIZLLLIL;
            if (c16f5 != null) {
                C500260Jjc.LJIILIIL(c16f5);
            }
        } else {
            FrameLayout frameLayout2 = this.LLJ;
            if (frameLayout2 != null) {
                C500260Jjc.LJJZ(C439101nJ.LIZ(16), frameLayout2);
            }
            C16F5 c16f52 = this.LLIZLLLIL;
            if (c16f52 != null) {
                C500260Jjc.LJIILIIL(c16f52);
            }
        }
        C0UQX.LJIILIIL(0, this.dataChannel, this.LLILZ);
        L1(!this.LLILZ);
        if (!PreviewEnterFpsOptSetting.INSTANCE.enable()) {
            M1();
        }
        if (!this.LLILZ && (dataChannel = this.dataChannel) != null) {
            dataChannel.SX0(C752700Tfo.class, Long.valueOf(System.currentTimeMillis()));
        }
        J1();
        this.dataChannel.FQ2(PreviewMoreClickEvent.class);
    }
}
