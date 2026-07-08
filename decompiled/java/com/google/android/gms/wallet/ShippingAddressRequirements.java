package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new Parcelable.Creator() { // from class: X.0WoP
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ShippingAddressRequirements(arrayListLJIIIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ShippingAddressRequirements[i];
        }
    };
    public ArrayList zza;

    public ShippingAddressRequirements() {
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJ(parcel, 1, this.zza);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
