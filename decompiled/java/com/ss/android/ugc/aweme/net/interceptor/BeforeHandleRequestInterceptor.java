package com.ss.android.ugc.aweme.net.interceptor;

import X.C01GW;
import X.C098200Yq;
import X.C0C8O;
import X.C0CC2;
import X.C0CD2;
import X.C0WZX;
import X.C0X35;
import X.C0X52;
import X.C13LP;
import X.C1490400ot4;
import X.C1494590ozp;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C717610SCx;
import X.C827060WcS;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.app.Activity;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class BeforeHandleRequestInterceptor implements InterfaceC1904907d9 {
    public static final ConcurrentHashMap<String, Long> LLILLJJLI = new ConcurrentHashMap<>(4);
    public final InterfaceC1904907d9 LL;

    public BeforeHandleRequestInterceptor(InterfaceC1904907d9 interfaceC1904907d9) {
        this.LL = interfaceC1904907d9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LIZ(String str) {
        if (str != null && str.length() >= 9) {
            try {
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                int length2 = charArray.length;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                boolean z = false;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    char c = charArray[i];
                    if (c != '/') {
                        if (c == '?') {
                            length2 = i - 1;
                            if (charArray[length2] != '/') {
                                length2 = i;
                            }
                        }
                    } else {
                        i2++;
                        if (i2 > 3 && i - i3 > 31) {
                            z = true;
                        }
                        if (i2 == 3) {
                            i4 = i + 1;
                        }
                        if (i == length - 1) {
                            length2 = i - 1;
                        }
                        i3 = i;
                    }
                    i++;
                }
                if (length2 - i3 <= 31) {
                    i3 = length2;
                }
                String strSubstring = str.substring(i4, i3);
                if (z) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strSubstring, new String[]{"/"}, 0, 6);
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = C13LP.LLIIL(listLJJLIIIJILLIZJL).iterator();
                    while (true) {
                        C717610SCx c717610SCx = (C717610SCx) it2;
                        if (c717610SCx.hasNext()) {
                            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                            if (((String) indexedValue.LIZIZ).length() < 31) {
                                sb.append((String) indexedValue.LIZIZ);
                                if (indexedValue.LIZ < listLJJLIIIJILLIZJL.size() - 1) {
                                    sb.append('/');
                                }
                            }
                        } else {
                            return sb.toString();
                        }
                    }
                } else {
                    return strSubstring;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return "";
            }
        } else {
            return "";
        }
    }

    public static void LIZIZ(String str) {
        Object c098200Yq;
        try {
            TTNetInit.preconnectUrl(str);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZJ(String str) {
        C01GW c01gw = C0CD2.LJJJ;
        if (((Number) c01gw.getValue()).intValue() == 0) {
            return;
        }
        if (((Number) c01gw.getValue()).intValue() == 1) {
            C01GW c01gw2 = C0CD2.LJJJI;
            if (((Set) c01gw2.getValue()).isEmpty()) {
                return;
            }
            Uri uri = UriProtector.parse(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getScheme());
            sbLIZ.append("://");
            sbLIZ.append(uri.getHost());
            sbLIZ.append(uri.getPath());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            for (String str2 : (Set) c01gw2.getValue()) {
                if (a0.LJJIIZI(strLIZIZ, str2, false)) {
                    ConcurrentHashMap<String, Long> concurrentHashMap = LLILLJJLI;
                    Long l = concurrentHashMap.get(str2);
                    if (l == null || System.currentTimeMillis() - l.longValue() > ((Number) C0CD2.LJJJIL.getValue()).intValue() * LSPassThroughRecordSizeConfig.DEFAULT) {
                        concurrentHashMap.put(str2, Long.valueOf(System.currentTimeMillis()));
                        LIZIZ(strLIZIZ);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (((Number) c01gw.getValue()).intValue() == 2) {
            LIZIZ(str);
        }
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String strLJJIJIIJIL;
        C0X52 c0x52Intercept;
        ComponentName componentName;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        int iMyTid = Process.myTid();
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            String strLIZ = LIZ(request.getUrl());
            String str = "SsHttpCall@" + strLIZ;
            C1C7U.LIZ(str);
            C0CC2.LIZ(request.getPath(), true);
            int i = C827060WcS.LIZ;
            C827060WcS.LIZ(request.getPath());
            LIZJ(request.getUrl());
            C1490400ot4.LIZ.getClass();
            C1490400ot4.LJFF(iMyTid, request);
            C1490400ot4.LIZLLL(request);
            if (C0C8O.LIZ(request)) {
                c0x52Intercept = this.LL.intercept(interfaceC841770X0l);
                C0CC2.LIZ(request.getPath(), false);
                C1C7U.LIZIZ(str);
                C0X35.LJIILLIIL(strLIZ, c0x52Intercept, jUptimeMillis, jCurrentThreadTimeMillis);
            } else {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF == null || (componentName = activityLJFF.getComponentName()) == null || (strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOStd9HH0iZCsGgWPu5D9zvFacrBypDjzUzYuoTiEs2RBaHHqTpxX5zG9TX0LM8=", null))) == null) {
                    strLJJIJIIJIL = "unknown";
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                c0x52Intercept = this.LL.intercept(interfaceC841770X0l);
                C0CC2.LIZ(request.getPath(), false);
                C0C8O.LIZJ(request, c0x52Intercept, jCurrentTimeMillis, strLJJIJIIJIL);
                C1C7U.LIZIZ(str);
                C0X35.LJIILLIIL(strLIZ, c0x52Intercept, jUptimeMillis, jCurrentThreadTimeMillis);
            }
            C1490400ot4.LJ(iMyTid, request);
            C1490400ot4.LIZJ(request);
            return c0x52Intercept;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1490400ot4.LIZ.getClass();
            C1490400ot4.LJ(iMyTid, request);
            C1490400ot4.LIZJ(request);
            throw th;
        }
    }
}
