package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new Parcelable.Creator() { // from class: X.12kB
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            Uri uri = null;
            String strLJII5 = null;
            String strLJII6 = null;
            String strLJII7 = null;
            PublicKeyCredential publicKeyCredential = null;
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
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                        break;
                    case 6:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        strLJII6 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        strLJII7 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        publicKeyCredential = (PublicKeyCredential) C0W6J.LJI(parcel, i, PublicKeyCredential.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SignInCredential(strLJII, strLJII2, strLJII3, strLJII4, uri, strLJII5, strLJII6, strLJII7, publicKeyCredential);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignInCredential[i];
        }
    };
    public final String zba;
    public final String zbb;
    public final String zbc;
    public final String zbd;
    public final Uri zbe;
    public final String zbf;
    public final String zbg;
    public final String zbh;
    public final PublicKeyCredential zbi;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!C0W0T.LIZIZ(this.zba, signInCredential.zba) || !C0W0T.LIZIZ(this.zbb, signInCredential.zbb) || !C0W0T.LIZIZ(this.zbc, signInCredential.zbc) || !C0W0T.LIZIZ(this.zbd, signInCredential.zbd) || !C0W0T.LIZIZ(this.zbe, signInCredential.zbe) || !C0W0T.LIZIZ(this.zbf, signInCredential.zbf) || !C0W0T.LIZIZ(this.zbg, signInCredential.zbg) || !C0W0T.LIZIZ(this.zbh, signInCredential.zbh) || !C0W0T.LIZIZ(this.zbi, signInCredential.zbi)) {
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
        C817940W6u.LJIIZILJ(parcel, 5, this.zbe, i, false);
        C817940W6u.LJIJ(parcel, 6, this.zbf, false);
        C817940W6u.LJIJ(parcel, 7, this.zbg, false);
        C817940W6u.LJIJ(parcel, 8, this.zbh, false);
        C817940W6u.LJIIZILJ(parcel, 9, this.zbi, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        C0W3J.LJI(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
        this.zbh = str7;
        this.zbi = publicKeyCredential;
    }
}
