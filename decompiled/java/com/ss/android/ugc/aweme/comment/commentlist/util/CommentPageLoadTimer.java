package com.ss.android.ugc.aweme.comment.commentlist.util;

import X.C1344440l5e;
import X.C1344450l5f;
import X.C1344460l5g;
import X.C1C7U;
import X.C2188811AlT;
import X.C733390Spl;
import X.C793770VBv;
import X.C818480W8w;
import X.InterfaceC1344310l5R;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.d1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPageLoadTimer {
    public static final CommentPageLoadTimer LIZ = new CommentPageLoadTimer();
    public static final MyHandler LIZIZ = new MyHandler();
    public static C1344440l5e LIZJ;
    public static d1 LIZLLL;

    public static final class MyHandler extends BPEAHandler {
        public MyHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data;
            Long lValueOf;
            C1344440l5e c1344440l5e;
            long jLIZJ;
            InterfaceC1344310l5R interfaceC1344310l5R;
            int i;
            C1C7U.LIZ("CommentPageLoadTimer$MyHandler@9927.handleMessage");
            super.handleMessage(message);
            if (message.what == 0 && (data = message.getData()) != null && (lValueOf = Long.valueOf(data.getLong("key_finish_ts"))) != null && (c1344440l5e = CommentPageLoadTimer.LIZJ) != null) {
                c1344440l5e.LJI = lValueOf.longValue();
                if (CommentPageLoadTimer.LIZJ.LIZIZ() >= 0 && CommentPageLoadTimer.LIZJ.LIZ() >= 0 && CommentPageLoadTimer.LIZJ.LIZLLL() >= 0) {
                    C1344440l5e c1344440l5e2 = CommentPageLoadTimer.LIZJ;
                    if (c1344440l5e2 != null && (interfaceC1344310l5R = c1344440l5e2.LJII) != null) {
                        long jLIZJ2 = c1344440l5e2.LIZJ();
                        C1344440l5e c1344440l5e3 = CommentPageLoadTimer.LIZJ;
                        if (c1344440l5e3 != null) {
                            i = c1344440l5e3.LIZJ;
                        } else {
                            i = 0;
                        }
                        interfaceC1344310l5R.LIZ(i, jLIZJ2, true);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CommentPageLoadTimer: finishRecord(): duration = ");
                    CommentPageLoadTimer.LIZ.getClass();
                    C1344440l5e c1344440l5e4 = CommentPageLoadTimer.LIZJ;
                    if (c1344440l5e4 != null) {
                        jLIZJ = c1344440l5e4.LIZJ();
                    } else {
                        jLIZJ = -1;
                    }
                    sbLIZ.append(jLIZJ);
                    C733390Spl.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    CommentPageLoadTimer.LIZIZ();
                    CommentPageLoadTimer.LIZJ = null;
                    CommentPageLoadTimer.LIZLLL = null;
                }
            }
            C1C7U.LIZIZ("CommentPageLoadTimer$MyHandler@9927.handleMessage");
        }
    }

    public static void LIZIZ() {
        C1344440l5e c1344440l5e;
        C1344440l5e c1344440l5e2;
        String str;
        String str2;
        String str3 = "";
        C1344440l5e c1344440l5e3 = LIZJ;
        if (c1344440l5e3 == null || c1344440l5e3.LIZIZ() < 0 || (c1344440l5e = LIZJ) == null || c1344440l5e.LIZ() < 0 || (c1344440l5e2 = LIZJ) == null || c1344440l5e2.LIZLLL() < 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C1344440l5e c1344440l5e4 = LIZJ;
            jSONObject.put("need_refresh", c1344440l5e4 != null ? Boolean.valueOf(c1344440l5e4.LIZ) : null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            C1344440l5e c1344440l5e5 = LIZJ;
            jSONObject2.put("is_first", c1344440l5e5 != null ? Boolean.valueOf(c1344440l5e5.LIZ) : null);
            C1344440l5e c1344440l5e6 = LIZJ;
            jSONObject2.put("list_count", c1344440l5e6 != null ? Integer.valueOf(c1344440l5e6.LIZJ) : null);
            C1344440l5e c1344440l5e7 = LIZJ;
            if (c1344440l5e7 == null || (str2 = c1344440l5e7.LIZIZ) == null) {
                str2 = "";
            }
            jSONObject2.put("event_type", str2);
            LIZ.getClass();
            C1344440l5e c1344440l5e8 = LIZJ;
            jSONObject2.put("duration", c1344440l5e8 != null ? c1344440l5e8.LIZJ() : -1L);
            C1344440l5e c1344440l5e9 = LIZJ;
            jSONObject2.put("start_duration", c1344440l5e9 != null ? Long.valueOf(c1344440l5e9.LIZ()) : null);
            C1344440l5e c1344440l5e10 = LIZJ;
            jSONObject2.put("view_duration", c1344440l5e10 != null ? Long.valueOf(c1344440l5e10.LIZLLL()) : null);
            C1344440l5e c1344440l5e11 = LIZJ;
            jSONObject2.put("request_duration", c1344440l5e11 != null ? Long.valueOf(c1344440l5e11.LIZIZ()) : null);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        StringBuilder sb = new StringBuilder("CommentPageLoadTimer: uploadApmAgent(): duration = ");
        C1344440l5e c1344440l5e12 = LIZJ;
        sb.append(c1344440l5e12 != null ? c1344440l5e12.LIZJ() : -1L);
        sb.append(" phase1 = ");
        C1344440l5e c1344440l5e13 = LIZJ;
        sb.append(c1344440l5e13 != null ? Long.valueOf(c1344440l5e13.LIZ()) : null);
        sb.append(" phase2 = ");
        C1344440l5e c1344440l5e14 = LIZJ;
        sb.append(c1344440l5e14 != null ? Long.valueOf(c1344440l5e14.LIZIZ()) : null);
        sb.append(" phase3 = ");
        C1344440l5e c1344440l5e15 = LIZJ;
        sb.append(c1344440l5e15 != null ? Long.valueOf(c1344440l5e15.LIZLLL()) : null);
        sb.append(" is_first = ");
        C1344440l5e c1344440l5e16 = LIZJ;
        sb.append(c1344440l5e16 != null ? Boolean.valueOf(c1344440l5e16.LIZ) : null);
        sb.append(" list_count = ");
        C1344440l5e c1344440l5e17 = LIZJ;
        sb.append(c1344440l5e17 != null ? Integer.valueOf(c1344440l5e17.LIZJ) : null);
        sb.append(" event_type = ");
        C1344440l5e c1344440l5e18 = LIZJ;
        if (c1344440l5e18 != null && (str = c1344440l5e18.LIZIZ) != null) {
            str3 = str;
        }
        sb.append(str3);
        C733390Spl.LIZ(sb.toString());
        C793770VBv.LJII("comment_page_load_time", jSONObject, null, jSONObject2);
    }

    public static final void LIZ(boolean z, String str, C1344450l5f c1344450l5f) {
        C1344460l5g.LIZ.getClass();
        C1344460l5g.LIZJ.LIZ = System.currentTimeMillis();
        C818480W8w.LIZ("comment");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPageLoadTimer: beginRecord(): isFirstShow = ");
        sbLIZ.append(z);
        sbLIZ.append(", eventType=");
        sbLIZ.append(str);
        C733390Spl.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.removeCallbacksAndMessages(null);
        LIZJ = new C1344440l5e(z, str, System.currentTimeMillis(), c1344450l5f);
    }
}
