package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendedUser {

    @C09CT("is_online")
    public boolean isOnline;

    @C09CT("recommendation_tag_name")
    public List<String> recommendationTagName = new ArrayList();

    @C09CT("recommendation_tag_text")
    public List<String> recommendationTagText = new ArrayList();

    @C09CT("user")
    public User user;
}
