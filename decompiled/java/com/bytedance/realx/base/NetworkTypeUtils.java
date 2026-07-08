package com.bytedance.realx.base;

import X.C08FF;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C838410Wul;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkTypeUtils {
    public static String debugInfo = "";
    public static NetworkTypeInterceptor sNetworkTypeInterceptor;

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6);

        public final int nativeInt;

        public boolean isAvailable() {
            return this != NONE;
        }

        public int getValue() {
            return this.nativeInt;
        }

        public static NetworkType valueOf(String str) {
            return (NetworkType) C08FF.LIZ(NetworkType.class, str);
        }

        NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    public interface NetworkTypeInterceptor {
        NetworkType getNetworkType();
    }

    /* JADX INFO: renamed from: com.bytedance.realx.base.NetworkTypeUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType = iArr;
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE_5G.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkType.MOBILE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    public static String getDebugInfo() {
        return debugInfo;
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);

        public final int nativeInt;

        public static CompressType valueOf(String str) {
            return (CompressType) C08FF.LIZ(CompressType.class, str);
        }

        CompressType(int i) {
            this.nativeInt = i;
        }
    }

    public static int getNetWorkTypeThroughBPEA(Context context) throws Throwable {
        int iIntValue;
        int dataNetworkType;
        Object obj;
        Method declaredMethod;
        Method declaredMethod2;
        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
        try {
            Class<?> cls = Class.forName("com.bytedance.bpea.entry.api.device.info.TelephonyManagerEntry");
            Class<?> cls2 = Class.forName("com.bytedance.bpea.basics.Cert");
            Class<?> cls3 = Class.forName("com.bytedance.bpea.cert.token.TokenCert");
            declaredMethod = cls.getDeclaredMethod("getNetworkType", TelephonyManager.class, cls2);
            declaredMethod2 = cls3.getDeclaredMethod("with", String.class);
        } catch (Exception e) {
            e = e;
            iIntValue = -1;
        }
        if (declaredMethod != null && declaredMethod2 != null) {
            iIntValue = ((Integer) C2204961BRm.a0(declaredMethod, null, new Object[]{telephonyManager, declaredMethod2.invoke(null, "bpea-rtc_generic_device_info")}, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8r52h9+LJliU94WQPqF6DGs=", null))).intValue();
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(debugInfo);
                sbLIZ.append(" getNetworkType through BPEA;");
                debugInfo = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                Logging.i("NetworkTypeUtils", "BPEA not exist");
            }
            if (iIntValue != -1) {
                return iIntValue;
            }
        }
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8r52h9+LJliU94WQPqF6DGs=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()I", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10908, "android/telephony/TelephonyManager", "getDataNetworkType", telephonyManager, objArr, "int", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10908, "android/telephony/TelephonyManager", "getDataNetworkType", null, objArr, telephonyManager, c0wzw, false);
            dataNetworkType = ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                telephonyManager = (TelephonyManager) obj;
            }
            dataNetworkType = telephonyManager.getDataNetworkType();
            c0wst.LIZ(10908, "android/telephony/TelephonyManager", "getDataNetworkType", Integer.valueOf(dataNetworkType), objArr, telephonyManager, c0wzw, true);
        }
        int iIntValue2 = Integer.valueOf(dataNetworkType).intValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(debugInfo);
        sbLIZ2.append(" getNetworkType through system;");
        debugInfo = C2188811AlT.LIZIZ(sbLIZ2);
        return iIntValue2;
    }

    public static String getNetworkAccessType(NetworkType networkType) {
        try {
            switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[networkType.ordinal()]) {
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static boolean is2G(Context context) {
        NetworkType networkType = getNetworkType(context, null);
        if (networkType != NetworkType.MOBILE && networkType != NetworkType.MOBILE_2G) {
            return false;
        }
        return true;
    }

    public static boolean isIpv4(String str) {
        return Pattern.matches("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$", str);
    }

    public static boolean isIpv6(String str) {
        return Pattern.matches("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$", str);
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null) {
                return false;
            }
            if (!networkInfoLJIJ.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null || !networkInfoLJIJ.isAvailable()) {
                return false;
            }
            NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
            if (networkTypeInterceptor != null && networkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
                if (sNetworkTypeInterceptor.getNetworkType() != NetworkType.WIFI) {
                    return false;
                }
                return true;
            }
            if (1 != C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8r52h9+LJliU94WQPqF6DGs=", null))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void setNetworkTypeInterceptor(NetworkTypeInterceptor networkTypeInterceptor) {
        sNetworkTypeInterceptor = networkTypeInterceptor;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context, null));
    }

    public static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    public static String format(List<Pair<String, String>> list, String str) {
        String strEncode;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String strEncode2 = encode((String) pair.first, str);
            String str2 = (String) pair.second;
            if (str2 != null) {
                strEncode = encode(str2, str);
            } else {
                strEncode = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(strEncode2);
            sb.append("=");
            sb.append(strEncode);
        }
        return sb.toString();
    }

    public static NetworkType getNetworkType(Context context, Intent intent) {
        int iLJLL;
        NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
        if (networkTypeInterceptor != null && networkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
            return sNetworkTypeInterceptor.getNetworkType();
        }
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ != null) {
                networkInfoLJIJ.isAvailable();
            } else if (intent != null && ((networkInfoLJIJ = isNetWorkConnected(context, intent)) == null || !networkInfoLJIJ.isAvailable())) {
                Logging.i("NetworkTypeUtils", "-----------info is null");
                return NetworkType.NONE;
            }
            int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8r52h9+LJliU94WQPqF6DGs=", null));
            debugInfo = "NetworkInfo type:" + iLJLLILLLL;
            if (1 == iLJLLILLLL) {
                return NetworkType.WIFI;
            }
            if (iLJLLILLLL == 0) {
                if (C838410Wul.LIZ(context, "android.permission.READ_PHONE_STATE") == 0) {
                    debugInfo += " getNetworkType through TelephoneManager;";
                    iLJLL = getNetWorkTypeThroughBPEA(context);
                } else {
                    iLJLL = C2204961BRm.LJLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8r52h9+LJliU94WQPqF6DGs=", null));
                    debugInfo += " getNetworkType through ConnectivityManager;";
                }
                debugInfo += " TelephonyManager type:" + iLJLL;
                switch (iLJLL) {
                    case 0:
                        return NetworkType.UNKNOWN;
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case 16:
                        return NetworkType.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case 14:
                    case 15:
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        return NetworkType.MOBILE_3G;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        return NetworkType.MOBILE_4G;
                    case 19:
                    default:
                        return NetworkType.UNKNOWN;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        return NetworkType.MOBILE_5G;
                }
            }
            return NetworkType.MOBILE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            debugInfo = th.toString();
            return NetworkType.UNKNOWN;
        }
    }

    public static NetworkInfo isNetWorkConnected(Context context, Intent intent) {
        NetworkInfo networkInfo;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null) {
            if (NetworkInfo.State.CONNECTED == networkInfo.getState() && networkInfo.isAvailable()) {
                if (C2204961BRm.LJLLILLLL(networkInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8r52h9+LJliU94WQPqF6DGs=", null)) == 1 || C2204961BRm.LJLLILLLL(networkInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8r52h9+LJliU94WQPqF6DGs=", null)) == 0) {
                    Logging.i("NetworkTypeUtils", "-------networkInfo wifi or mobile is connected");
                }
                return networkInfo;
            }
            Logging.i("NetworkTypeUtils", "------networkInfo is discconnected");
        }
        return null;
    }

    public static void registerReceiver(Context context, BroadcastReceiver broadcastReceiver) throws Exception {
        if (broadcastReceiver != null && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            C786410Ut5.LJIJJ(C786410Ut5.N3(context), broadcastReceiver, intentFilter);
        }
    }

    public static void unregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null && context != null) {
            try {
                C786410Ut5.LJJIFFI(C786410Ut5.N3(context), broadcastReceiver);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregisterReceiver exception: ");
                sbLIZ.append(e.toString());
                Logging.i("NetworkTypeUtils", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
