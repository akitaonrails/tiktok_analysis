package com.ss.android.ugc.aweme.task.resaltas;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ResAltasConfig {

    @C09CT("anr_extra_info_flags")
    public final int anrExtraInfoFlags;

    @C09CT("anr_level_sampling")
    public final AnrLevelSamplingConfig anrLevelSampling;

    @C09CT("collect_anr_level")
    public final boolean collectAnrLevel;

    @C09CT("collect_disk")
    public final boolean collectDisk;

    @C09CT("collect_fd")
    public final boolean collectFd;

    @C09CT("collect_fd_detail")
    public final boolean collectFdDetail;

    @C09CT("collect_fps")
    public final boolean collectFps;

    @C09CT("collect_fresco")
    public final boolean collectFresco;

    @C09CT("collect_fresco_detail")
    public final boolean collectFrescoDetail;

    @C09CT("collect_gc_detail")
    public final boolean collectGcDetail;

    @C09CT("collect_io")
    public final boolean collectIo;

    @C09CT("collect_main_thread_io")
    public final boolean collectMainThreadIo;

    @C09CT("collect_main_thread_stack_on_lock")
    public final boolean collectMainThreadStackOnLock;

    @C09CT("collect_main_thread_wchan")
    public final boolean collectMainThreadWchan;

    @C09CT("collect_message_queue")
    public final boolean collectMessageQueue;

    @C09CT("collect_netstat")
    public final boolean collectNetstat;

    @C09CT("collect_netstat_udp")
    public final boolean collectNetstatUdp;

    @C09CT("collect_object_instance")
    public final boolean collectObjectInstance;

    @C09CT("collect_on_background")
    public final boolean collectOnBackground;

    @C09CT("collect_runnable_event")
    public final boolean collectRunnableEvent;

    @C09CT("collect_runnable_event_sample_rate")
    public final int collectRunnableEventSampleRate;

    @C09CT("collect_traffic")
    public final boolean collectTraffic;

    @C09CT("collect_traffic_uid_detail")
    public final boolean collectTrafficUidDetail;

    @C09CT("collect_video_cache")
    public final boolean collectVideoCache;

    @C09CT("collect_web")
    public final boolean collectWeb;

    @C09CT("collector_cache_ttl_ms")
    public final Map<String, Long> collectorCacheTtlMs;

    @C09CT("debug_perf_enabled")
    public final boolean debugPerfEnabled;

    @C09CT("debug_perf_log_per_collector")
    public final boolean debugPerfLogPerCollector;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("event_excluded_collectors")
    public final Map<String, List<String>> eventExcludedCollectors;

    @C09CT("heartbeat_sampling")
    public final HeartbeatSamplingConfig heartbeatSampling;

    @C09CT("main_stack_capture_owner")
    public final boolean mainStackCaptureOwner;

    @C09CT("main_stack_max_frames")
    public final int mainStackMaxFrames;

    @C09CT("main_stack_min_interval_ms")
    public final long mainStackMinIntervalMs;

    @C09CT("main_stack_wchan_categories")
    public final List<String> mainStackWchanCategories;

    @C09CT("max_event_count")
    public final int maxEventCount;

    @C09CT("mmap_data_capacity_kb")
    public final int mmapDataCapacityKb;

    @C09CT("object_instance_classes")
    public final List<String> objectInstanceClasses;

    @C09CT("object_instance_include_subclasses")
    public final boolean objectInstanceIncludeSubclasses;

    @C09CT("page_excluded_collectors")
    public final List<String> pageExcludedCollectors;

    @C09CT("periodic_sampling")
    public final PeriodicSamplingConfig periodicSampling;

    @C09CT("targeted_sampling")
    public final TargetedSamplingConfig targetedSampling;

    @C09CT("upload_raw_mmap")
    public final boolean uploadRawMmap;

    @C09CT("use_mmap")
    public final boolean useMmap;

    public ResAltasConfig() {
        this(false, true, true, true, false, null, true, 200L, 64, true, true, true, false, false, false, false, null, true, true, true, false, false, false, false, false, false, false, false, 10, 200, false, 15, null, null, true, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, true, null, null, null, null, null, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResAltasConfig)) {
            return false;
        }
        ResAltasConfig resAltasConfig = (ResAltasConfig) obj;
        return this.enable == resAltasConfig.enable && this.collectAnrLevel == resAltasConfig.collectAnrLevel && this.collectMessageQueue == resAltasConfig.collectMessageQueue && this.collectMainThreadWchan == resAltasConfig.collectMainThreadWchan && this.collectMainThreadStackOnLock == resAltasConfig.collectMainThreadStackOnLock && Intrinsics.LJFF(this.mainStackWchanCategories, resAltasConfig.mainStackWchanCategories) && this.mainStackCaptureOwner == resAltasConfig.mainStackCaptureOwner && this.mainStackMinIntervalMs == resAltasConfig.mainStackMinIntervalMs && this.mainStackMaxFrames == resAltasConfig.mainStackMaxFrames && this.collectIo == resAltasConfig.collectIo && this.collectMainThreadIo == resAltasConfig.collectMainThreadIo && this.collectTraffic == resAltasConfig.collectTraffic && this.collectTrafficUidDetail == resAltasConfig.collectTrafficUidDetail && this.collectNetstat == resAltasConfig.collectNetstat && this.collectNetstatUdp == resAltasConfig.collectNetstatUdp && this.collectObjectInstance == resAltasConfig.collectObjectInstance && Intrinsics.LJFF(this.objectInstanceClasses, resAltasConfig.objectInstanceClasses) && this.objectInstanceIncludeSubclasses == resAltasConfig.objectInstanceIncludeSubclasses && this.collectFresco == resAltasConfig.collectFresco && this.collectFrescoDetail == resAltasConfig.collectFrescoDetail && this.collectGcDetail == resAltasConfig.collectGcDetail && this.collectWeb == resAltasConfig.collectWeb && this.collectFd == resAltasConfig.collectFd && this.collectFdDetail == resAltasConfig.collectFdDetail && this.collectDisk == resAltasConfig.collectDisk && this.collectFps == resAltasConfig.collectFps && this.collectVideoCache == resAltasConfig.collectVideoCache && this.collectRunnableEvent == resAltasConfig.collectRunnableEvent && this.collectRunnableEventSampleRate == resAltasConfig.collectRunnableEventSampleRate && this.maxEventCount == resAltasConfig.maxEventCount && this.collectOnBackground == resAltasConfig.collectOnBackground && this.anrExtraInfoFlags == resAltasConfig.anrExtraInfoFlags && Intrinsics.LJFF(this.pageExcludedCollectors, resAltasConfig.pageExcludedCollectors) && Intrinsics.LJFF(this.eventExcludedCollectors, resAltasConfig.eventExcludedCollectors) && this.useMmap == resAltasConfig.useMmap && this.mmapDataCapacityKb == resAltasConfig.mmapDataCapacityKb && this.uploadRawMmap == resAltasConfig.uploadRawMmap && Intrinsics.LJFF(this.targetedSampling, resAltasConfig.targetedSampling) && Intrinsics.LJFF(this.periodicSampling, resAltasConfig.periodicSampling) && Intrinsics.LJFF(this.heartbeatSampling, resAltasConfig.heartbeatSampling) && Intrinsics.LJFF(this.anrLevelSampling, resAltasConfig.anrLevelSampling) && Intrinsics.LJFF(this.collectorCacheTtlMs, resAltasConfig.collectorCacheTtlMs) && this.debugPerfEnabled == resAltasConfig.debugPerfEnabled && this.debugPerfLogPerCollector == resAltasConfig.debugPerfLogPerCollector;
    }

    public int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.collectAnrLevel)) * 31) + C786410Ut5.Z2(this.collectMessageQueue)) * 31) + C786410Ut5.Z2(this.collectMainThreadWchan)) * 31) + C786410Ut5.Z2(this.collectMainThreadStackOnLock)) * 31;
        List<String> list = this.mainStackWchanCategories;
        int iHashCode = (((((((((((((((((((((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.mainStackCaptureOwner)) * 31) + C786410Ut5.Y2(this.mainStackMinIntervalMs)) * 31) + this.mainStackMaxFrames) * 31) + C786410Ut5.Z2(this.collectIo)) * 31) + C786410Ut5.Z2(this.collectMainThreadIo)) * 31) + C786410Ut5.Z2(this.collectTraffic)) * 31) + C786410Ut5.Z2(this.collectTrafficUidDetail)) * 31) + C786410Ut5.Z2(this.collectNetstat)) * 31) + C786410Ut5.Z2(this.collectNetstatUdp)) * 31) + C786410Ut5.Z2(this.collectObjectInstance)) * 31;
        List<String> list2 = this.objectInstanceClasses;
        int iHashCode2 = (((((((((((((((((((((((((((((((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Z2(this.objectInstanceIncludeSubclasses)) * 31) + C786410Ut5.Z2(this.collectFresco)) * 31) + C786410Ut5.Z2(this.collectFrescoDetail)) * 31) + C786410Ut5.Z2(this.collectGcDetail)) * 31) + C786410Ut5.Z2(this.collectWeb)) * 31) + C786410Ut5.Z2(this.collectFd)) * 31) + C786410Ut5.Z2(this.collectFdDetail)) * 31) + C786410Ut5.Z2(this.collectDisk)) * 31) + C786410Ut5.Z2(this.collectFps)) * 31) + C786410Ut5.Z2(this.collectVideoCache)) * 31) + C786410Ut5.Z2(this.collectRunnableEvent)) * 31) + this.collectRunnableEventSampleRate) * 31) + this.maxEventCount) * 31) + C786410Ut5.Z2(this.collectOnBackground)) * 31) + this.anrExtraInfoFlags) * 31;
        List<String> list3 = this.pageExcludedCollectors;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, List<String>> map = this.eventExcludedCollectors;
        int iHashCode4 = (((((((iHashCode3 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.useMmap)) * 31) + this.mmapDataCapacityKb) * 31) + C786410Ut5.Z2(this.uploadRawMmap)) * 31;
        TargetedSamplingConfig targetedSamplingConfig = this.targetedSampling;
        int iHashCode5 = (iHashCode4 + (targetedSamplingConfig == null ? 0 : targetedSamplingConfig.hashCode())) * 31;
        PeriodicSamplingConfig periodicSamplingConfig = this.periodicSampling;
        int iHashCode6 = (iHashCode5 + (periodicSamplingConfig == null ? 0 : periodicSamplingConfig.hashCode())) * 31;
        HeartbeatSamplingConfig heartbeatSamplingConfig = this.heartbeatSampling;
        int iHashCode7 = (iHashCode6 + (heartbeatSamplingConfig == null ? 0 : heartbeatSamplingConfig.hashCode())) * 31;
        AnrLevelSamplingConfig anrLevelSamplingConfig = this.anrLevelSampling;
        int iHashCode8 = (iHashCode7 + (anrLevelSamplingConfig == null ? 0 : anrLevelSamplingConfig.hashCode())) * 31;
        Map<String, Long> map2 = this.collectorCacheTtlMs;
        return ((((iHashCode8 + (map2 != null ? map2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.debugPerfEnabled)) * 31) + C786410Ut5.Z2(this.debugPerfLogPerCollector);
    }

    public String toString() {
        return "ResAltasConfig(enable=" + this.enable + ", collectAnrLevel=" + this.collectAnrLevel + ", collectMessageQueue=" + this.collectMessageQueue + ", collectMainThreadWchan=" + this.collectMainThreadWchan + ", collectMainThreadStackOnLock=" + this.collectMainThreadStackOnLock + ", mainStackWchanCategories=" + this.mainStackWchanCategories + ", mainStackCaptureOwner=" + this.mainStackCaptureOwner + ", mainStackMinIntervalMs=" + this.mainStackMinIntervalMs + ", mainStackMaxFrames=" + this.mainStackMaxFrames + ", collectIo=" + this.collectIo + ", collectMainThreadIo=" + this.collectMainThreadIo + ", collectTraffic=" + this.collectTraffic + ", collectTrafficUidDetail=" + this.collectTrafficUidDetail + ", collectNetstat=" + this.collectNetstat + ", collectNetstatUdp=" + this.collectNetstatUdp + ", collectObjectInstance=" + this.collectObjectInstance + ", objectInstanceClasses=" + this.objectInstanceClasses + ", objectInstanceIncludeSubclasses=" + this.objectInstanceIncludeSubclasses + ", collectFresco=" + this.collectFresco + ", collectFrescoDetail=" + this.collectFrescoDetail + ", collectGcDetail=" + this.collectGcDetail + ", collectWeb=" + this.collectWeb + ", collectFd=" + this.collectFd + ", collectFdDetail=" + this.collectFdDetail + ", collectDisk=" + this.collectDisk + ", collectFps=" + this.collectFps + ", collectVideoCache=" + this.collectVideoCache + ", collectRunnableEvent=" + this.collectRunnableEvent + ", collectRunnableEventSampleRate=" + this.collectRunnableEventSampleRate + ", maxEventCount=" + this.maxEventCount + ", collectOnBackground=" + this.collectOnBackground + ", anrExtraInfoFlags=" + this.anrExtraInfoFlags + ", pageExcludedCollectors=" + this.pageExcludedCollectors + ", eventExcludedCollectors=" + this.eventExcludedCollectors + ", useMmap=" + this.useMmap + ", mmapDataCapacityKb=" + this.mmapDataCapacityKb + ", uploadRawMmap=" + this.uploadRawMmap + ", targetedSampling=" + this.targetedSampling + ", periodicSampling=" + this.periodicSampling + ", heartbeatSampling=" + this.heartbeatSampling + ", anrLevelSampling=" + this.anrLevelSampling + ", collectorCacheTtlMs=" + this.collectorCacheTtlMs + ", debugPerfEnabled=" + this.debugPerfEnabled + ", debugPerfLogPerCollector=" + this.debugPerfLogPerCollector + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResAltasConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<String> list, boolean z6, long j, int i, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, List<String> list2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, int i2, int i3, boolean z25, int i4, List<String> list3, Map<String, ? extends List<String>> map, boolean z26, int i5, boolean z27, TargetedSamplingConfig targetedSamplingConfig, PeriodicSamplingConfig periodicSamplingConfig, HeartbeatSamplingConfig heartbeatSamplingConfig, AnrLevelSamplingConfig anrLevelSamplingConfig, Map<String, Long> map2, boolean z28, boolean z29) {
        this.enable = z;
        this.collectAnrLevel = z2;
        this.collectMessageQueue = z3;
        this.collectMainThreadWchan = z4;
        this.collectMainThreadStackOnLock = z5;
        this.mainStackWchanCategories = list;
        this.mainStackCaptureOwner = z6;
        this.mainStackMinIntervalMs = j;
        this.mainStackMaxFrames = i;
        this.collectIo = z7;
        this.collectMainThreadIo = z8;
        this.collectTraffic = z9;
        this.collectTrafficUidDetail = z10;
        this.collectNetstat = z11;
        this.collectNetstatUdp = z12;
        this.collectObjectInstance = z13;
        this.objectInstanceClasses = list2;
        this.objectInstanceIncludeSubclasses = z14;
        this.collectFresco = z15;
        this.collectFrescoDetail = z16;
        this.collectGcDetail = z17;
        this.collectWeb = z18;
        this.collectFd = z19;
        this.collectFdDetail = z20;
        this.collectDisk = z21;
        this.collectFps = z22;
        this.collectVideoCache = z23;
        this.collectRunnableEvent = z24;
        this.collectRunnableEventSampleRate = i2;
        this.maxEventCount = i3;
        this.collectOnBackground = z25;
        this.anrExtraInfoFlags = i4;
        this.pageExcludedCollectors = list3;
        this.eventExcludedCollectors = map;
        this.useMmap = z26;
        this.mmapDataCapacityKb = i5;
        this.uploadRawMmap = z27;
        this.targetedSampling = targetedSamplingConfig;
        this.periodicSampling = periodicSamplingConfig;
        this.heartbeatSampling = heartbeatSamplingConfig;
        this.anrLevelSampling = anrLevelSamplingConfig;
        this.collectorCacheTtlMs = map2;
        this.debugPerfEnabled = z28;
        this.debugPerfLogPerCollector = z29;
    }
}
