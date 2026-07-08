package com.google.android.gms.tapandpay.issuer;

import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;

/* JADX INFO: loaded from: classes14.dex */
public final class PushProvisionSessionContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushProvisionSessionContext> CREATOR = new Parcelable.Creator() { // from class: X.0W6p
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII3 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PushProvisionSessionContext(strLJII, strLJII2, strLJII3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PushProvisionSessionContext[i];
        }
    };
    public final String zza;
    public final String zzb;
    public final String zzc;

    public final String toString() {
        return C786410Ut5.j4("PushProvisionSessionContext{serverSessionId=%s, deviceId=%s, walletId=%s}", new Object[]{this.zza, this.zzb, this.zzc});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PushProvisionSessionContext(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
