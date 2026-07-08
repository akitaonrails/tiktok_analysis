package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.SalesCpsByContentProfit;

/* JADX INFO: loaded from: classes29.dex */
public final class GetContentSalesCPSProfitResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("profit")
        public SalesCpsByContentProfit profit;
    }
}
