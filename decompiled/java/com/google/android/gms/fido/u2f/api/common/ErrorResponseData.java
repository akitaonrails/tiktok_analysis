package com.google.android.gms.fido.u2f.api.common;

import X.C0W0T;
import X.C19840412jy;
import X.C19840612k0;
import X.C19840812k2;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new Parcelable.Creator() { // from class: X.12jZ
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ErrorResponseData(iLJIJJLI, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ErrorResponseData[i];
        }
    };
    public final ErrorCode zza;
    public final String zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        C19840612k0 c19840612k0LIZ = C19840412jy.LIZ(this);
        String strValueOf = String.valueOf(this.zza.getCode());
        C19840812k2 c19840812k2 = new C19840812k2();
        c19840612k0LIZ.LIZJ.LIZJ = c19840812k2;
        c19840612k0LIZ.LIZJ = c19840812k2;
        c19840812k2.LIZIZ = strValueOf;
        c19840812k2.LIZ = "errorCode";
        String str = this.zzb;
        if (str != null) {
            c19840612k0LIZ.LIZ(str, "errorMessage");
        }
        return c19840612k0LIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (!C0W0T.LIZIZ(this.zza, errorResponseData.zza) || !C0W0T.LIZIZ(this.zzb, errorResponseData.zzb)) {
            return false;
        }
        return true;
    }

    public ErrorResponseData(int i, String str) {
        this.zza = ErrorCode.toErrorCode(i);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zza.getCode());
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
