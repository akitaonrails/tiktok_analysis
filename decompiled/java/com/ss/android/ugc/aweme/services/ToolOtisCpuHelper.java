package com.ss.android.ugc.aweme.services;

import X.C093Y;
import X.C13LP;
import X.C798360VTm;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ToolOtisCpuHelper {
    public static final Companion Companion = new Companion();
    public final C798360VTm otisCpu;
    public final int threadIdGc;
    public final int threadIdRender;

    public static final class Companion {
        public final ToolOtisCpuHelper create() {
            return new ToolOtisCpuHelper();
        }
    }

    public ToolOtisCpuHelper() {
        Map<String, Integer> threadName2IdMap = getThreadName2IdMap(C093Y.LIZJ("HeapTaskDaemon", "RenderThread"));
        Integer num = threadName2IdMap.get("HeapTaskDaemon");
        int iIntValue = num != null ? num.intValue() : 0;
        this.threadIdGc = iIntValue;
        Integer num2 = threadName2IdMap.get("RenderThread");
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        this.threadIdRender = iIntValue2;
        ArrayList arrayList = new ArrayList();
        if (iIntValue > 0) {
            arrayList.add(Integer.valueOf(iIntValue));
        }
        if (iIntValue2 > 0) {
            arrayList.add(Integer.valueOf(iIntValue2));
        }
        this.otisCpu = new C798360VTm(false, C13LP.LLII(arrayList), 23);
    }

    public final C798360VTm getOtisCpu() {
        return this.otisCpu;
    }

    public final int getThreadIdGc() {
        return this.threadIdGc;
    }

    public final int getThreadIdRender() {
        return this.threadIdRender;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x006a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private final java.util.Map<java.lang.String, java.lang.Integer> getThreadName2IdMap(java.util.Set<java.lang.String> r8) {
        /*
            r7 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "/proc/self/task"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L72
            java.io.File[] r0 = r1.listFiles()     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L80
            X.089E r5 = new X.089E     // Catch: java.lang.Exception -> L72
            r5.<init>(r0)     // Catch: java.lang.Exception -> L72
        L17:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L80
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L72
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Exception -> L72
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "comm"
            r1.<init>(r6, r0)     // Catch: java.lang.Exception -> L72
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L17
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L72
            X.0VSF r0 = new X.0VSF     // Catch: java.lang.Exception -> L72
            r0.<init>(r1)     // Catch: java.lang.Exception -> L72
            r4.<init>(r0)     // Catch: java.lang.Exception -> L72
            r2 = 0
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L62
            boolean r0 = r8.contains(r1)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L54
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> L62
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L62
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L62
        L54:
            X.C2107108Nh.LIZ(r4, r2)     // Catch: java.lang.Exception -> L72
            int r1 = r8.size()     // Catch: java.lang.Exception -> L72
            int r0 = r3.size()     // Catch: java.lang.Exception -> L72
            if (r1 != r0) goto L17
            return r3
        L62:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6a
            throw r1     // Catch: java.lang.Throwable -> L67
        L67:
            r0 = move-exception
            r2 = r1
            goto L6b
        L6a:
            r0 = move-exception
        L6b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6a
            X.C2107108Nh.LIZ(r4, r2)     // Catch: java.lang.Exception -> L72
            throw r0     // Catch: java.lang.Exception -> L72
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            java.lang.String r0 = "getThreadName2IdMap Failed"
            X.C1AF0.LJFF(r1, r0)
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.ToolOtisCpuHelper.getThreadName2IdMap(java.util.Set):java.util.Map");
    }

    public final double getThreadCpuSpeed(int i) {
        Map<Integer, Long> map;
        Long l;
        if (i <= 0 || (map = this.otisCpu.LJI.LJIIIIZZ) == null || (l = map.get(Integer.valueOf(i))) == null) {
            return -1.0d;
        }
        long jLongValue = l.longValue();
        long j = this.otisCpu.LJI.LJII;
        if (j <= 0) {
            return -1.0d;
        }
        return jLongValue / j;
    }

    public final double getThreadCpuUsage(int i) {
        Map<Integer, Long> map;
        Long l;
        if (i <= 0 || (map = this.otisCpu.LJI.LJIIIIZZ) == null || (l = map.get(Integer.valueOf(i))) == null) {
            return -1.0d;
        }
        long jLongValue = l.longValue();
        long j = this.otisCpu.LJI.LJ;
        if (j <= 0) {
            return -1.0d;
        }
        return jLongValue / j;
    }
}
