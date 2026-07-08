package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network;

import X.InterfaceC859903Xp;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultNetworkDependencyService implements INetworkDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService
    public InterfaceC859903Xp createBuilder(final String str) {
        return new InterfaceC859903Xp() { // from class: X.0pXB
            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZ(InterfaceC1904907d9 interfaceC1904907d9) {
                return this;
            }

            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZIZ(NetworkPartner networkPartner) {
                return this;
            }

            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZJ() {
                return this;
            }

            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZLLL(C1507090pJz c1507090pJz) {
                return this;
            }

            @Override // X.InterfaceC859903Xp
            public final C01K1 build() {
                final String str2 = str;
                return new C01K1() { // from class: X.0pX1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                    @Override // X.C01K1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final <T> T create(java.lang.Class<T> r8) throws java.lang.Throwable {
                        /*
                            r7 = this;
                            X.0pX4 r6 = new X.0pX4
                            r6.<init>()
                            java.lang.String r0 = r1
                            r6.LIZLLL(r0)
                            X.0oyT r0 = new X.0oyT
                            r0.<init>()
                            r6.LIZIZ = r0
                            X.0pXF r0 = new java.util.concurrent.Executor() { // from class: X.0pXF
                                static {
                                    /*
                                        X.0pXF r0 = new X.0pXF
                                        r0.<init>()
                                        
                                        // error: 0x0005: SPUT (r0 I:X.0pXF) X.0pXF.LL X.0pXF
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.ExecutorC1515310pXF.<clinit>():void");
                                }

                                {
                                    /*
                                        r0 = this;
                                        r0.<init>()
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.ExecutorC1515310pXF.<init>():void");
                                }

                                @Override // java.util.concurrent.Executor
                                public final void execute(java.lang.Runnable r1) {
                                    /*
                                        r0 = this;
                                        r1.run()
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.ExecutorC1515310pXF.execute(java.lang.Runnable):void");
                                }
                            }
                            r6.LJI = r0
                            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.C0X15.LIZ()
                            boolean r0 = r0.enable
                            r5 = 0
                            java.lang.String r3 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3b+ZO5KAXkfZy2awyP91kbX+H6ZOcnwqFP2pRcHJpvIJLZzGAOiTIzmY8shc0KWcY5117ssJTjvvgub0="
                            r4 = 0
                            if (r0 == 0) goto L5a
                            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on(r6)     // Catch: java.lang.Throwable -> L56
                            java.lang.String r1 = "clientProvider"
                            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L56
                            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch: java.lang.Throwable -> L56
                            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L56
                            X.0p0G r0 = (X.InterfaceC1494860p0G) r0     // Catch: java.lang.Throwable -> L56
                            X.0oyU r2 = r0.get()     // Catch: java.lang.Throwable -> L56
                            java.lang.String r1 = "com.ss.android.ugc.aweme.app.api.OkClient"
                            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L56
                            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L56
                            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L56
                            if (r0 != 0) goto L4c
                            boolean r0 = r2 instanceof X.C1493780oyW     // Catch: java.lang.Throwable -> L56
                            if (r0 != 0) goto L4c
                            goto L5a
                        L4c:
                            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L56
                            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L56
                            com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r6, r0)     // Catch: java.lang.Throwable -> L56
                            goto L8b
                        L56:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        L5a:
                            X.0WZX r0 = new X.0WZX
                            r0.<init>(r3, r5)
                            com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r6, r0)
                            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                            if (r1 == 0) goto L8b
                            com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor
                            r0.<init>()
                            r1.add(r0)
                            java.util.List<X.07d9> r0 = r3.LJIIIIZZ
                            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
                            X.07d9 r2 = (X.InterfaceC1904907d9) r2
                            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                            com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor
                            r0.<init>(r2)
                            com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r4, r0)
                            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                            com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor
                            r0.<init>()
                            r1.add(r0)
                        L8b:
                            java.lang.Object r0 = r3.LIZ(r8)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1515170pX1.create(java.lang.Class):java.lang.Object");
                    }
                };
            }
        };
    }
}
