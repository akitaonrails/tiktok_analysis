package com.google.android.gms.common;

import X.AbstractBinderC828770WfD;
import X.C0WH6;
import X.C817940W6u;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzo;

/* JADX INFO: loaded from: classes14.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new Parcelable.Creator() { // from class: X.0WfL
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            IBinder iBinderLJIJJ = null;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                                }
                            } else {
                                iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                            }
                        } else {
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzo(strLJII, zLJIILIIL, zLJIILIIL2, iBinderLJIJJ, zLJIILIIL3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzo[i];
        }
    };
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final Context zzd;
    public final boolean zze;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LJIIIZ(parcel, 4, new C0WH6(this.zzd));
        C817940W6u.LIZ(parcel, 5, this.zze);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) C0WH6.LLLIIL(AbstractBinderC828770WfD.LLILLIZIL(iBinder));
        this.zze = z3;
    }
}
