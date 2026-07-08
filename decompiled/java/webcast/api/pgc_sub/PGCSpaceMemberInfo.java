package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSpaceMemberInfo {

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();

    @C09CT("sub_start_time_sec")
    public long subStartTimeSec;

    @C09CT("user_info")
    public User userInfo;
}
