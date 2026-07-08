package com.google.android.gms.common.api;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import X.C829300Wg4;
import X.InterfaceC832870Wlp;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC832870Wlp, ReflectedParcelable {
    public final int LL;
    public final int zzd;
    public final String zze;
    public final PendingIntent zzf;
    public final ConnectionResult zzg;
    public static final Status zza = new Status(-1, null);
    public static final Status RESULT_SUCCESS = new Status(0, null);
    public static final Status RESULT_INTERRUPTED = new Status(14, null);
    public static final Status RESULT_INTERNAL_ERROR = new Status(8, null);
    public static final Status RESULT_TIMEOUT = new Status(15, null);
    public static final Status RESULT_CANCELED = new Status(16, null);
    public static final Status zzb = new Status(17, null);
    public static final Status RESULT_DEAD_CLIENT = new Status(18, null);
    public static final Parcelable.Creator<Status> CREATOR = new Parcelable.Creator() { // from class: X.0WY2
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            PendingIntent pendingIntent = null;
            ConnectionResult connectionResult = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 1000) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                                }
                            } else {
                                connectionResult = (ConnectionResult) C0W6J.LJI(parcel, i, ConnectionResult.CREATOR);
                            }
                        } else {
                            pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new Status(iLJIJJLI, iLJIJJLI2, strLJII, pendingIntent, connectionResult);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Status[i];
        }
    };

    public Status() {
        throw null;
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.LL = i;
        this.zzd = i2;
        this.zze = str;
        this.zzf = pendingIntent;
        this.zzg = connectionResult;
    }

    public final boolean LJLZ() {
        return this.zzd <= 0;
    }

    @Override // X.InterfaceC832870Wlp
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Integer.valueOf(this.zzd), this.zze, this.zzf, this.zzg});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        String strLIZ = this.zze;
        if (strLIZ == null) {
            strLIZ = C829300Wg4.LIZ(this.zzd);
        }
        c0w3l.LIZ(strLIZ, "statusCode");
        c0w3l.LIZ(this.zzf, "resolution");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.LL != status.LL || this.zzd != status.zzd || !C0W0T.LIZIZ(this.zze, status.zze) || !C0W0T.LIZIZ(this.zzf, status.zzf) || !C0W0T.LIZIZ(this.zzg, status.zzg)) {
            return false;
        }
        return true;
    }

    public Status(int i, String str) {
        this(1, i, str, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zzd);
        C817940W6u.LJIJ(parcel, 2, this.zze, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzf, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzg, i, false);
        C817940W6u.LJIIJ(parcel, LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public Status(int i, PendingIntent pendingIntent, String str) {
        this(1, i, str, pendingIntent, null);
    }
}
