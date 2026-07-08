package com.ss.android.ugc.aweme.interactive.task.minigames;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class IMGameImageURL implements Serializable {
    public static final int $stable = 0;

    @C09CT("expiry_timestamp")
    public final Long expiryTimestamp;

    @C09CT("url")
    public final String url;

    public IMGameImageURL() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMGameImageURL(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", expiryTimestamp=");
        sbLIZ.append(this.expiryTimestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMGameImageURL(String str, Long l) {
        this.url = str;
        this.expiryTimestamp = l;
    }
}
