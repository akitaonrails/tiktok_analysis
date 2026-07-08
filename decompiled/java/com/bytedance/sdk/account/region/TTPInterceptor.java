package com.bytedance.sdk.account.region;

import X.C01GW;
import X.C080U;
import X.C0XH6;
import X.C0XLO;
import X.C0XMB;
import X.C0XOZ;
import X.C13LP;
import X.C1974107oJ;
import X.C452501pT;
import X.C838780WvM;
import X.C847850XNv;
import X.C847910XOb;
import X.InterfaceC1904907d9;
import com.bytedance.retrofit2.client.Request;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPInterceptor implements InterfaceC1904907d9 {
    public static final List<String> LLILLL = Collections.singletonList("/passport/user/basic_info/");
    public final C0XH6 LL;
    public final C01GW LLILLJJLI;

    public TTPInterceptor() {
        this(C847850XNv.LIZ);
    }

    public TTPInterceptor(C0XH6 c0xh6) {
        this.LL = c0xh6;
        this.LLILLJJLI = C452501pT.LIZIZ(new C0XOZ());
        C847910XOb.LIZ.getClass();
        C847910XOb.LJIIIZ = c0xh6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LIZIZ(java.lang.String r8) throws java.io.UnsupportedEncodingException {
        /*
            r7 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.name()
            java.lang.String r1 = java.net.URLDecoder.decode(r8, r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r6 = 0
            r4 = 1
            if (r1 == 0) goto L1a
            int r0 = r1.length()     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L54
            java.lang.String r0 = "&"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L50
            r3 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r1, r0, r6, r3)     // Catch: java.lang.Exception -> L50
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L50
        L2e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L54
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L50
            java.lang.String r0 = "="
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L50
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r1, r0, r6, r3)     // Catch: java.lang.Exception -> L50
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Exception -> L50
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> L50
            r5.put(r1, r0)     // Catch: java.lang.Exception -> L50
            goto L2e
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.region.TTPInterceptor.LIZIZ(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0629  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.region.TTPInterceptor.intercept(X.0X0l):X.0X52");
    }

    public final Request LIZ(Request request, String str, String str2) {
        ArrayList arrayList;
        Method method;
        Class<?> declaringClass;
        List<C080U> headers = request.getHeaders();
        if (headers != null) {
            arrayList = new ArrayList(headers);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(new C080U("x-tt-bypass-dp", "1"));
        String url = request.getUrl();
        C1974107oJ c1974107oJ = (C1974107oJ) request.tag(C1974107oJ.class);
        String name = null;
        if (c1974107oJ != null && (method = c1974107oJ.LIZ) != null && (declaringClass = method.getDeclaringClass()) != null) {
            name = declaringClass.getName();
        }
        List<String> list = this.LL.get().validInvocationList;
        if (list == null || list.isEmpty() || C13LP.LJJJJ(name, list)) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((C080U) next).LIZ, "x-tt-passport-csrf-token")) {
                    if (next == null) {
                        break;
                    }
                }
            }
            arrayList.add(new C080U("x-tt-passport-csrf-token", C838780WvM.LIZ(url, "TTPInterceptor")));
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        C0XLO c0xloLIZJ = C0XLO.LIZJ(request.getUrl());
        c0xloLIZJ.LIZLLL(str);
        if (str2 != null && str2.length() != 0) {
            c0xloLIZJ.LJI.LIZIZ("device_redirect_info", str2);
        }
        c0xmbNewBuilder.LIZJ(c0xloLIZJ.LIZIZ());
        c0xmbNewBuilder.LIZJ = arrayList;
        return c0xmbNewBuilder.LIZ();
    }
}
