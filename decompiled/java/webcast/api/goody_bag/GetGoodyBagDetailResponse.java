package webcast.api.goody_bag;

import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCoinDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagSkin;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagUserInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetGoodyBagDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("biz")
        public int biz;

        @C09CT("coin_detail")
        public GoodyBagCoinDetail coinDetail;

        @C09CT("common_detail")
        public GoodyBagCommonDetail commonDetail;

        @C09CT("goody_bag_skin")
        public GoodyBagSkin goodyBagSkin;

        @C09CT("joined")
        public boolean joined;

        @C09CT("participate_method_satisfied")
        public boolean participateMethodSatisfied;

        @C09CT("participate_threshold_satisfied")
        public boolean participateThresholdSatisfied;

        @C09CT("goody_bag_id")
        public String goodyBagId = "";

        @C09CT("audience")
        public List<GoodyBagUserInfo> audience = new ArrayList();
    }
}
