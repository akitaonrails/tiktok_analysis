package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C098200Yq;
import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1707990uY1;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1708990uZd;
import X.C1709000uZe;
import X.C1709400uaI;
import X.C1709570uaZ;
import X.C1709610uad;
import X.C1709650uah;
import X.C1709720uao;
import X.C1711340udQ;
import X.C1714410uiN;
import X.C189200o6;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C834520WoU;
import X.EnumC1710490uc3;
import X.EnumC2006707tZ;
import X.EnumC995340c0a;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionHybridInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIInstallmentPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPayLaterInstallmentInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethodDetail;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPricingPlanMarketingTool;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingAmount;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.WalletPaymentType;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class PaymentOption {
    public String LIZ;
    public transient PricingPlan LIZIZ;
    public List<PaymentOption> LIZJ;
    public List<PaymentOption> LIZLLL;
    public PIPOPaymentOptionHybridInfo LJ;
    public CashierPaymentOptionInfoResp.PaymentUnitAtomicInfo LJFF;
    public final EnumC2006707tZ LJI;
    public C1709610uad LJII;
    public transient Boolean LJIIIIZZ;

    @C09CT("view_all_hybrid_area_id_list")
    public final List<String> allHybridAreaIdList;

    @C09CT("view_all_sub_option_id_list")
    public final List<String> allSubPOIdList;

    @C09CT("bind_info")
    public final POBindInfo bindInfo;

    @C09CT("card_rule_regex")
    public String cardRuleRegex;

    @C09CT("payment_option_configuration")
    public final POConfiguration config;

    @C09CT("payment_option_display_info")
    public final PODisplayInfo displayInfo;

    @C09CT("displayed_payment_unit_id")
    public final String displayedPaymentUnitId;

    @C09CT("extra_fee_statement")
    public final PipoRichText extraFeeStatement;

    @C09CT("form_info")
    public final POFormInfo formInfo;

    @C09CT("payment_option_id")
    public final String id;

    @C09CT("is_anchored_payment_option")
    public final Boolean isAnchor;

    @C09CT("legacy_payment_method")
    public final PIPOPaymentMethod legacyPM;

    @C09CT("parent_key")
    public String parentKey;

    @C09CT("pay_info")
    public final POPayInfo payInfo;

    @C09CT("payment_method_base_info")
    public final POPaymentMethodBaseInfo paymentMethodBaseInfo;

    @C09CT("payment_unit_id")
    public final String paymentUnitId;

    @C09CT("recommend_hybrid_area_id_list")
    public final List<String> recHybridAreaIdList;

    @C09CT("recommend_sub_option_id_list")
    public final List<String> recSubPOIdList;

    @C09CT("single_payment_payment_option_id")
    public final String singlePOId;

    @C09CT("status_flag_info")
    public final POStatusAttr statusAttr;

    @C09CT("da_info")
    public final PODaInfo trackInfo;

    public PaymentOption() {
        this("", null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, new POStatusAttr(true, Boolean.FALSE, Boolean.FALSE), null, null, null, null, null, new PODisplayInfo("", null, null, null, null, null, null, null, null), null, null, null, null, null, null, null, EnumC2006707tZ.NORMAL, null);
    }

    public final PaymentOption LIZLLL() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<PaymentOption> list = this.LIZJ;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PaymentOption> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().LIZLLL());
            }
            arrayList = new ArrayList(arrayList3);
        } else {
            arrayList = null;
        }
        List<PaymentOption> list2 = this.LIZLLL;
        if (list2 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<PaymentOption> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZLLL());
            }
        } else {
            arrayList2 = null;
        }
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = this.LJ;
        return LJ(this, null, null, arrayList, arrayList2, pIPOPaymentOptionHybridInfo != null ? new PIPOPaymentOptionHybridInfo(pIPOPaymentOptionHybridInfo.type, null, pIPOPaymentOptionHybridInfo.displayAmount, pIPOPaymentOptionHybridInfo.amount, pIPOPaymentOptionHybridInfo.needSelectOtherBlock) : null, null, 478150655);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOption)) {
            return false;
        }
        PaymentOption paymentOption = (PaymentOption) obj;
        return Intrinsics.LJFF(this.LIZ, paymentOption.LIZ) && Intrinsics.LJFF(this.parentKey, paymentOption.parentKey) && Intrinsics.LJFF(this.singlePOId, paymentOption.singlePOId) && Intrinsics.LJFF(this.id, paymentOption.id) && Intrinsics.LJFF(this.legacyPM, paymentOption.legacyPM) && Intrinsics.LJFF(this.recSubPOIdList, paymentOption.recSubPOIdList) && Intrinsics.LJFF(this.allSubPOIdList, paymentOption.allSubPOIdList) && Intrinsics.LJFF(this.isAnchor, paymentOption.isAnchor) && Intrinsics.LJFF(this.recHybridAreaIdList, paymentOption.recHybridAreaIdList) && Intrinsics.LJFF(this.allHybridAreaIdList, paymentOption.allHybridAreaIdList) && Intrinsics.LJFF(this.paymentUnitId, paymentOption.paymentUnitId) && Intrinsics.LJFF(this.displayedPaymentUnitId, paymentOption.displayedPaymentUnitId) && Intrinsics.LJFF(this.paymentMethodBaseInfo, paymentOption.paymentMethodBaseInfo) && Intrinsics.LJFF(this.statusAttr, paymentOption.statusAttr) && Intrinsics.LJFF(this.formInfo, paymentOption.formInfo) && Intrinsics.LJFF(this.trackInfo, paymentOption.trackInfo) && Intrinsics.LJFF(this.extraFeeStatement, paymentOption.extraFeeStatement) && Intrinsics.LJFF(this.bindInfo, paymentOption.bindInfo) && Intrinsics.LJFF(this.payInfo, paymentOption.payInfo) && Intrinsics.LJFF(this.displayInfo, paymentOption.displayInfo) && Intrinsics.LJFF(this.config, paymentOption.config) && Intrinsics.LJFF(this.cardRuleRegex, paymentOption.cardRuleRegex) && Intrinsics.LJFF(this.LIZIZ, paymentOption.LIZIZ) && Intrinsics.LJFF(this.LIZJ, paymentOption.LIZJ) && Intrinsics.LJFF(this.LIZLLL, paymentOption.LIZLLL) && Intrinsics.LJFF(this.LJ, paymentOption.LJ) && Intrinsics.LJFF(this.LJFF, paymentOption.LJFF) && this.LJI == paymentOption.LJI && Intrinsics.LJFF(this.LJII, paymentOption.LJII);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.parentKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.singlePOId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PIPOPaymentMethod pIPOPaymentMethod = this.legacyPM;
        int iHashCode5 = (iHashCode4 + (pIPOPaymentMethod == null ? 0 : pIPOPaymentMethod.hashCode())) * 31;
        List<String> list = this.recSubPOIdList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allSubPOIdList;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isAnchor;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list3 = this.recHybridAreaIdList;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.allHybridAreaIdList;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.paymentUnitId;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayedPaymentUnitId;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo = this.paymentMethodBaseInfo;
        int iHashCode13 = (((iHashCode12 + (pOPaymentMethodBaseInfo == null ? 0 : pOPaymentMethodBaseInfo.hashCode())) * 31) + this.statusAttr.hashCode()) * 31;
        POFormInfo pOFormInfo = this.formInfo;
        int iHashCode14 = (iHashCode13 + (pOFormInfo == null ? 0 : pOFormInfo.hashCode())) * 31;
        PODaInfo pODaInfo = this.trackInfo;
        int iHashCode15 = (iHashCode14 + (pODaInfo == null ? 0 : pODaInfo.hashCode())) * 31;
        PipoRichText pipoRichText = this.extraFeeStatement;
        int iHashCode16 = (iHashCode15 + (pipoRichText == null ? 0 : pipoRichText.hashCode())) * 31;
        POBindInfo pOBindInfo = this.bindInfo;
        int iHashCode17 = (iHashCode16 + (pOBindInfo == null ? 0 : pOBindInfo.hashCode())) * 31;
        POPayInfo pOPayInfo = this.payInfo;
        int iHashCode18 = (((iHashCode17 + (pOPayInfo == null ? 0 : pOPayInfo.hashCode())) * 31) + this.displayInfo.hashCode()) * 31;
        POConfiguration pOConfiguration = this.config;
        int iHashCode19 = (iHashCode18 + (pOConfiguration == null ? 0 : pOConfiguration.hashCode())) * 31;
        String str6 = this.cardRuleRegex;
        int iHashCode20 = (iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PricingPlan pricingPlan = this.LIZIZ;
        int iHashCode21 = (iHashCode20 + (pricingPlan == null ? 0 : pricingPlan.hashCode())) * 31;
        List<PaymentOption> list5 = this.LIZJ;
        int iHashCode22 = (iHashCode21 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<PaymentOption> list6 = this.LIZLLL;
        int iHashCode23 = (iHashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = this.LJ;
        int iHashCode24 = (iHashCode23 + (pIPOPaymentOptionHybridInfo == null ? 0 : pIPOPaymentOptionHybridInfo.hashCode())) * 31;
        CashierPaymentOptionInfoResp.PaymentUnitAtomicInfo paymentUnitAtomicInfo = this.LJFF;
        int iHashCode25 = (((iHashCode24 + (paymentUnitAtomicInfo == null ? 0 : paymentUnitAtomicInfo.hashCode())) * 31) + this.LJI.hashCode()) * 31;
        C1709610uad c1709610uad = this.LJII;
        return iHashCode25 + (c1709610uad != null ? c1709610uad.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentOption(key=" + this.LIZ + ", parentKey=" + this.parentKey + ", singlePOId=" + this.singlePOId + ", id=" + this.id + ", legacyPM=" + this.legacyPM + ", recSubPOIdList=" + this.recSubPOIdList + ", allSubPOIdList=" + this.allSubPOIdList + ", isAnchor=" + this.isAnchor + ", recHybridAreaIdList=" + this.recHybridAreaIdList + ", allHybridAreaIdList=" + this.allHybridAreaIdList + ", paymentUnitId=" + this.paymentUnitId + ", displayedPaymentUnitId=" + this.displayedPaymentUnitId + ", paymentMethodBaseInfo=" + this.paymentMethodBaseInfo + ", statusAttr=" + this.statusAttr + ", formInfo=" + this.formInfo + ", trackInfo=" + this.trackInfo + ", extraFeeStatement=" + this.extraFeeStatement + ", bindInfo=" + this.bindInfo + ", payInfo=" + this.payInfo + ", displayInfo=" + this.displayInfo + ", config=" + this.config + ", cardRuleRegex=" + this.cardRuleRegex + ", pricingPlan=" + this.LIZIZ + ", recSubPOList=" + this.LIZJ + ", allSubPOList=" + this.LIZLLL + ", hybridInfo=" + this.LJ + ", payUnitInfo=" + this.LJFF + ", nativePaymentOptionType=" + this.LJI + ", poCheckboxInfo=" + this.LJII + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if ((r0 != null ? r0.actionMode : null) == com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POActionMode.JUMP_TO_BIND_EWALLET) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1153850g8F LIZ() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod r0 = r5.legacyPM
            r2 = 0
            if (r0 == 0) goto L22
            X.0uak r4 = r0.nativePaymentMethodType
        L7:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo r0 = r5.trackInfo
            r3 = 1
            if (r0 == 0) goto L19
            java.lang.String r1 = r0.isPIValue
            java.lang.String r0 = "pi"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != r3) goto L19
        L16:
            X.0g8F r0 = X.EnumC1153850g8F.BOUND
            return r0
        L19:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod r0 = r5.legacyPM
            if (r0 == 0) goto L24
            boolean r0 = r0.isPI
            if (r0 != r3) goto L24
            goto L16
        L22:
            r4 = r2
            goto L7
        L24:
            X.07tZ r1 = r5.LJI
            X.07tZ r0 = X.EnumC2006707tZ.CCDC_ADD_LOCAL
            if (r1 == r0) goto L4e
            X.0uak r0 = X.EnumC1709680uak.CCDC_ADDED_LOCAL
            if (r4 == r0) goto L4e
            X.0uak r0 = X.EnumC1709680uak.CCDC_TEMPLATE
            if (r4 == r0) goto L4e
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo r0 = r5.bindInfo
            if (r0 == 0) goto L4b
            X.0uak r0 = X.EnumC1709680uak.NORMAL
            if (r4 == r0) goto L48
            X.0uak r0 = X.EnumC1709680uak.NORMAL_SUB
            if (r4 == r0) goto L48
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration r0 = r5.config
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POActionMode r2 = r0.actionMode
        L44:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POActionMode r0 = com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POActionMode.JUMP_TO_BIND_EWALLET
            if (r2 != r0) goto L4b
        L48:
            X.0g8F r0 = X.EnumC1153850g8F.NEED_BIND
            return r0
        L4b:
            X.0g8F r0 = X.EnumC1153850g8F.NONE_BIND
            return r0
        L4e:
            X.0g8F r0 = X.EnumC1153850g8F.FAKE_BIND
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption.LIZ():X.0g8F");
    }

    public final boolean LJFF() {
        C1709610uad c1709610uad = this.LJII;
        if (c1709610uad != null) {
            return (c1709610uad.LIZIZ == null && c1709610uad.LIZJ == null) ? false : true;
        }
        return false;
    }

    public final PaymentOption LJI() {
        C1709610uad c1709610uad = this.LJII;
        if (c1709610uad == null) {
            return null;
        }
        if (Intrinsics.LJFF(c1709610uad.LIZ, Boolean.TRUE)) {
            PaymentOption paymentOption = c1709610uad.LIZIZ;
            return paymentOption == null ? c1709610uad.LIZJ : paymentOption;
        }
        PaymentOption paymentOption2 = c1709610uad.LIZJ;
        return paymentOption2 == null ? c1709610uad.LIZIZ : paymentOption2;
    }

    public final List<PaymentOption> LJIIIIZZ() {
        List<PaymentOption> list = this.LIZLLL;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PaymentOption paymentOption : list) {
            if (paymentOption.statusAttr.available) {
                arrayList.add(paymentOption);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[PHI: r1
      0x001d: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:14:0x001b, B:23:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType LJIIIZ() {
        /*
            r6 = this;
            X.0uah r5 = X.C1709720uao.LIZ
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo r4 = r6.bindInfo
            r3 = 0
            if (r4 == 0) goto L33
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType> r2 = r4.supportedCommuteTypes
        L9:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration r0 = r6.config
            if (r0 == 0) goto L15
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration$InstallationReviewInfo r0 = r0.installationReviewInfo
            if (r0 == 0) goto L15
            java.lang.String r1 = r0.packageName
            if (r1 != 0) goto L30
        L15:
            if (r4 == 0) goto L2f
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow r0 = r4.LIZ
            if (r0 == 0) goto L2f
            java.lang.String r1 = r0.packageName
        L1d:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow r0 = r4.LIZ
            if (r0 == 0) goto L25
            java.lang.String r3 = r0.verifyAppSchema
            if (r3 != 0) goto L27
        L25:
            java.lang.String r3 = r4.schema
        L27:
            r5.getClass()
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType r0 = X.C1709650uah.LIZIZ(r1, r3, r2)
            return r0
        L2f:
            r1 = r3
        L30:
            if (r4 != 0) goto L1d
            goto L27
        L33:
            r2 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption.LJIIIZ():com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType");
    }

    public final CommuteType LJIIJ() {
        String str;
        CBIFlow cBIFlow;
        C1709650uah c1709650uah = C1709720uao.LIZ;
        POPayInfo pOPayInfo = this.payInfo;
        String str2 = null;
        List<CommuteType> list = pOPayInfo != null ? pOPayInfo.supportedCommuteTypes : null;
        PIPOPaymentMethod pIPOPaymentMethod = this.legacyPM;
        if (pIPOPaymentMethod == null || (cBIFlow = pIPOPaymentMethod.paymentFlow) == null) {
            str = null;
            if (pIPOPaymentMethod != null) {
            }
            c1709650uah.getClass();
            return C1709650uah.LIZIZ(str, str2, list);
        }
        str = cBIFlow.packageName;
        CBIFlow cBIFlow2 = pIPOPaymentMethod.paymentFlow;
        if (cBIFlow2 != null) {
            str2 = cBIFlow2.verifyAppSchema;
        }
        c1709650uah.getClass();
        return C1709650uah.LIZIZ(str, str2, list);
    }

    public final Element LJIILJJIL() {
        List<Element> list;
        POFormInfo pOFormInfo = this.formInfo;
        Element element = null;
        if (pOFormInfo == null || (list = pOFormInfo.neededElements) == null) {
            return null;
        }
        Iterator<Element> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Element next = it2.next();
            if (next.LIZ() == EnumC1710490uc3.CVV) {
                element = next;
                break;
            }
        }
        return element;
    }

    public final void LJIILL() {
        C834520WoU c834520WoU = C834520WoU.LIZ;
        String strLJIL = LJIL();
        c834520WoU.getClass();
        if (C834520WoU.LJFF(strLJIL)) {
            this.LJIIIIZZ = Boolean.valueOf(this.statusAttr.available);
            LJJIII(C834520WoU.LIZIZ.get());
        }
    }

    public final List<CBIInstallmentPlan> LJIILLIIL() {
        CBIPaymentMethod cBIPaymentMethod;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ;
        CBIPayLaterInstallmentInfo cBIPayLaterInstallmentInfo;
        List<CBIInstallmentPlan> list;
        PIPOPaymentMethod pIPOPaymentMethod = this.legacyPM;
        return (pIPOPaymentMethod == null || (cBIPaymentMethod = pIPOPaymentMethod.cbiPaymentMethod) == null || (cBIPaymentMethodDetailLIZ = cBIPaymentMethod.LIZ()) == null || (cBIPayLaterInstallmentInfo = cBIPaymentMethodDetailLIZ.installmentInfo) == null || (list = cBIPayLaterInstallmentInfo.installmentPlanList) == null) ? C13BV.INSTANCE : list;
    }

    public final boolean LJIIZILJ() {
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = this.LJ;
        return (pIPOPaymentOptionHybridInfo != null ? pIPOPaymentOptionHybridInfo.type : null) == WalletPaymentType.BALANCE;
    }

    public final boolean LJIJ() {
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = this.LJ;
        return (pIPOPaymentOptionHybridInfo != null ? pIPOPaymentOptionHybridInfo.type : null) == WalletPaymentType.HYBRID;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (LJIIIZ() == com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType.NONE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        if ((!X.C2402209bA.LIZ(r3, r2)) == true) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJI() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod r0 = r6.legacyPM
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayInfo r0 = r6.payInfo
            if (r0 == 0) goto L1e
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType> r0 = r0.supportedCommuteTypes
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L1e
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType r1 = r6.LJIIJ()
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType r0 = com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType.NONE
            if (r1 == r0) goto L36
        L1e:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo r0 = r6.bindInfo
            if (r0 == 0) goto L7d
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType> r0 = r0.supportedCommuteTypes
            if (r0 == 0) goto L7d
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L7d
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType r1 = r6.LJIIIZ()
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType r0 = com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType.NONE
            if (r1 != r0) goto L7d
        L36:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POStatusAttr r0 = r6.statusAttr
            r0.available = r5
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration r0 = r6.config
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration$InstallationReviewInfo r0 = r0.installationReviewInfo
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText r2 = r0.tips
            if (r2 == 0) goto L53
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODisplayInfo r1 = r6.displayInfo
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POTip r0 = new com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POTip
            r0.<init>(r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.tips = r0
        L53:
            return r4
        L54:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration r0 = r6.config
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration$InstallationReviewInfo r0 = r0.installationReviewInfo
            if (r0 == 0) goto L7d
            java.lang.String r3 = r0.packageName
            if (r3 == 0) goto L7d
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            r0 = r0 ^ 1
            r2 = 0
            if (r0 == 0) goto L7d
            X.09bA r1 = X.C2402209bA.LIZ
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo r0 = r6.bindInfo
            if (r0 == 0) goto L71
            java.lang.String r2 = r0.schema
        L71:
            r1.getClass()
            boolean r0 = X.C2402209bA.LIZ(r3, r2)
            r0 = r0 ^ 1
            if (r0 != r4) goto L7d
            goto L36
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption.LJIJI():boolean");
    }

    public final String LJIJJ() {
        List<CBIPricingPlanMarketingTool> list;
        CBIPricingPlanMarketingTool cBIPricingPlanMarketingTool;
        PricingPlan pricingPlan = this.LIZIZ;
        if (pricingPlan == null || (list = pricingPlan.marketingTools) == null || (cBIPricingPlanMarketingTool = (CBIPricingPlanMarketingTool) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return cBIPricingPlanMarketingTool.marketingAmount;
    }

    public final String LJIJJLI() {
        PricingAmount pricingAmount;
        String str;
        PIPOPaymentMethod pIPOPaymentMethod = this.legacyPM;
        if (pIPOPaymentMethod != null && (str = pIPOPaymentMethod.paymentAmount) != null) {
            return str;
        }
        PricingPlan pricingPlan = this.LIZIZ;
        if (pricingPlan == null || (pricingAmount = pricingPlan.actualAmount) == null) {
            return null;
        }
        return pricingAmount.amountVal;
    }

    public final String LJIL() {
        PIPOPaymentMethod pIPOPaymentMethod;
        String str;
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo = this.paymentMethodBaseInfo;
        if ((pOPaymentMethodBaseInfo == null || (str = pOPaymentMethodBaseInfo.pmId) == null) && ((pIPOPaymentMethod = this.legacyPM) == null || (str = pIPOPaymentMethod.id) == null)) {
            str = this.id;
            if (pIPOPaymentMethod == null) {
                return null;
            }
        }
        return str;
    }

    public final String LJJ() {
        String str;
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo = this.paymentMethodBaseInfo;
        if (pOPaymentMethodBaseInfo != null && (str = pOPaymentMethodBaseInfo.token) != null) {
            return str;
        }
        PIPOPaymentMethod pIPOPaymentMethod = this.legacyPM;
        if (pIPOPaymentMethod != null) {
            return pIPOPaymentMethod.token;
        }
        return null;
    }

    public final boolean LJJII() {
        POConfiguration.InstallationReviewInfo installationReviewInfo;
        POConfiguration pOConfiguration = this.config;
        return Intrinsics.LJFF((pOConfiguration == null || (installationReviewInfo = pOConfiguration.installationReviewInfo) == null) ? null : installationReviewInfo.installationReviewType, "installation_review_and_unavailable");
    }

    public final boolean LIZIZ(C1709570uaZ c1709570uaZ) {
        List<PaymentOption> list;
        POBindInfo pOBindInfo;
        POActionMode pOActionMode;
        if (c1709570uaZ != null && (((list = this.LIZLLL) == null || list.isEmpty()) && this.statusAttr.available && ((pOBindInfo = this.bindInfo) == null || !pOBindInfo.LIZ()))) {
            POConfiguration pOConfiguration = this.config;
            if (pOConfiguration != null) {
                pOActionMode = pOConfiguration.actionMode;
            } else {
                pOActionMode = null;
            }
            if (pOActionMode == POActionMode.SELECT) {
                return true;
            }
        }
        return false;
    }

    public final PaymentOptionLocalInfo LJIIJJI(C1709570uaZ c1709570uaZ) {
        return c1709570uaZ.LJJIIJZLJL(this.LIZ);
    }

    public final long LJIILIIL(C1709570uaZ c1709570uaZ) {
        Object c098200Yq;
        Long l;
        Date date;
        Long lLJIILIIL;
        Long lValueOf = Long.valueOf(c1709570uaZ.LJJIIJZLJL(this.LIZ).addedToRecTS);
        if (lValueOf.longValue() <= 0) {
            Object obj = null;
            if (0 == 0) {
                POBindInfo pOBindInfo = this.bindInfo;
                if (pOBindInfo == null) {
                    return 0L;
                }
                String str = pOBindInfo.bindTime;
                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    l = lLJIILIIL;
                } else {
                    try {
                        String str2 = pOBindInfo.bindTime;
                        if (str2 != null && (!a0.LJJJIL(str2)) && (date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).parse(str2)) != null) {
                            c098200Yq = Long.valueOf(date.getTime());
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    l = (Long) obj;
                    if (l == null) {
                        return 0L;
                    }
                }
                return l.longValue();
            }
        }
        return lValueOf.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r2 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption LJJI(X.C1709570uaZ r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L53
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption> r0 = r5.LIZLLL
            if (r0 == 0) goto L2a
            java.util.Iterator r4 = r0.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r0
            java.util.List r1 = r6.LJJJJZ()
            java.lang.String r0 = r0.LIZ
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lb
        L26:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r2 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r2
            if (r2 != 0) goto L86
        L2a:
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption> r0 = r5.LIZLLL
            if (r0 == 0) goto L53
            java.util.Iterator r4 = r0.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r1 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r1
            java.lang.String r0 = r1.LIZ
            com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInfo r0 = r6.LJJIIJZLJL(r0)
            boolean r0 = r0.isPreselected
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POStatusAttr r0 = r1.statusAttr
            boolean r0 = r0.available
            if (r0 == 0) goto L32
        L4f:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r2 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r2
            if (r2 != 0) goto L86
        L53:
            boolean r0 = r5.LJFF()
            if (r0 == 0) goto L81
            java.lang.String r0 = "Cashier"
            X.0uZC r2 = X.C1708710uZB.LIZ(r0)
            r1 = 4
            java.lang.String r0 = "fallback to an unexpected selection for DISPLAY_IN_SINGLE_PM_GROUP type"
            r2.LIZ(r1, r0)
            if (r6 == 0) goto L69
            java.lang.String r3 = r6.LJJIFFI
        L69:
            X.0ua9 r3 = X.C1708610uZ1.LIZIZ(r3)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "error_code"
            java.lang.String r0 = "ERR_EMPTY_PM"
            r2.<init>(r1, r0)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r2)
            r3.LJIIIIZZ(r0)
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r3 = r5.LJI()
        L81:
            return r3
        L82:
            r2 = r3
            goto L4f
        L84:
            r2 = r3
            goto L26
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption.LJJI(X.0uaZ):com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption");
    }

    public final boolean LJJIII(boolean z) {
        boolean zBooleanValue;
        boolean z2;
        Boolean bool = this.LJIIIIZZ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = this.statusAttr.available;
            this.LJIIIIZZ = Boolean.valueOf(zBooleanValue);
        }
        if (zBooleanValue && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        POStatusAttr pOStatusAttr = this.statusAttr;
        if (pOStatusAttr.available == z2) {
            return false;
        }
        pOStatusAttr.available = z2;
        return true;
    }

    public final PaymentOption LIZJ(String str, String str2) {
        PODisplayInfo pODisplayInfo = this.displayInfo;
        return LJ(this, str, new PODisplayInfo(str2, pODisplayInfo.icon, pODisplayInfo.textInfo, pODisplayInfo.iconList, pODisplayInfo.paymentPromotions, pODisplayInfo.tips, pODisplayInfo.checkoutButtonInfo, pODisplayInfo.popupInfo, pODisplayInfo.selectStyle), null, null, null, EnumC2006707tZ.CCDC_ADD_LOCAL, 402128892);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element LJII(X.EnumC1710490uc3 r6, X.EnumC995340c0a r7) {
        /*
            r5 = this;
            X.0c0a r0 = X.EnumC995340c0a.ELEMENT
            r4 = 0
            if (r7 != r0) goto L45
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POFormInfo r0 = r5.formInfo
            if (r0 == 0) goto L4c
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element> r0 = r0.elements
        Lb:
            if (r0 == 0) goto L4c
            java.util.Iterator r3 = r0.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element r1 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element) r1
            X.0uc3 r0 = r1.LIZ()
            if (r0 == r6) goto L42
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element> r0 = r1.subElementList
            if (r0 == 0) goto L11
            java.util.Iterator r2 = r0.iterator()
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element) r0
            X.0uc3 r0 = r0.LIZ()
            if (r0 != r6) goto L2b
        L3e:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element r1 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element) r1
            if (r1 == 0) goto L11
        L42:
            return r1
        L43:
            r1 = r4
            goto L3e
        L45:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POFormInfo r0 = r5.formInfo
            if (r0 == 0) goto L4c
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element> r0 = r0.neededElements
            goto Lb
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption.LJII(X.0uc3, X.0c0a):com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element");
    }

    public final String LJIIL(C1709570uaZ c1709570uaZ, POPromotion pOPromotion) {
        String str;
        boolean z;
        Map mapLIZJ;
        C1707990uY1 c1707990uY1;
        String str2;
        C1708990uZd c1708990uZdLIZIZ;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C1707990uY1 c1707990uY12;
        String str9;
        PricingPlan pricingPlan;
        List<CBIPricingPlanMarketingTool> list;
        CBIPricingPlanMarketingTool cBIPricingPlanMarketingTool;
        C1707990uY1 c1707990uY13;
        PricingPlan pricingPlan2;
        List<CBIPricingPlanMarketingTool> list2;
        CBIPricingPlanMarketingTool cBIPricingPlanMarketingTool2;
        C1707990uY1 c1707990uY14;
        C1707990uY1 c1707990uY15;
        C1708990uZd c1708990uZdLIZIZ2;
        if (pOPromotion != null && (str = pOPromotion.rawUrl) != null) {
            C1714410uiN c1714410uiN = C1714410uiN.LIZ;
            if (this.legacyPM != null) {
                z = true;
            } else {
                z = false;
            }
            String str10 = "";
            if (z) {
                Pair[] pairArr = new Pair[8];
                if (c1709570uaZ == null || (c1708990uZdLIZIZ2 = C1709400uaI.LIZIZ(c1709570uaZ)) == null || (str3 = c1708990uZdLIZIZ2.LIZIZ) == null) {
                    str3 = "";
                }
                pairArr[0] = new Pair(Scene.SCENE_SERVICE, str3);
                if (c1709570uaZ == null || (c1707990uY15 = c1709570uaZ.LIZIZ) == null || (str4 = c1707990uY15.LIZLLL) == null) {
                    str4 = "";
                }
                pairArr[1] = new Pair("mid", str4);
                if (c1709570uaZ == null || (c1707990uY14 = c1709570uaZ.LIZIZ) == null || (str5 = c1707990uY14.LJ) == null) {
                    str5 = "";
                }
                pairArr[2] = new Pair("muid", str5);
                PIPOPaymentMethod pIPOPaymentMethod = this.legacyPM;
                if (pIPOPaymentMethod == null || (pricingPlan2 = pIPOPaymentMethod.pricingPlan) == null || (list2 = pricingPlan2.marketingTools) == null || (cBIPricingPlanMarketingTool2 = (CBIPricingPlanMarketingTool) C13LP.LJJJLL(list2)) == null || (str6 = cBIPricingPlanMarketingTool2.marketingCurrency) == null) {
                    str6 = "";
                }
                pairArr[3] = new Pair("payment_currency", str6);
                if (c1709570uaZ == null || (c1707990uY13 = c1709570uaZ.LIZIZ) == null || (str7 = c1707990uY13.LIZJ) == null) {
                    str7 = "";
                }
                pairArr[4] = new Pair("country_or_region", str7);
                PIPOPaymentMethod pIPOPaymentMethod2 = this.legacyPM;
                if (pIPOPaymentMethod2 == null || (pricingPlan = pIPOPaymentMethod2.pricingPlan) == null || (list = pricingPlan.marketingTools) == null || (cBIPricingPlanMarketingTool = (CBIPricingPlanMarketingTool) C13LP.LJJJLL(list)) == null || (str8 = cBIPricingPlanMarketingTool.marketingId) == null) {
                    str8 = "";
                }
                pairArr[5] = new Pair("marketing_id", str8);
                String strLJIL = LJIL();
                if (strLJIL == null) {
                    strLJIL = "";
                }
                pairArr[6] = new Pair("payment_method_id", strLJIL);
                if (c1709570uaZ != null && (c1707990uY12 = c1709570uaZ.LIZIZ) != null && (str9 = c1707990uY12.LIZIZ) != null) {
                    str10 = str9;
                }
                pairArr[7] = new Pair("session_id", str10);
                mapLIZJ = C2097608Jq.LJIIIIZZ(pairArr);
            } else {
                if (c1709570uaZ != null && (c1707990uY1 = c1709570uaZ.LIZIZ) != null && (str2 = c1707990uY1.LIZIZ) != null) {
                    str10 = str2;
                }
                mapLIZJ = C2097908Jt.LIZJ(new Pair("session_id", str10));
            }
            if (c1709570uaZ == null || (c1708990uZdLIZIZ = C1709400uaI.LIZIZ(c1709570uaZ)) == null) {
                c1708990uZdLIZIZ = C1709000uZe.LIZ;
            }
            c1714410uiN.getClass();
            return C1714410uiN.LIZIZ(str, false, mapLIZJ, c1708990uZdLIZIZ, null, null, null);
        }
        return null;
    }

    public final void LJJIFFI(C1709570uaZ c1709570uaZ, String str) {
        List<POPayElement> list;
        Element elementLJII = LJII(EnumC1710490uc3.CVV, EnumC995340c0a.NEEDED_ELEMENT);
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveCVVInNeedElement, ele: ");
        sbLIZ.append(elementLJII);
        sbLIZ.append(", data id: ");
        C1711340udQ.LIZ.getClass();
        sbLIZ.append(C1711340udQ.LIZJ(c1709570uaZ));
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        if (elementLJII == null) {
            return;
        }
        PaymentOptionLocalInfo paymentOptionLocalInfoLJJIIJZLJL = c1709570uaZ.LJJIIJZLJL(this.LIZ);
        C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("localInfo id: ");
        sbLIZ2.append(C1711340udQ.LIZJ(paymentOptionLocalInfoLJJIIJZLJL));
        sbLIZ2.append(", data id: ");
        sbLIZ2.append(C1711340udQ.LIZJ(c1709570uaZ));
        c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
        List<POPayElement> list2 = paymentOptionLocalInfoLJJIIJZLJL.localPaymentElements;
        if (list2 != null) {
            Iterator<POPayElement> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                POPayElement next = it2.next();
                if (next.LIZ() == EnumC1710490uc3.CVV) {
                    if (next != null && (list = paymentOptionLocalInfoLJJIIJZLJL.localPaymentElements) != null) {
                        list.remove(next);
                    }
                }
            }
        }
        if (paymentOptionLocalInfoLJJIIJZLJL.localPaymentElements == null) {
            paymentOptionLocalInfoLJJIIJZLJL.localPaymentElements = new ArrayList();
        }
        List<POPayElement> list3 = paymentOptionLocalInfoLJJIIJZLJL.localPaymentElements;
        if (list3 != null) {
            list3.add(new POPayElement(elementLJII.id, elementLJII.paramName, str, elementLJII.needEncrypted));
        }
    }

    public static PaymentOption LJ(PaymentOption paymentOption, String str, PODisplayInfo pODisplayInfo, List list, List list2, PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo, EnumC2006707tZ enumC2006707tZ, int i) {
        String str2;
        String str3;
        String str4;
        PIPOPaymentMethod pIPOPaymentMethod;
        List<String> list3;
        List<String> list4;
        Boolean bool;
        List<String> list5;
        List<String> list6;
        String str5;
        String str6;
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo;
        POStatusAttr pOStatusAttr;
        POFormInfo pOFormInfo;
        PODaInfo pODaInfo;
        PipoRichText pipoRichText;
        POBindInfo pOBindInfo;
        POPayInfo pOPayInfo;
        POConfiguration pOConfiguration;
        String str7;
        PricingPlan pricingPlan;
        CashierPaymentOptionInfoResp.PaymentUnitAtomicInfo paymentUnitAtomicInfo;
        EnumC2006707tZ enumC2006707tZ2 = enumC2006707tZ;
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo2 = pIPOPaymentOptionHybridInfo;
        List list7 = list;
        List list8 = list2;
        PODisplayInfo pODisplayInfo2 = pODisplayInfo;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = paymentOption.LIZ;
        }
        C1709610uad c1709610uad = null;
        if ((i & 2) != 0) {
            str2 = paymentOption.parentKey;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = paymentOption.singlePOId;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = paymentOption.id;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            pIPOPaymentMethod = paymentOption.legacyPM;
        } else {
            pIPOPaymentMethod = null;
        }
        if ((i & 32) != 0) {
            list3 = paymentOption.recSubPOIdList;
        } else {
            list3 = null;
        }
        if ((i & 64) != 0) {
            list4 = paymentOption.allSubPOIdList;
        } else {
            list4 = null;
        }
        if ((i & 128) != 0) {
            bool = paymentOption.isAnchor;
        } else {
            bool = null;
        }
        if ((i & 256) != 0) {
            list5 = paymentOption.recHybridAreaIdList;
        } else {
            list5 = null;
        }
        if ((i & 512) != 0) {
            list6 = paymentOption.allHybridAreaIdList;
        } else {
            list6 = null;
        }
        if ((i & 1024) != 0) {
            str5 = paymentOption.paymentUnitId;
        } else {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = paymentOption.displayedPaymentUnitId;
        } else {
            str6 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            pOPaymentMethodBaseInfo = paymentOption.paymentMethodBaseInfo;
        } else {
            pOPaymentMethodBaseInfo = null;
        }
        if ((i & 8192) != 0) {
            pOStatusAttr = paymentOption.statusAttr;
        } else {
            pOStatusAttr = null;
        }
        if ((i & 16384) != 0) {
            pOFormInfo = paymentOption.formInfo;
        } else {
            pOFormInfo = null;
        }
        if ((32768 & i) != 0) {
            pODaInfo = paymentOption.trackInfo;
        } else {
            pODaInfo = null;
        }
        if ((65536 & i) != 0) {
            pipoRichText = paymentOption.extraFeeStatement;
        } else {
            pipoRichText = null;
        }
        if ((131072 & i) != 0) {
            pOBindInfo = paymentOption.bindInfo;
        } else {
            pOBindInfo = null;
        }
        if ((262144 & i) != 0) {
            pOPayInfo = paymentOption.payInfo;
        } else {
            pOPayInfo = null;
        }
        if ((524288 & i) != 0) {
            pODisplayInfo2 = paymentOption.displayInfo;
        }
        if ((1048576 & i) != 0) {
            pOConfiguration = paymentOption.config;
        } else {
            pOConfiguration = null;
        }
        if ((2097152 & i) != 0) {
            str7 = paymentOption.cardRuleRegex;
        } else {
            str7 = null;
        }
        if ((4194304 & i) != 0) {
            pricingPlan = paymentOption.LIZIZ;
        } else {
            pricingPlan = null;
        }
        if ((8388608 & i) != 0) {
            list7 = paymentOption.LIZJ;
        }
        if ((16777216 & i) != 0) {
            list8 = paymentOption.LIZLLL;
        }
        if ((33554432 & i) != 0) {
            pIPOPaymentOptionHybridInfo2 = paymentOption.LJ;
        }
        if ((67108864 & i) != 0) {
            paymentUnitAtomicInfo = paymentOption.LJFF;
        } else {
            paymentUnitAtomicInfo = null;
        }
        if ((134217728 & i) != 0) {
            enumC2006707tZ2 = paymentOption.LJI;
        }
        if ((i & 268435456) != 0) {
            c1709610uad = paymentOption.LJII;
        }
        paymentOption.getClass();
        return new PaymentOption(str8, str2, str3, str4, pIPOPaymentMethod, list3, list4, bool, list5, list6, str5, str6, pOPaymentMethodBaseInfo, pOStatusAttr, pOFormInfo, pODaInfo, pipoRichText, pOBindInfo, pOPayInfo, pODisplayInfo2, pOConfiguration, str7, pricingPlan, list7, list8, pIPOPaymentOptionHybridInfo2, paymentUnitAtomicInfo, enumC2006707tZ2, c1709610uad);
    }

    public PaymentOption(String str, String str2, String str3, String str4, PIPOPaymentMethod pIPOPaymentMethod, List<String> list, List<String> list2, Boolean bool, List<String> list3, List<String> list4, String str5, String str6, POPaymentMethodBaseInfo pOPaymentMethodBaseInfo, POStatusAttr pOStatusAttr, POFormInfo pOFormInfo, PODaInfo pODaInfo, PipoRichText pipoRichText, POBindInfo pOBindInfo, POPayInfo pOPayInfo, PODisplayInfo pODisplayInfo, POConfiguration pOConfiguration, String str7, PricingPlan pricingPlan, List<PaymentOption> list5, List<PaymentOption> list6, PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo, CashierPaymentOptionInfoResp.PaymentUnitAtomicInfo paymentUnitAtomicInfo, EnumC2006707tZ enumC2006707tZ, C1709610uad c1709610uad) {
        this.LIZ = str;
        this.parentKey = str2;
        this.singlePOId = str3;
        this.id = str4;
        this.legacyPM = pIPOPaymentMethod;
        this.recSubPOIdList = list;
        this.allSubPOIdList = list2;
        this.isAnchor = bool;
        this.recHybridAreaIdList = list3;
        this.allHybridAreaIdList = list4;
        this.paymentUnitId = str5;
        this.displayedPaymentUnitId = str6;
        this.paymentMethodBaseInfo = pOPaymentMethodBaseInfo;
        this.statusAttr = pOStatusAttr;
        this.formInfo = pOFormInfo;
        this.trackInfo = pODaInfo;
        this.extraFeeStatement = pipoRichText;
        this.bindInfo = pOBindInfo;
        this.payInfo = pOPayInfo;
        this.displayInfo = pODisplayInfo;
        this.config = pOConfiguration;
        this.cardRuleRegex = str7;
        this.LIZIZ = pricingPlan;
        this.LIZJ = list5;
        this.LIZLLL = list6;
        this.LJ = pIPOPaymentOptionHybridInfo;
        this.LJFF = paymentUnitAtomicInfo;
        this.LJI = enumC2006707tZ;
        this.LJII = c1709610uad;
    }
}
