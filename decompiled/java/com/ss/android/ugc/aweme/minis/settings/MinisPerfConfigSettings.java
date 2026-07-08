package com.ss.android.ugc.aweme.minis.settings;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisPerfConfigSettings {
    public static final MinisPerfConfigModel LIZ = new MinisPerfConfigModel(false, null, false, false, false, false, false, false, 0, false, false, false, false, 8191, null);

    public static final MinisPerfConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisPerfConfigModel minisPerfConfigModel = LIZ;
        MinisPerfConfigModel minisPerfConfigModel2 = (MinisPerfConfigModel) settingsManagerLIZLLL.LJIIIIZZ("minis_perf_config", MinisPerfConfigModel.class, minisPerfConfigModel);
        return minisPerfConfigModel2 != null ? minisPerfConfigModel2 : minisPerfConfigModel;
    }

    public static final class MinisPerfConfigModel {

        @C09CT("api_prefetch_enable")
        public final boolean apiPrefetchEnabled;

        @C09CT("enable_native_ui_jsb")
        public final boolean enableNativeUIJsb;

        @C09CT("enable_report_api_perf")
        public final boolean enableReportApiPerf;

        @C09CT("enable_report_fps_perf")
        public final boolean enableReportFpsPerf;

        @C09CT("mainframe_preload_enable")
        public final boolean mainFramePreloadEnable;

        @C09CT("meta_preload_enable")
        public final boolean metaPreloadEnable;

        @C09CT("prefetch_enable")
        public final boolean prefetchEnable;

        @C09CT("preload_file_filter")
        public final List<String> preloadFileBlacklist;

        @C09CT("recommend_meta_preload_enable")
        public final boolean recommendMetaPreloadEnable;

        @C09CT("resource_cache_enable")
        public final boolean resourceCacheEnable;

        @C09CT("resource_preload_enable")
        public final boolean resourcePreloadEnable;

        @C09CT("video_preload_enable")
        public final boolean videoPreloadEnable;

        @C09CT("video_preload_size")
        public final long videoPreloadSize;

        public MinisPerfConfigModel() {
            this(false, null, false, false, false, false, false, false, 0L, false, false, false, false, 8191, null);
        }

        public final String toString() {
            return "MinisPerfConfigModel(metaPreloadEnable=" + this.metaPreloadEnable + ", preloadFileBlacklist=" + this.preloadFileBlacklist + ", recommendMetaPreloadEnable=" + this.recommendMetaPreloadEnable + ", resourceCacheEnable=" + this.resourceCacheEnable + ", resourcePreloadEnable=" + this.resourcePreloadEnable + ", apiPrefetchEnabled=" + this.apiPrefetchEnabled + ", videoPreloadEnable=" + this.videoPreloadEnable + ", mainFramePreloadEnable=" + this.mainFramePreloadEnable + ", videoPreloadSize=" + this.videoPreloadSize + ", prefetchEnable=" + this.prefetchEnable + ", enableReportApiPerf=" + this.enableReportApiPerf + ", enableReportFpsPerf=" + this.enableReportFpsPerf + ", enableNativeUIJsb=" + this.enableNativeUIJsb + ')';
        }

        public MinisPerfConfigModel(boolean z, List<String> list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, boolean z8, boolean z9, boolean z10, boolean z11) {
            this.metaPreloadEnable = z;
            this.preloadFileBlacklist = list;
            this.recommendMetaPreloadEnable = z2;
            this.resourceCacheEnable = z3;
            this.resourcePreloadEnable = z4;
            this.apiPrefetchEnabled = z5;
            this.videoPreloadEnable = z6;
            this.mainFramePreloadEnable = z7;
            this.videoPreloadSize = j;
            this.prefetchEnable = z8;
            this.enableReportApiPerf = z9;
            this.enableReportFpsPerf = z10;
            this.enableNativeUIJsb = z11;
        }

        public MinisPerfConfigModel(boolean z, List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, boolean z8, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? 0L : j, (i & 512) == 0 ? z8 : false, (i & 1024) != 0 ? true : z9, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z10, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z11 : true);
        }
    }
}
