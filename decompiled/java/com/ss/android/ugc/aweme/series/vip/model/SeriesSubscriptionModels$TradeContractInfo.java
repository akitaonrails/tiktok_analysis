package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SeriesSubscriptionModels$TradeContractInfo {

    @C09CT("amount")
    public final Long amount;

    @C09CT("billing_mode")
    public final SeriesSubscriptionModels$SubBillingMode billingMode;

    @C09CT("contract_id")
    public final String contractId;

    @C09CT("currency")
    public final String currency;

    @C09CT("current_period")
    public final Integer currentPeriod;

    @C09CT("next_deduct_time")
    public final Long nextDeductTime;

    @C09CT("period_end_time")
    public final Long periodEndTime;

    @C09CT("period_start_time")
    public final Long periodStartTime;

    @C09CT("period_type")
    public final SeriesSubscriptionModels$SubPeriodType periodType;

    @C09CT("sku_id")
    public final Long skuId;

    @C09CT("spu_id")
    public final Long spuId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final SeriesSubscriptionModels$ContractOrderStatus status;

    @C09CT("target_id")
    public final String targetId;

    @C09CT("target_type")
    public final SeriesSubscriptionModels$SubTargetType targetType;

    @C09CT("total_period")
    public final Integer totalPeriod;

    public SeriesSubscriptionModels$TradeContractInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$TradeContractInfo)) {
            return false;
        }
        SeriesSubscriptionModels$TradeContractInfo seriesSubscriptionModels$TradeContractInfo = (SeriesSubscriptionModels$TradeContractInfo) obj;
        return Intrinsics.LJFF(this.contractId, seriesSubscriptionModels$TradeContractInfo.contractId) && this.targetType == seriesSubscriptionModels$TradeContractInfo.targetType && Intrinsics.LJFF(this.targetId, seriesSubscriptionModels$TradeContractInfo.targetId) && Intrinsics.LJFF(this.spuId, seriesSubscriptionModels$TradeContractInfo.spuId) && Intrinsics.LJFF(this.skuId, seriesSubscriptionModels$TradeContractInfo.skuId) && this.billingMode == seriesSubscriptionModels$TradeContractInfo.billingMode && this.periodType == seriesSubscriptionModels$TradeContractInfo.periodType && Intrinsics.LJFF(this.amount, seriesSubscriptionModels$TradeContractInfo.amount) && Intrinsics.LJFF(this.currency, seriesSubscriptionModels$TradeContractInfo.currency) && Intrinsics.LJFF(this.currentPeriod, seriesSubscriptionModels$TradeContractInfo.currentPeriod) && Intrinsics.LJFF(this.totalPeriod, seriesSubscriptionModels$TradeContractInfo.totalPeriod) && Intrinsics.LJFF(this.periodStartTime, seriesSubscriptionModels$TradeContractInfo.periodStartTime) && Intrinsics.LJFF(this.periodEndTime, seriesSubscriptionModels$TradeContractInfo.periodEndTime) && Intrinsics.LJFF(this.nextDeductTime, seriesSubscriptionModels$TradeContractInfo.nextDeductTime) && this.status == seriesSubscriptionModels$TradeContractInfo.status;
    }

    public final int hashCode() {
        String str = this.contractId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SeriesSubscriptionModels$SubTargetType seriesSubscriptionModels$SubTargetType = this.targetType;
        int iHashCode2 = (iHashCode + (seriesSubscriptionModels$SubTargetType == null ? 0 : seriesSubscriptionModels$SubTargetType.hashCode())) * 31;
        String str2 = this.targetId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.spuId;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.skuId;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        SeriesSubscriptionModels$SubBillingMode seriesSubscriptionModels$SubBillingMode = this.billingMode;
        int iHashCode6 = (iHashCode5 + (seriesSubscriptionModels$SubBillingMode == null ? 0 : seriesSubscriptionModels$SubBillingMode.hashCode())) * 31;
        SeriesSubscriptionModels$SubPeriodType seriesSubscriptionModels$SubPeriodType = this.periodType;
        int iHashCode7 = (iHashCode6 + (seriesSubscriptionModels$SubPeriodType == null ? 0 : seriesSubscriptionModels$SubPeriodType.hashCode())) * 31;
        Long l3 = this.amount;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.currentPeriod;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalPeriod;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.periodStartTime;
        int iHashCode12 = (iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.periodEndTime;
        int iHashCode13 = (iHashCode12 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.nextDeductTime;
        int iHashCode14 = (iHashCode13 + (l6 == null ? 0 : l6.hashCode())) * 31;
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus = this.status;
        return iHashCode14 + (seriesSubscriptionModels$ContractOrderStatus != null ? seriesSubscriptionModels$ContractOrderStatus.hashCode() : 0);
    }

    public final String toString() {
        return "TradeContractInfo(contractId=" + this.contractId + ", targetType=" + this.targetType + ", targetId=" + this.targetId + ", spuId=" + this.spuId + ", skuId=" + this.skuId + ", billingMode=" + this.billingMode + ", periodType=" + this.periodType + ", amount=" + this.amount + ", currency=" + this.currency + ", currentPeriod=" + this.currentPeriod + ", totalPeriod=" + this.totalPeriod + ", periodStartTime=" + this.periodStartTime + ", periodEndTime=" + this.periodEndTime + ", nextDeductTime=" + this.nextDeductTime + ", status=" + this.status + ')';
    }

    public SeriesSubscriptionModels$TradeContractInfo(String str, SeriesSubscriptionModels$SubTargetType seriesSubscriptionModels$SubTargetType, String str2, Long l, Long l2, SeriesSubscriptionModels$SubBillingMode seriesSubscriptionModels$SubBillingMode, SeriesSubscriptionModels$SubPeriodType seriesSubscriptionModels$SubPeriodType, Long l3, String str3, Integer num, Integer num2, Long l4, Long l5, Long l6, SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus) {
        this.contractId = str;
        this.targetType = seriesSubscriptionModels$SubTargetType;
        this.targetId = str2;
        this.spuId = l;
        this.skuId = l2;
        this.billingMode = seriesSubscriptionModels$SubBillingMode;
        this.periodType = seriesSubscriptionModels$SubPeriodType;
        this.amount = l3;
        this.currency = str3;
        this.currentPeriod = num;
        this.totalPeriod = num2;
        this.periodStartTime = l4;
        this.periodEndTime = l5;
        this.nextDeductTime = l6;
        this.status = seriesSubscriptionModels$ContractOrderStatus;
    }
}
