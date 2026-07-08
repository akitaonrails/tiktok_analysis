package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Author {

    @C09CT("avatar")
    public final ImageBlock avatar;

    @C09CT("avatar_thumb")
    public final ImageBlock avatarThumb;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_user_id")
    public final String secUserId;

    public Author() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return Intrinsics.LJFF(this.id, author.id) && Intrinsics.LJFF(this.secUserId, author.secUserId) && Intrinsics.LJFF(this.nickname, author.nickname) && Intrinsics.LJFF(this.avatar, author.avatar) && Intrinsics.LJFF(this.avatarThumb, author.avatarThumb);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUserId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageBlock imageBlock = this.avatar;
        int iHashCode4 = (iHashCode3 + (imageBlock == null ? 0 : imageBlock.hashCode())) * 31;
        ImageBlock imageBlock2 = this.avatarThumb;
        return iHashCode4 + (imageBlock2 != null ? imageBlock2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Author(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.secUserId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Author(String str, String str2, String str3, ImageBlock imageBlock, ImageBlock imageBlock2) {
        this.id = str;
        this.secUserId = str2;
        this.nickname = str3;
        this.avatar = imageBlock;
        this.avatarThumb = imageBlock2;
    }
}
