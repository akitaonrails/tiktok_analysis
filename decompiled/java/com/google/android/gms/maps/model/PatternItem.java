package com.google.android.gms.maps.model;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.PatternItem;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class PatternItem extends AbstractSafeParcelable {
    public final int zzb;
    public final Float zzc;
    public static final String zza = "PatternItem";
    public static final Parcelable.Creator<PatternItem> CREATOR = new Parcelable.Creator() { // from class: X.0W5s
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Float fLJIJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        fLJIJI = C0W6J.LJIJI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PatternItem(iLJIJJLI, fLJIJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PatternItem[i];
        }
    };

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc});
    }

    public String toString() {
        return "[PatternItem: type=" + this.zzb + " length=" + this.zzc + e3.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.zzb == patternItem.zzb && C0W0T.LIZIZ(this.zzc, patternItem.zzc)) {
            return true;
        }
        return false;
    }

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        C0W3J.LIZ("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.zzb = i;
        this.zzc = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIIIIZZ(parcel, 3, this.zzc);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
