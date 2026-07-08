package com.google.android.gms.wallet.wobs;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.UriData;

/* JADX INFO: loaded from: classes14.dex */
public final class UriData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UriData> CREATOR = new Parcelable.Creator() { // from class: X.0Wqv
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new UriData(strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new UriData[i];
        }
    };
    public String zza;
    public String zzb;

    public UriData() {
    }

    public UriData(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
