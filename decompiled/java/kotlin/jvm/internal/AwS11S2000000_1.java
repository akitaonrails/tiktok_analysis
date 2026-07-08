package kotlin.jvm.internal;

import X.C03O0;
import X.C03O8;
import X.C09AY;
import X.C1397620mTQ;
import X.C890803dy;
import X.C891503e5;
import X.C896103ep;
import X.C948003nC;
import X.C957403oi;
import X.EnumC880203cG;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS11S2000000_1 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S2000000_1(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = "account_security_guarantee";
        this.s1 = str;
    }

    public static final Object invoke$0(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, new C948003nC(new Pair(awS11S2000000_1.s0, awS11S2000000_1.s1)), null, null, null, false, null, null, null, null, null, null, null, null, null, 4194047);
    }

    public static final Object invoke$1(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        EnumC880203cG enumC880203cG = EnumC880203cG.SYSTEM_ERROR;
        String str = awS11S2000000_1.s0;
        String str2 = awS11S2000000_1.s1;
        if (str2 == null) {
            str2 = "";
        }
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, false, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, paymentState.toast, paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, enumC880203cG, str, new C948003nC<>(str2), paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$10(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        C890803dy c890803dy = (C890803dy) obj;
        EnumC880203cG enumC880203cG = EnumC880203cG.BIND_ERROR;
        String str = awS11S2000000_1.s0;
        if (str == null) {
            str = "";
        }
        return C890803dy.LIZ(c890803dy, null, null, null, false, null, null, null, null, null, null, null, false, null, null, enumC880203cG, awS11S2000000_1.s1, new C948003nC(str), null, null, null, null, 3960831);
    }

    public static final Object invoke$11(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        C03O0.LIZ.getClass();
        c957403oi.LJ(C03O0.LIZIZ);
        String str = awS11S2000000_1.s0;
        if (str != null) {
            c957403oi.LIZLLL("popup_name", str);
        }
        String str2 = awS11S2000000_1.s1;
        if (str2 != null) {
            c957403oi.LIZLLL("action_type", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        C03O0 c03o0 = C03O0.LIZ;
        String str = awS11S2000000_1.s0;
        String str2 = awS11S2000000_1.s1;
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C03O0.LIZIZ);
        linkedHashMap.put("popup_name", "payment_failed");
        linkedHashMap.put("action_type", "ok");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_code", str);
        linkedHashMap.put("option_type", "payment_type");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("option_name", str2);
        C03O0.LLF("tiktokec_popup_click", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131833064, new AwS11S2000000_1(awS11S2000000_1.s0, awS11S2000000_1.s1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LJ(C03O8.LIZ);
        String str = awS11S2000000_1.s0;
        if (str != null) {
            c957403oi.LIZLLL("popup_name", str);
        }
        String str2 = awS11S2000000_1.s1;
        if (str2 != null) {
            c957403oi.LIZLLL("action_type", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("page_name", awS11S2000000_1.s0);
        map.put("module_name", "product_safety");
        map.put("previous_page", awS11S2000000_1.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        return C896103ep.LIZ((C896103ep) obj, null, null, null, null, new C948003nC(new Pair(awS11S2000000_1.s0, awS11S2000000_1.s1)), null, 95);
    }

    public static final Object invoke$7(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", awS11S2000000_1.s0);
        laneParams.plusAssign("module_name", "product_safety");
        laneParams.plusAssign("previous_page", awS11S2000000_1.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        EnumC880203cG enumC880203cG = EnumC880203cG.SYSTEM_ERROR;
        String str = awS11S2000000_1.s0;
        String str2 = awS11S2000000_1.s1;
        obj.getClass();
        return new C891503e5(enumC880203cG, str, str2, false);
    }

    public static final Object invoke$9(AwS11S2000000_1 awS11S2000000_1, Object obj) {
        C890803dy c890803dy = (C890803dy) obj;
        EnumC880203cG enumC880203cG = EnumC880203cG.SYSTEM_ERROR;
        String str = awS11S2000000_1.s0;
        if (str == null) {
            str = "";
        }
        return C890803dy.LIZ(c890803dy, null, null, null, false, null, null, null, null, null, null, null, false, null, null, enumC880203cG, awS11S2000000_1.s1, new C948003nC(str), null, null, null, null, 3960831);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S2000000_1(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
