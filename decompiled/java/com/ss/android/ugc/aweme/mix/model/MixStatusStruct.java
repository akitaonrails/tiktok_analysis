package com.ss.android.ugc.aweme.mix.model;

import X.C09CT;
import X.C1169710gXp;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class MixStatusStruct implements Serializable {
    public static final C1169710gXp Companion = new Object() { // from class: X.0gXp
    };

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public MixStatusStruct() {
    }

    public final int getStatus() {
        return this.status;
    }

    public MixStatusStruct(int i) {
        this.status = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
