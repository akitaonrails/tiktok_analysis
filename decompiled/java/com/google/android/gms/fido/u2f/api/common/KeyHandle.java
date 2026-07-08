package com.google.android.gms.fido.u2f.api.common;

import X.C19840112jv;
import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new Parcelable.Creator() { // from class: X.12k6
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            ArrayList arrayListLJIIJJI = null;
            int iLJIJJLI = 0;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, Transport.CREATOR);
                            }
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new KeyHandle(iLJIJJLI, bArrLIZJ, strLJII, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new KeyHandle[i];
        }
    };
    public final int zza;
    public final byte[] zzb;
    public final ProtocolVersion zzc;
    public final List zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, this.zzd});
    }

    public final String toString() {
        List list = this.zzd;
        String string = list == null ? "null" : list.toString();
        Object[] objArr = new Object[3];
        byte[] bArr = this.zzb;
        objArr[0] = bArr == null ? null : Base64.encodeToString(bArr, 0);
        objArr[1] = this.zzc;
        objArr[2] = string;
        return C786410Ut5.j4("{keyHandle: %s, version: %s, transports: %s}", objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.zzb, keyHandle.zzb) || !this.zzc.equals(keyHandle.zzc)) {
            return false;
        }
        List list = this.zzd;
        if (list == null) {
            if (keyHandle.zzd == null) {
                return true;
            }
        } else {
            List list2 = keyHandle.zzd;
            if (list2 != null && list.containsAll(list2) && keyHandle.zzd.containsAll(this.zzd)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIJ(parcel, 3, this.zzc.toString(), false);
        C817940W6u.LJIL(parcel, 4, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.zza = i;
        this.zzb = bArr;
        try {
            this.zzc = ProtocolVersion.fromString(str);
            this.zzd = list;
        } catch (C19840112jv e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
