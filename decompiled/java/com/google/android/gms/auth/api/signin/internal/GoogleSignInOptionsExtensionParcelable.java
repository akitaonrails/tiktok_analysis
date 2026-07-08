package com.google.android.gms.auth.api.signin.internal;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new Parcelable.Creator<GoogleSignInOptionsExtensionParcelable>() { // from class: X.0Wmu
        @Override // android.os.Parcelable.Creator
        public final GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Bundle bundleLIZIZ = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GoogleSignInOptionsExtensionParcelable(iLJIJJLI, iLJIJJLI2, bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i) {
            return new GoogleSignInOptionsExtensionParcelable[i];
        }
    };
    public final int LL;
    public int zab;
    public Bundle zac;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.zab);
        C817940W6u.LIZJ(parcel, 3, this.zac);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.LL = i;
        this.zab = i2;
        this.zac = bundle;
    }
}
