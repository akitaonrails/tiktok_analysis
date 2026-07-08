package com.google.android.gms.internal.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.wallet.zzq;

/* JADX INFO: loaded from: classes14.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new Parcelable.Creator() { // from class: X.0W6O
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String[] strArrLJIIIIZZ = null;
            int[] iArrLIZLLL = null;
            RemoteViews remoteViews = null;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                bArrLIZJ = C0W6J.LIZJ(i, parcel);
                            }
                        } else {
                            remoteViews = (RemoteViews) C0W6J.LJI(parcel, i, RemoteViews.CREATOR);
                        }
                    } else {
                        iArrLIZLLL = C0W6J.LIZLLL(i, parcel);
                    }
                } else {
                    strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzq(strArrLJIIIIZZ, iArrLIZLLL, remoteViews, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzq[i];
        }
    };
    public final String[] LL;
    public final int[] LLILLJJLI;
    public final RemoteViews LLILLL;
    public final byte[] LLILZ;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJI(parcel, 1, this.LL);
        C817940W6u.LJIIJJI(parcel, 2, this.LLILLJJLI);
        C817940W6u.LJIIZILJ(parcel, 3, this.LLILLL, i, false);
        C817940W6u.LJ(parcel, 4, this.LLILZ, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzq(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.LL = strArr;
        this.LLILLJJLI = iArr;
        this.LLILLL = remoteViews;
        this.LLILZ = bArr;
    }
}
