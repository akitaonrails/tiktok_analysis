package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetResourceDescription {

    @C09CT("bundle")
    public final String bundle;

    @C09CT("channel")
    public final String channel;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetResourceDescription(channel=");
        sbLIZ.append(this.channel);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.bundle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakPetResourceDescription() {
        this("", "");
    }

    public StreakPetResourceDescription(String str, String str2) {
        this.channel = str;
        this.bundle = str2;
    }
}
