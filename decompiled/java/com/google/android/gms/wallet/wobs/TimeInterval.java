package com.google.android.gms.wallet.wobs;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* JADX INFO: loaded from: classes14.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new Parcelable.Creator() { // from class: X.0Wqu
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            long jLJJ = 0;
            long jLJJ2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                    }
                } else {
                    jLJJ = C0W6J.LJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TimeInterval(jLJJ, jLJJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TimeInterval[i];
        }
    };
    public long zza;
    public long zzb;

    public TimeInterval() {
    }

    public TimeInterval(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILJJIL(2, this.zza, parcel);
        C817940W6u.LJIILJJIL(3, this.zzb, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
