package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class IMEffect implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("weight")
    public final double weight;

    public IMEffect() {
        this("", 0.0d);
    }

    public IMEffect(String str, double d) {
        this.id = str;
        this.weight = d;
    }
}
