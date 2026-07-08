package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.GeofencingRequest;
import java.util.ArrayList;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new Parcelable.Creator<GeofencingRequest>() { // from class: X.0W44
        @Override // android.os.Parcelable.Creator
        public final GeofencingRequest createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = "";
            ArrayList arrayListLJIIJJI = null;
            int iLJIJJLI = 0;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII2 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zzbe.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GeofencingRequest(arrayListLJIIJJI, iLJIJJLI, strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GeofencingRequest[] newArray(int i) {
            return new GeofencingRequest[i];
        }
    };
    public final List<zzbe> zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;

    public final String toString() {
        return "GeofencingRequest[geofences=" + this.zza + ", initialTrigger=" + this.zzb + ", tag=" + this.zzc + ", attributionTag=" + this.zzd + e3.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zza, false);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GeofencingRequest(List<zzbe> list, int i, String str, String str2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }
}
