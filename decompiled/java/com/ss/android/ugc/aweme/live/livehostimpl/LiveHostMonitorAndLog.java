package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C086I;
import X.C08FQ;
import X.C08FX;
import X.C0IIE;
import X.C0IJT;
import X.C0WYJ;
import X.C0WYK;
import X.C0X4T;
import X.C1161920gLG;
import X.C15MX;
import X.C1851040yGk;
import X.C1AF0;
import X.C308260C6m;
import X.C474500IjA;
import X.C786410Ut5;
import X.C793770VBv;
import X.C794240VDq;
import X.C802510Vdx;
import android.text.TextUtils;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS193S0000000_7;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class LiveHostMonitorAndLog implements IHostMonitorAndLog {
    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void Iz0() {
        try {
            Iterator<Map.Entry<String, ArrayList<C15MX>>> it2 = C08FX.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                ArrayList<C15MX> value = it2.next().getValue();
                if (!C086I.LIZIZ(value)) {
                    Iterator<C15MX> it3 = value.iterator();
                    while (it3.hasNext()) {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Network", it3.next().toString());
                    }
                }
            }
            C08FX.LIZIZ.clear();
            C786410Ut5.LJLIIL(60000L, new BPEAHandler(), new Runnable() { // from class: X.0VJu
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ApiAlogManager@c53c.uploadLog$2");
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j2 = (jCurrentTimeMillis / j) - ((long) 10800);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() / j;
                        C827360Wcw c827360Wcw = ALog.sConfig;
                        C793770VBv.LIZ(c827360Wcw != null ? c827360Wcw.LJFF : null, j2, jCurrentTimeMillis2, "Network", new InterfaceC794220VDo() { // from class: X.0VJv
                            @Override // X.InterfaceC794220VDo
                            public final void LIZ() {
                                try {
                                    ALog.flush();
                                    ALog.forceLogSharding();
                                    Thread.sleep(1000L);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }, null);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ApiAlogManager@c53c.uploadLog$2");
                }
            });
            C802510Vdx.LJ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", C08FQ.LIZ());
            C793770VBv.LJII("rig_feedback", jSONObject, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final C0IIE Ru2() {
        return new C0IIE() { // from class: X.0J8u
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(150));

            @Override // X.C0IIE
            public final void LIZ() {
                ((InterfaceC487230J8v) this.LIZ.getValue()).LIZ();
            }

            @Override // X.C0IIE
            public final void LIZIZ(String str) {
                ((InterfaceC487230J8v) this.LIZ.getValue()).LIZIZ(str);
            }

            @Override // X.C0IIE
            public final void LIZJ(String str, String str2) {
                ((InterfaceC487230J8v) this.LIZ.getValue()).LIZJ(str, str2);
            }
        };
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void Wp2(JSONObject jSONObject) {
        try {
            long jOptLong = jSONObject.optLong("download_size_delta", -1L);
            String strOptString = jSONObject.optString("live_stream_session_id", "");
            if (jOptLong > 0 && !TextUtils.isEmpty(strOptString)) {
                C793770VBv.LJIJ(jOptLong, strOptString, "live", "");
                if (C308260C6m.LIZ()) {
                    C0X4T.LJJIJ += jOptLong;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void ensureNotReachHere(Throwable th, String str) {
        C1AF0.LJFF(th, str);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        C794240VDq.LIZJ(str, jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0229, code lost:
    
        com.ss.android.common.lib.AppLogNewUtils.LJFF(r7, r4);
        X.C2213981Bky.LIZIZ.isDebug();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0232, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0233, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0236, code lost:
    
        X.C20684815ws.LJII(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0239, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
    
        if ((!((com.ss.android.ugc.aweme.experiment.LiveAppLogInnerSerializeOptExperiment.LiveAppLogInnerSerializeOptConfig) r1.getValue()).getWhiteList().contains(r7)) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        if ((!((com.ss.android.ugc.aweme.experiment.LiveAppLogInnerSerializeOptExperiment.LiveAppLogInnerSerializeOptConfig) r1.getValue()).getWhiteList().contains(r7)) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017c, code lost:
    
        if (X.C2213981Bky.LIZIZ.LIZLLL() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017e, code lost:
    
        r1 = X.C2211941Bhg.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
    
        if (r1.LIZLLL() != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        r1.addDebugInfo(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0189, code lost:
    
        r4 = X.C20512115Od.LIZ.LIZIZ(r7, new org.json.JSONObject());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        if (r4 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        r4 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ef, code lost:
    
        if (r8 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f1, code lost:
    
        r2 = r8.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fd, code lost:
    
        if (r2.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ff, code lost:
    
        r0 = r2.next();
        r4.put(r0.getKey(), r0.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0217, code lost:
    
        if (com.ss.android.common.applog.AppLog.getSwitchToBdtracker() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0219, code lost:
    
        r4.put("__applog_use_json_object", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0228, code lost:
    
        throw new java.lang.RuntimeException(r1);
     */
    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GC1(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostMonitorAndLog.GC1(java.lang.String, java.util.Map, boolean):void");
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void MD2(int i, int i2, long j) {
        C0WYK c0wykLJIILLIIL = C0WYJ.LJIILLIIL(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cep_disk_clean_info");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "clean_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "clean_rule");
        c474500IjALIZ.LJJII(C786410Ut5.j4("%.2f", new Object[]{Float.valueOf((j / 1024.0f) / 1024.0f)}), "clean_size");
        c474500IjALIZ.LJJII(C786410Ut5.j4("%.2f", new Object[]{Float.valueOf((c0wykLJIILLIIL.LJ / 1024.0f) / 1024.0f)}), "disk_appusage_space");
        c474500IjALIZ.LJJII(C786410Ut5.j4("%.2f", new Object[]{Float.valueOf((c0wykLJIILLIIL.LIZJ / 1024.0f) / 1024.0f)}), "disk_free_space");
        c474500IjALIZ.LJJII(C1851040yGk.LIZIZ, "cep_live_activity");
        c474500IjALIZ.LJJII(C1851040yGk.LIZJ, "cep_disk_attention");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        C1AF0.LJI(th, str, map);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorDirectOnTimer(String str, String str2, float f) {
        C794240VDq.LJFF(str, str2, f);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJFF(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIIZ(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void vn(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
    }
}
