package com.ss.android.ugc.aweme.video.simcommon;

import X.C1AF0;
import X.C793770VBv;
import X.C794240VDq;
import X.C794420VEi;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SimMonitor implements IMonitor {
    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th) {
        C1AF0.LJ(th);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th, String str) {
        C1AF0.LJFF(th, str);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C794240VDq.LIZJ(str, jSONObject);
    }

    public void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        C794420VEi.LIZIZ(str, str2, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void onReportBizException(String str, Throwable th, String str2, Map<String, String> map, boolean z) {
        Npth.reportBizException(str, th, str2, map, z);
    }
}
