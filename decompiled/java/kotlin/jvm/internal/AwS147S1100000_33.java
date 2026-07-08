package kotlin.jvm.internal;

import X.C09AY;
import X.C0IJT;
import X.C1161920gLG;
import X.C12OY;
import X.C1AH3;
import X.C1AHA;
import X.C2180171AUd;
import X.C474500IjA;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.dataChannel.LiveCenterDismissEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssemV2;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import webcast.data.RealtimeLiveCenterTips;

/* JADX INFO: loaded from: classes34.dex */
public class AwS147S1100000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS147S1100000_33 r10, java.lang.Object r11) {
        /*
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r1 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r1 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity) r1
            X.0qfm r0 = r1.LLLILZLLLI
            boolean r0 = r0.LLILLL
            r4 = 1
            r9 = 0
            if (r0 == 0) goto L8e
            X.1A3X r0 = X.C1A3X.LIZ
            r0.getClass()
            boolean r0 = X.C1A3X.LIZ(r1)
            if (r0 == 0) goto L8e
            r1 = 1
        L1a:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L25
            if (r1 != 0) goto L25
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment r8 = new com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment
            r8.<init>()
            java.lang.Object r1 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r1 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity) r1
            com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r7 = r1.LLJJL
            java.lang.String r6 = r10.s0
            X.0qfm r5 = r1.LLLILZLLLI
            X.12Yy r3 = new X.12Yy
            r0 = 4
            r3.<init>(r1, r0)
            X.0L4Y r2 = new X.0L4Y
            java.lang.String r1 = r10.s0
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity) r0
            r2.<init>(r0, r1)
            r8.LLJILJILJ = r7
            r8.LLJILLL = r6
            r8.LLJILJIL = r3
            r8.LLJIJIL = r2
            r8.LLJJIJI = r5
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity) r0
            r0.K(r8)
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity) r0
            r0.LLLII = r9
            r0.T()
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity) r0
            boolean r0 = r0.LLLIIII
            if (r0 != 0) goto L22
            com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchGuideConfigExperiment$GuideConfig r0 = com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchGuideConfigExperiment.LIZ()
            boolean r0 = r0.enable
            if (r0 == 0) goto L22
            com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchGuideConfigExperiment$GuideConfig r0 = com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchGuideConfigExperiment.LIZ()
            int r0 = r0.style
            if (r0 != r4) goto L22
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity) r0
            r2 = 0
            X.0Q7z r1 = X.C1558360qeg.LJI(r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility> r0 = com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility) r0
            if (r0 == 0) goto L22
            r0.dismiss()
            goto L22
        L8e:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS147S1100000_33.invoke$0(kotlin.jvm.internal.AwS147S1100000_33, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS147S1100000_33 awS147S1100000_33, Object obj) {
        String str;
        RealtimeLiveCenterTips realtimeLiveCenterTips;
        String str2;
        String str3;
        String str4;
        RealtimeLiveCenterTips realtimeLiveCenterTips2;
        C12OY c12oy = C12OY.LIZ;
        DataChannel dataChannel = ((C1AHA) awS147S1100000_33.l1).getDataChannel();
        String reportName = C1AH3.TIPS.getReportName();
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5 = ((C1AHA) awS147S1100000_33.l1).L5();
        String str5 = "";
        if (realtimeLiveCenterDetailDataL5 == null || (realtimeLiveCenterTips2 = realtimeLiveCenterDetailDataL5.tipsInfo) == null || (str = realtimeLiveCenterTips2.buttonEventTrack) == null) {
            str = "";
        }
        C12OY.LJIILLIIL(c12oy, dataChannel, reportName, "click", null, 0, str, null, 88);
        DataChannel dataChannel2 = ((C1AHA) awS147S1100000_33.l1).getDataChannel();
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL52 = ((C1AHA) awS147S1100000_33.l1).L5();
        if (realtimeLiveCenterDetailDataL52 != null) {
            realtimeLiveCenterTips = realtimeLiveCenterDetailDataL52.tipsInfo;
        } else {
            realtimeLiveCenterTips = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_realtime_live_center_tip_click");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        if (realtimeLiveCenterTips == null || (str2 = realtimeLiveCenterTips.tipsStarlingKey) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "tip_id");
        if (realtimeLiveCenterTips == null || (str3 = realtimeLiveCenterTips.typeEventTrack) == null) {
            str3 = "";
        }
        c474500IjALIZ.LJJII(str3, "tip_type_new");
        if (realtimeLiveCenterTips != null && (str4 = realtimeLiveCenterTips.buttonEventTrack) != null) {
            str5 = str4;
        }
        c474500IjALIZ.LJJII(str5, "action_type");
        c474500IjALIZ.LJJIJL();
        DataChannel dataChannel3 = ((C1AHA) awS147S1100000_33.l1).getDataChannel();
        if (dataChannel3 != null) {
            dataChannel3.FQ2(LiveCenterDismissEvent.class);
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1AHA) awS147S1100000_33.l1).getContext(), awS147S1100000_33.s0);
        ((C1AHA) awS147S1100000_33.l1).R5(false);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS147S1100000_33 awS147S1100000_33, Object obj) {
        ((MessageDraftViewModel) ((MUFQuickDMBoxAssemV2) awS147S1100000_33.l1).LLL.getValue()).wQ2(awS147S1100000_33.s0, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS147S1100000_33 awS147S1100000_33, Object obj) {
        ((MessageDraftViewModel) ((MUFQuickDMBoxAssem) awS147S1100000_33.l1).LLLF.getValue()).wQ2(awS147S1100000_33.s0, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS147S1100000_33 awS147S1100000_33, Object obj) {
        boolean z;
        C2180171AUd c2180171AUd = (C2180171AUd) obj;
        if (Intrinsics.LJFF(c2180171AUd.LIZIZ, awS147S1100000_33.s0) && Intrinsics.LJFF(c2180171AUd.LJI, (Integer) awS147S1100000_33.l1)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1100000_33(C1AHA c1aha, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1aha;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1100000_33(EcTakePhotoActivity ecTakePhotoActivity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = ecTakePhotoActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1100000_33(MUFQuickDMBoxAssem mUFQuickDMBoxAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = mUFQuickDMBoxAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1100000_33(MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = mUFQuickDMBoxAssemV2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S1100000_33(String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }
}
