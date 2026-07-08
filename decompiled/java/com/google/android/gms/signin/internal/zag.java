package com.google.android.gms.signin.internal;

import X.C817940W6u;
import X.InterfaceC832870Wlp;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC832870Wlp {
    public static final Parcelable.Creator<zag> CREATOR = new Parcelable.Creator<zag>() { // from class: X.0Wjt
        @Override // android.os.Parcelable.Creator
        public final zag createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIIZ = null;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zag(arrayListLJIIIZ, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zag[] newArray(int i) {
            return new zag[i];
        }
    };
    public final List<String> zaa;
    public final String zab;

    @Override // X.InterfaceC832870Wlp
    public final Status getStatus() {
        return this.zab != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    public zag(List<String> list, String str) {
        this.zaa = list;
        this.zab = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJ(parcel, 1, this.zaa);
        C817940W6u.LJIJ(parcel, 2, this.zab, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
