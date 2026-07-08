package webcast.api.partnership;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RewardDropsListV2Request {

    @C09CT("limit")
    public int limit;

    @C09CT("offset")
    public int offset;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("drops_status_list")
    public List<Integer> dropsStatusList = new ArrayList();
}
