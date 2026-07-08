package com.google.android.gms.common.server.response;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new Parcelable.Creator<zal>() { // from class: X.0W6H
        @Override // android.os.Parcelable.Creator
        public final zal createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zam.CREATOR);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zal(strLJII, iLJIJJLI, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zal[] newArray(int i) {
            return new zal[i];
        }
    };
    public final int LL;
    public final String LLILLJJLI;
    public final ArrayList<zam> LLILLL;

    public zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.LL = 1;
        this.LLILLJJLI = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, map.get(str2)));
            }
        }
        this.LLILLL = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIL(parcel, 3, this.LLILLL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zal(String str, int i, ArrayList arrayList) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = arrayList;
    }
}
