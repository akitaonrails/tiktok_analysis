package com.ss.android.ugc.aweme.shortvideo.model;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CommentUtils {
    public static final int $stable = 0;
    public static final CommentUtils INSTANCE = new CommentUtils();

    public static final boolean needMob(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !Intrinsics.LJFF("comment_reply", shortVideoContext.shootWay) || shortVideoContext.LJFF() == null) {
            return false;
        }
        return true;
    }

    public static final boolean needMob(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !Intrinsics.LJFF("comment_reply", videoPublishEditModel.mShootWay) || videoPublishEditModel.getCommentVideoModel() == null) {
            return false;
        }
        return true;
    }
}
