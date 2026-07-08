package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TradeQueryResponse {

    @C09CT("action_infos")
    public final List<TradeQueryActionInfo> actionInfos;

    @C09CT("amount")
    public final String amount;

    @C09CT("charge_details")
    public final TradeQueryChargeDetails chargeDetails;

    @C09CT("currency")
    public final String currency;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_content")
    public final String errorContent;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("logid")
    public final String logId;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final OrderStatus status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeQueryResponse)) {
            return false;
        }
        TradeQueryResponse tradeQueryResponse = (TradeQueryResponse) obj;
        return this.status == tradeQueryResponse.status && Intrinsics.LJFF(this.errorCode, tradeQueryResponse.errorCode) && Intrinsics.LJFF(this.errorMessage, tradeQueryResponse.errorMessage) && Intrinsics.LJFF(this.errorContent, tradeQueryResponse.errorContent) && Intrinsics.LJFF(this.logId, tradeQueryResponse.logId) && Intrinsics.LJFF(this.amount, tradeQueryResponse.amount) && Intrinsics.LJFF(this.currency, tradeQueryResponse.currency) && Intrinsics.LJFF(this.pipoErrorAction, tradeQueryResponse.pipoErrorAction) && Intrinsics.LJFF(this.actionInfos, tradeQueryResponse.actionInfos) && Intrinsics.LJFF(this.chargeDetails, tradeQueryResponse.chargeDetails);
    }

    public final int hashCode() {
        OrderStatus orderStatus = this.status;
        int iHashCode = (orderStatus == null ? 0 : orderStatus.hashCode()) * 31;
        String str = this.errorCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorContent;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amount;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pipoErrorAction;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<TradeQueryActionInfo> list = this.actionInfos;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        TradeQueryChargeDetails tradeQueryChargeDetails = this.chargeDetails;
        return iHashCode9 + (tradeQueryChargeDetails != null ? tradeQueryChargeDetails.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TradeQueryResponse(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.errorMessage);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.errorContent);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(", pipoErrorAction=");
        sbLIZ.append(this.pipoErrorAction);
        sbLIZ.append(", actionInfos=");
        sbLIZ.append(this.actionInfos);
        sbLIZ.append(", chargeDetails=");
        sbLIZ.append(this.chargeDetails);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TradeQueryResponse(OrderStatus orderStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<TradeQueryActionInfo> list, TradeQueryChargeDetails tradeQueryChargeDetails) {
        this.status = orderStatus;
        this.errorCode = str;
        this.errorMessage = str2;
        this.errorContent = str3;
        this.logId = str4;
        this.amount = str5;
        this.currency = str6;
        this.pipoErrorAction = str7;
        this.actionInfos = list;
        this.chargeDetails = tradeQueryChargeDetails;
    }
}
