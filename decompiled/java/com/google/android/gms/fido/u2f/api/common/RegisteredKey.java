package com.google.android.gms.fido.u2f.api.common;

import X.C0W3J;
import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new Parcelable.Creator() { // from class: X.12k7
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            KeyHandle keyHandle = null;
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    keyHandle = (KeyHandle) C0W6J.LJI(parcel, i, KeyHandle.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new RegisteredKey(keyHandle, strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new RegisteredKey[i];
        }
    };
    public String zza;
    public final KeyHandle zzb;
    public final String zzc;

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.zzb.hashCode();
        String str2 = this.zzc;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.zzb.zzb, 11));
            ProtocolVersion protocolVersion = this.zzb.zzc;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.toString());
            }
            List list = this.zzb.zzd;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.zza;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.zza;
        if (str == null) {
            if (registeredKey.zza != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.zza)) {
            return false;
        }
        if (!this.zzb.equals(registeredKey.zzb)) {
            return false;
        }
        String str2 = this.zzc;
        if (str2 == null) {
            if (registeredKey.zzc != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.zzc)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJIJ(parcel, 3, this.zza, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        C0W3J.LJIIIIZZ(keyHandle);
        this.zzb = keyHandle;
        this.zza = str;
        this.zzc = str2;
    }
}
