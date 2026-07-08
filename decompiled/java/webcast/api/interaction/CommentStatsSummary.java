package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.UserCommentDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CommentStatsSummary {

    @C09CT("count")
    public long count;

    @C09CT("has_more")
    public long hasMore;

    @C09CT("identity_type")
    public int identityType;

    @C09CT("title")
    public String title = "";

    @C09CT("user_list")
    public List<UserCommentDetail> userList = new ArrayList();
}
