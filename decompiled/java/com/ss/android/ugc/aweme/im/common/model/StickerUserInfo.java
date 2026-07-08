package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerUserInfo implements Serializable {

    @C09CT("creator_nickname")
    public final String creatorNickname;

    @C09CT("creator_id")
    public final Long creatorUid;

    @C09CT("creator_username")
    public final String creatorUsername;

    public StickerUserInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerUserInfo)) {
            return false;
        }
        StickerUserInfo stickerUserInfo = (StickerUserInfo) obj;
        return Intrinsics.LJFF(this.creatorUid, stickerUserInfo.creatorUid) && Intrinsics.LJFF(this.creatorNickname, stickerUserInfo.creatorNickname) && Intrinsics.LJFF(this.creatorUsername, stickerUserInfo.creatorUsername);
    }

    public int hashCode() {
        Long l = this.creatorUid;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.creatorNickname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.creatorUsername;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerUserInfo(creatorUid=");
        sbLIZ.append(this.creatorUid);
        sbLIZ.append(", creatorNickname=");
        sbLIZ.append(this.creatorNickname);
        sbLIZ.append(", creatorUsername=");
        sbLIZ.append(this.creatorUsername);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerUserInfo(Long l, String str, String str2) {
        this.creatorUid = l;
        this.creatorNickname = str;
        this.creatorUsername = str2;
    }
}
