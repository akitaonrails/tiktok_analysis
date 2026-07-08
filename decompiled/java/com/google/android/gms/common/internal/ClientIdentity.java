package com.google.android.gms.common.internal;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new Parcelable.Creator<ClientIdentity>() { // from class: X.0W3Y
        @Override // android.os.Parcelable.Creator
        public final ClientIdentity createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
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
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ClientIdentity(iLJIJJLI, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClientIdentity[] newArray(int i) {
            return new ClientIdentity[i];
        }
    };
    public final String packageName;
    public final int uid;

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        int i = this.uid;
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.uid == this.uid && C0W0T.LIZIZ(clientIdentity.packageName, this.packageName)) {
            return true;
        }
        return false;
    }

    public ClientIdentity(int i, String str) {
        this.uid = i;
        this.packageName = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.uid);
        C817940W6u.LJIJ(parcel, 2, this.packageName, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
