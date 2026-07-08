package com.google.android.gms.common.internal;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new Parcelable.Creator<MethodInvocation>() { // from class: X.0Wiv
        @Override // android.os.Parcelable.Creator
        public final MethodInvocation createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            int iLJIJJLI4 = 0;
            long jLJJ = 0;
            long jLJJ2 = 0;
            String strLJII2 = null;
            int iLJIJJLI5 = -1;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 3:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 4:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 5:
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case 6:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        iLJIJJLI5 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new MethodInvocation(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, jLJJ, jLJJ2, strLJII, strLJII2, iLJIJJLI4, iLJIJJLI5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MethodInvocation[] newArray(int i) {
            return new MethodInvocation[i];
        }
    };
    public final int zaa;
    public final int zab;
    public final int zac;
    public final long zad;
    public final long zae;
    public final String zaf;
    public final String zag;
    public final int zah;
    public final int zai;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zaa);
        C817940W6u.LJIIJ(parcel, 2, this.zab);
        C817940W6u.LJIIJ(parcel, 3, this.zac);
        C817940W6u.LJIILJJIL(4, this.zad, parcel);
        C817940W6u.LJIILJJIL(5, this.zae, parcel);
        C817940W6u.LJIJ(parcel, 6, this.zaf, false);
        C817940W6u.LJIJ(parcel, 7, this.zag, false);
        C817940W6u.LJIIJ(parcel, 8, this.zah);
        C817940W6u.LJIIJ(parcel, 9, this.zai);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }
}
