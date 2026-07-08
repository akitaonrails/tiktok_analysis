package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ChallengeElasticLayer implements Serializable {

    @C09CT("desc")
    public final String desc;

    @C09CT("tag")
    public final String tag;

    public ChallengeElasticLayer() {
        this(null, null);
    }

    public ChallengeElasticLayer(String str, String str2) {
        this.tag = str;
        this.desc = str2;
    }
}
