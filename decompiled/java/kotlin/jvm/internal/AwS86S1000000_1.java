package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C879403c8;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS86S1000000_1 extends C09AY implements Function0 {
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
                return this.s0;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return this.s0;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return this.s0;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return this.s0;
            case 19:
                return this.s0;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return this.s0;
            case 21:
                return this.s0;
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return this.s0;
            case 25:
                return invoke$25(this);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS86S1000000_1(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            int r3 = 8 - r3
            if (r3 == 0) goto L10
            r1 = r2
            java.lang.String r0 = "sku"
            r1.s0 = r0
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            java.lang.String r0 = "review_entrance"
            r1.s0 = r0
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1000000_1.<init>(int):void");
    }

    public static final Object invoke$0(AwS86S1000000_1 awS86S1000000_1) {
        String strLJIIJ;
        PaymentInfo next;
        LinkedList<PaymentInfo> linkedList = PaymentCacheHelper.LIZLLL;
        String str = awS86S1000000_1.s0;
        Iterator<PaymentInfo> it2 = linkedList.iterator();
        do {
            strLJIIJ = null;
            if (!it2.hasNext()) {
                return null;
            }
            next = it2.next();
            PaymentMethod paymentMethod = next.paymentMethod;
            if (paymentMethod != null) {
                strLJIIJ = paymentMethod.LJIIJ();
            }
        } while (!Intrinsics.LJFF(strLJIIJ, str));
        return next;
    }

    public static final Object invoke$1(AwS86S1000000_1 awS86S1000000_1) {
        return PaymentCacheHelper.LJI.get(awS86S1000000_1.s0);
    }

    public static final Object invoke$10(AwS86S1000000_1 awS86S1000000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpToTryOn: ");
        sbLIZ.append(awS86S1000000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS86S1000000_1 awS86S1000000_1) {
        return String.valueOf(awS86S1000000_1.s0);
    }

    public static final Object invoke$14(AwS86S1000000_1 awS86S1000000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SKU_tiktokec_tag_show_");
        sbLIZ.append(awS86S1000000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS86S1000000_1 awS86S1000000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tiktokec_banner_show_");
        sbLIZ.append(awS86S1000000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS86S1000000_1 awS86S1000000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDP_tiktokec_tag_show_");
        sbLIZ.append(awS86S1000000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS86S1000000_1 awS86S1000000_1) {
        String strLJIIJ;
        Iterator<PaymentInfo> it2 = PaymentCacheHelper.LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PaymentInfo next = it2.next();
            PaymentMethod paymentMethod = next.paymentMethod;
            if (paymentMethod != null) {
                strLJIIJ = paymentMethod.LJIIJ();
            } else {
                strLJIIJ = null;
            }
            if (Intrinsics.LJFF(strLJIIJ, awS86S1000000_1.s0)) {
                PaymentCacheHelper.LIZLLL.remove(next);
                break;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS86S1000000_1 awS86S1000000_1) {
        return String.valueOf(awS86S1000000_1.s0);
    }

    public static final Object invoke$23(AwS86S1000000_1 awS86S1000000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aggregated_fit_insight_");
        sbLIZ.append(awS86S1000000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$25(AwS86S1000000_1 awS86S1000000_1) {
        String str = awS86S1000000_1.s0;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final Object invoke$3(AwS86S1000000_1 awS86S1000000_1) {
        String strLJIIJ;
        Iterator<PaymentInfo> it2 = C879403c8.LIZJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PaymentInfo next = it2.next();
            PaymentMethod paymentMethod = next.paymentMethod;
            if (paymentMethod != null) {
                strLJIIJ = paymentMethod.LJIIJ();
            } else {
                strLJIIJ = null;
            }
            if (Intrinsics.LJFF(strLJIIJ, awS86S1000000_1.s0)) {
                C879403c8.LIZJ.remove(next);
                break;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS86S1000000_1 awS86S1000000_1) {
        String strLJIIJ;
        PaymentInfo next;
        LinkedList<PaymentInfo> linkedList = C879403c8.LIZJ;
        String str = awS86S1000000_1.s0;
        Iterator<PaymentInfo> it2 = linkedList.iterator();
        do {
            strLJIIJ = null;
            if (!it2.hasNext()) {
                return null;
            }
            next = it2.next();
            PaymentMethod paymentMethod = next.paymentMethod;
            if (paymentMethod != null) {
                strLJIIJ = paymentMethod.LJIIJ();
            }
        } while (!Intrinsics.LJFF(strLJIIJ, str));
        return next;
    }

    public static final Object invoke$5(AwS86S1000000_1 awS86S1000000_1) {
        return C879403c8.LJFF.get(awS86S1000000_1.s0);
    }

    public static final Object invoke$6(AwS86S1000000_1 awS86S1000000_1) {
        return PaymentCacheHelper.LIZJ.get(awS86S1000000_1.s0);
    }

    public static final Object invoke$7(AwS86S1000000_1 awS86S1000000_1) {
        return PaymentCacheHelper.LJII.get(awS86S1000000_1.s0);
    }

    public static final Object invoke$8(AwS86S1000000_1 awS86S1000000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aggregated_fit_insight_");
        sbLIZ.append(awS86S1000000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS86S1000000_1 awS86S1000000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpToTryOn: ");
        sbLIZ.append(awS86S1000000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1000000_1(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
