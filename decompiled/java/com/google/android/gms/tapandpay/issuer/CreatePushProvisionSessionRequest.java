package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest;

/* JADX INFO: loaded from: classes31.dex */
public class CreatePushProvisionSessionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreatePushProvisionSessionRequest> CREATOR = new Parcelable.Creator() { // from class: X.12lE
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CreatePushProvisionSessionRequest(strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CreatePushProvisionSessionRequest[i];
        }
    };
    public final String zza;

    public CreatePushProvisionSessionRequest(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
