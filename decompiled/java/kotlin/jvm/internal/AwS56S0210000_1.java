package kotlin.jvm.internal;

import X.C036G;
import X.C03JV;
import X.C03MI;
import X.C03MQ;
import X.C03MY;
import X.C03MZ;
import X.C03W9;
import X.C03YI;
import X.C04H5;
import X.C09AY;
import X.C0I7D;
import X.C0WZX;
import X.C1397630mTR;
import X.C1397650mTT;
import X.C1745180vW0;
import X.C1748470vbJ;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C2262851Dhb;
import X.C2262981Dho;
import X.C259800zU;
import X.C722302rt;
import X.C7976039q;
import X.C830103Md;
import X.C833003Ng;
import X.C833203Ni;
import X.C890803dy;
import X.C891503e5;
import X.C948003nC;
import X.EnumC880203cG;
import android.content.Context;
import android.text.Editable;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoPreBindVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RecoveryMarketingInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.EULogisticSelectByZipcodeVH;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS56S0210000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(Function0 function0, int i) {
        super(1);
        this.$t = i;
        this.l0 = null;
        this.z2 = true;
        this.l1 = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        BillInfoData billInfoData;
        C03W9 c03w9 = (C03W9) obj;
        Response response = (Response) ((C259800zU) awS56S0210000_1.l0).element;
        if (response != null) {
            billInfoData = (BillInfoData) response.data;
        } else {
            billInfoData = null;
        }
        c03w9.LJFF(billInfoData, null, ((BillInfoRequest) awS56S0210000_1.l1).getFlowType(), Boolean.valueOf(awS56S0210000_1.z2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        ((C03W9) obj).LJFF((BillInfoData) awS56S0210000_1.l0, null, ((BillInfoRequest) awS56S0210000_1.l1).getFlowType(), Boolean.valueOf(awS56S0210000_1.z2));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        String str;
        HashMap map = (HashMap) obj;
        map.putAll((Map) awS56S0210000_1.l0);
        map.put("module_name", "order_summary");
        if (!awS56S0210000_1.z2) {
            str = "see_more";
        } else {
            str = "see_less";
        }
        map.put("button_name", str);
        String str2 = ((C7976039q) awS56S0210000_1.l1).LLILZLL;
        if (str2 != null) {
            map.put("summary_info", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        String str;
        String str2;
        C890803dy c890803dy = (C890803dy) obj;
        PipoPreBindVerifyData pipoPreBindVerifyData = (PipoPreBindVerifyData) awS56S0210000_1.l0;
        if (pipoPreBindVerifyData != null) {
            str = pipoPreBindVerifyData.errorMsg;
        } else {
            str = null;
        }
        if (pipoPreBindVerifyData == null || (str2 = pipoPreBindVerifyData.LIZ) == null) {
            str2 = "";
        }
        return C890803dy.LIZ(c890803dy, null, null, null, false, null, null, null, null, null, null, null, awS56S0210000_1.z2, null, null, (EnumC880203cG) awS56S0210000_1.l1, str, new C948003nC(str2), null, null, null, null, 3960831);
    }

    public static final Object invoke$12(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        String str;
        EnumC880203cG enumC880203cG = (EnumC880203cG) awS56S0210000_1.l0;
        PipoPreBindVerifyData pipoPreBindVerifyData = (PipoPreBindVerifyData) awS56S0210000_1.l1;
        String str2 = null;
        if (pipoPreBindVerifyData != null) {
            str = pipoPreBindVerifyData.errorMsg;
            str2 = pipoPreBindVerifyData.LIZ;
        } else {
            str = null;
        }
        boolean z = awS56S0210000_1.z2;
        obj.getClass();
        return new C891503e5(enumC880203cG, str, str2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS56S0210000_1 r57, java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS56S0210000_1.invoke$13(kotlin.jvm.internal.AwS56S0210000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, null, null, null, new C833203Ni(new C833003Ng(awS56S0210000_1.z2, 2), (ECRichText) ((C259800zU) awS56S0210000_1.l0).element, (C03MI) ((C259800zU) awS56S0210000_1.l1).element), null, null, null, 1919);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        String priceVal;
        String priceVal2;
        String currency;
        Price price;
        Price price2;
        Price price3;
        C2262851Dhb c2262851Dhb = (C2262851Dhb) obj;
        boolean z = awS56S0210000_1.z2;
        Pair[] pairArr = new Pair[3];
        C722302rt c722302rt = ((C03JV) awS56S0210000_1.l0).LLILLL;
        if (c722302rt != null && (price3 = c722302rt.LLIZ) != null) {
            priceVal = price3.getPriceVal();
        } else {
            priceVal = null;
        }
        pairArr[0] = new Pair("total_payment", String.valueOf(priceVal));
        C722302rt c722302rt2 = ((C03JV) awS56S0210000_1.l0).LLILLL;
        if (c722302rt2 != null && (price2 = c722302rt2.LLIZLLLIL) != null) {
            priceVal2 = price2.getPriceVal();
        } else {
            priceVal2 = null;
        }
        pairArr[1] = new Pair("discount_amount", String.valueOf(priceVal2));
        C722302rt c722302rt3 = ((C03JV) awS56S0210000_1.l0).LLILLL;
        if (c722302rt3 != null && (price = c722302rt3.LLIZ) != null) {
            currency = price.getCurrency();
        } else {
            currency = null;
        }
        pairArr[2] = new Pair("currency", String.valueOf(currency));
        return C2262851Dhb.LIZ(c2262851Dhb, null, null, null, null, null, null, null, null, new C2262981Dho(new C833003Ng(z, (Map<String, ? extends Object>) C2097608Jq.LJIIIIZZ(pairArr)), (String) ((C259800zU) awS56S0210000_1.l1).element, 33), null, null, 1791);
    }

    public static final Object invoke$16(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, null, null, null, null, null, null, new C03MY(new C833003Ng(true, 2), null, (C03MQ) awS56S0210000_1.l0, awS56S0210000_1.z2, (C830103Md) awS56S0210000_1.l1, false, C03MZ.SINGLE, null, 354), 1023);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, null, null, null, new C833203Ni(new C833003Ng(awS56S0210000_1.z2, 2), (ECRichText) ((C259800zU) awS56S0210000_1.l0).element, (C03MI) ((C259800zU) awS56S0210000_1.l1).element), null, null, null, 1919);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        String priceVal;
        String priceVal2;
        String currency;
        Price price;
        Price price2;
        Price price3;
        C2262851Dhb c2262851Dhb = (C2262851Dhb) obj;
        boolean z = awS56S0210000_1.z2;
        Pair[] pairArr = new Pair[3];
        C722302rt c722302rt = ((C03JV) awS56S0210000_1.l0).LLILLL;
        if (c722302rt != null && (price3 = c722302rt.LLIZ) != null) {
            priceVal = price3.getPriceVal();
        } else {
            priceVal = null;
        }
        pairArr[0] = new Pair("total_payment", String.valueOf(priceVal));
        C722302rt c722302rt2 = ((C03JV) awS56S0210000_1.l0).LLILLL;
        if (c722302rt2 != null && (price2 = c722302rt2.LLIZLLLIL) != null) {
            priceVal2 = price2.getPriceVal();
        } else {
            priceVal2 = null;
        }
        pairArr[1] = new Pair("discount_amount", String.valueOf(priceVal2));
        C722302rt c722302rt3 = ((C03JV) awS56S0210000_1.l0).LLILLL;
        if (c722302rt3 != null && (price = c722302rt3.LLIZ) != null) {
            currency = price.getCurrency();
        } else {
            currency = null;
        }
        pairArr[2] = new Pair("currency", String.valueOf(currency));
        return C2262851Dhb.LIZ(c2262851Dhb, null, null, null, null, null, null, null, null, new C2262981Dho(new C833003Ng(z, (Map<String, ? extends Object>) C2097608Jq.LJIIIIZZ(pairArr)), (String) ((C259800zU) awS56S0210000_1.l1).element, 33), null, null, 1791);
    }

    public static final Object invoke$19(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Function0 function0 = (Function0) awS56S0210000_1.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (!awS56S0210000_1.z2) {
            ((Function0) awS56S0210000_1.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        Region region;
        C1748470vbJ c1748470vbJ;
        C1748470vbJ c1748470vbJ2;
        C0I7D editText;
        Editable editableLLLLJI;
        C0I7D editText2;
        AddressSelectState addressSelectState = (AddressSelectState) obj;
        ChangeLocationData changeLocationData = (ChangeLocationData) awS56S0210000_1.l0;
        if (changeLocationData != null) {
            region = changeLocationData.region;
        } else {
            region = null;
        }
        boolean zLJI = C1745180vW0.LJI(region);
        C1748470vbJ c1748470vbJ3 = (C1748470vbJ) ((EULogisticSelectByZipcodeVH) awS56S0210000_1.l1).X5().findViewById(R.id.zipcodeEditText);
        if (c1748470vbJ3 != null && (editText2 = c1748470vbJ3.getEditText()) != null) {
            editText2.setEnabled(!zLJI);
        }
        if ((zLJI || awS56S0210000_1.z2) && (c1748470vbJ = (C1748470vbJ) ((EULogisticSelectByZipcodeVH) awS56S0210000_1.l1).X5().findViewById(R.id.zipcodeEditText)) != null) {
            c1748470vbJ.LJIILIIL("");
        }
        boolean z = true;
        if (addressSelectState.getCurrentAddressSelectType() == 1) {
            AddressSelectViewModel addressSelectViewModelA6 = ((EULogisticSelectByZipcodeVH) awS56S0210000_1.l1).a6();
            if (!zLJI && ((c1748470vbJ2 = (C1748470vbJ) ((EULogisticSelectByZipcodeVH) awS56S0210000_1.l1).X5().findViewById(R.id.zipcodeEditText)) == null || (editText = c1748470vbJ2.getEditText()) == null || (editableLLLLJI = C2204961BRm.LLLLJI(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnuxfalRpaQRkOc13ucvJCzjIaA6YJIVjeYpN8eG1SEg2d9zzS3pLzlPSJ0htTcDKUSf2Frml3rrmpj/tLSrBjsN6Ma31w==", null))) == null || editableLLLLJI.length() <= 0)) {
                z = false;
            }
            addressSelectViewModelA6.getClass();
            addressSelectViewModelA6.setState(new AwS89S0110000_1(z, (Integer) null, 31));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        Object objValueOf;
        Object string;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "shipping_info");
        laneParams.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        laneParams.plusAssign("module_name", "address");
        Boolean bool = ((ReachableAddress) awS56S0210000_1.l0).reachable;
        Object obj3 = null;
        if (bool != null) {
            objValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            objValueOf = null;
        }
        laneParams.plusAssign("is_address_deliverable", objValueOf);
        laneParams.plusAssign("is_default", Integer.valueOf(awS56S0210000_1.z2 ? 1 : 0));
        laneParams.plusAssign("rank", Integer.valueOf(((AddressAdapter$AddressViewHolder) awS56S0210000_1.l1).LLJI));
        laneParams.plusAssign("is_selected", Integer.valueOf(((ReachableAddress) awS56S0210000_1.l0).isSelect ? 1 : 0));
        Integer num = ((ReachableAddress) awS56S0210000_1.l0).addressInvalidType;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        laneParams.plusAssign("invalid_reason", string);
        laneParams.plusAssign("is_valid", Integer.valueOf(((ReachableAddress) awS56S0210000_1.l0).LIZIZ()));
        Map<String, String> map = ((ReachableAddress) awS56S0210000_1.l0).daInfo;
        if (map != null && (obj2 = map.get("invalid_reason_code")) != null) {
            obj3 = obj2;
        }
        laneParams.plusAssign("invalid_reason_code", obj3);
        laneParams.putAll(((AddressAdapter$AddressViewHolder) awS56S0210000_1.l1).W5().gv().LIZ("c2393.d5331"));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0538  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS56S0210000_1 r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS56S0210000_1.invoke$4(kotlin.jvm.internal.AwS56S0210000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        String str;
        RecoveryMarketingInfo recoveryMarketingInfo;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        PaymentMethod paymentMethod = (PaymentMethod) awS56S0210000_1.l0;
        if (paymentMethod == null || (recoveryMarketingInfo = paymentMethod.recoveryMarketingInfo) == null || (str = recoveryMarketingInfo.tipButton) == null) {
            str = "";
        }
        c1397630mTR.LIZJ(0, str, AFwS228S0000000_1.get$arr$(249));
        if (awS56S0210000_1.z2) {
            List<C1397650mTT> list = c1397630mTR.LJ;
            Context context = (Context) awS56S0210000_1.l1;
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((C1397650mTT) it2.next()).LIZ(new AwS580S0100000_1(context, 191));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState] */
    public static final Object invoke$6(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        C259800zU c259800zU = (C259800zU) awS56S0210000_1.l0;
        Integer num = PaymentViewModel.LLLIIII;
        PaymentMethodsData paymentMethodsData = ((PaymentViewModel) awS56S0210000_1.l1).LLJJIJIL;
        PaymentInfo paymentInfo = ((PaymentState) obj).getPaymentInfo();
        Boolean boolValueOf = Boolean.valueOf(awS56S0210000_1.z2);
        PaymentViewModel paymentViewModel = (PaymentViewModel) awS56S0210000_1.l1;
        c259800zU.element = C03YI.LJI(num, paymentMethodsData, paymentInfo, boolValueOf, paymentViewModel.LLJ, ViewModelKt.getViewModelScope(paymentViewModel), false, true, false);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        Object obj2;
        C948003nC c948003nC;
        C03JV c03jv = (C03JV) obj;
        PaymentInfo paymentInfo = (PaymentInfo) awS56S0210000_1.l0;
        if (awS56S0210000_1.z2) {
            obj2 = new Object();
        } else {
            obj2 = null;
        }
        if (!((OrderSubmitAssemViewModel) awS56S0210000_1.l1).LLLZIL) {
            c948003nC = new C948003nC(Boolean.TRUE);
        } else {
            c948003nC = null;
        }
        return C03JV.LIZ(c03jv, 0, null, null, false, null, false, paymentInfo, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, obj2, null, null, false, null, null, false, null, null, null, null, null, null, c948003nC, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -65, -1, -8389633, 1048575);
    }

    public static final Object invoke$8(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        ((C036G) obj).LJJJJZ(((OrderSubmitAssemViewModel) awS56S0210000_1.l1).LLJJJ, (BillInfoData) awS56S0210000_1.l0, awS56S0210000_1.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS56S0210000_1 awS56S0210000_1, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Function0 function0 = (Function0) awS56S0210000_1.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (!awS56S0210000_1.z2) {
            ((Function0) awS56S0210000_1.l1).invoke();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS56S0210000_1(X.EnumC880203cG r3, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoPreBindVerifyData r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 11 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.z2 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r4
            r1.z2 = r5
            r1.l1 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS56S0210000_1.<init>(X.03cG, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoPreBindVerifyData, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(C259800zU c259800zU, C259800zU c259800zU2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0210000_1(C259800zU c259800zU, C259800zU<PaymentState> c259800zU2, PaymentViewModel paymentViewModel, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.z2 = paymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0210000_1(C259800zU c259800zU, C259800zU<BillInfoResponse> c259800zU2, BillInfoRequest billInfoRequest, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.z2 = billInfoRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(C03MQ c03mq, boolean z, C830103Md c830103Md, int i) {
        super(1);
        this.$t = i;
        this.l0 = c03mq;
        this.z2 = z;
        this.l1 = c830103Md;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(C04H5 c04h5, boolean z, PopUpButtonExtraInfo popUpButtonExtraInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c04h5;
        this.z2 = z;
        this.l1 = popUpButtonExtraInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(ChangeLocationData changeLocationData, EULogisticSelectByZipcodeVH eULogisticSelectByZipcodeVH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = changeLocationData;
        this.l1 = eULogisticSelectByZipcodeVH;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(ReachableAddress reachableAddress, boolean z, AddressAdapter$AddressViewHolder addressAdapter$AddressViewHolder, int i) {
        super(1);
        this.$t = i;
        this.l0 = reachableAddress;
        this.z2 = z;
        this.l1 = addressAdapter$AddressViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(PaymentInfo paymentInfo, boolean z, OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentInfo;
        this.z2 = z;
        this.l1 = orderSubmitAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(PaymentMethod paymentMethod, PaymentViewModel paymentViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentMethod;
        this.l1 = paymentViewModel;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(PaymentMethod paymentMethod, boolean z, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentMethod;
        this.z2 = z;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(BillInfoData billInfoData, BillInfoRequest billInfoRequest, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = billInfoData;
        this.l1 = billInfoRequest;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(BillInfoData billInfoData, OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = billInfoData;
        this.l1 = orderSubmitAssemViewModel;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0210000_1(Map map, Map<String, Object> map2, boolean z, C7976039q c7976039q) {
        super(1);
        this.$t = c7976039q;
        this.l0 = map;
        this.z2 = map2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(Function0 function0, Function0 function02, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = function0;
        this.z2 = z;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0210000_1(boolean z, C03JV c03jv, C259800zU c259800zU, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c03jv;
        this.l1 = c259800zU;
    }
}
