package com.google.android.gms.wallet.callback;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.callback.IntermediatePaymentData;

/* JADX INFO: loaded from: classes14.dex */
public class IntermediatePaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IntermediatePaymentData> CREATOR = new Parcelable.Creator() { // from class: X.0Vx0
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            Bundle bundleLIZIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new IntermediatePaymentData(strLJII, bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new IntermediatePaymentData[i];
        }
    };
    public String zza;
    public Bundle zzb;

    public IntermediatePaymentData(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LIZJ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
