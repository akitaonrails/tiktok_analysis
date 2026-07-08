package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetSuperFanMilestoneInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("can_send_goody_bag")
        public boolean canSendGoodyBag;

        @C09CT("total_amount_cents")
        public long totalAmountCents;

        @C09CT("triggered_users")
        public List<User> triggeredUsers = new ArrayList();

        @C09CT("goody_bag_schema")
        public String goodyBagSchema = "";

        @C09CT("currency")
        public String currency = "";
    }
}
