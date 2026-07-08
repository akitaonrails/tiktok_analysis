package com.google.android.gms.fido.fido2.api.common;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.zzf;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new Parcelable.Creator() { // from class: X.0WUb
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            byte[] bArrLIZJ2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzf(bArrLIZJ, bArrLIZJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzf[i];
        }
    };
    public final byte[] zza;
    public final byte[] zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        if (!Arrays.equals(this.zza, zzfVar.zza) || !Arrays.equals(this.zzb, zzfVar.zzb)) {
            return false;
        }
        return true;
    }

    public zzf(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 1, this.zza, false);
        C817940W6u.LJ(parcel, 2, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
