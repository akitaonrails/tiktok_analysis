package com.google.android.gms.internal.auth;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.auth.zzaz;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new Parcelable.Creator() { // from class: X.0W8S
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzaz(strLJII, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzaz[i];
        }
    };
    public final int LL = 1;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(String str, byte[] bArr) {
        C0W3J.LJIIIIZZ(str);
        this.zzb = str;
        C0W3J.LJIIIIZZ(bArr);
        this.zzc = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJ(parcel, 3, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
