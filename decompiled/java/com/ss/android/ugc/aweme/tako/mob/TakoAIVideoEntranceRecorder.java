package com.ss.android.ugc.aweme.tako.mob;

import X.C2189821An6;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoAIVideoEntranceRecorder {
    public static volatile String processId;
    public static volatile String takoSessionId;
    public static volatile String videoSessionId;
    public static final TakoAIVideoEntranceRecorder INSTANCE = new TakoAIVideoEntranceRecorder();
    public static final int $stable = 8;

    public static /* synthetic */ void getProcessId$annotations() {
    }

    public static /* synthetic */ void getTakoSessionId$annotations() {
    }

    public static /* synthetic */ void getVideoSessionId$annotations() {
    }

    public static final void reset() {
        processId = null;
        takoSessionId = null;
        videoSessionId = null;
    }

    public static final Map<String, String> toParams() {
        return TakoAIVideoMobFiller.toParams(processId, takoSessionId, videoSessionId);
    }

    public static final String getProcessId() {
        return processId;
    }

    public static final String getTakoSessionId() {
        return takoSessionId;
    }

    public static final String getVideoSessionId() {
        return videoSessionId;
    }

    public static final void set(C2189821An6 c2189821An6) {
        String takoSessionId2;
        if (c2189821An6 == null) {
            reset();
            return;
        }
        String processId2 = c2189821An6.getProcessId();
        DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
        String takoVideoSessionId = null;
        if (navArgModel != null) {
            takoSessionId2 = navArgModel.getTakoSessionId();
        } else {
            takoSessionId2 = null;
        }
        DetailNavArgModel navArgModel2 = c2189821An6.getNavArgModel();
        if (navArgModel2 != null) {
            takoVideoSessionId = navArgModel2.getTakoVideoSessionId();
        }
        set(processId2, takoSessionId2, takoVideoSessionId);
    }

    public static final void set(String str, String str2, String str3) {
        if (str3 != null && str3.length() != 0) {
            processId = str;
            takoSessionId = str2;
            videoSessionId = str3;
            return;
        }
        reset();
    }
}
