package com.ss.android.ugc.aweme.social.sticker.repo;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class StoryCelebrationPosterJsonDataProperties implements Serializable {
    public static final int $stable = 0;

    @C09CT("date")
    public final Long date;

    @C09CT("extra")
    public final String extra;

    @C09CT("to_user_id")
    public final String toUserId;

    public StoryCelebrationPosterJsonDataProperties() {
        this(null, null, null);
    }

    public final String cacheKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.date);
        sbLIZ.append(' ');
        sbLIZ.append(this.toUserId);
        sbLIZ.append(' ');
        sbLIZ.append(this.extra);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryCelebrationPosterJsonDataProperties(String str, Long l, String str2) {
        this.extra = str;
        this.date = l;
        this.toUserId = str2;
    }
}
