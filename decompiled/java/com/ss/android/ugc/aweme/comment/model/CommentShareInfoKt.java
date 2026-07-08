package com.ss.android.ugc.aweme.comment.model;

import X.C0XLP;
import X.C0XLQ;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentShareInfoKt {
    public static final void updateShareInfo(Comment comment, Aweme aweme) {
        ShareInfo shareInfo;
        String uid;
        if (comment == null || comment.getShareInfo() == null || (shareInfo = aweme.getShareInfo()) == null) {
            return;
        }
        String shareUrl = shareInfo.getShareUrl();
        String str = "";
        if (shareUrl == null) {
            shareUrl = "";
        }
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(shareUrl);
        if (c0xlqLJIIL != null) {
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            c0xlpLJIIJ.LIZJ("share_comment_id", comment.cid);
            User user = comment.user;
            if (user != null && (uid = user.getUid()) != null) {
                str = uid;
            }
            c0xlpLJIIJ.LIZJ("comment_author_id", str);
            comment.getShareInfo().setUrl$common_model_release(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
        }
        comment.getShareInfo().setTitle$common_model_release(aweme.getDesc());
        String descTemplate = comment.getShareInfo().getDescTemplate();
        if (descTemplate != null && descTemplate.length() != 0) {
            CommentShareInfo shareInfo2 = comment.getShareInfo();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(comment.user.getNickname());
            sbLIZ.append(' ');
            sbLIZ.append(comment.getShareInfo().getDescTemplate());
            sbLIZ.append(": ");
            sbLIZ.append(comment.text);
            shareInfo2.setDesc$common_model_release(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
