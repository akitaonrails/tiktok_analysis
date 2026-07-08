package com.google.android.gms.measurement.internal;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzal;

/* JADX INFO: loaded from: classes31.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new Parcelable.Creator<zzal>() { // from class: X.12fg
        @Override // android.os.Parcelable.Creator
        public final zzal createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Bundle bundleLIZIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzal(bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzal[] newArray(int i) {
            return new zzal[i];
        }
    };
    public final Bundle zza;

    public zzal(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZJ(parcel, 1, this.zza);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
