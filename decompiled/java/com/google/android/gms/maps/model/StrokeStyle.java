package com.google.android.gms.maps.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

/* JADX INFO: loaded from: classes14.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new Parcelable.Creator() { // from class: X.0WsT
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            StampStyle stampStyle = null;
            float fLJIJ = 0.0f;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 6) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    stampStyle = (StampStyle) C0W6J.LJI(parcel, i, StampStyle.CREATOR);
                                }
                            } else {
                                zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            }
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    fLJIJ = C0W6J.LJIJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StrokeStyle(fLJIJ, iLJIJJLI, iLJIJJLI2, zLJIILIIL, stampStyle);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StrokeStyle[i];
        }
    };
    public final float zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final StampStyle zze;

    public final Pair LJLZ() {
        return new Pair(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJII(parcel, 2, this.zza);
        C817940W6u.LJIIJ(parcel, 3, this.zzb);
        C817940W6u.LJIIJ(parcel, 4, this.zzc);
        C817940W6u.LIZ(parcel, 5, this.zzd);
        C817940W6u.LJIIZILJ(parcel, 6, this.zze, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.zza = f;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = stampStyle;
    }
}
