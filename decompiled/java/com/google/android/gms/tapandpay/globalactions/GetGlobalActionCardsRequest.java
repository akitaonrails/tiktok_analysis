package com.google.android.gms.tapandpay.globalactions;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class GetGlobalActionCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsRequest> CREATOR = new Parcelable.Creator() { // from class: X.0W0f
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GetGlobalActionCardsRequest(iLJIJJLI, iLJIJJLI2, iLJIJJLI3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GetGlobalActionCardsRequest[i];
        }
    };
    public int zza;
    public int zzb;
    public int zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public GetGlobalActionCardsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) obj;
            if (C0W0T.LIZIZ(Integer.valueOf(this.zza), Integer.valueOf(getGlobalActionCardsRequest.zza)) && C0W0T.LIZIZ(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsRequest.zzb)) && C0W0T.LIZIZ(Integer.valueOf(this.zzc), Integer.valueOf(getGlobalActionCardsRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJIIJ(parcel, 3, this.zzc);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GetGlobalActionCardsRequest(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }
}
