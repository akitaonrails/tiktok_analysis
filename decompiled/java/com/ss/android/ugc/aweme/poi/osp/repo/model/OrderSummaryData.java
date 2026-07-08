package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import X.InterfaceC1192660h8q;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OrderSummaryData extends BaseComponentData implements Serializable {
    public final String defaultPriceKey = "default_pricing_plan_id";

    @C09CT("order_summary_total_price")
    public final PriceItem orderSummaryTotalPrice;

    @C09CT("price_breakdowns")
    public final Map<String, PriceBreakdownData> priceBreakDownList;

    @C09CT("save_amount_tag")
    public final String saveAmount;

    @C09CT("sub_prices")
    public final List<PriceItem> subPrices;

    @C09CT("total_price")
    public final PriceItem totalPrice;

    public final OrderSummaryData copy(PriceItem priceItem, List<PriceItem> list, String str, PriceItem priceItem2, Map<String, PriceBreakdownData> map) {
        return new OrderSummaryData(priceItem, list, str, priceItem2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSummaryData)) {
            return false;
        }
        OrderSummaryData orderSummaryData = (OrderSummaryData) obj;
        return Intrinsics.LJFF(this.totalPrice, orderSummaryData.totalPrice) && Intrinsics.LJFF(this.subPrices, orderSummaryData.subPrices) && Intrinsics.LJFF(this.saveAmount, orderSummaryData.saveAmount) && Intrinsics.LJFF(this.orderSummaryTotalPrice, orderSummaryData.orderSummaryTotalPrice) && Intrinsics.LJFF(this.priceBreakDownList, orderSummaryData.priceBreakDownList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        PriceItem priceItem = this.totalPrice;
        int iHashCode = (priceItem == null ? 0 : priceItem.hashCode()) * 31;
        List<PriceItem> list = this.subPrices;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.saveAmount;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PriceItem priceItem2 = this.orderSummaryTotalPrice;
        int iHashCode4 = (iHashCode3 + (priceItem2 == null ? 0 : priceItem2.hashCode())) * 31;
        Map<String, PriceBreakdownData> map = this.priceBreakDownList;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderSummaryData(totalPrice=");
        sbLIZ.append(this.totalPrice);
        sbLIZ.append(", subPrices=");
        sbLIZ.append(this.subPrices);
        sbLIZ.append(", saveAmount=");
        sbLIZ.append(this.saveAmount);
        sbLIZ.append(", orderSummaryTotalPrice=");
        sbLIZ.append(this.orderSummaryTotalPrice);
        sbLIZ.append(", priceBreakDownList=");
        sbLIZ.append(this.priceBreakDownList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PriceItem getOrderSummaryTotalPrice() {
        return this.orderSummaryTotalPrice;
    }

    public final Map<String, PriceBreakdownData> getPriceBreakDownList() {
        return this.priceBreakDownList;
    }

    public final String getSaveAmount() {
        return this.saveAmount;
    }

    public final List<PriceItem> getSubPrices() {
        return this.subPrices;
    }

    public final PriceItem getTotalPrice() {
        return this.totalPrice;
    }

    public final PriceBreakdownData getPriceBreakdownData(String str) {
        PriceBreakdownData priceBreakdownData;
        PriceBreakdownData priceBreakdownData2;
        Map<String, PriceBreakdownData> map = this.priceBreakDownList;
        if (map == null || (priceBreakdownData2 = map.get(str)) == null) {
            Map<String, PriceBreakdownData> map2 = this.priceBreakDownList;
            if (map2 == null || (priceBreakdownData = map2.get(this.defaultPriceKey)) == null) {
                return new PriceBreakdownData(this.totalPrice, this.subPrices, this.saveAmount, this.orderSummaryTotalPrice);
            }
            return priceBreakdownData;
        }
        return priceBreakdownData2;
    }

    public final PriceBreakdownData getPriceBreakdownData(InterfaceC1192660h8q interfaceC1192660h8q) {
        String strLJIIIZ;
        if (interfaceC1192660h8q == null || (strLJIIIZ = interfaceC1192660h8q.LJIIIZ()) == null) {
            strLJIIIZ = "";
        }
        return getPriceBreakdownData(strLJIIIZ);
    }

    public OrderSummaryData(PriceItem priceItem, List<PriceItem> list, String str, PriceItem priceItem2, Map<String, PriceBreakdownData> map) {
        this.totalPrice = priceItem;
        this.subPrices = list;
        this.saveAmount = str;
        this.orderSummaryTotalPrice = priceItem2;
        this.priceBreakDownList = map;
    }
}
