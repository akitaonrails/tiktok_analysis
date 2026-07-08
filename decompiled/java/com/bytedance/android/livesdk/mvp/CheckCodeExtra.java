package com.bytedance.android.livesdk.mvp;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes.dex */
public final class CheckCodeExtra extends Extra {

    @C09CT("block_duration")
    public final long blockDuration;

    public final CheckCodeExtra copy(long j) {
        return new CheckCodeExtra(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckCodeExtra) && this.blockDuration == ((CheckCodeExtra) obj).blockDuration;
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.blockDuration);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckCodeExtra(blockDuration=");
        sbLIZ.append(this.blockDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckCodeExtra() {
        this(0L);
    }

    public final long getBlockDuration() {
        return this.blockDuration;
    }

    public CheckCodeExtra(long j) {
        this.blockDuration = j;
    }
}
