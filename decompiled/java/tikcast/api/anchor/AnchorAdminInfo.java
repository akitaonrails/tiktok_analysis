package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorAdminInfo {

    @C09CT("recent_watch_status")
    public int recentWatchStatus;

    @C09CT("user_info")
    public User userInfo;

    @C09CT("permissions")
    public Map<Integer, Integer> permissions = new LinkedHashMap();

    @C09CT("user_tag")
    public String userTag = "";

    @C09CT("tag_key")
    public String tagKey = "";
}
