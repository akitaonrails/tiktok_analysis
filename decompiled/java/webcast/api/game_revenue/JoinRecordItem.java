package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class JoinRecordItem {

    @C09CT("join_time")
    public long joinTime;

    @C09CT("role_names")
    public List<String> roleNames = new ArrayList();

    @C09CT("user")
    public User user;
}
