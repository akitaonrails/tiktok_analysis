package com.ss.android.ugc.tiktok.pns.kidsmode;

import X.C08Q1;
import X.C08RX;
import X.C098200Yq;
import X.C0C64;
import X.C0WSU;
import X.C0WSV;
import X.C0WZW;
import X.C13LQ;
import X.C189200o6;
import X.C202094145s;
import X.C2188811AlT;
import X.C825900Waa;
import X.C826550Wbd;
import X.C848230XPh;
import android.content.ClipData;
import android.net.MacAddress;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class KShieldSystemApiActionInvoker implements C0WSV {
    public static final C826550Wbd Companion = new Object() { // from class: X.0Wbd
    };
    public static final C0WSU PASS = new C0WSU(false, null);
    public static final C825900Waa isInvoking = new ThreadLocal<Boolean>() { // from class: X.0Waa
        @Override // java.lang.ThreadLocal
        public final Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    public static final Set<Integer> MONITORED_API_IDS = C13LQ.LJLIIL(new Integer[]{101803, 10975, 10976, 10977, 10978, 10979, 10224, 2777, 10906, 2778, 910011, 100015, 100014, 10226, 101700, 101701, 10233, 10221, 101000, 10985, 101001, 102301, 10986, 10232, 10220, 101100, 101600, 102015, 101601, 101602, 102004, 102003, 103001, 103005, 103000, 3085, 101500, 101400, 101200, 102002, 100912, 100909, 10335, 2801, 100910, 10925, 10278, 10281, 10282, 10277, 10285, 10286, 10288, 10289, 10294, 10301, 10920, 10921, 10047, 10051, 101304, 101305, 10877, 101309, 101308, 101300, 2788, 101302, 101301});

    @Override // X.C0WSV
    public String name() {
        return "KShieldSystemApiActionInvoker";
    }

    @Override // X.C0WSV
    public void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
    }

    private final Object emptyWifiInfo() {
        try {
            Constructor declaredConstructor = WifiInfo.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            if (Build.VERSION.SDK_INT < 31) {
                return null;
            }
            try {
                return new WifiInfo.Builder().build();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                return null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x014d, code lost:
    
        return java.lang.Double.valueOf(0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0152, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0157, code lost:
    
        return (byte) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015c, code lost:
    
        return (char) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0163, code lost:
    
        return 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0169, code lost:
    
        return java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x016e, code lost:
    
        return (short) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r2.equals("double") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r2.equals("B") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r2.equals("C") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r2.equals("D") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r2.equals("F") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r2.equals("I") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r2.equals("J") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r2.equals("S") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        if (r2.equals("int") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        if (r2.equals("byte") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        if (r2.equals("char") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        if (r2.equals("long") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
    
        if (r2.equals("boolean") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        if (r2.equals("Z") != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d4, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        if (r2.equals("float") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
    
        if (r2.equals("short") == false) goto L10;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object defaultByReturnType(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.kidsmode.KShieldSystemApiActionInvoker.defaultByReturnType(java.lang.String):java.lang.Object");
    }

    private final Object sanitizedValueFor(int i, String str) {
        switch (i) {
            case 2777:
            case 2778:
            case 10220:
            case 10221:
            case 10232:
            case 10233:
            case 101000:
            case 101100:
            case 101200:
            case 101400:
            case 101500:
            case 101600:
            case 101601:
            case 101602:
            case 102002:
            case 102003:
            case 102004:
            case 102015:
                return "";
            case 2788:
            case 101300:
            case 101301:
            case 101302:
                return new ArrayList();
            case 2801:
            case 10925:
            case 100910:
            case 100912:
            case 103000:
            case 103001:
                return null;
            case 3085:
            case 103005:
                return "00000000-0000-0000-0000-000000000000";
            case 10047:
            case 10051:
            case 10877:
            case 101304:
            case 101305:
            case 101308:
            case 101309:
                return new ArrayList();
            case 10224:
            case 10277:
            case 10278:
            case 10281:
            case 10282:
            case 10286:
            case 10288:
            case 10289:
            case 10294:
            case 10301:
            case 10920:
            case 10921:
            case 10975:
            case 10976:
            case 10977:
            case 10978:
            case 10979:
            case 10985:
            case 10986:
                return 0;
            case 10226:
                return MacAddress.fromString("02:00:00:00:00:00");
            case 10285:
                return 0L;
            case 10335:
            case 100909:
                return new ArrayList();
            case 10906:
                return new byte[16];
            case 100014:
            case 100015:
            case 101700:
                return "02:00:00:00:00:00";
            case 101001:
                return new ArrayList();
            case 101701:
                return new byte[6];
            case 101803:
                return ClipData.newPlainText("", "");
            case 102301:
                return emptyWifiInfo();
            case 910011:
                return InetAddress.getLoopbackAddress();
            default:
                return defaultByReturnType(str);
        }
    }

    private final C0WSU doPreInvoke(int i, String str, String str2, String str3) {
        Object c098200Yq;
        if (C202094145s.LJIIL == 0) {
            return PASS;
        }
        if (!MONITORED_API_IDS.contains(Integer.valueOf(i))) {
            return PASS;
        }
        if (!C08Q1.LIZJ()) {
            try {
                c098200Yq = Boolean.valueOf(C848230XPh.LL.LJFF());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            if (!((Boolean) c098200Yq).booleanValue()) {
                return PASS;
            }
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (str == null) {
                str = "unknown";
            }
            sbLIZ.append(str);
            sbLIZ.append('#');
            if (str2 == null) {
                str2 = "unknown";
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("blocked_api", strLIZIZ);
            jSONObject.put("blocked_api_id", i);
            jSONObject.put("block_source", "system_api");
            C08RX.LIZ.getClass();
            C08RX.LIZJ(jSONObject);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "kids_kshield_system_api_hard_block", true, false)) {
            return PASS;
        }
        return new C0WSU(true, sanitizedValueFor(i, str3));
    }

    @Override // X.C0WSV
    public C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
        C825900Waa c825900Waa = isInvoking;
        if (c825900Waa.get().booleanValue()) {
            return PASS;
        }
        c825900Waa.set(Boolean.TRUE);
        try {
            C0WSU c0wsuDoPreInvoke = doPreInvoke(i, str, str2, str3);
            c825900Waa.set(Boolean.FALSE);
            return c0wsuDoPreInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            isInvoking.set(Boolean.FALSE);
            throw th;
        }
    }
}
