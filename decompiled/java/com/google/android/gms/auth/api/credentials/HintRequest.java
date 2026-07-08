package com.google.android.gms.auth.api.credentials;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes31.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new Parcelable.Creator() { // from class: X.12jn
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            CredentialPickerConfig credentialPickerConfig = null;
            String[] strArrLJIIIIZZ = null;
            String strLJII = null;
            String strLJII2 = null;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1000) {
                    switch (c) {
                        case 1:
                            credentialPickerConfig = (CredentialPickerConfig) C0W6J.LJI(parcel, i, CredentialPickerConfig.CREATOR);
                            break;
                        case 2:
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 3:
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 4:
                            strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
                            break;
                        case 5:
                            zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 6:
                            strLJII = C0W6J.LJII(i, parcel);
                            break;
                        case 7:
                            strLJII2 = C0W6J.LJII(i, parcel);
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
            return new HintRequest(iLJIJJLI, credentialPickerConfig, zLJIILIIL, zLJIILIIL2, strArrLJIIIIZZ, zLJIILIIL3, strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new HintRequest[i];
        }
    };
    public final int LL;
    public final CredentialPickerConfig zbb;
    public final boolean zbc;
    public final boolean zbd;
    public final String[] zbe;
    public final boolean zbf;
    public final String zbg;
    public final String zbh;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zbb, i, false);
        C817940W6u.LIZ(parcel, 2, this.zbc);
        C817940W6u.LIZ(parcel, 3, this.zbd);
        C817940W6u.LJIJI(parcel, 4, this.zbe);
        C817940W6u.LIZ(parcel, 5, this.zbf);
        C817940W6u.LJIJ(parcel, 6, this.zbg, false);
        C817940W6u.LJIJ(parcel, 7, this.zbh, false);
        C817940W6u.LJIIJ(parcel, LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.LL = i;
        C0W3J.LJIIIIZZ(credentialPickerConfig);
        this.zbb = credentialPickerConfig;
        this.zbc = z;
        this.zbd = z2;
        C0W3J.LJIIIIZZ(strArr);
        this.zbe = strArr;
        if (i < 2) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
        } else {
            this.zbf = z3;
            this.zbg = str;
            this.zbh = str2;
        }
    }
}
