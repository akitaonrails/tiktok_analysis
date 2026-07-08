package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new Parcelable.Creator() { // from class: X.12kH
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
            Uri uri = null;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                    }
                } else {
                    publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) C0W6J.LJI(parcel, i, PublicKeyCredentialRequestOptions.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new BrowserPublicKeyCredentialRequestOptions[i];
        }
    };
    public final PublicKeyCredentialRequestOptions zza;
    public final Uri zzb;
    public final byte[] zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (!C0W0T.LIZIZ(this.zza, browserPublicKeyCredentialRequestOptions.zza) || !C0W0T.LIZIZ(this.zzb, browserPublicKeyCredentialRequestOptions.zzb)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzb, i, false);
        C817940W6u.LJ(parcel, 4, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        boolean z;
        boolean z2;
        C0W3J.LJIIIIZZ(publicKeyCredentialRequestOptions);
        this.zza = publicKeyCredentialRequestOptions;
        C0W3J.LJIIIIZZ(uri);
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZ("origin scheme must be non-empty", z);
        if (uri.getAuthority() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0W3J.LIZ("origin authority must be non-empty", z2);
        this.zzb = uri;
        C0W3J.LIZ("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.zzc = bArr;
    }
}
