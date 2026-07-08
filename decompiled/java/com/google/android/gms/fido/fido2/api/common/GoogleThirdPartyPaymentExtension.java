package com.google.android.gms.fido.fido2.api.common;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new Parcelable.Creator() { // from class: X.12jg
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GoogleThirdPartyPaymentExtension(zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GoogleThirdPartyPaymentExtension[i];
        }
    };
    public final boolean zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.zza = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GoogleThirdPartyPaymentExtension) || this.zza != ((GoogleThirdPartyPaymentExtension) obj).zza) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zza);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
