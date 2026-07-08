package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C03MT;
import X.C03PE;
import X.C03QF;
import X.C03QI;
import X.C03XU;
import X.C03YG;
import X.C03ZX;
import X.C09CT;
import X.C13BV;
import X.C13LQ;
import X.C15438062q;
import X.C178200mK;
import X.C2188811AlT;
import X.C756302xN;
import X.C770702zh;
import X.C7767031p;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoSubPaymentMethodDefaultSelectControlSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodsData {
    public static final /* synthetic */ int LJIIIZ = 0;
    public PaymentRenderData LIZ;
    public List<PaymentBillSummary> LIZIZ;
    public String LIZJ;
    public CalcPaymentMethodPriceData LIZLLL;
    public List<PaymentPrice> LJ;
    public String LJFF;
    public final Set<String> LJI;
    public PaymentMethod LJII;
    public List<PaymentMethod> LJIIIIZZ;

    @C09CT("abnormal_card_bin_list")
    public List<AbnormalCardBin> abnormalCardBinList;

    @C09CT("backup_payment_info")
    public BackupPaymentInfo backupPaymentInfo;

    @C09CT("bank_card_rules")
    public List<BankCardRule> bankCardRules;

    @C09CT("button_info_with_scene")
    public List<PaymentButtonInfo> buttonInfos;

    @C09CT("payment_card_rules")
    public List<CardRules> cardRules;

    @C09CT("cashier_button_info")
    public ButtonInfo cashierButtonInfo;

    @C09CT("cashier_loading_text")
    public String cashierLoadingText;

    @C09CT("cci_cashier_display_type")
    public CciCashierDisplayType cciCashierDisplayType;

    @C09CT("certification")
    public PaymentCertification certification;

    @C09CT("combine_payment_info")
    public CombinePaymentInfo combinePaymentInfo;

    @C09CT("consultation_id")
    public String consultationId;

    @C09CT("country_code")
    public String countryCode;

    @C09CT("credit_info")
    public CreditInfo creditInfo;

    @C09CT("elevator_bars")
    public List<ElevatorBar> elevatorBar;

    @C09CT("encode_key")
    public String encodeKey;

    @C09CT("error_info")
    public ErrorInfo errorInfo;

    @C09CT("exception")
    public ExceptionUX exceptionUX;

    @C09CT("experiment_info")
    public Map<String, String> experimentInfo;

    @C09CT("force_save")
    public Boolean forceSave;

    @C09CT("payment_guarantee_info")
    public PaymentGuaranteeInfo guaranteeInfo;

    @C09CT("independent_pricing_param")
    public Map<String, String> independentPricingParam;

    @C09CT("is_fold_recommend_payment_methods")
    public Boolean isFoldRecommendPaymentMethods;

    @C09CT("material_collection_info")
    public String materialCollectionInfo;

    @C09CT("method_photos_with_pm_code")
    public List<MethodPhotoWithId> methodPhotosWithPmId;

    @C09CT("methods_photos")
    public Photos methodsPhotos;

    @C09CT("order_type")
    public OrderType orderType;

    @C09CT("new_order_type")
    public Integer orderTypeV2;

    @C09CT("pay_track_info")
    public PayTrackInfo payTrackInfo;

    @C09CT("payment_banner")
    public PaymentBanner paymentBanner;

    @C09CT("payment_methods")
    public List<PaymentMethod> paymentMethods;

    @C09CT("methods_text")
    public String paymentMethodsText;

    @C09CT("payment_param")
    public Map<String, String> paymentParam;

    @C09CT("payment_policy")
    public PaymentMethodPolicy paymentPolicy;

    @C09CT("pipo_host")
    public String pipoHost;

    @C09CT("pop_ups")
    public List<PaymentPopUpInfo> popUpInfos;

    @C09CT("pull_cashier_if_not_select")
    public Boolean pullCashierIfNotSelect;

    @C09CT("recommend_method_show_count")
    public Integer recommendMethodShowCount;

    @C09CT("recommend_payment_method")
    public PaymentMethod recommendPaymentMethod;

    @C09CT("recommend_payment_methods")
    public List<PaymentMethod> recommendPaymentMethods;

    @C09CT("retain_infos")
    public List<RetainInfo> retainInfos;

    @C09CT("sale_region")
    public String saleRegion;

    @C09CT("secure_payment")
    public UserTrustItem securePayment;

    @C09CT("settings")
    public PaymentSettings settings;

    @C09CT("stored_method_show_count")
    public Integer storedMethodShowCount;

    @C09CT("stored_methods")
    public List<PaymentMethod> storedMethods;

    @C09CT("title_tips")
    public TitleTips titleTips;

    @C09CT("top_security_text")
    public LinkText topSecurityText;

    @C09CT("unavailable_cardbin_list")
    public List<UnavailableCardBin> unavailableCardBin;

    public PaymentMethodsData() {
    }

    public final List<PaymentMethod> LJI() {
        List listLJIJJLI = C15438062q.LJIJJLI(C13LQ.LJIJI(new List[]{this.paymentMethods, this.storedMethods}));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIJJLI) {
            if (((PaymentMethod) obj).LIZ()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean LIZJ() {
        Map<String, String> map = this.experimentInfo;
        return Intrinsics.LJFF(map != null ? map.get("bnpl_force_upgrade_open") : null, "true");
    }

    public final Map<String, Object> LIZLLL() {
        PaymentMethod next;
        List<PaymentMethod> list = this.paymentMethods;
        String str = null;
        if (list != null) {
            Iterator<PaymentMethod> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (C770702zh.LIZIZ(next.eventsForClient)) {
                    break;
                }
            }
            PaymentMethod paymentMethod = next;
            if (paymentMethod != null) {
                str = paymentMethod.eventsForClient;
            }
        }
        return C178200mK.LIZ(str);
    }

    public final List<BankCardRule> LJIIIIZZ() {
        CardRules next;
        List<BankCardRule> list;
        List<CardRules> list2 = this.cardRules;
        if (list2 != null) {
            Iterator<CardRules> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.id, "pm_pi_ccdc_all")) {
                    break;
                }
            }
            CardRules cardRules = next;
            if (cardRules != null && (list = cardRules.rules) != null) {
                return list;
            }
        }
        return this.bankCardRules;
    }

    public final PaymentMethod LJIILIIL() {
        PaymentMethod paymentMethodLJIIL = LJIIL(AFwS228S0000000_1.get$arr$(213));
        if (paymentMethodLJIIL == null) {
            return null;
        }
        if (C03YG.LIZ()) {
            GooglePayProcess.LIZ.getClass();
            if (GooglePayProcess.LJIIIIZZ(paymentMethodLJIIL) && !GooglePayProcess.LIZIZ()) {
                return null;
            }
        }
        if (C03YG.LIZ() && C03ZX.LIZIZ()) {
            GooglePayProcess.LIZ.getClass();
            if (GooglePayProcess.LJI(paymentMethodLJIIL) && !GooglePayProcess.LIZLLL()) {
                return null;
            }
        }
        if (paymentMethodLJIIL.LIZ()) {
            return paymentMethodLJIIL;
        }
        return null;
    }

    public final PaymentInfo LJIILJJIL() {
        PaymentMethod paymentMethodLJIIJ = LJIIJ(AFwS228S0000000_1.get$arr$(847));
        if (paymentMethodLJIIJ != null) {
            return new PaymentInfo(new PaymentMethodInfo(paymentMethodLJIIJ.id, paymentMethodLJIIJ.token, new ArrayList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null), paymentMethodLJIIJ, null, Boolean.TRUE, null, null, null, null, null, new LinkedHashMap(), null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod LJIJ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LJII
            if (r0 != 0) goto L82
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = r6.recommendPaymentMethod
            if (r2 == 0) goto L87
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r2.availability
            if (r0 == 0) goto L18
            java.lang.Boolean r1 = r0.isAvailable()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L1e
        L18:
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L87
        L1e:
            r0 = 1
            r5 = 0
            if (r0 == 0) goto L87
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r6.storedMethods
            if (r0 == 0) goto L51
            java.util.Iterator r4 = r0.iterator()
        L2a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r2.availability
            if (r0 == 0) goto L2a
            java.lang.Boolean r1 = r0.isAvailable()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2a
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L2a
        L4d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r3
            if (r3 != 0) goto L80
        L51:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r6.paymentMethods
            if (r0 == 0) goto L7f
            java.util.Iterator r4 = r0.iterator()
        L59:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r2.availability
            if (r0 == 0) goto L59
            java.lang.Boolean r1 = r0.isAvailable()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L59
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L59
            r5 = r3
        L7d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r5
        L7f:
            r3 = r5
        L80:
            r6.LJII = r3
        L82:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LJII
            return r0
        L85:
            r3 = r5
            goto L4d
        L87:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.recommendPaymentMethod
            r6.LJII = r0
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData.LJIJ():com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> LJIJI() {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData.LJIJI():java.util.List");
    }

    public final Map<String, String> LJIL() {
        C03QI.LIZ.getClass();
        boolean z = C03QI.LIZ().enableOptimize;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PaymentMethod paymentMethod : (ArrayList) C15438062q.LJIJJLI(C13LQ.LJIJI(new List[]{this.storedMethods, this.paymentMethods}))) {
            paymentMethod.getClass();
            String str = paymentMethod.id;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = paymentMethod.token;
            if (str3 != null && str3.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('+');
                sbLIZ.append(str3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZIZ != null) {
                    str2 = strLIZIZ;
                }
            }
            String strConcat = str.concat(str2);
            if (paymentMethod.LIZ()) {
                CommuteInfo commuteInfoLJJIIJ = paymentMethod.LJJIIJ(z);
                CommuteType commuteType = commuteInfoLJJIIJ != null ? commuteInfoLJJIIJ.commuteType : null;
                CommuteType commuteType2 = CommuteType.APP_DISPLAY_TIPS_IF_NOT_INSTALL;
                if (commuteType != commuteType2) {
                    CommuteInfo commuteInfoLJII = paymentMethod.LJII(z);
                    if ((commuteInfoLJII != null ? commuteInfoLJII.commuteType : null) == commuteType2) {
                    }
                }
                linkedHashMap.put(strConcat, "not_installed_gray_out");
            } else {
                linkedHashMap.put(strConcat, "not_installed_hide");
            }
        }
        return linkedHashMap;
    }

    public final boolean LJJ() {
        Integer num = this.orderTypeV2;
        return num != null && ((num.intValue() >> 2) & 1) == 1;
    }

    public final boolean LJJI() {
        Map<String, String> map = this.experimentInfo;
        return Intrinsics.LJFF(map != null ? map.get("bnpl_flow_type") : null, "credit_and_pay");
    }

    public final boolean LJJIFFI() {
        Integer num = this.orderTypeV2;
        return num != null && num.intValue() == OrderType.MEMBERSHIP.getValue();
    }

    public final boolean LJJII() {
        Integer num = this.orderTypeV2;
        return num != null && ((num.intValue() >> 1) & 1) == 1;
    }

    public final PaymentMethod LJIIIZ() {
        PaymentMethod paymentMethod;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ecom_android_enable_credit", true)) {
            return null;
        }
        if (C03XU.LIZIZ().enable) {
            CombinePaymentInfo combinePaymentInfo = this.combinePaymentInfo;
            if (C756302xN.LIZ(combinePaymentInfo != null ? combinePaymentInfo.creditInfoList : null)) {
                return null;
            }
        }
        CreditInfo creditInfo = this.creditInfo;
        if (creditInfo == null || (paymentMethod = creditInfo.creditPaymentMethod) == null) {
            return null;
        }
        Amount amount = creditInfo.creditBalanceAmount;
        Amount amount2 = creditInfo.creditFreezeAmount;
        Amount amount3 = creditInfo.creditPaymentAmount;
        Amount amount4 = creditInfo.remainedAmount;
        SettingsManager.LIZLLL().getClass();
        return PaymentMethod.LIZJ(paymentMethod, null, null, null, null, null, null, null, null, null, false, null, new C7767031p(amount, amount2, amount3, amount4, SettingsManager.LIZ("ec_payment_recommend_convert", true) ? C03QF.LIZIZ(LJIILL(creditInfo.recommendPaymentMethods)) : LJIILL(creditInfo.recommendPaymentMethods), creditInfo.storedMethods, creditInfo.paymentMethods, creditInfo.recommendMethodShowCount, creditInfo.creditPaymentType), null, null, null, null, -1, -16385, -1);
    }

    public static List LJIILL(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                Availability availability = paymentMethod.availability;
                if (availability != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE) && paymentMethod.LIZ()) {
                    List<PaymentMethod> list2 = paymentMethod.subPaymentMethods;
                    if (list2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (PaymentMethod paymentMethod2 : list2) {
                            if (paymentMethod2.LIZ()) {
                                arrayList2.add(paymentMethod2);
                            }
                        }
                        paymentMethod.subPaymentMethods = arrayList2;
                    }
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final List<PaymentMethod> LJII(boolean z) {
        boolean z2;
        List<CreditInfo> list;
        Availability availability;
        ArrayList arrayList = null;
        if (!C03XU.LIZIZ().enable) {
            return null;
        }
        if (C03XU.LIZIZ().checkAvailability && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        CombinePaymentInfo combinePaymentInfo = this.combinePaymentInfo;
        if (combinePaymentInfo != null && (list = combinePaymentInfo.creditInfoList) != null) {
            arrayList = new ArrayList();
            Iterator<CreditInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                PaymentMethod paymentMethod = it2.next().creditPaymentMethod;
                if (paymentMethod != null && (!z2 || ((availability = paymentMethod.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE)))) {
                    paymentMethod.LJIILL = Boolean.TRUE;
                    arrayList.add(paymentMethod);
                }
            }
        }
        return arrayList;
    }

    public final PaymentMethod LJIIJ(Function1<? super PaymentMethod, Boolean> function1) {
        List listSingletonList;
        PaymentMethod paymentMethodLJIIIZ = LJIIIZ();
        if (paymentMethodLJIIIZ == null || (listSingletonList = Collections.singletonList(paymentMethodLJIIIZ)) == null) {
            listSingletonList = C13BV.INSTANCE;
        }
        PaymentMethod paymentMethodLIZIZ = LIZIZ(C15438062q.LJIJJLI(C13LQ.LJIJI(new List[]{listSingletonList, LJII(true), LJIJI()})), 2, function1);
        if (C03ZX.LIZIZ()) {
            GooglePayProcess.LIZ.getClass();
            if (GooglePayProcess.LJI(paymentMethodLIZIZ) && !GooglePayProcess.LIZLLL()) {
                return null;
            }
            return paymentMethodLIZIZ;
        }
        return paymentMethodLIZIZ;
    }

    public final PaymentMethod LJIIL(Function1<? super PaymentMethod, Boolean> function1) {
        List<PaymentMethod> list;
        C7767031p c7767031p;
        PaymentMethod paymentMethodLJIIIZ = LJIIIZ();
        if (paymentMethodLJIIIZ != null && (c7767031p = paymentMethodLJIIIZ.LJFF) != null) {
            list = c7767031p.LJ;
        } else {
            list = null;
        }
        return LIZIZ(list, 2, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle LJIILLIIL(X.EnumC837803Pc r4) {
        /*
            r3 = this;
            boolean r0 = X.C870903al.LIZ()
            r1 = 0
            if (r0 == 0) goto L60
            if (r4 == 0) goto L49
            int[] r2 = X.C837703Pb.LIZ
            int r0 = r4.ordinal()
            r2 = r2[r0]
            r0 = 1
            if (r2 == r0) goto L3a
            r0 = 2
            if (r2 == r0) goto L2b
            r0 = 3
            if (r2 != r0) goto L49
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.payButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.secondPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
        L28:
            if (r0 == 0) goto L58
            return r0
        L2b:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.payButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.oneClickPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
            goto L28
        L3a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.payButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.recommendAndPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
            goto L28
        L49:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.payButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.recommendAndPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
            goto L28
        L58:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo r0 = r3.cashierButtonInfo
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r1 = r0.globalButtonStyle
            return r1
        L5f:
            return r1
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo r0 = r3.cashierButtonInfo
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r1 = r0.globalButtonStyle
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData.LJIILLIIL(X.03Pc):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle LJIIZILJ(X.EnumC837803Pc r4) {
        /*
            r3 = this;
            boolean r0 = X.C870903al.LIZ()
            r1 = 0
            if (r0 == 0) goto L60
            if (r4 == 0) goto L49
            int[] r2 = X.C837703Pb.LIZ
            int r0 = r4.ordinal()
            r2 = r2[r0]
            r0 = 1
            if (r2 == r0) goto L3a
            r0 = 2
            if (r2 == r0) goto L2b
            r0 = 3
            if (r2 != r0) goto L49
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.selectButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.secondPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
        L28:
            if (r0 == 0) goto L58
            return r0
        L2b:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.selectButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.oneClickPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
            goto L28
        L3a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.selectButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.recommendAndPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
            goto L28
        L49:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings r0 = r3.settings
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonConfig r0 = r0.selectButton
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentButtonStyle r0 = r0.recommendAndPayPage
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r0 = r0.buttonStyle
            goto L28
        L58:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo r0 = r3.cashierButtonInfo
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r1 = r0.globalButtonStyle
            return r1
        L5f:
            return r1
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo r0 = r3.cashierButtonInfo
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle r1 = r0.globalButtonStyle
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData.LJIIZILJ(X.03Pc):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle");
    }

    public final CreditInfo LJIJJ(PaymentMethod paymentMethod) {
        List<CreditInfo> list;
        String str;
        String str2;
        CombinePaymentInfo combinePaymentInfo = this.combinePaymentInfo;
        CreditInfo creditInfo = null;
        if (combinePaymentInfo == null || (list = combinePaymentInfo.creditInfoList) == null) {
            return null;
        }
        Iterator<CreditInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CreditInfo next = it2.next();
            PaymentMethod paymentMethod2 = next.creditPaymentMethod;
            if (paymentMethod2 != null) {
                str = paymentMethod2.id;
            } else {
                str = null;
            }
            if (paymentMethod != null) {
                str2 = paymentMethod.id;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str, str2)) {
                creditInfo = next;
                break;
            }
        }
        return creditInfo;
    }

    public final CreditInfo LJIJJLI(String str) {
        List<CreditInfo> list;
        Object obj;
        CombinePaymentInfo combinePaymentInfo = this.combinePaymentInfo;
        if (combinePaymentInfo != null && (list = combinePaymentInfo.creditInfoList) != null) {
            Iterator<CreditInfo> it2 = list.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                CreditInfo next = it2.next();
                PaymentMethod paymentMethod = next.creditPaymentMethod;
                if (paymentMethod != null) {
                    obj = paymentMethod.id;
                }
                if (Intrinsics.LJFF(obj, str)) {
                    obj = next;
                    break;
                }
            }
            CreditInfo creditInfo = (CreditInfo) obj;
            if (creditInfo != null) {
                return creditInfo;
            }
        }
        return this.creditInfo;
    }

    public final String LJ(PaymentInfo paymentInfo, String str) {
        C7767031p c7767031p;
        Amount amount;
        HybridPaymentInfo hybridPaymentInfo;
        Amount amount2;
        String amount3;
        if (paymentInfo == null) {
            return null;
        }
        if (paymentInfo.LJI()) {
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod == null || (hybridPaymentInfo = paymentMethod.hybridPaymentInfo) == null || (amount2 = hybridPaymentInfo.actualPaymentAmount) == null || (amount3 = amount2.getAmount()) == null) {
                PaymentMethod paymentMethodLJIIIZ = LJIIIZ();
                if (paymentMethodLJIIIZ == null || (c7767031p = paymentMethodLJIIIZ.LJFF) == null || (amount = c7767031p.LIZLLL) == null) {
                    return null;
                }
                return amount.getAmount();
            }
            return amount3;
        }
        return str;
    }

    public static PaymentMethod LIZIZ(List list, int i, Function1 function1) {
        String str;
        if (i < 1 || list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PaymentMethod paymentMethod = (PaymentMethod) it2.next();
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo != null) {
                str = bindInfo.buttonText;
            } else {
                str = null;
            }
            if (!C770702zh.LIZIZ(str) && (!Intrinsics.LJFF(paymentMethod.id, "pm_pi_ccdc_all") || C03MT.LIZ())) {
                if (Intrinsics.LJFF(paymentMethod.isChooseRecommend, Boolean.TRUE) && ((Boolean) function1.invoke(paymentMethod)).booleanValue()) {
                    return paymentMethod;
                }
                String str2 = paymentMethod.id;
                if (str2 != null && str2.length() != 0) {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    EcPipoSubPaymentMethodDefaultSelectControlSettings.EcPipoSubPaymentMethodDefaultSelectControlModel ecPipoSubPaymentMethodDefaultSelectControlModel = EcPipoSubPaymentMethodDefaultSelectControlSettings.LIZ;
                    EcPipoSubPaymentMethodDefaultSelectControlSettings.EcPipoSubPaymentMethodDefaultSelectControlModel ecPipoSubPaymentMethodDefaultSelectControlModel2 = (EcPipoSubPaymentMethodDefaultSelectControlSettings.EcPipoSubPaymentMethodDefaultSelectControlModel) settingsManagerLIZLLL.LJIIIIZZ("ec_pipo_sub_payment_method_default_select_control", EcPipoSubPaymentMethodDefaultSelectControlSettings.EcPipoSubPaymentMethodDefaultSelectControlModel.class, ecPipoSubPaymentMethodDefaultSelectControlModel);
                    if (ecPipoSubPaymentMethodDefaultSelectControlModel2 != null) {
                        ecPipoSubPaymentMethodDefaultSelectControlModel = ecPipoSubPaymentMethodDefaultSelectControlModel2;
                    }
                    if (ecPipoSubPaymentMethodDefaultSelectControlModel.notAllowedList.contains(str2)) {
                        continue;
                    } else {
                        PaymentMethod paymentMethodLIZIZ = LIZIZ(paymentMethod.subPaymentMethods, i - 1, function1);
                        if (paymentMethodLIZIZ != null) {
                            return paymentMethodLIZIZ;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void LJJIII(PaymentMethodsData paymentMethodsData, String str, boolean z) {
        PaymentMethod next;
        List<PaymentMethod> list;
        PaymentMethod next2;
        List<PaymentMethod> list2;
        PaymentMethod next3;
        List<PaymentMethod> list3;
        PaymentMethod next4;
        CreditInfo creditInfo;
        List<PaymentMethod> list4;
        List<PaymentMethod> list5;
        PaymentMethod next5;
        CreditInfo creditInfo2;
        List<PaymentMethod> list6;
        PaymentMethod next6;
        PaymentMethod next7;
        List<PaymentMethod> list7;
        PaymentMethod next8;
        List<PaymentMethod> list8;
        PaymentMethod next9;
        List<PaymentMethod> list9;
        PaymentMethod next10;
        CreditInfo creditInfo3;
        List<PaymentMethod> list10;
        PaymentMethod next11;
        List<PaymentMethod> list11;
        PaymentMethod next12;
        CreditInfo creditInfo4;
        List<PaymentMethod> list12;
        PaymentMethod next13;
        PaymentMethod paymentMethod = null;
        if (C03PE.LIZ().enableUpdateAll) {
            CreditInfo creditInfo5 = paymentMethodsData.creditInfo;
            if (creditInfo5 != null && (list11 = creditInfo5.recommendPaymentMethods) != null) {
                Iterator<PaymentMethod> it2 = list11.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next12 = it2.next();
                        if (Intrinsics.LJFF(next12.id, str)) {
                            break;
                        }
                    } else {
                        next12 = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod2 = next12;
                if (paymentMethod2 != null && (creditInfo4 = this.creditInfo) != null && (list12 = creditInfo4.recommendPaymentMethods) != null) {
                    Iterator<PaymentMethod> it3 = list12.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next13 = it3.next();
                            if (Intrinsics.LJFF(next13.id, str)) {
                                break;
                            }
                        } else {
                            next13 = null;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod3 = next13;
                    if (paymentMethod3 != null) {
                        paymentMethod3.installmentInfo = paymentMethod2.installmentInfo;
                    }
                }
            }
            CreditInfo creditInfo6 = paymentMethodsData.creditInfo;
            if (creditInfo6 != null && (list9 = creditInfo6.storedMethods) != null) {
                Iterator<PaymentMethod> it4 = list9.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next10 = it4.next();
                        if (Intrinsics.LJFF(next10.id, str)) {
                            break;
                        }
                    } else {
                        next10 = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod4 = next10;
                if (paymentMethod4 != null && (creditInfo3 = this.creditInfo) != null && (list10 = creditInfo3.storedMethods) != null) {
                    Iterator<PaymentMethod> it5 = list10.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next11 = it5.next();
                            if (Intrinsics.LJFF(next11.id, str)) {
                                break;
                            }
                        } else {
                            next11 = null;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod5 = next11;
                    if (paymentMethod5 != null) {
                        paymentMethod5.installmentInfo = paymentMethod4.installmentInfo;
                    }
                }
            }
            List<PaymentMethod> list13 = paymentMethodsData.recommendPaymentMethods;
            if (list13 != null) {
                Iterator<PaymentMethod> it6 = list13.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next8 = it6.next();
                        if (Intrinsics.LJFF(next8.id, str)) {
                            break;
                        }
                    } else {
                        next8 = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod6 = next8;
                if (paymentMethod6 != null && (list8 = this.recommendPaymentMethods) != null) {
                    Iterator<PaymentMethod> it7 = list8.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            next9 = it7.next();
                            if (Intrinsics.LJFF(next9.id, str)) {
                                break;
                            }
                        } else {
                            next9 = null;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod7 = next9;
                    if (paymentMethod7 != null) {
                        paymentMethod7.installmentInfo = paymentMethod6.installmentInfo;
                    }
                }
            }
            List<PaymentMethod> list14 = paymentMethodsData.storedMethods;
            if (list14 != null) {
                Iterator<PaymentMethod> it8 = list14.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next7 = it8.next();
                        if (Intrinsics.LJFF(next7.id, str)) {
                            break;
                        }
                    } else {
                        next7 = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod8 = next7;
                if (paymentMethod8 != null && (list7 = this.storedMethods) != null) {
                    Iterator<PaymentMethod> it9 = list7.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            break;
                        }
                        PaymentMethod next14 = it9.next();
                        if (Intrinsics.LJFF(next14.id, str)) {
                            paymentMethod = next14;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod9 = paymentMethod;
                    if (paymentMethod9 != null) {
                        paymentMethod9.installmentInfo = paymentMethod8.installmentInfo;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            CreditInfo creditInfo7 = paymentMethodsData.creditInfo;
            if (creditInfo7 != null && (list5 = creditInfo7.recommendPaymentMethods) != null) {
                Iterator<PaymentMethod> it10 = list5.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next5 = it10.next();
                        if (Intrinsics.LJFF(next5.id, str)) {
                            break;
                        }
                    } else {
                        next5 = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod10 = next5;
                if (paymentMethod10 != null && (creditInfo2 = this.creditInfo) != null && (list6 = creditInfo2.recommendPaymentMethods) != null) {
                    Iterator<PaymentMethod> it11 = list6.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            next6 = it11.next();
                            if (Intrinsics.LJFF(next6.id, str)) {
                                break;
                            }
                        } else {
                            next6 = null;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod11 = next6;
                    if (paymentMethod11 != null) {
                        paymentMethod11.installmentInfo = paymentMethod10.installmentInfo;
                    }
                }
            }
            CreditInfo creditInfo8 = paymentMethodsData.creditInfo;
            if (creditInfo8 == null || (list3 = creditInfo8.storedMethods) == null) {
                return;
            }
            Iterator<PaymentMethod> it12 = list3.iterator();
            while (true) {
                if (it12.hasNext()) {
                    next4 = it12.next();
                    if (Intrinsics.LJFF(next4.id, str)) {
                        break;
                    }
                } else {
                    next4 = null;
                    break;
                }
            }
            PaymentMethod paymentMethod12 = next4;
            if (paymentMethod12 == null || (creditInfo = this.creditInfo) == null || (list4 = creditInfo.storedMethods) == null) {
                return;
            }
            Iterator<PaymentMethod> it13 = list4.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    break;
                }
                PaymentMethod next15 = it13.next();
                if (Intrinsics.LJFF(next15.id, str)) {
                    paymentMethod = next15;
                    break;
                }
            }
            PaymentMethod paymentMethod13 = paymentMethod;
            if (paymentMethod13 == null) {
                return;
            }
            paymentMethod13.installmentInfo = paymentMethod12.installmentInfo;
            return;
        }
        List<PaymentMethod> list15 = paymentMethodsData.recommendPaymentMethods;
        if (list15 != null) {
            Iterator<PaymentMethod> it14 = list15.iterator();
            while (true) {
                if (it14.hasNext()) {
                    next2 = it14.next();
                    if (Intrinsics.LJFF(next2.id, str)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            PaymentMethod paymentMethod14 = next2;
            if (paymentMethod14 != null && (list2 = this.recommendPaymentMethods) != null) {
                Iterator<PaymentMethod> it15 = list2.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next3 = it15.next();
                        if (Intrinsics.LJFF(next3.id, str)) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod15 = next3;
                if (paymentMethod15 != null) {
                    paymentMethod15.installmentInfo = paymentMethod14.installmentInfo;
                }
            }
        }
        List<PaymentMethod> list16 = paymentMethodsData.storedMethods;
        if (list16 == null) {
            return;
        }
        Iterator<PaymentMethod> it16 = list16.iterator();
        while (true) {
            if (it16.hasNext()) {
                next = it16.next();
                if (Intrinsics.LJFF(next.id, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentMethod paymentMethod16 = next;
        if (paymentMethod16 == null || (list = this.storedMethods) == null) {
            return;
        }
        Iterator<PaymentMethod> it17 = list.iterator();
        while (true) {
            if (!it17.hasNext()) {
                break;
            }
            PaymentMethod next16 = it17.next();
            if (Intrinsics.LJFF(next16.id, str)) {
                paymentMethod = next16;
                break;
            }
        }
        PaymentMethod paymentMethod17 = paymentMethod;
        if (paymentMethod17 == null) {
            return;
        }
        paymentMethod17.installmentInfo = paymentMethod16.installmentInfo;
    }

    public static PaymentMethodsData LIZ(PaymentMethodsData paymentMethodsData, List list, CreditInfo creditInfo, int i) {
        PaymentMethod paymentMethod;
        List<PaymentMethod> list2;
        List<PaymentMethod> list3;
        List<CardRules> list4;
        PaymentMethodPolicy paymentMethodPolicy;
        Integer num;
        String str;
        String str2;
        String str3;
        Photos photos;
        PaymentCertification paymentCertification;
        PaymentGuaranteeInfo paymentGuaranteeInfo;
        UserTrustItem userTrustItem;
        List<BankCardRule> list5;
        String str4;
        Integer num2;
        List<UnavailableCardBin> list6;
        PaymentBanner paymentBanner;
        ButtonInfo buttonInfo;
        PaymentSettings paymentSettings;
        CciCashierDisplayType cciCashierDisplayType;
        String str5;
        String str6;
        List<AbnormalCardBin> list7;
        LinkText linkText;
        String str7;
        TitleTips titleTips;
        OrderType orderType;
        ExceptionUX exceptionUX;
        CreditInfo creditInfo2 = creditInfo;
        List list8 = list;
        if ((i & 1) != 0) {
            list8 = paymentMethodsData.paymentMethods;
        }
        Boolean bool = null;
        if ((i & 2) != 0) {
            paymentMethod = paymentMethodsData.recommendPaymentMethod;
        } else {
            paymentMethod = null;
        }
        if ((i & 4) != 0) {
            list2 = paymentMethodsData.recommendPaymentMethods;
        } else {
            list2 = null;
        }
        if ((i & 8) != 0) {
            list3 = paymentMethodsData.storedMethods;
        } else {
            list3 = null;
        }
        if ((i & 16) != 0) {
            list4 = paymentMethodsData.cardRules;
        } else {
            list4 = null;
        }
        if ((i & 32) != 0) {
            paymentMethodPolicy = paymentMethodsData.paymentPolicy;
        } else {
            paymentMethodPolicy = null;
        }
        if ((i & 64) != 0) {
            num = paymentMethodsData.storedMethodShowCount;
        } else {
            num = null;
        }
        if ((i & 128) != 0) {
            str = paymentMethodsData.encodeKey;
        } else {
            str = null;
        }
        if ((i & 256) != 0) {
            str2 = paymentMethodsData.pipoHost;
        } else {
            str2 = null;
        }
        if ((i & 512) != 0) {
            str3 = paymentMethodsData.paymentMethodsText;
        } else {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            photos = paymentMethodsData.methodsPhotos;
        } else {
            photos = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            paymentCertification = paymentMethodsData.certification;
        } else {
            paymentCertification = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            paymentGuaranteeInfo = paymentMethodsData.guaranteeInfo;
        } else {
            paymentGuaranteeInfo = null;
        }
        if ((i & 8192) != 0) {
            userTrustItem = paymentMethodsData.securePayment;
        } else {
            userTrustItem = null;
        }
        if ((i & 16384) != 0) {
            list5 = paymentMethodsData.bankCardRules;
        } else {
            list5 = null;
        }
        if ((32768 & i) != 0) {
            str4 = paymentMethodsData.consultationId;
        } else {
            str4 = null;
        }
        if ((65536 & i) != 0) {
            num2 = paymentMethodsData.recommendMethodShowCount;
        } else {
            num2 = null;
        }
        if ((131072 & i) != 0) {
            list6 = paymentMethodsData.unavailableCardBin;
        } else {
            list6 = null;
        }
        if ((262144 & i) != 0) {
            paymentBanner = paymentMethodsData.paymentBanner;
        } else {
            paymentBanner = null;
        }
        if ((524288 & i) != 0) {
            buttonInfo = paymentMethodsData.cashierButtonInfo;
        } else {
            buttonInfo = null;
        }
        if ((1048576 & i) != 0) {
            creditInfo2 = paymentMethodsData.creditInfo;
        }
        if ((2097152 & i) != 0) {
            paymentSettings = paymentMethodsData.settings;
        } else {
            paymentSettings = null;
        }
        if ((4194304 & i) != 0) {
            cciCashierDisplayType = paymentMethodsData.cciCashierDisplayType;
        } else {
            cciCashierDisplayType = null;
        }
        if ((8388608 & i) != 0) {
            str5 = paymentMethodsData.countryCode;
        } else {
            str5 = null;
        }
        if ((16777216 & i) != 0) {
            str6 = paymentMethodsData.saleRegion;
        } else {
            str6 = null;
        }
        if ((33554432 & i) != 0) {
            list7 = paymentMethodsData.abnormalCardBinList;
        } else {
            list7 = null;
        }
        if ((67108864 & i) != 0) {
            linkText = paymentMethodsData.topSecurityText;
        } else {
            linkText = null;
        }
        if ((134217728 & i) != 0) {
            str7 = paymentMethodsData.cashierLoadingText;
        } else {
            str7 = null;
        }
        if ((268435456 & i) != 0) {
            titleTips = paymentMethodsData.titleTips;
        } else {
            titleTips = null;
        }
        if ((536870912 & i) != 0) {
            orderType = paymentMethodsData.orderType;
        } else {
            orderType = null;
        }
        if ((1073741824 & i) != 0) {
            exceptionUX = paymentMethodsData.exceptionUX;
        } else {
            exceptionUX = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            bool = paymentMethodsData.forceSave;
        }
        return new PaymentMethodsData(list8, paymentMethod, list2, list3, list4, paymentMethodPolicy, num, str, str2, str3, photos, paymentCertification, paymentGuaranteeInfo, userTrustItem, list5, str4, num2, list6, paymentBanner, buttonInfo, creditInfo2, paymentSettings, cciCashierDisplayType, str5, str6, list7, linkText, str7, titleTips, orderType, exceptionUX, bool, paymentMethodsData.orderTypeV2, paymentMethodsData.isFoldRecommendPaymentMethods, paymentMethodsData.pullCashierIfNotSelect, paymentMethodsData.paymentParam, paymentMethodsData.payTrackInfo, paymentMethodsData.errorInfo, paymentMethodsData.combinePaymentInfo, paymentMethodsData.methodPhotosWithPmId, paymentMethodsData.independentPricingParam, paymentMethodsData.elevatorBar, paymentMethodsData.retainInfos, paymentMethodsData.experimentInfo, paymentMethodsData.popUpInfos, paymentMethodsData.buttonInfos, paymentMethodsData.backupPaymentInfo, paymentMethodsData.materialCollectionInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[], java.util.List[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[], java.util.List[]] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r13, boolean r14, boolean r15, int r16) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, boolean, boolean, int):java.util.List");
    }

    public PaymentMethodsData(List<PaymentMethod> list, PaymentMethod paymentMethod, List<PaymentMethod> list2, List<PaymentMethod> list3, List<CardRules> list4, PaymentMethodPolicy paymentMethodPolicy, Integer num, String str, String str2, String str3, Photos photos, PaymentCertification paymentCertification, PaymentGuaranteeInfo paymentGuaranteeInfo, UserTrustItem userTrustItem, List<BankCardRule> list5, String str4, Integer num2, List<UnavailableCardBin> list6, PaymentBanner paymentBanner, ButtonInfo buttonInfo, CreditInfo creditInfo, PaymentSettings paymentSettings, CciCashierDisplayType cciCashierDisplayType, String str5, String str6, List<AbnormalCardBin> list7, LinkText linkText, String str7, TitleTips titleTips, OrderType orderType, ExceptionUX exceptionUX, Boolean bool, Integer num3, Boolean bool2, Boolean bool3, Map<String, String> map, PayTrackInfo payTrackInfo, ErrorInfo errorInfo, CombinePaymentInfo combinePaymentInfo, List<MethodPhotoWithId> list8, Map<String, String> map2, List<ElevatorBar> list9, List<RetainInfo> list10, Map<String, String> map3, List<PaymentPopUpInfo> list11, List<PaymentButtonInfo> list12, BackupPaymentInfo backupPaymentInfo, String str8) {
        this.paymentMethods = list;
        this.recommendPaymentMethod = paymentMethod;
        this.recommendPaymentMethods = list2;
        this.storedMethods = list3;
        this.cardRules = list4;
        this.paymentPolicy = paymentMethodPolicy;
        this.storedMethodShowCount = num;
        this.encodeKey = str;
        this.pipoHost = str2;
        this.paymentMethodsText = str3;
        this.methodsPhotos = photos;
        this.certification = paymentCertification;
        this.guaranteeInfo = paymentGuaranteeInfo;
        this.securePayment = userTrustItem;
        this.bankCardRules = list5;
        this.consultationId = str4;
        this.recommendMethodShowCount = num2;
        this.unavailableCardBin = list6;
        this.paymentBanner = paymentBanner;
        this.cashierButtonInfo = buttonInfo;
        this.creditInfo = creditInfo;
        this.settings = paymentSettings;
        this.cciCashierDisplayType = cciCashierDisplayType;
        this.countryCode = str5;
        this.saleRegion = str6;
        this.abnormalCardBinList = list7;
        this.topSecurityText = linkText;
        this.cashierLoadingText = str7;
        this.titleTips = titleTips;
        this.orderType = orderType;
        this.exceptionUX = exceptionUX;
        this.forceSave = bool;
        this.orderTypeV2 = num3;
        this.isFoldRecommendPaymentMethods = bool2;
        this.pullCashierIfNotSelect = bool3;
        this.paymentParam = map;
        this.payTrackInfo = payTrackInfo;
        this.errorInfo = errorInfo;
        this.combinePaymentInfo = combinePaymentInfo;
        this.methodPhotosWithPmId = list8;
        this.independentPricingParam = map2;
        this.elevatorBar = list9;
        this.retainInfos = list10;
        this.experimentInfo = map3;
        this.popUpInfos = list11;
        this.buttonInfos = list12;
        this.backupPaymentInfo = backupPaymentInfo;
        this.materialCollectionInfo = str8;
        this.LJI = new LinkedHashSet();
    }
}
