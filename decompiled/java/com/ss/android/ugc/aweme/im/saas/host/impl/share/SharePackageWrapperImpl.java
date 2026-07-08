package com.ss.android.ugc.aweme.im.saas.host.impl.share;

import X.C1227904rF;
import X.C1351870lHd;
import X.C1370940lmO;
import X.C1599690rjL;
import X.C523420Kfs;
import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.saas.host.api.share.ISharePackageWrapper;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class SharePackageWrapperImpl implements ISharePackageWrapper {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.ISharePackageWrapper
    public final CommentSharePackage LIZ(CommentContent commentContent) {
        String str;
        String str2;
        String str3;
        C1351870lHd c1351870lHd = CommentSharePackage.Companion;
        String awemeId = commentContent.getAwemeId();
        UrlModel coverUrl = commentContent.getCoverUrl();
        int awemeType = commentContent.getAwemeType();
        String commentId = commentContent.getCommentId();
        String comment = commentContent.getComment();
        String authorName = commentContent.getAuthorName();
        String authorId = commentContent.getAuthorId();
        String replyUserName = commentContent.getReplyUserName();
        String replyUserId = commentContent.getReplyUserId();
        UrlModel avatarUrl = commentContent.getAvatarUrl();
        boolean zIsSubComment = commentContent.isSubComment();
        boolean zIsReplyWithVideo = commentContent.isReplyWithVideo();
        int likeCount = commentContent.getLikeCount();
        long replyCount = commentContent.getReplyCount();
        List<UrlModel> imageList = commentContent.getImageList();
        UrlModel replyWithVideoCover = commentContent.getReplyWithVideoCover();
        String replyWithVideoAwemeId = commentContent.getReplyWithVideoAwemeId();
        CommentService.LIZ.getClass();
        String strLIZ = C523420Kfs.LIZ().LIZ(commentContent);
        c1351870lHd.getClass();
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "comment";
        if (commentId == null) {
            str = "";
        } else {
            str = commentId;
        }
        c1370940lmO.LIZIZ = str;
        if (commentId == null) {
            str2 = "";
        } else {
            str2 = commentId;
        }
        c1370940lmO.LIZLLL = str2;
        if (comment == null) {
            str3 = "";
        } else {
            str3 = comment;
        }
        c1370940lmO.LJ = str3;
        c1370940lmO.LJFF = "";
        CommentSharePackage commentSharePackage = new CommentSharePackage(c1370940lmO);
        Bundle bundle = commentSharePackage.extras;
        if (awemeId == null) {
            awemeId = "";
        }
        C786410Ut5.LJJJI("aweme_id", awemeId, bundle);
        if (comment == null) {
            comment = "";
        }
        C786410Ut5.LJJJI("comment_text", comment, bundle);
        if (commentId == null) {
            commentId = "";
        }
        C786410Ut5.LJJJI("comment_id", commentId, bundle);
        if (authorName == null) {
            authorName = "";
        }
        C786410Ut5.LJJJI("comment_author_name", authorName, bundle);
        if (authorId == null) {
            authorId = "";
        }
        C786410Ut5.LJJJI("comment_author_id", authorId, bundle);
        if (replyUserName == null) {
            replyUserName = "";
        }
        C786410Ut5.LJJJI("comment_reply_user_name", replyUserName, bundle);
        if (replyUserId == null) {
            replyUserId = "";
        }
        C786410Ut5.LJJJI("comment_reply_user_id", replyUserId, bundle);
        C786410Ut5.LJJIZ(bundle, "video_cover", coverUrl);
        C786410Ut5.LJJIZ(bundle, "comment_author_avatar_url", avatarUrl);
        bundle.putInt("aweme_type", awemeType);
        bundle.putBoolean("comment_is_sub_comment", zIsSubComment);
        bundle.putBoolean("comment_is_reply_with_video", zIsReplyWithVideo);
        C786410Ut5.LJJIZ(bundle, "comment_reply_video_cover", replyWithVideoCover);
        C786410Ut5.LJJJI("comment_reply_aweme_id", replyWithVideoAwemeId, bundle);
        bundle.putInt("comment_likes", likeCount);
        bundle.putLong("comment_replies", replyCount);
        C1227904rF.LIZ.getClass();
        C786410Ut5.LJJJI("comment_images", C1227904rF.LJI(imageList), bundle);
        C786410Ut5.LJJJI("comment_message_type", strLIZ, bundle);
        return commentSharePackage;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.ISharePackageWrapper
    public final void LIZIZ(GroupSharePackage groupSharePackage, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BaseContact baseContact = (BaseContact) it2.next();
            if ((baseContact instanceof IMContact) && (baseContact instanceof IMUser) && baseContact != null) {
                arrayList.add(baseContact);
            }
        }
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJIILIIL(arrayList, groupSharePackage, IMAnalyticsUtil.LIZIZ.LJII());
    }
}
