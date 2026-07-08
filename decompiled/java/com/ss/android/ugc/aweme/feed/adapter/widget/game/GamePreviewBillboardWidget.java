package com.ss.android.ugc.aweme.feed.adapter.widget.game;

import X.C01GW;
import X.C0UO0;
import X.C11JF;
import X.C11NZ;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C16F5;
import X.C1ACA;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2441009hQ;
import X.C416760GVu;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1487280oo2;
import Y.ARunnableS106S0100000_6;
import Y.AfS142S0200000_6;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PlayTogetherBasicInfo;
import com.ss.android.ugc.aweme.feed.model.live.PlayTogetherTemplateV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GamePreviewBillboardWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJJ = 0;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 150));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 152));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 151));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(117));
    public C11JF LLJILJILJ;
    public C416760GVu LLJILLL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dgb;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final C16F5 M1() {
        return (C16F5) this.LLJIJIL.getValue();
    }

    public final C16F5 N1() {
        return (C16F5) this.LLJI.getValue();
    }

    public final void P1() {
        LiveRoomStruct liveRoomStruct;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        int length;
        C1361400lX0 c1361400lX0LIZ;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = ((View) this.LLJ.getValue()).getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.topMargin = C497740JfY.LJIIIZ(R.dimen.atb) + ((int) C497740JfY.LIZIZ(10.0f));
            layoutParams.leftMargin = (int) C497740JfY.LIZIZ(12.0f);
            C786410Ut5.d6((LinearLayout) this.LLJ.getValue(), layoutParams);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = this.context;
        if (context != null && (c1361400lX0LIZ = C1385040m98.LIZ(context, true)) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zg, c1361400lX0LIZ);
            if (numLIZJ != null) {
                gradientDrawable.setColor(C2441009hQ.LJIIL(numLIZJ.intValue(), 216));
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LIZ);
            if (numLIZJ2 != null) {
                N1().setTextColor(numLIZJ2.intValue());
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1j, c1361400lX0LIZ);
            if (numLIZJ3 != null) {
                M1().setTextColor(numLIZJ3.intValue());
            }
        }
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(14.0f));
        ((View) this.LLJ.getValue()).setBackground(gradientDrawable);
        O1(M1());
        O1(N1());
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || (playTogetherBasicInfo = liveRoomStruct.playTogetherInfo) == null) {
            return;
        }
        C786410Ut5.LJZL(0, (LinearLayout) this.LLJ.getValue());
        C786410Ut5.LLJJJJ(N1(), 8);
        C786410Ut5.LLJJJJ(M1(), 8);
        String strLJIJI = C497740JfY.LJIJI(2131855127);
        if (strLJIJI != null) {
            C786410Ut5.LLJJJJ(M1(), 0);
            M1().setText(strLJIJI);
            length = strLJIJI.length();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("liveBillboardTips.length: ");
            sbLIZ.append(strLJIJI.length());
            C20441214yg.LIZIZ("GamePreviewBillboardWidget", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            length = 0;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        PlayTogetherTemplateV2 playTogetherTemplateV2 = playTogetherBasicInfo.templateInfo;
        sbLIZ2.append(playTogetherTemplateV2 != null ? playTogetherTemplateV2.title : null);
        sbLIZ2.append(": ");
        PlayTogetherTemplateV2 playTogetherTemplateV22 = playTogetherBasicInfo.templateInfo;
        sbLIZ2.append(playTogetherTemplateV22 != null ? playTogetherTemplateV22.description : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C786410Ut5.LLJJJJ(N1(), 0);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Before liveBillboardNotice.length: ");
        sbLIZ3.append(strLIZIZ.length());
        C20441214yg.LIZIZ("GamePreviewBillboardWidget", C2188811AlT.LIZIZ(sbLIZ3));
        if (strLIZIZ.length() + length >= 100) {
            strLIZIZ = strLIZIZ.substring(0, 97 - length) + "...";
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("After liveBillboardNotice.length: ");
        sbLIZ4.append(strLIZIZ.length());
        sbLIZ4.append(", totalLength: ");
        sbLIZ4.append(length + strLIZIZ.length());
        C20441214yg.LIZIZ("GamePreviewBillboardWidget", C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("  ");
        sbLIZ5.append(strLIZIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ5));
        N1().setText(strLIZIZ);
        C416760GVu c416760GVu = this.LLJILLL;
        if (c416760GVu != null) {
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, 0, 1, 33);
            N1().setText(spannableStringBuilder);
        } else {
            C11JF c11jf = this.LLJILJILJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLJILJILJ = (C11JF) C11NZ.LJJJJZ("ttlive_ic_play_together_billboard_3x.png").LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0IMH
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return C1143680frq.LIZ("tiktok_live_game_demand_2", (String) obj);
                }
            }).LJIILIIL(new C0UO0()).LJJLJLI(new AfS142S0200000_6(this, spannableStringBuilder, 7));
        }
        float f = ((Boolean) this.LLJILJIL.getValue()).booleanValue() ? 13.0f : 14.0f;
        M1().setTextSize(f);
        N1().setTextSize(f);
        if (N1().getParent() != null) {
            HandlerHook.viewPost(N1(), new ARunnableS106S0100000_6(this, 59));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        P1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        show();
    }

    public final void O1(C16F5 c16f5) {
        C1361400lX0 c1361400lX0LIZ;
        Integer numLIZJ;
        C20441214yg.LIZIZ("GamePreviewBillboardWidget", String.valueOf(c16f5.getText()));
        Context context = this.context;
        if (context != null && (c1361400lX0LIZ = C1385040m98.LIZ(context, false)) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LIZ)) != null) {
            int iIntValue = numLIZJ.intValue();
            c16f5.setShadowLayer(1.5f, 0.0f, 1.5f, C2441009hQ.LJIIL(iIntValue, 38));
            c16f5.setShadowLayer(4.5f, 0.0f, 1.5f, C2441009hQ.LJIIL(iIntValue, 51));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r7) {
        /*
            r6 = this;
            super.onLoad(r7)
            X.1ACA r0 = r6.z1()
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r4 = r0.LIZJ
            if (r4 == 0) goto L7e
            java.lang.String r0 = "livesdk_audience_play_together_public_panel_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            long r0 = r4.id
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "room_id"
            r2.LJJII(r1, r0)
            long r0 = r4.ownerUserId
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            com.ss.android.ugc.aweme.feed.model.live.PlayTogetherBasicInfo r0 = r4.playTogetherInfo
            r3 = 0
            if (r0 == 0) goto La2
            java.lang.String r1 = r0.playTogetherId
        L30:
            java.lang.String r0 = "play_together_id"
            r2.LJJII(r1, r0)
            int r0 = r4.liveRoomMode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "live_type"
            r2.LJJII(r1, r0)
            com.ss.android.ugc.aweme.feed.model.live.PlayTogetherBasicInfo r0 = r4.playTogetherInfo
            if (r0 == 0) goto L9f
            int r0 = r0.applyLimitType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r5 == 0) goto L9f
            int r0 = r5.intValue()
            if (r0 != 0) goto L81
            java.lang.String r1 = "all"
        L54:
            java.lang.String r0 = "who_can_play"
            r2.LJJII(r1, r0)
            com.ss.android.ugc.aweme.feed.model.live.PlayTogetherBasicInfo r0 = r4.playTogetherInfo
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.live.PlayTogetherTemplateV2 r0 = r0.templateInfo
            if (r0 == 0) goto L7f
            java.lang.String r1 = r0.templateId
        L63:
            java.lang.String r0 = "theme_id"
            r2.LJJII(r1, r0)
            com.ss.android.ugc.aweme.feed.model.live.PlayTogetherBasicInfo r0 = r4.playTogetherInfo
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.feed.model.live.PlayTogetherTemplateV2 r0 = r0.templateInfo
            if (r0 == 0) goto L76
            int r0 = r0.templateConfigId
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L76:
            java.lang.String r0 = "config_id"
            r2.LJJII(r3, r0)
            r2.LIZ()
        L7e:
            return
        L7f:
            r1 = r3
            goto L63
        L81:
            int r1 = r5.intValue()
            r0 = 1
            if (r1 != r0) goto L8b
            java.lang.String r1 = "followers"
            goto L54
        L8b:
            int r1 = r5.intValue()
            r0 = 2
            if (r1 != r0) goto L95
            java.lang.String r1 = "creator_team"
            goto L54
        L95:
            int r1 = r5.intValue()
            r0 = 3
            if (r1 != r0) goto L9f
            java.lang.String r1 = "subscriber"
            goto L54
        L9f:
            java.lang.String r1 = ""
            goto L54
        La2:
            r1 = r3
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget.onLoad(java.lang.Object[]):void");
    }
}
