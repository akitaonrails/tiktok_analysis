package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new Parcelable.Creator() { // from class: X.12jw
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            String strLJII = null;
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
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PublicKeyCredentialUserEntity(strLJII, strLJII2, strLJII3, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PublicKeyCredentialUserEntity[i];
        }
    };
    public final byte[] zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!Arrays.equals(this.zza, publicKeyCredentialUserEntity.zza) || !C0W0T.LIZIZ(this.zzb, publicKeyCredentialUserEntity.zzb) || !C0W0T.LIZIZ(this.zzc, publicKeyCredentialUserEntity.zzc) || !C0W0T.LIZIZ(this.zzd, publicKeyCredentialUserEntity.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJIJ(parcel, 5, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        C0W3J.LJIIIIZZ(bArr);
        this.zza = bArr;
        C0W3J.LJIIIIZZ(str);
        this.zzb = str;
        this.zzc = str2;
        C0W3J.LJIIIIZZ(str3);
        this.zzd = str3;
    }
}
