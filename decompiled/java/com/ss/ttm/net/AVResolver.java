package com.ss.ttm.net;

import X.C1324350kZF;
import X.C1471820oP6;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.net.AVResolver;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes21.dex */
public class AVResolver {
    public static int LJFF = 600000;
    public static final Hashtable<String, C1324350kZF> LJI = new Hashtable<>();
    public String LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public String[] LIZLLL;
    public C1324350kZF LJ;

    public void freeAddress() {
    }

    public String getAddress() {
        String[] strArr;
        if (this.LIZIZ && (strArr = this.LIZLLL) != null && strArr[0] != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAddress return ip:");
            sbLIZ.append(this.LIZLLL[0]);
            C2188811AlT.LIZIZ(sbLIZ);
            return this.LIZLLL[0];
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("parser host name: ");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(" error.err msg:");
        sbLIZ2.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public int isSuccess() {
        if (!this.LIZIZ) {
            return 0;
        }
        String[] strArr = this.LIZLLL;
        return (strArr == null || strArr[0] == null) ? -1 : 1;
    }

    public void getAddressInfo(String str) {
        this.LIZ = str;
        if (TextUtils.isEmpty(str)) {
            this.LIZIZ = true;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAddressInfo start.hostname:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        String str2 = this.LIZ;
        if (str2.length() < 7 || str2.length() > 15 ? !(str2.charAt(0) != '[' || str2.charAt(str2.length() - 1) != ']') : PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getAddressInfo is ip.ip:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LIZLLL = new String[]{this.LIZ};
            this.LIZIZ = true;
            return;
        }
        Hashtable<String, C1324350kZF> hashtable = LJI;
        C1324350kZF c1324350kZF = hashtable.get(str);
        this.LJ = c1324350kZF;
        if (c1324350kZF != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getAddressInfo first find in cache.hostname:");
            sbLIZ3.append(str);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (this.LJ.LIZ != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1324350kZF c1324350kZF2 = this.LJ;
                if (jCurrentTimeMillis - c1324350kZF2.LIZIZ < LJFF) {
                    this.LIZLLL = new String[]{c1324350kZF2.LIZ};
                    this.LIZIZ = true;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("getAddressInfo hit cached:ip:");
                    sbLIZ4.append(this.LJ.LIZ);
                    sbLIZ4.append(",time:");
                    sbLIZ4.append(this.LJ.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    return;
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getAddressInfo cache is to long.hostname:");
            sbLIZ5.append(str);
            C2188811AlT.LIZIZ(sbLIZ5);
            hashtable.remove(str);
            this.LJ = null;
        }
        try {
            final String str3 = this.LIZ;
            C1471820oP6.LIZ(new Runnable(this, str3) { // from class: X.0kZE
                public final AVResolver LL;
                public final String LLILLJJLI;

                /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #1 {, blocks: (B:15:0x0045, B:16:0x0049, B:18:0x0053, B:19:0x005c, B:21:0x0062, B:23:0x007c, B:28:0x0089, B:31:0x00a4, B:30:0x00a1), top: B:41:0x0045, inners: #0 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        r12 = this;
                        r4 = 0
                        java.lang.String r0 = r12.LLILLJJLI     // Catch: java.lang.Throwable -> L15
                        java.net.InetAddress r5 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Throwable -> L15
                        X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> L13
                        java.lang.String r0 = "dzBzEhEpEd7IWBkvQAbKR8WJR1hBuXHhRQ=="
                        r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L13
                        java.lang.String r3 = X.C2204961BRm.d0(r5, r1)     // Catch: java.lang.Throwable -> L13
                        goto L23
                    L13:
                        r0 = move-exception
                        goto L17
                    L15:
                        r0 = move-exception
                        r5 = r4
                    L17:
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        com.ss.ttm.net.AVResolver r1 = r12.LL
                        java.lang.String r0 = r0.getMessage()
                        r1.LIZJ = r0
                        r3 = r4
                    L23:
                        com.ss.ttm.net.AVResolver r2 = r12.LL
                        r0 = 1
                        r2.LIZIZ = r0
                        if (r5 == 0) goto Lb4
                        if (r3 == 0) goto Lb4
                        java.lang.String[] r1 = new java.lang.String[r0]
                        r2.LIZLLL = r1
                        r0 = 0
                        r1[r0] = r3
                        X.0kZF r6 = new X.0kZF
                        r6.<init>()
                        long r0 = java.lang.System.currentTimeMillis()
                        r6.LIZIZ = r0
                        r6.LIZ = r3
                        java.lang.String r7 = r12.LLILLJJLI
                        java.lang.Class<com.ss.ttm.net.AVResolver> r11 = com.ss.ttm.net.AVResolver.class
                        monitor-enter(r11)
                        long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb1
                        java.util.Hashtable<java.lang.String, X.0kZF> r2 = com.ss.ttm.net.AVResolver.LJI     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        int r1 = r2.size()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        r0 = 128(0x80, float:1.8E-43)
                        if (r1 <= r0) goto La4
                        java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        r0 = r4
                    L5c:
                        boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        if (r1 == 0) goto L85
                        java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        X.0kZF r5 = (X.C1324350kZF) r5     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        if (r5 == 0) goto L5c
                        long r2 = r5.LIZIZ     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                        if (r1 >= 0) goto L5c
                        r0 = r5
                        r9 = r2
                        goto L5c
                    L85:
                        if (r0 == 0) goto La4
                        if (r4 == 0) goto La4
                        java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.lang.String r1 = "putHostInfo remove host cache"
                        r2.append(r1)     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.lang.String r0 = r0.LIZ     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        r2.append(r0)     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        java.util.Hashtable<java.lang.String, X.0kZF> r0 = com.ss.ttm.net.AVResolver.LJI     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        r0.remove(r4)     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> Lb1
                        goto La4
                    La0:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb1
                    La4:
                        java.util.Hashtable<java.lang.String, X.0kZF> r0 = com.ss.ttm.net.AVResolver.LJI     // Catch: java.lang.Throwable -> Lb1
                        r0.put(r7, r6)     // Catch: java.lang.Throwable -> Lb1
                        monitor-exit(r11)
                        long r0 = java.lang.System.currentTimeMillis()
                        r6.LIZIZ = r0
                        return
                    Lb1:
                        r0 = move-exception
                        monitor-exit(r11)
                        throw r0
                    Lb4:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1324340kZE.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AVResolver$ParserHost@798c.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AVResolver$ParserHost@798c.run");
                }

                {
                    this.LL = this;
                    this.LLILLJJLI = str3;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ = true;
            this.LIZJ = e.getMessage();
        }
    }
}
