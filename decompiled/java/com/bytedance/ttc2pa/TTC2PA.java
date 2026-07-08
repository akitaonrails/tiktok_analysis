package com.bytedance.ttc2pa;

import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.ttc2pa.utils.Logger;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class TTC2PA {
    public static final TTC2PA LIZ = new TTC2PA();
    public static volatile ITTC2PADepend LIZIZ;
    public static ScheduledExecutorService LIZJ;

    public static Pair LIZ() {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(LIZJ().getContext()), "/ttc2pa_cache/");
        return new Pair(Boolean.valueOf(!c0vsj.exists() ? c0vsj.mkdir() : c0vsj.isDirectory() || (c0vsj.delete() && c0vsj.mkdir())), c0vsj.getPath());
    }

    public static ScheduledExecutorService LIZIZ() {
        ScheduledExecutorService scheduledExecutorService = LIZJ;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        return null;
    }

    public static ITTC2PADepend LIZJ() {
        ITTC2PADepend iTTC2PADepend = LIZIZ;
        if (iTTC2PADepend != null) {
            return iTTC2PADepend;
        }
        return null;
    }

    public static void LJ(String str, JSONObject jSONObject) {
        LIZJ().monitorLogSend(str, C786410Ut5.J3(jSONObject));
        Logger logger = Logger.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report type:");
        sbLIZ.append(str);
        sbLIZ.append(", content:");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        logger.getClass();
    }

    public static void LIZLLL(TTC2PACallback tTC2PACallback, JSONObject jSONObject, long j, TtC2paResult ttC2paResult) throws JSONException {
        jSONObject.put("cost", SystemClock.uptimeMillis() - j);
        jSONObject.put("error_code", ttC2paResult.LIZ);
        jSONObject.put("error_desc", ttC2paResult.LIZIZ);
        LJ("c2pa_write", jSONObject);
        tTC2PACallback.onResult((int) ttC2paResult.LIZ, ttC2paResult.LIZIZ, ttC2paResult.LIZJ);
        Logger logger = Logger.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("write callback: code:");
        sbLIZ.append(ttC2paResult.LIZ);
        sbLIZ.append(", desc:");
        sbLIZ.append(ttC2paResult.LIZIZ);
        sbLIZ.append(", manifest:");
        sbLIZ.append(ttC2paResult.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        logger.getClass();
    }
}
