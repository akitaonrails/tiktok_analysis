package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentDetail {

    @C09CT("cid")
    public final String cid;

    @C09CT("comment_language")
    public final String commentLanguage;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("text")
    public final String text;

    @C09CT("user")
    public final BulletinCommentUser user;

    public BulletinCommentDetail() {
        this(null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentDetail(cid=");
        sbLIZ.append(this.cid);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", commentLanguage=");
        sbLIZ.append(this.commentLanguage);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinCommentDetail(String str, String str2, BulletinCommentUser bulletinCommentUser, String str3, Integer num) {
        this.cid = str;
        this.text = str2;
        this.user = bulletinCommentUser;
        this.commentLanguage = str3;
        this.status = num;
    }
}
