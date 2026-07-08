package com.google.android.gms.location;

import X.AbstractC19885712rH;
import X.C817940W6u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzbq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new Parcelable.Creator<zzbq>() { // from class: X.0W13
        @Override // android.os.Parcelable.Creator
        public final zzbq createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = "";
            ArrayList arrayListLJIIIZ = null;
            PendingIntent pendingIntent = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                    }
                } else {
                    arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbq(arrayListLJIIIZ, pendingIntent, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzbq[] newArray(int i) {
            return new zzbq[i];
        }
    };
    public final List<String> zza;
    public final PendingIntent zzb;
    public final String zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJ(parcel, 1, this.zza);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzbq(List<String> list, PendingIntent pendingIntent, String str) {
        AbstractC19885712rH abstractC19885712rHZzj;
        if (list == null) {
            abstractC19885712rHZzj = AbstractC19885712rH.zzi();
        } else {
            abstractC19885712rHZzj = AbstractC19885712rH.zzj(list);
        }
        this.zza = abstractC19885712rHZzj;
        this.zzb = pendingIntent;
        this.zzc = str;
    }
}
