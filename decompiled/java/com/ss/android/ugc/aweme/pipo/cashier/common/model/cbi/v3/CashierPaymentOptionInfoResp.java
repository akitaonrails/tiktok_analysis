package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3;

import X.C013C;
import X.C08FF;
import X.C09CT;
import X.C1157320gDq;
import X.C13BV;
import X.C13LP;
import X.C1707990uY1;
import X.C1708610uZ1;
import X.C1708990uZd;
import X.C1709570uaZ;
import X.C1709610uad;
import X.C1710180ubY;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2254308sP;
import X.C786410Ut5;
import X.EnumC1709240ua2;
import X.EnumC994640bzS;
import X.InterfaceC1709310ua9;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionHybridInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CCDCBankCardRule;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.TextStyle;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.WalletPaymentType;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODisplayInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POTip;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierPaymentOptionInfoResp {

    @C09CT("view_all_payment_option_area_id_list")
    public final List<String> allPOAreaIdList;

    @C09CT("default_pricing_plan_id")
    public final String defaultPricingPlanId;

    @C09CT("global_configuration")
    public final GlobalConfiguration globalConfig;

    @C09CT("global_display_info")
    public final GlobalDisplayInfo globalDisplayInfo;

    @C09CT("payment_option_area_map")
    public final Map<String, PaymentOptionArea> paymentOptionAreaPool;

    @C09CT("payment_option_map")
    public final Map<String, PaymentOption> paymentOptionPool;

    @C09CT("payment_unit_atomic_info_map")
    public final Map<String, PaymentUnitAtomicInfo> paymentUnitPool;

    @C09CT("pricing_plan_map")
    public final Map<String, PricingPlan> pricingPlanMap;

    @C09CT("recommend_payment_option_area_id_list")
    public final List<String> recPOAreaIdList;

    public CashierPaymentOptionInfoResp() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ(), null, null, null, null, null, null, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashierPaymentOptionInfoResp)) {
            return false;
        }
        CashierPaymentOptionInfoResp cashierPaymentOptionInfoResp = (CashierPaymentOptionInfoResp) obj;
        return Intrinsics.LJFF(this.paymentOptionPool, cashierPaymentOptionInfoResp.paymentOptionPool) && Intrinsics.LJFF(this.paymentUnitPool, cashierPaymentOptionInfoResp.paymentUnitPool) && Intrinsics.LJFF(this.paymentOptionAreaPool, cashierPaymentOptionInfoResp.paymentOptionAreaPool) && Intrinsics.LJFF(this.recPOAreaIdList, cashierPaymentOptionInfoResp.recPOAreaIdList) && Intrinsics.LJFF(this.allPOAreaIdList, cashierPaymentOptionInfoResp.allPOAreaIdList) && Intrinsics.LJFF(this.globalConfig, cashierPaymentOptionInfoResp.globalConfig) && Intrinsics.LJFF(this.globalDisplayInfo, cashierPaymentOptionInfoResp.globalDisplayInfo) && Intrinsics.LJFF(this.defaultPricingPlanId, cashierPaymentOptionInfoResp.defaultPricingPlanId) && Intrinsics.LJFF(this.pricingPlanMap, cashierPaymentOptionInfoResp.pricingPlanMap);
    }

    public final int hashCode() {
        int iHashCode = ((this.paymentOptionPool.hashCode() * 31) + this.paymentUnitPool.hashCode()) * 31;
        Map<String, PaymentOptionArea> map = this.paymentOptionAreaPool;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.recPOAreaIdList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allPOAreaIdList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GlobalConfiguration globalConfiguration = this.globalConfig;
        int iHashCode5 = (iHashCode4 + (globalConfiguration == null ? 0 : globalConfiguration.hashCode())) * 31;
        GlobalDisplayInfo globalDisplayInfo = this.globalDisplayInfo;
        int iHashCode6 = (iHashCode5 + (globalDisplayInfo == null ? 0 : globalDisplayInfo.hashCode())) * 31;
        String str = this.defaultPricingPlanId;
        return ((iHashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.pricingPlanMap.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierPaymentOptionInfoResp(paymentOptionPool=");
        sbLIZ.append(this.paymentOptionPool);
        sbLIZ.append(", paymentUnitPool=");
        sbLIZ.append(this.paymentUnitPool);
        sbLIZ.append(", paymentOptionAreaPool=");
        sbLIZ.append(this.paymentOptionAreaPool);
        sbLIZ.append(", recPOAreaIdList=");
        sbLIZ.append(this.recPOAreaIdList);
        sbLIZ.append(", allPOAreaIdList=");
        sbLIZ.append(this.allPOAreaIdList);
        sbLIZ.append(", globalConfig=");
        sbLIZ.append(this.globalConfig);
        sbLIZ.append(", globalDisplayInfo=");
        sbLIZ.append(this.globalDisplayInfo);
        sbLIZ.append(", defaultPricingPlanId=");
        sbLIZ.append(this.defaultPricingPlanId);
        sbLIZ.append(", pricingPlanMap=");
        sbLIZ.append(this.pricingPlanMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class GlobalDisplayInfo {

        @C09CT("default_show_view_all")
        public final boolean defaultShowViewAll;

        @C09CT("page_theme")
        public final PageTheme pageTheme;

        @C09CT("raw_text_and_icon")
        public final RawTextAndIcon rawTextAndIcon;

        @C09CT("risk_text_info")
        public final RiskTextInfo riskTextInfo;

        @C09CT("text_info")
        public final TextInfo textInfo;

        @C09CT("text_style")
        public final TextStyle textStyle;

        @C09CT("tip_info")
        public final TipInfo tipInfo;

        @C09CT("url_info")
        public final UrlInfo urlInfo;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class PageTheme {

            @C09CT(CardStruct.IStatusCode.DEFAULT)
            public static final PageTheme DEFAULT;
            public static final /* synthetic */ PageTheme[] LL;
            public static final /* synthetic */ C2254308sP LLILLJJLI;

            @C09CT("1")
            public static final PageTheme TOKO;

            public static InterfaceC2044707zh<PageTheme> getEntries() {
                return LLILLJJLI;
            }

            static {
                PageTheme pageTheme = new PageTheme(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
                DEFAULT = pageTheme;
                PageTheme pageTheme2 = new PageTheme("TOKO", 1);
                TOKO = pageTheme2;
                PageTheme[] pageThemeArr = {pageTheme, pageTheme2};
                LL = pageThemeArr;
                LLILLJJLI = new C2254308sP(pageThemeArr);
            }

            public static PageTheme[] values() {
                return (PageTheme[]) LL.clone();
            }

            public final EnumC1709240ua2 toPIPOCashierTheme() {
                return this == TOKO ? EnumC1709240ua2.TOKO : EnumC1709240ua2.DEFAULT;
            }

            public static PageTheme valueOf(String str) {
                return (PageTheme) C08FF.LIZ(PageTheme.class, str);
            }

            public PageTheme(String str, int i) {
            }
        }

        public GlobalDisplayInfo() {
            this(null, null, null, null, null, null, PageTheme.DEFAULT, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GlobalDisplayInfo)) {
                return false;
            }
            GlobalDisplayInfo globalDisplayInfo = (GlobalDisplayInfo) obj;
            return Intrinsics.LJFF(this.textInfo, globalDisplayInfo.textInfo) && Intrinsics.LJFF(this.urlInfo, globalDisplayInfo.urlInfo) && Intrinsics.LJFF(this.riskTextInfo, globalDisplayInfo.riskTextInfo) && Intrinsics.LJFF(this.tipInfo, globalDisplayInfo.tipInfo) && Intrinsics.LJFF(this.rawTextAndIcon, globalDisplayInfo.rawTextAndIcon) && Intrinsics.LJFF(this.textStyle, globalDisplayInfo.textStyle) && this.pageTheme == globalDisplayInfo.pageTheme && this.defaultShowViewAll == globalDisplayInfo.defaultShowViewAll;
        }

        public final int hashCode() {
            TextInfo textInfo = this.textInfo;
            int iHashCode = (textInfo == null ? 0 : textInfo.hashCode()) * 31;
            UrlInfo urlInfo = this.urlInfo;
            int iHashCode2 = (iHashCode + (urlInfo == null ? 0 : urlInfo.hashCode())) * 31;
            RiskTextInfo riskTextInfo = this.riskTextInfo;
            int iHashCode3 = (iHashCode2 + (riskTextInfo == null ? 0 : riskTextInfo.hashCode())) * 31;
            TipInfo tipInfo = this.tipInfo;
            int iHashCode4 = (iHashCode3 + (tipInfo == null ? 0 : tipInfo.hashCode())) * 31;
            RawTextAndIcon rawTextAndIcon = this.rawTextAndIcon;
            int iHashCode5 = (iHashCode4 + (rawTextAndIcon == null ? 0 : rawTextAndIcon.hashCode())) * 31;
            TextStyle textStyle = this.textStyle;
            return ((((iHashCode5 + (textStyle != null ? textStyle.hashCode() : 0)) * 31) + this.pageTheme.hashCode()) * 31) + C786410Ut5.Z2(this.defaultShowViewAll);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GlobalDisplayInfo(textInfo=");
            sbLIZ.append(this.textInfo);
            sbLIZ.append(", urlInfo=");
            sbLIZ.append(this.urlInfo);
            sbLIZ.append(", riskTextInfo=");
            sbLIZ.append(this.riskTextInfo);
            sbLIZ.append(", tipInfo=");
            sbLIZ.append(this.tipInfo);
            sbLIZ.append(", rawTextAndIcon=");
            sbLIZ.append(this.rawTextAndIcon);
            sbLIZ.append(", textStyle=");
            sbLIZ.append(this.textStyle);
            sbLIZ.append(", pageTheme=");
            sbLIZ.append(this.pageTheme);
            sbLIZ.append(", defaultShowViewAll=");
            sbLIZ.append(this.defaultShowViewAll);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public static final class RiskTextInfo {

            @C09CT("cashier_button_info")
            public final PipoRichText cashierButtonInfo;

            public RiskTextInfo() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RiskTextInfo) && Intrinsics.LJFF(this.cashierButtonInfo, ((RiskTextInfo) obj).cashierButtonInfo);
            }

            public final int hashCode() {
                PipoRichText pipoRichText = this.cashierButtonInfo;
                if (pipoRichText == null) {
                    return 0;
                }
                return pipoRichText.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RiskTextInfo(cashierButtonInfo=");
                sbLIZ.append(this.cashierButtonInfo);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public RiskTextInfo(PipoRichText pipoRichText) {
                this.cashierButtonInfo = pipoRichText;
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class TextInfo {

            @C09CT("payment_modules_desc")
            public final String paymentModulesDesc;

            public TextInfo() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TextInfo) && Intrinsics.LJFF(this.paymentModulesDesc, ((TextInfo) obj).paymentModulesDesc);
            }

            public final int hashCode() {
                String str = this.paymentModulesDesc;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TextInfo(paymentModulesDesc=");
                sbLIZ.append(this.paymentModulesDesc);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public TextInfo(String str) {
                this.paymentModulesDesc = str;
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class UrlInfo {

            @C09CT("payment_modules_desc_url")
            public final String paymentModulesDescUrl;

            public UrlInfo() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UrlInfo) && Intrinsics.LJFF(this.paymentModulesDescUrl, ((UrlInfo) obj).paymentModulesDescUrl);
            }

            public final int hashCode() {
                String str = this.paymentModulesDescUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UrlInfo(paymentModulesDescUrl=");
                sbLIZ.append(this.paymentModulesDescUrl);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public UrlInfo(String str) {
                this.paymentModulesDescUrl = str;
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class TipInfo {

            @C09CT("payment_banner")
            public final POTip paymentBanner;

            @C09CT("title_tips")
            public final POTip titleTips;

            public TipInfo() {
                this(null, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TipInfo)) {
                    return false;
                }
                TipInfo tipInfo = (TipInfo) obj;
                return Intrinsics.LJFF(this.titleTips, tipInfo.titleTips) && Intrinsics.LJFF(this.paymentBanner, tipInfo.paymentBanner);
            }

            public final int hashCode() {
                POTip pOTip = this.titleTips;
                int iHashCode = (pOTip == null ? 0 : pOTip.hashCode()) * 31;
                POTip pOTip2 = this.paymentBanner;
                return iHashCode + (pOTip2 != null ? pOTip2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TipInfo(titleTips=");
                sbLIZ.append(this.titleTips);
                sbLIZ.append(", paymentBanner=");
                sbLIZ.append(this.paymentBanner);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public TipInfo(POTip pOTip, POTip pOTip2) {
                this.titleTips = pOTip;
                this.paymentBanner = pOTip2;
            }
        }

        public GlobalDisplayInfo(TextInfo textInfo, UrlInfo urlInfo, RiskTextInfo riskTextInfo, TipInfo tipInfo, RawTextAndIcon rawTextAndIcon, TextStyle textStyle, PageTheme pageTheme, boolean z) {
            this.textInfo = textInfo;
            this.urlInfo = urlInfo;
            this.riskTextInfo = riskTextInfo;
            this.tipInfo = tipInfo;
            this.rawTextAndIcon = rawTextAndIcon;
            this.textStyle = textStyle;
            this.pageTheme = pageTheme;
            this.defaultShowViewAll = z;
        }
    }

    public final PIPOPaymentOptionArea LIZIZ(String str) {
        PaymentOptionArea paymentOptionArea;
        ArrayList arrayList;
        String str2 = str;
        Map<String, PaymentOptionArea> map = this.paymentOptionAreaPool;
        if (map != null && (paymentOptionArea = map.get(str2)) != null) {
            String str3 = paymentOptionArea.id;
            if (str3 != null) {
                str2 = str3;
            }
            String str4 = paymentOptionArea.title;
            String str5 = paymentOptionArea.paymentAmountDisplayText;
            List<String> list = paymentOptionArea.paymentOptionIds;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    PaymentOption paymentOption = this.paymentOptionPool.get(it2.next());
                    if (paymentOption != null) {
                        arrayList2.add(paymentOption);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            return new PIPOPaymentOptionArea(str2, str4, str5, str5, arrayList);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption>] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final C1709570uaZ LIZJ(C1708990uZd c1708990uZd, String str) throws JSONException {
        boolean z;
        RawTextAndIcon rawTextAndIcon;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        EnumC1709240ua2 pIPOCashierTheme;
        PricingPlan pricingPlan;
        GlobalDisplayInfo globalDisplayInfo;
        GlobalDisplayInfo.PageTheme pageTheme;
        RawTextAndIcon rawTextAndIcon2;
        String str8;
        PricingPlan pricingPlan2;
        GlobalConfiguration globalConfiguration;
        ArrayList<CCDCBankCardRule> arrayList;
        List<String> list;
        List<String> list2;
        POBindInfo.BindCheckBox bindCheckBox;
        ArrayList arrayList2;
        ?? arrayList3;
        String str9;
        Iterator<Map.Entry<String, PaymentOption>> it2 = this.paymentOptionPool.entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, PaymentOption> next = it2.next();
            String key = next.getKey();
            PaymentOption value = next.getValue();
            if (value.LIZ.length() == 0) {
                String str10 = value.singlePOId;
                if (str10 != null && str10.length() != 0) {
                    value.LIZ = value.singlePOId;
                } else {
                    String str11 = value.id;
                    String str12 = "";
                    if (str11 == null) {
                        str11 = "";
                    }
                    value.LIZ = str11;
                    InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = new Pair("page_name", "secondary_payment_method");
                    String str13 = value.id;
                    if (str13 == null) {
                        str13 = "";
                    }
                    pairArr[1] = new Pair("payment_option", str13);
                    pairArr[2] = new Pair("error_code", "single_payment_payment_option_id_missing");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fallback_payment_option_key_to_payment_option_id, payment_option_map_key=");
                    sbLIZ.append(key);
                    sbLIZ.append(", single_payment_payment_option_id=");
                    String str14 = value.singlePOId;
                    if (str14 != null) {
                        str12 = str14;
                    }
                    sbLIZ.append(str12);
                    pairArr[3] = new Pair("error_msg", C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC1709310ua9LIZIZ.LJIIIIZZ(C2097608Jq.LJIIIIZZ(pairArr));
                }
            }
        }
        Iterator<Map.Entry<String, PaymentOption>> it3 = this.paymentOptionPool.entrySet().iterator();
        while (true) {
            rawTextAndIcon = null;
            String str15 = null;
            if (!it3.hasNext()) {
                break;
            }
            PaymentOption value2 = it3.next().getValue();
            value2.getClass();
            PaymentUnitAtomicInfo paymentUnitAtomicInfo = this.paymentUnitPool.get(value2.paymentUnitId);
            value2.LJFF = paymentUnitAtomicInfo;
            if ((paymentUnitAtomicInfo == null || (str9 = paymentUnitAtomicInfo.pricingPlanId) == null || (pricingPlan2 = this.pricingPlanMap.get(str9)) == null) && ((str8 = this.defaultPricingPlanId) == null || (pricingPlan2 = this.pricingPlanMap.get(str8)) == null)) {
                pricingPlan2 = this.pricingPlanMap.get("default_pricing_plan_id");
            }
            value2.LIZIZ = pricingPlan2;
            String str16 = value2.cardRuleRegex;
            if (str16 == null || str16.length() <= 0) {
                String strLJIL = value2.LJIL();
                if (strLJIL != null && strLJIL.length() > 0 && (globalConfiguration = this.globalConfig) != null && (arrayList = globalConfiguration.paymentCardRules) != null) {
                    for (CCDCBankCardRule cCDCBankCardRule : arrayList) {
                        str16 = cCDCBankCardRule.cardBrandRegex;
                        if (str16 != null && Intrinsics.LJFF(cCDCBankCardRule.paymentMethodId, strLJIL) && str16.length() > 0) {
                            break;
                        }
                    }
                    str16 = null;
                } else {
                    str16 = null;
                }
            }
            value2.cardRuleRegex = str16;
            value2.LJIILL();
            List<String> list3 = value2.recSubPOIdList;
            if ((list3 != null && !list3.isEmpty()) || ((list = value2.allSubPOIdList) != null && !list.isEmpty())) {
                Map<String, PaymentOption> map = this.paymentOptionPool;
                List<String> list4 = value2.recSubPOIdList;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<String> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        PaymentOption paymentOption = map.get(it4.next());
                        if (paymentOption != null) {
                            arrayList4.add(paymentOption);
                        }
                    }
                    arrayList2 = new ArrayList(arrayList4);
                } else {
                    arrayList2 = null;
                }
                value2.LIZJ = arrayList2;
                List<String> list5 = value2.allSubPOIdList;
                if (list5 != null) {
                    arrayList3 = new ArrayList();
                    Iterator<String> it5 = list5.iterator();
                    while (it5.hasNext()) {
                        PaymentOption paymentOption2 = map.get(it5.next());
                        if (paymentOption2 != null) {
                            arrayList3.add(paymentOption2);
                        }
                    }
                } else {
                    arrayList3 = 0;
                }
                value2.LIZLLL = arrayList3;
                Collection collection = value2.LIZJ;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                if (arrayList3 == 0) {
                    arrayList3 = C13BV.INSTANCE;
                }
                List listLJLIL = C13LP.LJLIL(arrayList3, collection);
                HashSet hashSet = new HashSet();
                ArrayList<PaymentOption> arrayList5 = new ArrayList();
                for (Object obj : (ArrayList) listLJLIL) {
                    if (hashSet.add(((PaymentOption) obj).LIZ)) {
                        arrayList5.add(obj);
                    }
                }
                for (PaymentOption paymentOption3 : arrayList5) {
                    String str17 = paymentOption3.parentKey;
                    if (str17 == null || str17.length() == 0) {
                        paymentOption3.parentKey = value2.LIZ;
                    }
                }
            }
            List<String> list6 = value2.recHybridAreaIdList;
            if ((list6 != null && !list6.isEmpty()) || ((list2 = value2.allHybridAreaIdList) != null && !list2.isEmpty())) {
                PIPOPaymentOptionSource pIPOPaymentOptionSourceLIZ = LIZ(value2.LIZ, value2.recHybridAreaIdList, value2.allHybridAreaIdList, null, str);
                WalletPaymentType walletPaymentType = WalletPaymentType.HYBRID;
                PODisplayInfo.TextInfo textInfo = value2.displayInfo.textInfo;
                if (textInfo != null) {
                    str15 = textInfo.paymentAmountDisplayText;
                }
                value2.LJ = new PIPOPaymentOptionHybridInfo(walletPaymentType, pIPOPaymentOptionSourceLIZ, str15, null, null);
            }
            POBindInfo pOBindInfo = value2.bindInfo;
            if (pOBindInfo != null && (bindCheckBox = pOBindInfo.checkBox) != null) {
                value2.LJII = new C1709610uad(bindCheckBox.isSelect, this.paymentOptionPool.get(bindCheckBox.selectPaymentOptionId), this.paymentOptionPool.get(bindCheckBox.unselectPaymentOptionId));
            }
        }
        C013C c013c = new C013C();
        PIPOPaymentOptionSource pIPOPaymentOptionSourceLIZ2 = LIZ("MAIN", this.recPOAreaIdList, this.allPOAreaIdList, new AwS584S0100000_5(c013c, 952), str);
        GlobalDisplayInfo globalDisplayInfo2 = this.globalDisplayInfo;
        if (globalDisplayInfo2 != null && (rawTextAndIcon2 = globalDisplayInfo2.rawTextAndIcon) != null) {
            str2 = rawTextAndIcon2.showMoreMethodsTitle;
        } else {
            str2 = null;
        }
        GlobalConfiguration globalConfiguration2 = this.globalConfig;
        if (globalConfiguration2 != null) {
            str3 = globalConfiguration2.sessionId;
            str4 = globalConfiguration2.countryOrRegion;
            str5 = globalConfiguration2.pipoHost;
            str6 = globalConfiguration2.merchantId;
            str7 = globalConfiguration2.merchantUserId;
        } else {
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        C1707990uY1 c1707990uY1 = new C1707990uY1(str5, str3, str4, str6, str7);
        GlobalDisplayInfo globalDisplayInfo3 = this.globalDisplayInfo;
        if (globalDisplayInfo3 == null || (pageTheme = globalDisplayInfo3.pageTheme) == null || (pIPOCashierTheme = pageTheme.toPIPOCashierTheme()) == null) {
            pIPOCashierTheme = EnumC1709240ua2.DEFAULT;
        }
        List<PIPOPaymentOptionArea> list7 = pIPOPaymentOptionSourceLIZ2.recPOAreas;
        GlobalDisplayInfo globalDisplayInfo4 = this.globalDisplayInfo;
        if (globalDisplayInfo4 != null) {
            rawTextAndIcon = globalDisplayInfo4.rawTextAndIcon;
        }
        EnumC994640bzS enumC994640bzSLIZJ = C1710180ubY.LIZJ(list7, rawTextAndIcon);
        if (str2 == null || str2.length() == 0 || (((globalDisplayInfo = this.globalDisplayInfo) == null || !globalDisplayInfo.defaultShowViewAll) && !c013c.element)) {
            z = false;
        }
        C1157320gDq c1157320gDq = new C1157320gDq(pIPOCashierTheme, enumC994640bzSLIZJ, false, z);
        GlobalDisplayInfo globalDisplayInfo5 = this.globalDisplayInfo;
        GlobalConfiguration globalConfiguration3 = this.globalConfig;
        String str18 = this.defaultPricingPlanId;
        if (str18 == null || (pricingPlan = this.pricingPlanMap.get(str18)) == null) {
            pricingPlan = this.pricingPlanMap.get("default_pricing_plan_id");
        }
        return new C1709570uaZ(pIPOPaymentOptionSourceLIZ2, c1707990uY1, globalDisplayInfo5, globalConfiguration3, pricingPlan, null, this, c1708990uZd, c1157320gDq, str);
    }

    public static final class PaymentUnitAtomicInfo {

        @C09CT("has_promotion")
        public final Boolean hasPromotion;

        @C09CT("payment_unit_id")
        public final String id;

        @C09CT("pricing_plan_id")
        public final String pricingPlanId;

        public PaymentUnitAtomicInfo() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentUnitAtomicInfo)) {
                return false;
            }
            PaymentUnitAtomicInfo paymentUnitAtomicInfo = (PaymentUnitAtomicInfo) obj;
            return Intrinsics.LJFF(this.id, paymentUnitAtomicInfo.id) && Intrinsics.LJFF(this.pricingPlanId, paymentUnitAtomicInfo.pricingPlanId) && Intrinsics.LJFF(this.hasPromotion, paymentUnitAtomicInfo.hasPromotion);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.pricingPlanId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.hasPromotion;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PaymentUnitAtomicInfo(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", pricingPlanId=");
            sbLIZ.append(this.pricingPlanId);
            sbLIZ.append(", hasPromotion=");
            sbLIZ.append(this.hasPromotion);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PaymentUnitAtomicInfo(String str, String str2, Boolean bool) {
            this.id = str;
            this.pricingPlanId = str2;
            this.hasPromotion = bool;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class PaymentOptionArea {

        @C09CT("payment_option_area_id")
        public final String id;

        @C09CT("area_payment_amount_display_text")
        public final String paymentAmountDisplayText;

        @C09CT("payment_option_id_list")
        public final List<String> paymentOptionIds;

        @C09CT("area_title")
        public final String title;

        public PaymentOptionArea() {
            this(null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentOptionArea)) {
                return false;
            }
            PaymentOptionArea paymentOptionArea = (PaymentOptionArea) obj;
            return Intrinsics.LJFF(this.id, paymentOptionArea.id) && Intrinsics.LJFF(this.title, paymentOptionArea.title) && Intrinsics.LJFF(this.paymentOptionIds, paymentOptionArea.paymentOptionIds) && Intrinsics.LJFF(this.paymentAmountDisplayText, paymentOptionArea.paymentAmountDisplayText);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.paymentOptionIds;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.paymentAmountDisplayText;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PaymentOptionArea(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", paymentOptionIds=");
            sbLIZ.append(this.paymentOptionIds);
            sbLIZ.append(", paymentAmountDisplayText=");
            sbLIZ.append(this.paymentAmountDisplayText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PaymentOptionArea(String str, String str2, List<String> list, String str3) {
            this.id = str;
            this.title = str2;
            this.paymentOptionIds = list;
            this.paymentAmountDisplayText = str3;
        }
    }

    public final PIPOPaymentOptionSource LIZ(String str, List<String> list, List<String> list2, Function1<? super Boolean, Unit> function1, String str2) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                PIPOPaymentOptionArea pIPOPaymentOptionAreaLIZIZ = LIZIZ(it2.next());
                if (pIPOPaymentOptionAreaLIZIZ != null) {
                    arrayList3.add(pIPOPaymentOptionAreaLIZIZ);
                }
            }
            arrayList = new ArrayList(arrayList3);
        } else {
            arrayList = new ArrayList();
        }
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> it3 = list2.iterator();
            while (it3.hasNext()) {
                PIPOPaymentOptionArea pIPOPaymentOptionAreaLIZIZ2 = LIZIZ(it3.next());
                if (pIPOPaymentOptionAreaLIZIZ2 != null) {
                    arrayList4.add(pIPOPaymentOptionAreaLIZIZ2);
                }
            }
            arrayList2 = new ArrayList(arrayList4);
        } else {
            arrayList2 = new ArrayList();
        }
        PIPOPaymentOptionSource pIPOPaymentOptionSource = new PIPOPaymentOptionSource(str, C13LP.LLIIII(this.paymentOptionPool.values()), null, null, arrayList, arrayList2, 12, null);
        boolean zLJII = pIPOPaymentOptionSource.LJII(str2, null);
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zLJII));
        }
        return pIPOPaymentOptionSource;
    }

    public CashierPaymentOptionInfoResp(Map<String, PaymentOption> map, Map<String, PaymentUnitAtomicInfo> map2, Map<String, PaymentOptionArea> map3, List<String> list, List<String> list2, GlobalConfiguration globalConfiguration, GlobalDisplayInfo globalDisplayInfo, String str, Map<String, PricingPlan> map4) {
        this.paymentOptionPool = map;
        this.paymentUnitPool = map2;
        this.paymentOptionAreaPool = map3;
        this.recPOAreaIdList = list;
        this.allPOAreaIdList = list2;
        this.globalConfig = globalConfiguration;
        this.globalDisplayInfo = globalDisplayInfo;
        this.defaultPricingPlanId = str;
        this.pricingPlanMap = map4;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class GlobalConfiguration {

        @C09CT("consultation_id")
        public final String consultationId;

        @C09CT("country_or_region")
        public final String countryOrRegion;

        @C09CT("encode_key")
        public final String encodeKey;

        @C09CT("merchant_id")
        public final String merchantId;

        @C09CT("merchant_user_id")
        public final String merchantUserId;

        @C09CT("payment_card_rules")
        public final ArrayList<CCDCBankCardRule> paymentCardRules;

        @C09CT("payment_consult_id")
        public final String paymentConsultId;

        @C09CT("payment_param")
        public final Map<String, String> paymentParam;

        @C09CT("pipo_host")
        public final String pipoHost;

        @C09CT("session_id")
        public final String sessionId;

        @C09CT("waive_cvv")
        public final Boolean waiveCVV;

        public GlobalConfiguration() {
            this(null, null, null, null, null, null, null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GlobalConfiguration)) {
                return false;
            }
            GlobalConfiguration globalConfiguration = (GlobalConfiguration) obj;
            return Intrinsics.LJFF(this.waiveCVV, globalConfiguration.waiveCVV) && Intrinsics.LJFF(this.pipoHost, globalConfiguration.pipoHost) && Intrinsics.LJFF(this.encodeKey, globalConfiguration.encodeKey) && Intrinsics.LJFF(this.paymentCardRules, globalConfiguration.paymentCardRules) && Intrinsics.LJFF(this.sessionId, globalConfiguration.sessionId) && Intrinsics.LJFF(this.countryOrRegion, globalConfiguration.countryOrRegion) && Intrinsics.LJFF(this.merchantId, globalConfiguration.merchantId) && Intrinsics.LJFF(this.merchantUserId, globalConfiguration.merchantUserId) && Intrinsics.LJFF(this.consultationId, globalConfiguration.consultationId) && Intrinsics.LJFF(this.paymentParam, globalConfiguration.paymentParam) && Intrinsics.LJFF(this.paymentConsultId, globalConfiguration.paymentConsultId);
        }

        public final int hashCode() {
            Boolean bool = this.waiveCVV;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.pipoHost;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.encodeKey;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ArrayList<CCDCBankCardRule> arrayList = this.paymentCardRules;
            int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            String str3 = this.sessionId;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.countryOrRegion;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.merchantId;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.merchantUserId;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.consultationId;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Map<String, String> map = this.paymentParam;
            int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
            String str8 = this.paymentConsultId;
            return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            return "GlobalConfiguration(waiveCVV=" + this.waiveCVV + ", pipoHost=" + this.pipoHost + ", encodeKey=" + this.encodeKey + ", paymentCardRules=" + this.paymentCardRules + ", sessionId=" + this.sessionId + ", countryOrRegion=" + this.countryOrRegion + ", merchantId=" + this.merchantId + ", merchantUserId=" + this.merchantUserId + ", consultationId=" + this.consultationId + ", paymentParam=" + this.paymentParam + ", paymentConsultId=" + this.paymentConsultId + ')';
        }

        public GlobalConfiguration(Boolean bool, String str, String str2, ArrayList<CCDCBankCardRule> arrayList, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, String str8) {
            this.waiveCVV = bool;
            this.pipoHost = str;
            this.encodeKey = str2;
            this.paymentCardRules = arrayList;
            this.sessionId = str3;
            this.countryOrRegion = str4;
            this.merchantId = str5;
            this.merchantUserId = str6;
            this.consultationId = str7;
            this.paymentParam = map;
            this.paymentConsultId = str8;
        }
    }
}
