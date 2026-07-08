package com.bytedance.android.livesdk.broadcast.preview.widget.livestudio;

import X.C1548820qPI;
import X.C168F;
import X.C19ME;
import X.C20441214yg;
import X.C2188811AlT;
import X.C262100zr;
import X.C439101nJ;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.AccessLiveStudioSucceedChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveStudioIntroMaxWidthDpSetting;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveStudioPageWidgetV2 extends AbstractPreviewLiveStudioPage implements InterfaceC1141530foN {
    public boolean LLILZIL;
    public View LLILZLL;
    public final DetailLivePermission LLIZ = (DetailLivePermission) DataChannelGlobal.LLILZ.gg0(C168F.class);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1k;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        int value = GameLiveStudioIntroMaxWidthDpSetting.INSTANCE.getValue();
        if (value <= 0) {
            return;
        }
        int iLIZ = C439101nJ.LIZ(value);
        H1(R.id.lnl, iLIZ);
        H1(R.id.zvk, iLIZ);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        G1();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1() {
        /*
            r5 = this;
            super.E1()
            com.bytedance.android.livesdkapi.user.DetailLivePermission r0 = r5.LLIZ
            r4 = 0
            if (r0 == 0) goto Lb6
            boolean r0 = r0.enableLiveStudio
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        Le:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            r5.LLILZIL = r0
            r0 = 2131395888(0x7f0a8530, float:1.8412501E38)
            android.view.View r2 = r5.findViewById(r0)
            r5.LLILZLL = r2
            if (r2 == 0) goto L29
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 152(0x98, float:2.13E-43)
            r1.<init>(r5, r0)
            X.C786410Ut5.I7(r1, r2)
        L29:
            r0 = 2131377921(0x7f0a3f01, float:1.837606E38)
            android.view.View r2 = r5.findViewById(r0)
            java.lang.String r1 = "tiktok_live_game_demand_1"
            java.lang.String r0 = "ttlive_broadcast_live_studio_preview_page_detail_new_v2.png"
            X.C1143680frq.LIZLLL(r2, r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r5.dataChannel
            if (r3 == 0) goto L47
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel> r2 = com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel.class
            kotlin.jvm.internal.AwS591S0100000_12 r1 = new kotlin.jvm.internal.AwS591S0100000_12
            r0 = 1241(0x4d9, float:1.739E-42)
            r1.<init>(r5, r0)
            r3.EQ2(r5, r2, r1)
        L47:
            java.lang.String r0 = "live_studio_permission_apply_success"
            X.C1548820qPI.LIZLLL(r0, r5)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.168F> r0 = X.C168F.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.user.DetailLivePermission r2 = (com.bytedance.android.livesdkapi.user.DetailLivePermission) r2
            java.lang.Class<X.168D> r0 = X.C168D.class
            java.lang.Object r1 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.user.ApplyLivePermission r1 = (com.bytedance.android.livesdkapi.user.ApplyLivePermission) r1
            if (r2 == 0) goto Lb4
            boolean r0 = r2.obsPermission
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L66:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto Lb2
            if (r1 == 0) goto L74
            boolean r0 = r1.obsApplyPermission
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L74:
            boolean r0 = X.C500260Jjc.LJJJI(r4)
            if (r0 != 0) goto Lb2
            r1 = 0
        L7b:
            r0 = 2131397382(0x7f0a8b06, float:1.8415531E38)
            android.view.View r3 = r5.findViewById(r0)
            X.16F5 r3 = (X.C16F5) r3
            if (r1 != 0) goto L9e
            com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameLsShowObsNoteSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameLsShowObsNoteSwitchSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L9e
            int r0 = X.C497740JfY.LJIIZILJ()
            float r1 = (float) r0
            r0 = 320(0x140, float:4.48E-43)
            float r0 = (float) r0
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto La1
        L9e:
            X.C500260Jjc.LJIILIIL(r3)
        La1:
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            X.0Usa r1 = new X.0Usa
            r0 = 0
            r1.<init>(r3, r0)
            X.C786410Ut5.x3(r2, r1)
            r5.G1()
            return
        Lb2:
            r1 = 1
            goto L7b
        Lb4:
            r0 = r4
            goto L66
        Lb6:
            r0 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioPageWidgetV2.E1():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("live_studio_permission_apply_success", this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        G1();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent ");
        sbLIZ.append(c262100zr);
        C20441214yg.LIZIZ("PreviewLiveStudioPageWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_studio_permission_apply_success") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && interfaceC1107590evd.getInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) == 1) {
            this.LLILZIL = true;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(AccessLiveStudioSucceedChannel.class, Boolean.TRUE);
            }
        }
    }

    public final void H1(int i, int i2) {
        C19ME c19me;
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            if (c19me.matchConstraintMaxWidth == i2) {
                return;
            }
            c19me.matchConstraintMaxWidth = i2;
            C786410Ut5.W5(viewFindViewById, c19me);
            viewFindViewById.requestLayout();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyMatchConstraintMaxWidth: layoutParams not ConstraintLayout.LayoutParams for ");
        sbLIZ.append(i);
        C20441214yg.LJIIL("PreviewLiveStudioPageWidget", C2188811AlT.LIZIZ(sbLIZ));
    }
}
