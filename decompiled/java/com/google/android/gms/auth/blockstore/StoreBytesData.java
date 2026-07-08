package com.google.android.gms.auth.blockstore;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new Parcelable.Creator() { // from class: X.0Wo0
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
            boolean zLJIILIIL = false;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StoreBytesData(strLJII, bArrLIZJ, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StoreBytesData[i];
        }
    };
    public final byte[] zza;
    public final boolean zzb;
    public final String zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 1, this.zza, false);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public StoreBytesData(String str, byte[] bArr, boolean z) {
        this.zza = bArr;
        this.zzb = z;
        this.zzc = str;
    }
}
