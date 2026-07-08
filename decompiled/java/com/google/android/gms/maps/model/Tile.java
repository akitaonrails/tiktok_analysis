package com.google.android.gms.maps.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes31.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new Parcelable.Creator() { // from class: X.12jt
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            byte[] bArrLIZJ = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new Tile(iLJIJJLI, bArrLIZJ, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Tile[i];
        }
    };
    public final byte[] data;
    public final int height;
    public final int width;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.width);
        C817940W6u.LJIIJ(parcel, 3, this.height);
        C817940W6u.LJ(parcel, 4, this.data, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public Tile(int i, byte[] bArr, int i2) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }
}
