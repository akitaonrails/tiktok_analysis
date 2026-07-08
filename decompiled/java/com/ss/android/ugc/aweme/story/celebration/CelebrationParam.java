package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationParam {

    @C09CT("celebration_type")
    public final int celebrationType;

    @C09CT("extra_params")
    public CelebrationExtraParams extraParams;

    @C09CT("is_today")
    public final boolean isToday;

    @C09CT("unique_id")
    public final String uniqueId;

    @C09CT("use_aweme_cache")
    public final boolean useAwemeCache;

    public CelebrationParam() {
        this(0, false, "", null, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelebrationParam(celebrationType=");
        sbLIZ.append(this.celebrationType);
        sbLIZ.append(", isToday=");
        sbLIZ.append(this.isToday);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.extraParams);
        sbLIZ.append(", useAwemeCache=");
        sbLIZ.append(this.useAwemeCache);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CelebrationParam(int i, boolean z, String str, CelebrationExtraParams celebrationExtraParams, boolean z2) {
        this.celebrationType = i;
        this.isToday = z;
        this.uniqueId = str;
        this.extraParams = celebrationExtraParams;
        this.useAwemeCache = z2;
    }
}
