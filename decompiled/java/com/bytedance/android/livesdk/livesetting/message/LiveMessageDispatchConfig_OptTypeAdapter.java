package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMessageDispatchConfig_OptTypeAdapter extends TypeAdapter<LiveMessageDispatchConfig> {
    public final Gson LIZ;

    public LiveMessageDispatchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMessageDispatchConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessageDispatchConfig liveMessageDispatchConfig = new LiveMessageDispatchConfig(false, false, new ArrayList(), new ArrayList(), new ArrayList(), 10L, 1, 50L, 3, 50L, 8, -1, -1, 8, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1673715327:
                        if (strLJJJJ.equals("direct_dispatch_p2p_msg")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.directDispatchP2pMsg = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1647602539:
                        if (strLJJJJ.equals("enable_dispatch_list_optimize")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.enableDispatchListOptimize = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1628875079:
                        if (strLJJJJ.equals("dispatch_dynamic_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.dispatchDynamicDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1463312869:
                        if (strLJJJJ.equals("enable_inactive_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.enableInactiveOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1374723228:
                        if (strLJJJJ.equals("dispatch_message_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.dispatchMessageTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1332283248:
                        if (strLJJJJ.equals("fixfreq_strategy_dispatch_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.fixfreqDispatchInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1214758844:
                        if (strLJJJJ.equals("fixfreq_strategy_max_queue_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.fixfreqMaxQueueSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -273598287:
                        if (strLJJJJ.equals("smooth_dispatch_optimize")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.smoothDispatchOptimize = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -237784807:
                        if (strLJJJJ.equals("enable_async_dispatch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.enableAsyncDispatch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -161914615:
                        if (strLJJJJ.equals("optwindow_strategy_min_dispatch_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.optwindowMinDispatchSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 175545341:
                        if (strLJJJJ.equals("dispatch_limit_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.dispatchLimitDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1147441607:
                        if (strLJJJJ.equals("by_pass_dispatch_allow_method_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.byPassDispatchAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1411905944:
                        if (strLJJJJ.equals("dispatch_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.dispatchStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1466732876:
                        if (strLJJJJ.equals("fixfreq_strategy_dispatch_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.fixfreqDispatchSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1468182154:
                        if (strLJJJJ.equals("direct_dispatch_p2p_block_method_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.directDispatchP2pBlockList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1707249367:
                        if (strLJJJJ.equals("direct_dispatch_allow_method_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.directDispatchAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1816355148:
                        if (strLJJJJ.equals("optwindow_strategy_window_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageDispatchConfig.optwindowWindowTime = c09cu.LJJJ();
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
        return liveMessageDispatchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageDispatchConfig liveMessageDispatchConfig) throws IOException {
        LiveMessageDispatchConfig liveMessageDispatchConfig2 = liveMessageDispatchConfig;
        if (liveMessageDispatchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("direct_dispatch_p2p_msg");
        c09dl.LJJJJJL(liveMessageDispatchConfig2.directDispatchP2pMsg);
        c09dl.LJIILLIIL("smooth_dispatch_optimize");
        c09dl.LJJJJJL(liveMessageDispatchConfig2.smoothDispatchOptimize);
        c09dl.LJIILLIIL("direct_dispatch_allow_method_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveMessageDispatchConfig2.directDispatchAllowList, String.class);
        c09dl.LJIILLIIL("by_pass_dispatch_allow_method_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveMessageDispatchConfig2.byPassDispatchAllowList, String.class);
        c09dl.LJIILLIIL("direct_dispatch_p2p_block_method_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveMessageDispatchConfig2.directDispatchP2pBlockList, String.class);
        c09dl.LJIILLIIL("dispatch_message_timeout");
        c09dl.LJJIZ(liveMessageDispatchConfig2.dispatchMessageTimeout);
        c09dl.LJIILLIIL("dispatch_strategy");
        c09dl.LJJJJ(Integer.valueOf(liveMessageDispatchConfig2.dispatchStrategy));
        c09dl.LJIILLIIL("optwindow_strategy_window_time");
        c09dl.LJJIZ(liveMessageDispatchConfig2.optwindowWindowTime);
        c09dl.LJIILLIIL("optwindow_strategy_min_dispatch_size");
        c09dl.LJJJJ(Integer.valueOf(liveMessageDispatchConfig2.optwindowMinDispatchSize));
        c09dl.LJIILLIIL("fixfreq_strategy_dispatch_interval");
        c09dl.LJJIZ(liveMessageDispatchConfig2.fixfreqDispatchInterval);
        c09dl.LJIILLIIL("fixfreq_strategy_dispatch_size");
        c09dl.LJJJJ(Integer.valueOf(liveMessageDispatchConfig2.fixfreqDispatchSize));
        c09dl.LJIILLIIL("fixfreq_strategy_max_queue_size");
        c09dl.LJJJJ(Integer.valueOf(liveMessageDispatchConfig2.fixfreqMaxQueueSize));
        c09dl.LJIILLIIL("dispatch_limit_duration");
        c09dl.LJJJJ(Integer.valueOf(liveMessageDispatchConfig2.dispatchLimitDuration));
        c09dl.LJIILLIIL("dispatch_dynamic_duration");
        c09dl.LJJJJ(Integer.valueOf(liveMessageDispatchConfig2.dispatchDynamicDuration));
        c09dl.LJIILLIIL("enable_dispatch_list_optimize");
        c09dl.LJJJJJL(liveMessageDispatchConfig2.enableDispatchListOptimize);
        c09dl.LJIILLIIL("enable_async_dispatch");
        c09dl.LJJJJJL(liveMessageDispatchConfig2.enableAsyncDispatch);
        c09dl.LJIILLIIL("enable_inactive_opt");
        c09dl.LJJJJJL(liveMessageDispatchConfig2.enableInactiveOpt);
        c09dl.LJII();
    }
}
