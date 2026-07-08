package com.ss.android.ugc.aweme.util;

import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0VSJ;
import X.C20174813wo;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C452501pT;
import X.C487601v8;
import X.C487801vA;
import X.EnumC1533980q1M;
import X.InterfaceC1364105Vn;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS48S2100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class DMGreetingCardGeckoChannelManager implements IDMGreetingCardGeckoChannelManager {
    public static final DMGreetingCardGeckoChannelManager LIZ = new DMGreetingCardGeckoChannelManager();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(156));
    public static final Map<String, Map<String, String>> LIZJ = new ConcurrentHashMap();
    public static final Map<String, String> LIZLLL = new ConcurrentHashMap();

    public static final class Service implements IDMGreetingCardGeckoChannelManager {
        public final /* synthetic */ DMGreetingCardGeckoChannelManager LIZ = DMGreetingCardGeckoChannelManager.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
        public final Object LIZ(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZ.LIZ(str, str2, str3, str4, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
        public final Object LIZIZ(String str, String str2, String str3, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
            return this.LIZ.LIZIZ(str, str2, str3, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
        public final Object LIZJ(String str, String str2, String str3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZ.LIZJ(str, str2, str3, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
        public final Map<String, String> LIZLLL(String str) {
            return this.LIZ.LIZLLL(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
        public final String LJ(String str) {
            return this.LIZ.LJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
    public final Map<String, String> LIZLLL(String str) {
        Map<String, String> map = (Map) ((ConcurrentHashMap) LIZJ).get(str);
        if (map == null) {
            return new ConcurrentHashMap();
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
    public final String LJ(String str) {
        return (String) ((ConcurrentHashMap) LIZLLL).get(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
    public final Object LIZIZ(String str, String str2, String str3, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        String str4;
        Map map = (Map) ((ConcurrentHashMap) LIZJ).get(str2);
        if (map != null && (str4 = (String) map.get(str3)) != null && new C0VSJ(str4).exists()) {
            return str4;
        }
        C487801vA c487801vA = new C487801vA((Forest) LIZIZ.getValue());
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.disableBuiltin = true;
        requestParams.resourceScene = EnumC1533980q1M.OTHER;
        requestParams.enableRequestReuse = true;
        requestParams.enableMemoryCache = true;
        requestParams.enableCDNCache = true;
        requestParams.waitGeckoUpdate = true;
        requestParams.channel = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('/');
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ);
        c487801vA.invoke("", requestParams, new AwS48S2100000_30(str2, str3, c2252611DEt, 0));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0050 -> B:11:0x0036). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r13, java.lang.String r14, java.lang.String r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r12 = this;
            r3 = r16
            r8 = r13
            r9 = r14
            boolean r0 = r3 instanceof X.C20174713wn
            if (r0 == 0) goto La3
            r5 = r3
            X.13wn r5 = (X.C20174713wn) r5
            int r2 = r5.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r5.LLIZLLLIL = r2
        L16:
            java.lang.Object r1 = r5.LLILZLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLIZLLLIL
            com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager r3 = com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager.LIZ
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto Lad
            int r7 = r5.LLILZIL
            int r6 = r5.LLILZ
            X.0Zna[] r0 = r5.LLILLL
            java.lang.Object r9 = r5.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r1)
        L36:
            int r6 = r6 + 1
        L38:
            if (r6 >= r7) goto Laa
            r1 = r0[r6]
            java.lang.String r1 = r1.getValue()
            r5.LL = r8
            r5.LLILLJJLI = r9
            r5.LLILLL = r0
            r5.LLILZ = r6
            r5.LLILZIL = r7
            r5.LLIZLLLIL = r2
            java.lang.Object r1 = r3.LIZIZ(r8, r9, r1, r5)
            if (r1 != r4) goto L36
            return r4
        L53:
            X.C155000ia.LIZIZ(r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager.LIZJ
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.get(r9)
            if (r0 != 0) goto L68
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.put(r9, r0)
        L68:
            if (r15 == 0) goto L9c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "/pregenerated_texts/"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ".json"
            r1.append(r0)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r1)
            X.01v7 r7 = new X.01v7
            X.01GW r0 = com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.forest.Forest r0 = (com.bytedance.forest.Forest) r0
            r7.<init>(r0)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.01bV r6 = new X.01bV
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r11, r11, r6, r0)
        L9c:
            X.0Zna[] r0 = X.EnumC910400Zna.values()
            int r7 = r0.length
            r6 = 0
            goto L38
        La3:
            X.13wn r5 = new X.13wn
            r5.<init>(r12, r3)
            goto L16
        Laa:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager.LIZJ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Object LJFF(String str, String str2, String str3, String str4, C20174813wo c20174813wo) {
        String str5;
        Map map = (Map) ((ConcurrentHashMap) LIZJ).get(str2);
        if (map != null && (str5 = (String) map.get(str4)) != null && new C0VSJ(str5).exists()) {
            return str5;
        }
        C487601v8 c487601v8 = new C487601v8((Forest) LIZIZ.getValue());
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c20174813wo));
        c2252611DEt.LJIJJ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.disableBuiltin = true;
        requestParams.resourceScene = EnumC1533980q1M.OTHER;
        requestParams.enableRequestReuse = true;
        requestParams.enableMemoryCache = true;
        requestParams.enableCDNCache = true;
        requestParams.waitGeckoUpdate = true;
        requestParams.channel = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('/');
        sbLIZ.append(str2);
        sbLIZ.append(str4);
        requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ);
        c487601v8.invoke(str3, requestParams, new AwS48S2100000_30(str2, str4, c2252611DEt, 2));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c20174813wo);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C20174813wo
            if (r0 == 0) goto L65
            r4 = r11
            X.13wo r4 = (X.C20174813wo) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r5 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L40
            if (r0 != r2) goto L6b
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            X.0CGj r0 = X.EnumC310830CGj.MESSAGE_CLOSE_IMAGE
            java.lang.String r0 = r0.getPath()
            r4.LL = r7
            r4.LLILLJJLI = r8
            r4.LLILLL = r10
            r4.LLILZLL = r1
            java.lang.Object r0 = LJFF(r7, r8, r9, r0, r4)
            if (r0 != r3) goto L4f
            return r3
        L40:
            java.lang.Object r10 = r4.LLILLL
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r4.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r4.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r5)
        L4f:
            X.0CGj r0 = X.EnumC310830CGj.MESSAGE_OPEN_IMAGE
            java.lang.String r1 = r0.getPath()
            r0 = 0
            r4.LL = r0
            r4.LLILLJJLI = r0
            r4.LLILLL = r0
            r4.LLILZLL = r2
            java.lang.Object r0 = LJFF(r7, r8, r10, r1, r4)
            if (r0 != r3) goto L25
            return r3
        L65:
            X.13wo r4 = new X.13wo
            r4.<init>(r6, r11)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager.LIZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
