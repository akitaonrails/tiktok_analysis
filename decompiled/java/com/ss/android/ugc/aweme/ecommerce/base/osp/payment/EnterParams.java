package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C03QB;
import X.C03SP;
import X.C09CT;
import X.C13LP;
import X.C755502xF;
import X.C835903Oj;
import X.C887503dR;
import X.EnumC837803Pc;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.OrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentGuaranteeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RetentionDialogInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EnterParams {
    public boolean LIZ;
    public final String LIZIZ;
    public final PaymentGuaranteeInfo LIZJ;
    public String LIZLLL;
    public final boolean LJ;
    public final n LJFF;
    public final String LJI;
    public final Boolean LJII;
    public final String LJIIIIZZ;
    public C03SP LJIIIZ;
    public final Boolean LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final ButtonInfo LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final BillInfoData LJIILLIIL;
    public final BillInfoRequest LJIIZILJ;
    public final PaymentListRequest LJIJ;
    public Summary LJIJI;
    public C755502xF LJIJJ;
    public final String LJIJJLI;
    public final List<String> LJIL;
    public final String LJJ;
    public final String LJJI;
    public final boolean LJJIFFI;
    public final OrderInfo LJJII;
    public final Integer LJJIII;
    public final boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public C03QB LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public EnumC837803Pc LJJIJIIJI;
    public String LJJIJIIJIL;
    public Map<String, String> LJJIJIL;
    public C887503dR LJJIJL;
    public Boolean LJJIJLIJ;
    public Map<String, ? extends Map<String, String>> LJJIL;

    @C09CT("api_duration")
    public final Long apiDuration;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("currency")
    public final String currency;

    @C09CT("current_progress")
    public final Integer currentProgress;

    @C09CT("default_summary")
    public final Summary defaultSummary;

    @C09CT("is_in_bidding_process")
    public final boolean isInBiddingProcess;

    @C09CT("pay_source")
    public final String paySource;

    @C09CT("payment_data")
    public PaymentMethodsData paymentData;

    @C09CT("payment_info")
    public final PaymentInfo paymentInfo;

    @C09CT("payment_price")
    public final List<PaymentPrice> paymentPrice;

    @C09CT("price")
    public final String price;

    @C09CT("retention_dialog_info")
    public final RetentionDialogInfo retentionDialogInfo;

    @C09CT("shipping_address")
    public final Address shippingAddress;

    @C09CT("price_val")
    public final String totalPriceVal;

    @C09CT("total_progress")
    public final Integer totalProgress;

    @C09CT("track_params")
    public final HashMap<String, Object> trackParams;

    public EnterParams() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterParams)) {
            return false;
        }
        EnterParams enterParams = (EnterParams) obj;
        return Intrinsics.LJFF(this.currentProgress, enterParams.currentProgress) && Intrinsics.LJFF(this.totalProgress, enterParams.totalProgress) && Intrinsics.LJFF(this.buttonType, enterParams.buttonType) && Intrinsics.LJFF(this.paymentData, enterParams.paymentData) && Intrinsics.LJFF(this.price, enterParams.price) && this.LIZ == enterParams.LIZ && Intrinsics.LJFF(this.paymentInfo, enterParams.paymentInfo) && Intrinsics.LJFF(this.trackParams, enterParams.trackParams) && Intrinsics.LJFF(this.paymentPrice, enterParams.paymentPrice) && Intrinsics.LJFF(this.defaultSummary, enterParams.defaultSummary) && Intrinsics.LJFF(this.shippingAddress, enterParams.shippingAddress) && Intrinsics.LJFF(this.totalPriceVal, enterParams.totalPriceVal) && Intrinsics.LJFF(this.currency, enterParams.currency) && Intrinsics.LJFF(this.paySource, enterParams.paySource) && Intrinsics.LJFF(this.apiDuration, enterParams.apiDuration) && Intrinsics.LJFF(this.bizType, enterParams.bizType) && Intrinsics.LJFF(this.retentionDialogInfo, enterParams.retentionDialogInfo) && Intrinsics.LJFF(this.LIZIZ, enterParams.LIZIZ) && Intrinsics.LJFF(this.LIZJ, enterParams.LIZJ) && Intrinsics.LJFF(this.LIZLLL, enterParams.LIZLLL) && this.LJ == enterParams.LJ && Intrinsics.LJFF(this.LJFF, enterParams.LJFF) && Intrinsics.LJFF(this.LJI, enterParams.LJI) && Intrinsics.LJFF(this.LJII, enterParams.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, enterParams.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, enterParams.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, enterParams.LJIIJ) && this.LJIIJJI == enterParams.LJIIJJI && Intrinsics.LJFF(this.LJIIL, enterParams.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, enterParams.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, enterParams.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, enterParams.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, enterParams.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, enterParams.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, enterParams.LJIJ) && Intrinsics.LJFF(this.LJIJI, enterParams.LJIJI) && Intrinsics.LJFF(this.LJIJJ, enterParams.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, enterParams.LJIJJLI) && Intrinsics.LJFF(this.LJIL, enterParams.LJIL) && Intrinsics.LJFF(this.LJJ, enterParams.LJJ) && Intrinsics.LJFF(this.LJJI, enterParams.LJJI) && this.LJJIFFI == enterParams.LJJIFFI && Intrinsics.LJFF(this.LJJII, enterParams.LJJII) && Intrinsics.LJFF(this.LJJIII, enterParams.LJJIII) && this.LJJIIJ == enterParams.LJJIIJ && this.LJJIIJZLJL == enterParams.LJJIIJZLJL && Intrinsics.LJFF(this.LJJIIZ, enterParams.LJJIIZ) && this.LJJIIZI == enterParams.LJJIIZI && this.LJJIJ == enterParams.LJJIJ && this.isInBiddingProcess == enterParams.isInBiddingProcess;
    }

    public final boolean LIZ() {
        PaymentMethodsData paymentMethodsData;
        return this.isInBiddingProcess || ((paymentMethodsData = this.paymentData) != null && paymentMethodsData.LJJ());
    }

    public final boolean LIZJ() {
        boolean z = Intrinsics.LJFF(this.paySource, "orderdetail") || Intrinsics.LJFF(this.paySource, "orderlist");
        if (PipoCcdcAddCardRefreshConfigSettings.LIZ().sourceList == null || !(!r0.isEmpty()) || z) {
            return z;
        }
        List<String> list = PipoCcdcAddCardRefreshConfigSettings.LIZ().sourceList;
        return list != null && C13LP.LJJJJ(this.paySource, list);
    }

    public final boolean LIZLLL() {
        return Intrinsics.LJFF(this.LJJI, "1") || Intrinsics.LJFF(this.LJJI, "2");
    }

    public final boolean LJ() {
        return Intrinsics.LJFF(this.LJJI, "1");
    }

    public final boolean LIZIZ() {
        return LIZLLL() && C835903Oj.LIZ();
    }

    public EnterParams(Integer num, Integer num2, Integer num3, PaymentMethodsData paymentMethodsData, String str, boolean z, PaymentInfo paymentInfo, HashMap<String, Object> map, List<PaymentPrice> list, Summary summary, Address address, String str2, String str3, String str4, Long l, Integer num4, RetentionDialogInfo retentionDialogInfo, String str5, PaymentGuaranteeInfo paymentGuaranteeInfo, String str6, boolean z2, n nVar, String str7, Boolean bool, String str8, C03SP c03sp, Boolean bool2, boolean z3, String str9, ButtonInfo buttonInfo, String str10, String str11, BillInfoData billInfoData, BillInfoRequest billInfoRequest, PaymentListRequest paymentListRequest, Summary summary2, C755502xF c755502xF, String str12, List<String> list2, String str13, String str14, boolean z4, OrderInfo orderInfo, Integer num5, boolean z5, boolean z6, C03QB c03qb, boolean z7, boolean z8, boolean z9) {
        this.currentProgress = num;
        this.totalProgress = num2;
        this.buttonType = num3;
        this.paymentData = paymentMethodsData;
        this.price = str;
        this.LIZ = z;
        this.paymentInfo = paymentInfo;
        this.trackParams = map;
        this.paymentPrice = list;
        this.defaultSummary = summary;
        this.shippingAddress = address;
        this.totalPriceVal = str2;
        this.currency = str3;
        this.paySource = str4;
        this.apiDuration = l;
        this.bizType = num4;
        this.retentionDialogInfo = retentionDialogInfo;
        this.LIZIZ = str5;
        this.LIZJ = paymentGuaranteeInfo;
        this.LIZLLL = str6;
        this.LJ = z2;
        this.LJFF = nVar;
        this.LJI = str7;
        this.LJII = bool;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = c03sp;
        this.LJIIJ = bool2;
        this.LJIIJJI = z3;
        this.LJIIL = str9;
        this.LJIILIIL = buttonInfo;
        this.LJIILJJIL = str10;
        this.LJIILL = str11;
        this.LJIILLIIL = billInfoData;
        this.LJIIZILJ = billInfoRequest;
        this.LJIJ = paymentListRequest;
        this.LJIJI = summary2;
        this.LJIJJ = c755502xF;
        this.LJIJJLI = str12;
        this.LJIL = list2;
        this.LJJ = str13;
        this.LJJI = str14;
        this.LJJIFFI = z4;
        this.LJJII = orderInfo;
        this.LJJIII = num5;
        this.LJJIIJ = z5;
        this.LJJIIJZLJL = z6;
        this.LJJIIZ = c03qb;
        this.LJJIIZI = z7;
        this.LJJIJ = z8;
        this.isInBiddingProcess = z9;
    }
}
