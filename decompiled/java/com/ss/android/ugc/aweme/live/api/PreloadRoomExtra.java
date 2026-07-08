package com.ss.android.ugc.aweme.live.api;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.Extra;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadRoomExtra extends Extra {
    public static final int $stable = 8;

    @C09CT("reason")
    public String reason;

    public PreloadRoomExtra() {
        this(null);
    }

    public final PreloadRoomExtra copy(String str) {
        return new PreloadRoomExtra(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreloadRoomExtra) && Intrinsics.LJFF(this.reason, ((PreloadRoomExtra) obj).reason);
    }

    public int hashCode() {
        String str = this.reason;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadRoomExtra(reason=");
        sbLIZ.append(this.reason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getReason() {
        return this.reason;
    }

    public PreloadRoomExtra(String str) {
        this.reason = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }
}
