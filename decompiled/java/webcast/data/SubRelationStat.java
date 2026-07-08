package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SubRelationStat {

    @C09CT("first_sub_ts")
    public long firstSubTs;

    @C09CT("first_subscriber")
    public User firstSubscriber;

    @C09CT("top_subscriber_list")
    public List<User> topSubscriberList = new ArrayList();

    @C09CT("total_sub_period")
    public Map<Long, Long> totalSubPeriod = new LinkedHashMap();
}
