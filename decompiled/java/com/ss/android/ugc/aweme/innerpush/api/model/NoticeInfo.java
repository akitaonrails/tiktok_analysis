package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeInfo implements Serializable {

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("type")
    public final Integer type;

    public NoticeInfo() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NoticeInfo(Integer num, Long l) {
        this.type = num;
        this.createTime = l;
    }
}
