package com.google.android.gms.tapandpay.globalactions;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new Parcelable.Creator() { // from class: X.0W0X
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            GlobalActionCard[] globalActionCardArr = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    globalActionCardArr = (GlobalActionCard[]) C0W6J.LJIIJ(parcel, i, GlobalActionCard.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GetGlobalActionCardsResponse(globalActionCardArr, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GetGlobalActionCardsResponse[i];
        }
    };
    public GlobalActionCard[] zza;
    public int zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb)});
    }

    public GetGlobalActionCardsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.zza, getGlobalActionCardsResponse.zza) && C0W0T.LIZIZ(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsResponse.zzb))) {
                return true;
            }
        }
        return false;
    }

    public GetGlobalActionCardsResponse(GlobalActionCard[] globalActionCardArr, int i) {
        this.zza = globalActionCardArr;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJLI(parcel, 1, this.zza, i);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
