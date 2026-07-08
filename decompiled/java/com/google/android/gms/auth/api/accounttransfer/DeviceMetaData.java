package com.google.android.gms.auth.api.accounttransfer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new Parcelable.Creator() { // from class: X.0W65
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            }
                        } else {
                            jLJJ = C0W6J.LJJ(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new DeviceMetaData(iLJIJJLI, jLJJ, zLJIILIIL, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new DeviceMetaData[i];
        }
    };
    public final int LL;
    public boolean zzb;
    public long zzc;
    public final boolean zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LJIILJJIL(3, this.zzc, parcel);
        C817940W6u.LIZ(parcel, 4, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public DeviceMetaData(int i, long j, boolean z, boolean z2) {
        this.LL = i;
        this.zzb = z;
        this.zzc = j;
        this.zzd = z2;
    }
}
