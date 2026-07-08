package com.google.android.gms.auth.api.credentials;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes31.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new Parcelable.Creator() { // from class: X.12jl
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 1000) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                                }
                            } else {
                                iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CredentialPickerConfig(zLJIILIIL, iLJIJJLI, iLJIJJLI2, zLJIILIIL2, zLJIILIIL3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CredentialPickerConfig[i];
        }
    };
    public final int LL;
    public final boolean zbb;
    public final boolean zbc;
    public final int zbd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        boolean z = true;
        C817940W6u.LIZ(parcel, 1, this.zbb);
        C817940W6u.LIZ(parcel, 2, this.zbc);
        if (this.zbd != 3) {
            z = false;
        }
        C817940W6u.LIZ(parcel, 3, z);
        C817940W6u.LJIIJ(parcel, 4, this.zbd);
        C817940W6u.LJIIJ(parcel, LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CredentialPickerConfig(boolean z, int i, int i2, boolean z2, boolean z3) {
        this.LL = i;
        this.zbb = z;
        this.zbc = z2;
        if (i < 2) {
            this.zbd = true == z3 ? 3 : 1;
        } else {
            this.zbd = i2;
        }
    }
}
