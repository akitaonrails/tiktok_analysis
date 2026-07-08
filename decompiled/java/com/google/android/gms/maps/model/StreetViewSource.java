package com.google.android.gms.maps.model;

import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewSource;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public final int zzb;
    public static final String zza = "StreetViewSource";
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new Parcelable.Creator() { // from class: X.0Wsl
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StreetViewSource(iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StreetViewSource[i];
        }
    };
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        int i = this.zzb;
        return C786410Ut5.j4("StreetViewSource:%s", new Object[]{i != 0 ? i != 1 ? C786410Ut5.j4("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)}) : "OUTDOOR" : LivePreviewCTASmartDisplayManager.DEFAULT});
    }

    public StreetViewSource(int i) {
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.zzb == ((StreetViewSource) obj).zzb) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
