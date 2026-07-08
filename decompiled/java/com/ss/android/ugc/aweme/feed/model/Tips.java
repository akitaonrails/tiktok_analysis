package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class Tips implements Serializable {

    @C09CT("key_id")
    public Integer key_id = 0;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public String type;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tips(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getKey_id() {
        return this.key_id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final void setKey_id(Integer num) {
        this.key_id = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
