package com.bytedance.ies.ugc.aweme.network;

import X.C08I7;
import X.InterfaceC2661011f;
import com.bytedance.retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public class TTRetrofit implements InterfaceC2661011f {
    public static final C08I7<String, Retrofit> LIZ = new C08I7<>(10);
    public Retrofit retrofit;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:358)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v28 java.util.Collection<?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public TTRetrofit(X.C1499850p8J r5) {
        /*
            r4 = this;
            r4.<init>()
            X.01GW r0 = X.C310450CEx.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 == 0) goto L7a
            java.lang.String r1 = r5.LIZ
            java.lang.String r0 = "webcast"
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L7a
            int r0 = r5.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.08I7<java.lang.String, com.bytedance.retrofit2.Retrofit> r1 = com.bytedance.ies.ugc.aweme.network.TTRetrofit.LIZ
            java.lang.Object r0 = r1.LIZIZ(r2)
            com.bytedance.retrofit2.Retrofit r0 = (com.bytedance.retrofit2.Retrofit) r0
            r4.retrofit = r0
            if (r0 != 0) goto L3d
            com.bytedance.ies.ugc.aweme.network.INetworkKitDepend r0 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.LIZ
            com.bytedance.retrofit2.Retrofit r0 = r0.LIZJ(r5)
            r4.retrofit = r0
            r1.LIZLLL(r2, r0)
        L3d:
            X.01GW r0 = X.C1908207dg.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.ies.ugc.aweme.network.interceptor.PnsZoneConfig r0 = (com.bytedance.ies.ugc.aweme.network.interceptor.PnsZoneConfig) r0
            if (r0 != 0) goto L49
            com.bytedance.ies.ugc.aweme.network.interceptor.PnsZoneConfig r0 = X.C1908207dg.LIZ
        L49:
            boolean r0 = r0.enableRemoveInterceptors
            if (r0 == 0) goto L79
            java.lang.Integer r0 = r5.LJIIJ
            if (r0 == 0) goto L79
            int r0 = r0.intValue()
            r2 = 3
            if (r2 != r0) goto L79
            com.bytedance.retrofit2.Retrofit r0 = r4.retrofit
            java.util.List<X.07d9> r0 = r0.LJIIIIZZ
            r0.removeAll(r0)
            com.bytedance.retrofit2.Retrofit r0 = r4.retrofit
            java.util.List<X.07d9> r1 = r0.LJIIIIZZ
            com.bytedance.ies.ugc.aweme.network.interceptor.PnSIsolationZoneInterceptor r0 = new com.bytedance.ies.ugc.aweme.network.interceptor.PnSIsolationZoneInterceptor
            r0.<init>(r2, r3)
            r1.add(r0)
            com.bytedance.retrofit2.Retrofit r0 = r4.retrofit
            java.util.List<X.07d9> r2 = r0.LJIIIIZZ
            com.bytedance.helios.network.ttnet.TTNetMonitorInterceptor r1 = new com.bytedance.helios.network.ttnet.TTNetMonitorInterceptor
            java.lang.String r0 = "QAtMWRYoUMzVQQ=="
            r1.<init>(r0)
            r2.add(r1)
        L79:
            return
        L7a:
            com.bytedance.ies.ugc.aweme.network.INetworkKitDepend r0 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.LIZ
            com.bytedance.retrofit2.Retrofit r0 = r0.LIZJ(r5)
            r4.retrofit = r0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.network.TTRetrofit.<init>(X.0p8J):void");
    }

    @Override // X.InterfaceC2661011f
    public final <T> T create(Class<T> cls) {
        return (T) this.retrofit.LIZ(cls);
    }
}
