package com.ss.android.ugc.aweme.comment.model;

import X.C2189821An6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentContextSourceKt {
    public static final Aweme aweme(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            return commonModel.aweme;
        }
        return null;
    }

    public static final String enterFrom(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        String str;
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.enterFrom) == null) {
            return "";
        }
        return str;
    }

    public static final String enterMethod(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            return commonModel.enterMethod;
        }
        return null;
    }

    public static final String eventType(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        String str;
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.eventType) == null) {
            return "";
        }
        return str;
    }

    public static final String fromPage(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            return commonModel.fromPage;
        }
        return null;
    }

    public static final String getFriendsV3TrackScene(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        String str;
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.friendsV3TrackScene) == null) {
            return "";
        }
        return str;
    }

    public static final String getSessionId(CommentContextSource commentContextSource) {
        CommentListModel listModel;
        if (commentContextSource != null && (listModel = commentContextSource.getListModel()) != null) {
            return listModel.getSessionId();
        }
        return null;
    }

    public static final boolean isFriendsV3Feed(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || !commonModel.isFriendsV3Feed()) {
            return false;
        }
        return true;
    }

    public static final boolean isFromTitlePanel(CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str = commonModel.enterMethod;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "title_panel");
    }

    public static final boolean isSocialFeed(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null) {
            return false;
        }
        if (!commonModel.isFriendsSimpleDetail() && !commonModel.isFriendsV3Feed()) {
            return false;
        }
        return true;
    }

    public static final String showCommentPostCid(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        String str;
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.showCommentPostCid) == null) {
            return "";
        }
        return str;
    }

    public static final String tabName(CommentContextSource commentContextSource) {
        C2189821An6 c2189821An6;
        String tabName;
        String str;
        if (commentContextSource != null) {
            CommentCommonModel commonModel = commentContextSource.getCommonModel();
            if (commonModel == null || (str = commonModel.tabName) == null) {
                CommentCommonModel commonModel2 = commentContextSource.getCommonModel();
                if (commonModel2 != null && (c2189821An6 = commonModel2.feedParam) != null && (tabName = c2189821An6.getTabName()) != null) {
                    return tabName;
                }
            } else {
                return str;
            }
        }
        return "";
    }

    public static final boolean videoDescOnly(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            return Intrinsics.LJFF(commonModel.videoDescOnly, Boolean.TRUE);
        }
        return false;
    }
}
