package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CommentModelExtensionKt {
    public static final boolean isDataValid(CommentVideoModel commentVideoModel) {
        if (commentVideoModel == null || TextUtils.isEmpty(commentVideoModel.getUserName()) || TextUtils.isEmpty(commentVideoModel.getCommentMsg()) || TextUtils.isEmpty(commentVideoModel.getAwemeId()) || TextUtils.isEmpty(commentVideoModel.getUserId())) {
            return false;
        }
        return true;
    }
}
