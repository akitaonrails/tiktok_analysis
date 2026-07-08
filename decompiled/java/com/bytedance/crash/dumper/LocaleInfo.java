package com.bytedance.crash.dumper;

import X.C0VJB;
import X.C0VSJ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.Serializable;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class LocaleInfo implements Serializable {
    public static final long serialVersionUID = 1;
    public final String mNetworkAccessType = getNetworkAccessType();
    public final int mTimeZone = getTimeZone();

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getNetworkAccessType() {
        /*
            java.lang.String r5 = "dzBzEgAjS8/YVFkiQFyHdNRwud8ndmm3vk6QYQ=="
            android.content.Context r2 = X.C0VX9.LJ()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L65
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C786410Ut5.H2(r2, r0)     // Catch: java.lang.Throwable -> L61
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L65
            android.net.NetworkInfo r1 = X.C786410Ut5.LJIJ(r0)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L65
            boolean r0 = r1.isAvailable()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L65
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L61
            r4 = 0
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L61
            int r0 = X.C2204961BRm.LJLLILLLL(r1, r0)     // Catch: java.lang.Throwable -> L61
            r3 = 1
            if (r3 == r0) goto L6b
            if (r0 != 0) goto L6a
            java.lang.String r0 = "phone"
            java.lang.Object r2 = X.C786410Ut5.H2(r2, r0)     // Catch: java.lang.Throwable -> L61
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L61
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L61
            r0 = 29
            if (r1 < r0) goto L57
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C804370Vgx.LIZ     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.getAndSet(r3)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L4a
            X.0Vgz r0 = X.C804370Vgx.LIZ()     // Catch: java.lang.Throwable -> L61
            r0.LIZIZ()     // Catch: java.lang.Throwable -> L61
        L4a:
            X.0Vgz r0 = X.C804370Vgx.LIZ()     // Catch: java.lang.Throwable -> L61
            int r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L61
            boolean r0 = X.C804370Vgx.LIZJ     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L79
            goto L67
        L57:
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L61
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L61
            int r1 = X.C2204961BRm.LLIILII(r2, r0)     // Catch: java.lang.Throwable -> L61
            goto L79
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L65:
            r3 = 0
            goto L6b
        L67:
            r0 = -1
            if (r1 != r0) goto L79
        L6a:
            r3 = 2
        L6b:
            java.lang.String[] r0 = X.C802880VeY.LIZ
            r1 = r0[r3]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L78
            java.lang.String r1 = "unknown"
        L78:
            return r1
        L79:
            switch(r1) {
                case 2: goto L7d;
                case 3: goto L7f;
                case 4: goto L7c;
                case 5: goto L7f;
                case 6: goto L7f;
                case 7: goto L7c;
                case 8: goto L7f;
                case 9: goto L7f;
                case 10: goto L7f;
                case 11: goto L7c;
                case 12: goto L7f;
                case 13: goto L81;
                case 14: goto L7f;
                case 15: goto L7f;
                case 16: goto L7c;
                case 17: goto L7c;
                case 18: goto L7c;
                case 19: goto L7c;
                case 20: goto L83;
                default: goto L7c;
            }
        L7c:
            goto L6a
        L7d:
            r3 = 3
            goto L6b
        L7f:
            r3 = 4
            goto L6b
        L81:
            r3 = 5
            goto L6b
        L83:
            r3 = 6
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.LocaleInfo.getNetworkAccessType():java.lang.String");
    }

    public static int getTimeZone() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        int i = -12;
        if (rawOffset >= -12) {
            i = 12;
            if (rawOffset <= 12) {
                return rawOffset;
            }
        }
        return i;
    }

    public static void dump(File file) {
        C0VJB.LIZIZ(new C0VSJ(file, "locale.inf"), new LocaleInfo());
    }

    public static LocaleInfo load(File file) {
        return (LocaleInfo) C0VJB.LIZ(new C0VSJ(file, "locale.inf"));
    }

    public static void putTo(JSONObject jSONObject) {
        putTo(jSONObject, null);
    }

    public static void putTo(JSONObject jSONObject, File file) {
        LocaleInfo localeInfo;
        if (file != null) {
            localeInfo = load(file);
            if (localeInfo == null) {
                return;
            }
        } else {
            localeInfo = new LocaleInfo();
        }
        try {
            jSONObject.put("access", localeInfo.mNetworkAccessType);
            jSONObject.put("timezone", localeInfo.mTimeZone);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
