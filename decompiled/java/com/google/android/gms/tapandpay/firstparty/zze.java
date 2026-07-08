package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.zze;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new Parcelable.Creator() { // from class: X.0W6Y
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            long jLJJ = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    strLJII4 = C0W6J.LJII(i, parcel);
                                }
                            } else {
                                strLJII3 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    jLJJ = C0W6J.LJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zze(jLJJ, strLJII, strLJII2, strLJII3, strLJII4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zze[i];
        }
    };
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.LL), this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Long.valueOf(this.LL), "expirationTimestamp");
        c0w3l.LIZ(this.LLILLJJLI, "websiteUrl");
        c0w3l.LIZ(this.LLILLL, "websiteRedirectText");
        c0w3l.LIZ(this.LLILZ, "legalDisclaimer");
        c0w3l.LIZ(this.LLILZIL, "summary");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (C0W0T.LIZIZ(Long.valueOf(this.LL), Long.valueOf(zzeVar.LL)) && C0W0T.LIZIZ(this.LLILLJJLI, zzeVar.LLILLJJLI) && C0W0T.LIZIZ(this.LLILLL, zzeVar.LLILLL) && C0W0T.LIZIZ(this.LLILZ, zzeVar.LLILZ) && C0W0T.LIZIZ(this.LLILZIL, zzeVar.LLILZIL)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILJJIL(1, this.LL, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 4, this.LLILZ, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZIL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zze(long j, String str, String str2, String str3, String str4) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
