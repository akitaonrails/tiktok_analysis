package com.ss.android.ugc.aweme.tako.mob;

import X.C098200Yq;
import X.C0SUC;
import X.C189200o6;
import X.C2097608Jq;
import X.C2189821An6;
import X.C2344009Gk;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoAIVideoMobFiller {
    public static final int $stable = 0;
    public static final TakoAIVideoMobFiller INSTANCE = new TakoAIVideoMobFiller();

    public static final boolean isFromAIVideo(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final Map<String, String> toParams(Context context) {
        Object c098200Yq;
        if (context == null) {
            return C2097608Jq.LJ();
        }
        try {
            c098200Yq = toParams(C0SUC.LIZ(context));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C2097608Jq.LJ();
        }
        return (Map) c098200Yq;
    }

    public static final Map<String, String> toParams(C2189821An6 c2189821An6) {
        String takoSessionId;
        if (c2189821An6 == null) {
            return C2097608Jq.LJ();
        }
        String processId = c2189821An6.getProcessId();
        DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
        String takoVideoSessionId = null;
        if (navArgModel != null) {
            takoSessionId = navArgModel.getTakoSessionId();
        } else {
            takoSessionId = null;
        }
        DetailNavArgModel navArgModel2 = c2189821An6.getNavArgModel();
        if (navArgModel2 != null) {
            takoVideoSessionId = navArgModel2.getTakoVideoSessionId();
        }
        return toParams(processId, takoSessionId, takoVideoSessionId);
    }

    public final void appendFeedParams(C2344009Gk c2344009Gk, C2189821An6 c2189821An6) {
        for (Map.Entry<String, String> entry : toParams(c2189821An6).entrySet()) {
            c2344009Gk.LJFF(entry.getKey(), entry.getValue());
        }
    }

    public static final Map<String, String> toParams(String str, String str2, String str3) {
        if (str3 != null && str3.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            if (str != null && str.length() > 0) {
                linkedHashMap.put("process_id", str);
            }
            if (str2 != null && str2.length() > 0) {
                linkedHashMap.put("tako_session_id", str2);
            }
            linkedHashMap.put("video_session_id", str3);
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }
}
