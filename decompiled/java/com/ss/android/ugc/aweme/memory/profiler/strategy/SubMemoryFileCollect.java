package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.core.HprofBridge;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class SubMemoryFileCollect {
    public static final SubMemoryFileCollect INSTANCE = new SubMemoryFileCollect();

    private final void invokeBitmapDumpAll(String str) {
        try {
            Method declaredMethod = Class.forName("android.graphics.Bitmap").getDeclaredMethod("dumpAll", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:53:0x012e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final com.google.gson.n collectSmaps(android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.memory.profiler.strategy.SubMemoryFileCollect.collectSmaps(android.content.Context):com.google.gson.n");
    }

    public final n collectHprof(Context context, String str) {
        String str2;
        String str3 = "";
        boolean z = false;
        long length = 0;
        try {
            File fileY2 = C786410Ut5.y2(context, "hprof");
            if (fileY2 == null) {
                str2 = "";
            } else {
                if (!fileY2.exists()) {
                    fileY2.mkdirs();
                }
                String str4 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.US).format(new Date(System.currentTimeMillis()));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str4);
                sbLIZ.append(".hprof");
                C0VSJ c0vsj = new C0VSJ(fileY2, C2188811AlT.LIZIZ(sbLIZ));
                System.currentTimeMillis();
                HprofBridge.snapshotBitmapSizes();
                System.currentTimeMillis();
                if (str != null && Build.VERSION.SDK_INT >= 35) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    INSTANCE.invokeBitmapDumpAll(str);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("dumpAllBitmapCost:");
                    sbLIZ2.append(jCurrentTimeMillis2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                System.currentTimeMillis();
                Debug.dumpHprofData(c0vsj.getAbsolutePath());
                System.currentTimeMillis();
                if (str != null && Build.VERSION.SDK_INT >= 35) {
                    invokeBitmapDumpAll(null);
                }
                String absolutePath = c0vsj.getAbsolutePath();
                try {
                    String name = c0vsj.getName();
                    length = c0vsj.length();
                    z = true;
                    str2 = name;
                    str3 = absolutePath;
                } catch (Exception e) {
                    e = e;
                    str2 = str3;
                    str3 = absolutePath;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "";
        }
        n nVar = new n();
        nVar.LJJII(Boolean.valueOf(z), "ok");
        if (z) {
            nVar.LJJIIJ("path", str3);
            nVar.LJJIIJ("name", str2);
            nVar.LJJIII(Long.valueOf(length), "size");
        }
        return nVar;
    }
}
