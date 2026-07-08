package com.google.android.gms.fido.fido2.api.common;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.zzh;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new Parcelable.Creator() { // from class: X.0WUY
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzh(zLJIILIIL, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzh[i];
        }
    };
    public final boolean zza;
    public final byte[] zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), this.zzb});
    }

    public final JSONObject LJLZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", this.zza);
            JSONObject jSONObject2 = new JSONObject();
            byte[] bArr = this.zzb;
            if (bArr != null) {
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOfRange(bArr, 0, 31), 11));
                byte[] bArr2 = this.zzb;
                if (bArr2.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArr2, 32, 64), 11));
                }
            }
            jSONObject.put("results", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (this.zza != zzhVar.zza || !Arrays.equals(this.zzb, zzhVar.zzb)) {
            return false;
        }
        return true;
    }

    public zzh(boolean z, byte[] bArr) {
        this.zza = z;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zza);
        C817940W6u.LJ(parcel, 2, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
