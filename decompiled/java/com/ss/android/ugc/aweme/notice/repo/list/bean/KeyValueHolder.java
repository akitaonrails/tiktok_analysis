package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyValueHolder {

    @C09CT("key")
    public String key;

    @C09CT("value")
    public String value;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyValueHolder(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KeyValueHolder() {
        this("", "");
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public KeyValueHolder(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
