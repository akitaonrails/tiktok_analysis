package com.google.android.gms.fido.fido2.api.common;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.fido.fido2.api.common.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new Parcelable.Creator() { // from class: X.0W4c
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zzq.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzs(arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzs[i];
        }
    };
    public final List zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.zza)});
    }

    public zzs(List list) {
        C0W3J.LJIIIIZZ(list);
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (!this.zza.containsAll(zzsVar.zza) || !zzsVar.zza.containsAll(this.zza)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zza, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
