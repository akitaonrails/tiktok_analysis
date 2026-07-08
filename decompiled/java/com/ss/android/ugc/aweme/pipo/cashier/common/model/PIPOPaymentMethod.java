package com.ss.android.ugc.aweme.pipo.cashier.common.model;

import X.C09CT;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1709650uah;
import X.C1709670uaj;
import X.C1709720uao;
import X.C1948507kB;
import X.C1954807lC;
import X.EnumC1488970oql;
import X.EnumC1709680uak;
import X.EnumC2006707tZ;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIMarketingInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIMarketingTool;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POActionMode;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODisplayInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POFormInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPaymentMethodBaseInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPopupInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPromotion;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POSelectStyle;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POStatusAttr;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POTip;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PriceAmount;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PIPOPaymentMethod {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("available")
    public boolean available;

    @C09CT("bank_code")
    public final String bankCode;

    @C09CT("bind_info")
    public final POBindInfo bindInfo;

    @C09CT("bind_ts")
    public final Long bindTimeStamps;

    @C09CT("card_rule_regex")
    public final String cardRuleRegex;

    @C09CT("cbi_model")
    public final String cbiModel;

    @C09CT("raw_cbi_payment_method")
    public final CBIPaymentMethod cbiPaymentMethod;

    @C09CT("ccdc_bind_type")
    public final EnumC1488970oql ccdcBindType;

    @C09CT("dark_icon_url")
    public final String darkIconUrl;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("elements")
    public final List<Element> elements;

    @C09CT("google_pay_support_networks")
    public final List<String> googlePaySupportNetworks;

    @C09CT("group_code")
    public final String groupCode;

    @C09CT("group_type")
    public final String groupType;

    @C09CT("hybrid_info")
    public PIPOPaymentOptionHybridInfo hybridInfo;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("show_info_schema")
    public String infoSchema;

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("is_pi")
    public final boolean isPI;

    @C09CT("is_primary")
    public final Boolean isPrimary;

    @C09CT("key")
    public final String key;

    @C09CT("marketing_info")
    public final CBIMarketingInfo marketingInfo;

    @C09CT("method_type")
    public final String methodType;

    @C09CT("native_pay_method_type")
    public final EnumC1709680uak nativePaymentMethodType;

    @C09CT("needed_elements")
    public List<Element> neededElements;

    @C09CT("parent_key")
    public final String parentKey;

    @C09CT("pay_amount")
    public String paymentAmount;

    @C09CT("pay_amount_display_text")
    public String paymentAmountDisplayText;

    @C09CT("pay_currency")
    public String paymentCurrency;

    @C09CT("payment_flow")
    public final CBIFlow paymentFlow;

    @C09CT("payment_tips")
    public String paymentTips;

    @C09CT("pci_sensitive")
    public final Boolean pciSensitive;

    @C09CT("pricing_plan")
    public final PricingPlan pricingPlan;

    @C09CT("raw_pay_method")
    public final String rawCBIPaymentMethod;

    @C09CT("remote_pipo_pay_element")
    public List<POPayElement> remotePIPOPayElement;

    @C09CT("save_ccdc_default")
    public final Boolean saveCCDCDefault;

    @C09CT("sub_payment_method")
    public final ArrayList<PIPOPaymentMethod> subPaymentMethods;

    @C09CT("token")
    public final String token;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIPOPaymentMethod)) {
            return false;
        }
        PIPOPaymentMethod pIPOPaymentMethod = (PIPOPaymentMethod) obj;
        return Intrinsics.LJFF(this.key, pIPOPaymentMethod.key) && Intrinsics.LJFF(this.parentKey, pIPOPaymentMethod.parentKey) && Intrinsics.LJFF(this.id, pIPOPaymentMethod.id) && Intrinsics.LJFF(this.cbiModel, pIPOPaymentMethod.cbiModel) && Intrinsics.LJFF(this.groupCode, pIPOPaymentMethod.groupCode) && Intrinsics.LJFF(this.groupType, pIPOPaymentMethod.groupType) && Intrinsics.LJFF(this.displayName, pIPOPaymentMethod.displayName) && Intrinsics.LJFF(this.iconUrl, pIPOPaymentMethod.iconUrl) && Intrinsics.LJFF(this.darkIconUrl, pIPOPaymentMethod.darkIconUrl) && Intrinsics.LJFF(this.methodType, pIPOPaymentMethod.methodType) && Intrinsics.LJFF(this.bindInfo, pIPOPaymentMethod.bindInfo) && Intrinsics.LJFF(this.paymentFlow, pIPOPaymentMethod.paymentFlow) && Intrinsics.LJFF(this.token, pIPOPaymentMethod.token) && this.isPI == pIPOPaymentMethod.isPI && Intrinsics.LJFF(this.pciSensitive, pIPOPaymentMethod.pciSensitive) && this.available == pIPOPaymentMethod.available && Intrinsics.LJFF(this.isPrimary, pIPOPaymentMethod.isPrimary) && Intrinsics.LJFF(this.infoSchema, pIPOPaymentMethod.infoSchema) && Intrinsics.LJFF(this.bindTimeStamps, pIPOPaymentMethod.bindTimeStamps) && Intrinsics.LJFF(this.elements, pIPOPaymentMethod.elements) && Intrinsics.LJFF(this.neededElements, pIPOPaymentMethod.neededElements) && Intrinsics.LJFF(this.remotePIPOPayElement, pIPOPaymentMethod.remotePIPOPayElement) && Intrinsics.LJFF(this.bankCode, pIPOPaymentMethod.bankCode) && Intrinsics.LJFF(this.paymentAmount, pIPOPaymentMethod.paymentAmount) && Intrinsics.LJFF(this.paymentAmountDisplayText, pIPOPaymentMethod.paymentAmountDisplayText) && Intrinsics.LJFF(this.paymentTips, pIPOPaymentMethod.paymentTips) && Intrinsics.LJFF(this.saveCCDCDefault, pIPOPaymentMethod.saveCCDCDefault) && Intrinsics.LJFF(this.isDefault, pIPOPaymentMethod.isDefault) && Intrinsics.LJFF(this.rawCBIPaymentMethod, pIPOPaymentMethod.rawCBIPaymentMethod) && Intrinsics.LJFF(this.cardRuleRegex, pIPOPaymentMethod.cardRuleRegex) && this.nativePaymentMethodType == pIPOPaymentMethod.nativePaymentMethodType && Intrinsics.LJFF(this.subPaymentMethods, pIPOPaymentMethod.subPaymentMethods) && Intrinsics.LJFF(this.cbiPaymentMethod, pIPOPaymentMethod.cbiPaymentMethod) && Intrinsics.LJFF(this.hybridInfo, pIPOPaymentMethod.hybridInfo) && Intrinsics.LJFF(this.pricingPlan, pIPOPaymentMethod.pricingPlan) && Intrinsics.LJFF(this.marketingInfo, pIPOPaymentMethod.marketingInfo) && Intrinsics.LJFF(this.googlePaySupportNetworks, pIPOPaymentMethod.googlePaySupportNetworks) && this.ccdcBindType == pIPOPaymentMethod.ccdcBindType && Intrinsics.LJFF(this.paymentCurrency, pIPOPaymentMethod.paymentCurrency);
    }

    public final boolean LIZIZ() {
        List<CommuteType> list;
        String str;
        String str2;
        String str3;
        ArrayList<PIPOPaymentMethod> arrayList = this.subPaymentMethods;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<PIPOPaymentMethod> it2 = this.subPaymentMethods.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (!it2.next().LIZIZ()) {
                    i++;
                }
            }
            return this.subPaymentMethods.size() != i;
        }
        C1709650uah c1709650uah = C1709720uao.LIZ;
        CBIFlow cBIFlow = this.paymentFlow;
        String str4 = null;
        if (cBIFlow != null) {
            list = cBIFlow.supportedCommuteTypes;
            str = cBIFlow.packageName;
            str2 = cBIFlow.verifyAppSchema;
        } else {
            list = null;
            str = null;
            str2 = null;
        }
        c1709650uah.getClass();
        CommuteType commuteTypeLIZIZ = C1709650uah.LIZIZ(str, str2, list);
        CommuteType commuteType = CommuteType.NONE;
        if (commuteTypeLIZIZ == commuteType) {
            return false;
        }
        POBindInfo pOBindInfo = this.bindInfo;
        if (pOBindInfo == null) {
            return true;
        }
        List<CommuteType> list2 = pOBindInfo.supportedCommuteTypes;
        CBIFlow cBIFlow2 = pOBindInfo.LIZ;
        if (cBIFlow2 != null) {
            str3 = cBIFlow2.packageName;
            str4 = cBIFlow2.verifyAppSchema;
        } else {
            str3 = null;
        }
        return C1709650uah.LIZIZ(str3, str4, list2) != commuteType;
    }

    public final String LJ(boolean z) {
        List<CBIMarketingTool> list;
        Object obj;
        String str = null;
        if (!this.available) {
            return null;
        }
        CBIMarketingInfo cBIMarketingInfo = this.marketingInfo;
        if (cBIMarketingInfo != null && (list = cBIMarketingInfo.marketingTools) != null) {
            if (list.size() > 0) {
                obj = ListProtector.get(list, 0);
            } else {
                obj = null;
            }
            CBIMarketingTool cBIMarketingTool = (CBIMarketingTool) obj;
            if (cBIMarketingTool != null && ((str = cBIMarketingTool.selectedText) == null || !z || !C1948507kB.LIZ(str))) {
                return cBIMarketingTool.text;
            }
        }
        return str;
    }

    public static String LIZLLL(String str, String str2) {
        String[] strArr = new String[2];
        if (str2 == null) {
            str2 = "";
        }
        strArr[0] = str2;
        strArr[1] = str;
        return C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "--", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb A[PHI: r2
      0x00fb: PHI (r2v4 com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod) = 
      (r2v3 com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod)
      (r2v7 com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod)
     binds: [B:28:0x0059, B:39:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1709610uad LIZ(java.lang.String r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod.LIZ(java.lang.String, java.util.List):X.0uad");
    }

    public final PaymentOption LJFF(String str, List list) {
        POActionMode pOActionMode;
        String string;
        ArrayList arrayList;
        PIPOPaymentOptionSource pIPOPaymentOptionSource;
        boolean z;
        boolean z2;
        List listSingletonList;
        PODisplayInfo.PopupInfo popupInfo;
        POConfiguration.CCDCBindType cCDCBindType;
        POConfiguration.InstallationReviewInfo installationReviewInfo;
        String str2;
        POBindInfo pOBindInfo;
        String str3;
        Boolean boolValueOf;
        List<CommuteType> list2;
        String str4;
        List<CBIMarketingTool> list3;
        String str5;
        PipoRichText pipoRichText;
        List<CBIMarketingTool> list4;
        CBIMarketingTool cBIMarketingTool;
        ArrayList<PIPOPaymentMethod> arrayList2;
        List<PIPOPaymentMethod> listLL;
        POActionMode pOActionMode2 = POActionMode.SELECT;
        POSelectStyle pOSelectStyle = POSelectStyle.RADIO;
        switch (C1709670uaj.LIZ[this.nativePaymentMethodType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (this.bindInfo != null) {
                    pOActionMode = POActionMode.JUMP_TO_BIND_EWALLET;
                    pOSelectStyle = null;
                } else {
                    pOActionMode = pOActionMode2;
                }
                break;
            case 6:
                pOActionMode = POActionMode.JUMP_TO_CCDC_PAGE;
                break;
            case 7:
            case 8:
                pOActionMode = POActionMode.NONE;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                pOActionMode = POActionMode.JUMP_TO_SUB_PAYMENT_OPTIONS_PAGE;
                break;
            default:
                throw new C1954807lC();
        }
        if (pOActionMode == pOActionMode2 && this.hybridInfo != null) {
            pOSelectStyle = POSelectStyle.SWITCH;
        }
        Pair pair = new Pair(pOActionMode, pOSelectStyle);
        POActionMode pOActionMode3 = (POActionMode) pair.getFirst();
        POSelectStyle pOSelectStyle2 = (POSelectStyle) pair.getSecond();
        Long l = this.bindTimeStamps;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        String str6 = this.key;
        String str7 = this.id;
        String str8 = this.parentKey;
        ArrayList<PIPOPaymentMethod> arrayList3 = this.subPaymentMethods;
        if (arrayList3 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator<PIPOPaymentMethod> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZJ(LIZLLL(this.key, str), str, list));
            }
        } else {
            arrayList = null;
        }
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = this.hybridInfo;
        if (pIPOPaymentOptionHybridInfo != null) {
            pIPOPaymentOptionSource = pIPOPaymentOptionHybridInfo.source;
        } else {
            pIPOPaymentOptionSource = null;
        }
        if (pIPOPaymentOptionSource != null) {
            z = true;
        } else {
            z = false;
        }
        String str9 = this.displayName;
        if (str9 == null) {
            str9 = "";
        }
        POIcon pOIcon = new POIcon(this.iconUrl, this.darkIconUrl);
        ArrayList arrayList4 = null;
        List listSingletonList2 = null;
        str = null;
        str = null;
        String str10 = null;
        PODisplayInfo.TextInfo textInfo = new PODisplayInfo.TextInfo(this.paymentAmountDisplayText, null, null);
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("pipo_cashier_ccdc_icons_max_value", 0);
        if (this.nativePaymentMethodType == EnumC1709680uak.CCDC_GROUP && iLJ > 0 && (arrayList2 = this.subPaymentMethods) != null && (listLL = C13LP.LL(arrayList2, iLJ)) != null) {
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            for (PIPOPaymentMethod pIPOPaymentMethod : listLL) {
                arrayList5.add(new POIcon(pIPOPaymentMethod.iconUrl, pIPOPaymentMethod.darkIconUrl));
            }
            if (!arrayList5.isEmpty()) {
                arrayList4 = arrayList5;
            }
        }
        String str11 = this.paymentTips;
        if (str11 != null && C1948507kB.LIZ(str11)) {
            C1709720uao.LIZ.getClass();
            listSingletonList = Collections.singletonList(new POTip(new PipoRichText(str11, null)));
            z2 = false;
        } else {
            z2 = false;
            listSingletonList = null;
        }
        String strLJ = LJ(z2);
        if (strLJ != null) {
            C1709720uao.LIZ.getClass();
            PipoRichText pipoRichText2 = new PipoRichText(strLJ, null);
            String strLJ2 = LJ(true);
            if (strLJ2 != null) {
                pipoRichText = new PipoRichText(strLJ2, null);
            } else {
                pipoRichText = null;
            }
            CBIMarketingInfo cBIMarketingInfo = this.marketingInfo;
            if (cBIMarketingInfo != null && (list4 = cBIMarketingInfo.marketingTools) != null && (cBIMarketingTool = (CBIMarketingTool) C13LP.LJJJLL(list4)) != null) {
                str10 = cBIMarketingTool.url;
            }
            listSingletonList2 = Collections.singletonList(new POPromotion(pipoRichText2, pipoRichText, str10));
        }
        String str12 = this.infoSchema;
        if (str12 != null) {
            popupInfo = new PODisplayInfo.PopupInfo(new POPopupInfo(POPopupInfo.Type.URL, str12));
        } else {
            popupInfo = null;
        }
        PODisplayInfo pODisplayInfo = new PODisplayInfo(str9, pOIcon, textInfo, arrayList4, listSingletonList2, listSingletonList, null, popupInfo, pOSelectStyle2);
        EnumC1488970oql enumC1488970oql = this.ccdcBindType;
        if (enumC1488970oql != null) {
            if (enumC1488970oql == EnumC1488970oql.FAKE) {
                cCDCBindType = POConfiguration.CCDCBindType.FAKE;
            } else {
                cCDCBindType = POConfiguration.CCDCBindType.REAL;
            }
        } else {
            cCDCBindType = null;
        }
        POBindInfo pOBindInfo2 = this.bindInfo;
        if (pOBindInfo2 != null) {
            CBIFlow cBIFlow = pOBindInfo2.LIZ;
            if (cBIFlow != null) {
                str5 = cBIFlow.packageName;
            } else {
                str5 = null;
            }
            installationReviewInfo = new POConfiguration.InstallationReviewInfo(null, str5, null);
        } else {
            installationReviewInfo = null;
        }
        POConfiguration pOConfiguration = new POConfiguration(pOActionMode3, cCDCBindType, installationReviewInfo, this.googlePaySupportNetworks, this.pciSensitive);
        POStatusAttr pOStatusAttr = new POStatusAttr(this.available, this.isDefault, this.isPrimary);
        String str13 = this.rawCBIPaymentMethod;
        String str14 = this.bankCode;
        if (this.isPI) {
            str2 = "pi";
        } else {
            str2 = "pm";
        }
        PODaInfo pODaInfo = new PODaInfo(str13, str14, str2);
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo2 = this.hybridInfo;
        POBindInfo pOBindInfo3 = this.bindInfo;
        if (pOBindInfo3 != null) {
            Boolean bool = Boolean.TRUE;
            String str15 = pOBindInfo3.bindTime;
            if (str15 != null) {
                string = str15;
            }
            pOBindInfo = new POBindInfo(pOBindInfo3.schema, pOBindInfo3.isNeedPreFetchActivateUrl, bool, pOBindInfo3.supportedCommuteTypes, pOBindInfo3.checkBox, string, pOBindInfo3.LIZ);
        } else if (this.nativePaymentMethodType == EnumC1709680uak.CCDC_TEMPLATE) {
            pOBindInfo = new POBindInfo(null, null, Boolean.TRUE, null, null, string, null);
        } else if (string != null) {
            pOBindInfo = new POBindInfo(null, null, null, null, null, string, null);
        } else {
            pOBindInfo = null;
        }
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo = new POPaymentMethodBaseInfo(this.id, this.token, this.rawCBIPaymentMethod, this.cbiModel);
        String str16 = this.id;
        PricingPlan pricingPlan = this.pricingPlan;
        if (pricingPlan != null) {
            str3 = pricingPlan.pricingPlanId;
        } else {
            str3 = null;
        }
        CBIMarketingInfo cBIMarketingInfo2 = this.marketingInfo;
        if (cBIMarketingInfo2 != null && (list3 = cBIMarketingInfo2.marketingTools) != null) {
            boolValueOf = Boolean.valueOf(!list3.isEmpty());
        } else {
            boolValueOf = null;
        }
        CashierPaymentOptionInfoResp.PaymentUnitAtomicInfo paymentUnitAtomicInfo = new CashierPaymentOptionInfoResp.PaymentUnitAtomicInfo(str16, str3, boolValueOf);
        String str17 = this.cardRuleRegex;
        PricingPlan pricingPlan2 = this.pricingPlan;
        EnumC2006707tZ enumC2006707tZ = EnumC2006707tZ.NORMAL;
        POFormInfo pOFormInfo = new POFormInfo(this.elements, this.neededElements, null);
        CBIFlow cBIFlow2 = this.paymentFlow;
        if (cBIFlow2 != null) {
            list2 = cBIFlow2.supportedCommuteTypes;
        } else {
            list2 = null;
        }
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo3 = this.hybridInfo;
        if (pIPOPaymentOptionHybridInfo3 == null || (str4 = pIPOPaymentOptionHybridInfo3.amount) == null) {
            str4 = this.paymentAmount;
        }
        PaymentOption paymentOption = new PaymentOption(str6, str8, str6, str7, this, null, null, Boolean.valueOf(z), null, null, null, null, pOPaymentMethodBaseInfo, pOStatusAttr, pOFormInfo, pODaInfo, null, pOBindInfo, new POPayInfo(list2, new PriceAmount(str4, this.paymentCurrency)), pODisplayInfo, pOConfiguration, str17, pricingPlan2, null, arrayList, pIPOPaymentOptionHybridInfo2, paymentUnitAtomicInfo, enumC2006707tZ, LIZ(str, list));
        paymentOption.LJIILL();
        return paymentOption;
    }

    public final PaymentOption LIZJ(String str, String str2, List<PaymentOption> list) {
        PaymentOption next;
        Iterator<PaymentOption> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.id, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentOption paymentOption = next;
        if (paymentOption == null) {
            PaymentOption paymentOptionLJFF = LJFF(str2, list);
            list.add(paymentOptionLJFF);
            return paymentOptionLJFF;
        }
        return paymentOption;
    }

    public PIPOPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, POBindInfo pOBindInfo, CBIFlow cBIFlow, String str11, boolean z, Boolean bool, boolean z2, Boolean bool2, String str12, Long l, List<Element> list, List<Element> list2, List<POPayElement> list3, String str13, String str14, String str15, String str16, Boolean bool3, Boolean bool4, String str17, String str18, EnumC1709680uak enumC1709680uak, ArrayList<PIPOPaymentMethod> arrayList, CBIPaymentMethod cBIPaymentMethod, PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo, PricingPlan pricingPlan, CBIMarketingInfo cBIMarketingInfo, List<String> list4, EnumC1488970oql enumC1488970oql, String str19) {
        this.key = str;
        this.parentKey = str2;
        this.id = str3;
        this.cbiModel = str4;
        this.groupCode = str5;
        this.groupType = str6;
        this.displayName = str7;
        this.iconUrl = str8;
        this.darkIconUrl = str9;
        this.methodType = str10;
        this.bindInfo = pOBindInfo;
        this.paymentFlow = cBIFlow;
        this.token = str11;
        this.isPI = z;
        this.pciSensitive = bool;
        this.available = z2;
        this.isPrimary = bool2;
        this.infoSchema = str12;
        this.bindTimeStamps = l;
        this.elements = list;
        this.neededElements = list2;
        this.remotePIPOPayElement = list3;
        this.bankCode = str13;
        this.paymentAmount = str14;
        this.paymentAmountDisplayText = str15;
        this.paymentTips = str16;
        this.saveCCDCDefault = bool3;
        this.isDefault = bool4;
        this.rawCBIPaymentMethod = str17;
        this.cardRuleRegex = str18;
        this.nativePaymentMethodType = enumC1709680uak;
        this.subPaymentMethods = arrayList;
        this.cbiPaymentMethod = cBIPaymentMethod;
        this.hybridInfo = pIPOPaymentOptionHybridInfo;
        this.pricingPlan = pricingPlan;
        this.marketingInfo = cBIMarketingInfo;
        this.googlePaySupportNetworks = list4;
        this.ccdcBindType = enumC1488970oql;
        this.paymentCurrency = str19;
    }
}
