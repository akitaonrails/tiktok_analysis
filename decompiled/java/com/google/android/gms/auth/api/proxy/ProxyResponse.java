package com.google.android.gms.auth.api.proxy;

import X.C817940W6u;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes14.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new Parcelable.Creator() { // from class: X.0W0Y
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            PendingIntent pendingIntent = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            Bundle bundleLIZIZ = null;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    if (c != 1000) {
                                        C0W6J.LJJII(i, parcel);
                                    } else {
                                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                                    }
                                } else {
                                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                                }
                            } else {
                                bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                            }
                        } else {
                            iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                    }
                } else {
                    iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ProxyResponse(iLJIJJLI, iLJIJJLI2, pendingIntent, iLJIJJLI3, bundleLIZIZ, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ProxyResponse[i];
        }
    };
    public final int LL;
    public final Bundle LLILLJJLI;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final PendingIntent recoveryAction;
    public final int statusCode;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.googlePlayServicesStatusCode);
        C817940W6u.LJIIZILJ(parcel, 2, this.recoveryAction, i, false);
        C817940W6u.LJIIJ(parcel, 3, this.statusCode);
        C817940W6u.LIZJ(parcel, 4, this.LLILLJJLI);
        C817940W6u.LJ(parcel, 5, this.body, false);
        C817940W6u.LJIIJ(parcel, LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.LL = i;
        this.googlePlayServicesStatusCode = i2;
        this.statusCode = i3;
        this.LLILLJJLI = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }
}
