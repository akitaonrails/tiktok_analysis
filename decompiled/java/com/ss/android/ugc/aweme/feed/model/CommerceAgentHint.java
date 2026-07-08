package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentHint implements Serializable {

    @C09CT("jump_model")
    public final String jumpModel;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public CommerceAgentHint() {
        this(null, 0, null);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.jumpModel;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentHint(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", jumpModel=");
        sbLIZ.append(this.jumpModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommerceAgentHint(String str, Integer num, String str2) {
        this.text = str;
        this.type = num;
        this.jumpModel = str2;
    }
}
