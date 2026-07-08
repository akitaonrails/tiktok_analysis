package com.google.android.gms.common.server.response;

import X.C0W0T;
import X.C0W3J;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* JADX INFO: loaded from: classes14.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object LIZJ() {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean LJ() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse.Field<?, ?> field : LIZ().values()) {
            if (LIZLLL(field)) {
                Object objLIZIZ = LIZIZ(field);
                C0W3J.LJIIIIZZ(objLIZIZ);
                iHashCode = (iHashCode * 31) + objLIZIZ.hashCode();
            }
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : LIZ().values()) {
            if (LIZLLL(field)) {
                if (!fastJsonResponse.LIZLLL(field) || !C0W0T.LIZIZ(LIZIZ(field), fastJsonResponse.LIZIZ(field))) {
                    return false;
                }
            } else if (fastJsonResponse.LIZLLL(field)) {
                return false;
            }
        }
        return true;
    }
}
