package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PartnershipBriefDrops;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class RewardDropsListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("total")
        public long total;

        @C09CT("joinable_list")
        public List<PartnershipBriefDrops> joinableList = new ArrayList();

        @C09CT("other_list")
        public List<PartnershipBriefDrops> otherList = new ArrayList();

        @C09CT("drops")
        public List<PartnershipDropsV1> drops = new ArrayList();

        @C09CT("priority_region")
        public String priorityRegion = "";

        @C09CT("current_drops_id")
        public String currentDropsId = "";
    }
}
