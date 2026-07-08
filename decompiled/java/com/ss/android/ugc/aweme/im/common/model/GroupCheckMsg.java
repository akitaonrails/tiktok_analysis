package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCheckMsg implements Serializable {

    @C09CT("check_enum")
    public Integer checkEnum;

    @C09CT("invalid_members")
    public List<Long> invalidMembers;

    @C09CT("status_code")
    public Integer statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupCheckMsg(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", invalidMembers=");
        sbLIZ.append(this.invalidMembers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getCheckEnum() {
        return this.checkEnum;
    }

    public final List<Long> getInvalidMembers() {
        return this.invalidMembers;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setCheckEnum(Integer num) {
        this.checkEnum = num;
    }

    public final void setInvalidMembers(List<Long> list) {
        this.invalidMembers = list;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
