package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C1214210hhb;
import X.C19843012kO;
import X.C19843112kP;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new Parcelable.Creator() { // from class: X.0W6y
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            Boolean boolLJIILJJIL = null;
            String strLJII2 = null;
            String strLJII3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII3 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        boolLJIILJJIL = C0W6J.LJIILJJIL(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AuthenticatorSelectionCriteria(strLJII, boolLJIILJJIL, strLJII2, strLJII3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AuthenticatorSelectionCriteria[i];
        }
    };
    public final Attachment zza;
    public final Boolean zzb;
    public final zzay zzc;
    public final ResidentKeyRequirement zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, LJLZ()});
    }

    public final ResidentKeyRequirement LJLZ() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement == null) {
            Boolean bool = this.zzb;
            residentKeyRequirement = null;
            if (bool != null && bool.booleanValue()) {
                return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
            }
        }
        return residentKeyRequirement;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!C0W0T.LIZIZ(this.zza, authenticatorSelectionCriteria.zza) || !C0W0T.LIZIZ(this.zzb, authenticatorSelectionCriteria.zzb) || !C0W0T.LIZIZ(this.zzc, authenticatorSelectionCriteria.zzc) || !C0W0T.LIZIZ(LJLZ(), authenticatorSelectionCriteria.LJLZ())) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String string;
        String string2;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        Attachment attachment = this.zza;
        String string3 = null;
        if (attachment == null) {
            string = null;
        } else {
            string = attachment.toString();
        }
        C817940W6u.LJIJ(parcel, 2, string, false);
        C817940W6u.LIZIZ(parcel, 3, this.zzb);
        zzay zzayVar = this.zzc;
        if (zzayVar == null) {
            string2 = null;
        } else {
            string2 = zzayVar.toString();
        }
        C817940W6u.LJIJ(parcel, 4, string2, false);
        if (LJLZ() != null) {
            string3 = LJLZ().toString();
        }
        C817940W6u.LJIJ(parcel, 5, string3, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentFromString;
        zzay zzayVarZza;
        if (str == null) {
            attachmentFromString = null;
        } else {
            try {
                attachmentFromString = Attachment.fromString(str);
            } catch (C1214210hhb | C19843012kO | C19843112kP e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        }
        this.zza = attachmentFromString;
        this.zzb = bool;
        if (str2 == null) {
            zzayVarZza = null;
        } else {
            zzayVarZza = zzay.zza(str2);
        }
        this.zzc = zzayVarZza;
        this.zzd = str3 != null ? ResidentKeyRequirement.fromString(str3) : null;
    }
}
