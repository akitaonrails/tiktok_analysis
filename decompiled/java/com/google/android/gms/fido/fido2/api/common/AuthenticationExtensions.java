package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new Parcelable.Creator() { // from class: X.12jf
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            FidoAppIdExtension fidoAppIdExtension = null;
            zzs zzsVar = null;
            UserVerificationMethodExtension userVerificationMethodExtension = null;
            zzz zzzVar = null;
            zzab zzabVar = null;
            zzad zzadVar = null;
            zzu zzuVar = null;
            zzag zzagVar = null;
            GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
            zzai zzaiVar = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        fidoAppIdExtension = (FidoAppIdExtension) C0W6J.LJI(parcel, i, FidoAppIdExtension.CREATOR);
                        break;
                    case 3:
                        zzsVar = (zzs) C0W6J.LJI(parcel, i, zzs.CREATOR);
                        break;
                    case 4:
                        userVerificationMethodExtension = (UserVerificationMethodExtension) C0W6J.LJI(parcel, i, UserVerificationMethodExtension.CREATOR);
                        break;
                    case 5:
                        zzzVar = (zzz) C0W6J.LJI(parcel, i, zzz.CREATOR);
                        break;
                    case 6:
                        zzabVar = (zzab) C0W6J.LJI(parcel, i, zzab.CREATOR);
                        break;
                    case 7:
                        zzadVar = (zzad) C0W6J.LJI(parcel, i, zzad.CREATOR);
                        break;
                    case '\b':
                        zzuVar = (zzu) C0W6J.LJI(parcel, i, zzu.CREATOR);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        zzagVar = (zzag) C0W6J.LJI(parcel, i, zzag.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) C0W6J.LJI(parcel, i, GoogleThirdPartyPaymentExtension.CREATOR);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        zzaiVar = (zzai) C0W6J.LJI(parcel, i, zzai.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AuthenticationExtensions[i];
        }
    };
    public final FidoAppIdExtension zza;
    public final zzs zzb;
    public final UserVerificationMethodExtension zzc;
    public final zzz zzd;
    public final zzab zze;
    public final zzad zzf;
    public final zzu zzg;
    public final zzag zzh;
    public final GoogleThirdPartyPaymentExtension zzi;
    public final zzai zzj;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!C0W0T.LIZIZ(this.zza, authenticationExtensions.zza) || !C0W0T.LIZIZ(this.zzb, authenticationExtensions.zzb) || !C0W0T.LIZIZ(this.zzc, authenticationExtensions.zzc) || !C0W0T.LIZIZ(this.zzd, authenticationExtensions.zzd) || !C0W0T.LIZIZ(this.zze, authenticationExtensions.zze) || !C0W0T.LIZIZ(this.zzf, authenticationExtensions.zzf) || !C0W0T.LIZIZ(this.zzg, authenticationExtensions.zzg) || !C0W0T.LIZIZ(this.zzh, authenticationExtensions.zzh) || !C0W0T.LIZIZ(this.zzi, authenticationExtensions.zzi) || !C0W0T.LIZIZ(this.zzj, authenticationExtensions.zzj)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzb, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzc, i, false);
        C817940W6u.LJIIZILJ(parcel, 5, this.zzd, i, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.zze, i, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.zzf, i, false);
        C817940W6u.LJIIZILJ(parcel, 8, this.zzg, i, false);
        C817940W6u.LJIIZILJ(parcel, 9, this.zzh, i, false);
        C817940W6u.LJIIZILJ(parcel, 10, this.zzi, i, false);
        C817940W6u.LJIIZILJ(parcel, 11, this.zzj, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzaiVar;
    }
}
