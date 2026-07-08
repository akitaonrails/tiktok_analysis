package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class RewardDropsListV2Response {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("current_drops")
        public PartnershipDropsV1 currentDrops;

        @C09CT("ongoing_drops_list")
        public List<PartnershipDropsV1> ongoingDropsList = new ArrayList();

        @C09CT("upcoming_drops_list")
        public List<PartnershipDropsV1> upcomingDropsList = new ArrayList();

        @C09CT("ended_drops_list")
        public List<PartnershipDropsV1> endedDropsList = new ArrayList();

        @C09CT("priority_region")
        public String priorityRegion = "";
    }
}
