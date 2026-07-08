package com.ss.android.ugc.aweme.translation.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class ExtraCommentInfo {

    @C09CT("digg_count")
    public final Long diggCount;

    @C09CT("is_first_level_comment")
    public final Boolean isFirstLevelComment;

    public ExtraCommentInfo(Long l, Boolean bool) {
        this.diggCount = l;
        this.isFirstLevelComment = bool;
    }
}
