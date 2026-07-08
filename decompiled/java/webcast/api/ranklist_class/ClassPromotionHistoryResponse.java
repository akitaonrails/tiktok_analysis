package webcast.api.ranklist_class;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ClassPromotionHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("promotion_items")
        public List<PromotionItem> promotionItems = new ArrayList();
    }

    public static final class PromotionItem {

        @C09CT("after_class")
        public int afterClass;

        @C09CT("after_star")
        public long afterStar;

        @C09CT("before_class")
        public int beforeClass;

        @C09CT("before_star")
        public long beforeStar;

        @C09CT("promotion_res")
        public long promotionRes;

        @C09CT("promotion_time")
        public long promotionTime;

        @C09CT("promotion_type")
        public int promotionType;

        @C09CT("right_content")
        public Text rightContent;
    }
}
