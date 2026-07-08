package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new Parcelable.Creator() { // from class: X.0WoV
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GetPhoneNumberHintIntentRequest(iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GetPhoneNumberHintIntentRequest[i];
        }
    };
    public final int zba;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zba)});
    }

    public GetPhoneNumberHintIntentRequest(int i) {
        this.zba = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetPhoneNumberHintIntentRequest)) {
            return false;
        }
        return C0W0T.LIZIZ(Integer.valueOf(this.zba), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).zba));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zba);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
