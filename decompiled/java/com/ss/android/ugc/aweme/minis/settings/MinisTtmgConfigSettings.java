package com.ss.android.ugc.aweme.minis.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.amg.minigameruntime.api.ABSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.minis.settings.MinisRevisitMissionSettings;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisTtmgConfigSettings {
    public static final MinisTtmgConfigModel LIZ = new MinisTtmgConfigModel(0, false, 0, false, 0, 0, null, false, 0, false, null, null, false, false, false, false, false, null, null, false, 0, 0, 4194303, null);

    public static final class NativeRuntimeCacheConfig {

        @C09CT("cache_validity_period_ms")
        public final long cacheValidityPeriodMs;

        @C09CT("check_interval_ms")
        public final long checkIntervalMs;

        @C09CT("enable_absolute_lifetime_fallback")
        public final boolean enableAbsoluteLifetimeFallback;

        @C09CT("enable_timer_cleanup")
        public final boolean enableTimerCleanup;

        @C09CT("max_absolute_lifetime_ms")
        public final long maxAbsoluteLifetimeMs;

        @C09CT("respect_background_render_exemption")
        public final boolean respectBackgroundRenderExemption;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NativeRuntimeCacheConfig)) {
                return false;
            }
            NativeRuntimeCacheConfig nativeRuntimeCacheConfig = (NativeRuntimeCacheConfig) obj;
            return this.cacheValidityPeriodMs == nativeRuntimeCacheConfig.cacheValidityPeriodMs && this.maxAbsoluteLifetimeMs == nativeRuntimeCacheConfig.maxAbsoluteLifetimeMs && this.checkIntervalMs == nativeRuntimeCacheConfig.checkIntervalMs && this.enableTimerCleanup == nativeRuntimeCacheConfig.enableTimerCleanup && this.enableAbsoluteLifetimeFallback == nativeRuntimeCacheConfig.enableAbsoluteLifetimeFallback && this.respectBackgroundRenderExemption == nativeRuntimeCacheConfig.respectBackgroundRenderExemption;
        }

        public final int hashCode() {
            return (((((((((C786410Ut5.Y2(this.cacheValidityPeriodMs) * 31) + C786410Ut5.Y2(this.maxAbsoluteLifetimeMs)) * 31) + C786410Ut5.Y2(this.checkIntervalMs)) * 31) + C786410Ut5.Z2(this.enableTimerCleanup)) * 31) + C786410Ut5.Z2(this.enableAbsoluteLifetimeFallback)) * 31) + C786410Ut5.Z2(this.respectBackgroundRenderExemption);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NativeRuntimeCacheConfig(cacheValidityPeriodMs=");
            sbLIZ.append(this.cacheValidityPeriodMs);
            sbLIZ.append(", maxAbsoluteLifetimeMs=");
            sbLIZ.append(this.maxAbsoluteLifetimeMs);
            sbLIZ.append(", checkIntervalMs=");
            sbLIZ.append(this.checkIntervalMs);
            sbLIZ.append(", enableTimerCleanup=");
            sbLIZ.append(this.enableTimerCleanup);
            sbLIZ.append(", enableAbsoluteLifetimeFallback=");
            sbLIZ.append(this.enableAbsoluteLifetimeFallback);
            sbLIZ.append(", respectBackgroundRenderExemption=");
            sbLIZ.append(this.respectBackgroundRenderExemption);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NativeRuntimeCacheConfig() {
            this(300000L, 1800000L, 30000L, true, false, true);
        }

        public NativeRuntimeCacheConfig(long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
            this.cacheValidityPeriodMs = j;
            this.maxAbsoluteLifetimeMs = j2;
            this.checkIntervalMs = j3;
            this.enableTimerCleanup = z;
            this.enableAbsoluteLifetimeFallback = z2;
            this.respectBackgroundRenderExemption = z3;
        }
    }

    public static final MinisTtmgConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisTtmgConfigModel minisTtmgConfigModel = LIZ;
        MinisTtmgConfigModel minisTtmgConfigModel2 = (MinisTtmgConfigModel) settingsManagerLIZLLL.LJIIIIZZ("minis_ttmg_config", MinisTtmgConfigModel.class, minisTtmgConfigModel);
        return minisTtmgConfigModel2 != null ? minisTtmgConfigModel2 : minisTtmgConfigModel;
    }

    public static final class MinisTtmgConfigModel {

        @C09CT("amg")
        public final ABSetting amg;

        @C09CT("android_js_engine_type")
        public final int androidJsEngineType;

        @C09CT("block_startup")
        public final boolean blockStartup;

        @C09CT("cache_count")
        public final int cacheCount;

        @C09CT("disable_decompress_stream_mode")
        public final boolean disableDecompressStreamMode;

        @C09CT("enable_get_minis_fragment_burst_report")
        public final boolean enableGetMinisFragmentBurstReport;

        @C09CT("enable_minis_handback_jsb_reregister")
        public final boolean enableMinisHandbackJsbReregister;

        @C09CT("enable_minis_pkgs_config_read_fallback")
        public final boolean enableMinisPkgsConfigReadFallback;

        @C09CT("enable_minis_service_load_perf_revamp")
        public final boolean enableMinisServiceLoadPerfRevamp;

        @C09CT("enable_minis_service_plugin_await_install")
        public final boolean enableMinisServicePluginAwaitInstall;

        @C09CT("enable_minis_service_plugin_installed_check")
        public final boolean enableMinisServicePluginInstalledCheck;

        @C09CT("enable_preload")
        public final boolean enablePreload;

        @C09CT("exit_bottom_bar_feed_sidebar_regions")
        public final List<String> exitBottomBarFeedSidebarRegions;

        @C09CT("get_minis_fragment_burst_stack_frames")
        public final int getMinisFragmentBurstStackFrames;

        @C09CT("get_minis_fragment_burst_window_ms")
        public final long getMinisFragmentBurstWindowMs;

        @C09CT("loading_icon_click_debug_count")
        public final int loadingIconClickDebugCount;

        @C09CT("max_hot_startup_cache_count")
        public final int maxHotStartupCacheCount;

        @C09CT("minis_downloader_new")
        public final boolean minisDownloaderNew;

        @C09CT("native_game_trust_hosts")
        public final List<String> nativeGameTrustHosts;

        @C09CT("native_runtime_cache")
        public final NativeRuntimeCacheConfig nativeRuntimeCache;

        @C09CT("plugin_cache_count")
        public final int pluginCacheCount;

        @C09CT("revisit_mission")
        public final MinisRevisitMissionSettings.RawRevisitMissionConfig revisitMission;

        public MinisTtmgConfigModel() {
            this(0, false, 0, false, 0, 0, null, false, 0, false, null, null, false, false, false, false, false, null, null, false, 0L, 0, 4194303, null);
        }

        public MinisTtmgConfigModel(int i, boolean z, int i2, boolean z2, int i3, int i4, List<String> list, boolean z3, int i5, boolean z4, ABSetting aBSetting, NativeRuntimeCacheConfig nativeRuntimeCacheConfig, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, MinisRevisitMissionSettings.RawRevisitMissionConfig rawRevisitMissionConfig, List<String> list2, boolean z10, long j, int i6) {
            this.cacheCount = i;
            this.blockStartup = z;
            this.pluginCacheCount = i2;
            this.enablePreload = z2;
            this.loadingIconClickDebugCount = i3;
            this.maxHotStartupCacheCount = i4;
            this.nativeGameTrustHosts = list;
            this.minisDownloaderNew = z3;
            this.androidJsEngineType = i5;
            this.disableDecompressStreamMode = z4;
            this.amg = aBSetting;
            this.nativeRuntimeCache = nativeRuntimeCacheConfig;
            this.enableMinisHandbackJsbReregister = z5;
            this.enableMinisServicePluginAwaitInstall = z6;
            this.enableMinisServicePluginInstalledCheck = z7;
            this.enableMinisServiceLoadPerfRevamp = z8;
            this.enableMinisPkgsConfigReadFallback = z9;
            this.revisitMission = rawRevisitMissionConfig;
            this.exitBottomBarFeedSidebarRegions = list2;
            this.enableGetMinisFragmentBurstReport = z10;
            this.getMinisFragmentBurstWindowMs = j;
            this.getMinisFragmentBurstStackFrames = i6;
        }

        public MinisTtmgConfigModel(int i, boolean z, int i2, boolean z2, int i3, int i4, List list, boolean z3, int i5, boolean z4, ABSetting aBSetting, NativeRuntimeCacheConfig nativeRuntimeCacheConfig, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, MinisRevisitMissionSettings.RawRevisitMissionConfig rawRevisitMissionConfig, List list2, boolean z10, long j, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 1 : i, (i7 & 2) != 0 ? false : z, (i7 & 4) != 0 ? 1 : i2, (i7 & 8) != 0 ? false : z2, (i7 & 16) != 0 ? Integer.MAX_VALUE : i3, (i7 & 32) != 0 ? 2 : i4, (i7 & 64) != 0 ? C13BV.INSTANCE : list, (i7 & 128) != 0 ? true : z3, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) == 0 ? z4 : false, (i7 & 1024) != 0 ? new ABSetting(false, false, 1.0f, 1, true, true, true, false, 1, true) : aBSetting, (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new NativeRuntimeCacheConfig(300000L, 1800000L, 30000L, true, false, true) : nativeRuntimeCacheConfig, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z5, (i7 & 8192) != 0 ? true : z6, (i7 & 16384) != 0 ? true : z7, (32768 & i7) != 0 ? true : z8, (65536 & i7) != 0 ? true : z9, (131072 & i7) != 0 ? null : rawRevisitMissionConfig, (262144 & i7) != 0 ? C13BV.INSTANCE : list2, (524288 & i7) != 0 ? true : z10, (1048576 & i7) != 0 ? 500L : j, (i7 & 2097152) != 0 ? 15 : i6);
        }
    }
}
