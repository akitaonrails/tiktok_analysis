package com.bytedance.apm.agent.instrumentation;

import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.apm.agent.helper.PageShowHelper;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityInstrumentation {
    public static boolean isFirstWindowFocusChanged;
    public static String sActivityName;
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    public static long sOnCreateEnd;
    public static long sOnCreateStart;
    public static long sOnResumeEnd;
    public static long sOnResumeStart;
    public static long sOnWindowFocusedChangeStart;

    public static boolean isValid(String str) {
        if (!TextUtils.isEmpty(sActivityName) && TextUtils.equals(str, sActivityName)) {
            return true;
        }
        return false;
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sActivityName = str;
                sOnCreateStart = System.currentTimeMillis();
                if (!isFirstWindowFocusChanged) {
                    AppInstrumentation.launcherActivityOnCreateStart(sActivityName);
                    return;
                }
                return;
            }
            if (!isValid(str)) {
                return;
            }
            sOnCreateEnd = System.currentTimeMillis();
            if (isFirstWindowFocusChanged) {
                return;
            }
            AppInstrumentation.launcherActivityOnCreateEnd();
            return;
        }
        boolean z2 = true;
        if (TextUtils.equals("onResume", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnResumeStart = System.currentTimeMillis();
                if (!isFirstWindowFocusChanged) {
                    AppInstrumentation.launcherActivityOnResumeStart(sActivityName);
                }
                PageShowHelper.onPageShowHideAction(sActivityName, true);
                return;
            }
            if (sOnCreateStart <= 0) {
                return;
            }
            sOnResumeEnd = System.currentTimeMillis();
            if (isFirstWindowFocusChanged) {
                return;
            }
            AppInstrumentation.launcherActivityOnResumeEnd();
            return;
        }
        if (!TextUtils.equals("onWindowFocusChanged", str2) || !isValid(str) || sOnCreateStart <= 0) {
            return;
        }
        if (!isFirstWindowFocusChanged) {
            AppInstrumentation.launcherActivityOnWindowFocusChangedStart(sActivityName);
            isFirstWindowFocusChanged = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        sOnWindowFocusedChangeStart = jCurrentTimeMillis;
        if (jCurrentTimeMillis - sOnCreateStart < Mp4ScreenVideoLoadTimeout.CONTROL) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", sOnCreateStart);
                jSONObject.put("end_time", sOnWindowFocusedChangeStart);
                jSONObject.put("page_type", "activity");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("onCreate", sOnCreateEnd - sOnCreateStart);
                jSONObject2.put("onResume", sOnResumeEnd - sOnResumeStart);
                jSONObject2.put("activityOnCreateToWindowFocusChanged", sOnWindowFocusedChangeStart - sOnCreateStart);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(Scene.SCENE_SERVICE, sActivityName);
                HashSet<String> hashSet = sMethodSet;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(sActivityName);
                sbLIZ.append(str2);
                if (hashSet.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                    z2 = false;
                }
                jSONObject3.put("is_first", z2);
                HashSet<String> hashSet2 = sMethodSet;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(sActivityName);
                sbLIZ2.append(str2);
                hashSet2.add(C2188811AlT.LIZIZ(sbLIZ2));
                MonitorTool.monitorPerformance("page_load", jSONObject2, jSONObject3, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        sOnCreateStart = 0L;
        sActivityName = null;
    }
}
