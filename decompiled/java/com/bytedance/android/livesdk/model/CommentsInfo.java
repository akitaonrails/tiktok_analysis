package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CommentsInfo {

    @C09CT("comment_cnt")
    public long commentCnt;

    @C09CT("show_entry")
    public boolean showEntry;

    @C09CT("top_users")
    public List<UserCommentDetail> topUsers = new ArrayList();

    @C09CT("entry_location")
    public String entryLocation = "";

    @C09CT("sub_title")
    public String subTitle = "";
}
