package com.google.android.gms.location.places;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.PlaceReport;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new Parcelable.Creator<PlaceReport>() { // from class: X.0W3M
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlaceReport[] newArray(int i) {
            return new PlaceReport[i];
        }

        @Override // android.os.Parcelable.Creator
        public final PlaceReport createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII3 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PlaceReport(iLJIJJLI, strLJII, strLJII2, strLJII3);
        }
    };
    public final String tag;
    public final int versionCode;
    public final String zza;
    public final String zzb;

    public PlaceReport(int i, String str, String str2, String str3) {
        this.versionCode = i;
        this.zza = str;
        this.tag = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C0W0T.LIZIZ(this.zza, placeReport.zza) && C0W0T.LIZIZ(this.tag, placeReport.tag) && C0W0T.LIZIZ(this.zzb, placeReport.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.tag, this.zzb});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.zza, "placeId");
        c0w3l.LIZ(this.tag, "tag");
        if (!"unknown".equals(this.zzb)) {
            c0w3l.LIZ(this.zzb, "source");
        }
        return c0w3l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.versionCode);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.tag, false);
        C817940W6u.LJIJ(parcel, 4, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
