package com.google.android.gms.location;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new Parcelable.Creator<SleepSegmentRequest>() { // from class: X.0WA1
        @Override // android.os.Parcelable.Creator
        public final SleepSegmentRequest createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zzbx.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SleepSegmentRequest(arrayListLJIIJJI, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SleepSegmentRequest[] newArray(int i) {
            return new SleepSegmentRequest[i];
        }
    };
    public final List<zzbx> zza;
    public final int zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        if (C0W0T.LIZIZ(this.zza, sleepSegmentRequest.zza) && this.zzb == sleepSegmentRequest.zzb) {
            return true;
        }
        return false;
    }

    public SleepSegmentRequest(List<zzbx> list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0W3J.LJIIIIZZ(parcel);
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zza, false);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
