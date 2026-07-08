package com.ss.android.ugc.aweme.im.lightinteract.impl.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class UserHasBirthdayInfo {

    @C09CT("has_birthday")
    public final Boolean hasBirthday;

    @C09CT("uid")
    public final Long uid;

    public UserHasBirthdayInfo() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserHasBirthdayInfo(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", hasBirthday=");
        sbLIZ.append(this.hasBirthday);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserHasBirthdayInfo(Long l, Boolean bool) {
        this.uid = l;
        this.hasBirthday = bool;
    }
}
