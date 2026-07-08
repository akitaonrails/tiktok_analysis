package webcast.api.goody_bag;

import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagSkin;

/* JADX INFO: loaded from: classes.dex */
public final class GetRoomGoodyBagResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("base_info")
        public GoodyBagBaseInfo baseInfo;

        @C09CT("goody_bag_id")
        public String goodyBagId = "";

        @C09CT("goody_bag_skin")
        public GoodyBagSkin goodyBagSkin;

        @C09CT("joined")
        public boolean joined;

        @C09CT("participate_method_satisfied")
        public boolean participateMethodSatisfied;

        @C09CT("participate_threshold_satisfied")
        public boolean participateThresholdSatisfied;
    }
}
