package com.google.android.gms.internal.location;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzj extends AbstractSafeParcelable {
    public final zzs LL;
    public final List<ClientIdentity> LLILLJJLI;
    public final String LLILLL;
    public static final List<ClientIdentity> LLILZ = Collections.emptyList();
    public static final zzs LLILZIL = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new Parcelable.Creator<zzj>() { // from class: X.0W3X
        @Override // android.os.Parcelable.Creator
        public final zzj createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            zzs zzsVar = zzj.LLILZIL;
            List<ClientIdentity> listLJIIJJI = zzj.LLILZ;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        listLJIIJJI = C0W6J.LJIIJJI(parcel, i, ClientIdentity.CREATOR);
                    }
                } else {
                    zzsVar = (zzs) C0W6J.LJI(parcel, i, zzs.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzj(zzsVar, listLJIIJJI, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzj[] newArray(int i) {
            return new zzj[i];
        }
    };

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.LL);
        String strValueOf2 = String.valueOf(this.LLILLJJLI);
        String str = this.LLILLL;
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 77 + length2 + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(strValueOf);
        sb.append(", clients=");
        sb.append(strValueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!C0W0T.LIZIZ(this.LL, zzjVar.LL) || !C0W0T.LIZIZ(this.LLILLJJLI, zzjVar.LLILLJJLI) || !C0W0T.LIZIZ(this.LLILLL, zzjVar.LLILLL)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.LL, i, false);
        C817940W6u.LJIL(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.LL = zzsVar;
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }
}
