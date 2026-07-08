package com.ss.android.ugc.aweme.util;

import X.C098200Yq;
import X.C09CT;
import X.C1163504gr;
import X.C189200o6;
import X.EnumC1573550r3B;
import X.EnumC1576680r8E;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IJsonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaPagePerformanceMonitor {
    public static final Map<String, PagePerformanceEvent> LIZ = new LinkedHashMap();
    public static final PagePerformanceEvent LIZIZ = new PagePerformanceEvent();

    public static final class PagePerformanceEvent {

        @C09CT("expired_time")
        public long expiredTime;

        @C09CT("is_aab_bound")
        public int isAABBound;

        @C09CT("is_base_code")
        public int isBaseCode;

        @C09CT("is_cache_data")
        public int isCacheData;

        @C09CT("is_drama_invalid")
        public int isDramaInvalid;

        @C09CT("is_from_last_watch")
        public int isFromLastWatch;

        @C09CT("load_data_duration")
        public long loadDataDuration;

        @C09CT("load_data_fail_end")
        public long loadDataFailEnd;

        @C09CT("load_data_mix_page_duration")
        public long loadDataMixPageDuration;

        @C09CT("load_data_mix_page_fail_end")
        public long loadDataMixPageFailEnd;

        @C09CT("load_data_mix_page_start")
        public long loadDataMixPageStart;

        @C09CT("load_data_mix_page_success_end")
        public long loadDataMixPageSuccessEnd;

        @C09CT("load_data_start")
        public long loadDataStart;

        @C09CT("load_data_success_end")
        public long loadDataSuccessEnd;

        @C09CT("mix_page_type")
        public int mixPageType;

        @C09CT("on_click_enter")
        public long onClickEnter;

        @C09CT("on_create_df_start")
        public long onCreateDFStart;

        @C09CT("on_create_start")
        public long onCreateStart;

        @C09CT("on_page_hide")
        public long onPageHide;

        @C09CT("video_first_frame")
        public long videoFirstFrame;

        @C09CT("view_first_frame")
        public long viewFirstFrame;

        @C09CT("page_type")
        public String pageType = "";

        @C09CT("cache_source")
        public String cacheSource = "";

        @C09CT("stage")
        public String stage = "";

        @C09CT("error_code")
        public String errorCode = "";

        @C09CT("error_msg")
        public String errorMsg = "";

        @C09CT("force_insert_id")
        public String forceInsertId = "";

        @C09CT("enter_from")
        public String enterFrom = "";

        @C09CT("enter_method")
        public String enterMethod = "";

        @C09CT("cache_status")
        public String cacheStatus = "";

        @C09CT("preload_task_status")
        public String preloadTaskStatus = "";

        @C09CT("landing_tab")
        public String landingTab = "";

        public final void LIZLLL() {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.loadDataMixPageFailEnd == 0) {
                this.loadDataMixPageFailEnd = SystemClock.uptimeMillis();
                LJIIJ(EnumC1576680r8E.LOAD_DATA_MIX_PAGE_FAIL, new AwS603S0100000_24(this, 386));
            }
        }

        public final void LJ() {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.loadDataMixPageStart == 0) {
                this.loadDataMixPageStart = SystemClock.uptimeMillis();
                LJIIJ(EnumC1576680r8E.LOAD_DATA_MIX_PAGE_START, null);
            }
        }

        public final void LJIIL() {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.onCreateStart == 0) {
                this.onCreateStart = SystemClock.uptimeMillis();
                LJIIJ(EnumC1576680r8E.ON_CREATE_START, null);
            }
        }

        public final void LJIILIIL() {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.onPageHide == 0) {
                this.onPageHide = SystemClock.uptimeMillis();
                LJIIJ(EnumC1576680r8E.ON_PAGE_HIDE, null);
            }
        }

        public final void LJIILL() {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.videoFirstFrame == 0) {
                this.videoFirstFrame = SystemClock.uptimeMillis();
                LJIIJ(EnumC1576680r8E.VIDEO_FIRST_FRAME, null);
            }
        }

        public final void LJIILLIIL() {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.viewFirstFrame == 0) {
                this.viewFirstFrame = SystemClock.uptimeMillis();
                LJIIJ(EnumC1576680r8E.VIEW_FIRST_FRAME, null);
            }
        }

        public static void LJFF(PagePerformanceEvent pagePerformanceEvent) {
            pagePerformanceEvent.getClass();
            if (!Intrinsics.LJFF(pagePerformanceEvent, MiniDramaPagePerformanceMonitor.LIZIZ) && pagePerformanceEvent.loadDataMixPageSuccessEnd == 0) {
                pagePerformanceEvent.loadDataMixPageSuccessEnd = SystemClock.uptimeMillis();
                pagePerformanceEvent.LJIIJ(EnumC1576680r8E.LOAD_DATA_MIX_PAGE_SUCCESS, null);
            }
        }

        public static void LJIIJJI(PagePerformanceEvent pagePerformanceEvent) {
            pagePerformanceEvent.getClass();
            if (!Intrinsics.LJFF(pagePerformanceEvent, MiniDramaPagePerformanceMonitor.LIZIZ) && pagePerformanceEvent.onClickEnter == 0) {
                EnumC1576680r8E enumC1576680r8E = EnumC1576680r8E.ON_CLICK_ENTER;
                pagePerformanceEvent.stage = enumC1576680r8E.getValue();
                C1163504gr.LIZIZ.onEventV3("mini_drama_page_performance", new JSONObject(((IJsonService) ServiceManager.get().getService(IJsonService.class)).LIZ(pagePerformanceEvent)));
                pagePerformanceEvent.onClickEnter = SystemClock.uptimeMillis();
                pagePerformanceEvent.LJIIJ(enumC1576680r8E, null);
            }
        }

        public final void LIZJ(Function1 function1) throws JSONException {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.loadDataFailEnd == 0) {
                this.loadDataFailEnd = SystemClock.uptimeMillis();
                if (function1 != null) {
                    function1.invoke(this);
                }
                LJIIJ(EnumC1576680r8E.LOAD_DATA_FAIL, new AwS603S0100000_24(this, 385));
            }
        }

        public final void LJI(Function1 function1) throws JSONException {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.loadDataStart == 0) {
                this.loadDataStart = SystemClock.uptimeMillis();
                if (function1 != null) {
                    function1.invoke(this);
                }
                LJIIJ(EnumC1576680r8E.LOAD_DATA_START, null);
            }
        }

        public final void LJIIIIZZ(Function1 function1) throws JSONException {
            if (!Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ) && this.loadDataSuccessEnd == 0) {
                this.loadDataSuccessEnd = SystemClock.uptimeMillis();
                if (function1 != null) {
                    function1.invoke(this);
                }
                LJIIJ(EnumC1576680r8E.LOAD_DATA_SUCCESS, null);
            }
        }

        public final void LJIILJJIL(boolean z) {
            if (Intrinsics.LJFF(this, MiniDramaPagePerformanceMonitor.LIZIZ)) {
                return;
            }
            this.isFromLastWatch = z ? 1 : 0;
        }

        public final void LIZ(EnumC1576680r8E enumC1576680r8E, Function1<? super PagePerformanceEvent, Unit> function1) {
            PagePerformanceEvent pagePerformanceEvent = MiniDramaPagePerformanceMonitor.LIZIZ;
            if (Intrinsics.LJFF(this, pagePerformanceEvent)) {
                return;
            }
            this.stage = enumC1576680r8E.getValue();
            if (function1 != null) {
                function1.invoke(this);
            }
            if (!Intrinsics.LJFF(this, pagePerformanceEvent)) {
                try {
                    this.stage = enumC1576680r8E.getValue();
                    this.onCreateDFStart = MiniDramaPagePerformanceMonitor.LIZLLL(this.onCreateDFStart - this.onClickEnter);
                    this.onCreateStart = MiniDramaPagePerformanceMonitor.LIZLLL(this.onCreateStart - this.onClickEnter);
                    this.viewFirstFrame = MiniDramaPagePerformanceMonitor.LIZLLL(this.viewFirstFrame - this.onClickEnter);
                    this.videoFirstFrame = MiniDramaPagePerformanceMonitor.LIZLLL(this.videoFirstFrame - this.onClickEnter);
                    this.onPageHide = MiniDramaPagePerformanceMonitor.LIZLLL(this.onPageHide - this.onClickEnter);
                    long j = this.loadDataStart;
                    long j2 = this.loadDataSuccessEnd;
                    long j3 = this.loadDataFailEnd;
                    this.loadDataStart = MiniDramaPagePerformanceMonitor.LIZLLL(j - this.onClickEnter);
                    this.loadDataSuccessEnd = MiniDramaPagePerformanceMonitor.LIZLLL(j2 - this.onClickEnter);
                    this.loadDataDuration = MiniDramaPagePerformanceMonitor.LIZLLL(j2 - j);
                    long j4 = this.loadDataMixPageStart;
                    long j5 = this.loadDataMixPageSuccessEnd;
                    long j6 = this.loadDataMixPageFailEnd;
                    this.loadDataMixPageStart = MiniDramaPagePerformanceMonitor.LIZLLL(j4 - this.onClickEnter);
                    this.loadDataMixPageSuccessEnd = MiniDramaPagePerformanceMonitor.LIZLLL(j5 - this.onClickEnter);
                    this.loadDataMixPageDuration = MiniDramaPagePerformanceMonitor.LIZLLL(j5 - j4);
                    if (enumC1576680r8E == EnumC1576680r8E.LOAD_DATA_MIX_PAGE_FAIL) {
                        this.loadDataMixPageFailEnd = MiniDramaPagePerformanceMonitor.LIZLLL(j6 - this.onClickEnter);
                        this.loadDataMixPageDuration = MiniDramaPagePerformanceMonitor.LIZLLL(j6 - j);
                    }
                    if (enumC1576680r8E == EnumC1576680r8E.LOAD_DATA_FAIL) {
                        this.loadDataFailEnd = MiniDramaPagePerformanceMonitor.LIZLLL(j3 - this.onClickEnter);
                        this.loadDataDuration = MiniDramaPagePerformanceMonitor.LIZLLL(j3 - j);
                    }
                    this.onClickEnter = 0L;
                    C1163504gr.LIZIZ.onEventV3("mini_drama_page_performance", new JSONObject(((IJsonService) ServiceManager.get().getService(IJsonService.class)).LIZ(this)));
                    if (enumC1576680r8E != EnumC1576680r8E.ON_CLICK_ENTER) {
                        MiniDramaPagePerformanceMonitor.LIZ.remove(this.pageType);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }

        public final void LJIIJ(EnumC1576680r8E enumC1576680r8E, Function1<? super JSONObject, Unit> function1) throws JSONException {
            C1163504gr c1163504gr = C1163504gr.LIZIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("stage", enumC1576680r8E.getValue());
            jSONObject.putOpt("page_type", this.pageType);
            jSONObject.putOpt("is_aab_bound", Integer.valueOf(this.isAABBound));
            if (function1 != null) {
                function1.invoke(jSONObject);
            }
            c1163504gr.onEventV3("mini_drama_page_stage", jSONObject);
        }
    }

    public static PagePerformanceEvent LIZ(EnumC1573550r3B enumC1573550r3B) {
        PagePerformanceEvent pagePerformanceEvent = new PagePerformanceEvent();
        pagePerformanceEvent.pageType = enumC1573550r3B.getValue();
        LIZ.put(enumC1573550r3B.getValue(), pagePerformanceEvent);
        return pagePerformanceEvent;
    }

    public static PagePerformanceEvent LIZIZ(EnumC1573550r3B enumC1573550r3B) {
        if (!Intrinsics.LJFF(LIZJ(enumC1573550r3B), LIZIZ)) {
            return LIZJ(enumC1573550r3B);
        }
        PagePerformanceEvent pagePerformanceEvent = new PagePerformanceEvent();
        pagePerformanceEvent.pageType = enumC1573550r3B.getValue();
        LIZ.put(enumC1573550r3B.getValue(), pagePerformanceEvent);
        return pagePerformanceEvent;
    }

    public static PagePerformanceEvent LIZJ(EnumC1573550r3B enumC1573550r3B) {
        PagePerformanceEvent pagePerformanceEvent = (PagePerformanceEvent) ((LinkedHashMap) LIZ).get(enumC1573550r3B.getValue());
        if (pagePerformanceEvent == null) {
            return LIZIZ;
        }
        return pagePerformanceEvent;
    }

    public static long LIZLLL(long j) {
        Long lValueOf = Long.valueOf(j);
        long jLongValue = lValueOf.longValue();
        if (0 <= jLongValue && jLongValue < 70001) {
            return lValueOf.longValue();
        }
        return -1L;
    }
}
