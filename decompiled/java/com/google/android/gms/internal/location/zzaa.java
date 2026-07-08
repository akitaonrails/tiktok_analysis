package com.google.android.gms.internal.location;

import X.C817940W6u;
import X.InterfaceC832870Wlp;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzaa;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaa extends AbstractSafeParcelable implements InterfaceC832870Wlp {
    public final Status zzb;
    public static final zzaa zza = new zzaa(Status.RESULT_SUCCESS);
    public static final Parcelable.Creator<zzaa> CREATOR = new Parcelable.Creator<zzaa>() { // from class: X.0Wp0
        @Override // android.os.Parcelable.Creator
        public final zzaa createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Status status = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    status = (Status) C0W6J.LJI(parcel, i, Status.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzaa(status);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzaa[] newArray(int i) {
            return new zzaa[i];
        }
    };

    @Override // X.InterfaceC832870Wlp
    public final Status getStatus() {
        return this.zzb;
    }

    public zzaa(Status status) {
        this.zzb = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zzb, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
