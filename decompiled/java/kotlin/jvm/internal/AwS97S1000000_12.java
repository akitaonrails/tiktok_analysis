package kotlin.jvm.internal;

import X.C09AY;
import X.C0T82;
import X.C0TOD;
import X.C1009490cNP;
import X.C1897250zTH;
import X.C20441214yg;
import X.C2188811AlT;
import X.C741110T5h;
import X.InterfaceC1008930cMV;
import X.InterfaceC772390URp;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.oppo.hyperboost.IHyperboostService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS97S1000000_12 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return this.s0;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS97S1000000_12 awS97S1000000_12) {
        InterfaceC772390URp.i.LJFF(Boolean.TRUE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment - ");
        sbLIZ.append(awS97S1000000_12.s0);
        sbLIZ.append(" - initDynamicStrategy Local settings load dynamic policy tags");
        C20441214yg.LIZIZ("test_lzk_dynamic", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS97S1000000_12 awS97S1000000_12) {
        InterfaceC772390URp.i.LJFF(Boolean.TRUE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment - ");
        sbLIZ.append(awS97S1000000_12.s0);
        sbLIZ.append(" - initDynamicStrategy Local settings load dynamic policy tags");
        C20441214yg.LIZIZ("test_lzk_dynamic", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS97S1000000_12 awS97S1000000_12) {
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1008930cMV interfaceC1008930cMVLJ;
        C1009490cNP c1009490cNPLJIILJJIL;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1008930cMVLJ = iFeedServiceLIZIZ.LJ()) != null && (c1009490cNPLJIILJJIL = interfaceC1008930cMVLJ.LJIILJJIL()) != null) {
            c1009490cNPLJIILJJIL.LJ(awS97S1000000_12.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS97S1000000_12 awS97S1000000_12) {
        return Boolean.valueOf(!Intrinsics.LJFF(awS97S1000000_12.s0, ""));
    }

    public static final Object invoke$12(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$13(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$14(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$15(AwS97S1000000_12 awS97S1000000_12) {
        SubscriptionVM subscriptionVM = C0TOD.LIZIZ;
        if (subscriptionVM != null) {
            subscriptionVM.xQ2(9, awS97S1000000_12.s0, "59");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$18(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$19(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS97S1000000_12 awS97S1000000_12) {
        C1897250zTH c1897250zTHLIZJ = C0T82.LIZJ("homepage_hot");
        c1897250zTHLIZJ.LJ.add(awS97S1000000_12.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS97S1000000_12 awS97S1000000_12) {
        ((IHyperboostService) C741110T5h.LIZIZ.getValue()).LIZJ(awS97S1000000_12.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS97S1000000_12 awS97S1000000_12) {
        ((IHyperboostService) C741110T5h.LIZIZ.getValue()).LIZJ(awS97S1000000_12.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AwS97S1000000_12 awS97S1000000_12) {
        boolean z;
        if (awS97S1000000_12.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(AwS97S1000000_12 awS97S1000000_12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageRetreatEnter ");
        sbLIZ.append(awS97S1000000_12.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S1000000_12(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
