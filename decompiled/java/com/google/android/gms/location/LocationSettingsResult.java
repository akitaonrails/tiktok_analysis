package com.google.android.gms.location;

import X.C817940W6u;
import X.InterfaceC832870Wlp;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* JADX INFO: loaded from: classes31.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements InterfaceC832870Wlp {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new Parcelable.Creator<LocationSettingsResult>() { // from class: X.12jp
        @Override // android.os.Parcelable.Creator
        public final LocationSettingsResult createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Status status = null;
            LocationSettingsStates locationSettingsStates = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        locationSettingsStates = (LocationSettingsStates) C0W6J.LJI(parcel, i, LocationSettingsStates.CREATOR);
                    }
                } else {
                    status = (Status) C0W6J.LJI(parcel, i, Status.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LocationSettingsResult(status, locationSettingsStates);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationSettingsResult[] newArray(int i) {
            return new LocationSettingsResult[i];
        }
    };
    public final Status zza;
    public final LocationSettingsStates zzb;

    @Override // X.InterfaceC832870Wlp
    public final Status getStatus() {
        return this.zza;
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.zza = status;
        this.zzb = locationSettingsStates;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zza, i, false);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
