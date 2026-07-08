package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreLynxAuthor {

    @C09CT("avatar_thumb")
    public final ExploreLynxUrlModel avatarThumb;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("uid")
    public final String uid;

    public ExploreLynxAuthor() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxAuthor)) {
            return false;
        }
        ExploreLynxAuthor exploreLynxAuthor = (ExploreLynxAuthor) obj;
        return Intrinsics.LJFF(this.nickname, exploreLynxAuthor.nickname) && Intrinsics.LJFF(this.avatarThumb, exploreLynxAuthor.avatarThumb) && Intrinsics.LJFF(this.uid, exploreLynxAuthor.uid);
    }

    public final int hashCode() {
        String str = this.nickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ExploreLynxUrlModel exploreLynxUrlModel = this.avatarThumb;
        int iHashCode2 = (iHashCode + (exploreLynxUrlModel == null ? 0 : exploreLynxUrlModel.hashCode())) * 31;
        String str2 = this.uid;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLynxAuthor(nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLynxAuthor(String str, ExploreLynxUrlModel exploreLynxUrlModel, String str2) {
        this.nickname = str;
        this.avatarThumb = exploreLynxUrlModel;
        this.uid = str2;
    }
}
