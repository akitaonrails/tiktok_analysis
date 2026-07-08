package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import X.C836250WrH;
import X.C836310WrN;
import X.C836330WrP;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new Parcelable.Creator() { // from class: X.0WrF
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
            String strLJII = null;
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
            boolean zLJIILIIL = false;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) C0W6J.LJI(parcel, i, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                        break;
                    case 2:
                        googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) C0W6J.LJI(parcel, i, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                        break;
                    case 3:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) C0W6J.LJI(parcel, i, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                        break;
                    case 7:
                        passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) C0W6J.LJI(parcel, i, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strLJII, zLJIILIIL, iLJIJJLI, passkeysRequestOptions, passkeyJsonRequestOptions);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new BeginSignInRequest[i];
        }
    };
    public final PasswordRequestOptions zba;
    public final GoogleIdTokenRequestOptions zbb;
    public final String zbc;
    public final boolean zbd;
    public final int zbe;
    public final PasskeysRequestOptions zbf;
    public final PasskeyJsonRequestOptions zbg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbf, this.zbg, this.zbc, Boolean.valueOf(this.zbd)});
    }

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new Parcelable.Creator() { // from class: X.0WrB
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                String strLJII = null;
                boolean zLJIILIIL = false;
                boolean zLJIILIIL2 = false;
                boolean zLJIILIIL3 = false;
                String strLJII2 = null;
                String strLJII3 = null;
                ArrayList arrayListLJIIIZ = null;
                while (parcel.dataPosition() < iLJJIII) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 2:
                            strLJII = C0W6J.LJII(i, parcel);
                            break;
                        case 3:
                            strLJII2 = C0W6J.LJII(i, parcel);
                            break;
                        case 4:
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 5:
                            strLJII3 = C0W6J.LJII(i, parcel);
                            break;
                        case 6:
                            arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                            break;
                        case 7:
                            zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        default:
                            C0W6J.LJJII(i, parcel);
                            break;
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new BeginSignInRequest.GoogleIdTokenRequestOptions(strLJII, strLJII2, strLJII3, arrayListLJIIIZ, zLJIILIIL, zLJIILIIL2, zLJIILIIL3);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
            }
        };
        public final boolean zba;
        public final String zbb;
        public final String zbc;
        public final boolean zbd;
        public final String zbe;
        public final List zbf;
        public final boolean zbg;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf, Boolean.valueOf(this.zbg)});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.zba != googleIdTokenRequestOptions.zba || !C0W0T.LIZIZ(this.zbb, googleIdTokenRequestOptions.zbb) || !C0W0T.LIZIZ(this.zbc, googleIdTokenRequestOptions.zbc) || this.zbd != googleIdTokenRequestOptions.zbd || !C0W0T.LIZIZ(this.zbe, googleIdTokenRequestOptions.zbe) || !C0W0T.LIZIZ(this.zbf, googleIdTokenRequestOptions.zbf) || this.zbg != googleIdTokenRequestOptions.zbg) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iLJJ = C817940W6u.LJJ(20293, parcel);
            C817940W6u.LIZ(parcel, 1, this.zba);
            C817940W6u.LJIJ(parcel, 2, this.zbb, false);
            C817940W6u.LJIJ(parcel, 3, this.zbc, false);
            C817940W6u.LIZ(parcel, 4, this.zbd);
            C817940W6u.LJIJ(parcel, 5, this.zbe, false);
            C817940W6u.LJIJJ(parcel, 6, this.zbf);
            C817940W6u.LIZ(parcel, 7, this.zbg);
            C817940W6u.LJJI(iLJJ, parcel);
        }

        public GoogleIdTokenRequestOptions(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
            boolean z4;
            ArrayList arrayList;
            if (z2 && z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            C0W3J.LIZ("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.zba = z;
            if (z) {
                C0W3J.LJIIIZ(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            } else {
                arrayList = null;
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z3;
        }
    }

    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new Parcelable.Creator() { // from class: X.0WrI
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                String strLJII = null;
                boolean zLJIILIIL = false;
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
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new BeginSignInRequest.PasskeyJsonRequestOptions(zLJIILIIL, strLJII);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
            }
        };
        public final boolean zba;
        public final String zbb;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            if (this.zba == passkeyJsonRequestOptions.zba && C0W0T.LIZIZ(this.zbb, passkeyJsonRequestOptions.zbb)) {
                return true;
            }
            return false;
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                C0W3J.LJIIIIZZ(str);
            }
            this.zba = z;
            this.zbb = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iLJJ = C817940W6u.LJJ(20293, parcel);
            C817940W6u.LIZ(parcel, 1, this.zba);
            C817940W6u.LJIJ(parcel, 2, this.zbb, false);
            C817940W6u.LJJI(iLJJ, parcel);
        }
    }

    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new Parcelable.Creator() { // from class: X.0WrG
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                byte[] bArrLIZJ = null;
                boolean zLJIILIIL = false;
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
                            bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new BeginSignInRequest.PasskeysRequestOptions(strLJII, bArrLIZJ, zLJIILIIL);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new BeginSignInRequest.PasskeysRequestOptions[i];
            }
        };
        public final boolean zba;
        public final byte[] zbb;
        public final String zbc;

        public final int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbc}) * 31) + Arrays.hashCode(this.zbb);
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            if (this.zba == passkeysRequestOptions.zba && Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && ((str = this.zbc) == (str2 = passkeysRequestOptions.zbc) || (str != null && str.equals(str2)))) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iLJJ = C817940W6u.LJJ(20293, parcel);
            C817940W6u.LIZ(parcel, 1, this.zba);
            C817940W6u.LJ(parcel, 2, this.zbb, false);
            C817940W6u.LJIJ(parcel, 3, this.zbc, false);
            C817940W6u.LJJI(iLJJ, parcel);
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                C0W3J.LJIIIIZZ(bArr);
                C0W3J.LJIIIIZZ(str);
            }
            this.zba = z;
            this.zbb = bArr;
            this.zbc = str;
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new Parcelable.Creator() { // from class: X.0WrJ
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                boolean zLJIILIIL = false;
                while (parcel.dataPosition() < iLJJIII) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new BeginSignInRequest.PasswordRequestOptions(zLJIILIIL);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new BeginSignInRequest.PasswordRequestOptions[i];
            }
        };
        public final boolean zba;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba)});
        }

        public PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.zba != ((PasswordRequestOptions) obj).zba) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iLJJ = C817940W6u.LJJ(20293, parcel);
            C817940W6u.LIZ(parcel, 1, this.zba);
            C817940W6u.LJJI(iLJJ, parcel);
        }
    }

    public static C836250WrH LJLZ(BeginSignInRequest beginSignInRequest) {
        C836250WrH c836250WrH = new C836250WrH();
        GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.zbb;
        C0W3J.LJIIIIZZ(googleIdTokenRequestOptions);
        c836250WrH.LIZIZ = googleIdTokenRequestOptions;
        PasswordRequestOptions passwordRequestOptions = beginSignInRequest.zba;
        C0W3J.LJIIIIZZ(passwordRequestOptions);
        c836250WrH.LIZ = passwordRequestOptions;
        PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.zbf;
        C0W3J.LJIIIIZZ(passkeysRequestOptions);
        c836250WrH.LIZJ = passkeysRequestOptions;
        PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.zbg;
        C0W3J.LJIIIIZZ(passkeyJsonRequestOptions);
        c836250WrH.LIZLLL = passkeyJsonRequestOptions;
        c836250WrH.LJFF = beginSignInRequest.zbd;
        c836250WrH.LJI = beginSignInRequest.zbe;
        String str = beginSignInRequest.zbc;
        if (str != null) {
            c836250WrH.LJ = str;
        }
        return c836250WrH;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!C0W0T.LIZIZ(this.zba, beginSignInRequest.zba) || !C0W0T.LIZIZ(this.zbb, beginSignInRequest.zbb) || !C0W0T.LIZIZ(this.zbf, beginSignInRequest.zbf) || !C0W0T.LIZIZ(this.zbg, beginSignInRequest.zbg) || !C0W0T.LIZIZ(this.zbc, beginSignInRequest.zbc) || this.zbd != beginSignInRequest.zbd || this.zbe != beginSignInRequest.zbe) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zba, i, false);
        C817940W6u.LJIIZILJ(parcel, 2, this.zbb, i, false);
        C817940W6u.LJIJ(parcel, 3, this.zbc, false);
        C817940W6u.LIZ(parcel, 4, this.zbd);
        C817940W6u.LJIIJ(parcel, 5, this.zbe);
        C817940W6u.LJIIZILJ(parcel, 6, this.zbf, i, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.zbg, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
        C0W3J.LJIIIIZZ(passwordRequestOptions);
        this.zba = passwordRequestOptions;
        C0W3J.LJIIIIZZ(googleIdTokenRequestOptions);
        this.zbb = googleIdTokenRequestOptions;
        this.zbc = str;
        this.zbd = z;
        this.zbe = i;
        if (passkeysRequestOptions == null) {
            C836310WrN c836310WrN = new C836310WrN();
            c836310WrN.LIZ = false;
            boolean z2 = c836310WrN.LIZ;
            passkeysRequestOptions = new PasskeysRequestOptions(c836310WrN.LIZJ, c836310WrN.LIZIZ, z2);
        }
        this.zbf = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            C836330WrP c836330WrP = new C836330WrP();
            c836330WrP.LIZ = false;
            passkeyJsonRequestOptions = new PasskeyJsonRequestOptions(c836330WrP.LIZ, c836330WrP.LIZIZ);
        }
        this.zbg = passkeyJsonRequestOptions;
    }
}
