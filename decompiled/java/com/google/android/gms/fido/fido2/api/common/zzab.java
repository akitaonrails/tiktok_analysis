package com.google.android.gms.fido.fido2.api.common;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.zzab;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new Parcelable.Creator() { // from class: X.12g7
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    jLJJ = C0W6J.LJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzab(jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzab[i];
        }
    };
    public final long zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza)});
    }

    public zzab(long j) {
        Long lValueOf = Long.valueOf(j);
        C0W3J.LJIIIIZZ(lValueOf);
        this.zza = lValueOf.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzab) || this.zza != ((zzab) obj).zza) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILJJIL(1, this.zza, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
