package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HomeHeader {

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();

    @C09CT("user_id")
    public long userId;
}
