package com.google.android.gms.auth;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new Parcelable.Creator() { // from class: X.0W40
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, AccountChangeEvent.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AccountChangeEventsResponse(iLJIJJLI, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AccountChangeEventsResponse[i];
        }
    };
    public final int LL;
    public final List zzb;

    public AccountChangeEventsResponse(int i, List list) {
        this.LL = i;
        C0W3J.LJIIIIZZ(list);
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIL(parcel, 2, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
