package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StarshipDownlinkData extends BaseDownlinkData {

    @C09CT("starship_data")
    public String data;

    public StarshipDownlinkData() {
        this(null);
    }

    public final StarshipDownlinkData copy(String str) {
        return new StarshipDownlinkData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StarshipDownlinkData) && Intrinsics.LJFF(this.data, ((StarshipDownlinkData) obj).data);
    }

    public int hashCode() {
        String str = this.data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StarshipDownlinkData(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getData() {
        return this.data;
    }

    public StarshipDownlinkData(String str) {
        this.data = str;
    }

    public final void setData(String str) {
        this.data = str;
    }
}
