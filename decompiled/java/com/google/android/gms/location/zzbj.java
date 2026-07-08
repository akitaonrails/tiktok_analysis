package com.google.android.gms.location;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzbj;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new Parcelable.Creator<zzbj>() { // from class: X.0W3b
        @Override // android.os.Parcelable.Creator
        public final zzbj createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = "";
            String strLJII2 = "";
            String strLJII3 = "";
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 5) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII3 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII2 = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbj(strLJII, strLJII2, strLJII3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzbj[] newArray(int i) {
            return new zzbj[i];
        }
    };
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIJ(parcel, 5, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzbj(String str, String str2, String str3) {
        this.zzc = str;
        this.zza = str2;
        this.zzb = str3;
    }
}
