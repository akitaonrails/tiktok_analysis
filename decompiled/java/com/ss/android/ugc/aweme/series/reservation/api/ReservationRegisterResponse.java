package com.ss.android.ugc.aweme.series.reservation.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ReservationRegisterResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("is_reserved")
    public final boolean isReserved;

    public ReservationRegisterResponse() {
        this(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReservationRegisterResponse) && this.isReserved == ((ReservationRegisterResponse) obj).isReserved;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.isReserved);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReservationRegisterResponse(isReserved=");
        sbLIZ.append(this.isReserved);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isReserved() {
        return this.isReserved;
    }

    public ReservationRegisterResponse(boolean z) {
        this.isReserved = z;
    }
}
