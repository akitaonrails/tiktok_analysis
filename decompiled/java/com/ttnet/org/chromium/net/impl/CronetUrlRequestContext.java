package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC1495350p13;
import X.AbstractC1497340p4G;
import X.AbstractC1497630p4j;
import X.AbstractC1497700p4q;
import X.AbstractC1497770p4x;
import X.AbstractC1498350p5t;
import X.AbstractC1498430p61;
import X.C08RN;
import X.C08VH;
import X.C1336210ksN;
import X.C1495360p14;
import X.C1497110p3t;
import X.C1497210p43;
import X.C1497640p4k;
import X.C1498410p5z;
import X.C1498440p62;
import X.C1498460p64;
import X.C1498470p65;
import X.C1498490p67;
import X.C1499120p78;
import X.C1499130p79;
import X.C1991707r9;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import X.EnumC1497200p42;
import X.EnumC1498420p60;
import X.ExecutorC1497250p47;
import X.InterfaceC1498130p5X;
import X.InterfaceC1498450p63;
import Y.ARunnableS123S0100000_23;
import android.app.Application;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingSetting;
import com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$ThreadConfigInfo;
import com.ttnet.org.chromium.net.f0;
import com.ttnet.org.chromium.net.g0;
import com.ttnet.org.chromium.net.k0;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.File;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public class CronetUrlRequestContext extends d {
    public static final HashSet<String> LJJJI = new HashSet<>();
    public final Object LIZ;
    public final ConditionVariable LIZIZ;
    public final AtomicInteger LIZJ;
    public final long LIZLLL;
    public Thread LJ;
    public final boolean LJFF;
    public final Object LJI;
    public final Object LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final C1499130p79<C1498470p65> LJIIL;
    public final C1499130p79<C1498490p67> LJIILIIL;
    public final Map<AbstractC1495350p13, C1495360p14> LJIILJJIL;
    public final Object LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public String[] LJIJJ;
    public int[] LJIJJLI;
    public int[] LJIL;
    public final double[] LJJ;
    public final double[] LJJI;
    public final double[] LJJIFFI;
    public final double[] LJJII;
    public final TTAppInfoProvider LJJIII;
    public final AbstractC1497630p4j LJJIIJ;
    public final AbstractC1498350p5t LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final Object LJJIIZI;
    public final InterfaceC1498450p63 LJJIJ;
    public final Map<EnumC1497200p42, Integer> LJJIJIIJI;
    public final Map<EnumC1497200p42, EnumC1498420p60> LJJIJIIJIL;
    public final ConditionVariable LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public final long LJJIL;
    public final int LJJIZ;
    public final AbstractC1497770p4x LJJJ;

    private void onColdStartFinish() {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onColdStartFinish();
        }
    }

    private TTAppInfoProvider.AppInfo onGetAppInfo() {
        TTAppInfoProvider tTAppInfoProvider = this.LJJIII;
        if (tTAppInfoProvider != null) {
            return tTAppInfoProvider.getAppInfo();
        }
        return null;
    }

    private void onTLBDecompressFail() {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onTLBDecompressFail();
        }
    }

    @Override // com.ttnet.org.chromium.net.e
    public final f0 LIZ() {
        return new TTCronetMpaService(this);
    }

    @Override // com.ttnet.org.chromium.net.e
    public final void LJI() {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                if (!this.LJJIJL || this.LJJIJLIJ) {
                    return;
                }
                N.ML5dVOOG(this.LIZLLL, this);
                this.LJJIJLIJ = true;
                this.LJJIJIL.block();
                this.LJJIJIL.close();
                synchronized (this.LIZ) {
                    try {
                        this.LJJIJLIJ = false;
                        this.LJJIJL = false;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJIIJJI() {
        synchronized (this.LIZ) {
            try {
                N.MK0SE_Ub(this.LIZLLL, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIILL() {
        int i;
        if (!this.LJFF) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.LJI) {
            try {
                i = this.LJIIJJI;
                if (i == -1) {
                    i = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIILLIIL() {
        int i;
        if (!this.LJFF) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.LJI) {
            try {
                i = this.LJIIIIZZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIIZILJ() {
        int i;
        synchronized (this.LJIILL) {
            try {
                i = this.LJIIZILJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIJ() {
        int i;
        synchronized (this.LJIILL) {
            try {
                i = this.LJIJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIJI() {
        int i;
        synchronized (this.LJIILL) {
            try {
                i = this.LJIJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final Map<String, int[]> LJIJJ() {
        if (!this.LJFF) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        HashMap map = new HashMap();
        synchronized (this.LJI) {
            try {
                if (this.LJIJJ == null) {
                    return map;
                }
                int i = 0;
                while (true) {
                    String[] strArr = this.LJIJJ;
                    if (i >= strArr.length) {
                        return map;
                    }
                    map.put(strArr[i], new int[]{this.LJIJJLI[i], this.LJIL[i]});
                    i++;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIJJLI() {
        int i;
        if (!this.LJFF) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.LJI) {
            try {
                i = this.LJIIIZ;
                if (i == -1) {
                    i = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIL() {
        int i;
        synchronized (this.LJIILL) {
            try {
                i = this.LJIILLIIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final List<Long> LJJ() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.LIZ) {
            try {
                for (long j : N.MlOQJZ8w()) {
                    arrayList.add(Long.valueOf(j));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJJI() {
        int i;
        if (!this.LJFF) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.LJI) {
            try {
                i = this.LJIIJ;
                if (i == -1) {
                    i = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIJL() {
        synchronized (this.LIZ) {
            try {
                N.MaSOyuXL(this.LIZLLL, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJJLL() {
        if (this.LIZLLL == 0) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    public final long LJJL() {
        long j;
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                j = this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return j;
    }

    public void stopNetLogCompleted() {
        this.LJJIJIL.open();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.07r9] */
    public static C1991707r9 LJJJLIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cronet/");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("107.0.5273.2@");
        sbLIZ2.append("aaaa579f");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        final String str = C2188811AlT.LIZIZ(sbLIZ).split("/")[1].split(e3.g)[0];
        return new Object(str) { // from class: X.07r9
            public final int LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;

            public final String toString() {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("");
                sbLIZ3.append(this.LIZ);
                sbLIZ3.append(e3.d);
                sbLIZ3.append(this.LIZIZ);
                sbLIZ3.append(e3.d);
                sbLIZ3.append(this.LIZJ);
                sbLIZ3.append(e3.d);
                sbLIZ3.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ3);
            }

            {
                String[] strArrSplit = str.split("\\.");
                this.LIZ = CastIntegerProtector.parseInt(strArrSplit[0]);
                this.LIZIZ = CastIntegerProtector.parseInt(strArrSplit[1]);
                this.LIZJ = CastIntegerProtector.parseInt(strArrSplit[2]);
                this.LIZLLL = CastIntegerProtector.parseInt(strArrSplit[3]);
            }
        };
    }

    private void initNetworkThread() {
        this.LJ = C786410Ut5.u3();
        this.LIZIZ.open();
        Thread threadU3 = C786410Ut5.u3();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChromiumNet");
        sbLIZ.append(Process.getThreadPriority(0));
        ThreadMethodProxy.setName(threadU3, C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onCronetBootSucceed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CronetUrlRequestContext(final com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl r9) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.<init>(com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl):void");
    }

    public static File LJJJJZI(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static String LJJJLZIJ(Map map) {
        String strLIZIZ = "";
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!str.isEmpty() && !str2.isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(":");
                    sbLIZ.append(str2);
                    sbLIZ.append("\r\n");
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return strLIZIZ;
    }

    public static long LJJJZ(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String absolutePath;
        int i;
        long j;
        byte[][] bArr;
        String str = "";
        try {
            File fileLJJJJZI = LJJJJZI(cronetEngineBuilderImpl.LIZ);
            absolutePath = fileLJJJJZI != null ? fileLJJJJZI.getAbsolutePath() : "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            absolutePath = "";
        }
        String str2 = cronetEngineBuilderImpl.LJ;
        String str3 = cronetEngineBuilderImpl.LJFF;
        boolean z = cronetEngineBuilderImpl.LJI;
        if (z) {
            str = cronetEngineBuilderImpl.LIZ.getPackageName() + " Cronet/TTNetVersion:3a9f3ddf 2026-06-25 QuicVersion:c3b23989 2026-06-25";
        }
        boolean z2 = cronetEngineBuilderImpl.LJII;
        boolean z3 = cronetEngineBuilderImpl.LJIIIIZZ;
        boolean z4 = !cronetEngineBuilderImpl.LJIIIZ.LLILLJJLI;
        if (C1336210ksN.LIZ()) {
            i = 0;
        } else {
            i = cronetEngineBuilderImpl.LJIIIZ.LL;
        }
        if (C1336210ksN.LIZ()) {
            j = 0;
        } else {
            j = cronetEngineBuilderImpl.LJIIJ;
        }
        Object[] array = null;
        boolean z5 = cronetEngineBuilderImpl.LJIIJJI;
        boolean z6 = cronetEngineBuilderImpl.LIZLLL;
        int i2 = cronetEngineBuilderImpl.LJIIL;
        if (i2 == 20) {
            i2 = 0;
        }
        long jMmo_MQVE = N.Mmo_MQVE(str2, str3, z, str, z2, z3, z4, i, j, null, 0L, z5, z6, i2);
        if (jMmo_MQVE != 0) {
            for (C1498440p62 c1498440p62 : cronetEngineBuilderImpl.LIZIZ) {
                N.M6WZ7Wt0(jMmo_MQVE, c1498440p62.LIZ, c1498440p62.LIZIZ, c1498440p62.LIZJ);
            }
            Iterator<C1498460p64> it2 = cronetEngineBuilderImpl.LIZJ.iterator();
            if (!it2.hasNext()) {
                ArrayList<byte[]> arrayList = cronetEngineBuilderImpl.LJIJI;
                if (arrayList != null && !arrayList.isEmpty()) {
                    bArr = (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
                } else {
                    bArr = null;
                }
                ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> arrayList2 = cronetEngineBuilderImpl.LJJIL;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    array = arrayList2.toArray(new TTThreadConfigInfoProvider$ThreadConfigInfo[arrayList2.size()]);
                }
                N.MawZO189(jMmo_MQVE, cronetEngineBuilderImpl.LJJIIJZLJL, cronetEngineBuilderImpl.LJIILIIL, cronetEngineBuilderImpl.LJIILJJIL, absolutePath, cronetEngineBuilderImpl.LJJ, cronetEngineBuilderImpl.LJIJ, cronetEngineBuilderImpl.LJJI, cronetEngineBuilderImpl.LJIJJLI, cronetEngineBuilderImpl.LJIL, bArr, array, cronetEngineBuilderImpl.LJJIFFI, cronetEngineBuilderImpl.LJJIIZ, cronetEngineBuilderImpl.LJJIIZI, cronetEngineBuilderImpl.LJJIJ, cronetEngineBuilderImpl.LJJIJIIJI, cronetEngineBuilderImpl.LJJIJLIJ, cronetEngineBuilderImpl.LJJIJIIJIL, cronetEngineBuilderImpl.LJJIJIL, cronetEngineBuilderImpl.LJJIJL, cronetEngineBuilderImpl.LJJJ, cronetEngineBuilderImpl.LJJJI, cronetEngineBuilderImpl.LJJJIL, cronetEngineBuilderImpl.LJJJJ);
                Map<String[], Pair<byte[], byte[]>> map = cronetEngineBuilderImpl.LJIJJ;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String[], Pair<byte[], byte[]>> entry : map.entrySet()) {
                        N.MTZ7mkhc(jMmo_MQVE, entry.getKey(), (byte[]) entry.getValue().first, (byte[]) entry.getValue().second);
                    }
                }
                N.MjS9m1YQ(cronetEngineBuilderImpl.LJJII);
                return jMmo_MQVE;
            }
            it2.next().getClass();
            throw null;
        }
        throw new IllegalArgumentException("Experimental options parsing failed.");
    }

    private void onClientIPChanged(String str) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onClientIPChanged(str);
        }
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.LJI) {
            try {
                this.LJIIIIZZ = i;
                AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
                if (abstractC1498350p5t != null) {
                    abstractC1498350p5t.onEffectiveConnectionTypeChanged(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onNQLChanged(int i) {
        synchronized (this.LJIILL) {
            try {
                this.LJIILLIIL = i;
                AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
                if (abstractC1498350p5t != null) {
                    abstractC1498350p5t.onNetworkQualityLevelChanged(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onNetworkQualityTypeChangedV3(int i) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onNetworkQualityTypeChangedV3(i);
        }
    }

    private void onTTNetDetectInfoChanged(String str) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onTTNetDetectInfoChanged(str);
        }
    }

    private void onThreadIdChanged(int[] iArr) {
        synchronized (this.LJJIIZI) {
            for (int i = 0; i < iArr.length - 1; i += 2) {
                try {
                    EnumC1497200p42 enumC1497200p42 = EnumC1497200p42.values()[iArr[i]];
                    int i2 = iArr[i + 1];
                    ((HashMap) this.LJJIJIIJI).put(enumC1497200p42, Integer.valueOf(i2));
                    if (((HashMap) this.LJJIJIIJIL).containsKey(enumC1497200p42) && this.LJJIJ != null) {
                        int i3 = C1498410p5z.LIZ[((EnumC1498420p60) ((HashMap) this.LJJIJIIJIL).get(enumC1497200p42)).ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    this.LJJIJ.resetCoreBind(i2);
                                }
                            } else {
                                this.LJJIJ.bindLittleCore(i2);
                            }
                        } else {
                            this.LJJIJ.bindBigCore(i2);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    private void onUserSpecifiedNetworkEnabled(boolean z) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onUserSpecifiedNetworkEnabled(z);
        }
    }

    @Override // com.ttnet.org.chromium.net.e
    public final void LJFF(String str) {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                if (this.LJJIJL) {
                    return;
                }
                if (N.Mt89JXhb(this.LIZLLL, this, str, true)) {
                    this.LJJIJL = true;
                    return;
                }
                throw new RuntimeException("Unable to start NetLog");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJIIIIZZ(TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting) {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                N.MKYzOUkj(this.LIZLLL, this, tTSamplingSettingProvider$TTSlaSamplingSetting);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJIIIZ(int i) {
        synchronized (this.LJJIIZI) {
            try {
                if (this.LJJIJ == null) {
                    return;
                }
                EnumC1497200p42 enumC1497200p42 = EnumC1497200p42.values()[i];
                if (((HashMap) this.LJJIJIIJI).containsKey(enumC1497200p42)) {
                    this.LJJIJ.bindBigCore(((Integer) ((HashMap) this.LJJIJIIJI).get(enumC1497200p42)).intValue());
                    return;
                }
                ((HashMap) this.LJJIJIIJIL).put(enumC1497200p42, EnumC1498420p60.BIG_CORE);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJIIJ(int i) {
        synchronized (this.LJJIIZI) {
            try {
                if (this.LJJIJ == null) {
                    return;
                }
                EnumC1497200p42 enumC1497200p42 = EnumC1497200p42.values()[i];
                if (((HashMap) this.LJJIJIIJI).containsKey(enumC1497200p42)) {
                    this.LJJIJ.bindLittleCore(((Integer) ((HashMap) this.LJJIJIIJI).get(enumC1497200p42)).intValue());
                    return;
                }
                ((HashMap) this.LJJIJIIJIL).put(enumC1497200p42, EnumC1498420p60.LITTLE_CORE);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final double LJIILIIL(int i) {
        double d;
        LJJLI(i);
        synchronized (this.LJI) {
            try {
                d = this.LJJ[i];
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJIILJJIL(int i) {
        LJJLI(i);
        synchronized (this.LJI) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final double LJJIFFI(int i) {
        double d;
        LJJLI(i);
        synchronized (this.LJI) {
            try {
                d = this.LJJ[i];
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJII(int i) {
        LJJLI(i);
        synchronized (this.LJI) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIIZ(String str) {
        synchronized (this.LIZ) {
            try {
                N.Mcfn2q8$(this.LIZLLL, this, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIIZI(String str) {
        synchronized (this.LIZ) {
            try {
                N.MPONMQm_(this.LIZLLL, this, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIJ(int i) {
        synchronized (this.LJJIIZI) {
            try {
                if (this.LJJIJ == null) {
                    return;
                }
                EnumC1497200p42 enumC1497200p42 = EnumC1497200p42.values()[i];
                if (((HashMap) this.LJJIJIIJI).containsKey(enumC1497200p42)) {
                    this.LJJIJ.resetCoreBind(((Integer) ((HashMap) this.LJJIJIIJI).get(enumC1497200p42)).intValue());
                    return;
                }
                ((HashMap) this.LJJIJIIJIL).put(enumC1497200p42, EnumC1498420p60.CANCEL_BIND);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIJIIJI(boolean z) {
        synchronized (this.LIZ) {
            try {
                N.MWOUQ7KG(this.LIZLLL, this, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIJIIJIL(long j) {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Set alog func addr: ");
                sbLIZ.append(j);
                C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                N.Me3xdZoU(this.LIZLLL, this, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIJIL(int i) {
        synchronized (this.LIZ) {
            try {
                N.MksRT8QX(this.LIZLLL, this, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIJLIJ(String str) {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                N.MlH1XMiR(this.LIZLLL, this, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIL(String str) {
        synchronized (this.LIZ) {
            try {
                N.Mj4Pi_Pa(this.LIZLLL, this, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJJJ(boolean z) {
        synchronized (this.LIZ) {
            try {
                N.MN8yyQkr(this.LIZLLL, this, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJLI(int i) {
        if (this.LJFF) {
            if (i != 0 && i != 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error protocol: ");
                sbLIZ.append(i);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    private String[] addSecurityFactor(String str, String[] strArr) {
        Map<String, String> mapOnCallToAddSecurityFactor;
        HashMap map = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            map.put(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]);
        }
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t == null || (mapOnCallToAddSecurityFactor = abstractC1498350p5t.onCallToAddSecurityFactor(str, map)) == null) {
            return null;
        }
        String[] strArr2 = new String[mapOnCallToAddSecurityFactor.size() * 2];
        for (Map.Entry<String, String> entry : mapOnCallToAddSecurityFactor.entrySet()) {
            strArr2[i] = entry.getKey();
            strArr2[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr2;
    }

    private boolean handleApiSample(String str, String str2) {
        AbstractC1497630p4j abstractC1497630p4j = this.LJJIIJ;
        if (abstractC1497630p4j != null) {
            return abstractC1497630p4j.handleApiSample(str, str2);
        }
        return false;
    }

    private void onDropReasonChanged(boolean z, int[] iArr) {
        if (this.LJJIIJZLJL != null) {
            List<Integer> arrayList = new ArrayList<>();
            if (iArr != null) {
                arrayList = (List) Arrays.stream(iArr).boxed().collect(Collectors.toList());
            }
            this.LJJIIJZLJL.onDropReasonChanged(z, arrayList);
        }
    }

    private void onMultiNetworkStateChanged(int i, int i2) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onMultiNetworkStateChanged(i, i2);
        }
    }

    private void onPublicIPsChanged(String[] strArr, String[] strArr2) {
        if (this.LJJIIJZLJL != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            Collections.addAll(arrayList, strArr);
            Collections.addAll(arrayList2, strArr2);
            this.LJJIIJZLJL.onPublicIPsChanged(arrayList, arrayList2);
        }
    }

    private void onSendAppMonitorEvent(String str, String str2) {
        AbstractC1497630p4j abstractC1497630p4j = this.LJJIIJ;
        if (abstractC1497630p4j != null) {
            abstractC1497630p4j.sendAppMonitorEvent(str, str2);
        }
    }

    private void onTNCUpdateFailed(String[] strArr, String str) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onTNCUpdateFailed(strArr, str);
        }
    }

    private void onWiFiToCellStateChanged(int i, int i2) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onWiFiToCellStateChanged(i, i2);
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIIJZLJL(String str, Map map) {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                N.MBtj30QU(this.LIZLLL, this, str, 1, LJJJLZIJ(map));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIZ(String str, String str2) {
        synchronized (this.LIZ) {
            try {
                N.MhbNiNFL(this.LIZLLL, this, str, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJJIL(String[] strArr, int i) {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                N.MohL$06P(this.LIZLLL, this, strArr, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onGroupRTTOrThroughputEstimatesComputed(String[] strArr, int[] iArr, int[] iArr2) {
        synchronized (this.LJI) {
            try {
                this.LJIJJ = strArr;
                this.LJIJJLI = iArr;
                this.LJIL = iArr2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3) {
        synchronized (this.LJIILL) {
            try {
                this.LJIIZILJ = i;
                this.LJIJ = i2;
                this.LJIJI = i3;
                AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
                if (abstractC1498350p5t != null) {
                    abstractC1498350p5t.onNetworkQualityRttAndThroughputNotified(i, i2, i3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.LJI) {
            try {
                this.LJIIIZ = i;
                this.LJIIJ = i2;
                this.LJIIJJI = i3;
                AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
                if (abstractC1498350p5t != null) {
                    abstractC1498350p5t.onRTTOrThroughputEstimatesComputed(i, i2, i3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.LJI) {
            try {
                C1499120p78 c1499120p78 = (C1499120p78) this.LJIIL.iterator();
                if (c1499120p78.hasNext()) {
                    ((C1498470p65) c1499120p78.next()).getClass();
                    throw null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onTNCConfigChanged(String str, String str2, String str3) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onServerConfigUpdated(str, str2, str3);
        }
    }

    private void onTNCRequestSucceeded(boolean z, boolean z2, int i) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onTncRequestSucceeded(z, z2, i);
        }
    }

    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.LJI) {
            try {
                C1499120p78 c1499120p78 = (C1499120p78) this.LJIILIIL.iterator();
                if (c1499120p78.hasNext()) {
                    ((C1498490p67) c1499120p78.next()).getClass();
                    throw null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.d, com.ttnet.org.chromium.net.i, com.ttnet.org.chromium.net.e
    public final AbstractC1497340p4G LIZJ(String str, C1497210p43 c1497210p43, ExecutorC1497250p47 executorC1497250p47) {
        return new C1497640p4k(str, c1497210p43, executorC1497250p47, this);
    }

    @Override // com.ttnet.org.chromium.net.e
    public final URLConnection LJ(URL url, Proxy proxy, boolean z) {
        if (proxy.type() == Proxy.Type.DIRECT) {
            String protocol = url.getProtocol();
            if (!"http".equals(protocol) && !"https".equals(protocol)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected protocol:");
                sbLIZ.append(protocol);
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return new CronetHttpURLConnection(url, this, z);
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJJI(String[] strArr, int i, long j) {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                N.MiGn0DCY(this.LIZLLL, this, strArr, i, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJJJI(String[] strArr, int i, int i2) {
        synchronized (this.LIZ) {
            try {
                N.MA5SsGAv(this.LIZLLL, this, strArr, i, i2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final Map LJJJJJ(int i, String str, boolean z) throws InterruptedIOException {
        URLDispatch uRLDispatch = new URLDispatch();
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                N.MRTGlzo1(this.LIZLLL, this, uRLDispatch, str, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ExecutorC1497250p47 executorC1497250p47 = uRLDispatch.LJ;
        if (i <= 0) {
            i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        executorC1497250p47.LIZ(i);
        HashMap map = new HashMap();
        map.put("final_url", uRLDispatch.LIZ);
        map.put("epoch", uRLDispatch.LIZIZ);
        map.put("etag", uRLDispatch.LIZJ);
        map.put("ttnet_origin_host", uRLDispatch.LIZLLL);
        return map;
    }

    public String onRequestInterceptorToStart(String str, String[] strArr, String[] strArr2) {
        if (this.LJJIIJZLJL == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < strArr.length; i += 2) {
            map.put(strArr[i].toLowerCase(Locale.US), strArr[i + 1]);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr2) {
            arrayList.add(str2);
        }
        return this.LJJIIJZLJL.onRequestInterceptorToStart(str, map, arrayList);
    }

    public String onResponseInterceptorToStart(String str, String[] strArr, int i) {
        if (this.LJJIIJZLJL == null) {
            return null;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]));
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : arrayList) {
            ArrayList arrayList2 = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList2.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList2.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList2));
        }
        return this.LJJIIJZLJL.onResponseInterceptorToStart(str, treeMap, i);
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJJJIZL(String str, int i, String str2, Map<String, String> map) {
        synchronized (this.LIZ) {
            try {
                N.MH0muaR3(this.LIZLLL, this, str, i, str2, LJJJLZIJ(map));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        synchronized (this.LJI) {
            try {
                if (i != 0 && i != 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error protocol from native. Protocol: ");
                    sbLIZ.append(i);
                    C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                    return;
                }
                this.LJJ[i] = d;
                this.LJJI[i] = d2;
                this.LJJIFFI[i] = d3;
                this.LJJII[i] = d4;
                AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
                if (abstractC1498350p5t != null) {
                    abstractC1498350p5t.onPacketLossComputed(i, d, d2, d3, d4);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onUrlDispatchComplete(URLDispatch uRLDispatch, String str, String str2, String str3, String str4) {
        uRLDispatch.LIZ = str;
        uRLDispatch.LIZJ = str2;
        uRLDispatch.LIZIZ = str3;
        uRLDispatch.LIZLLL = str4;
        try {
            uRLDispatch.LJ.execute(new ARunnableS123S0100000_23(uRLDispatch, 57));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C08VH.LIZ("Exception URLDispatch resume ", e);
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJII(String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2) {
        synchronized (this.LIZ) {
            try {
                N.MWb1lJ5e(this.LIZLLL, this, strArr, bArr, bArr2, j, j2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onStoreIdcChanged(str, str2, str3, str4, str5, str6);
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJIIL(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        synchronized (this.LIZ) {
            try {
                N.M2ni33Tk(this.LIZLLL, this, z, str, str2, str3, z2, str4);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJIIJ(String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (this.LIZ) {
            try {
                N.MU6k4d25(this.LIZLLL, this, str, str2, str3, str4, str5, str6);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final k0 LJJJJZ(AbstractC1498430p61 abstractC1498430p61, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, abstractC1498430p61, executor, list, map, map2, z);
    }

    private void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, String[] strArr, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" onTTDnsResolveResult, uuid: ");
        sbLIZ.append(str);
        sbLIZ.append(" host: ");
        sbLIZ.append(str2);
        sbLIZ.append(" ret: ");
        sbLIZ.append(i);
        sbLIZ.append(" ips: ");
        sbLIZ.append(strArr.length);
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList = new ArrayList(strArr.length);
        Collections.addAll(arrayList, strArr);
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onTTDnsResolveResult(str, str2, i, i2, i3, arrayList, str3);
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final g0 LJJJJL(InterfaceC1498130p5X interfaceC1498130p5X, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        return new TTCronetNetExpRequest(this, interfaceC1498130p5X, executor, i, list, i2, i3, i4);
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJJ(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) throws Throwable {
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                try {
                    N.MIs1FVFz(this.LIZLLL, this, j, j2, j3, j4, j5, j6, j7, j8);
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final void LJJJJJL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) throws Throwable {
        synchronized (this.LIZ) {
            try {
                try {
                    N.MqjX8qD1(this.LIZLLL, this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final w0 LJJJJLI(String str, AbstractC1497700p4q abstractC1497700p4q, Executor executor, int i, boolean z, boolean z2, int i2, boolean z3, int i3, AbstractC1495350p13 abstractC1495350p13, long j) throws Throwable {
        long j2 = j;
        if (j2 == -1) {
            j2 = this.LJJIL;
        }
        synchronized (this.LIZ) {
            try {
                LJJJLL();
                try {
                    return new CronetUrlRequest(this, str, i, abstractC1497700p4q, executor, z, z2, i2, z3, i3, abstractC1495350p13, j2);
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final k0 LJJJJLL(AbstractC1498430p61 abstractC1498430p61, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, Map map, Map map2, boolean z) {
        return new CronetWebsocketConnection(this, abstractC1498430p61, executor, list, i, str, j, i2, j2, str2, i3, map, map2, z);
    }

    private void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, String str, String str2) {
        C1497110p3t.LJ = str;
        C1497110p3t.LJFF = str2;
        this.LIZIZ.open();
        AbstractC1498350p5t abstractC1498350p5t = this.LJJIIJZLJL;
        if (abstractC1498350p5t != null) {
            abstractC1498350p5t.onContextInitCompleted(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
        }
    }

    private void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        AbstractC1497630p4j abstractC1497630p4j = this.LJJIIJ;
        if (abstractC1497630p4j != null) {
            abstractC1497630p4j.handleApiResult(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4, str5, str6, i, i2, str7);
        }
    }
}
