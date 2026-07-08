package com.google.android.gms.identity.intents.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;

/* JADX INFO: loaded from: classes31.dex */
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new Parcelable.Creator<CountrySpecification>() { // from class: X.12lG
        @Override // android.os.Parcelable.Creator
        public final CountrySpecification createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CountrySpecification(strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CountrySpecification[] newArray(int i) {
            return new CountrySpecification[i];
        }
    };
    public String zza;

    public CountrySpecification(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
