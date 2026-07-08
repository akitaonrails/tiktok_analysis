package com.ss.android.ugc.aweme.services;

import X.C08FX;
import X.C0X52;
import X.C2175508fh;
import X.C2188811AlT;
import X.C794240VDq;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsApiMonitorService {
    public static final Companion Companion = new Companion();
    public final Handler handler = new BPEAHandler(Looper.getMainLooper());

    public static final class Companion {
    }

    public final void addALog(String str, C0X52<?> c0x52) {
        try {
            C08FX.LIZ(str, c0x52);
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        }
    }

    public final void addFailLog(String str, Throwable th, C2175508fh c2175508fh) {
        String message;
        try {
            Uri uri = UriProtector.parse(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getPath());
            sbLIZ.append(" failed, ");
            if (th == null) {
                message = null;
            } else {
                message = th.getMessage();
            }
            sbLIZ.append(message);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("API_URL_HEADER", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void apiMonitor(String str, String str2, String str3) {
        Uri uri = UriProtector.parse(str);
        if (uri != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("path", uri.getPath());
                jSONObject.put("host", uri.getHost());
                jSONObject.put("body", str3);
                jSONObject.put("requestid", str2);
                jSONObject.put("debug", false);
                C794240VDq.LIZIZ("api_error_service_log", "", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
