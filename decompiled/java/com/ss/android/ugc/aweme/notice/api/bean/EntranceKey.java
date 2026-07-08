package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class EntranceKey {

    @C09CT("entrance_id")
    public final int entranceId;

    @C09CT("sub_entrance_key")
    public final String entranceKey;

    public EntranceKey() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceKey)) {
            return false;
        }
        EntranceKey entranceKey = (EntranceKey) obj;
        return this.entranceId == entranceKey.entranceId && Intrinsics.LJFF(this.entranceKey, entranceKey.entranceKey);
    }

    public final int hashCode() {
        int i = this.entranceId * 31;
        String str = this.entranceKey;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceKey(entranceId=");
        sbLIZ.append(this.entranceId);
        sbLIZ.append(", entranceKey=");
        sbLIZ.append(this.entranceKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EntranceKey(int i, String str) {
        this.entranceId = i;
        this.entranceKey = str;
    }
}
