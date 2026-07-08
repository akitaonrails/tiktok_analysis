package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class DMUploadVideoInfo implements Serializable {

    @C09CT("Height")
    public final Integer height;

    @C09CT("Width")
    public final Integer width;

    public DMUploadVideoInfo() {
        this(null, null);
    }

    public DMUploadVideoInfo(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }
}
