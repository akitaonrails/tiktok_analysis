package com.google.android.gms.measurement.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzmu;

/* JADX INFO: loaded from: classes31.dex */
public final class zzmu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmu> CREATOR = new Parcelable.Creator<zzmu>() { // from class: X.12fi
        @Override // android.os.Parcelable.Creator
        public final zzmu createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            long jLJJ = 0;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        jLJJ = C0W6J.LJJ(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzmu(strLJII, jLJJ, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzmu[] newArray(int i) {
            return new zzmu[i];
        }
    };
    public final String zza;
    public final long zzb;
    public final int zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIILJJIL(2, this.zzb, parcel);
        C817940W6u.LJIIJ(parcel, 3, this.zzc);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzmu(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }
}
