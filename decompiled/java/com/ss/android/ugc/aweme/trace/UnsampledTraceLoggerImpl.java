package com.ss.android.ugc.aweme.trace;

import X.C01GW;
import X.C0VGA;
import X.C0VGB;
import X.C793550VAz;
import X.C794230VDp;
import X.C806940Vl6;
import X.C806950Vl7;
import X.C806990VlB;
import X.C807000VlC;
import X.C827310Wcr;
import android.content.Context;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.AwS64S1000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class UnsampledTraceLoggerImpl implements IUnsampledTraceLogger {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public C806990VlB LJI;
    public volatile C827310Wcr LJII;

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZIZ() throws JSONException {
        if (this.LIZLLL) {
            C0VGA.LJIIIIZZ(new C806940Vl6(this));
            return;
        }
        C807000VlC c807000VlC = C807000VlC.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t_biz", "trace_log");
        jSONObject.put("t_m_cgy", "upload");
        jSONObject.put("t_sc", -2);
        c807000VlC.getClass();
        C807000VlC.LIZLLL(jSONObject);
    }

    public final C806990VlB LIZJ() {
        if (this.LJI == null) {
            C827310Wcr c827310Wcr = this.LJII;
            this.LJI = ALog.createInstance("traceAlog", c827310Wcr != null ? c827310Wcr.LIZ() : null);
        }
        return this.LJI;
    }

    public UnsampledTraceLoggerImpl() {
        C01GW c01gw = C0VGB.LIZIZ;
        Integer num = ((TraceLogConfig) c01gw.getValue()).unsampledMaxDiskCacheSize;
        this.LIZ = num != null ? num.intValue() : 557056;
        Integer num2 = ((TraceLogConfig) c01gw.getValue()).unsampledMaxLogSize;
        this.LIZIZ = num2 != null ? num2.intValue() : 4000;
        Integer num3 = ((TraceLogConfig) c01gw.getValue()).unsampledPerSize;
        this.LIZJ = num3 != null ? num3.intValue() : 65536;
        C806950Vl7 c806950Vl7 = C806950Vl7.LIZIZ;
        this.LIZLLL = c806950Vl7.LJII();
        this.LJ = c806950Vl7.LJI();
        this.LJFF = Intrinsics.LJFF(C0VGA.LIZ().checkAndReportLog, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZ(Context context, String str) {
        if (!this.LIZLLL) {
            return;
        }
        C827310Wcr c827310Wcr = new C827310Wcr(context);
        c827310Wcr.LJFF = false;
        c827310Wcr.LJI = false;
        c827310Wcr.LIZJ = this.LIZJ;
        c827310Wcr.LIZIZ = this.LIZ;
        c827310Wcr.LJ = str;
        this.LJII = c827310Wcr;
        C793550VAz.LIZJ.LIZ = new C794230VDp(this);
        if (this.LJFF) {
            C0VGA.LJIIIIZZ(new AwS64S1000000_13(str, 1));
        }
    }
}
