package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new Parcelable.Creator() { // from class: X.12jk
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII3 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PublicKeyCredentialRpEntity(strLJII, strLJII2, strLJII3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PublicKeyCredentialRpEntity[i];
        }
    };
    public final String zza;
    public final String zzb;
    public final String zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        if (!C0W0T.LIZIZ(this.zza, publicKeyCredentialRpEntity.zza) || !C0W0T.LIZIZ(this.zzb, publicKeyCredentialRpEntity.zzb) || !C0W0T.LIZIZ(this.zzc, publicKeyCredentialRpEntity.zzc)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        C0W3J.LJIIIIZZ(str);
        this.zza = str;
        C0W3J.LJIIIIZZ(str2);
        this.zzb = str2;
        this.zzc = str3;
    }
}
