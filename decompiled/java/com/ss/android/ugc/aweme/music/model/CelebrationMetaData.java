package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CelebrationMetaData implements Serializable {

    @C09CT("celebration_type")
    public Integer celebrationType;

    public CelebrationMetaData() {
        this(0);
    }

    public CelebrationMetaData(Integer num) {
        this.celebrationType = num;
    }
}
