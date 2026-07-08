package com.google.android.gms.auth.api.proxy;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes14.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public final int LL;
    public final Bundle LLILLJJLI;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new Parcelable.Creator() { // from class: X.0W0U
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            byte[] bArrLIZJ = null;
            Bundle bundleLIZIZ = null;
            long jLJJ = 0;
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
                                    bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                                }
                            } else {
                                bArrLIZJ = C0W6J.LIZJ(i, parcel);
                            }
                        } else {
                            jLJJ = C0W6J.LJJ(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ProxyRequest(iLJIJJLI, strLJII, iLJIJJLI2, jLJJ, bArrLIZJ, bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ProxyRequest[i];
        }
    };
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    public final String toString() {
        return "ProxyRequest[ url: " + this.url + ", method: " + this.httpMethod + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.url, false);
        C817940W6u.LJIIJ(parcel, 2, this.httpMethod);
        C817940W6u.LJIILJJIL(3, this.timeoutMillis, parcel);
        C817940W6u.LJ(parcel, 4, this.body, false);
        C817940W6u.LIZJ(parcel, 5, this.LLILLJJLI);
        C817940W6u.LJIIJ(parcel, LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.LL = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.LLILLJJLI = bundle;
    }
}
