package com.google.android.gms.signin.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: loaded from: classes14.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new Parcelable.Creator<zai>() { // from class: X.0WlH
        @Override // android.os.Parcelable.Creator
        public final zai createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            zat zatVar = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        zatVar = (zat) C0W6J.LJI(parcel, i, zat.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zai(iLJIJJLI, zatVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zai[] newArray(int i) {
            return new zai[i];
        }
    };
    public final int LL;
    public final zat LLILLJJLI;

    public zai(int i, zat zatVar) {
        this.LL = i;
        this.LLILLJJLI = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.LLILLJJLI, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
