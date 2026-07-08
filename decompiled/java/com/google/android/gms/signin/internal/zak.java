package com.google.android.gms.signin.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes14.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new Parcelable.Creator<zak>() { // from class: X.0Wju
        @Override // android.os.Parcelable.Creator
        public final zak createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            ConnectionResult connectionResult = null;
            zav zavVar = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            zavVar = (zav) C0W6J.LJI(parcel, i, zav.CREATOR);
                        }
                    } else {
                        connectionResult = (ConnectionResult) C0W6J.LJI(parcel, i, ConnectionResult.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zak(iLJIJJLI, connectionResult, zavVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zak[] newArray(int i) {
            return new zak[i];
        }
    };
    public final int LL;
    public final ConnectionResult zab;
    public final zav zac;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.zab, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zac, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.LL = i;
        this.zab = connectionResult;
        this.zac = zavVar;
    }
}
