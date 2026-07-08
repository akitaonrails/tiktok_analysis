package tikcast.api.creator_succ;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompanionToolUserData {

    @C09CT("user")
    public User user;

    @C09CT("interactive_detail")
    public String interactiveDetail = "";

    @C09CT("tags")
    public List<TagItem> tags = new ArrayList();

    @C09CT("live_tips")
    public List<LiveTipItem> liveTips = new ArrayList();
}
