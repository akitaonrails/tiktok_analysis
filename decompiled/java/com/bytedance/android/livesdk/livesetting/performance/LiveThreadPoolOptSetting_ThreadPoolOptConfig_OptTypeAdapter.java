package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveThreadPoolOptSetting_ThreadPoolOptConfig_OptTypeAdapter extends TypeAdapter<LiveThreadPoolOptSetting.ThreadPoolOptConfig> {
    public final Gson LIZ;

    public LiveThreadPoolOptSetting_ThreadPoolOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveThreadPoolOptSetting.ThreadPoolOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveThreadPoolOptSetting.ThreadPoolOptConfig threadPoolOptConfig = new LiveThreadPoolOptSetting.ThreadPoolOptConfig(0, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0L, 0L, 0L, 0L, 0L, 0, 0, 0, 0, false, 0L, false, false, -1, 8191, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1888390719:
                        if (strLJJJJ.equals("computation_keep_alive_time_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.computationKeepAliveTimeSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1848688851:
                        if (strLJJJJ.equals("default_queue_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.defaultQueueSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1717828443:
                        if (strLJJJJ.equals("room_enter_default_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.roomEnterDefaultMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1712104561:
                        if (strLJJJJ.equals("scheduled_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.scheduledCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1669674844:
                        if (strLJJJJ.equals("pool_scale_step")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.poolScaleStep = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1175131445:
                        if (strLJJJJ.equals("enable_log_report")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.enableLogReport = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1168557081:
                        if (strLJJJJ.equals("computation_queue_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.computationQueueSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1110404941:
                        if (strLJJJJ.equals("room_enter_io_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.roomEnterIoCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1028227709:
                        if (strLJJJJ.equals("high_priority_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.highPriorityCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -993850327:
                        if (strLJJJJ.equals("computation_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.computationCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -730416785:
                        if (strLJJJJ.equals("low_load_queue_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.lowLoadQueueThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -631675028:
                        if (strLJJJJ.equals("enableInt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.enableInt = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -584173784:
                        if (strLJJJJ.equals("io_queue_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.ioQueueSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -487231437:
                        if (strLJJJJ.equals("enable_thread_pool_crash_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.enableThreadPoolCrashFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -461600733:
                        if (strLJJJJ.equals("default_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.defaultCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -286571287:
                        if (strLJJJJ.equals("promote_to_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.promoteToPriority = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -264964244:
                        if (strLJJJJ.equals("priority_whitelist")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.priorityWhitelist = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -222273841:
                        if (strLJJJJ.equals("default_pool_min_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.defaultPoolMinCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -14238699:
                        if (strLJJJJ.equals("medium_load_queue_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.mediumLoadQueueMin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -5167928:
                        if (strLJJJJ.equals("io_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.ioCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 11561332:
                        if (strLJJJJ.equals("computation_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.computationMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 33402865:
                        if (strLJJJJ.equals("long_running_task_threshold_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.longRunningTaskThresholdMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 284896170:
                        if (strLJJJJ.equals("room_enter_io_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.roomEnterIoMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 305825338:
                        if (strLJJJJ.equals("default_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.defaultMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 332912295:
                        if (strLJJJJ.equals("scheduled_keep_alive_time_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.scheduledKeepAliveTimeSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 404566838:
                        if (strLJJJJ.equals("enable_enter_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.enableRoomEnterStrategy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 422477211:
                        if (strLJJJJ.equals("high_priority_keep_alive_time_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.highPriorityKeepAliveTimeSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 459096309:
                        if (strLJJJJ.equals("io_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.ioMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 464973047:
                        if (strLJJJJ.equals("high_load_latency_threshold_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.highLoadLatencyThresholdMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 868816937:
                        if (strLJJJJ.equals("low_load_latency_threshold_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.lowLoadLatencyThresholdMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1229641496:
                        if (strLJJJJ.equals("room_enter_default_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.roomEnterDefaultCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1287136993:
                        if (strLJJJJ.equals("io_pool_max_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.ioPoolMaxMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1317886403:
                        if (strLJJJJ.equals("medium_load_latency_min_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.mediumLoadLatencyMinMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1512412494:
                        if (strLJJJJ.equals("scheduled_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.scheduledMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1622055905:
                        if (strLJJJJ.equals("high_load_queue_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.highLoadQueueThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1640234812:
                        if (strLJJJJ.equals("default_pool_max_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.defaultPoolMaxMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1673359419:
                        if (strLJJJJ.equals("default_keep_alive_time_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.defaultKeepAliveTimeSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1712901220:
                        if (strLJJJJ.equals("opt_page_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.optLivePageCheck = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1716595658:
                        if (strLJJJJ.equals("io_pool_min_core_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.ioPoolMinCoreSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1761563059:
                        if (strLJJJJ.equals("io_pool_min_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.ioPoolMinMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1931249696:
                        if (strLJJJJ.equals("io_keep_alive_time_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.ioKeepAliveTimeSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1950115034:
                        if (strLJJJJ.equals("high_priority_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.highPriorityMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1974540131:
                        if (strLJJJJ.equals("enable_in_broadcast")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.enableInBroadcast = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2060711373:
                        if (strLJJJJ.equals("high_priority_queue_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.highPriorityQueueSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2114660878:
                        if (strLJJJJ.equals("default_pool_min_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadPoolOptConfig.defaultPoolMinMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return threadPoolOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveThreadPoolOptSetting.ThreadPoolOptConfig threadPoolOptConfig) throws IOException {
        LiveThreadPoolOptSetting.ThreadPoolOptConfig threadPoolOptConfig2 = threadPoolOptConfig;
        if (threadPoolOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enableInt");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.enableInt));
        c09dl.LJIILLIIL("enable_enter_strategy");
        c09dl.LJJJJJL(threadPoolOptConfig2.enableRoomEnterStrategy);
        c09dl.LJIILLIIL("enable_in_broadcast");
        c09dl.LJJJJJL(threadPoolOptConfig2.enableInBroadcast);
        c09dl.LJIILLIIL("default_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.defaultCoreSize));
        c09dl.LJIILLIIL("default_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.defaultMaxSize));
        c09dl.LJIILLIIL("io_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.ioCoreSize));
        c09dl.LJIILLIIL("io_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.ioMaxSize));
        c09dl.LJIILLIIL("computation_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.computationCoreSize));
        c09dl.LJIILLIIL("computation_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.computationMaxSize));
        c09dl.LJIILLIIL("high_priority_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.highPriorityCoreSize));
        c09dl.LJIILLIIL("high_priority_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.highPriorityMaxSize));
        c09dl.LJIILLIIL("high_load_queue_threshold");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.highLoadQueueThreshold));
        c09dl.LJIILLIIL("high_load_latency_threshold_ms");
        c09dl.LJJIZ(threadPoolOptConfig2.highLoadLatencyThresholdMs);
        c09dl.LJIILLIIL("medium_load_queue_min");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.mediumLoadQueueMin));
        c09dl.LJIILLIIL("medium_load_latency_min_ms");
        c09dl.LJJIZ(threadPoolOptConfig2.mediumLoadLatencyMinMs);
        c09dl.LJIILLIIL("low_load_queue_threshold");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.lowLoadQueueThreshold));
        c09dl.LJIILLIIL("low_load_latency_threshold_ms");
        c09dl.LJJIZ(threadPoolOptConfig2.lowLoadLatencyThresholdMs);
        c09dl.LJIILLIIL("io_pool_min_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.ioPoolMinCoreSize));
        c09dl.LJIILLIIL("io_pool_min_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.ioPoolMinMaxSize));
        c09dl.LJIILLIIL("io_pool_max_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.ioPoolMaxMaxSize));
        c09dl.LJIILLIIL("default_pool_min_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.defaultPoolMinCoreSize));
        c09dl.LJIILLIIL("default_pool_min_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.defaultPoolMinMaxSize));
        c09dl.LJIILLIIL("default_pool_max_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.defaultPoolMaxMaxSize));
        c09dl.LJIILLIIL("pool_scale_step");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.poolScaleStep));
        c09dl.LJIILLIIL("room_enter_io_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.roomEnterIoCoreSize));
        c09dl.LJIILLIIL("room_enter_io_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.roomEnterIoMaxSize));
        c09dl.LJIILLIIL("room_enter_default_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.roomEnterDefaultCoreSize));
        c09dl.LJIILLIIL("room_enter_default_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.roomEnterDefaultMaxSize));
        c09dl.LJIILLIIL("priority_whitelist");
        C473040Igo.LIZLLL(this.LIZ, c09dl, threadPoolOptConfig2.priorityWhitelist, String.class);
        c09dl.LJIILLIIL("promote_to_priority");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.promoteToPriority));
        c09dl.LJIILLIIL("scheduled_core_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.scheduledCoreSize));
        c09dl.LJIILLIIL("scheduled_max_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.scheduledMaxSize));
        c09dl.LJIILLIIL("default_keep_alive_time_seconds");
        c09dl.LJJIZ(threadPoolOptConfig2.defaultKeepAliveTimeSeconds);
        c09dl.LJIILLIIL("io_keep_alive_time_seconds");
        c09dl.LJJIZ(threadPoolOptConfig2.ioKeepAliveTimeSeconds);
        c09dl.LJIILLIIL("computation_keep_alive_time_seconds");
        c09dl.LJJIZ(threadPoolOptConfig2.computationKeepAliveTimeSeconds);
        c09dl.LJIILLIIL("high_priority_keep_alive_time_seconds");
        c09dl.LJJIZ(threadPoolOptConfig2.highPriorityKeepAliveTimeSeconds);
        c09dl.LJIILLIIL("scheduled_keep_alive_time_seconds");
        c09dl.LJJIZ(threadPoolOptConfig2.scheduledKeepAliveTimeSeconds);
        c09dl.LJIILLIIL("default_queue_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.defaultQueueSize));
        c09dl.LJIILLIIL("io_queue_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.ioQueueSize));
        c09dl.LJIILLIIL("computation_queue_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.computationQueueSize));
        c09dl.LJIILLIIL("high_priority_queue_size");
        c09dl.LJJJJ(Integer.valueOf(threadPoolOptConfig2.highPriorityQueueSize));
        c09dl.LJIILLIIL("enable_log_report");
        c09dl.LJJJJJL(threadPoolOptConfig2.enableLogReport);
        c09dl.LJIILLIIL("long_running_task_threshold_ms");
        c09dl.LJJIZ(threadPoolOptConfig2.longRunningTaskThresholdMs);
        c09dl.LJIILLIIL("opt_page_check");
        c09dl.LJJJJJL(threadPoolOptConfig2.optLivePageCheck);
        c09dl.LJIILLIIL("enable_thread_pool_crash_fix");
        c09dl.LJJJJJL(threadPoolOptConfig2.enableThreadPoolCrashFix);
        c09dl.LJII();
    }
}
