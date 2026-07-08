package com.google.android.gms.common;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new Parcelable.Creator() { // from class: X.0WgI
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            long jLJJ = -1;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            jLJJ = C0W6J.LJJ(i, parcel);
                        }
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new Feature(strLJII, iLJIJJLI, jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Feature[i];
        }
    };
    public final String zza;
    public final int zzb;
    public final long zzc;

    public Feature(String str, int i, long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
    }

    public Feature(String str, long j) {
        this.zza = str;
        this.zzc = j;
        this.zzb = -1;
    }

    public final long LJLZ() {
        long j = this.zzc;
        return j == -1 ? this.zzb : j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Long.valueOf(LJLZ())});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.zza, "name");
        c0w3l.LIZ(Long.valueOf(LJLZ()), "version");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.zza;
            if (((str != null && str.equals(feature.zza)) || (this.zza == null && feature.zza == null)) && LJLZ() == feature.LJLZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIILJJIL(3, LJLZ(), parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
