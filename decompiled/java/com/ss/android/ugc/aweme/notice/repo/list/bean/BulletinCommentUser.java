package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;

/* JADX INFO: loaded from: classes19.dex */
public final class BulletinCommentUser {

    @C09CT("avatar_larger")
    public final TuxImageModel avatarLarger;

    @C09CT("avatar_medium")
    public final TuxImageModel avatarMedium;

    @C09CT("avatar_thumb")
    public final TuxImageModel avatarThumb;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("uid")
    public final String uid;

    public BulletinCommentUser() {
        this(null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentUser(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatarLarger=");
        sbLIZ.append(this.avatarLarger);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", avatarMedium=");
        sbLIZ.append(this.avatarMedium);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinCommentUser(String str, String str2, TuxImageModel tuxImageModel, TuxImageModel tuxImageModel2, TuxImageModel tuxImageModel3) {
        this.uid = str;
        this.nickname = str2;
        this.avatarLarger = tuxImageModel;
        this.avatarThumb = tuxImageModel2;
        this.avatarMedium = tuxImageModel3;
    }
}
