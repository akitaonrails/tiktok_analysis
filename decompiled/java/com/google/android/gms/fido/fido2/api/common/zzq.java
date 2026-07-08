package com.google.android.gms.fido.fido2.api.common;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.zzq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new Parcelable.Creator() { // from class: X.0W4b
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            byte[] bArrLIZJ2 = null;
            byte[] bArrLIZJ3 = null;
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                bArrLIZJ3 = C0W6J.LIZJ(i, parcel);
                            }
                        } else {
                            bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    jLJJ = C0W6J.LJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzq(jLJJ, bArrLIZJ, bArrLIZJ2, bArrLIZJ3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzq[i];
        }
    };
    public final long zza;
    public final byte[] zzb;
    public final byte[] zzc;
    public final byte[] zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        if (this.zza != zzqVar.zza || !Arrays.equals(this.zzb, zzqVar.zzb) || !Arrays.equals(this.zzc, zzqVar.zzc) || !Arrays.equals(this.zzd, zzqVar.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILJJIL(1, this.zza, parcel);
        C817940W6u.LJ(parcel, 2, this.zzb, false);
        C817940W6u.LJ(parcel, 3, this.zzc, false);
        C817940W6u.LJ(parcel, 4, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.zza = j;
        C0W3J.LJIIIIZZ(bArr);
        this.zzb = bArr;
        C0W3J.LJIIIIZZ(bArr2);
        this.zzc = bArr2;
        C0W3J.LJIIIIZZ(bArr3);
        this.zzd = bArr3;
    }
}
