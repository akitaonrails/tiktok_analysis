package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C015V;
import X.C015X;
import X.C0IJT;
import X.C1148240fzC;
import X.C1148440fzW;
import X.C13LE;
import X.C16F5;
import X.C197400pQ;
import X.C197600pS;
import X.C474500IjA;
import X.C486790J7d;
import X.C500260Jjc;
import X.C770220UJg;
import X.C771430UNx;
import X.C772150UQr;
import X.C781270Ukn;
import X.C784310Uph;
import X.C786410Ut5;
import X.InterfaceC784360Upm;
import Y.ARunnableS112S0100000_12;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.SwitchLiveModeChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.SmoothScrollToVideoEvent;
import com.bytedance.android.livesdk.dataChannel.DeepLinkAutoLinkToLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.GameGuideChangeLiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveStudioTipsClickEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplaySwitch;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveModeWidgetV1 extends PreviewWidget {
    public final ArrayList<C784310Uph> LLILZ = new ArrayList<>(0);
    public final DetailLivePermission LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public C16F5 LLJIJIL;
    public LiveIconView LLJILJIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1i;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean x1() {
        return false;
    }

    public final String H1() {
        C772150UQr c772150UQr;
        String str;
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || (c772150UQr = (C772150UQr) dataChannel.gg0(C771430UNx.class)) == null || (str = c772150UQr.LIZ) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreviewLiveModeWidgetV1() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidgetV1.<init>():void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        InterfaceC784360Upm interfaceC784360UpmFY1 = C781270Ukn.LJIJJ().fY1();
        if (interfaceC784360UpmFY1 != null) {
            interfaceC784360UpmFY1.LIZ();
        }
        C486790J7d.LIZ(new ARunnableS112S0100000_12(this, 407));
        boolean z = LiveNoPermissionDisplaySwitch.INSTANCE.enable() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE);
        boolean z2 = this.LLIZLLLIL || z;
        if (this.LLILZLL || z) {
            this.LLILZ.add(new C784310Uph(2131841086, 2131857048, R.attr.emd, LiveMode.VIDEO));
        }
        if (this.LLJI) {
            this.LLILZ.add(new C784310Uph(2131843419, 2131857053, R.attr.eib, LiveMode.LIVE_VOICE));
        }
        if (z2) {
            this.LLILZ.add(new C784310Uph(2131842805, 2131857051, R.attr.e8r, LiveMode.SCREEN_RECORD));
        }
        if (this.LLJ) {
            this.LLILZ.add(new C784310Uph(2131842839, 2131857050, R.attr.djg, LiveMode.LIVE_STUDIO));
        }
        if (this.LLIZ) {
            this.LLILZ.add(new C784310Uph(2131852510, 2131857052, R.attr.dtm, LiveMode.THIRD_PARTY));
        }
        if (this.LLILZ.size() == 1) {
            View view = getView();
            if (view != null) {
                view.setBackground(null);
            }
            View view2 = getView();
            C500260Jjc.LJIILIIL(view2 != null ? view2.findViewById(R.id.ol0) : null);
        } else {
            View view3 = getView();
            if (view3 != null) {
                C786410Ut5.I7(new AbS694S0100000_12(this, 31), view3);
            }
        }
        View view4 = getView();
        this.LLJILJIL = view4 != null ? (LiveIconView) view4.findViewById(R.id.k1_) : null;
        View view5 = getView();
        this.LLJIJIL = view5 != null ? (C16F5) view5.findViewById(R.id.xrg) : null;
        LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
        if (liveMode != null) {
            J1(liveMode, null, null, false);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, PreviewLiveStudioTipsClickEvent.class, new AwS591S0100000_12(this, 293));
            dataChannel.BQ2(this, DeepLinkAutoLinkToLiveModeChannel.class, new AwS591S0100000_12(this, 294));
            dataChannel.BQ2(this, GameGuideChangeLiveModeChannel.class, new AwS591S0100000_12(this, 295));
            dataChannel.BQ2(this, SwitchLiveModeChannel.class, new AwS591S0100000_12(this, 296));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, SmoothScrollToVideoEvent.class, new AwS591S0100000_12(this, 297));
        View view6 = getView();
        if (view6 != null) {
            HandlerHook.viewPost(view6, new ARunnableS112S0100000_12(this, 80));
        }
        if (this.LLJ) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(LiveStudioTagShowChannel.class));
        }
    }

    public final void I1(LiveMode liveMode) {
        C015X.LIZ = liveMode;
        C197400pQ c197400pQFy0 = C015V.LIZJ().fy0();
        if (c197400pQFy0 != null) {
            c197400pQFy0.LJFF(C015X.LIZ);
        }
        C197600pS.LIZ().wr0(liveMode);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveModeChannel.class, liveMode);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(PreviewPageSelectLiveMode.class, liveMode);
        }
        DataChannelGlobal.LLILZ.JQ2(C1148440fzW.class, liveMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setWidgetCallback(X.InterfaceC1097170eep r6) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidgetV1.setWidgetCallback(X.0eep):void");
    }

    public final void J1(LiveMode liveMode, String str, String str2, boolean z) {
        Boolean boolValueOf;
        C784310Uph next;
        String str3;
        Iterator<C784310Uph> it2 = this.LLILZ.iterator();
        while (true) {
            boolValueOf = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZLLL == liveMode) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C784310Uph c784310Uph = next;
        if (c784310Uph != null) {
            LiveIconView liveIconView = this.LLJILJIL;
            if (liveIconView != null) {
                liveIconView.setIconAttr(c784310Uph.LIZJ);
            }
            C16F5 c16f5 = this.LLJIJIL;
            if (c16f5 != null) {
                c16f5.setText(this.context.getResources().getString(c784310Uph.LIZ));
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_type_show");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            if (z) {
                str3 = "click";
            } else {
                str3 = "show";
            }
            c474500IjALIZ.LJJII(str3, "action_type");
            DetailLivePermission detailLivePermission = this.LLILZIL;
            if (detailLivePermission != null) {
                boolValueOf = Boolean.valueOf(detailLivePermission.screenPermission);
            }
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "screen_share_permission");
            if (!TextUtils.isEmpty(str)) {
                c474500IjALIZ.LJJII(str, "convert_from");
            }
            if (!TextUtils.isEmpty(str2)) {
                c474500IjALIZ.LJJII(str2, "template_id");
            }
            c474500IjALIZ.LJJ(this.context.getResources().getString(c784310Uph.LIZ));
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r5 != com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        X.C766270U4b.LIZLLL(2131844179);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        if (r4.LLIZLLLIL != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G1(int r3, com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidgetV1 r4, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r0 = r3 & 2
            r2 = 1
            if (r0 == 0) goto L6
            r8 = 1
        L6:
            r0 = r3 & 4
            r1 = 0
            if (r0 == 0) goto Lc
            r6 = r1
        Lc:
            r0 = r3 & 8
            if (r0 == 0) goto L11
            r7 = r1
        L11:
            r4.getClass()
            int[] r1 = X.C198700pd.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L42
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 3
            if (r1 == r0) goto L3c
            r0 = 4
            if (r1 == r0) goto L39
            r0 = 5
            if (r1 != r0) goto L46
            boolean r0 = r4.LLILZLL
        L2c:
            if (r0 != 0) goto L46
        L2e:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            if (r5 != r0) goto L38
            r0 = 2131844179(0x7f115c53, float:1.9321743E38)
            X.C766270U4b.LIZLLL(r0)
        L38:
            return
        L39:
            boolean r0 = r4.LLJI
            goto L2c
        L3c:
            boolean r0 = r4.LLJ
            goto L2c
        L3f:
            boolean r0 = r4.LLIZ
            goto L2c
        L42:
            boolean r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L2e
        L46:
            r4.J1(r5, r6, r7, r2)
            if (r8 == 0) goto L5e
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L54
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.DeepLinkLiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.DeepLinkLiveModeChannel.class
            r1.zW(r0, r5)
        L54:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L38
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            r1.zW(r0, r5)
            return
        L5e:
            r4.I1(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidgetV1.G1(int, com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidgetV1, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, java.lang.String, java.lang.String, boolean):void");
    }
}
