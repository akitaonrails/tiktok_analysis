package com.ss.android.common.util;

import X.C036E;
import X.C08NX;
import X.C08NY;
import X.C09N1;
import X.C09U8;
import X.C09U9;
import X.C0VSJ;
import X.C0XI0;
import X.C0XI4;
import X.C0XK4;
import X.C1300840jxK;
import X.C2188811AlT;
import X.C2259671DcT;
import X.C2259691DcV;
import X.C2389509Xx;
import X.C2400409as;
import X.C786410Ut5;
import X.C794240VDq;
import X.C794320VDy;
import X.C794430VEj;
import X.C804370Vgx;
import X.C804420Vh2;
import X.C846110XHd;
import X.C846120XHe;
import X.C846160XHi;
import X.C846170XHj;
import X.C846200XHm;
import X.C846280XHu;
import X.C846310XHx;
import X.EnumC796940VOa;
import X.EnumC846100XHc;
import X.InterfaceC2389609Xy;
import X.InterfaceC794400VEg;
import X.InterfaceC846090XHb;
import X.InterfaceC846210XHn;
import X.InterfaceC846220XHo;
import X.InterfaceC846250XHr;
import X.InterfaceC846270XHt;
import X.InterfaceC846290XHv;
import X.InterfaceC846300XHw;
import X.InterfaceC846330XHz;
import Y.ARunnableS0S2100200_13;
import Y.ARunnableS1S2200200_13;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.legoImp.NetWorkInjectImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkUtils {
    public static InterfaceC846300XHw sApiInterceptor;
    public static InterfaceC846290XHv sApiLibSelector;
    public static C09U8 sCommandListener;
    public static InterfaceC794400VEg sMonitorProcessHook;
    public static volatile InterfaceC846330XHz sServerTimeFromResponse;
    public static String sShareCookieHost;
    public static final Object sCookieLock = new Object();
    public static volatile boolean sCookieMgrInited = false;
    public static String sUserAgent = null;
    public static volatile boolean mAllowKeepAlive = true;
    public static volatile boolean sHasRebuildSsl = false;
    public static volatile int sUseDnsMapping = -1;
    public static volatile long mServerTime = -1;
    public static volatile long mLocalTime = -1;
    public static ArrayList<String> sNoHttpList = new ArrayList<>();
    public static int isForceHttps = 1;

    public static String com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(String str) {
        return str;
    }

    public static void com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(String str) {
    }

    public static String filterUrl(String str) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        return str;
    }

    public static InterfaceC846300XHw getApiRequestInterceptor() {
        return null;
    }

    public static List<String> getShareCookie(CookieManager cookieManager, String str) {
        return null;
    }

    public static List<String> getShareCookieHostList(String str) {
        return null;
    }

    public static void handleTimeStampFromResponse(String str) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(str);
    }

    public static void setApiLibrarySelector(InterfaceC846290XHv interfaceC846290XHv) {
    }

    public static void setApiRequestInterceptor(InterfaceC846300XHw interfaceC846300XHw) {
    }

    public static boolean getUseDnsMapping() {
        return sUseDnsMapping > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[Catch: all -> 0x003f, PHI: r6
      0x003b: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v1 java.lang.String), (r6v0 java.lang.String), (r6v2 java.lang.String) binds: [B:9:0x0011, B:21:0x0038, B:18:0x002e, B:19:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0009, B:10:0x0013, B:12:0x001c, B:17:0x002b, B:16:0x0026, B:19:0x0030, B:22:0x003b, B:21:0x0038), top: B:30:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void tryInitUserAgent() {
        /*
            java.lang.Class<com.ss.android.common.util.NetworkUtils> r7 = com.ss.android.common.util.NetworkUtils.class
            monitor-enter(r7)
            java.lang.String r0 = com.ss.android.common.util.NetworkUtils.sUserAgent     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L9
            monitor-exit(r7)
            return
        L9:
            com.ss.android.common.util.INetWorkInject r0 = com.ss.android.ugc.aweme.legoImp.NetWorkInjectImpl.LIZJ()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L3b
            char[] r5 = r6.toCharArray()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L3f
            int r4 = r5.length     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L3f
            r3 = 0
            r2 = 0
        L1a:
            if (r3 >= r4) goto L2e
            char r1 = r5[r3]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L3f
            r0 = 32
            if (r1 < r0) goto L26
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 <= r0) goto L2b
        L26:
            r0 = 63
            r5[r3] = r0     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L3f
            r2 = 1
        L2b:
            int r3 = r3 + 1
            goto L1a
        L2e:
            if (r2 == 0) goto L3b
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L3f
            r0.<init>(r5)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L3f
            r6 = r0
            goto L3b
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3f
        L3b:
            com.ss.android.common.util.NetworkUtils.sUserAgent = r6     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r7)
            return
        L3f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.tryInitUserAgent():void");
    }

    public static CookieManager tryNecessaryInit() {
        synchronized (sCookieLock) {
            try {
                if (!sCookieMgrInited) {
                    try {
                        Thread.sleep(1500L);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    sCookieMgrInited = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C2389509Xx c2389509XxLIZ = NetWorkInjectImpl.LIZJ().LIZ();
        if (c2389509XxLIZ != null) {
            c2389509XxLIZ.LIZ();
        }
        CookieManager cookieManagerA2 = C786410Ut5.A2();
        if (!cookieManagerA2.acceptCookie()) {
            cookieManagerA2.setAcceptCookie(true);
        }
        return cookieManagerA2;
    }

    public static int com_ss_android_common_util_NetworkUtils__getServerTime$___twin___() {
        return (int) (getServerTimeMills() / 1000);
    }

    public static int com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_getServerTime() {
        return C0XK4.LIZ();
    }

    public static InterfaceC2389609Xy getApiProcessHook() {
        return NetWorkInjectImpl.LIZJ().LIZ();
    }

    public static Context getAppContext() {
        return NetWorkInjectImpl.LIZJ().getAppContext();
    }

    public static int getServerTime() {
        return C0XK4.LIZ();
    }

    public static long getServerTimeMills() {
        return mServerTime > 0 ? (mServerTime + System.currentTimeMillis()) - mLocalTime : System.currentTimeMillis();
    }

    public static String getUserAgent() {
        tryInitUserAgent();
        return sUserAgent;
    }

    public static boolean getAllowKeepAlive() {
        return mAllowKeepAlive;
    }

    public static C09U8 getCommandListener() {
        return sCommandListener;
    }

    public static boolean getHasRebuildSsl() {
        return sHasRebuildSsl;
    }

    public static int getIsForceHttps() {
        return isForceHttps;
    }

    public static String getShareCookieHost() {
        return sShareCookieHost;
    }

    public static boolean INVOKESTATIC_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static int INVOKEVIRTUAL_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C804370Vgx.LIZ.getAndSet(true)) {
                C804370Vgx.LIZ().LIZIZ();
            }
            int iLIZ = C804370Vgx.LIZ().LIZ();
            if (!C804370Vgx.LIZJ && iLIZ == -1) {
                return 0;
            }
            return iLIZ;
        }
        return telephonyManager.getNetworkType();
    }

    public static String com_ss_android_common_util_NetworkUtils__filterUrl$___twin___(String str) {
        TextUtils.isEmpty(str);
        return str;
    }

    public static void com_ss_android_common_util_NetworkUtils__handleTimeStampFromResponse$___twin___(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (sServerTimeFromResponse != null) {
            sServerTimeFromResponse.getClass();
            try {
                long jOptLong = ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1L);
                if (jOptLong > 0) {
                    mServerTime = jOptLong;
                    mLocalTime = System.currentTimeMillis();
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        try {
            long jOptLong2 = ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1L);
            if (jOptLong2 >= 0) {
                mServerTime = jOptLong2;
                mLocalTime = System.currentTimeMillis();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static long extractMaxAge(C846160XHi c846160XHi) {
        InterfaceC846210XHn interfaceC846210XHnLIZ;
        long j = -1;
        if (c846160XHi == null || (interfaceC846210XHnLIZ = c846160XHi.LIZ("Cache-Control")) == null) {
            return -1L;
        }
        try {
            InterfaceC846220XHo[] elements = interfaceC846210XHnLIZ.getElements();
            if (elements != null) {
                for (InterfaceC846220XHo interfaceC846220XHo : elements) {
                    if ("max-age".equals(interfaceC846220XHo.getName())) {
                        String value = interfaceC846220XHo.getValue();
                        if (value == null) {
                            return -1L;
                        }
                        j = CastLongProtector.parseLong(value);
                        return j;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j;
    }

    public static String getEtag(C846160XHi c846160XHi) {
        InterfaceC846210XHn interfaceC846210XHnLIZ;
        if (c846160XHi == null || (interfaceC846210XHnLIZ = c846160XHi.LIZ("ETag")) == null) {
            return null;
        }
        return interfaceC846210XHnLIZ.getValue();
    }

    public static String getLastModified(C846160XHi c846160XHi) {
        InterfaceC846210XHn interfaceC846210XHnLIZ;
        if (c846160XHi == null || (interfaceC846210XHnLIZ = c846160XHi.LIZ("Last-Modified")) == null) {
            return null;
        }
        return interfaceC846210XHnLIZ.getValue();
    }

    public static String getNetworkAccessType(EnumC846100XHc enumC846100XHc) {
        int i;
        try {
            i = C846110XHd.LIZ[enumC846100XHc.ordinal()];
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "mobile";
                    }
                    return "4g";
                }
                return "3g";
            }
            return "2g";
        }
        return "wifi";
    }

    public static String getNetworkOperatorCode(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            return C1300840jxK.LJ(telephonyManager);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "unkown";
        }
    }

    public static EnumC846100XHc getNetworkType(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
                int type = networkInfoLJIJ.getType();
                if (1 == type) {
                    return EnumC846100XHc.WIFI;
                }
                if (type == 0) {
                    switch (INVOKEVIRTUAL_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType((TelephonyManager) C786410Ut5.H2(context, "phone"))) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            return EnumC846100XHc.MOBILE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        case 14:
                        case 15:
                            return EnumC846100XHc.MOBILE_3G;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            return EnumC846100XHc.MOBILE_4G;
                        default:
                            return EnumC846100XHc.MOBILE;
                    }
                }
                return EnumC846100XHc.MOBILE;
            }
            return EnumC846100XHc.NONE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return EnumC846100XHc.MOBILE;
        }
    }

    public static boolean isHitNoHttpList(String str) {
        ArrayList<String> arrayList;
        if (isForceHttps == 1) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && (arrayList = sNoHttpList) != null && !arrayList.isEmpty()) {
            Iterator<String> it2 = sNoHttpList.iterator();
            while (it2.hasNext()) {
                if (str.contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMobile(Context context) {
        EnumC846100XHc networkType = getNetworkType(context);
        if (EnumC846100XHc.MOBILE_2G != networkType && EnumC846100XHc.MOBILE_3G != networkType && EnumC846100XHc.MOBILE_4G != networkType && EnumC846100XHc.MOBILE != networkType) {
            return false;
        }
        return true;
    }

    public static boolean isNetworkAvailable(Context context) {
        return INVOKESTATIC_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(context);
    }

    public static boolean isWifi(Context context) {
        return C804420Vh2.LJI(context);
    }

    public static Pair<String, String> parseContentType(String str) {
        String value = null;
        if (str == null) {
            return null;
        }
        InterfaceC846220XHo[] elements = new C2259671DcT("Content-Type", str).getElements();
        if (elements.length == 0) {
            return null;
        }
        int i = 0;
        InterfaceC846220XHo interfaceC846220XHo = elements[0];
        String name = interfaceC846220XHo.getName();
        C08NY[] parameters = interfaceC846220XHo.getParameters();
        if (parameters != null) {
            int length = parameters.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C08NY c08ny = parameters[i];
                if ("charset".equalsIgnoreCase(c08ny.getName())) {
                    value = c08ny.getValue();
                    break;
                }
                i++;
            }
        }
        return new Pair<>(name, value);
    }

    public static void safeClose(Closeable closeable) {
        safeClose(closeable, null);
    }

    public static void setAllowKeepAlive(boolean z) {
        mAllowKeepAlive = z;
    }

    public static void setCommandListener(C09U8 c09u8) {
        sCommandListener = c09u8;
    }

    public static void setHasRebuildSsl(boolean z) {
        sHasRebuildSsl = z;
    }

    public static void setIsForceHttps(int i) {
        isForceHttps = i;
    }

    public static void setMonitorProcessHook(InterfaceC794400VEg interfaceC794400VEg) {
        sMonitorProcessHook = interfaceC794400VEg;
    }

    public static void setNoHttpList(ArrayList<String> arrayList) {
        sNoHttpList = arrayList;
    }

    public static void setServerTimeFromResponse(InterfaceC846330XHz interfaceC846330XHz) {
        sServerTimeFromResponse = interfaceC846330XHz;
    }

    public static void setShareCookieHost(String str) {
        sShareCookieHost = str;
    }

    public static void setTimeout(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            uRLConnection.setConnectTimeout(15000);
            uRLConnection.setReadTimeout(15000);
        }
    }

    public static void setUseDnsMapping(int i) {
        sUseDnsMapping = i;
    }

    public static void setUserAgent(HttpParams httpParams) {
        tryInitUserAgent();
        String str = sUserAgent;
        if (!TextUtils.isEmpty(str)) {
            if (httpParams != null) {
                httpParams.setParameter("http.useragent", str);
                return;
            }
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public static boolean testIsSSBinary(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf("application/octet-stream")) < 0 || str.indexOf("ssmix=", iIndexOf + 24) <= 0) {
            return false;
        }
        return true;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static String addCommonParams(String str, boolean z) {
        if (NetWorkInjectImpl.LIZJ().LIZ() != null) {
            return AppLog.addCommonParams(str, z);
        }
        return str;
    }

    public static String addGetRetryCountParam(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C0XI4 c0xi4 = new C0XI4(str);
            c0xi4.LJ("retry_type", str2);
            return c0xi4.LJFF();
        }
        return str;
    }

    public static List<C2259691DcV> addPostRetryCountParam(List<C2259691DcV> list, String str) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new C2259691DcV("retry_type", str));
        return list;
    }

    public static byte[] downloadFile(int i, String str) {
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb != null) {
            return interfaceC846090XHb.LIZJ(i, str);
        }
        return null;
    }

    public static String executeGet(int i, String str) {
        return executeGet(0, i, str, true, true);
    }

    public static String joinCommonParams(String str, List<C2259691DcV> list) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder(str);
            if (str.indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(C08NX.LIZIZ(list, "UTF-8"));
            return sb.toString();
        }
        return str;
    }

    public static void putCommonParams(List<C2259691DcV> list, boolean z) {
        if (NetWorkInjectImpl.LIZJ().LIZ() != null) {
            C2389509Xx.LIZIZ(list, z);
        }
    }

    public static void safeClose(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String tryDnsMapping(String str, String[] strArr) {
        EnumC846100XHc networkType;
        if (sUseDnsMapping > 0 && strArr != null && strArr.length > 0) {
            if ((str == null || !str.startsWith("https://")) && NetWorkInjectImpl.LIZJ().getAppContext() != null && (networkType = getNetworkType(C786410Ut5.N3(NetWorkInjectImpl.LIZJ().getAppContext()))) != null) {
                int[] iArr = C846110XHd.LIZ;
                networkType.ordinal();
                return str;
            }
            return str;
        }
        return str;
    }

    public static void addCacheValidationHeaders(List<InterfaceC846210XHn> list, String str, String str2) {
        if (list == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            list.add(new C2259671DcT("If-None-Match", str));
        }
        if (!TextUtils.isEmpty(str2)) {
            list.add(new C2259671DcT("If-Modified-Since", str2));
        }
    }

    public static String decodeSSBinary(byte[] bArr, int i, String str) {
        if (bArr != null && i > 0) {
            byte[] bArr2 = {-99, -114, 127, 90};
            int i2 = 0;
            do {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
                i2++;
            } while (i2 < i);
            return new String(bArr, 0, i, str);
        }
        return null;
    }

    public static String executeGet(int i, String str, List<C2259691DcV> list) {
        return executeGet(0, i, str, true, true, list);
    }

    public static String executePost(int i, String str, C846120XHe c846120XHe) {
        return executePost(0, i, str, c846120XHe, (C0XI0[]) null);
    }

    public static byte[] getBytes(InputStream inputStream, long j, String str) throws IOException {
        if (j <= 2147483647L) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 < 0) {
                    break;
                }
                i2 += i3;
            }
            if (i2 >= i) {
                inputStream.close();
                return bArr;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not completely read file ");
            sbLIZ.append(str);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("File is too large: ");
        sbLIZ2.append(str);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void handleApiOk(String str, long j, C846310XHx c846310XHx) {
        NetWorkInjectImpl.LIZJ().LIZ();
        TextUtils.isEmpty(str);
    }

    public static void jsonObjectToBasicNameValuePairs(List<C2259691DcV> list, JSONObject jSONObject, String str) throws JSONException {
        String strLIZIZ;
        String string;
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (TextUtils.isEmpty(str)) {
                strLIZIZ = next;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(e3.e);
                sbLIZ.append(next);
                sbLIZ.append(e3.f);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                jsonObjectToBasicNameValuePairs(list, (JSONObject) obj, strLIZIZ);
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    jsonObjectToBasicNameValuePairs(list, JSONArrayProtectorUtils.getJSONObject(jSONArray, i), strLIZIZ);
                }
            } else {
                if (obj == null) {
                    string = "";
                } else {
                    string = obj.toString();
                }
                list.add(new C2259691DcV(strLIZIZ, string));
            }
        }
    }

    public static byte[] stream2ByteArray(int i, InputStream inputStream, long j) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (j > 2147483647L) {
            inputStream.close();
            return null;
        }
        if (j < 0) {
            j = 4096;
        } else if (j > i) {
            inputStream.close();
            return null;
        }
        try {
            C846170XHj c846170XHj = new C846170XHj((int) j);
            byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            int i2 = 0;
            do {
                int i3 = inputStream.read(bArr);
                if (i3 != -1) {
                    c846170XHj.LIZ(bArr, i3);
                    i2 += i3;
                } else {
                    int i4 = c846170XHj.LIZIZ;
                    byte[] bArr2 = new byte[i4];
                    if (i4 > 0) {
                        System.arraycopy(c846170XHj.LIZ, 0, bArr2, 0, i4);
                    }
                    inputStream.close();
                    return bArr2;
                }
            } while (i2 <= i);
            inputStream.close();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            inputStream.close();
            throw th;
        }
    }

    public static String executeGet(int i, String str, boolean z) {
        return executeGet(0, i, str, z, true);
    }

    public static String executePost(int i, String str, List<C2259691DcV> list) {
        return executePost(0, i, str, list, (C0XI0[]) null);
    }

    public static String executeGet(int i, int i2, String str) {
        return executeGet(i, i2, str, true, true);
    }

    public static String executeGet(int i, String str, int i2, int i3) {
        return executeGet(0, i, str, true, true, (List<InterfaceC846210XHn>) null, (C846160XHi) null, true);
    }

    public static String executePost(String str, JSONObject jSONObject, String str2, List<InterfaceC846210XHn> list) throws JSONException, UnsupportedEncodingException {
        byte[] bytes;
        if (str2 != null && str2.startsWith("application/json")) {
            if (jSONObject == null) {
                bytes = null;
            } else {
                bytes = C786410Ut5.J3(jSONObject).getBytes("UTF-8");
            }
            return executePost(-1, str, bytes, EnumC796940VOa.GZIP, str2, list);
        }
        ArrayList arrayList = new ArrayList();
        jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
        return executePost(0, 0, str, arrayList, (C0XI0[]) null, list);
    }

    public static String executePut(String str, JSONObject jSONObject, String str2, List<InterfaceC846210XHn> list) throws JSONException, UnsupportedEncodingException {
        byte[] bytes;
        if (str2 != null && str2.startsWith("application/json")) {
            if (jSONObject == null) {
                bytes = null;
            } else {
                bytes = C786410Ut5.J3(jSONObject).getBytes("UTF-8");
            }
            return executePut(-1, str, bytes, EnumC796940VOa.GZIP, str2, list);
        }
        ArrayList arrayList = new ArrayList();
        jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
        return executePut(0, 0, str, arrayList, (C0XI0[]) null, list);
    }

    public static void handleApiError(String str, Throwable th, long j, C846310XHx c846310XHx) {
        if (!TextUtils.isEmpty(str) && th != null) {
            NetWorkInjectImpl.LIZJ().LIZ();
        }
    }

    public static String postFile(int i, String str, String str2, String str3) {
        C846120XHe c846120XHe = new C846120XHe();
        if (str3.startsWith("content://")) {
            Uri uri = UriProtector.parse(str3);
            InputStream inputStreamLJFF = C09N1.LJFF(NetWorkInjectImpl.LIZJ().getAppContext(), uri);
            long jLJII = C2400409as.LJII(NetWorkInjectImpl.LIZJ().getAppContext(), uri);
            String path = uri.getPath();
            c846120XHe.LIZ(str2, path, getBytes(inputStreamLJFF, jLJII, path));
        } else {
            c846120XHe.LIZIZ(new C0VSJ(str3), str2);
        }
        return executePost(0, i, str, c846120XHe);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2) {
        return executeGet(0, i, str, z, z2, (List<InterfaceC846210XHn>) null, (C846160XHi) null, true);
    }

    public static String executePost(int i, int i2, String str, C846120XHe c846120XHe) {
        return executePost(i, i2, str, c846120XHe, (C0XI0[]) null);
    }

    public static String executeGet(int i, int i2, String str, List<C2259691DcV> list) {
        return executeGet(i, i2, str, true, true, list);
    }

    public static String executePost(int i, int i2, String str, List<C2259691DcV> list) {
        return executePost(i, i2, str, list, (C0XI0[]) null);
    }

    public static String executeGet(int i, String str, boolean z, List<C2259691DcV> list) {
        return executeGet(0, i, str, z, true, list);
    }

    public static String executePost(int i, String str, C846120XHe c846120XHe, C0XI0[] c0xi0Arr) {
        return executePost(0, i, str, c846120XHe, c0xi0Arr);
    }

    public static String executeGet(int i, int i2, String str, boolean z) {
        return executeGet(i, i2, str, z, true);
    }

    public static String executePost(int i, String str, List<C2259691DcV> list, C0XI0[] c0xi0Arr) {
        return executePost(0, i, str, list, c0xi0Arr);
    }

    public static String executeDelete(int i, int i2, String str, List<InterfaceC846210XHn> list, List<C2259691DcV> list2) {
        if (str == null) {
            return null;
        }
        String strAddCommonParams = addCommonParams(str, true);
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb == null) {
            return null;
        }
        return interfaceC846090XHb.LIZLLL(i, i2, strAddCommonParams, list);
    }

    public static String executeGet(int i, String str, int i2, int i3, List<C2259691DcV> list) {
        return executeGet(0, i, str, true, true, null, null, true, list);
    }

    public static String executePost(int i, int i2, String str, C846120XHe c846120XHe, C0XI0[] c0xi0Arr) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        try {
            return executePostRetry(i, i2, str, c846120XHe, c0xi0Arr, addPostRetryCountParam(null, "no_retry"), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!TextUtils.isEmpty(str) && str.startsWith("https") && ((e instanceof SSLException) || (e instanceof GeneralSecurityException))) {
                return executePostRetry(i, i2, str, c846120XHe, c0xi0Arr, addPostRetryCountParam(null, "retry_http"), false);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executePostRetry(i, i2, str, c846120XHe, c0xi0Arr, addPostRetryCountParam(null, "first_retry"), false);
        }
    }

    public static String executePostFile(int i, int i2, String str, C846120XHe c846120XHe, List<C2259691DcV> list) {
        return executePostFile(i, i2, str, c846120XHe, null, list);
    }

    public static String executePostRetry(int i, int i2, String str, List<C2259691DcV> list, C0XI0[] c0xi0Arr) {
        return executePostRetry(i, i2, str, list, c0xi0Arr, null);
    }

    public static void monitorApiSample(long j, long j2, String str, String str2, C846310XHx c846310XHx) {
        InterfaceC794400VEg interfaceC794400VEg = sMonitorProcessHook;
        if (!TextUtils.isEmpty(str) && j > 0 && interfaceC794400VEg != null) {
            try {
                C794240VDq.LIZJ.submit(new ARunnableS0S2100200_13((C794430VEj) interfaceC794400VEg, str, str2, j, j2, 4));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String postFile(int i, String str, String str2, String str3, List<C2259691DcV> list) {
        C846120XHe c846120XHe = new C846120XHe();
        if (str3.startsWith("content://")) {
            Uri uri = UriProtector.parse(str3);
            InputStream inputStreamLJFF = C09N1.LJFF(NetWorkInjectImpl.LIZJ().getAppContext(), uri);
            long jLJII = C2400409as.LJII(NetWorkInjectImpl.LIZJ().getAppContext(), uri);
            String path = uri.getPath();
            c846120XHe.LIZ(str2, path, getBytes(inputStreamLJFF, jLJII, path));
        } else {
            c846120XHe.LIZIZ(new C0VSJ(str3), str2);
        }
        return executePostFile(0, i, str, c846120XHe, list);
    }

    public static String response2String(boolean z, boolean z2, int i, InputStream inputStream, String str) {
        int i2;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        if (str == null) {
            str = "UTF-8";
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                safeClose(inputStream);
                throw th;
            }
        }
        byte[] bArr = new byte[8192];
        int i3 = 0;
        do {
            try {
                if (i3 + SpeechEngineDefines.TTS_WORK_MODE_BOTH > bArr.length) {
                    byte[] bArr2 = new byte[bArr.length * 2];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    bArr = bArr2;
                }
                i2 = inputStream.read(bArr, i3, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
            } catch (EOFException e) {
                TryCatchGuardChecker.doCheck(e);
                if (!z || i3 <= 0) {
                    throw e;
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                String message = e2.getMessage();
                if (!z || i3 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                    throw e2;
                }
            }
            if (i2 > 0) {
                i3 += i2;
            } else {
                if (i3 > 0) {
                    if (z2) {
                        String strDecodeSSBinary = decodeSSBinary(bArr, i3, str);
                        safeClose(inputStream);
                        return strDecodeSSBinary;
                    }
                    String str2 = new String(bArr, 0, i3, str);
                    safeClose(inputStream);
                    return str2;
                }
                safeClose(inputStream);
                return null;
            }
        } while (i3 <= i);
        safeClose(inputStream);
        return null;
    }

    public static String response2StringOpt(boolean z, boolean z2, int i, InputStream inputStream, String str) {
        int i2;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        if (str == null) {
            str = "UTF-8";
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                safeClose(inputStream);
                throw th;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        do {
            try {
                i2 = inputStream.read(bArr, 0, 8192);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                if (!z) {
                    throw e;
                }
            }
            if (i2 != -1) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                if (byteArrayOutputStream.size() > 0) {
                    if (z2) {
                        String strDecodeSSBinary = decodeSSBinary(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size(), str);
                        safeClose(inputStream);
                        return strDecodeSSBinary;
                    }
                    String string = byteArrayOutputStream.toString(str);
                    safeClose(inputStream);
                    return string;
                }
                safeClose(inputStream);
                return null;
            }
        } while (byteArrayOutputStream.size() <= i);
        safeClose(inputStream);
        return null;
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<C2259691DcV> list) {
        return executeGet(0, i, str, z, z2, null, null, true, list);
    }

    public static String executePost(int i, int i2, String str, List<C2259691DcV> list, C0XI0[] c0xi0Arr) {
        return executePost(i, i2, str, list, c0xi0Arr, (List<InterfaceC846210XHn>) null);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4) {
        return executeGet(i, i2, str, true, true, (List<InterfaceC846210XHn>) null, (C846160XHi) null, true);
    }

    public static String executePost(int i, String str, byte[] bArr, EnumC796940VOa enumC796940VOa, String str2) {
        return executePost(i, str, bArr, enumC796940VOa, str2, (List<InterfaceC846210XHn>) null);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2) {
        return executeGet(i, i2, str, z, z2, (List<InterfaceC846210XHn>) null, (C846160XHi) null, true);
    }

    public static String executeGet(int i, int i2, String str, boolean z, List<C2259691DcV> list) {
        return executeGet(i, i2, str, z, true, list);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4, List<C2259691DcV> list) {
        return executeGet(i, i2, str, true, true, null, null, true, list);
    }

    public static String executePost(int i, int i2, String str, byte[] bArr, EnumC796940VOa enumC796940VOa, String str2) throws IOException {
        String str3;
        byte[] byteArray = bArr;
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null) {
            return null;
        }
        if (byteArray == null) {
            byteArray = new byte[0];
        }
        int length = byteArray.length;
        if (EnumC796940VOa.GZIP == enumC796940VOa) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(byteArray);
                gZIPOutputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
                str3 = "gzip";
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    gZIPOutputStream.close();
                    return null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    gZIPOutputStream.close();
                    throw th2;
                }
            }
        } else if (EnumC796940VOa.DEFLATER == enumC796940VOa && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(byteArray);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            byteArray = byteArrayOutputStream2.toByteArray();
            str3 = "deflate";
        } else {
            str3 = null;
        }
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb == null) {
            return null;
        }
        return interfaceC846090XHb.LJIIJJI(i, i2, str, str3, str2, byteArray);
    }

    public static String executePostFile(int i, int i2, String str, C846120XHe c846120XHe, C0XI0[] c0xi0Arr, List<C2259691DcV> list) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        try {
            return executePostFileRetry(i, i2, str, c846120XHe, c0xi0Arr, addPostRetryCountParam(list, "no_retry"), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!TextUtils.isEmpty(str) && str.startsWith("https") && ((e instanceof SSLException) || (e instanceof GeneralSecurityException))) {
                return executePostFileRetry(i, i2, str, c846120XHe, c0xi0Arr, addPostRetryCountParam(list, "retry_http"), false);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executePostFileRetry(i, i2, str, c846120XHe, c0xi0Arr, addPostRetryCountParam(list, "first_retry"), false);
        }
    }

    public static String executePostRetry(int i, int i2, String str, List<C2259691DcV> list, C0XI0[] c0xi0Arr, List<InterfaceC846210XHn> list2) {
        return executetRetry("post", i, i2, str, list, c0xi0Arr, list2);
    }

    public static String executePut(int i, String str, byte[] bArr, EnumC796940VOa enumC796940VOa, String str2, List<InterfaceC846210XHn> list) {
        if (str == null) {
            return null;
        }
        return execute("put", i, addCommonParams(str, true), bArr, enumC796940VOa, str2, list);
    }

    public static String executePutRetry(int i, int i2, String str, List<C2259691DcV> list, C0XI0[] c0xi0Arr, List<InterfaceC846210XHn> list2) {
        return executetRetry("put", i, i2, str, list, c0xi0Arr, list2);
    }

    public static void monitorApiError(long j, long j2, String str, String str2, C846310XHx c846310XHx, Throwable th) {
        InterfaceC794400VEg interfaceC794400VEg;
        if (!TextUtils.isEmpty(str) && th != null && (interfaceC794400VEg = sMonitorProcessHook) != null) {
            try {
                C794240VDq.LIZJ.submit(new ARunnableS1S2200200_13((C794430VEj) interfaceC794400VEg, str, th, str2, j, j2, 2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String postFile(int i, String str, String str2, String str3, Map<String, String> map, C0XI0[] c0xi0Arr) {
        C846120XHe c846120XHe = new C846120XHe();
        if (str3.startsWith("content://")) {
            Uri uri = UriProtector.parse(str3);
            InputStream inputStreamLJFF = C09N1.LJFF(NetWorkInjectImpl.LIZJ().getAppContext(), uri);
            long jLJII = C2400409as.LJII(NetWorkInjectImpl.LIZJ().getAppContext(), uri);
            String path = uri.getPath();
            c846120XHe.LIZ(str2, path, getBytes(inputStreamLJFF, jLJII, path));
        } else {
            c846120XHe.LIZIZ(new C0VSJ(str3), str2);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                ((HashSet) c846120XHe.LIZ).add(new C846200XHm(key, value));
            }
        }
        return executePost(0, i, str, c846120XHe, c0xi0Arr);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<C2259691DcV> list) {
        return executeGet(i, i2, str, z, z2, null, null, true, list);
    }

    public static String executePost(int i, String str, byte[] bArr, EnumC796940VOa enumC796940VOa, String str2, List<InterfaceC846210XHn> list) {
        if (str == null) {
            return null;
        }
        return execute("post", i, addCommonParams(str, true), bArr, enumC796940VOa, str2, list);
    }

    public static String executePut(int i, int i2, String str, List<C2259691DcV> list, C0XI0[] c0xi0Arr, List<InterfaceC846210XHn> list2) {
        return execute("put", i, i2, str, list, c0xi0Arr, list2);
    }

    public static String executePost(int i, int i2, String str, List<C2259691DcV> list, C0XI0[] c0xi0Arr, List<InterfaceC846210XHn> list2) {
        return execute("post", i, i2, str, list, c0xi0Arr, list2);
    }

    public static String execute(String str, int i, String str2, byte[] bArr, EnumC796940VOa enumC796940VOa, String str3, List<InterfaceC846210XHn> list) throws IOException {
        String str4;
        byte[] byteArray = bArr;
        if (!"get".equals(str)) {
            if (!"delete".equals(str)) {
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
                if (str2 != null && !TextUtils.isEmpty(str)) {
                    if (byteArray == null) {
                        byteArray = new byte[0];
                    }
                    int length = byteArray.length;
                    if (EnumC796940VOa.GZIP == enumC796940VOa) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(byteArray);
                            gZIPOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            str4 = "gzip";
                        } catch (Throwable th) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                gZIPOutputStream.close();
                                return null;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                gZIPOutputStream.close();
                                throw th2;
                            }
                        }
                    } else if (EnumC796940VOa.DEFLATER == enumC796940VOa && length > 128) {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
                        Deflater deflater = new Deflater();
                        deflater.setInput(byteArray);
                        deflater.finish();
                        byte[] bArr2 = new byte[8192];
                        while (!deflater.finished()) {
                            byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
                        }
                        deflater.end();
                        byteArray = byteArrayOutputStream2.toByteArray();
                        str4 = "deflate";
                    } else {
                        str4 = null;
                    }
                    InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
                    if (interfaceC846090XHb != null) {
                        if ("put".equals(str)) {
                            return interfaceC846090XHb.LJFF(i, str2, byteArray, str4, str3, list);
                        }
                        return interfaceC846090XHb.LJIIIIZZ(0, i, str2, byteArray, str4, str3, list);
                    }
                }
                return null;
            }
            throw new RuntimeException("This method does not support [delete]");
        }
        throw new RuntimeException("this method does not support [get]");
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<InterfaceC846210XHn> list, C846160XHi c846160XHi, boolean z3) {
        return executeGet(0, i, str, z, z2, list, c846160XHi, z3);
    }

    public static String executePostFileRetry(int i, int i2, String str, C846120XHe c846120XHe, C0XI0[] c0xi0Arr, List<C2259691DcV> list, boolean z) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String strJoinCommonParams = joinCommonParams(str, arrayList);
        list.addAll(arrayList);
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb == null) {
            return null;
        }
        return interfaceC846090XHb.LJIIIZ(i, i2, strJoinCommonParams, c846120XHe, c0xi0Arr, list);
    }

    public static String executePostRetry(int i, int i2, String str, C846120XHe c846120XHe, C0XI0[] c0xi0Arr, List<C2259691DcV> list, boolean z) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null) {
            return null;
        }
        putCommonParams(list, true);
        String strJoinCommonParams = joinCommonParams(str, list);
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb == null) {
            return null;
        }
        return interfaceC846090XHb.LJIIIZ(i, i2, strJoinCommonParams, c846120XHe, c0xi0Arr, list);
    }

    public static String executetRetry(String str, int i, int i2, String str2, List<C2259691DcV> list, C0XI0[] c0xi0Arr, List<InterfaceC846210XHn> list2) {
        if (str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (!"get".equals(str)) {
            if (!"delete".equals(str)) {
                ArrayList arrayList = new ArrayList();
                putCommonParams(arrayList, true);
                String strJoinCommonParams = joinCommonParams(str2, arrayList);
                list.addAll(arrayList);
                InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
                if (interfaceC846090XHb == null) {
                    return null;
                }
                if ("put".equals(str)) {
                    return interfaceC846090XHb.LJIIJ(i, i2, strJoinCommonParams, list, c0xi0Arr, list2);
                }
                return interfaceC846090XHb.LJII(i, i2, strJoinCommonParams, list, c0xi0Arr, list2);
            }
            throw new RuntimeException("executetRetry does not support [delete]");
        }
        throw new RuntimeException("executetRetry does not support [get]");
    }

    public static String postData(int i, String str, String str2, byte[] bArr, String str3, Map<String, String> map, C0XI0[] c0xi0Arr) {
        C846120XHe c846120XHe = new C846120XHe();
        c846120XHe.LIZ(str2, str3, bArr);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                ((HashSet) c846120XHe.LIZ).add(new C846200XHm(key, value));
            }
        }
        return executePost(0, i, str, c846120XHe, c0xi0Arr);
    }

    public static String uploadFile(int i, String str, String str2, String str3, InterfaceC846270XHt interfaceC846270XHt, long j, C0XI0[] c0xi0Arr) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str != null && !TextUtils.isEmpty(str3)) {
            C0VSJ c0vsj = new C0VSJ(str3);
            C846120XHe c846120XHe = new C846120XHe();
            c846120XHe.LIZIZ(c0vsj, str2);
            ArrayList arrayList = new ArrayList();
            putCommonParams(arrayList, true);
            String strJoinCommonParams = joinCommonParams(str, arrayList);
            InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
            if (interfaceC846090XHb != null) {
                return interfaceC846090XHb.LIZ(i, strJoinCommonParams, c846120XHe, j, c0xi0Arr);
            }
            return null;
        }
        return null;
    }

    public static String execute(String str, int i, int i2, String str2, List<C2259691DcV> list, C0XI0[] c0xi0Arr, List<InterfaceC846210XHn> list2) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
        try {
            return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "no_retry"), c0xi0Arr, list2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!TextUtils.isEmpty(str2) && str2.startsWith("https")) {
                if (!isHitNoHttpList(str2)) {
                    return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "retry_http"), c0xi0Arr, list2);
                }
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
                return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "first_retry"), c0xi0Arr, list2);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
            return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "first_retry"), c0xi0Arr, list2);
        }
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<InterfaceC846210XHn> list, C846160XHi c846160XHi, boolean z3) {
        return executeGet(i, i2, str, z, z2, list, c846160XHi, z3, null);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<InterfaceC846210XHn> list, C846160XHi c846160XHi, boolean z3, List<C2259691DcV> list2) {
        return executeGet(0, i, str, z, z2, list, c846160XHi, z3, list2);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<InterfaceC846210XHn> list, C846160XHi c846160XHi, boolean z3, List<C2259691DcV> list2) {
        try {
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executeGetRetry(i, i2, addGetRetryCountParam(str, "no_retry"), z, list, c846160XHi, z3, list2, z2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!TextUtils.isEmpty(str) && str.startsWith("https") && ((e instanceof SSLException) || (e instanceof GeneralSecurityException))) {
                if (!isHitNoHttpList(str)) {
                    return executeGetRetry(i, i2, addGetRetryCountParam(str, "retry_http"), z, list, c846160XHi, z3, list2, z2);
                }
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
                return executeGetRetry(i, i2, addGetRetryCountParam(str, "first_retry"), z, list, c846160XHi, z3, list2, z2);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executeGetRetry(i, i2, addGetRetryCountParam(str, "first_retry"), z, list, c846160XHi, z3, list2, z2);
        }
    }

    public static String executeGetRetry(int i, int i2, String str, boolean z, List<InterfaceC846210XHn> list, C846160XHi c846160XHi, boolean z2, List<C2259691DcV> list2, boolean z3) {
        if (str == null) {
            return null;
        }
        if (z3) {
            str = addCommonParams(str, true);
        }
        if (!mAllowKeepAlive) {
            z = false;
        }
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb == null) {
            return null;
        }
        return interfaceC846090XHb.LJ(i, i2, str, z, list, c846160XHi, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:
    
        if (r11 <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
    
        r0.seek(0);
        r1 = new X.C0VSV(new X.C0VSJ(r8, r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f7, code lost:
    
        r4 = r0.read(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        if (r4 == (-1)) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fd, code lost:
    
        r1.write(r3, 0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0102, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0106, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0107, code lost:
    
        r10 = null;
        r0 = r0;
        r1 = r1;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0109, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010a, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0111, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0114, code lost:
    
        r6.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        safeClose(null, "close instream exception ");
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0123, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0124, code lost:
    
        r10 = null;
        r0 = 0;
        r1 = 0;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0128, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0129, code lost:
    
        r10 = null;
        r1 = 0;
        r0 = r0;
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean stream2File(java.io.InputStream r16, long r17, X.InterfaceC846320XHy r19, final int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, X.InterfaceC846250XHr<java.lang.String> r24, java.lang.String r25, X.C09U9 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.stream2File(java.io.InputStream, long, X.0XHy, int, java.lang.String, java.lang.String, java.lang.String, X.0XHr, java.lang.String, X.09U9):boolean");
    }

    public static boolean downloadFile(int i, String str, String str2, String str3, String str4, InterfaceC846250XHr<String> interfaceC846250XHr, String str5, C09U9 c09u9, List<C2259691DcV> list, String[] strArr, int[] iArr) {
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb != null) {
            return interfaceC846090XHb.LJI(i, str, str2, str3, str4, interfaceC846250XHr, str5, list, strArr, iArr);
        }
        return false;
    }

    public static boolean downloadVideo(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, InterfaceC846250XHr<String> interfaceC846250XHr, String str2, C09U9 c09u9, List<C2259691DcV> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        InterfaceC846090XHb interfaceC846090XHb = C846280XHu.LIZ;
        if (interfaceC846090XHb != null) {
            return interfaceC846090XHb.LIZIZ(i, str, stringBuffer, stringBuffer2, stringBuffer3, interfaceC846250XHr, str2, list, strArr, iArr);
        }
        return false;
    }
}
