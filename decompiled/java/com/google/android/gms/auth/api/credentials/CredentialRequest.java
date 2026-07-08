package com.google.android.gms.auth.api.credentials;

import X.C0W3J;
import X.C1238180iKG;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes31.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new Parcelable.Creator() { // from class: X.12jm
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String[] strArrLJIIIIZZ = null;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            CredentialPickerConfig credentialPickerConfig = null;
            CredentialPickerConfig credentialPickerConfig2 = null;
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1000) {
                    switch (c) {
                        case 1:
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 2:
                            strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
                            break;
                        case 3:
                            credentialPickerConfig = (CredentialPickerConfig) C0W6J.LJI(parcel, i, CredentialPickerConfig.CREATOR);
                            break;
                        case 4:
                            credentialPickerConfig2 = (CredentialPickerConfig) C0W6J.LJI(parcel, i, CredentialPickerConfig.CREATOR);
                            break;
                        case 5:
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 6:
                            strLJII = C0W6J.LJII(i, parcel);
                            break;
                        case 7:
                            strLJII2 = C0W6J.LJII(i, parcel);
                            break;
                        case '\b':
                            zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        default:
                            C0W6J.LJJII(i, parcel);
                            break;
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CredentialRequest(iLJIJJLI, zLJIILIIL, strArrLJIIIIZZ, credentialPickerConfig, credentialPickerConfig2, zLJIILIIL2, strLJII, strLJII2, zLJIILIIL3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CredentialRequest[i];
        }
    };
    public final int LL;
    public final boolean zbb;
    public final String[] zbc;
    public final CredentialPickerConfig zbd;
    public final CredentialPickerConfig zbe;
    public final boolean zbf;
    public final String zbg;
    public final String zbh;
    public final boolean zbi;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zbb);
        C817940W6u.LJIJI(parcel, 2, this.zbc);
        C817940W6u.LJIIZILJ(parcel, 3, this.zbd, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zbe, i, false);
        C817940W6u.LIZ(parcel, 5, this.zbf);
        C817940W6u.LJIJ(parcel, 6, this.zbg, false);
        C817940W6u.LJIJ(parcel, 7, this.zbh, false);
        C817940W6u.LIZ(parcel, 8, this.zbi);
        C817940W6u.LJIIJ(parcel, LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.LL = i;
        this.zbb = z;
        C0W3J.LJIIIIZZ(strArr);
        this.zbc = strArr;
        this.zbd = credentialPickerConfig == null ? new C1238180iKG().LIZ() : credentialPickerConfig;
        this.zbe = credentialPickerConfig2 == null ? new C1238180iKG().LIZ() : credentialPickerConfig2;
        if (i < 3) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
        } else {
            this.zbf = z2;
            this.zbg = str;
            this.zbh = str2;
        }
        this.zbi = z3;
    }
}
