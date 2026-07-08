package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class ChallengeExtraAttrStruct implements Serializable {

    @C09CT("is_live")
    public final boolean isLive;

    public ChallengeExtraAttrStruct() {
        this(false);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public ChallengeExtraAttrStruct(boolean z) {
        this.isLive = z;
    }
}
