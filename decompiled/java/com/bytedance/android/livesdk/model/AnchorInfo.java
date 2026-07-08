package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class AnchorInfo {

    @C09CT("level")
    public long level;

    public final int hashCode() {
        long j = this.level;
        return (int) (j ^ (j >>> 32));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.level == ((AnchorInfo) obj).level) {
            return true;
        }
        return false;
    }
}
