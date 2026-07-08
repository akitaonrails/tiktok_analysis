package com.bytedance.android.livesdk.broadcast;

import X.C473410IhP;
import X.C781270Ukn;
import X.C786410Ut5;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.android.live.broadcast.api.ILiveBroadcastLifecycleExposed;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastStorageMonitorFrequencyDayTime;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastStorageMonitorSwitch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class LiveBroadcastLifecycleExposed implements ILiveBroadcastLifecycleExposed {
    @Override // com.bytedance.android.live.broadcast.api.ILiveBroadcastLifecycleExposed
    public final void onLiveCreate() {
        IEffectService iEffectServiceLJI = C781270Ukn.LJI();
        if (iEffectServiceLJI != null) {
            iEffectServiceLJI.onLiveCreate();
        }
        if (LiveBroadcastStorageMonitorSwitch.getValue()) {
            C786410Ut5.LJLIIL(10000L, C473410IhP.LIZ(), new Runnable() { // from class: X.0yEZ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveBroadcastLifecycleExposed@5960.onLiveCreate$1");
                    try {
                        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0yEY
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                if (LiveBroadcastStorageMonitorFrequencyDayTime.getValue() > 0) {
                                    C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.G7;
                                    if (c20337914i1.LIZIZ().longValue() + ((long) (LiveBroadcastStorageMonitorFrequencyDayTime.getValue() * 24 * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT)) < System.currentTimeMillis()) {
                                        c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
                                        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.08OT
                                            public static void LIZIZ() throws JSONException {
                                                long j;
                                                File fileW2;
                                                File fileLIZ;
                                                File fileY2;
                                                File fileX2;
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                ArrayList arrayList = new ArrayList();
                                                try {
                                                    Pair[] pairArr = new Pair[4];
                                                    Context contextLIZ = C176600m4.LIZ();
                                                    String absolutePath = null;
                                                    pairArr[0] = new Pair((contextLIZ == null || (fileX2 = C786410Ut5.x2(contextLIZ)) == null) ? null : fileX2.getAbsolutePath(), "external/cache/ttlive");
                                                    Context contextLIZ2 = C176600m4.LIZ();
                                                    pairArr[1] = new Pair((contextLIZ2 == null || (fileY2 = C786410Ut5.y2(contextLIZ2, null)) == null) ? null : fileY2.getAbsolutePath(), "external/files/ttlive");
                                                    Context contextLIZ3 = C176600m4.LIZ();
                                                    pairArr[2] = new Pair((contextLIZ3 == null || (fileLIZ = LIZ(contextLIZ3)) == null) ? null : fileLIZ.getAbsolutePath(), "internal/files/ttlive");
                                                    Context contextLIZ4 = C176600m4.LIZ();
                                                    if (contextLIZ4 != null && (fileW2 = C786410Ut5.w2(contextLIZ4)) != null) {
                                                        absolutePath = fileW2.getAbsolutePath();
                                                    }
                                                    pairArr[3] = new Pair(absolutePath, "internal/cache/ttlive");
                                                    arrayList.addAll(C1697810uHb.LJIIJJI(pairArr));
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                }
                                                ArrayList<Pair> arrayList2 = new ArrayList();
                                                for (Object obj : arrayList) {
                                                    if (C500260Jjc.LJJIIZ((CharSequence) ((Pair) obj).getFirst())) {
                                                        arrayList2.add(obj);
                                                    }
                                                }
                                                ArrayList<Pair> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                                for (Pair pair : arrayList2) {
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append((String) pair.getFirst());
                                                    sbLIZ.append(File.separator);
                                                    sbLIZ.append("ttlive");
                                                    arrayList3.add(new Pair(C2188811AlT.LIZIZ(sbLIZ), pair.getSecond()));
                                                }
                                                long j2 = 0;
                                                for (Pair pair2 : arrayList3) {
                                                    String str = (String) pair2.getFirst();
                                                    String str2 = (String) pair2.getSecond();
                                                    C0VSJ c0vsj = new C0VSJ(str);
                                                    if (c0vsj.exists()) {
                                                        if (c0vsj.isFile()) {
                                                            long jLIZ = C771370UNr.LIZ(c0vsj);
                                                            j2 += jLIZ;
                                                            linkedHashMap.put(str2, Long.valueOf(jLIZ));
                                                        } else {
                                                            File[] fileArrListFiles = c0vsj.listFiles();
                                                            if (fileArrListFiles != null) {
                                                                j = 0;
                                                                for (File file : fileArrListFiles) {
                                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                    sbLIZ2.append(str2);
                                                                    sbLIZ2.append(File.separator);
                                                                    sbLIZ2.append(file.getName());
                                                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                                                    long jLIZ2 = C771370UNr.LIZ(file);
                                                                    j += jLIZ2;
                                                                    linkedHashMap.put(strLIZIZ, Long.valueOf(jLIZ2));
                                                                }
                                                            } else {
                                                                j = 0;
                                                            }
                                                            j2 += j;
                                                            linkedHashMap.put(str2, Long.valueOf(j));
                                                        }
                                                    }
                                                }
                                                linkedHashMap.put("livetotal", Long.valueOf(j2));
                                                JSONObject jSONObject = new JSONObject();
                                                JSONObject jSONObject2 = new JSONObject();
                                                JSONObject jSONObject3 = new JSONObject();
                                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                    jSONObject3.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                                                }
                                                C1CC2.LJI("ttlive_livesdk_storage_monitor_slardar", jSONObject, jSONObject2, jSONObject3);
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ2;
                                                C1C7U.LIZ("BroadcastMonitorHelper@85f.reportLiveStorageInfoWithSlardar$1");
                                                try {
                                                    LIZIZ();
                                                } finally {
                                                    if (!zLIZ2) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("BroadcastMonitorHelper@85f.reportLiveStorageInfoWithSlardar$1");
                                            }

                                            public static File LIZ(Context context) throws Throwable {
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
                                        });
                                    }
                                } else {
                                    C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.08OT
                                        public static void LIZIZ() throws JSONException {
                                            long j;
                                            File fileW2;
                                            File fileLIZ;
                                            File fileY2;
                                            File fileX2;
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            ArrayList arrayList = new ArrayList();
                                            try {
                                                Pair[] pairArr = new Pair[4];
                                                Context contextLIZ = C176600m4.LIZ();
                                                String absolutePath = null;
                                                pairArr[0] = new Pair((contextLIZ == null || (fileX2 = C786410Ut5.x2(contextLIZ)) == null) ? null : fileX2.getAbsolutePath(), "external/cache/ttlive");
                                                Context contextLIZ2 = C176600m4.LIZ();
                                                pairArr[1] = new Pair((contextLIZ2 == null || (fileY2 = C786410Ut5.y2(contextLIZ2, null)) == null) ? null : fileY2.getAbsolutePath(), "external/files/ttlive");
                                                Context contextLIZ3 = C176600m4.LIZ();
                                                pairArr[2] = new Pair((contextLIZ3 == null || (fileLIZ = LIZ(contextLIZ3)) == null) ? null : fileLIZ.getAbsolutePath(), "internal/files/ttlive");
                                                Context contextLIZ4 = C176600m4.LIZ();
                                                if (contextLIZ4 != null && (fileW2 = C786410Ut5.w2(contextLIZ4)) != null) {
                                                    absolutePath = fileW2.getAbsolutePath();
                                                }
                                                pairArr[3] = new Pair(absolutePath, "internal/cache/ttlive");
                                                arrayList.addAll(C1697810uHb.LJIIJJI(pairArr));
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                            }
                                            ArrayList<Pair> arrayList2 = new ArrayList();
                                            for (Object obj : arrayList) {
                                                if (C500260Jjc.LJJIIZ((CharSequence) ((Pair) obj).getFirst())) {
                                                    arrayList2.add(obj);
                                                }
                                            }
                                            ArrayList<Pair> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                            for (Pair pair : arrayList2) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append((String) pair.getFirst());
                                                sbLIZ.append(File.separator);
                                                sbLIZ.append("ttlive");
                                                arrayList3.add(new Pair(C2188811AlT.LIZIZ(sbLIZ), pair.getSecond()));
                                            }
                                            long j2 = 0;
                                            for (Pair pair2 : arrayList3) {
                                                String str = (String) pair2.getFirst();
                                                String str2 = (String) pair2.getSecond();
                                                C0VSJ c0vsj = new C0VSJ(str);
                                                if (c0vsj.exists()) {
                                                    if (c0vsj.isFile()) {
                                                        long jLIZ = C771370UNr.LIZ(c0vsj);
                                                        j2 += jLIZ;
                                                        linkedHashMap.put(str2, Long.valueOf(jLIZ));
                                                    } else {
                                                        File[] fileArrListFiles = c0vsj.listFiles();
                                                        if (fileArrListFiles != null) {
                                                            j = 0;
                                                            for (File file : fileArrListFiles) {
                                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                sbLIZ2.append(str2);
                                                                sbLIZ2.append(File.separator);
                                                                sbLIZ2.append(file.getName());
                                                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                                                long jLIZ2 = C771370UNr.LIZ(file);
                                                                j += jLIZ2;
                                                                linkedHashMap.put(strLIZIZ, Long.valueOf(jLIZ2));
                                                            }
                                                        } else {
                                                            j = 0;
                                                        }
                                                        j2 += j;
                                                        linkedHashMap.put(str2, Long.valueOf(j));
                                                    }
                                                }
                                            }
                                            linkedHashMap.put("livetotal", Long.valueOf(j2));
                                            JSONObject jSONObject = new JSONObject();
                                            JSONObject jSONObject2 = new JSONObject();
                                            JSONObject jSONObject3 = new JSONObject();
                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                jSONObject3.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                                            }
                                            C1CC2.LJI("ttlive_livesdk_storage_monitor_slardar", jSONObject, jSONObject2, jSONObject3);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ2;
                                            C1C7U.LIZ("BroadcastMonitorHelper@85f.reportLiveStorageInfoWithSlardar$1");
                                            try {
                                                LIZIZ();
                                            } finally {
                                                if (!zLIZ2) {
                                                }
                                            }
                                            C1C7U.LIZIZ("BroadcastMonitorHelper@85f.reportLiveStorageInfoWithSlardar$1");
                                        }

                                        public static File LIZ(Context context) throws Throwable {
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
                                    });
                                }
                                return false;
                            }
                        }, Looper.myQueue());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveBroadcastLifecycleExposed@5960.onLiveCreate$1");
                }
            });
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.ILiveBroadcastLifecycleExposed
    public final void onLiveDestroy() {
        IEffectService iEffectServiceLJI = C781270Ukn.LJI();
        if (iEffectServiceLJI != null) {
            iEffectServiceLJI.onLiveDestroy();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.ILiveBroadcastLifecycleExposed
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
