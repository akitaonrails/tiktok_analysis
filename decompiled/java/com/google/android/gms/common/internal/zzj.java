package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: classes14.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new Parcelable.Creator() { // from class: X.0WgH
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Bundle bundleLIZIZ = null;
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
            int iLJIJJLI = 0;
            Feature[] featureArr = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C0W6J.LJI(parcel, i, ConnectionTelemetryConfiguration.CREATOR);
                            }
                        } else {
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        featureArr = (Feature[]) C0W6J.LJIIJ(parcel, i, Feature.CREATOR);
                    }
                } else {
                    bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzj(bundleLIZIZ, featureArr, iLJIJJLI, connectionTelemetryConfiguration);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzj[i];
        }
    };
    public final Bundle LL;
    public final Feature[] LLILLJJLI;
    public final int LLILLL;
    public final ConnectionTelemetryConfiguration LLILZ;

    public zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.LL = bundle;
        this.LLILLJJLI = featureArr;
        this.LLILLL = i;
        this.LLILZ = connectionTelemetryConfiguration;
    }

    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZJ(parcel, 1, this.LL);
        C817940W6u.LJIJJLI(parcel, 2, this.LLILLJJLI, i);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLL);
        C817940W6u.LJIIZILJ(parcel, 4, this.LLILZ, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
