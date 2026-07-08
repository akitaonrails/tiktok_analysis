package kotlin.jvm.internal;

import X.C03H5;
import X.C09AY;
import X.C0RTB;
import X.C0RXZ;
import X.C0SPF;
import X.C0SVZ;
import X.C0T6L;
import X.C1163440gNi;
import X.C12835050n;
import X.C1389890mGx;
import X.C1397620mTQ;
import X.C1434650nR9;
import X.C1445305lD;
import X.C1697810uHb;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C291001Au;
import X.C700140RdE;
import X.C700190RdJ;
import X.C701480RfO;
import X.C722430SVl;
import X.C729440SjO;
import X.C729450SjP;
import X.C732520SoM;
import X.C733540Sq0;
import X.EnumC1450305m1;
import X.EnumC733460Sps;
import X.InterfaceC699620RcO;
import X.InterfaceC700000Rd0;
import X.InterfaceC722440SVm;
import X.InterfaceC729460SjQ;
import android.graphics.drawable.Drawable;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryUploadProgressComponent;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.StandardBannerWList;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS96S1200000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131846537, new AwS96S1200000_11(awS96S1200000_11.s0, (StoryUploadProgressComponent) awS96S1200000_11.l1, (C0SPF) awS96S1200000_11.l2, 1));
        c1397620mTQ.LJFF(2131846536, new AwS377S0200000_11((StoryUploadProgressComponent) awS96S1200000_11.l1, (C0SPF) awS96S1200000_11.l2, 49));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        Float fValueOf;
        C729450SjP c729450SjP;
        SimplePublishModel simplePublishModel;
        PublishModel publishModel = null;
        if (awS96S1200000_11.s0 != null && ((IAVPublishService) ((StoryUploadProgressComponent) awS96S1200000_11.l1).LLLIILIL.getValue()).cancelPublishByClickCover(awS96S1200000_11.s0)) {
            C1389890mGx c1389890mGx = new C1389890mGx(((StoryUploadProgressComponent) awS96S1200000_11.l1).getContentView());
            c1389890mGx.LJIIIZ(2131846544);
            c1389890mGx.LJIIJJI();
        } else {
            IAVPublishService iAVPublishService = (IAVPublishService) ((StoryUploadProgressComponent) awS96S1200000_11.l1).LLLIILIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publishId is Null: ");
            sbLIZ.append(awS96S1200000_11.s0);
            sbLIZ.append("publish progress: ");
            C0SPF c0spf = (C0SPF) awS96S1200000_11.l2;
            if (c0spf != null && (c729450SjP = c0spf.LIZIZ) != null) {
                fValueOf = Float.valueOf(c729450SjP.LIZ);
            } else {
                fValueOf = null;
            }
            sbLIZ.append(fValueOf);
            iAVPublishService.log("report_cancel_failure_reason_parallel", C2188811AlT.LIZIZ(sbLIZ));
            C1389890mGx c1389890mGx2 = new C1389890mGx(((StoryUploadProgressComponent) awS96S1200000_11.l1).getContentView());
            c1389890mGx2.LJIIIZ(2131846541);
            c1389890mGx2.LJIIJJI();
        }
        IAVPublishService iAVPublishService2 = (IAVPublishService) ((StoryUploadProgressComponent) awS96S1200000_11.l1).LLLIILIL.getValue();
        C0SPF c0spf2 = (C0SPF) awS96S1200000_11.l2;
        if (c0spf2 != null && (simplePublishModel = c0spf2.LIZ) != null) {
            publishModel = simplePublishModel.publishModel;
        }
        iAVPublishService2.reportQuitAutoUploadingEvent(publishModel, "quit");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        Aweme aweme;
        C732520SoM c732520SoM = (C732520SoM) obj;
        EnumC733460Sps enumC733460Sps = EnumC733460Sps.DM_SHARE;
        VideoItemParams item = ((VideoShareViewModel) awS96S1200000_11.l1).getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        return C732520SoM.LIZ(c732520SoM, null, null, null, null, null, new C291001Au(new Pair(enumC733460Sps, new C733540Sq0(aweme, ((VideoShareViewModel) awS96S1200000_11.l1).eventType, (UrlModel) awS96S1200000_11.l2, awS96S1200000_11.s0, 24))), 63);
    }

    public static final Object invoke$11(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        VideoShareViewModel videoShareViewModel = (VideoShareViewModel) awS96S1200000_11.l1;
        videoShareViewModel.setState(new AwS96S1200000_11(videoShareViewModel, (UrlModel) awS96S1200000_11.l2, awS96S1200000_11.s0, 10));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        VideoShareViewModel videoShareViewModel = (VideoShareViewModel) awS96S1200000_11.l1;
        videoShareViewModel.setState(new AwS590S0100000_11(videoShareViewModel, (Drawable) awS96S1200000_11.l2, awS96S1200000_11.s0, 538));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        String str;
        String str2;
        Map<String, ? extends Object> mapLIZJ;
        String str3;
        InterfaceC699620RcO interfaceC699620RcO = (InterfaceC699620RcO) obj;
        List<String> listLJIIL = C1697810uHb.LJIIL(awS96S1200000_11.s0);
        for (BannerCommonStruct bannerCommonStruct : (List) awS96S1200000_11.l1) {
            BannerCommonKey bannerCommonKey = bannerCommonStruct.bannerKey;
            if (bannerCommonKey != null && (str = bannerCommonKey.componentKey) != null && !StandardBannerWList.LIZ.contains(str)) {
                boolean zContains = ((List) awS96S1200000_11.l2).contains(bannerCommonStruct);
                boolean zLJFF = Intrinsics.LJFF(str, awS96S1200000_11.s0);
                boolean z = !zContains;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (zContains) {
                    str2 = "active check failed";
                    mapLIZJ = C2097908Jt.LIZJ(new Pair("biz_active", Boolean.FALSE));
                } else {
                    str2 = null;
                    mapLIZJ = null;
                }
                String str4 = null;
                interfaceC699620RcO.LIZLLL(str, "STANDARD", boolValueOf, str2, mapLIZJ, null, null, null, null, null, null, Boolean.TRUE, null, null, null);
                if (zLJFF) {
                    str3 = "passed decision";
                } else {
                    str3 = "failed in Banner's inner decision";
                }
                if (!zLJFF) {
                    str4 = "low_priority";
                }
                interfaceC699620RcO.LJ(str, "STANDARD", zLJFF, str3, z, "banner_inner", listLJIIL, str4, null, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        List<String> list;
        C12835050n c12835050n = (C12835050n) obj;
        boolean z = true;
        if (((EnumC1450305m1) awS96S1200000_11.l1) != EnumC1450305m1.BY_PASS) {
            FeedComponentPriorityData feedComponentPriorityData = ((C700190RdJ) awS96S1200000_11.l2).LIZLLL;
            String str = null;
            if (feedComponentPriorityData == null || (list = feedComponentPriorityData.priorityList) == null || !list.contains(awS96S1200000_11.s0)) {
                z = false;
                str = "check enable failed";
            }
            c12835050n.LIZ(str, C2097908Jt.LIZJ(new Pair("in_priority_list", Boolean.valueOf(z))));
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        String strLLLII;
        C0RXZ c0rxz;
        ReusedAssem reusedAssem = (ReusedAssem) obj;
        if (reusedAssem != null && (strLLLII = ((FcpNodeProtocol) awS96S1200000_11.l1).LLLII()) != null) {
            C1445305lD c1445305lDLIZ = C700140RdE.LIZ(reusedAssem, (FcpNodeProtocol) awS96S1200000_11.l1, C700140RdE.LIZLLL(((C700190RdJ) awS96S1200000_11.l2).LIZ, strLLLII), awS96S1200000_11.s0, (C700190RdJ) awS96S1200000_11.l2);
            if (c1445305lDLIZ != null && (c0rxz = ((C700190RdJ) awS96S1200000_11.l2).LJIIIIZZ) != null) {
                c0rxz.LJIIL(Collections.singletonList(c1445305lDLIZ));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        InterfaceC700000Rd0 interfaceC700000Rd0Wb1;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((ConditionData) awS96S1200000_11.l1).setCanApplySlot(zBooleanValue);
        FcpNodeProtocol fcpNodeProtocol = (FcpNodeProtocol) awS96S1200000_11.l2;
        if (fcpNodeProtocol != null && (interfaceC700000Rd0Wb1 = fcpNodeProtocol.wb1()) != null) {
            interfaceC700000Rd0Wb1.l0(zBooleanValue);
        }
        new AwS9S1010000_2(awS96S1200000_11.s0, zBooleanValue, 0);
        C0T6L.LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        C0RTB c0rtb = (C0RTB) obj;
        c0rtb.LLJ = (ReusedUISlotAssem) ((ReusedAssem) awS96S1200000_11.l1);
        c0rtb.LLJIJIL = C1163440gNi.LIZLLL;
        c0rtb.LLJILJILJ = ((C701480RfO) awS96S1200000_11.l2).LJFF.invoke(awS96S1200000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        InterfaceC729460SjQ interfaceC729460SjQ = (InterfaceC729460SjQ) obj;
        interfaceC729460SjQ.LIZJ(((C729440SjO) awS96S1200000_11.l1).LLILLL);
        interfaceC729460SjQ.LJI(((C0SPF) awS96S1200000_11.l2).LIZIZ, awS96S1200000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        ((SocialPublishCallback) obj).onPublishFailed((PublishModel) awS96S1200000_11.l1, (C1434650nR9) awS96S1200000_11.l2, awS96S1200000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS96S1200000_11 awS96S1200000_11, Object obj) {
        C722430SVl.LIZJ(awS96S1200000_11.s0, (InterfaceC722440SVm) awS96S1200000_11.l1);
        C0SVZ c0svzLIZJ = ((InterfaceC722440SVm) awS96S1200000_11.l1).LIZJ();
        if (c0svzLIZJ != null) {
            c0svzLIZJ.LIZIZ();
        }
        ((Function1) awS96S1200000_11.l2).invoke(obj);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(InterfaceC722440SVm interfaceC722440SVm, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.s0 = "banner_view";
        this.l1 = interfaceC722440SVm;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(EnumC1450305m1 enumC1450305m1, C700190RdJ c700190RdJ, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = enumC1450305m1;
        this.l2 = c700190RdJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(C729440SjO c729440SjO, String str, C0SPF c0spf, int i) {
        super(1);
        this.$t = i;
        this.l1 = c729440SjO;
        this.s0 = str;
        this.l2 = c0spf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS96S1200000_11(ReusedAssem reusedAssem, ReusedAssem<? extends C03H5> reusedAssem2, C701480RfO c701480RfO, String str) {
        super(1);
        this.$t = str;
        this.l1 = reusedAssem;
        this.l2 = reusedAssem2;
        this.s0 = c701480RfO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(VideoShareViewModel videoShareViewModel, Drawable drawable, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoShareViewModel;
        this.l2 = drawable;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(VideoShareViewModel videoShareViewModel, UrlModel urlModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoShareViewModel;
        this.l2 = urlModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(PublishModel publishModel, C1434650nR9 c1434650nR9, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = publishModel;
        this.l2 = c1434650nR9;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(FcpNodeProtocol fcpNodeProtocol, C700190RdJ c700190RdJ, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = fcpNodeProtocol;
        this.l2 = c700190RdJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(String str, StoryUploadProgressComponent storyUploadProgressComponent, C0SPF c0spf, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = storyUploadProgressComponent;
        this.l2 = c0spf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS96S1200000_11(String str, String str2, List<BannerCommonStruct> list, List<BannerCommonStruct> list2) {
        super(1);
        this.$t = list2;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S1200000_11(ConditionData conditionData, FcpNodeProtocol fcpNodeProtocol, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l1 = conditionData;
        this.l2 = fcpNodeProtocol;
        this.s0 = str2;
    }
}
