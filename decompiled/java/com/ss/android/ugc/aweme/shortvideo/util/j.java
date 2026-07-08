package com.ss.android.ugc.aweme.shortvideo.util;

import X.C0C2E;
import X.C0CHQ;
import X.C0LAB;
import X.C0VSJ;
import X.C0VSV;
import X.C1637890six;
import X.C19376210rI;
import X.C20101713l1;
import X.C201955140j;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2292508yZ;
import X.C2341909Fp;
import X.C298320Bmg;
import X.C524780Ki4;
import X.C543670LTx;
import X.C786410Ut5;
import Y.ARunnableS34S1100000_30;
import Y.ARunnableS99S0200000_30;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.utils.oh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class j implements Handler.Callback, IAVPerformance {
    public final HashMap<String, C19376210rI> LL = new HashMap<>();
    public final HashMap<String, Boolean> LLILLJJLI = new HashMap<>();
    public final SimpleDateFormat LLILZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public boolean LLILZIL = false;
    public final BPEAHandler LLILLL = new BPEAHandler(C786410Ut5.W2(C0C2E.LIZ), this);

    public static boolean LIZ() {
        File externalFilesDir;
        if (C298320Bmg.LIZ() && (externalFilesDir = C0CHQ.LIZ.getExternalFilesDir("koopa_save_log.conf")) != null) {
            return C2286708xd.LIZJ(externalFilesDir.getPath());
        }
        return false;
    }

    public static j LIZJ() {
        return C524780Ki4.LIZ;
    }

    public final void LIZIZ(Message message) {
        Map<String, String> extraParams;
        C20101713l1 c20101713l1 = (C20101713l1) HandlerHook.getMessageObj(message.obj);
        C19376210rI c19376210rIRemove = this.LL.remove(c20101713l1.LIZIZ);
        if (c19376210rIRemove == null) {
            return;
        }
        c19376210rIRemove.LIZ.add(c20101713l1);
        int size = c19376210rIRemove.LIZ.size();
        if (size <= 1) {
            return;
        }
        C543670LTx c543670LTx = new C543670LTx();
        int i = 0;
        while (i < size - 1) {
            int i2 = i + 1;
            Long lValueOf = Long.valueOf(((C20101713l1) ListProtector.get(c19376210rIRemove.LIZ, i2)).LIZ - ((C20101713l1) ListProtector.get(c19376210rIRemove.LIZ, i)).LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("step");
            sbLIZ.append(i2);
            c543670LTx.LIZJ(lValueOf, C2188811AlT.LIZIZ(sbLIZ));
            i = i2;
        }
        List<C20101713l1> list = c19376210rIRemove.LIZ;
        c543670LTx.LIZJ(Long.valueOf(((C20101713l1) ListProtector.get(list, list.size() - 1)).LIZ - ((C20101713l1) ListProtector.get(c19376210rIRemove.LIZ, 0)).LIZ), "totaltime");
        c543670LTx.LIZIZ(Integer.valueOf(size), "totalstep");
        PerformanceMonitor performanceMonitor = c20101713l1.LIZLLL;
        if (performanceMonitor != null && !TextUtils.equals(performanceMonitor.getEnterFrom(), "")) {
            c543670LTx.LIZLLL("enter_from", c20101713l1.LIZLLL.getEnterFrom());
        }
        c543670LTx.LIZLLL("type", c20101713l1.LIZIZ);
        Boolean bool = this.LLILLJJLI.get(c20101713l1.LIZIZ);
        if (bool != null && !bool.booleanValue()) {
            c543670LTx.LIZ(Boolean.FALSE, "cold_start");
        } else {
            c543670LTx.LIZ(Boolean.TRUE, "cold_start");
            this.LLILLJJLI.put(c20101713l1.LIZIZ, Boolean.FALSE);
        }
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        PerformanceMonitor performanceMonitor2 = c20101713l1.LIZLLL;
        if (performanceMonitor2 != null && (extraParams = performanceMonitor2.getExtraParams()) != null && !extraParams.isEmpty()) {
            for (Map.Entry<String, String> entry : extraParams.entrySet()) {
                try {
                    jSONObjectLJ.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C1637890six.LIZIZ(c20101713l1.LIZIZ, jSONObjectLJ);
        C2341909Fp.LIZIZ("tool_performance_operation_cost_time", jSONObjectLJ);
        if (C298320Bmg.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("av-performance: type = ");
            sbLIZ2.append(c20101713l1.LIZIZ);
            StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n");
            int size2 = c19376210rIRemove.LIZ.size();
            int i3 = 0;
            while (i3 < size2 - 1) {
                C20101713l1 c20101713l12 = (C20101713l1) ListProtector.get(c19376210rIRemove.LIZ, i3);
                int i4 = i3 + 1;
                C20101713l1 c20101713l13 = (C20101713l1) ListProtector.get(c19376210rIRemove.LIZ, i4);
                if (c20101713l12 != null && c20101713l12.LIZJ != null && c20101713l13 != null && c20101713l13.LIZJ != null) {
                    Long lValueOf2 = Long.valueOf(c20101713l13.LIZ - c20101713l12.LIZ);
                    sb.append("step");
                    sb.append(C786410Ut5.k4(Locale.getDefault(), "%2s", new Object[]{Integer.valueOf(i4)}));
                    sb.append(": ");
                    sb.append(C786410Ut5.k4(Locale.getDefault(), "%-30s", new Object[]{c20101713l12.LIZJ}));
                    sb.append(" => ");
                    sb.append(C786410Ut5.k4(Locale.getDefault(), "%-30s", new Object[]{c20101713l13.LIZJ}));
                    sb.append(" cost time = ");
                    sb.append(lValueOf2);
                    sb.append(" \n");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("step");
                    sbLIZ3.append(i4);
                    sbLIZ3.append("_");
                    sbLIZ3.append(((C20101713l1) ListProtector.get(c19376210rIRemove.LIZ, i3)).LIZJ.replace(" ", "_"));
                    sbLIZ3.append("_2_");
                    sbLIZ3.append(c20101713l13.LIZJ.replace(" ", "_"));
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), lValueOf2);
                }
                i3 = i4;
            }
            List<C20101713l1> list2 = c19376210rIRemove.LIZ;
            Long lValueOf3 = Long.valueOf(((C20101713l1) ListProtector.get(list2, list2.size() - 1)).LIZ - ((C20101713l1) ListProtector.get(c19376210rIRemove.LIZ, 0)).LIZ);
            HashMap map = new HashMap();
            map.put(c20101713l1.LIZIZ, linkedHashMap);
            if (LIZ()) {
                C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS99S0200000_30(this, map, 4));
            }
            sb.append("totaltime = ");
            sb.append(lValueOf3);
            sb.append(" \n");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("\n");
            sbLIZ4.append((Object) sb);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ4));
        }
        c19376210rIRemove.LIZ.clear();
    }

    public final void LJFF(Message message) {
        C20101713l1 c20101713l1 = (C20101713l1) HandlerHook.getMessageObj(message.obj);
        C19376210rI c19376210rI = this.LL.get(c20101713l1.LIZIZ);
        if (c19376210rI != null) {
            List<C20101713l1> list = c19376210rI.LIZ;
            if (list != null && !list.isEmpty()) {
                ListProtector.set(c19376210rI.LIZ, r1.size() - 1, c20101713l1);
                return;
            }
            return;
        }
        C19376210rI c19376210rI2 = new C19376210rI();
        c19376210rI2.LIZ.add(c20101713l1);
        this.LL.put(c20101713l1.LIZIZ, c19376210rI2);
    }

    public final void LJI(Message message) {
        String str;
        C20101713l1 c20101713l1 = (C20101713l1) HandlerHook.getMessageObj(message.obj);
        C19376210rI c19376210rI = this.LL.get(c20101713l1.LIZIZ);
        if (c19376210rI != null) {
            for (C20101713l1 c20101713l12 : c19376210rI.LIZ) {
                if (c20101713l12 != null && (str = c20101713l12.LIZJ) != null && str.equals(c20101713l1.LIZJ)) {
                    return;
                }
            }
            c19376210rI.LIZ.add(c20101713l1);
        }
    }

    public final void LJII(String str) {
        if (!C298320Bmg.LIZ()) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ.getExternalCacheDir(), "tools_perf.log");
        String str2 = this.LLILZ.format(new Date(System.currentTimeMillis()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("  ");
        sbLIZ.append("KoopaPerformanceLog");
        sbLIZ.append(" ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!c0vsj.exists()) {
            try {
                c0vsj.getParentFile().mkdirs();
                c0vsj.createNewFile();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new C0VSV(c0vsj, this.LLILZIL)));
            try {
                bufferedWriter.write(strLIZIZ);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                if (!this.LLILZIL) {
                    this.LLILZIL = true;
                }
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                LJFF(message);
                return false;
            case 2:
                LJI(message);
                return false;
            case 3:
                LIZIZ(message);
                return false;
            case 4:
                LJFF(message);
                return false;
            case 5:
                LJI(message);
                return false;
            case 6:
                C20101713l1 c20101713l1 = (C20101713l1) HandlerHook.getMessageObj(message.obj);
                PerformanceMonitor performanceMonitor = c20101713l1.LIZLLL;
                String str = c20101713l1.LIZJ;
                if (performanceMonitor == null) {
                    LIZIZ(message);
                    return false;
                }
                ArrayList arrayList = new ArrayList(performanceMonitor.iF());
                arrayList.remove(str);
                C19376210rI c19376210rI = this.LL.get(c20101713l1.LIZIZ);
                if (c19376210rI != null) {
                    HashSet hashSet = new HashSet();
                    Iterator<C20101713l1> it2 = c19376210rI.LIZ.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(it2.next().LIZJ);
                    }
                    if (hashSet.containsAll(arrayList)) {
                        if (performanceMonitor.IN()) {
                            C20101713l1 c20101713l12 = (C20101713l1) HandlerHook.getMessageObj(message.obj);
                            this.LL.remove(c20101713l12.LIZIZ);
                            c19376210rI.LIZ.add(c20101713l1);
                            HashMap<String, Long> map = new HashMap<>();
                            String str2 = c20101713l12.LIZIZ;
                            String[] strArr = new String[c19376210rI.LIZ.size()];
                            for (int i = 0; i < c19376210rI.LIZ.size(); i++) {
                                strArr[i] = ((C20101713l1) ListProtector.get(c19376210rI.LIZ, i)).LIZJ;
                            }
                            long[] jArr = new long[c19376210rI.LIZ.size()];
                            for (int i2 = 0; i2 < c19376210rI.LIZ.size(); i2++) {
                                jArr[i2] = ((C20101713l1) ListProtector.get(c19376210rI.LIZ, i2)).LIZ;
                            }
                            JSONObject jSONObjectAA = performanceMonitor.aA(str2, strArr, jArr, map);
                            if (jSONObjectAA != null) {
                                C1637890six.LIZIZ(c20101713l12.LIZIZ, jSONObjectAA);
                                C2341909Fp.LIZIZ("tool_performance_operation_cost_time", jSONObjectAA);
                                if (C298320Bmg.LIZ()) {
                                    HashMap map2 = new HashMap();
                                    map2.put(c20101713l12.LIZIZ, map);
                                    if (LIZ()) {
                                        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS34S1100000_30(this, GsonProtectorUtils.toJson(C2292508yZ.LIZIZ(), map2), 7));
                                    }
                                }
                                c19376210rI.LIZ.clear();
                                return false;
                            }
                        } else {
                            LIZIZ(message);
                            return false;
                        }
                    } else {
                        LJI(message);
                        return false;
                    }
                }
            default:
                return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void stopPerformanceMonitor(String str) {
        oh.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(PerformanceMonitor performanceMonitor, String str) {
        end(performanceMonitor, str, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void enter(Context context, String str) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS34S1100000_30(context, str, 5));
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void leave(Context context, String str) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS34S1100000_30(context, str, 4));
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void recordPerformanceLog(String str, Function0<? extends Map<String, String>> function0) {
        if (!C298320Bmg.LIZ()) {
            return;
        }
        new C0LAB().LIZLLL(function0.invoke(), str);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void recordSingleValuePerfLog(String str, Function0<? extends Map<String, String>> function0) {
        if (!C298320Bmg.LIZ()) {
            return;
        }
        HashMap map = new HashMap();
        map.put(str, function0.invoke());
        if (LIZ()) {
            C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS99S0200000_30(this, map, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(String str, String str2) {
        LJ(str, str2, null, 1, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(String str, String str2) {
        LJ(str, str2, null, 2, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(String str, String str2) {
        end(str, str2, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(PerformanceMonitor performanceMonitor, String str) {
        LIZLLL(performanceMonitor.getType(), str, performanceMonitor, 4);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(PerformanceMonitor performanceMonitor, String str) {
        LIZLLL(performanceMonitor.getType(), str, performanceMonitor, 5);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(PerformanceMonitor performanceMonitor, String str, long j) {
        LJ(performanceMonitor.getType(), str, performanceMonitor, 6, j);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void startPerformanceMonitor(String str, int i, long j) {
        oh.LIZIZ(str, i, j, null);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(String str, String str2, long j) {
        LJ(str, str2, null, 3, j);
    }

    public final void LIZLLL(String str, String str2, PerformanceMonitor performanceMonitor, int i) {
        LJ(str, str2, performanceMonitor, i, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void pause(Context context, String str, String str2, String str3) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS34S1100000_30(context, str, str2, str3, 6));
    }

    public final void LJ(String str, String str2, PerformanceMonitor performanceMonitor, int i, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        C20101713l1 c20101713l1 = new C20101713l1();
        if (j > 0) {
            c20101713l1.LIZ = j;
        } else {
            c20101713l1.LIZ = System.currentTimeMillis();
        }
        c20101713l1.LIZIZ = str;
        c20101713l1.LIZJ = str2;
        c20101713l1.LIZLLL = performanceMonitor;
        messageObtain.obj = c20101713l1;
        C786410Ut5.LJLJJL(this.LLILLL, messageObtain);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void pause(final Context context, final String str, final String str2, final String str3, final String str4, final Map<String, String> map) {
        C786410Ut5.LJJZZIII(this.LLILLL, new Runnable() { // from class: X.13l2
            @Override // java.lang.Runnable
            public final void run() {
                C20102113l5 c20102113l5;
                Context context2 = context;
                String str5 = str2;
                String str6 = str;
                String str7 = str3;
                String str8 = str4;
                Map map2 = map;
                C1C7U.LIZ("AVPerformance@9056.pause$2L");
                C20101913l3 c20101913l3LIZ = C20101913l3.LIZ(context2, str5);
                C20102113l5 c20102113l5LIZIZ = c20101913l3LIZ.LIZIZ(c20101913l3LIZ.LIZ, "leaving");
                if (c20102113l5LIZIZ != null && (c20102113l5 = c20101913l3LIZ.LIZJ) != null) {
                    C20102013l4.LIZ(c20101913l3LIZ.LIZIZ, c20102113l5, c20102113l5LIZIZ);
                    String str9 = c20101913l3LIZ.LIZIZ;
                    int i = c20101913l3LIZ.LIZLLL;
                    long j = c20102113l5.LIZ;
                    long j2 = c20102113l5LIZIZ.LIZ;
                    long j3 = c20102113l5.LIZJ;
                    long j4 = c20102113l5LIZIZ.LIZJ;
                    long j5 = c20102113l5.LIZIZ;
                    long j6 = c20102113l5LIZIZ.LIZIZ;
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", str8);
                    c0lab.LJ("shoot_way", str7);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str9);
                    sbLIZ.append("_page");
                    c0lab.LJ("scene_name", C2188811AlT.LIZIZ(sbLIZ));
                    c0lab.LIZ(i, "finish_count");
                    c0lab.LIZIZ(j2, "app_memory_end");
                    c0lab.LIZIZ(j, "app_memory_start");
                    c0lab.LIZIZ(j - j2, "app_memory_change");
                    c0lab.LIZIZ(j3, "available_memory_start");
                    c0lab.LIZIZ(j4, "available_memory_end");
                    c0lab.LIZIZ(j3 - j4, "available_memory_change");
                    c0lab.LIZIZ(j5, "used_memory_start");
                    c0lab.LIZIZ(j6, "used_memory_end");
                    c0lab.LIZIZ(j5 - j6, "used_memory_change");
                    if (map2 != null) {
                        c0lab.LJI(map2);
                    }
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    C2341909Fp.LIZ(str6, c0lab.LIZ);
                }
                C1C7U.LIZIZ("AVPerformance@9056.pause$2L");
            }
        });
    }
}
