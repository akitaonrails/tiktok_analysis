package com.google.android.gms.internal.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.wallet.zzk;

/* JADX INFO: loaded from: classes14.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new Parcelable.Creator() { // from class: X.0Wp8
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzk(bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzk[i];
        }
    };
    public final byte[] LL;

    public zzk() {
        this.LL = new byte[0];
    }

    public zzk(byte[] bArr) {
        this.LL = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 2, this.LL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
