package com.bytedance.apm.agent.instrumentation;

import X.C07RX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787820UvM;
import X.C788700Uwm;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.helper.PageShowHelper;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FragmentInstrumentation {
    public static long sCheckVisibilityStartTime;
    public static String sFragmentName;
    public static long sMaxWaitTime;
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    public static long sOnActivityCreatedEnd;
    public static long sOnActivityCreatedStart;
    public static long sOnCreateEnd;
    public static String sOnCreateFragmentName;
    public static long sOnCreateStart;
    public static long sOnCreateTime;
    public static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    public static long sOnResumeEnd;
    public static long sOnResumeStart;
    public static long sOnViewCreatedEnd;
    public static long sOnViewCreatedStart;
    public static WeakReference<View> sRootViewRef;
    public static Runnable sWaitViewTimeoutRunnable;

    public static boolean isValid(String str) {
        if (!TextUtils.isEmpty(sFragmentName) && TextUtils.equals(str, sFragmentName)) {
            return true;
        }
        return false;
    }

    public static void onCreate(String str) {
        sOnCreateFragmentName = str;
        sOnCreateTime = System.currentTimeMillis();
        if (sMaxWaitTime == 0) {
            sMaxWaitTime = C788700Uwm.LIZ.LIZIZ().LIZIZ;
        }
    }

    public static void onPause(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            PageShowHelper.onPageShowHideAction(fragment, false);
        }
    }

    public static void onResume(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            String canonicalName = fragment.getClass().getCanonicalName();
            try {
                PageShowHelper.onPageShowHideAction(fragment, true);
                if (!TextUtils.equals(canonicalName, sOnCreateFragmentName)) {
                    return;
                }
                registerOnGlobalLayoutListener(canonicalName, fragment.getView(), C07RX.LIZ(canonicalName), sOnCreateTime, "fragmentOnCreateToViewShow");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        PageShowHelper.onPageShowHideAction(fragment, !z);
        if (!z) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                registerOnGlobalLayoutListener(canonicalName, fragment.getView(), C07RX.LIZ(canonicalName), System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed() && !fragment.isHidden()) {
            PageShowHelper.onPageShowHideAction(fragment, z);
            if (z) {
                try {
                    String canonicalName = fragment.getClass().getCanonicalName();
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), C07RX.LIZ(canonicalName), System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        boolean z2;
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
                return;
            } else {
                if (!isValid(str)) {
                    return;
                }
                sOnCreateEnd = System.currentTimeMillis();
                return;
            }
        }
        if (TextUtils.equals("onViewCreated", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnViewCreatedStart = System.currentTimeMillis();
                return;
            } else {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnViewCreatedEnd = System.currentTimeMillis();
                return;
            }
        }
        if (TextUtils.equals("onActivityCreated", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnActivityCreatedStart = System.currentTimeMillis();
                return;
            } else {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnActivityCreatedEnd = System.currentTimeMillis();
                return;
            }
        }
        if (!TextUtils.equals("onResume", str2) || !isValid(str)) {
            return;
        }
        if (z) {
            if (sOnCreateStart <= 0) {
                return;
            }
            sOnResumeStart = System.currentTimeMillis();
            return;
        }
        if (sOnCreateStart <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        sOnResumeEnd = jCurrentTimeMillis;
        if (jCurrentTimeMillis - sOnCreateStart < Mp4ScreenVideoLoadTimeout.CONTROL) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", sOnCreateStart);
                jSONObject.put("end_time", sOnResumeEnd);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("onCreate", sOnCreateEnd - sOnCreateStart);
                jSONObject2.put("onViewCreated", sOnViewCreatedEnd - sOnViewCreatedStart);
                jSONObject2.put("onActivityCreated", sOnActivityCreatedEnd - sOnActivityCreatedStart);
                jSONObject2.put("onResume", sOnResumeEnd - sOnResumeStart);
                jSONObject2.put("fragment_create_to_resume", sOnResumeEnd - sOnCreateStart);
                if (fragment != null && fragment.getActivity() != null) {
                    jSONObject.put("attached_activity", fragment.getActivity().getClass().getName());
                }
                jSONObject.put("page_type", "fragment");
                JSONObject jSONObject3 = new JSONObject();
                HashSet<String> hashSet = sMethodSet;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(sFragmentName);
                sbLIZ.append(str2);
                if (!hashSet.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jSONObject3.put("is_first", z2);
                jSONObject3.put(Scene.SCENE_SERVICE, str);
                HashSet<String> hashSet2 = sMethodSet;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(sFragmentName);
                sbLIZ2.append(str2);
                hashSet2.add(C2188811AlT.LIZIZ(sbLIZ2));
                MonitorTool.monitorPerformance("page_load", jSONObject2, jSONObject3, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        sOnCreateStart = 0L;
        sFragmentName = null;
    }

    public static void registerOnGlobalLayoutListener(String str, View view, final Integer num, final long j, final String str2) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        if (num != null && num.intValue() > 0) {
            sFragmentName = str;
            WeakReference<View> weakReference = sRootViewRef;
            if (weakReference != null && weakReference.get() != view) {
                ViewTreeObserver viewTreeObserver = sRootViewRef.get().getViewTreeObserver();
                if (viewTreeObserver.isAlive() && (onGlobalLayoutListener = sOnGlobalLayoutListener) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                if (sWaitViewTimeoutRunnable != null) {
                    C787820UvM.LIZ.removeCallbacks(sWaitViewTimeoutRunnable);
                }
            }
            sRootViewRef = new WeakReference<>(view);
            sCheckVisibilityStartTime = 0L;
            sOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.apm.agent.instrumentation.FragmentInstrumentation.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    try {
                        WeakReference<View> weakReference2 = FragmentInstrumentation.sRootViewRef;
                        if (weakReference2 == null || weakReference2.get() == null) {
                            return;
                        }
                        View viewFindViewById = FragmentInstrumentation.sRootViewRef.get().findViewById(num.intValue());
                        if (FragmentInstrumentation.sCheckVisibilityStartTime == 0) {
                            FragmentInstrumentation.sCheckVisibilityStartTime = System.currentTimeMillis();
                        }
                        if (viewFindViewById == null || viewFindViewById.getVisibility() != 0 || viewFindViewById.getWidth() <= 0) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver().isAlive() && FragmentInstrumentation.sOnGlobalLayoutListener != null) {
                            C786410Ut5.C3(FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver(), FragmentInstrumentation.sOnGlobalLayoutListener);
                        }
                        FragmentInstrumentation.sOnGlobalLayoutListener = null;
                        FragmentInstrumentation.sRootViewRef = null;
                        if (FragmentInstrumentation.sWaitViewTimeoutRunnable != null) {
                            C787820UvM.LIZ.removeCallbacks(FragmentInstrumentation.sWaitViewTimeoutRunnable);
                        }
                        long j2 = jCurrentTimeMillis - j;
                        if (jCurrentTimeMillis - FragmentInstrumentation.sCheckVisibilityStartTime <= 1 || j2 >= FragmentInstrumentation.sMaxWaitTime) {
                            return;
                        }
                        MonitorTool.reportTraceTime(FragmentInstrumentation.sFragmentName, str2, j2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            };
            C786410Ut5.x3(view.getViewTreeObserver(), sOnGlobalLayoutListener);
            sWaitViewTimeoutRunnable = new Runnable() { // from class: com.bytedance.apm.agent.instrumentation.FragmentInstrumentation.2
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("FragmentInstrumentation@31d9.registerOnGlobalLayoutListener$2");
                    com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("FragmentInstrumentation@31d9.registerOnGlobalLayoutListener$2");
                }

                public void com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2__run$___twin___() {
                    WeakReference<View> weakReference2;
                    try {
                        if (FragmentInstrumentation.sOnGlobalLayoutListener == null || (weakReference2 = FragmentInstrumentation.sRootViewRef) == null || weakReference2.get() == null) {
                            return;
                        }
                        C786410Ut5.C3(FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver(), FragmentInstrumentation.sOnGlobalLayoutListener);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                public static void com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    try {
                        anonymousClass2.com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            };
            C786410Ut5.LJLIIL(sMaxWaitTime, C787820UvM.LIZ, sWaitViewTimeoutRunnable);
        }
    }
}
