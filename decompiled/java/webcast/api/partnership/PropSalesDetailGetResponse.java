package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefAnchor;
import com.bytedance.android.livesdk.game.model.BriefGame;
import com.bytedance.android.livesdk.game.model.PropSalesPreviewProp;
import com.bytedance.android.livesdk.game.model.PropSalesTaskBase;
import com.bytedance.android.livesdk.game.model.PropSalesTaskProfit;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PropSalesDetailGetResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor")
        public BriefAnchor anchor;

        @C09CT("brief_game")
        public BriefGame briefGame;

        @C09CT("brief_task")
        public PropSalesDetailBriefPublisherTask briefTask;

        @C09CT("has_go_gip_lives")
        public boolean hasGoGipLives;

        @C09CT("is_joined")
        public boolean isJoined;

        @C09CT("is_signed")
        public boolean isSigned;

        @C09CT("prop_sale_task_profit")
        public PropSalesTaskProfit propSaleTaskProfit;

        @C09CT("prop_sales_task_base")
        public PropSalesTaskBase propSalesTaskBase;

        @C09CT("game_prop_list")
        public List<PropSalesPreviewProp> gamePropList = new ArrayList();

        @C09CT("fail_reason_list")
        public List<Integer> failReasonList = new ArrayList();
    }
}
