package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C1AF0;
import X.C770702zh;
import android.content.Context;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class CreditInfo {

    @C09CT("credit_balance_amount")
    public Amount creditBalanceAmount;

    @C09CT("credit_freeze_amount")
    public Amount creditFreezeAmount;

    @C09CT("credit_payment_amount")
    public Amount creditPaymentAmount;

    @C09CT("credit_payment_method")
    public PaymentMethod creditPaymentMethod;

    @C09CT("credit_payment_type")
    public String creditPaymentType;

    @C09CT("first_payment_method_amount_title")
    public String firstPaymentMethodAmountTitle;

    @C09CT("non_time_limited_balance_amount")
    public Amount nonTimeLimitedBalanceAmount;

    @C09CT("payment_methods")
    public List<PaymentMethod> paymentMethods;

    @C09CT("popup_info")
    public PopupInfo popupInfo;

    @C09CT("recent_will_expire_balance_amount")
    public ExpireAmount recentWillExpireBalanceAmount;

    @C09CT("recommend_method_show_count")
    public Integer recommendMethodShowCount;

    @C09CT("recommend_payment_methods")
    public List<PaymentMethod> recommendPaymentMethods;

    @C09CT("remained_amount")
    public Amount remainedAmount;

    @C09CT("second_payment_method_amount_title")
    public String secondPaymentMethodAmountTitle;

    @C09CT("stored_methods")
    public List<PaymentMethod> storedMethods;

    @C09CT("time_limited_balance_amount")
    public Amount timeLimitedBalanceAmount;

    public CreditInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String LIZ(Context context) {
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "";
        if (context == null) {
            return "";
        }
        try {
            ExpireAmount expireAmount = this.recentWillExpireBalanceAmount;
            if (expireAmount != null) {
                str = expireAmount.expireTime;
            } else {
                str = null;
            }
            if (C770702zh.LIZIZ(str)) {
                ExpireAmount expireAmount2 = this.recentWillExpireBalanceAmount;
                if (expireAmount2 != null) {
                    str2 = expireAmount2.priceStr;
                } else {
                    str2 = null;
                }
                if (C770702zh.LIZIZ(str2)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ExpireAmount expireAmount3 = this.recentWillExpireBalanceAmount;
                    if (expireAmount3 != null && (str7 = expireAmount3.expireTime) != null) {
                        j = CastLongProtector.parseLong(str7);
                    } else {
                        j = 0;
                    }
                    long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    if (j2 > jCurrentTimeMillis) {
                        long days = TimeUnit.MILLISECONDS.toDays(j2 - jCurrentTimeMillis);
                        if (days >= 5) {
                            String string = context.getString(2131857264);
                            ExpireAmount expireAmount4 = this.recentWillExpireBalanceAmount;
                            if (expireAmount4 != null && (str6 = expireAmount4.priceStr) != null) {
                                str8 = str6;
                            }
                            return u.LJJIFFI(u.LJJIFFI(string, "{amount}", str8, false), "{time}", new BDDateFormat("MMM DD").LIZIZ(j2, Locale.getDefault()), false);
                        }
                        if (days > 1) {
                            String string2 = context.getString(2131857263);
                            ExpireAmount expireAmount5 = this.recentWillExpireBalanceAmount;
                            if (expireAmount5 != null && (str5 = expireAmount5.priceStr) != null) {
                                str8 = str5;
                            }
                            return u.LJJIFFI(u.LJJIFFI(string2, "{amount}", str8, false), "{count}", String.valueOf(days), false);
                        }
                        if (days > 0) {
                            String string3 = context.getString(2131857262);
                            ExpireAmount expireAmount6 = this.recentWillExpireBalanceAmount;
                            if (expireAmount6 != null && (str4 = expireAmount6.priceStr) != null) {
                                str8 = str4;
                            }
                            return u.LJJIFFI(string3, "{amount}", str8, false);
                        }
                        String string4 = context.getString(2131857265);
                        ExpireAmount expireAmount7 = this.recentWillExpireBalanceAmount;
                        if (expireAmount7 != null && (str3 = expireAmount7.priceStr) != null) {
                            str8 = str3;
                        }
                        return u.LJJIFFI(string4, "{amount}", str8, false);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return null;
    }

    public static CreditInfo LIZIZ(CreditInfo creditInfo, List list, List list2) {
        return new CreditInfo(creditInfo.creditPaymentMethod, creditInfo.creditPaymentType, creditInfo.creditPaymentAmount, creditInfo.creditBalanceAmount, creditInfo.creditFreezeAmount, creditInfo.remainedAmount, list, creditInfo.storedMethods, list2, creditInfo.recommendMethodShowCount, creditInfo.nonTimeLimitedBalanceAmount, creditInfo.timeLimitedBalanceAmount, creditInfo.recentWillExpireBalanceAmount, creditInfo.popupInfo, creditInfo.firstPaymentMethodAmountTitle, creditInfo.secondPaymentMethodAmountTitle);
    }

    public CreditInfo(PaymentMethod paymentMethod, String str, Amount amount, Amount amount2, Amount amount3, Amount amount4, List<PaymentMethod> list, List<PaymentMethod> list2, List<PaymentMethod> list3, Integer num, Amount amount5, Amount amount6, ExpireAmount expireAmount, PopupInfo popupInfo, String str2, String str3) {
        this.creditPaymentMethod = paymentMethod;
        this.creditPaymentType = str;
        this.creditPaymentAmount = amount;
        this.creditBalanceAmount = amount2;
        this.creditFreezeAmount = amount3;
        this.remainedAmount = amount4;
        this.paymentMethods = list;
        this.storedMethods = list2;
        this.recommendPaymentMethods = list3;
        this.recommendMethodShowCount = num;
        this.nonTimeLimitedBalanceAmount = amount5;
        this.timeLimitedBalanceAmount = amount6;
        this.recentWillExpireBalanceAmount = expireAmount;
        this.popupInfo = popupInfo;
        this.firstPaymentMethodAmountTitle = str2;
        this.secondPaymentMethodAmountTitle = str3;
    }
}
