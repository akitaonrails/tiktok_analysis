package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C03O0;
import X.C03RM;
import X.C03RN;
import X.C03RO;
import X.C03RP;
import X.C03WH;
import X.C09CT;
import X.C1018703yb;
import X.C1238130iKB;
import X.C1323720kYE;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1741890vQh;
import X.C770702zh;
import X.C7888036g;
import X.C899503fN;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.BNPLActivateModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS10S1210000_1;
import kotlin.jvm.internal.AwS6S0220000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivateHelper {
    public static final ActivateHelper LIZ = new ActivateHelper();

    public static boolean LIZLLL(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            BNPLActivateModel bNPLActivateModel = C03RP.LIZ;
            return false;
        }
        if (C03RP.LIZ(paymentMethod) && C03RP.LIZIZ().enableDisplayInstallmentPlan && Intrinsics.LJFF(paymentMethod.isExpand, Boolean.TRUE) && paymentMethod.LJJJJJL()) {
            return true;
        }
        return false;
    }

    public static boolean LJII(PaymentMethodsData paymentMethodsData) {
        String str;
        if (!C03RP.LIZIZ().enableNotice || paymentMethodsData == null) {
            return false;
        }
        Map<String, String> map = paymentMethodsData.experimentInfo;
        if (map != null) {
            str = map.get("use_new_bnpl_entrance_schema");
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "true") && !paymentMethodsData.LJJI()) {
            return false;
        }
        return true;
    }

    public static final class ButtonInfo {

        @C09CT("action")
        public final String action;

        @C09CT("text")
        public final String text;

        public ButtonInfo() {
            this(null, null);
        }

        public ButtonInfo(String str, String str2) {
            this.text = str;
            this.action = str2;
        }
    }

    public static boolean LIZJ(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        if (paymentMethod == null) {
            BNPLActivateModel bNPLActivateModel = C03RP.LIZ;
            return false;
        }
        if (C03RP.LIZ(paymentMethod) && C03RP.LIZIZ().enableInstallmentClick && LJ(paymentMethod, paymentMethodsData)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        String str;
        if (!C03RP.LIZ(paymentMethod) || paymentMethodsData == null) {
            return false;
        }
        Map<String, String> map = paymentMethodsData.experimentInfo;
        if (map != null) {
            str = map.get("use_new_bnpl_entrance_schema");
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "true") || paymentMethod == null || !paymentMethod.LJJJJJL()) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        if (C03RP.LIZIZ().enableCashierButtonClick && LJ(paymentMethod, paymentMethodsData)) {
            return true;
        }
        return false;
    }

    public static boolean LJI(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        if (C03RP.LIZIZ().enableOspButtonClick && LJ(paymentMethod, paymentMethodsData)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        if (paymentMethodsData != null && paymentMethodsData.LJJI()) {
            if (paymentMethod == null) {
                BNPLActivateModel bNPLActivateModel = C03RP.LIZ;
                return false;
            }
            if (C03RP.LIZ(paymentMethod) && C03RP.LIZIZ().enableCreditAndPayFlow && paymentMethod.LJJJJJL()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIZ(InstallmentPlan installmentPlan, PaymentMethod paymentMethod) {
        String str;
        boolean z = false;
        if (paymentMethod == null || paymentMethod.LJJJJJL() || !C7888036g.LIZ(paymentMethod)) {
            return false;
        }
        if (installmentPlan == null || (str = installmentPlan.additionalClarification) == null || str.length() == 0) {
            z = true;
        }
        return !z;
    }

    public static String LJIILIIL(InstallmentPlan installmentPlan, PaymentMethod paymentMethod) {
        String str = null;
        if (paymentMethod == null) {
            return null;
        }
        if (installmentPlan != null) {
            str = installmentPlan.additionalClarification;
        }
        if (!C7888036g.LIZ(paymentMethod) || str == null || str.length() == 0) {
            return paymentMethod.additionalClarification;
        }
        return str;
    }

    public static final class BnplActivateResult {

        @C09CT("actionType")
        public final String actionType;

        @C09CT("content")
        public final DialogContent dialogContent;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final String status;

        public BnplActivateResult() {
            this(null, null, null);
        }

        public BnplActivateResult(String str, DialogContent dialogContent, String str2) {
            this.status = str;
            this.dialogContent = dialogContent;
            this.actionType = str2;
        }
    }

    public static final class DialogContent {

        @C09CT("btn")
        public final ButtonInfo buttonInfo;

        @C09CT("description")
        public final String description;

        @C09CT("title")
        public final String title;

        public DialogContent() {
            this(null, null, null);
        }

        public DialogContent(String str, String str2, ButtonInfo buttonInfo) {
            this.title = str;
            this.description = str2;
            this.buttonInfo = buttonInfo;
        }
    }

    public static void LJIIL(Context context, Function0 function0, boolean z, boolean z2) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131840240);
        C1238130iKB.LIZ(c1397580mTM, new AwS6S0220000_1(context, function0, z, z2, 0));
        new C1397510mTF(c1397580mTM).LIZLLL();
        if (z2) {
            String value = C03RN.ACTIVATE_DIALOG.getValue();
            if (C03RP.LIZIZ().enableActivateLogTrack) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", "payment_method");
                linkedHashMap.put("popup_name", value);
                C1018703yb.LIZIZ("tiktokec_popup_show", linkedHashMap);
                return;
            }
            return;
        }
        C03O0 c03o0 = C03O0.LIZ;
        String value2 = C03RN.ACTIVATE_DIALOG.getValue();
        c03o0.getClass();
        C03O0.LJJII(value2);
    }

    public static void LJIIJ(Context context, boolean z, String str, String str2, String str3, String str4, Function0 function0) {
        String value = str4;
        if (value == null) {
            if (Intrinsics.LJFF(str3, C03RO.ACTIVATE_SUCCESS.getStatus())) {
                value = C03RN.ACTIVATE_SUCCESS.getValue();
            } else if (Intrinsics.LJFF(str3, C03RO.ACTIVATE_FAIL.getStatus())) {
                value = C03RN.ACTIVATE_FAIL.getValue();
            } else if (Intrinsics.LJFF(str3, C03RO.ACTIVATE_PROCESSING.getStatus())) {
                value = C03RN.ACTIVATE_REVIEW.getValue();
            } else if (Intrinsics.LJFF(str3, C03RO.ACTIVATE_SUCCESS_ORDER_ABOVE_LIMIT.getStatus())) {
                value = C03RN.ACTIVATE_SUCCESS_ABOVE_LIMIT.getValue();
            } else if (!Intrinsics.LJFF(str3, C03RO.ACTIVATE_SUCCESS_RISK_REJECT.getStatus())) {
                return;
            } else {
                value = C03RN.ACTIVATE_SUCCESS_SECURITY_CONCERN.getValue();
            }
            if (value == null) {
                return;
            }
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(str);
        c1397580mTM.LIZIZ(str2);
        C1238130iKB.LIZ(c1397580mTM, new AwS10S1210000_1(context, value, function0, z, 1));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C03O0.LIZ.getClass();
        C03O0.LJJII(value);
    }

    public static void LIZ(Context context, PaymentMethod paymentMethod, String str, HashMap map, String str2, String str3, String str4, String str5) {
        BindInfo bindInfo;
        String str6;
        String str7 = null;
        if (paymentMethod != null && (bindInfo = paymentMethod.bindInfo) != null && (str6 = bindInfo.schema) != null) {
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            if (paymentMethod != null) {
                str7 = paymentMethod.id;
            }
            paymentBindHelper.getClass();
            PaymentBindHelper.LJ(context, str, str6, map, str2, str7, str3, str4, str5);
        }
    }

    public static void LJIIJJI(PaymentMethod paymentMethod, HashMap map, String str, Context context, String str2, String str3, String str4, C03WH c03wh, boolean z, Function2 function2, Function1 function1) {
        String str5;
        CommuteType commuteType;
        String strLIZ;
        String str6;
        if (map != null) {
            C1323720kYE.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(map), "payment_track_params");
        }
        BindInfo bindInfo = paymentMethod.bindInfo;
        String str7 = null;
        if (bindInfo != null) {
            str5 = bindInfo.schema;
        } else {
            str5 = null;
        }
        String str8 = paymentMethod.packageName;
        CommuteInfo commuteInfoLJII = paymentMethod.LJII(false);
        if (commuteInfoLJII != null) {
            commuteType = commuteInfoLJII.commuteType;
        } else {
            commuteType = null;
        }
        if (z) {
            Availability availability = paymentMethod.availability;
            if (availability != null) {
                str6 = availability.statusCode;
            } else {
                str6 = null;
            }
            if (Intrinsics.LJFF(str6, "16")) {
                if (function1 != null) {
                    function1.invoke(paymentMethod);
                    return;
                }
                return;
            }
        }
        if (str5 != null && C770702zh.LIZ(str5)) {
            if (commuteType != null) {
                strLIZ = C899503fN.LIZ(commuteType);
            } else {
                strLIZ = null;
            }
            if (commuteType == CommuteType.INTERNAL_NATIVE) {
                PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
                String str9 = paymentMethod.id;
                paymentBindHelper.getClass();
                str7 = null;
                PaymentBindHelper.LJ(context, str2, str5, map, str, str9, null, null, null);
            } else {
                Uri.Builder builderBuildUpon = UriProtector.parse(str5).buildUpon();
                builderBuildUpon.appendQueryParameter("source", str4);
                if (strLIZ != null && strLIZ.length() != 0) {
                    builderBuildUpon.appendQueryParameter("commute_type", strLIZ);
                }
                String strLJ = paymentMethod.LJ();
                if (strLJ != null && strLJ.length() != 0) {
                    builderBuildUpon.appendQueryParameter("idempotency_key", strLJ);
                }
                PaymentBindHelper.LJI(PaymentBindHelper.LIZ, context, strLJ, str8, builderBuildUpon.toString(), commuteType, str2, paymentMethod.id, str3, null, null, null, false, null, null, paymentMethod.displayName, 16128);
            }
            if (c03wh == null) {
                return;
            }
            String strLJJIIZ = paymentMethod.LJJIIZ();
            Boolean boolValueOf = Boolean.valueOf(C770702zh.LIZ(paymentMethod.extraInfo));
            BindInfo bindInfo2 = paymentMethod.bindInfo;
            if (bindInfo2 != null) {
                str7 = bindInfo2.bindStatus;
            }
            C03WH.LJ(c03wh, strLJJIIZ, boolValueOf, str7, null, paymentMethod, null, 40);
            return;
        }
        function2.invoke(paymentMethod, new C03RM(context, paymentMethod, str8, commuteType, str2, str3, z, c03wh));
    }
}
