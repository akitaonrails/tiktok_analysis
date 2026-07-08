package com.google.android.gms.common.server.response;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.zam;

/* JADX INFO: loaded from: classes14.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new Parcelable.Creator<zam>() { // from class: X.0W6G
        @Override // android.os.Parcelable.Creator
        public final zam createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            String strLJII = null;
            FastJsonResponse.Field field = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            field = (FastJsonResponse.Field) C0W6J.LJI(parcel, i, FastJsonResponse.Field.CREATOR);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zam(iLJIJJLI, strLJII, field);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zam[] newArray(int i) {
            return new zam[i];
        }
    };
    public final int LL;
    public final String LLILLJJLI;
    public final FastJsonResponse.Field<?, ?> LLILLL;

    public zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.LL = 1;
        this.LLILLJJLI = str;
        this.LLILLL = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.LLILLL, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = field;
    }
}
