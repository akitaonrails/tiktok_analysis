package com.ss.android.ugc.aweme.feed.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CommentLikeListParams {
    public Aweme aweme;
    public List<RelationLabelUser> userList;

    public CommentLikeListParams(Aweme aweme, List<RelationLabelUser> list) {
        this.aweme = aweme;
        this.userList = list;
    }
}
