package com.ss.android.ugc.aweme.bsr;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class BSRConfig {

    @C09CT("core_scene_fps_monitor_jank_time")
    public final long coreSceneFpsMonitorJankTime;

    @C09CT("core_scene_fps_monitor_jank_time_open")
    public final boolean coreSceneFpsMonitorJankTimeOpen;

    @C09CT("follow_page_load_time")
    public final long followPageLoadTime;

    @C09CT("follow_page_load_time_open")
    public final boolean followPageLoadTimeOpen;

    @C09CT("friends_enter_event")
    public final List<String> friendsEnterEvent;

    @C09CT("friends_tab_landing_time")
    public final long friendsTabLandingTime;

    @C09CT("friends_tab_landing_time_open")
    public final boolean friendsTabLandingTimeOpen;

    @C09CT("fyp_5vv_bad_scroll_count")
    public final int fyp5vvBadScrollCount;

    @C09CT("fyp_5vv_bad_vv_count")
    public final int fyp5vvBadVVCount;

    @C09CT("fyp_bad_scroll_ratio")
    public final float fypBadScrollRatio;

    @C09CT("fyp_bad_scroll_report")
    public final boolean fypBadScrollReport;

    @C09CT("fyp_continuous_bad_scroll_count")
    public final int fypContinuousBadScrollCount;

    @C09CT("fyp_first_feed_time")
    public final long fypFirstFeedTime;

    @C09CT("fyp_fps_block_threshold_frames")
    public final int fypFpsBlockThresholdFrames;

    @C09CT("fyp_fps_monitor_big_jank_open")
    public final boolean fypFpsMonitorBigJankOpen;

    @C09CT("fyp_fps_monitor_big_jank_report_open")
    public final boolean fypFpsMonitorBigJankReportOpen;

    @C09CT("fyp_fps_monitor_big_jank_time")
    public final long fypFpsMonitorBigJankTime;

    @C09CT("fyp_fps_monitor_jank_percent")
    public final float fypFpsMonitorJankPercent;

    @C09CT("fyp_fps_monitor_jank_percent_open")
    public final boolean fypFpsMonitorJankPercentOpen;

    @C09CT("fyp_fps_monitor_jank_percent_report_open")
    public final boolean fypFpsMonitorJankPercentReportOpen;

    @C09CT("fyp_fps_monitor_jank_time")
    public final long fypFpsMonitorJankTime;

    @C09CT("fyp_loading_time")
    public final long fypLoadingTime;

    @C09CT("ic_enter_event")
    public final List<String> icEnterEvent;

    @C09CT("ic_first_frame_event_names")
    public final List<String> icFirstFrameEventNames;

    @C09CT("ic_first_frame_event_new")
    public final boolean icFirstFrameEventNew;

    @C09CT("ic_first_frame_time")
    public final long icFirstFrameTime;

    @C09CT("ic_render_fps")
    public final float icRenderFps;

    @C09CT("inbox_enter_event")
    public final List<String> inboxEnterEvent;

    @C09CT("inbox_section_tti_time")
    public final long inboxSectionTtiTime;

    @C09CT("inbox_section_tti_time_open")
    public final boolean inboxSectionTtiTimeOpen;

    @C09CT("profile_self_page_load_time")
    public final long profileSelfPageLoadTime;

    @C09CT("profile_self_page_load_time_open")
    public final boolean profileSelfPageLoadTimeOpen;

    @C09CT("psp_bsr_report_exception")
    public final List<Integer> pspBSRReportException;

    @C09CT("psp_bsr_report_open")
    public final boolean pspBSRReportOpen;

    @C09CT("search_enter_event")
    public final List<String> searchEnterEvent;

    @C09CT("search_middle_time")
    public final long searchMiddleTime;

    @C09CT("search_middle_time_open")
    public final boolean searchMiddleTimeOpen;

    @C09CT("session_id_custom_open")
    public final boolean sessionIdCustomOpen;

    @C09CT("session_id_report_open")
    public final boolean sessionIdReportOpen;

    @C09CT("vod_bad_vv_ratio")
    public final float vodBadVVRatio;

    @C09CT("vod_continuous_bad_vv_count")
    public final int vodContinuousBadVVCount;

    @C09CT("vod_enter_event")
    public final List<String> vodEnterEvent;

    @C09CT("zero_vv_filter_open")
    public final boolean zeroVVFilterOpen;

    public BSRConfig() {
        this(0L, 0L, 0, 0, 0, 0.0f, false, null, 0L, 0.0f, false, false, 0L, 0.0f, false, false, 0L, 0, 0, 0.0f, false, false, false, null, null, null, null, null, false, null, false, false, 0L, false, 0L, false, 0L, false, 0L, false, 0L, false, 0L, -1, 2047, null);
    }

    public BSRConfig(long j, long j2, int i, int i2, int i3, float f, boolean z, List<String> list, long j3, float f2, boolean z2, boolean z3, long j4, float f3, boolean z4, boolean z5, long j5, int i4, int i5, float f4, boolean z6, boolean z7, boolean z8, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z9, List<Integer> list7, boolean z10, boolean z11, long j6, boolean z12, long j7, boolean z13, long j8, boolean z14, long j9, boolean z15, long j10, boolean z16, long j11) {
        this.fypFirstFeedTime = j;
        this.fypLoadingTime = j2;
        this.fypFpsBlockThresholdFrames = i;
        this.fyp5vvBadVVCount = i2;
        this.vodContinuousBadVVCount = i3;
        this.vodBadVVRatio = f;
        this.icFirstFrameEventNew = z;
        this.icFirstFrameEventNames = list;
        this.icFirstFrameTime = j3;
        this.icRenderFps = f2;
        this.fypFpsMonitorJankPercentOpen = z2;
        this.fypFpsMonitorJankPercentReportOpen = z3;
        this.fypFpsMonitorJankTime = j4;
        this.fypFpsMonitorJankPercent = f3;
        this.fypFpsMonitorBigJankOpen = z4;
        this.fypFpsMonitorBigJankReportOpen = z5;
        this.fypFpsMonitorBigJankTime = j5;
        this.fyp5vvBadScrollCount = i4;
        this.fypContinuousBadScrollCount = i5;
        this.fypBadScrollRatio = f4;
        this.fypBadScrollReport = z6;
        this.sessionIdReportOpen = z7;
        this.sessionIdCustomOpen = z8;
        this.icEnterEvent = list2;
        this.vodEnterEvent = list3;
        this.searchEnterEvent = list4;
        this.inboxEnterEvent = list5;
        this.friendsEnterEvent = list6;
        this.pspBSRReportOpen = z9;
        this.pspBSRReportException = list7;
        this.zeroVVFilterOpen = z10;
        this.coreSceneFpsMonitorJankTimeOpen = z11;
        this.coreSceneFpsMonitorJankTime = j6;
        this.searchMiddleTimeOpen = z12;
        this.searchMiddleTime = j7;
        this.inboxSectionTtiTimeOpen = z13;
        this.inboxSectionTtiTime = j8;
        this.friendsTabLandingTimeOpen = z14;
        this.friendsTabLandingTime = j9;
        this.followPageLoadTimeOpen = z15;
        this.followPageLoadTime = j10;
        this.profileSelfPageLoadTimeOpen = z16;
        this.profileSelfPageLoadTime = j11;
    }

    public BSRConfig(long j, long j2, int i, int i2, int i3, float f, boolean z, List list, long j3, float f2, boolean z2, boolean z3, long j4, float f3, boolean z4, boolean z5, long j5, int i4, int i5, float f4, boolean z6, boolean z7, boolean z8, List list2, List list3, List list4, List list5, List list6, boolean z9, List list7, boolean z10, boolean z11, long j6, boolean z12, long j7, boolean z13, long j8, boolean z14, long j9, boolean z15, long j10, boolean z16, long j11, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 10000L : j, (i6 & 2) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j2, (i6 & 4) != 0 ? 6 : i, (i6 & 8) != 0 ? 2 : i2, (i6 & 16) != 0 ? 2 : i3, (i6 & 32) != 0 ? 20.0f : f, (i6 & 64) != 0 ? false : z, (i6 & 128) != 0 ? C1697810uHb.LJIIJJI("tool_performance_enter_shoot_page_new", "tool_performance_enter_edit_page", "tool_performance_enter_post_page") : list, (i6 & 256) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j3, (i6 & 512) != 0 ? 10.0f : f2, (i6 & 1024) != 0 ? false : z2, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z3, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 100L : j4, (i6 & 8192) != 0 ? 0.3f : f3, (i6 & 16384) != 0 ? false : z4, (32768 & i6) != 0 ? false : z5, (65536 & i6) != 0 ? 320L : j5, (131072 & i6) != 0 ? 2 : i4, (262144 & i6) != 0 ? 2 : i5, (524288 & i6) != 0 ? 0.2f : f4, (1048576 & i6) != 0 ? false : z6, (2097152 & i6) != 0 ? false : z7, (4194304 & i6) != 0 ? false : z8, (8388608 & i6) != 0 ? C1697810uHb.LJIIJJI("edit_draft", "shoot", "tool_performance_record_first_frame", "tool_performance_video_preview", "tool_performance_video_record", "tool_performance_operation_cost_time", "tool_performance_enter_prop_tab", "tool_performance_prop_apply_total", "tool_performance_edit_first_frame", "tools_performance_pre_cut_opt_process", "save_local_stage", "tool_performance_publish_first_frame", "publish_fail", "draft_save", "draft_load", "shoot", "edit_draft") : list2, (16777216 & i6) != 0 ? C1697810uHb.LJIIJJI("play_session_events", "first_feed_show_time_v3") : list3, (33554432 & i6) != 0 ? Collections.singletonList("search_middle_monitor") : list4, (67108864 & i6) != 0 ? Collections.singletonList("inbox_section_tti_perf") : list5, (134217728 & i6) != 0 ? Collections.singletonList("friends_tab_landing") : list6, (268435456 & i6) != 0 ? false : z9, (536870912 & i6) != 0 ? C13BV.INSTANCE : list7, (1073741824 & i6) != 0 ? true : z10, (i6 & Integer.MIN_VALUE) != 0 ? false : z11, (i7 & 1) != 0 ? 6200L : j6, (i7 & 2) != 0 ? false : z12, (i7 & 4) != 0 ? 2000L : j7, (i7 & 8) != 0 ? false : z13, (i7 & 16) != 0 ? 4500L : j8, (i7 & 32) != 0 ? false : z14, (i7 & 64) != 0 ? 3200L : j9, (i7 & 128) != 0 ? false : z15, (i7 & 256) != 0 ? 4000L : j10, (i7 & 512) != 0 ? false : z16, (i7 & 1024) != 0 ? 2900L : j11);
    }
}
