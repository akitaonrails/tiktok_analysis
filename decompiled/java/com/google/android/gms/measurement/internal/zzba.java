package com.google.android.gms.measurement.internal;

import X.C19781412aS;
import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzba;
import java.util.Iterator;

/* JADX INFO: loaded from: classes31.dex */
public final class zzba extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzba> CREATOR = new Parcelable.Creator<zzba>() { // from class: X.12fj
        @Override // android.os.Parcelable.Creator
        public final zzba createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Bundle bundleLIZIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzba(bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzba[] newArray(int i) {
            return new zzba[i];
        }
    };
    public final Bundle zza;

    public final int LJLZ() {
        return this.zza.size();
    }

    public final Double LLI() {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    public final Bundle LLIFFJFJJ() {
        return new Bundle(this.zza);
    }

    public final Long LLIIIJ() {
        return Long.valueOf(this.zza.getLong("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C19781412aS(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    public zzba(Bundle bundle) {
        this.zza = bundle;
    }

    public final Object LLIIIL(String str) {
        try {
            return this.zza.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final String LLIILII(String str) {
        return this.zza.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZJ(parcel, 2, LLIFFJFJJ());
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
