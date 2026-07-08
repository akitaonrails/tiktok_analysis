package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OnePageRecommends {

    @C09CT("has_next")
    public boolean hasNext;

    @C09CT("recommend_type")
    public int recommendType;

    @C09CT("type_name")
    public String typeName = "";

    @C09CT("receivers")
    public List<User> receivers = new ArrayList();

    @C09CT("recommend_desc")
    public String recommendDesc = "";

    @C09CT("user_list")
    public List<RecommendedUser> userList = new ArrayList();
}
