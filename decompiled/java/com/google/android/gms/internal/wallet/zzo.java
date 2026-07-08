package com.google.android.gms.internal.wallet;

import X.C817940W6u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.wallet.zzo;

/* JADX INFO: loaded from: classes14.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new Parcelable.Creator() { // from class: X.0Wp4
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            PendingIntent pendingIntent = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzo(pendingIntent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzo[i];
        }
    };
    public final PendingIntent LL;

    public zzo(PendingIntent pendingIntent) {
        this.LL = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.LL, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
