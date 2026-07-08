package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.JoinItemList;
import com.bytedance.android.livesdk.game.model.PropSalesTaskBase;
import com.bytedance.android.livesdk.game.model.PropSalesTaskProfit;

/* JADX INFO: loaded from: classes29.dex */
public final class PropSalesParticipationPageResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("join_item_list")
        public JoinItemList joinItemList;

        @C09CT("prop_sale_task_profit")
        public PropSalesTaskProfit propSaleTaskProfit;

        @C09CT("prop_sales_task_base")
        public PropSalesTaskBase propSalesTaskBase;
    }
}
