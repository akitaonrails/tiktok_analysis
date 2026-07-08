package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.InstrumentInfo;

/* JADX INFO: loaded from: classes14.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new Parcelable.Creator() { // from class: X.0WpG
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new InstrumentInfo(strLJII, strLJII2, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new InstrumentInfo[i];
        }
    };
    public String zza;
    public String zzb;
    public int zzc;

    public InstrumentInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        int i2 = 0;
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        int i3 = this.zzc;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i2 = i3;
        }
        C817940W6u.LJIIJ(parcel, 4, i2);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }
}
