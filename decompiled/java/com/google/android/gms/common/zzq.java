package com.google.android.gms.common;

import X.C817940W6u;
import X.C829030Wfd;
import X.C829040Wfe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes14.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new Parcelable.Creator() { // from class: X.0WfW
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzq(zLJIILIIL, strLJII, iLJIJJLI2, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzq[i];
        }
    };
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;

    public final int LJLZ() {
        return C829040Wfe.LIZ(this.zzd);
    }

    public final int LLFFF() {
        return C829030Wfd.LIZ(this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zza);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIIJ(parcel, 3, this.zzc);
        C817940W6u.LJIIJ(parcel, 4, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzq(boolean z, String str, int i, int i2) {
        this.zza = z;
        this.zzb = str;
        this.zzc = C829030Wfd.LIZ(i) - 1;
        this.zzd = C829040Wfe.LIZ(i2) - 1;
    }
}
