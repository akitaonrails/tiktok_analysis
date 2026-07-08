package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C1214210hhb;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new Parcelable.Creator() { // from class: X.12kF
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            Double dLJIIZILJ = null;
            String strLJII = null;
            ArrayList arrayListLJIIJJI = null;
            Integer numLJIL = null;
            TokenBinding tokenBinding = null;
            String strLJII2 = null;
            AuthenticationExtensions authenticationExtensions = null;
            Long lLJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 3:
                        dLJIIZILJ = C0W6J.LJIIZILJ(i, parcel);
                        break;
                    case 4:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                        break;
                    case 6:
                        numLJIL = C0W6J.LJIL(i, parcel);
                        break;
                    case 7:
                        tokenBinding = (TokenBinding) C0W6J.LJI(parcel, i, TokenBinding.CREATOR);
                        break;
                    case '\b':
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        authenticationExtensions = (AuthenticationExtensions) C0W6J.LJI(parcel, i, AuthenticationExtensions.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        lLJJI = C0W6J.LJJI(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PublicKeyCredentialRequestOptions(bArrLIZJ, dLJIIZILJ, strLJII, arrayListLJIIJJI, numLJIL, tokenBinding, strLJII2, authenticationExtensions, lLJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PublicKeyCredentialRequestOptions[i];
        }
    };
    public final byte[] zza;
    public final Double zzb;
    public final String zzc;
    public final List zzd;
    public final Integer zze;
    public final TokenBinding zzf;
    public final zzay zzg;
    public final AuthenticationExtensions zzh;
    public final Long zzi;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi});
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (!Arrays.equals(this.zza, publicKeyCredentialRequestOptions.zza) || !C0W0T.LIZIZ(this.zzb, publicKeyCredentialRequestOptions.zzb) || !C0W0T.LIZIZ(this.zzc, publicKeyCredentialRequestOptions.zzc) || ((list = this.zzd) != null ? (list2 = publicKeyCredentialRequestOptions.zzd) == null || !list.containsAll(list2) || !publicKeyCredentialRequestOptions.zzd.containsAll(this.zzd) : publicKeyCredentialRequestOptions.zzd != null) || !C0W0T.LIZIZ(this.zze, publicKeyCredentialRequestOptions.zze) || !C0W0T.LIZIZ(this.zzf, publicKeyCredentialRequestOptions.zzf) || !C0W0T.LIZIZ(this.zzg, publicKeyCredentialRequestOptions.zzg) || !C0W0T.LIZIZ(this.zzh, publicKeyCredentialRequestOptions.zzh) || !C0W0T.LIZIZ(this.zzi, publicKeyCredentialRequestOptions.zzi)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String string;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 2, this.zza, false);
        C817940W6u.LJI(parcel, 3, this.zzb);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJIL(parcel, 5, this.zzd, false);
        C817940W6u.LJIILIIL(parcel, 6, this.zze);
        C817940W6u.LJIIZILJ(parcel, 7, this.zzf, i, false);
        zzay zzayVar = this.zzg;
        if (zzayVar == null) {
            string = null;
        } else {
            string = zzayVar.toString();
        }
        C817940W6u.LJIJ(parcel, 8, string, false);
        C817940W6u.LJIIZILJ(parcel, 9, this.zzh, i, false);
        C817940W6u.LJIILLIIL(parcel, 10, this.zzi);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l) {
        C0W3J.LJIIIIZZ(bArr);
        this.zza = bArr;
        this.zzb = d;
        C0W3J.LJIIIIZZ(str);
        this.zzc = str;
        this.zzd = list;
        this.zze = num;
        this.zzf = tokenBinding;
        this.zzi = l;
        if (str2 != null) {
            try {
                this.zzg = zzay.zza(str2);
            } catch (C1214210hhb e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = authenticationExtensions;
    }
}
