package tikcast.api.star_comment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentQueue {

    @C09CT("queue_version")
    public int queueVersion;

    @C09CT("star_comment_list")
    public List<StarCommentItem> starCommentList = new ArrayList();
}
