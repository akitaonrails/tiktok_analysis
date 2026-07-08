package com.ss.android.ugc.aweme.search.performance.metrics;

import X.C01GW;
import X.C0POO;
import X.C0QER;
import X.C0QGO;
import X.C0QIR;
import X.C0QIV;
import X.C0QIW;
import X.C0QO8;
import X.C0VWW;
import X.C1150504el;
import X.C1507790pL7;
import X.C1537720q7O;
import X.C1838707Ib;
import X.C1DS1;
import X.C2188811AlT;
import X.C271050Ajn;
import X.C452501pT;
import X.C644150POj;
import X.C665010Q6p;
import X.C666110QAv;
import X.C670930QTj;
import X.C687270QxZ;
import X.C798360VTm;
import X.C823050WQl;
import X.EnumC037300Bf;
import Y.ARunnableS13S0000100_13;
import Y.ARunnableS79S0200000_10;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.utils.IntermediatePreload;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMiddleMonitor {
    public static C0QIR event;
    public static volatile boolean isDynamicContainerInit;
    public static int isHistoryDrawEnd;
    public static int isRecommendDrawEnd;
    public static int isRecommendUpdateEnd;
    public static long startTime;
    public static long touchTime;
    public static long touchUpTime;
    public static final SearchMiddleMonitor INSTANCE = new SearchMiddleMonitor();
    public static int isFirstEnter = 1;
    public static String enterFrom = "";
    public static String enterMethod = "";
    public static String touchFrom = "";
    public static AtomicBoolean isCpuMonitoring = new AtomicBoolean(false);
    public static final C01GW hitCpuMonitorSample$delegate = C452501pT.LIZIZ(new C670930QTj());
    public static final C01GW otisCpu$delegate = C452501pT.LIZIZ(new C0QIW());
    public static final C01GW isCpuMonitorOn$delegate = C452501pT.LIZIZ(new C0QIV());
    public static final int $stable = 8;

    public static /* synthetic */ void isCpuMonitorOn$annotations() {
    }

    public final void clear() {
        event = null;
        isFirstEnter = 0;
        isDynamicContainerInit = false;
    }

    public final SearchMiddleMonitor historyEnd() {
        isHistoryDrawEnd = 1;
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJLJLLL = System.currentTimeMillis() - c0qir.LIZLLL;
            INSTANCE.post(true, false);
        }
        C0VWW.LIZIZ("latency_search_history");
        return this;
    }

    public final SearchMiddleMonitor updateRecommendEnd() {
        isRecommendUpdateEnd = 1;
        C0QIR c0qir = event;
        if (c0qir != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJJJLI = jCurrentTimeMillis;
            if (c0qir.LIZLLL > 0) {
                long j = c0qir.LJJJJL;
                if (j > 0) {
                    c0qir.LJLILLLLZI = jCurrentTimeMillis - j;
                }
            }
        }
        if (isCpuMonitorOn()) {
            stopMonitorCpuUsage();
        }
        return this;
    }

    private final C798360VTm getOtisCpu() {
        return (C798360VTm) otisCpu$delegate.getValue();
    }

    public static final boolean isCpuMonitorOn() {
        return ((Boolean) isCpuMonitorOn$delegate.getValue()).booleanValue();
    }

    private final void startMonitorCpuUsage() {
        if (isCpuMonitoring.get()) {
            return;
        }
        isCpuMonitoring.set(true);
        getOtisCpu().LIZ();
    }

    private final void stopMonitorCpuUsage() {
        if (isCpuMonitoring.get()) {
            getOtisCpu().LIZ();
        }
    }

    public final SearchMiddleMonitor activityCreate() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJII = jCurrentTimeMillis;
            c0qir.LJJJJZI = jCurrentTimeMillis - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor activityCreateEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJII > 0) {
            c0qir.LJJJZ = System.currentTimeMillis() - c0qir.LJJII;
        }
        return this;
    }

    public final SearchMiddleMonitor activityLaunch() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJIJI = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor activityLaunchEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LJIJI > 0) {
            c0qir.LJJJLL = System.currentTimeMillis() - c0qir.LJIJI;
        }
        return this;
    }

    public final SearchMiddleMonitor activityPauseEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LJIJJ > 0) {
            c0qir.LJJJLZIJ = System.currentTimeMillis() - c0qir.LJIJJ;
        }
        return this;
    }

    public final SearchMiddleMonitor activityPauseStart() {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LJIJJ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor activityResume() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIIJ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor activityResumeEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIIJ > 0) {
            c0qir.LJJLI = System.currentTimeMillis() - c0qir.LJJIIJ;
        }
        return this;
    }

    public final SearchMiddleMonitor activityStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIII = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor activityStartEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIII > 0) {
            c0qir.LJJL = System.currentTimeMillis() - c0qir.LJJIII;
        }
        return this;
    }

    public final SearchMiddleMonitor etHintDrawEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJLLILLLL = System.currentTimeMillis() - c0qir.LIZLLL;
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0QIT
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchMiddleMonitor@cd45.etHintDrawEnd$1$1");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Scene.SCENE_SERVICE, "inbox");
                        C0QIR c0qir2 = SearchMiddleMonitor.event;
                        jSONObject.put("cost", c0qir2 != null ? Long.valueOf(c0qir2.LJLLILLLL) : null);
                        AppLogNewUtils.onEventV3("search_perf_cost", jSONObject);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchMiddleMonitor@cd45.etHintDrawEnd$1$1");
                }
            });
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentCreate() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJIJLIJ = jCurrentTimeMillis;
            c0qir.LJJLIIJ = jCurrentTimeMillis - c0qir.LJJIL;
            c0qir.LJJLIIIJLLLLLLLZ = jCurrentTimeMillis - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentCreateEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIJLIJ > 0) {
            c0qir.LJJLJ = System.currentTimeMillis() - c0qir.LJJIJLIJ;
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentCreateView() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIZ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentCreateViewEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIJLIJ > 0) {
            c0qir.LJJLL = System.currentTimeMillis() - c0qir.LJJIZ;
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentResume() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJJI = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentResumeEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJI > 0) {
            c0qir.LJJZ = System.currentTimeMillis() - c0qir.LJJJI;
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentViewCreated() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJJ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor fragmentViewCreatedEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJ > 0) {
            c0qir.LJJLJLI = System.currentTimeMillis() - c0qir.LJJJ;
        }
        return this;
    }

    public final boolean getHitCpuMonitorSample() {
        return ((Boolean) hitCpuMonitorSample$delegate.getValue()).booleanValue();
    }

    public final int getRootType() {
        C0QIR c0qir = event;
        if (c0qir != null) {
            return c0qir.LJJIIJZLJL;
        }
        return 0;
    }

    public final long getStart() {
        C0QIR c0qir = event;
        if (c0qir != null) {
            return c0qir.LIZLLL;
        }
        return 0L;
    }

    public final SearchMiddleMonitor historyNavigateEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJLL = System.currentTimeMillis() - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor historyPlaceholderFirstDrawEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJLLI = System.currentTimeMillis() - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor launchFragment() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIL = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor loadLynx() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJJJ == 0) {
            c0qir.LJJJJJ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor loadLynxEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJJJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJLIIL = jCurrentTimeMillis;
            c0qir.LJLIIIL = jCurrentTimeMillis - c0qir.LJJJJJ;
            C665010Q6p.LIZ.getClass();
            if (C665010Q6p.LIZ()) {
                c0qir.LJLJLLL = c0qir.LJLIIIL;
            }
        }
        return this;
    }

    public final SearchMiddleMonitor recommendJsonEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJZ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJZL = jCurrentTimeMillis;
            c0qir.LJZI = jCurrentTimeMillis - c0qir.LJZ;
        }
        return this;
    }

    public final SearchMiddleMonitor recommendJsonStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJZ == 0) {
            c0qir.LJZ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor recommendPostValueEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LL > 0) {
            c0qir.LLD = System.currentTimeMillis() - c0qir.LL;
        }
        return this;
    }

    public final SearchMiddleMonitor recommendPostValueStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LL == 0) {
            c0qir.LL = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor recommendRequestStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJIL == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJIL = jCurrentTimeMillis;
            long j = c0qir.LJJIFFI;
            if (j > 0) {
                c0qir.LJJJJZ = jCurrentTimeMillis - j;
            }
        }
        return this;
    }

    public final SearchMiddleMonitor recommendSwitchThreadEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LLFFF > 0) {
            c0qir.LLFII = System.currentTimeMillis() - c0qir.LLFFF;
        }
        return this;
    }

    public final SearchMiddleMonitor recommendSwitchThreadStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LLFFF == 0) {
            c0qir.LLFFF = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor recommendTemplateDataEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LLF > 0) {
            c0qir.LLFF = System.currentTimeMillis() - c0qir.LLF;
        }
        return this;
    }

    public final SearchMiddleMonitor recommendTemplateDataStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LLF == 0) {
            c0qir.LLF = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor recordRetryPreLoad() {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LJIIJJI = 1;
        }
        return this;
    }

    public final SearchMiddleMonitor resetPreloadFailedStatus() {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LJIIJ = "";
            c0qir.LJIIIZ = 0;
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentCreate() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJJIL = jCurrentTimeMillis;
            c0qir.LJJLIL = jCurrentTimeMillis - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentCreateEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJIL > 0) {
            c0qir.LJJZZI = System.currentTimeMillis() - c0qir.LJJJIL;
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentCreateView() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJJJ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentCreateViewEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJJ > 0) {
            c0qir.LJL = System.currentTimeMillis() - c0qir.LJJJJ;
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentResume() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJJJIZL = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentResumeEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJJIZL > 0) {
            c0qir.LJLI = System.currentTimeMillis() - c0qir.LJJJJIZL;
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentViewCreated() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJJJI = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor resultFragmentViewCreatedEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJJI > 0) {
            c0qir.LJJZZIII = System.currentTimeMillis() - c0qir.LJJJJI;
        }
        return this;
    }

    public final SearchMiddleMonitor rootCreate() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJIIZ = jCurrentTimeMillis;
            c0qir.LJJJLIIL = jCurrentTimeMillis - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor rootCreateEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIIZ > 0) {
            c0qir.LJJLIIIIJ = System.currentTimeMillis() - c0qir.LJJIIZ;
        }
        return this;
    }

    public final SearchMiddleMonitor rootCreateView() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIJIIJI = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor rootCreateViewEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIJIIJI > 0) {
            c0qir.LJJLIIIJ = System.currentTimeMillis() - c0qir.LJJIJIIJI;
        }
        return this;
    }

    public final SearchMiddleMonitor rootPreloadEnter() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJIJ = jCurrentTimeMillis;
            c0qir.LJJJLIIL = jCurrentTimeMillis - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor rootPreloadEnterEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIJ > 0) {
            c0qir.LJJLIIIJLJLI = System.currentTimeMillis() - c0qir.LJJIJ;
        }
        return this;
    }

    public final SearchMiddleMonitor rootPrepare() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJIIZI = jCurrentTimeMillis;
            c0qir.LJJJLIIL = jCurrentTimeMillis - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor rootPrepareEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIIZI > 0) {
            c0qir.LJJLIIIJL = System.currentTimeMillis() - c0qir.LJJIIZI;
        }
        return this;
    }

    public final SearchMiddleMonitor rootResume() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIJL = System.currentTimeMillis();
        }
        if (startTime > 0) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "open");
            jSONObject.put("duration", System.currentTimeMillis() - startTime);
            jSONObject.put("enter_from", enterFrom);
            jSONObject.put("enter_method", enterMethod);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
            startTime = 0L;
        }
        return this;
    }

    public final SearchMiddleMonitor rootResumeEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIJL > 0) {
            c0qir.LJJLIIIJJIZ = System.currentTimeMillis() - c0qir.LJJIJL;
        }
        return this;
    }

    public final SearchMiddleMonitor rootStartEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIJIL > 0) {
            c0qir.LJJLIIIJJI = System.currentTimeMillis() - c0qir.LJJIJIL;
        }
        return this;
    }

    public final SearchMiddleMonitor rootViewCreate() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIJIIJIL = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor rootViewCreateEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIJIIJIL > 0) {
            c0qir.LJJLIIIJILLIZJL = System.currentTimeMillis() - c0qir.LJJIJIIJIL;
        }
        return this;
    }

    public final SearchMiddleMonitor searchContextActivityEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJIIZ > 0) {
            c0qir.LJLLLLLL = System.currentTimeMillis() - c0qir.LJLLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor searchContextActivityStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJII > 0) {
            c0qir.LJLLLL = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor searchContextStackEnd() {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LJLLL = System.currentTimeMillis() - c0qir.LJLLJ;
        }
        return this;
    }

    public final SearchMiddleMonitor searchContextStackStart() {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LJLLJ = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor start() {
        C0VWW.LJI("latency_search_rec");
        C0VWW.LJI("latency_search_history");
        C0QIR c0qir = new C0QIR();
        event = c0qir;
        c0qir.LIZLLL = System.currentTimeMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        startTime = jCurrentTimeMillis;
        C0QIR c0qir2 = event;
        if (c0qir2 != null) {
            c0qir2.LJ = jCurrentTimeMillis - touchTime;
            c0qir2.LJFF = jCurrentTimeMillis - touchUpTime;
            c0qir2.LJI = touchFrom;
        }
        touchTime = 0L;
        touchUpTime = 0L;
        touchFrom = "";
        isRecommendDrawEnd = 0;
        isRecommendUpdateEnd = 0;
        isHistoryDrawEnd = 0;
        if (isFirstEnter == 1) {
            if (c0qir2 != null) {
                C0QGO.LIZ.getClass();
                c0qir2.LJIIIIZZ = C0QGO.LIZJ;
            }
            C0QIR c0qir3 = event;
            if (c0qir3 != null) {
                c0qir3.LJIILJJIL = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
            }
            C0QIR c0qir4 = event;
            if (c0qir4 != null) {
                c0qir4.LJII = C1838707Ib.LIZIZ;
            }
            C0QIR c0qir5 = event;
            if (c0qir5 != null) {
                c0qir5.LJIILL = C1838707Ib.LIZJ;
            }
            C0QIR c0qir6 = event;
            if (c0qir6 != null) {
                c0qir6.LJIILLIIL = C1838707Ib.LIZ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start time:");
        C0QIR c0qir7 = event;
        sbLIZ.append(c0qir7 != null ? Long.valueOf(c0qir7.LIZLLL) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("touch 2 start cost:");
        C0QIR c0qir8 = event;
        sbLIZ2.append(c0qir8 != null ? Long.valueOf(c0qir8.LJ) : null);
        sbLIZ2.append(" from:");
        C0QIR c0qir9 = event;
        sbLIZ2.append(c0qir9 != null ? c0qir9.LJI : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        return this;
    }

    public final SearchMiddleMonitor triggerRequestStart() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJIFFI = jCurrentTimeMillis;
            c0qir.LJJJJLL = jCurrentTimeMillis - c0qir.LIZLLL;
        }
        return this;
    }

    public final SearchMiddleMonitor updateHistory() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJJJJL = System.currentTimeMillis();
        }
        return this;
    }

    public final SearchMiddleMonitor updateHistoryEnd() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJJJJJL > 0) {
            c0qir.LJLIL = System.currentTimeMillis() - c0qir.LJJJJJL;
        }
        return this;
    }

    public final SearchMiddleMonitor updateRecommend() {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJJJL = System.currentTimeMillis();
        }
        if (isCpuMonitorOn()) {
            startMonitorCpuUsage();
        }
        return this;
    }

    public final double getSearchResultCpuUsage() {
        return C687270QxZ.LIZ(getOtisCpu().LJI.LIZ);
    }

    public final boolean ifNeedDisableRecomRefresh() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event?.firstTimeInterval:");
        C0QIR c0qir = event;
        sbLIZ.append(c0qir != null ? Long.valueOf(c0qir.LJIILJJIL) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C0QIR c0qir2 = event;
        if ((c0qir2 != null ? c0qir2.LJIILJJIL : -1L) < 0) {
            return false;
        }
        C01GW c01gw = C271050Ajn.LIZ;
        if (((Number) c01gw.getValue()).longValue() > 0) {
            C0QIR c0qir3 = event;
            if ((c0qir3 != null ? c0qir3.LJIILJJIL : 0L) < ((Number) c01gw.getValue()).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final String getEnterFrom() {
        return enterFrom;
    }

    public final String getEnterMethod() {
        return enterMethod;
    }

    public final long getStartTime() {
        return startTime;
    }

    public final String getTouchFrom() {
        return touchFrom;
    }

    public final long getTouchTime() {
        return touchTime;
    }

    public final long getTouchUpTime() {
        return touchUpTime;
    }

    public final boolean isDynamicContainerInit() {
        return isDynamicContainerInit;
    }

    public final int isHistoryDrawEnd() {
        return isHistoryDrawEnd;
    }

    public final int isRecommendDrawEnd() {
        return isRecommendDrawEnd;
    }

    public final int isRecommendUpdateEnd() {
        return isRecommendUpdateEnd;
    }

    public final void addLynxTimingListener(C1537720q7O c1537720q7O) {
        c1537720q7O.addLynxViewClient(new LynxViewClient() { // from class: X.0QIS
            @Override // com.lynx.tasm.LynxViewClient
            public final void LJJIIZ(String str, Map map, Map map2) {
                Long l;
                C0QIR c0qir;
                if (str != null && u.LJJIIJZLJL(str, "__lynx_timing_actual_fmp", false) && !Intrinsics.LJFF(str, "__lynx_timing_actual_fmp") && (l = (Long) ((HashMap) map2).get("draw_end")) != null && l.longValue() > 0 && (c0qir = SearchMiddleMonitor.event) != null && c0qir.LIZLLL > 0) {
                    SearchMiddleMonitor.INSTANCE.setRecommendDrawEnd(1);
                    C823050WQl.LIZLLL().execute(new ARunnableS79S0200000_10(l, map2, 41));
                }
            }
        });
    }

    public final SearchMiddleMonitor coinType(int i) {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LJIIL = i;
        }
        return this;
    }

    public final SearchMiddleMonitor enableRecommend(int i) {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LIZJ = i;
        }
        return this;
    }

    public final boolean isHistory(Object obj) {
        if (!(obj instanceof String) || !a0.LJJIIZI((CharSequence) obj, "historyList", false)) {
            return false;
        }
        return true;
    }

    public final boolean isRecommend(Object obj) {
        Map<Object, Object> mapLJIJI;
        String string;
        if (!(obj instanceof TemplateData)) {
            return false;
        }
        TemplateData templateData = (TemplateData) obj;
        if (!Intrinsics.LJFF("guessSearchDataProcess", templateData.LIZJ) && ((mapLJIJI = templateData.LJIJI()) == null || (string = mapLJIJI.toString()) == null || !a0.LJJIIZI(string, "guessSearchData", false))) {
            return false;
        }
        return true;
    }

    public final SearchMiddleMonitor recommendEnd(int i) {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJLJL = jCurrentTimeMillis - c0qir.LIZLLL;
            c0qir.LJJI = jCurrentTimeMillis - c0qir.LJJ;
            c0qir.LJLJJL = jCurrentTimeMillis - c0qir.LJJJJLI;
            c0qir.LJLJJLL = i;
            INSTANCE.post(false, false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recommendCost:");
            sbLIZ.append(c0qir.LJLJL);
            sbLIZ.append(" recommendDrawCost:");
            sbLIZ.append(c0qir.LJLJJL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0VWW.LIZIZ("latency_search_rec");
        return this;
    }

    public final SearchMiddleMonitor recommendRequestEnd(Object obj) {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0 && c0qir.LJIL > 0 && c0qir.LJLJJI == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0qir.LJJ = jCurrentTimeMillis;
            SearchMiddleMonitor searchMiddleMonitor = INSTANCE;
            IntermediatePreload.Companion.getClass();
            searchMiddleMonitor.setRequestTotalCost(jCurrentTimeMillis - IntermediatePreload.startTime);
            c0qir.LJLJJI = c0qir.LJJ - c0qir.LJIL;
            c0qir.LJLZ = obj;
        }
        return this;
    }

    public final SearchMiddleMonitor recordPreloadFailed(String str) {
        C0QIR c0qir = event;
        if (c0qir != null) {
            if (str == null) {
                str = "";
            }
            c0qir.LJIIJ = str;
            c0qir.LJIIIZ = 1;
        }
        return this;
    }

    public final SearchMiddleMonitor recordPreloadFinish(EnumC037300Bf enumC037300Bf) {
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LJIILIIL = enumC037300Bf.ordinal();
        }
        return this;
    }

    public final void reportBSRIfNeed(long j) {
        if (((Boolean) C1DS1.LJJIJLIJ.getValue()).booleanValue() && j > 0) {
            C823050WQl.LIZLLL().execute(new ARunnableS13S0000100_13(j, 1));
        }
    }

    public final SearchMiddleMonitor rootStart(int i) {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            c0qir.LJJIIJZLJL = i;
            c0qir.LJJIJIL = System.currentTimeMillis();
        }
        return this;
    }

    public final void sendRecommendDurationGeneralExceptionEventIfNeed(long j) {
        if (!C0POO.LIZ()) {
            return;
        }
        int i = C644150POj.LIZ().recommendDurationMs;
        if (j < i) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recommend request duration takes too long and exceeds the threshold: ");
        sbLIZ.append(i);
        C666110QAv c666110QAv = new C666110QAv(603, C2188811AlT.LIZIZ(sbLIZ));
        c666110QAv.LIZIZ(Long.valueOf(j), "duration");
        C0QO8.LIZ.LJII(c666110QAv);
    }

    public final void setDynamicContainerInit(boolean z) {
        isDynamicContainerInit = z;
    }

    public final void setEnterFrom(String str) {
        enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        enterMethod = str;
    }

    public final void setHistoryDrawEnd(int i) {
        isHistoryDrawEnd = i;
    }

    public final void setRecommendDrawEnd(int i) {
        isRecommendDrawEnd = i;
    }

    public final void setRecommendUpdateEnd(int i) {
        isRecommendUpdateEnd = i;
    }

    public final SearchMiddleMonitor setRequestTotalCost(long j) {
        C0QIR c0qir = event;
        if (c0qir != null) {
            if (c0qir.LJIJJLI > 0) {
                return this;
            }
            if (c0qir != null) {
                c0qir.LJIJJLI = j;
            }
        }
        IntermediatePreload.Companion.getClass();
        IntermediatePreload.startTime = 0L;
        return this;
    }

    public final void setStartTime(long j) {
        startTime = j;
    }

    public final void setTouchFrom(String str) {
        touchFrom = str;
    }

    public final void setTouchTime(long j) {
        touchTime = j;
    }

    public final void setTouchUpTime(long j) {
        touchUpTime = j;
    }

    public final void touch(String str) {
        touchTime = System.currentTimeMillis();
        touchFrom = str;
    }

    public final void touchUp(String str) {
        touchUpTime = System.currentTimeMillis();
    }

    public final long calculateDifference(Long l, Long l2) {
        if (l != null && l2 != null) {
            long jLongValue = l2.longValue() - l.longValue();
            if (jLongValue > 0) {
                return jLongValue;
            }
        }
        return 0L;
    }

    public final void fcpTiming(String str, long j) {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL > 0) {
            if (str != null) {
                c0qir.LJIJ.add(str);
            }
            c0qir.LJIIZILJ += j;
        }
    }

    public final String getEnterFrom(SearchResultParam searchResultParam, C0QER c0qer) {
        String searchFrom;
        if (searchResultParam != null) {
            searchFrom = searchResultParam.getSearchFrom();
        } else {
            searchFrom = null;
        }
        if (TextUtils.isEmpty(searchFrom)) {
            if (c0qer == null) {
                return null;
            }
            return c0qer.getEnterSearchFrom();
        }
        return searchFrom;
    }

    public final void post(final boolean z, final boolean z2) {
        C0QIR c0qir = event;
        if (c0qir != null && c0qir.LIZLLL != 0) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0QIQ
                /* JADX WARN: Removed duplicated region for block: B:384:0x0667  */
                /* JADX WARN: Removed duplicated region for block: B:387:0x067b  */
                /* JADX WARN: Removed duplicated region for block: B:390:0x068a  */
                /* JADX WARN: Removed duplicated region for block: B:393:0x0699  */
                /* JADX WARN: Removed duplicated region for block: B:399:0x06ab  */
                /* JADX WARN: Removed duplicated region for block: B:400:0x06ae  */
                /* JADX WARN: Removed duplicated region for block: B:401:0x06b0  */
                /* JADX WARN: Removed duplicated region for block: B:402:0x06b2  */
                /* JADX WARN: Removed duplicated region for block: B:414:0x05ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 1756
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QIQ.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchMiddleMonitor@cd45.post$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchMiddleMonitor@cd45.post$1");
                }
            });
        }
    }

    public final SearchMiddleMonitor setParams(SearchResultParam searchResultParam, C0QER c0qer) {
        String enterMethod2;
        String enterMethod3;
        C0QIR c0qir = event;
        if (c0qir != null) {
            c0qir.LIZ = searchResultParam;
            c0qir.LIZIZ = c0qer;
            SearchMiddleMonitor searchMiddleMonitor = INSTANCE;
            String enterFrom2 = searchMiddleMonitor.getEnterFrom(searchResultParam, c0qer);
            String str = "";
            if (enterFrom2 == null) {
                enterFrom2 = "";
            }
            enterFrom = enterFrom2;
            SearchResultParam searchResultParam2 = c0qir.LIZ;
            if (searchResultParam2 != null && (enterMethod3 = searchResultParam2.getEnterMethod()) != null) {
                str = enterMethod3;
            }
            enterMethod = str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setParams enterFrom:");
            sbLIZ.append(searchMiddleMonitor.getEnterFrom(searchResultParam, c0qer));
            sbLIZ.append(" enterMethod: ");
            if (searchResultParam != null) {
                enterMethod2 = searchResultParam.getEnterMethod();
            } else {
                enterMethod2 = null;
            }
            sbLIZ.append(enterMethod2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return this;
    }
}
