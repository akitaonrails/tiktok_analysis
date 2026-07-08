package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new Parcelable.Creator<TelemetryData>() { // from class: X.0Wiw
        @Override // android.os.Parcelable.Creator
        public final TelemetryData createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, MethodInvocation.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TelemetryData(iLJIJJLI, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TelemetryData[] newArray(int i) {
            return new TelemetryData[i];
        }
    };
    public final int zaa;
    public List<MethodInvocation> zab;

    public TelemetryData(int i, List<MethodInvocation> list) {
        this.zaa = i;
        this.zab = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zaa);
        C817940W6u.LJIL(parcel, 2, this.zab, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
