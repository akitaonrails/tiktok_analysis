package com.google.android.gms.signin.internal;

import X.C817940W6u;
import X.InterfaceC832870Wlp;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zaa;

/* JADX INFO: loaded from: classes14.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC832870Wlp {
    public static final Parcelable.Creator<zaa> CREATOR = new Parcelable.Creator<zaa>() { // from class: X.0WAG
        @Override // android.os.Parcelable.Creator
        public final zaa createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Intent intent = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            intent = (Intent) C0W6J.LJI(parcel, i, Intent.CREATOR);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zaa(iLJIJJLI, iLJIJJLI2, intent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zaa[] newArray(int i) {
            return new zaa[i];
        }
    };
    public final int LL;
    public int zab;
    public Intent zac;

    public zaa() {
        this(2, 0, null);
    }

    @Override // X.InterfaceC832870Wlp
    public final Status getStatus() {
        return this.zab == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.zab);
        C817940W6u.LJIIZILJ(parcel, 3, this.zac, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zaa(int i, int i2, Intent intent) {
        this.LL = i;
        this.zab = i2;
        this.zac = intent;
    }
}
