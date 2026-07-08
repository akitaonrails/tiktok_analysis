package com.ss.android.ugc.aweme.services.user;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UserPortraitParams implements IAudioParams {
    public final String reservedData;

    public final UserPortraitParams copy(String str) {
        return new UserPortraitParams(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserPortraitParams) && Intrinsics.LJFF(this.reservedData, ((UserPortraitParams) obj).reservedData);
    }

    public int hashCode() {
        String str = this.reservedData;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserPortraitParams(reservedData=");
        sbLIZ.append(this.reservedData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getReservedData() {
        return this.reservedData;
    }

    public UserPortraitParams(String str) {
        this.reservedData = str;
    }
}
