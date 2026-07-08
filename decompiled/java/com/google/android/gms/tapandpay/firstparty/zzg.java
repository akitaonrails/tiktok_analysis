package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zzg;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new Parcelable.Creator() { // from class: X.0W6i
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzg(zLJIILIIL, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzg[i];
        }
    };
    public boolean zza;
    public boolean zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb)});
    }

    public zzg() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (C0W0T.LIZIZ(Boolean.valueOf(this.zza), Boolean.valueOf(zzgVar.zza)) && C0W0T.LIZIZ(Boolean.valueOf(this.zzb), Boolean.valueOf(zzgVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public zzg(boolean z, boolean z2) {
        this.zza = z;
        this.zzb = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zza);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
