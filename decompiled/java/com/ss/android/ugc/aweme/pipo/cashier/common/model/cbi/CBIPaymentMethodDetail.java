package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C098200Yq;
import X.C09CT;
import X.C13LP;
import X.C189200o6;
import X.C2197108jB;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIPaymentMethodDetail {

    @C09CT("bank_card_detail_v2")
    public final BankCardDetail bankCardDetailV2;

    @C09CT("bind_flow")
    public final CBIFlow bindFlow;

    @C09CT("bind_time")
    public final String bindTime;

    @C09CT("checkbox")
    public final CBICheckBox checkbox;

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("display_raw_name")
    public final String displayName;

    @C09CT("google_pay_support_networks")
    public final List<String> googlePaySupportNetworks;

    @C09CT("hybrid_info")
    public final HybridInfo hybridInfo;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("installment_info")
    public final CBIPayLaterInstallmentInfo installmentInfo;

    @C09CT("is_available")
    public final Boolean isAvailable;

    @C09CT("is_primary")
    public final Boolean isPrimary;

    @C09CT("marketing_info")
    public final CBIMarketingInfo marketingInfo;

    @C09CT("method_type")
    public final String methodType;

    @C09CT("model")
    public final String model;

    @C09CT("actual_payment_amount")
    public final String paymentAmount;

    @C09CT("payment_amount_display_text")
    public final String paymentAmountDisplayText;

    @C09CT("payment_currency")
    public final String paymentCurrency;

    @C09CT("payment_flow")
    public final CBIFlow paymentFlow;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_tips")
    public final List<PaymentMethodTips> paymentMethodTips;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("payment_tips")
    public final String paymentTips;

    @C09CT("pricing_plan_id")
    public final String pricingPlanId;

    @C09CT("payment_method")
    public final String rawPaymentMethod;

    @C09CT("save_display_text")
    public final String saveDisplayText;

    @C09CT("show_info_schema")
    public final String showInfoSchema;

    public final String LIZ() {
        try {
            List<PaymentMethodTips> list = this.paymentMethodTips;
            if (list == null || list.isEmpty()) {
                return this.paymentTips;
            }
            List<PaymentMethodTips> list2 = this.paymentMethodTips;
            ArrayList arrayList = new ArrayList();
            Iterator<PaymentMethodTips> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str = it2.next().tips;
                if (str == null || !(!a0.LJJJIL(str))) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return C13LP.LJJLIIIJ(arrayList, "\n", null, null, 0, null, null, 62);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return this.paymentTips;
            }
            throw new C2197108jB();
        }
    }

    public CBIPaymentMethodDetail(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, CBIFlow cBIFlow, CBIFlow cBIFlow2, String str13, List<PaymentMethodTips> list, String str14, CBICheckBox cBICheckBox, HybridInfo hybridInfo, String str15, CBIMarketingInfo cBIMarketingInfo, List<String> list2, String str16, BankCardDetail bankCardDetail, CBIPayLaterInstallmentInfo cBIPayLaterInstallmentInfo) {
        this.paymentMethodToken = str;
        this.isAvailable = bool;
        this.isPrimary = bool2;
        this.showInfoSchema = str2;
        this.methodType = str3;
        this.paymentAmount = str4;
        this.paymentAmountDisplayText = str5;
        this.bindTime = str6;
        this.paymentMethodId = str7;
        this.rawPaymentMethod = str8;
        this.iconUrl = str9;
        this.darkModeIconUrl = str10;
        this.displayName = str11;
        this.model = str12;
        this.bindFlow = cBIFlow;
        this.paymentFlow = cBIFlow2;
        this.paymentTips = str13;
        this.paymentMethodTips = list;
        this.saveDisplayText = str14;
        this.checkbox = cBICheckBox;
        this.hybridInfo = hybridInfo;
        this.pricingPlanId = str15;
        this.marketingInfo = cBIMarketingInfo;
        this.googlePaySupportNetworks = list2;
        this.paymentCurrency = str16;
        this.bankCardDetailV2 = bankCardDetail;
        this.installmentInfo = cBIPayLaterInstallmentInfo;
    }
}
