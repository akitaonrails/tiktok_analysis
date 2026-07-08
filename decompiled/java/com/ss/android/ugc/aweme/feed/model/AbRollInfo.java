package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AbRollInfo implements Serializable {

    @C09CT("index")
    public final int index;

    @C09CT("media_info_type")
    public final int mediaType;

    public AbRollInfo(int i, int i2) {
        this.mediaType = i;
        this.index = i2;
    }
}
