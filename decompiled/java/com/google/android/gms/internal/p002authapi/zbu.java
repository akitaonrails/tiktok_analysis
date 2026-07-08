package com.google.android.gms.internal.p002authapi;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002authapi.zbu;

/* JADX INFO: loaded from: classes14.dex */
public final class zbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbu> CREATOR = new Parcelable.Creator() { // from class: X.0VzP
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Credential credential = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    credential = (Credential) C0W6J.LJI(parcel, i, Credential.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zbu(credential);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zbu[i];
        }
    };
    public final Credential zba;

    public zbu(Credential credential) {
        this.zba = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zba, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
