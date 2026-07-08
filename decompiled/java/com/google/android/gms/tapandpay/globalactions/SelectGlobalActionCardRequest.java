package com.google.android.gms.tapandpay.globalactions;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SelectGlobalActionCardRequest> CREATOR = new Parcelable.Creator() { // from class: X.0Vzt
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SelectGlobalActionCardRequest(iLJIJJLI, strLJII, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SelectGlobalActionCardRequest[i];
        }
    };
    public int zza;
    public String zzb;
    public int zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc)});
    }

    public SelectGlobalActionCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) obj;
            if (C0W0T.LIZIZ(Integer.valueOf(this.zza), Integer.valueOf(selectGlobalActionCardRequest.zza)) && C0W0T.LIZIZ(this.zzb, selectGlobalActionCardRequest.zzb) && C0W0T.LIZIZ(Integer.valueOf(this.zzc), Integer.valueOf(selectGlobalActionCardRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zza);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIIJ(parcel, 4, this.zzc);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SelectGlobalActionCardRequest(int i, String str, int i2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
    }
}
