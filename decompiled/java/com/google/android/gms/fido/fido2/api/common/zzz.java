package com.google.android.gms.fido.fido2.api.common;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.zzz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new Parcelable.Creator() { // from class: X.12gB
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzz(zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzz[i];
        }
    };
    public final boolean zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    public zzz(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C0W3J.LJIIIIZZ(boolValueOf);
        this.zza = boolValueOf.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzz) || this.zza != ((zzz) obj).zza) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zza);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
