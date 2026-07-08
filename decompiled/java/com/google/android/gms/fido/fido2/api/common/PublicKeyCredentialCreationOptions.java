package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C19842512kJ;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new Parcelable.Creator() { // from class: X.12kG
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
            byte[] bArrLIZJ = null;
            ArrayList arrayListLJIIJJI = null;
            Double dLJIIZILJ = null;
            ArrayList arrayListLJIIJJI2 = null;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
            Integer numLJIL = null;
            TokenBinding tokenBinding = null;
            String strLJII = null;
            AuthenticationExtensions authenticationExtensions = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) C0W6J.LJI(parcel, i, PublicKeyCredentialRpEntity.CREATOR);
                        break;
                    case 3:
                        publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) C0W6J.LJI(parcel, i, PublicKeyCredentialUserEntity.CREATOR);
                        break;
                    case 4:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 5:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, PublicKeyCredentialParameters.CREATOR);
                        break;
                    case 6:
                        dLJIIZILJ = C0W6J.LJIIZILJ(i, parcel);
                        break;
                    case 7:
                        arrayListLJIIJJI2 = C0W6J.LJIIJJI(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                        break;
                    case '\b':
                        authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) C0W6J.LJI(parcel, i, AuthenticatorSelectionCriteria.CREATOR);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        numLJIL = C0W6J.LJIL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        tokenBinding = (TokenBinding) C0W6J.LJI(parcel, i, TokenBinding.CREATOR);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        authenticationExtensions = (AuthenticationExtensions) C0W6J.LJI(parcel, i, AuthenticationExtensions.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrLIZJ, arrayListLJIIJJI, dLJIIZILJ, arrayListLJIIJJI2, authenticatorSelectionCriteria, numLJIL, tokenBinding, strLJII, authenticationExtensions);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PublicKeyCredentialCreationOptions[i];
        }
    };
    public final PublicKeyCredentialRpEntity zza;
    public final PublicKeyCredentialUserEntity zzb;
    public final byte[] zzc;
    public final List zzd;
    public final Double zze;
    public final List zzf;
    public final AuthenticatorSelectionCriteria zzg;
    public final Integer zzh;
    public final TokenBinding zzi;
    public final AttestationConveyancePreference zzj;
    public final AuthenticationExtensions zzk;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk});
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (!C0W0T.LIZIZ(this.zza, publicKeyCredentialCreationOptions.zza) || !C0W0T.LIZIZ(this.zzb, publicKeyCredentialCreationOptions.zzb) || !Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) || !C0W0T.LIZIZ(this.zze, publicKeyCredentialCreationOptions.zze) || !this.zzd.containsAll(publicKeyCredentialCreationOptions.zzd) || !publicKeyCredentialCreationOptions.zzd.containsAll(this.zzd) || ((list = this.zzf) != null ? (list2 = publicKeyCredentialCreationOptions.zzf) == null || !list.containsAll(list2) || !publicKeyCredentialCreationOptions.zzf.containsAll(this.zzf) : publicKeyCredentialCreationOptions.zzf != null) || !C0W0T.LIZIZ(this.zzg, publicKeyCredentialCreationOptions.zzg) || !C0W0T.LIZIZ(this.zzh, publicKeyCredentialCreationOptions.zzh) || !C0W0T.LIZIZ(this.zzi, publicKeyCredentialCreationOptions.zzi) || !C0W0T.LIZIZ(this.zzj, publicKeyCredentialCreationOptions.zzj) || !C0W0T.LIZIZ(this.zzk, publicKeyCredentialCreationOptions.zzk)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String string;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzb, i, false);
        C817940W6u.LJ(parcel, 4, this.zzc, false);
        C817940W6u.LJIL(parcel, 5, this.zzd, false);
        C817940W6u.LJI(parcel, 6, this.zze);
        C817940W6u.LJIL(parcel, 7, this.zzf, false);
        C817940W6u.LJIIZILJ(parcel, 8, this.zzg, i, false);
        C817940W6u.LJIILIIL(parcel, 9, this.zzh);
        C817940W6u.LJIIZILJ(parcel, 10, this.zzi, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            string = null;
        } else {
            string = attestationConveyancePreference.toString();
        }
        C817940W6u.LJIJ(parcel, 11, string, false);
        C817940W6u.LJIIZILJ(parcel, 12, this.zzk, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        C0W3J.LJIIIIZZ(publicKeyCredentialRpEntity);
        this.zza = publicKeyCredentialRpEntity;
        C0W3J.LJIIIIZZ(publicKeyCredentialUserEntity);
        this.zzb = publicKeyCredentialUserEntity;
        C0W3J.LJIIIIZZ(bArr);
        this.zzc = bArr;
        C0W3J.LJIIIIZZ(list);
        this.zzd = list;
        this.zze = d;
        this.zzf = list2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = num;
        this.zzi = tokenBinding;
        if (str != null) {
            try {
                this.zzj = AttestationConveyancePreference.fromString(str);
            } catch (C19842512kJ e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
    }
}
