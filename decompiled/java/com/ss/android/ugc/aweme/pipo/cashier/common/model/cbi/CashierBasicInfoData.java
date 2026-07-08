package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C1157320gDq;
import X.C1707990uY1;
import X.C1708990uZd;
import X.C1709570uaZ;
import X.C1710180ubY;
import X.EnumC1709240ua2;
import X.EnumC994640bzS;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierBasicInfoData {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("cashier_display_info")
    public final CashierDisplayInfo cashierDisplayInfo;

    @C09CT("payment_methods")
    public final List<CBIPaymentMethod> cashierPaymentMethods;

    @C09CT("stored_payment_methods")
    public final List<CBIPaymentMethod> cashierStoredPaymentMethods;

    @C09CT("customized_info")
    public final CustomizedInfo customizedInfo;

    public CashierBasicInfoData() {
        this(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp$GlobalConfiguration] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan] */
    public final C1709570uaZ LIZ(C1708990uZd c1708990uZd, EnumC1709240ua2 enumC1709240ua2, String str) {
        RecInfo recInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        RawTextAndIcon rawTextAndIcon;
        String str7;
        boolean z;
        CashierPaymentOptionInfoResp.GlobalDisplayInfo globalDisplayInfo;
        Object globalConfiguration;
        Object obj;
        Map<String, PricingPlan> map;
        CashierPaymentOptionInfoResp.GlobalDisplayInfo.PageTheme pageTheme;
        RawTextAndIcon rawTextAndIcon2;
        CustomizedInfo customizedInfo = this.customizedInfo;
        Boolean bool = null;
        if (customizedInfo != null) {
            recInfo = customizedInfo.recInfo;
        } else {
            recInfo = null;
        }
        PIPOPaymentOptionSource pIPOPaymentOptionSourceLIZ = C1710180ubY.LIZ(recInfo, new ArrayList(), this.cashierPaymentMethods, this.cashierStoredPaymentMethods, this, "MAIN", this.customizedInfo, str);
        if (pIPOPaymentOptionSourceLIZ == null) {
            return null;
        }
        CustomizedInfo customizedInfo2 = this.customizedInfo;
        if (customizedInfo2 != null) {
            str2 = customizedInfo2.sessionId;
            str3 = customizedInfo2.countryOrRegion;
            str4 = customizedInfo2.pipoHost;
            str5 = customizedInfo2.merchantId;
            str6 = customizedInfo2.merchantUserId;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        C1707990uY1 c1707990uY1 = new C1707990uY1(str4, str2, str3, str5, str6);
        List<PIPOPaymentOptionArea> list = pIPOPaymentOptionSourceLIZ.recPOAreas;
        CashierDisplayInfo cashierDisplayInfo = this.cashierDisplayInfo;
        if (cashierDisplayInfo != null) {
            rawTextAndIcon = cashierDisplayInfo.rawTextAndIcon;
        } else {
            rawTextAndIcon = null;
        }
        EnumC994640bzS enumC994640bzSLIZJ = C1710180ubY.LIZJ(list, rawTextAndIcon);
        CashierDisplayInfo cashierDisplayInfo2 = this.cashierDisplayInfo;
        if (cashierDisplayInfo2 != null && (rawTextAndIcon2 = cashierDisplayInfo2.rawTextAndIcon) != null) {
            str7 = rawTextAndIcon2.showMoreMethodsTitle;
        } else {
            str7 = null;
        }
        if (str7 != null && str7.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        C1157320gDq c1157320gDq = new C1157320gDq(enumC1709240ua2, enumC994640bzSLIZJ, true, !z);
        CashierDisplayInfo cashierDisplayInfo3 = this.cashierDisplayInfo;
        if (cashierDisplayInfo3 != null) {
            RawTextAndIcon rawTextAndIcon3 = cashierDisplayInfo3.rawTextAndIcon;
            TextStyle textStyle = cashierDisplayInfo3.textStyle;
            if (enumC1709240ua2 == EnumC1709240ua2.DEFAULT) {
                pageTheme = CashierPaymentOptionInfoResp.GlobalDisplayInfo.PageTheme.DEFAULT;
            } else {
                pageTheme = CashierPaymentOptionInfoResp.GlobalDisplayInfo.PageTheme.TOKO;
            }
            bool = null;
            globalDisplayInfo = new CashierPaymentOptionInfoResp.GlobalDisplayInfo(null, null, null, null, rawTextAndIcon3, textStyle, pageTheme, false);
        } else {
            globalDisplayInfo = null;
        }
        CustomizedInfo customizedInfo3 = this.customizedInfo;
        if (customizedInfo3 != null) {
            globalConfiguration = new CashierPaymentOptionInfoResp.GlobalConfiguration(bool, customizedInfo3.pipoHost, customizedInfo3.encodeKey, customizedInfo3.paymentCardRules, customizedInfo3.sessionId, customizedInfo3.countryOrRegion, customizedInfo3.merchantId, customizedInfo3.merchantUserId, bool, bool, bool);
        } else {
            globalConfiguration = bool;
        }
        CashierDisplayInfo cashierDisplayInfo4 = this.cashierDisplayInfo;
        if (cashierDisplayInfo4 != null && (map = cashierDisplayInfo4.pricingPlanMap) != null) {
            obj = (PricingPlan) map.get(cashierDisplayInfo4.defaultPricingPlanId);
        } else {
            obj = bool;
        }
        return new C1709570uaZ(pIPOPaymentOptionSourceLIZ, c1707990uY1, globalDisplayInfo, globalConfiguration, obj, this, null, c1708990uZd, c1157320gDq, str);
    }

    public CashierBasicInfoData(List<CBIPaymentMethod> list, List<CBIPaymentMethod> list2, CashierDisplayInfo cashierDisplayInfo, CustomizedInfo customizedInfo) {
        this.cashierPaymentMethods = list;
        this.cashierStoredPaymentMethods = list2;
        this.cashierDisplayInfo = cashierDisplayInfo;
        this.customizedInfo = customizedInfo;
    }
}
