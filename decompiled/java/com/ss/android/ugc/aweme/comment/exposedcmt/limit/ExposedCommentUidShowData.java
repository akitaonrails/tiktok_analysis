package com.ss.android.ugc.aweme.comment.exposedcmt.limit;

import X.C09CT;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentUidShowData implements Serializable {
    public static final int $stable = 8;

    @C09CT("unclicked_exposed_comment_aid")
    public final HashMap<String, Set<String>> unclikedCommentUid;

    public ExposedCommentUidShowData() {
        this(new HashMap());
    }

    public ExposedCommentUidShowData(HashMap<String, Set<String>> map) {
        this.unclikedCommentUid = map;
    }
}
