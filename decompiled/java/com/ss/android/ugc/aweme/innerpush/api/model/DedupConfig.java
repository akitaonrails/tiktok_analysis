package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class DedupConfig implements Serializable {

    @C09CT("dedup_key")
    public String dedupKey;

    @C09CT("dedup_type")
    public String deduptype;

    public DedupConfig() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DedupConfig(deduptype=");
        sbLIZ.append(this.deduptype);
        sbLIZ.append(", dedupKey=");
        sbLIZ.append(this.dedupKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setDedupKey(String str) {
        this.dedupKey = str;
    }

    public final void setDeduptype(String str) {
        this.deduptype = str;
    }

    public DedupConfig(String str, String str2) {
        this.deduptype = str;
        this.dedupKey = str2;
    }
}
