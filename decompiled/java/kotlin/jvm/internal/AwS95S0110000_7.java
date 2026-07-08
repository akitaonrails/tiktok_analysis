package kotlin.jvm.internal;

import X.AbstractC476820Imu;
import X.C09AY;
import X.C0IJT;
import X.C0J21;
import X.C1238760iLC;
import X.C1397620mTQ;
import X.C13LE;
import X.C19323610io;
import X.C354201Zc;
import X.C474500IjA;
import X.C500260Jjc;
import X.C501380JlQ;
import X.C696620RUe;
import X.C760180Trs;
import X.InterfaceC479000IqQ;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutRemovePlayLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveHangoutEnableSkylightSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2;
import com.ss.android.ugc.aweme.toptabv2.ui.LiveHangoutFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.perception.MultiViolationStatusResponse;

/* JADX INFO: loaded from: classes8.dex */
public class AwS95S0110000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0110000_7(C1238760iLC c1238760iLC, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1238760iLC;
        this.z1 = false;
    }

    public static final Object invoke$0(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        String str;
        String str2;
        LiveMode liveMode;
        LiveGoalPreviewWidget liveGoalPreviewWidget = (LiveGoalPreviewWidget) awS95S0110000_7.l0;
        boolean z = awS95S0110000_7.z1;
        liveGoalPreviewWidget.getClass();
        C760180Trs.LJIIIZ(liveGoalPreviewWidget.dataChannel, "live_goal");
        DataChannel dataChannel = liveGoalPreviewWidget.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LJFF(liveMode) && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.showFullLiveGoalBtn()) {
            str = "top";
        } else {
            str = "outside";
        }
        if (z) {
            str2 = "livesdk_golive_edit_live_goal_click";
        } else {
            str2 = "livesdk_golive_add_stream_goal_click";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        liveGoalPreviewWidget.G1(c474500IjALIZ);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LIZ();
        LiveGoalPreviewWidget liveGoalPreviewWidget2 = (LiveGoalPreviewWidget) awS95S0110000_7.l0;
        MultiViolationStatusResponse.ViolationData violationData = liveGoalPreviewWidget2.LLIZ;
        if (violationData != null && violationData.status == 1) {
            C501380JlQ.LIZ(liveGoalPreviewWidget2.context, liveGoalPreviewWidget2.dataChannel, violationData);
        } else {
            liveGoalPreviewWidget2.I1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        ((Number) obj).intValue();
        ((AbstractC476820Imu) awS95S0110000_7.l0).LJII(awS95S0110000_7.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = C13LE.LIZ(MultiTopLivePlayFeedAssemV2.class);
        c696620RUe.LLIZLLLIL = R.id.yfd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = awS95S0110000_7.z1;
        LiveHangoutFragment liveHangoutFragment = (LiveHangoutFragment) awS95S0110000_7.l0;
        linkedHashMap.put("force_refresh", Boolean.valueOf(z));
        if ((liveHangoutFragment instanceof InterfaceC479000IqQ) && liveHangoutFragment != null) {
            linkedHashMap.put("top_live_link_trace_owner", liveHangoutFragment);
        }
        c696620RUe.LLILZ = linkedHashMap;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        Assembler assembler = (Assembler) obj;
        if (MultiTopLiveHangoutEnableSkylightSetting.isEnable()) {
            LiveHangoutFragment liveHangoutFragment = (LiveHangoutFragment) awS95S0110000_7.l0;
            assembler.RQ2(liveHangoutFragment, new AwS586S0100000_7(liveHangoutFragment, 391));
        }
        LiveHangoutFragment liveHangoutFragment2 = (LiveHangoutFragment) awS95S0110000_7.l0;
        assembler.RQ2(liveHangoutFragment2, new AwS586S0100000_7(liveHangoutFragment2, 392));
        if (!MultiHangoutRemovePlayLabelSetting.INSTANCE.isEnable()) {
            LiveHangoutFragment liveHangoutFragment3 = (LiveHangoutFragment) awS95S0110000_7.l0;
            assembler.RQ2(liveHangoutFragment3, new AwS586S0100000_7(liveHangoutFragment3, 393));
        } else {
            View view = ((LiveHangoutFragment) awS95S0110000_7.l0).getView();
            if (view != null && (viewFindViewById3 = view.findViewById(R.id.oak)) != null) {
                C500260Jjc.LJJZ(0, viewFindViewById3);
                C500260Jjc.LJLJL(0, viewFindViewById3);
            }
            View view2 = ((LiveHangoutFragment) awS95S0110000_7.l0).getView();
            if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.oal)) != null) {
                C500260Jjc.LJJZ(0, viewFindViewById2);
                C500260Jjc.LJLJL(0, viewFindViewById2);
            }
            View view3 = ((LiveHangoutFragment) awS95S0110000_7.l0).getView();
            if (view3 != null && (viewFindViewById = view3.findViewById(R.id.qhq)) != null) {
                C500260Jjc.LJJZ(0, viewFindViewById);
                C500260Jjc.LJLJL(0, viewFindViewById);
            }
        }
        LiveHangoutFragment liveHangoutFragment4 = (LiveHangoutFragment) awS95S0110000_7.l0;
        assembler.QQ2(liveHangoutFragment4, new AwS95S0110000_7(liveHangoutFragment4, awS95S0110000_7.z1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        return C19323610io.LJJIJL(((C1238760iLC) awS95S0110000_7.l0).LIZIZ(), null, null, false, null, null, false, false, null, false, awS95S0110000_7.z1, null, false, false, 16760831);
    }

    public static final Object invoke$5(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        return C19323610io.LJJIJL(((C1238760iLC) awS95S0110000_7.l0).LIZIZ(), null, null, false, null, null, awS95S0110000_7.z1, false, null, false, false, null, false, false, 16776959);
    }

    public static final Object invoke$6(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        C0J21.LIZIZ("automsg_welcome_content");
        C0J21.LJ(3);
        if (awS95S0110000_7.z1) {
            super/*X.19Dn*/.onBackPressed();
        }
        C0J21.LIZJ("automsg_welcome_content");
        ((BaWelcomeMessageEditActivity) awS95S0110000_7.l0).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131830691, new AwS95S0110000_7(awS95S0110000_7.z1, (BaWelcomeMessageEditActivity) awS95S0110000_7.l0, 6));
        c1397620mTQ.LJII(2131828358, AFwS237S0000000_7.get$arr$(327));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        C0J21.LIZIZ("automsg_keyword_content");
        C0J21.LIZLLL(3);
        if (awS95S0110000_7.z1) {
            super/*X.19Dn*/.onBackPressed();
        }
        ((BaAutoReplyEditActivity) awS95S0110000_7.l0).finish();
        C0J21.LIZJ("automsg_keyword_content");
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS95S0110000_7 awS95S0110000_7, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131830691, new AwS95S0110000_7(awS95S0110000_7.z1, (BaAutoReplyEditActivity) awS95S0110000_7.l0, 8));
        c1397620mTQ.LJII(2131828358, AFwS237S0000000_7.get$arr$(330));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS95S0110000_7(com.ss.android.ugc.aweme.toptabv2.ui.LiveHangoutFragment r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS95S0110000_7.<init>(com.ss.android.ugc.aweme.toptabv2.ui.LiveHangoutFragment, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0110000_7(AbstractC476820Imu abstractC476820Imu, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC476820Imu;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0110000_7(LiveGoalPreviewWidget liveGoalPreviewWidget, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveGoalPreviewWidget;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0110000_7(boolean z, BaAutoReplyEditActivity baAutoReplyEditActivity, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = baAutoReplyEditActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0110000_7(boolean z, BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = baWelcomeMessageEditActivity;
    }
}
