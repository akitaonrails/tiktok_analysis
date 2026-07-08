package com.facebook;

import X.C0W7K;
import X.C0WP3;
import X.C0WV6;
import X.C0WV8;
import X.C0WVK;
import X.C13LQ;
import X.C1BJ8;
import X.C1BJ9;
import X.C1BJA;
import X.C1BJC;
import X.C1BJO;
import X.C1BK6;
import X.C1D13;
import X.C2188811AlT;
import X.C2202841BJi;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class GraphRequest {
    public static final String LJIIIIZZ;
    public static final Pattern LJIIIZ;
    public static volatile String LJIIJ;
    public final AccessToken LIZ;
    public final String LIZIZ;
    public JSONObject LIZJ;
    public Bundle LIZLLL;
    public final String LJ;
    public C0WV8 LJFF;
    public C0WV6 LJI;
    public boolean LJII;

    public GraphRequest() {
        this(null, null, null, null, null, 63);
    }

    public final C0WVK LIZJ() {
        List listLIZIZ = C1BJA.LIZIZ(new C1BJ9(C13LQ.LJJLL(new GraphRequest[]{this})));
        if (listLIZIZ.size() == 1) {
            return (C0WVK) listLIZIZ.get(0);
        }
        throw new C1BJO("invalid state: expected a single response");
    }

    public final C1BJ8 LIZLLL() {
        C1BJ9 c1bj9 = new C1BJ9(C13LQ.LJJLL(new GraphRequest[]{this}));
        C0W7K.LIZJ(c1bj9);
        C1BJ8 c1bj8 = new C1BJ8(c1bj9);
        C0WP3.LIZLLL(c1bj8, FacebookSdk.LJ(), new Void[0]);
        return c1bj8;
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        if (iNextInt > 0) {
            int i = 0;
            do {
                i++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < iNextInt);
        }
        LJIIIIZZ = sb.toString();
        LJIIIZ = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            android.os.Bundle r2 = r5.LIZLLL
            java.lang.String r1 = r5.LJ()
            r4 = 0
            if (r1 != 0) goto L55
            r3 = 0
        La:
            java.lang.String r1 = com.facebook.FacebookSdk.LJFF()
            java.lang.String r0 = "instagram.com"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L21
            boolean r0 = r5.LJIIIIZZ()
            r0 = r0 ^ 1
            if (r0 != 0) goto L21
            if (r3 != 0) goto L21
        L20:
            r4 = 1
        L21:
            java.lang.String r1 = "access_token"
            if (r4 == 0) goto L4b
            java.lang.String r0 = LJFF()
            X.C786410Ut5.LJJJI(r1, r0, r2)
        L2c:
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L35
            X.C786410Ut5.C2()
        L35:
            java.lang.String r1 = "sdk"
            java.lang.String r0 = "android"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            java.lang.String r1 = "format"
            java.lang.String r0 = "json"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            java.util.HashSet<X.1BJT> r0 = com.facebook.FacebookSdk.LIZ
            monitor-enter(r0)
            monitor-exit(r0)
            com.facebook.FacebookSdk.LJIIIIZZ()
            return
        L4b:
            java.lang.String r0 = r5.LJ()
            if (r0 == 0) goto L2c
            X.C786410Ut5.LJJJI(r1, r0, r2)
            goto L2c
        L55:
            java.lang.String r0 = "|"
            boolean r3 = kotlin.text.a0.LJJIIZI(r1, r0, r4)
            java.lang.String r0 = "IG"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r4)
            if (r0 == 0) goto La
            if (r3 != 0) goto La
            boolean r0 = r5.LJIIIIZZ()
            if (r0 == 0) goto La
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.LIZ():void");
    }

    public final String LJ() {
        AccessToken accessToken = this.LIZ;
        if (accessToken != null) {
            if (!this.LIZLLL.containsKey("access_token")) {
                String str = accessToken.token;
                C2202841BJi c2202841BJi = C1BJC.LIZIZ;
                synchronized (c2202841BJi) {
                    FacebookSdk.LJIIIIZZ();
                    c2202841BJi.LIZ(str);
                }
                return str;
            }
        } else if (!this.LIZLLL.containsKey("access_token")) {
            return LJFF();
        }
        return this.LIZLLL.getString("access_token");
    }

    public final String LJI() {
        String str = this.LIZIZ;
        String strLJII = LJII((this.LJI == C0WV6.POST && str != null && u.LJIIZILJ(str, "/videos", false)) ? C786410Ut5.j4("https://graph-video.%s", Arrays.copyOf(new Object[]{FacebookSdk.LJFF()}, 1)) : C786410Ut5.j4("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.LJFF()}, 1)));
        LIZ();
        return LIZIZ(strLJII, false);
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZIZ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("^/?");
        sbLIZ.append(FacebookSdk.LIZLLL());
        sbLIZ.append("/?.*");
        return this.LJII || Pattern.matches(C2188811AlT.LIZIZ(sbLIZ), this.LIZIZ) || Pattern.matches("^/?app/?.*", this.LIZIZ);
    }

    public static String LJFF() {
        String strLIZLLL = FacebookSdk.LIZLLL();
        String strC2 = C786410Ut5.C2();
        if (strLIZLLL.length() <= 0 || strC2.length() <= 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append('|');
        sbLIZ.append(strC2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{Request: ");
        sbLIZ.append(" accessToken: ");
        Object obj = this.LIZ;
        if (obj == null) {
            obj = "null";
        }
        sbLIZ.append(obj);
        sbLIZ.append(", graphPath: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", graphObject: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", httpMethod: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", parameters: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public final String mimeType;
        public final RESOURCE resource;
        public static final C1BK6 Companion = new Object() { // from class: X.1BK6
        };
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C1D13(2);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(FacebookSdk.LIZJ().getClassLoader());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ParcelableResourceWithMimeType(Parcelable parcelable) {
            this.mimeType = "image/png";
            this.resource = parcelable;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i);
        }
    }

    public final String LJII(String str) {
        boolean z;
        String strJ4;
        if (!Intrinsics.LJFF(FacebookSdk.LJFF(), "instagram.com")) {
            z = true;
        } else {
            z = !LJIIIIZZ();
        }
        if (!z) {
            str = C786410Ut5.j4("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.LJIILLIIL}, 1));
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (LJIIIZ.matcher(this.LIZIZ).matches()) {
            strJ4 = this.LIZIZ;
        } else {
            strJ4 = C786410Ut5.j4("%s/%s", Arrays.copyOf(new Object[]{this.LJ, this.LIZIZ}, 2));
        }
        objArr[1] = strJ4;
        return C786410Ut5.j4("%s/%s", Arrays.copyOf(objArr, 2));
    }

    public final void LJIIIZ(C0WV6 c0wv6) {
        if (c0wv6 == null) {
            c0wv6 = C0WV6.GET;
        }
        this.LJI = c0wv6;
    }

    public final String LIZIZ(String str, boolean z) {
        Object obj;
        if (!z && this.LJI == C0WV6.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.LIZLLL.keySet()) {
            try {
                obj = this.LIZLLL.get(str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj == null) {
                obj = "";
            }
            if (C1BJA.LJ(obj)) {
                String strLJI = C1BJA.LJI(obj);
                strLJI.toString();
                builderBuildUpon.appendQueryParameter(str2, strLJI);
            } else if (this.LJI != C0WV6.GET) {
                throw new IllegalArgumentException(C786410Ut5.k4(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        return builderBuildUpon.toString();
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C0WV6 c0wv6, C0WV8 c0wv8, int i) {
        accessToken = (i & 1) != 0 ? null : accessToken;
        str = (i & 2) != 0 ? null : str;
        bundle = (i & 4) != 0 ? null : bundle;
        c0wv6 = (i & 8) != 0 ? null : c0wv6;
        c0wv8 = (i & 16) != 0 ? null : c0wv8;
        this.LIZ = accessToken;
        this.LIZIZ = str;
        this.LJ = null;
        synchronized (FacebookSdk.LIZ) {
        }
        FacebookSdk.LJIIIIZZ();
        this.LJFF = c0wv8;
        LJIIIZ(c0wv6);
        if (bundle != null) {
            this.LIZLLL = new Bundle(bundle);
        } else {
            this.LIZLLL = new Bundle();
        }
        this.LJ = C786410Ut5.D2();
    }
}
