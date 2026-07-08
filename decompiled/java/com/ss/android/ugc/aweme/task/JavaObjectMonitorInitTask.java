package com.ss.android.ugc.aweme.task;

import X.C01GW;
import X.C0CCZ;
import X.C0V1I;
import X.C0VZ0;
import X.C2188811AlT;
import X.C2257208ss;
import X.C2470409mA;
import X.C452501pT;
import X.C786410Ut5;
import X.C791560V3i;
import X.C792190V5t;
import X.C792310V6f;
import X.C792420V6q;
import X.C792910V8n;
import X.C794350VEb;
import X.C794440VEk;
import X.C794460VEm;
import X.C794470VEn;
import X.C794480VEo;
import X.C794490VEp;
import X.C794500VEq;
import X.C794510VEr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS557S0100000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class JavaObjectMonitorInitTask implements C0CCZ {
    public long LL = 60000;
    public long LLILLJJLI = -1;
    public final HandlerThread LLILLL = new HandlerThread("jom");
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 131));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "JavaObjectMonitorInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final void LIZ() {
        JSONObject jSONObject;
        ByteBuffer allocReportInfo;
        if (SystemClock.elapsedRealtime() - this.LLILLJJLI > this.LL / ((long) 2)) {
            C794500VEq c794500VEq = C794510VEr.LIZ.LIZ;
            if (c794500VEq == null) {
                c794500VEq = null;
            }
            c794500VEq.getClass();
            C794460VEm c794460VEm = new C794460VEm();
            if (C791560V3i.LJIIJJI) {
                if (-1 == C794440VEk.LIZIZ && C791560V3i.LJIIJJI) {
                    C794440VEk.LIZIZ = MonitorJni.initJavaMem() ? 1 : 0;
                }
                if (C794440VEk.LIZIZ == 1 && (allocReportInfo = MonitorJni.getAllocReportInfo()) != null) {
                    allocReportInfo.order(ByteOrder.LITTLE_ENDIAN);
                    allocReportInfo.position(0);
                    if (allocReportInfo.getInt() == 123457) {
                        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                        C794480VEo c794480VEo = new C794480VEo();
                        allocReportInfo.getLong();
                        String str = new String(bArr, 0, C794440VEk.LIZ(allocReportInfo, bArr), StandardCharsets.US_ASCII);
                        int i = allocReportInfo.getInt();
                        int i2 = allocReportInfo.getInt();
                        int i3 = allocReportInfo.getInt();
                        int i4 = allocReportInfo.getInt();
                        long j = allocReportInfo.getLong();
                        long j2 = allocReportInfo.getLong();
                        long j3 = allocReportInfo.getLong();
                        long j4 = allocReportInfo.getLong();
                        int i5 = allocReportInfo.getInt();
                        C794500VEq c794500VEq2 = new C794500VEq(i, i2, i3, i4);
                        if (C792190V5t.LIZ()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("report totalObjectsCount: ");
                            sbLIZ.append(j3);
                            sbLIZ.append(", totalBytes: ");
                            sbLIZ.append(j4);
                            sbLIZ.append(", recordCount: ");
                            sbLIZ.append(i5);
                            C792910V8n.LIZ("APM-Alloc-RecordReader", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        c794460VEm.LIZIZ.LIZ.clear();
                        c794460VEm.LJ = str;
                        c794460VEm.LIZLLL = c794500VEq2;
                        c794460VEm.LIZJ = j2 - j;
                        c794460VEm.LIZ.ensureCapacity(i5);
                        for (int i6 = 0; i6 < i5; i6++) {
                            String str2 = new String(bArr, 0, C794440VEk.LIZ(allocReportInfo, bArr), StandardCharsets.US_ASCII);
                            int i7 = allocReportInfo.getInt();
                            int i8 = allocReportInfo.getInt();
                            int i9 = allocReportInfo.getInt();
                            allocReportInfo.getLong();
                            allocReportInfo.getInt();
                            allocReportInfo.getLong();
                            c794480VEo.LIZ = allocReportInfo;
                            int iPosition = allocReportInfo.position();
                            c794480VEo.LIZIZ = iPosition;
                            ArrayList<StackTraceElement> arrayList = c794460VEm.LIZIZ.LIZ;
                            c794480VEo.LIZ.position(iPosition);
                            arrayList.ensureCapacity(c794480VEo.LIZ.getInt());
                            C794490VEp c794490VEp = c794460VEm.LIZIZ;
                            if (c794490VEp != null) {
                                c794480VEo.LIZ.position(c794480VEo.LIZIZ);
                                int i10 = c794480VEo.LIZ.getInt();
                                for (int i11 = 0; i11 < i10; i11++) {
                                    int iLIZ = C794440VEk.LIZ(c794480VEo.LIZ, c794480VEo.LIZJ);
                                    int iLIZ2 = C794440VEk.LIZ(c794480VEo.LIZ, c794480VEo.LIZLLL);
                                    int i12 = c794480VEo.LIZ.getInt();
                                    byte[] bArr2 = c794480VEo.LIZJ;
                                    byte[] bArr3 = c794480VEo.LIZLLL;
                                    String str3 = new String(bArr2, 0, iLIZ, StandardCharsets.US_ASCII);
                                    String str4 = new String(bArr3, 0, iLIZ2, StandardCharsets.US_ASCII);
                                    int iLastIndexOf = str3.lastIndexOf(46);
                                    c794490VEp.LIZ.add(new StackTraceElement(str3.substring(0, iLastIndexOf), str3.substring(iLastIndexOf + 1, iLIZ), str4, i12));
                                }
                            }
                            c794460VEm.LIZ.add(new C2470409mA(str2, i8, new ArrayList(c794460VEm.LIZIZ.LIZ), i9, i7, c794460VEm.LJ));
                            c794460VEm.LIZIZ.LIZ.clear();
                        }
                    }
                    if (allocReportInfo != null && C791560V3i.LJIIJJI) {
                        allocReportInfo.order(ByteOrder.LITTLE_ENDIAN);
                        allocReportInfo.position(0);
                        if (allocReportInfo.getInt() == 123457) {
                            MonitorJni.releaseByteBuffer(allocReportInfo.getLong());
                        }
                    }
                }
            }
            ArrayList<C2470409mA> arrayList2 = c794460VEm.LIZ;
            long j5 = c794460VEm.LIZJ;
            C794500VEq c794500VEq3 = c794460VEm.LIZLLL;
            if (c794500VEq3 == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("enable_alloc_collect", true);
                    jSONObject.put("enable_alloc_upload", true);
                    jSONObject.put("alloc_collect_per_thousand_alloc", c794500VEq3.LIZ);
                    jSONObject.put("alloc_dump_per_thousand_collect", c794500VEq3.LIZIZ);
                    jSONObject.put("alloc_threshold_alloc_frequency", c794500VEq3.LIZJ);
                    jSONObject.put("alloc_threshold_alloc_size", c794500VEq3.LIZLLL);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C794470VEn c794470VEn = new C794470VEn(arrayList2, j5, jSONObject);
            if (arrayList2 != null && arrayList2.size() != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (C2470409mA c2470409mA : arrayList2) {
                    try {
                        JSONObject jSONObjectLIZIZ = C2257208ss.LIZ().LIZIZ();
                        jSONObjectLIZIZ.put("is_main_process", C792420V6q.LJIILJJIL());
                        jSONObjectLIZIZ.put("process_name", C792420V6q.LJ());
                        JSONObject jSONObjectLIZIZ2 = c2470409mA.LIZIZ(jSONObjectLIZIZ);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("alloc_duration", c794470VEn.LIZJ);
                        Iterator<String> itKeys = c794470VEn.LIZ.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject2.put(next, c794470VEn.LIZ.opt(next));
                        }
                        jSONObjectLIZIZ2.put("custom", jSONObject2);
                        jSONObjectLIZIZ2.put("event_type", c2470409mA.LJFF == 1 ? "alloc_frequent_object" : "alloc_large_object");
                        C0V1I c0v1i = new C0V1I("java_alloc_monitor", jCurrentTimeMillis, jSONObjectLIZIZ2);
                        try {
                            c0v1i.LIZJ = true;
                            C792310V6f.LJIIIZ().LIZJ(c0v1i);
                        } catch (JSONException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                }
            } else if (C792190V5t.LIZ()) {
                C792910V8n.LIZLLL("APM-JavaAlloc", "empty report info");
            }
        }
        this.LLILLJJLI = SystemClock.elapsedRealtime();
        C786410Ut5.LJLJJI(0, this.LL, (Handler) this.LLILZ.getValue());
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        JavaObjectMonitorConfig javaObjectMonitorConfigLIZ;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        if (Build.VERSION.SDK_INT >= 26 && (javaObjectMonitorConfigLIZ = C794350VEb.LIZ()) != null && javaObjectMonitorConfigLIZ.enable) {
            SecureRandom secureRandom = new SecureRandom();
            JavaObjectMonitorConfig javaObjectMonitorConfigLIZ2 = C794350VEb.LIZ();
            if (javaObjectMonitorConfigLIZ2 != null && (i4 = javaObjectMonitorConfigLIZ2.client_sample_rate) > 0 && secureRandom.nextInt(i4) != 0) {
                return;
            }
            JavaObjectMonitorConfig javaObjectMonitorConfigLIZ3 = C794350VEb.LIZ();
            if (javaObjectMonitorConfigLIZ3 != null) {
                i = javaObjectMonitorConfigLIZ3.report_interval;
            } else {
                i = 0;
            }
            int i5 = LSPassThroughRecordSizeConfig.DEFAULT;
            if (i >= 1) {
                this.LL = i * LSPassThroughRecordSizeConfig.DEFAULT;
            }
            C794440VEk c794440VEk = C794510VEr.LIZ;
            JavaObjectMonitorConfig javaObjectMonitorConfigLIZ4 = C794350VEb.LIZ();
            if (javaObjectMonitorConfigLIZ4 != null) {
                i5 = javaObjectMonitorConfigLIZ4.collect_per_thousand_alloc;
            }
            JavaObjectMonitorConfig javaObjectMonitorConfigLIZ5 = C794350VEb.LIZ();
            if (javaObjectMonitorConfigLIZ5 != null) {
                i2 = javaObjectMonitorConfigLIZ5.dump_per_thousand_collect;
            } else {
                i2 = 100;
            }
            JavaObjectMonitorConfig javaObjectMonitorConfigLIZ6 = C794350VEb.LIZ();
            if (javaObjectMonitorConfigLIZ6 != null) {
                i3 = javaObjectMonitorConfigLIZ6.threshold_alloc_frequency;
            } else {
                i3 = 100;
            }
            JavaObjectMonitorConfig javaObjectMonitorConfigLIZ7 = C794350VEb.LIZ();
            if (javaObjectMonitorConfigLIZ7 != null) {
                j = javaObjectMonitorConfigLIZ7.threshold_alloc_size;
            } else {
                j = 100;
            }
            C794500VEq c794500VEq = new C794500VEq(i5, i2, i3, j);
            c794440VEk.LIZ = c794500VEq;
            if (-1 == C794440VEk.LIZLLL && C794440VEk.LIZIZ()) {
                C794440VEk.LIZLLL = MonitorJni.setEnableAllocatedMonitor(true, c794500VEq.LIZ, c794500VEq.LIZIZ, c794500VEq.LIZJ, c794500VEq.LIZLLL, MonitorJni.class.getClassLoader()) ? 1 : 0;
            }
            if (C794440VEk.LIZLLL == 1) {
                MonitorJni.startOrStopAllocatedMonitor(true, "ALL_SCENE");
            }
            this.LLILLL.start();
            this.LLILLJJLI = SystemClock.elapsedRealtime();
            C786410Ut5.LJLJJI(0, this.LL, (Handler) this.LLILZ.getValue());
        }
    }
}
