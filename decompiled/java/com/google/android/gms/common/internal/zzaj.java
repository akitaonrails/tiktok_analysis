package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaj;

/* JADX INFO: loaded from: classes31.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new Parcelable.Creator() { // from class: X.12lD
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzaj(iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzaj[i];
        }
    };
    public final int LL;

    public zzaj(int i) {
        this.LL = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
