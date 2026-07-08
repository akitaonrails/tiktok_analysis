package com.google.android.gms.identity.intents;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new Parcelable.Creator<UserAddressRequest>() { // from class: X.12lH
        @Override // android.os.Parcelable.Creator
        public final UserAddressRequest createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, CountrySpecification.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new UserAddressRequest(arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserAddressRequest[] newArray(int i) {
            return new UserAddressRequest[i];
        }
    };
    public final List<CountrySpecification> LL;

    public UserAddressRequest() {
    }

    public UserAddressRequest(List<CountrySpecification> list) {
        this.LL = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 2, this.LL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
