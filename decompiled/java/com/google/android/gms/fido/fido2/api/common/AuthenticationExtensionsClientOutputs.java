package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new Parcelable.Creator() { // from class: X.0WUZ
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            UvmEntries uvmEntries = null;
            zzf zzfVar = null;
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
            zzh zzhVar = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                zzhVar = (zzh) C0W6J.LJI(parcel, i, zzh.CREATOR);
                            }
                        } else {
                            authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) C0W6J.LJI(parcel, i, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                        }
                    } else {
                        zzfVar = (zzf) C0W6J.LJI(parcel, i, zzf.CREATOR);
                    }
                } else {
                    uvmEntries = (UvmEntries) C0W6J.LJI(parcel, i, UvmEntries.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AuthenticationExtensionsClientOutputs[i];
        }
    };
    public final UvmEntries zza;
    public final zzf zzb;
    public final AuthenticationExtensionsCredPropsOutputs zzc;
    public final zzh zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final JSONObject LJLZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.zzc;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.zza);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.zza;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.LJLZ());
            }
            zzh zzhVar = this.zzd;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.LJLZ());
            }
            return jSONObject;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!C0W0T.LIZIZ(this.zza, authenticationExtensionsClientOutputs.zza) || !C0W0T.LIZIZ(this.zzb, authenticationExtensionsClientOutputs.zzb) || !C0W0T.LIZIZ(this.zzc, authenticationExtensionsClientOutputs.zzc) || !C0W0T.LIZIZ(this.zzd, authenticationExtensionsClientOutputs.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zza, i, false);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzc, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzd, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
    }
}
