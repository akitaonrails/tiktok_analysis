package com.bytedance.crash;

import X.AbstractC802360Vdi;
import X.AbstractC803830Vg5;
import X.C08OM;
import X.C08SE;
import X.C0VSJ;
import X.C0VX9;
import X.C0VXF;
import X.C0VXO;
import X.C0VXQ;
import X.C0VYH;
import X.C0VYN;
import X.C0VYT;
import X.C0W1D;
import X.C1173804iW;
import X.C1189304l1;
import X.C20664087q;
import X.C20665087r;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C799500VXw;
import X.C801670Vcb;
import X.C801770Vcl;
import X.C801850Vct;
import X.C801880Vcw;
import X.C801910Vcz;
import X.C801930Vd1;
import X.C802110VdJ;
import X.C802250VdX;
import X.C802260VdY;
import X.C802270VdZ;
import X.C802300Vdc;
import X.C802380Vdk;
import X.C802400Vdm;
import X.C802410Vdn;
import X.C802430Vdp;
import X.C802500Vdw;
import X.C802600Ve6;
import X.C802620Ve8;
import X.C802760VeM;
import X.C802790VeP;
import X.C803100Veu;
import X.C803150Vez;
import X.C803190Vf3;
import X.C803230Vf7;
import X.C803380VfM;
import X.C803490VfX;
import X.C805630Viz;
import X.InterfaceC2076108Bj;
import X.InterfaceC308350C6v;
import X.InterfaceC801650VcZ;
import X.InterfaceC801750Vcj;
import X.InterfaceC802370Vdj;
import X.InterfaceC802390Vdl;
import X.InterfaceC803700Vfs;
import X.InterfaceC803750Vfx;
import X.InterfaceC803760Vfy;
import X.InterfaceC803790Vg1;
import X.InterfaceC803810Vg3;
import X.InterfaceC803820Vg4;
import X.InterfaceC803840Vg6;
import X.InterfaceC803850Vg7;
import X.InterfaceC803860Vg8;
import X.InterfaceC803870Vg9;
import X.InterfaceC803880VgA;
import X.InterfaceC803890VgB;
import X.InterfaceC803900VgC;
import X.InterfaceC803910VgD;
import X.InterfaceC803920VgE;
import X.RunnableC801890Vcx;
import X.RunnableC801900Vcy;
import X.RunnableC802130VdL;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS4S2000000_13;
import Y.ARunnableS8S1000000_13;
import Y.ARunnableS92S0000000_13;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.looper.MessageObserver;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.crash.monitor.f;
import com.bytedance.crash.monitor.k;
import com.bytedance.crash.npth_repair.NpthRepair;
import com.bytedance.crash.npth_repair.nativeCrash.MTKBufferOpt;
import com.bytedance.crash.npth_repair.nativeCrash.ScudoVmaLeakFixer;
import com.bytedance.crash.resource.NativeResourceMonitor;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import im3.b;
import im3.o;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class Npth {
    public static final C802410Vdn sCachedDataCenter = C802790VeP.LJIILL;

    public static long getFileSize(String str) {
        return 0L;
    }

    public static long getFolderSize(String str) {
        return 0L;
    }

    public static boolean hasCrash() {
        return false;
    }

    public static boolean hasCrashWhenNativeCrash() {
        return false;
    }

    public static void openANRMonitor() {
    }

    public static void openJavaCrashMonitor() {
    }

    public static boolean openNativeCrashMonitor() {
        return false;
    }

    public static void optProcessTrackDisk() {
    }

    public static void pause() {
        C801910Vcz.LJ = true;
        C1173804iW.LIZIZ = true;
    }

    public static void registerCrashCallbackOnDrop(AbstractC803830Vg5 abstractC803830Vg5, CrashType crashType) {
    }

    public static void reportError(String str) {
    }

    public static void resume() {
        C801910Vcz.LJ = false;
        C1173804iW.LIZIZ = false;
    }

    public static void setANRCheckEnable(boolean z) {
    }

    public static void setAlogFlushAddr(long j) {
    }

    public static void setAlogLogDirAddr(long j) {
    }

    public static void setAlogWriteAddr(long j) {
    }

    public static void setCloseBgAnr(boolean z) {
    }

    public static void setCrashMonitorService(InterfaceC803850Vg7 interfaceC803850Vg7) {
    }

    public static void setInitAnrAhead(boolean z) {
    }

    public static void setLogcatImpl(InterfaceC803810Vg3 interfaceC803810Vg3) {
    }

    public static void setNetworkCallback(InterfaceC803890VgB interfaceC803890VgB) {
    }

    public static void setNpthInitOptEnable(boolean z) {
    }

    public static void setOpenDumpTraceOpt(boolean z) {
    }

    public static void setRequestIntercept(InterfaceC803910VgD interfaceC803910VgD) {
    }

    public static void setRequestPermission(InterfaceC803920VgE interfaceC803920VgE) {
    }

    public static void setScriptStackCallback(InterfaceC803870Vg9 interfaceC803870Vg9) {
    }

    public static void setTerminateMonitorDelayTime(long j) {
    }

    public static void setTerminateOpt(boolean z) {
    }

    public static void setUrlConnectionInterceptor(InterfaceC803880VgA interfaceC803880VgA) {
    }

    public static void stopEnsure() {
    }

    public static void stopUpload() {
    }

    public static void clean() {
        try {
            for (RunnableC801900Vcy runnableC801900Vcy : RunnableC801900Vcy.LLJ) {
                runnableC801900Vcy.LLILLL.clear();
                runnableC801900Vcy.LLILLJJLI.clear();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean isInit() {
        return k.LIZ != null;
    }

    public static int fixScudoVmaLeak() {
        Context contextLJ = C0VX9.LJ();
        if (contextLJ == null) {
            return -7;
        }
        int iLIZ = NpthRepair.LIZ(contextLJ, false);
        if (iLIZ != 0) {
            return iLIZ;
        }
        int iLIZ2 = ScudoVmaLeakFixer.LIZ();
        try {
            C802790VeP c802790VeP = k.LIZ;
            if (c802790VeP == null) {
                return iLIZ2;
            }
            c802790VeP.LIZJ.LIZIZ("fix_scudo", String.valueOf(iLIZ2));
            return iLIZ2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return iLIZ2;
        }
    }

    public static boolean isANREnable() {
        return C801930Vd1.LIZLLL();
    }

    public static boolean isJavaCrashEnable() {
        return C801930Vd1.LIZLLL();
    }

    public static boolean isNativeCrashEnable() {
        return C801930Vd1.LIZLLL();
    }

    public static boolean isRunning() {
        C802430Vdp c802430Vdp;
        return C801930Vd1.LIZLLL() && (c802430Vdp = C802430Vdp.LJII) != null && c802430Vdp.LJ;
    }

    public static void stopAnr() {
        C802430Vdp c802430Vdp;
        if (C801930Vd1.LIZLLL() && (c802430Vdp = C802430Vdp.LJII) != null && c802430Vdp.LJ) {
            c802430Vdp.LJ = false;
            c802430Vdp.LIZIZ.getClass();
            C802620Ve8 c802620Ve8 = c802430Vdp.LIZJ;
            if (c802620Ve8.LIZ) {
                c802620Ve8.LIZ = false;
                c802620Ve8.LIZIZ.stopWatching();
            }
            long j = c802430Vdp.LIZLLL.LIZ;
            if (j != 0) {
                NativeBridge.nAnrNativeProfilerExit(j);
            }
            synchronized (MessageRecorder.class) {
                MessageObserver messageObserver = MessageRecorder.LIZ;
                if (messageObserver != null) {
                    C20665087r c20665087r = C20664087q.LJII;
                    if (c20665087r != null) {
                        c20665087r.removeMessageObserver(messageObserver);
                    }
                    MessageRecorder.LIZ.stop();
                    MessageRecorder.LIZ = null;
                }
            }
        }
    }

    public static ConfigManager getConfigManager() {
        return C803190Vf3.LIZ;
    }

    public static boolean isStopUpload() {
        return false;
    }

    public static void addImportTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            if (!C801930Vd1.LIZLLL()) {
                ((ConcurrentHashMap) C802400Vdm.LIZJ).putAll(map);
                return;
            }
            Map<String, String> map2 = C802400Vdm.LIZJ;
            ((ConcurrentHashMap) map2).putAll(map);
            C0VXF.post(new ARunnableS113S0100000_13((Map) new HashMap(map2), 70));
        }
    }

    public static boolean addNativeProtectorConfig(JSONObject jSONObject) {
        synchronized (C802760VeM.class) {
            C805630Viz c805630Viz = new C805630Viz();
            if (!C805630Viz.LIZ(jSONObject)) {
                return false;
            }
            c805630Viz.LIZLLL();
            String strOptString = jSONObject.optString("scope");
            if (C805630Viz.LIZJ(strOptString)) {
                Iterator<String> it2 = c805630Viz.LIZ.iterator();
                while (it2.hasNext()) {
                    if (it2.next().equals(strOptString)) {
                        return C802760VeM.LIZIZ(c805630Viz.LJ, c805630Viz.LIZLLL);
                    }
                }
            }
            return false;
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        C802400Vdm.LIZ(map, sCachedDataCenter);
    }

    public static void addWhiteLogType(String str) {
        RunnableC801900Vcy.LLJI.add(str);
    }

    public static void customActivityName(C0VYN c0vyn) {
        C0VYH.LIZIZ().LJIIIZ = c0vyn;
    }

    public static void dumpHprof(String str) {
        NativeBridge.LJIIJ(str);
    }

    public static void enableGwpAsan(boolean z) {
        if (z) {
            try {
                if (!NativeBridge.LJJIJIIJI()) {
                    C802300Vdc.LIZ();
                    return;
                }
                C803230Vf7 c803230Vf7LJFF = C803230Vf7.LJFF();
                if (c803230Vf7LJFF.LJI) {
                    C802300Vdc.LIZ();
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i <= 34) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C803150Vez c803150Vez = C803150Vez.LJII;
                    sbLIZ.append(c803150Vez.LIZ.getAbsolutePath());
                    sbLIZ.append("/");
                    sbLIZ.append(C802600Ve6.LIZ());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (!c803150Vez.LIZ.exists()) {
                        c803150Vez.LIZ.mkdirs();
                    }
                    String strLIZLLL = C0VX9.LIZLLL();
                    C0VSJ c0vsj = new C0VSJ(strLIZLLL, "xasan.config");
                    if (!c0vsj.exists()) {
                        c0vsj.createNewFile();
                    }
                    C08SE.LJIIIIZZ(c0vsj, new C803100Veu(C802260VdY.LJI).LJII, false);
                    NativeResourceMonitor.LIZIZ(i, strLIZIZ, strLIZLLL);
                    c803230Vf7LJFF.LJI = true;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("GwpAsanStart err:");
                sbLIZ2.append(e);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }

    public static void ignoreExceptionTag(boolean z) {
        C802410Vdn.LJIJI = z;
    }

    public static int optMtkBuffer(int i) {
        int iLIZ;
        synchronized (C803380VfM.class) {
            Context contextLJ = C0VX9.LJ();
            if (contextLJ != null) {
                iLIZ = NpthRepair.LIZ(contextLJ, false);
                if (iLIZ == 0) {
                    return MTKBufferOpt.LIZ(i);
                }
            } else {
                iLIZ = -7;
            }
            return iLIZ;
        }
    }

    public static void registerANRCallback(InterfaceC803840Vg6 interfaceC803840Vg6) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJIIIIZZ).add(interfaceC803840Vg6);
    }

    public static void registerAnrUploadCallback(InterfaceC803750Vfx interfaceC803750Vfx) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJIIL).add(interfaceC803750Vfx);
    }

    public static void registerExceptionTriggerCallback(InterfaceC803760Vfy interfaceC803760Vfy) {
        synchronized (C802260VdY.class) {
            if (interfaceC803760Vfy != null) {
                if (!C802260VdY.LJIIIZ.equals("none")) {
                    interfaceC803760Vfy.LIZ();
                }
            }
        }
    }

    public static void registerHprofCallback(IOOMCallback iOOMCallback) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJII).add(iOOMCallback);
    }

    public static void registerMessageCallback(InterfaceC2076108Bj interfaceC2076108Bj) {
        C802430Vdp.LJIIL = interfaceC2076108Bj;
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJI).add(iOOMCallback);
    }

    public static void registerPreANRCallback(InterfaceC803790Vg1 interfaceC803790Vg1) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJIIJJI).add(interfaceC803790Vg1);
    }

    public static void removeCustomCrashReasonArray(String str) {
        ((ConcurrentHashMap) sCachedDataCenter.LJIILIIL).remove(str);
    }

    public static void removeImportTag(String str) {
        C802400Vdm.LIZLLL(str);
    }

    public static void removeTag(String str) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        if (C802400Vdm.LIZ != null) {
            C0VXF.post(new ARunnableS4S2000000_13(null, str, 0));
            return;
        }
        if (NativeBridge.LJJIJIIJIL() && c802410Vdn.LJIIZILJ) {
            if (c802410Vdn.LJIJ) {
                NativeBridge.LJJJJIZL(str);
                return;
            } else {
                c802410Vdn.LIZ.remove(str);
                return;
            }
        }
        c802410Vdn.LIZ.remove(str);
    }

    public static void reportDartError(String str) {
        if (C801930Vd1.LIZLLL() && !TextUtils.isEmpty(str)) {
            C801850Vct.LIZ(str, null, null);
        }
    }

    public static void reportError(Throwable th) {
        C803190Vf3.LIZ.isReportErrorEnable();
    }

    public static void setANRImprovementOpt(boolean z) {
        C803490VfX.LIZJ = z;
    }

    public static void setAlogFlushV2Addr(long j) {
        NativeBridge.LJJJJJL(j);
    }

    public static void setAnrDisableDumpData(boolean z) {
        C802430Vdp.LJIIIZ = !z;
    }

    public static void setAnrFilterEnabled(boolean z) {
        C803490VfX.LIZLLL = z;
    }

    public static void setAnrMonitorOpt(boolean z) {
        C803490VfX.LIZ = z;
    }

    public static void setAnrResendSigquit(boolean z) {
        NativeBridge.LJJJJLI(z);
    }

    public static void setApplication(Application application) {
        if (application != null && C0VX9.LIZIZ().LIZJ == null) {
            C0VX9.LIZIZ().LIZJ = application;
        }
    }

    public static void setBusiness(String str) {
        C0VX9.LJII = str;
    }

    public static void setCrashAccessibilityEnable(boolean z) {
        C802500Vdw.LIZIZ = z;
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        sCachedDataCenter.LJIILL = iCrashFilter;
    }

    public static void setCrashUploadCallback(InterfaceC308350C6v interfaceC308350C6v) {
        sCachedDataCenter.LJIILLIIL = interfaceC308350C6v;
    }

    public static void setCurProcessName(String str) {
        C802270VdZ.LIZ = str;
    }

    public static void setDomainName(String str) {
        try {
            String host = new URL(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setDomainName:");
                sbLIZ.append(host);
                C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https://");
                sbLIZ2.append(host);
                C802380Vdk.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void setDumpAnrAsync(boolean z) {
        C801930Vd1.LIZLLL = z;
    }

    public static void setEncryptImpl(InterfaceC802390Vdl interfaceC802390Vdl) {
        if (interfaceC802390Vdl != null) {
            C802300Vdc.LIZLLL = interfaceC802390Vdl;
        }
    }

    public static void setFixDumpStack(boolean z) {
        C803380VfM.LJI = z;
        C803380VfM.LJII = false;
    }

    public static void setIgnoreHandler(AbstractC802360Vdi abstractC802360Vdi) {
        C802250VdX.LJFF.add(abstractC802360Vdi);
    }

    public static void setMaxCacheSize(int i) {
        if (i > 0) {
            RunnableC801900Vcy.LLILZIL = i;
        } else {
            int i2 = RunnableC801900Vcy.LLILZIL;
        }
    }

    public static void setOpenNewAnrMonitor(boolean z) {
        C803490VfX.LIZIZ = z;
    }

    public static void setQueueLimitSize(int i) {
        if (i <= 0) {
            RunnableC801900Vcy.LLIZ = true;
        } else {
            RunnableC801900Vcy.LLILZLL = i;
        }
    }

    public static void setRequestHeaderProvider(InterfaceC803900VgC interfaceC803900VgC) {
        C0W1D.LIZIZ = interfaceC803900VgC;
    }

    public static void setTagCacheService(C08OM c08om) {
        Map mapLJJI;
        C802400Vdm.LIZ = c08om;
        C802410Vdn c802410Vdn = sCachedDataCenter;
        if (NativeBridge.LJJIJIIJIL() && c802410Vdn.LJIIZILJ) {
            mapLJJI = NativeBridge.LJJI();
        } else {
            mapLJJI = c802410Vdn.LIZ;
        }
        C802400Vdm.LIZ(new HashMap(mapLJJI), c802410Vdn);
        c802410Vdn.LIZ.clear();
    }

    public static void setTagOpt(boolean z) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        if (!c802410Vdn.LJIIZILJ && z) {
            c802410Vdn.LJIIZILJ = true;
            if (!c802410Vdn.LIZ.isEmpty() && NativeBridge.LJJIJIIJIL()) {
                c802410Vdn.LJIJ = false;
                C0VXF.post(new ARunnableS112S0100000_12(c802410Vdn, 145));
            }
        }
        c802410Vdn.LJIIZILJ = z;
    }

    public static void setUploadDelayTime(long j) {
        RunnableC802130VdL.LL = j;
    }

    public static void setUseLocalDomain(boolean z) {
        C802260VdY.LJII = z;
    }

    public static int startOptMtkBuffer(int i) {
        int iLIZ;
        synchronized (C803380VfM.class) {
            Context contextLJ = C0VX9.LJ();
            if (contextLJ != null) {
                iLIZ = NpthRepair.LIZ(contextLJ, false);
                if (iLIZ == 0) {
                    return MTKBufferOpt.LIZ(i);
                }
            } else {
                iLIZ = -7;
            }
            return iLIZ;
        }
    }

    public static void unregisterPreANRCallback(InterfaceC803790Vg1 interfaceC803790Vg1) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJIIJJI).remove(interfaceC803790Vg1);
    }

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.LIZ(attachUserData, crashType);
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.LIZ(attachUserData, crashType);
    }

    public static void addCustomCrashReasonArray(String str, String str2) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        if (str2 == null) {
            c802410Vdn.getClass();
            return;
        }
        if (!((ConcurrentHashMap) c802410Vdn.LJIILIIL).containsKey(str)) {
            synchronized (c802410Vdn.LJIILIIL) {
                try {
                    if (!((ConcurrentHashMap) c802410Vdn.LJIILIIL).containsKey(str)) {
                        ((ConcurrentHashMap) c802410Vdn.LJIILIIL).put(str, new LinkedList());
                    }
                } finally {
                }
            }
        }
        LinkedList linkedList = (LinkedList) ((ConcurrentHashMap) c802410Vdn.LJIILIIL).get(str);
        if (linkedList == null) {
            return;
        }
        synchronized (linkedList) {
            try {
                if (linkedList.contains(str2)) {
                    return;
                }
                if (((ConcurrentHashMap) c802410Vdn.LJIILJJIL).containsKey(str)) {
                    if (linkedList.size() > ((Integer) ((ConcurrentHashMap) c802410Vdn.LJIILJJIL).get(str)).intValue()) {
                        linkedList.removeFirst();
                    }
                    linkedList.add(str2);
                } else {
                    linkedList.add(str2);
                }
            } finally {
            }
        }
    }

    public static void addImportTag(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                C802400Vdm.LIZLLL(str);
                return;
            }
            Map<String, String> map = C802400Vdm.LIZJ;
            ((ConcurrentHashMap) map).put(str, str2);
            if (!C801930Vd1.LIZLLL()) {
                return;
            }
            C0VXF.post(new ARunnableS113S0100000_13((Map) new HashMap(map), 68));
        }
    }

    public static void addTag(String str, String str2) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        if (C802400Vdm.LIZ != null) {
            C0VXF.post(new ARunnableS4S2000000_13(str2, str, 0));
        } else {
            c802410Vdn.LIZIZ(str, str2);
        }
    }

    public static void addUserCrashInfoCallback(InterfaceC801650VcZ interfaceC801650VcZ, CrashType crashType) {
        if (interfaceC801650VcZ != null) {
            C802410Vdn c802410Vdn = sCachedDataCenter;
            synchronized (c802410Vdn.LJIIJ) {
                try {
                    if (crashType == CrashType.ALL) {
                        c802410Vdn.LJIIJ.addMulti(interfaceC801650VcZ, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE);
                    } else {
                        c802410Vdn.LJIIJ.add(crashType, interfaceC801650VcZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        if (isInit()) {
            return;
        }
        if (C0VYT.LIZLLL == null) {
            C0VYT.LIZLLL = new C0VYT();
        }
        final C802790VeP c802790VePLIZIZ = k.LIZIZ(context, iCommonParams);
        c802790VePLIZIZ.LJIIJJI = new C799500VXw(iCommonParams);
        new C801670Vcb() { // from class: X.0Vcc
        };
        C0VXF.post(new Runnable() { // from class: X.0VdA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Npth@18a8.init$1");
                try {
                    new C802260VdY(c802790VePLIZIZ) { // from class: X.0Vd8
                        @Override // X.C801980Vd6
                        public final RunnableC802050VdD LIZIZ() {
                            return new C802010Vd9(this.LIZ);
                        }

                        @Override // X.C801980Vd6
                        public final void LIZLLL(JSONObject jSONObject) {
                            if (C0VJL.LIZIZ().LIZJ) {
                                this.LIZJ = new C801910Vcz();
                            } else {
                                super.LIZLLL(jSONObject);
                            }
                        }

                        @Override // X.C801980Vd6
                        public final void LJ(JSONObject jSONObject) {
                            super.LJ(jSONObject);
                            C1173804iW c1173804iW = this.LIZIZ;
                            if (c1173804iW != null && c1173804iW.LIZ("npth_disk_event")) {
                                C0VXF.post(new ARunnableS92S0000000_13(44));
                            }
                        }

                        @Override // X.C802260VdY
                        public final void LJIIIIZZ(JSONObject jSONObject) {
                            super.LJIIIIZZ(jSONObject);
                        }
                    }.LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Npth@18a8.init$1");
            }
        });
        if (C0VYT.LIZLLL != null) {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                C0VYT c0vyt = C0VYT.LIZLLL;
                c0vyt.LIZ.put("total", jUptimeMillis - c0vyt.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C0VXF.post(new Runnable() { // from class: X.0VdB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InitMonitor@1c0d.end$1");
                    try {
                        if (C0VYT.LIZLLL != null) {
                            C801990Vd7 c801990Vd7 = new C801990Vd7("npthStart");
                            c801990Vd7.LIZIZ = C0VYT.LIZLLL.LIZ;
                            c801990Vd7.LIZ();
                            C0VYT.LIZLLL = null;
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InitMonitor@1c0d.end$1");
                }
            });
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        C801930Vd1.LIZ = true;
        init(context, iCommonParams, true, false, true, true);
    }

    public static void mapsParserScanDirectory(String str, boolean z) {
        NativeBridge.LJJIL(str, z);
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        synchronized (c802410Vdn.LJ) {
            try {
                if (crashType == CrashType.ALL) {
                    c802410Vdn.LJ.addMulti(iCrashCallback, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
                } else {
                    c802410Vdn.LJ.add(crashType, iCrashCallback);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void registerCrashInfoCallback(C801770Vcl c801770Vcl, CrashType crashType) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        synchronized (c802410Vdn.LJFF) {
            try {
                if (crashType == CrashType.ALL) {
                    c802410Vdn.LJFF.addMulti(c801770Vcl, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
                } else {
                    c802410Vdn.LJFF.add(crashType, c801770Vcl);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void registerPreCrashCallback(InterfaceC802370Vdj interfaceC802370Vdj, CrashType crashType) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        synchronized (c802410Vdn.LJIIIZ) {
            try {
                if (crashType == CrashType.ALL) {
                    c802410Vdn.LJIIIZ.addMulti(interfaceC802370Vdj, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
                } else {
                    c802410Vdn.LJIIIZ.add(crashType, interfaceC802370Vdj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void registerSdk(int i, String str) {
        sCachedDataCenter.LIZIZ.put(Integer.valueOf(i), str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.LJIIIZ(attachUserData, crashType);
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.LJIIIZ(attachUserData, crashType);
    }

    public static void removeCrashInfoCallback(InterfaceC801650VcZ interfaceC801650VcZ, CrashType crashType) {
        if (interfaceC801650VcZ != null) {
            C802410Vdn c802410Vdn = sCachedDataCenter;
            synchronized (c802410Vdn.LJIIJ) {
                try {
                    if (crashType == CrashType.ALL) {
                        c802410Vdn.LJIIJ.removeAll(interfaceC801650VcZ);
                    } else {
                        c802410Vdn.LJIIJ.removeInList(crashType, interfaceC801650VcZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void reportBizException(String str, InterfaceC803700Vfs interfaceC803700Vfs) {
        reportBizException(str, interfaceC803700Vfs, false);
    }

    public static void setAnrInfoFileObserver(String str, InterfaceC803860Vg8 interfaceC803860Vg8) {
        C0VXF.post(new ARunnableS8S1000000_13(str, 0));
    }

    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        addAttachUserData(attachUserData, crashType);
    }

    public static void setCustomCrashReasonArrayLimit(String str, int i) {
        ((ConcurrentHashMap) sCachedDataCenter.LJIILJJIL).put(str, Integer.valueOf(i));
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        synchronized (c802410Vdn.LJ) {
            try {
                if (crashType == CrashType.ALL) {
                    c802410Vdn.LJ.removeAll(iCrashCallback);
                } else {
                    c802410Vdn.LJ.removeInList(crashType, iCrashCallback);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void unregisterHprofCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJII).remove(iOOMCallback);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        ((CopyOnWriteArrayList) sCachedDataCenter.LJI).remove(iOOMCallback);
    }

    public static void unregisterPreCrashCallback(InterfaceC802370Vdj interfaceC802370Vdj, CrashType crashType) {
        C802410Vdn c802410Vdn = sCachedDataCenter;
        synchronized (c802410Vdn.LJIIIZ) {
            try {
                if (crashType == CrashType.ALL) {
                    c802410Vdn.LJIIIZ.removeAll(interfaceC802370Vdj);
                } else {
                    c802410Vdn.LJIIIZ.removeInList(crashType, interfaceC802370Vdj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void registerSdk(String str, String str2) {
        sCachedDataCenter.LIZJ.put(str, str2);
    }

    public static void enableALogCollector(final String str, final C0VXQ c0vxq, final C0VXO c0vxo) {
        if (!TextUtils.isEmpty(str) && new C0VSJ(str).exists() && !TextUtils.isEmpty(str) && C802110VdJ.LIZ == null) {
            C802110VdJ.LIZ = new InterfaceC801750Vcj(str, c0vxq, c0vxo) { // from class: X.0VXP
                public final C0VSJ LIZ;
                public final C0VXQ LIZIZ;
                public final C0VXO LIZJ;

                @Override // X.InterfaceC801750Vcj
                public final boolean isInit() {
                    return true;
                }

                @Override // X.InterfaceC801750Vcj
                public final void flush() {
                    C0VXQ c0vxq2 = this.LIZIZ;
                    if (c0vxq2 != null) {
                        try {
                            ((C0VXS) c0vxq2).getClass();
                            ALog.flush();
                            ALog.forceLogSharding();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C801940Vd2.LIZJ(th);
                        }
                    }
                }

                @Override // X.InterfaceC801750Vcj
                public final List<String> LIZ(long j, String str2) {
                    if (this.LIZ.exists()) {
                        Object c0vxn = this.LIZJ;
                        if (c0vxn instanceof C0VXN) {
                            c0vxn = new C0VXN(str2);
                        }
                        try {
                            return ((C0VXN) c0vxn).LIZ(j, this.LIZ.getAbsolutePath());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return null;
                        }
                    }
                    return null;
                }

                {
                    this.LIZ = new C0VSJ(str);
                    this.LIZIZ = c0vxq;
                    this.LIZJ = c0vxo;
                }
            };
        }
    }

    public static void reportBizException(String str, InterfaceC803700Vfs interfaceC803700Vfs, boolean z) {
        Set<String> set;
        if (str != null && interfaceC803700Vfs != null) {
            C1189304l1 c1189304l1 = RunnableC801890Vcx.LLILZIL.LL;
            if (c1189304l1 == null || (c1189304l1.LIZ && (set = c1189304l1.LIZIZ) != null && set.contains(str))) {
                interfaceC803700Vfs.LIZ();
            }
        }
    }

    public static void reportGameException(final String str, final String str2, final String str3) {
        if (C801930Vd1.LIZLLL()) {
            if ((TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) || C801880Vcw.LIZ) {
                return;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final String name = C786410Ut5.u3().getName();
            C0VXF.post(new Runnable(name, jCurrentTimeMillis, str, str2, str3) { // from class: X.0Vcv
                public final long LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final String LLILZ;
                public final String LLILZIL;

                public final void LIZ() {
                    C802790VeP c802790VeP = k.LIZ;
                    if (c802790VeP == null) {
                        return;
                    }
                    try {
                        C801830Vcr c801830VcrLIZ = C801860Vcu.LIZ(c802790VeP, this.LLILZ, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZIL);
                        if (b.LJI(o.LJFF(CrashType.GAME, c801830VcrLIZ.LIZIZ.LIZ), c801830VcrLIZ.LIZ)) {
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GameCrash$UploadProcess@76e1.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GameCrash$UploadProcess@76e1.run");
                }

                {
                    this.LLILZ = name;
                    this.LL = jCurrentTimeMillis;
                    this.LLILLJJLI = str;
                    this.LLILLL = str2;
                    this.LLILZIL = str3;
                }
            });
        }
    }

    public static void scanNativeCrash(Context context, AbstractC803830Vg5 abstractC803830Vg5, String[] strArr) {
        File[] fileArrListFiles = new C0VSJ(C0VX9.LJI(context), "crash").listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        try {
            System.loadLibrary("npth");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                Librarian.LJI(C0VX9.LJ(), "npth");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        ArrayList<CrashSummary> arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            CrashSummary crashSummaryLoadFromDirectory = CrashSummary.loadFromDirectory(file, true);
            if (crashSummaryLoadFromDirectory != null) {
                arrayList.add(crashSummaryLoadFromDirectory);
            }
        }
        for (CrashSummary crashSummary : arrayList) {
            if (crashSummary != null) {
                crashSummary.getCrashType();
                crashSummary.getStartTime();
                crashSummary.getCrashTime();
                crashSummary.getProcessName();
                crashSummary.getStackTrace();
                throw null;
            }
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i, String str) {
        C801930Vd1.LIZ = true;
        C801930Vd1.LIZIZ = i;
        C801930Vd1.LIZJ = str;
        init(context, iCommonParams, true, true, true, true);
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map) {
        if (str != null && th != null) {
            reportBizException(str, th, str2, map, false);
        }
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, InterfaceC803820Vg4 interfaceC803820Vg4) {
        if (C801930Vd1.LIZLLL() && !TextUtils.isEmpty(str)) {
            C801850Vct.LIZ(str, map, map2);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        init(context, iCommonParams, z, z, z2, z3);
    }

    public static synchronized f initSDK(Context context, String str, int i, long j, String str2) {
        return k.LIZ(i, j, context, str, str2);
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map, boolean z) {
        if (str != null && th != null) {
            RunnableC801890Vcx.LLILZIL.LIZIZ(str, th, str2, map, null, z);
        }
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2) {
        if (str != null && th != null) {
            reportBizException(str, th, str2, map, map2, false);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        init(context, iCommonParams, z, z2, z3, z4, 0L);
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2, boolean z) {
        if (str != null && th != null) {
            RunnableC801890Vcx.LLILZIL.LIZIZ(str, th, str2, map, map2, z);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        init(null, context, iCommonParams, z, z2, z3, z4, j);
    }

    public static synchronized void init(Application application, Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        init(context, iCommonParams);
    }
}
