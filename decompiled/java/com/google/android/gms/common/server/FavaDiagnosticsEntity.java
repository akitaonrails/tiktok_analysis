package com.google.android.gms.common.server;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* JADX INFO: loaded from: classes31.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new Parcelable.Creator<FavaDiagnosticsEntity>() { // from class: X.12kp
        @Override // android.os.Parcelable.Creator
        public final FavaDiagnosticsEntity createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new FavaDiagnosticsEntity(iLJIJJLI, strLJII, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FavaDiagnosticsEntity[] newArray(int i) {
            return new FavaDiagnosticsEntity[i];
        }
    };
    public final int LL;
    public final String zab;
    public final int zac;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.zab, false);
        C817940W6u.LJIIJ(parcel, 3, this.zac);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.LL = i;
        this.zab = str;
        this.zac = i2;
    }
}
