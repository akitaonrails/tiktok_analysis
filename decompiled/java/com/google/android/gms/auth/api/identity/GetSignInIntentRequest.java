package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import X.C836070Wqz;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new Parcelable.Creator() { // from class: X.0Wqy
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GetSignInIntentRequest(iLJIJJLI, strLJII, strLJII2, strLJII3, strLJII4, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GetSignInIntentRequest[i];
        }
    };
    public final String zba;
    public final String zbb;
    public final String zbc;
    public final String zbd;
    public final boolean zbe;
    public final int zbf;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbd, Boolean.valueOf(this.zbe), Integer.valueOf(this.zbf)});
    }

    public static C836070Wqz LJLZ(GetSignInIntentRequest getSignInIntentRequest) {
        C836070Wqz c836070Wqz = new C836070Wqz();
        String str = getSignInIntentRequest.zba;
        C0W3J.LJIIIIZZ(str);
        c836070Wqz.LIZ = str;
        c836070Wqz.LIZLLL = getSignInIntentRequest.zbd;
        c836070Wqz.LIZIZ = getSignInIntentRequest.zbb;
        c836070Wqz.LJ = getSignInIntentRequest.zbe;
        c836070Wqz.LJFF = getSignInIntentRequest.zbf;
        String str2 = getSignInIntentRequest.zbc;
        if (str2 != null) {
            c836070Wqz.LIZJ = str2;
        }
        return c836070Wqz;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!C0W0T.LIZIZ(this.zba, getSignInIntentRequest.zba) || !C0W0T.LIZIZ(this.zbd, getSignInIntentRequest.zbd) || !C0W0T.LIZIZ(this.zbb, getSignInIntentRequest.zbb) || !C0W0T.LIZIZ(Boolean.valueOf(this.zbe), Boolean.valueOf(getSignInIntentRequest.zbe)) || this.zbf != getSignInIntentRequest.zbf) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zba, false);
        C817940W6u.LJIJ(parcel, 2, this.zbb, false);
        C817940W6u.LJIJ(parcel, 3, this.zbc, false);
        C817940W6u.LJIJ(parcel, 4, this.zbd, false);
        C817940W6u.LIZ(parcel, 5, this.zbe);
        C817940W6u.LJIIJ(parcel, 6, this.zbf);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GetSignInIntentRequest(int i, String str, String str2, String str3, String str4, boolean z) {
        C0W3J.LJIIIIZZ(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = z;
        this.zbf = i;
    }
}
