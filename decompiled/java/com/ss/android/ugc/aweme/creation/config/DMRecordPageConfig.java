package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class DMRecordPageConfig implements Serializable {

    @C09CT("show_record_hint_count")
    public final int showHintCount;

    public DMRecordPageConfig() {
        this(3);
    }

    public DMRecordPageConfig(int i) {
        this.showHintCount = i;
    }
}
