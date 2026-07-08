package com.google.android.gms.internal.auth;

import X.C0W3J;
import X.C817940W6u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.auth.zzbb;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new Parcelable.Creator() { // from class: X.0W3C
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            PendingIntent pendingIntent = null;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbb(pendingIntent, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzbb[i];
        }
    };
    public final int LL = 1;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(PendingIntent pendingIntent, String str) {
        C0W3J.LJIIIIZZ(str);
        this.zzb = str;
        C0W3J.LJIIIIZZ(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzc, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
