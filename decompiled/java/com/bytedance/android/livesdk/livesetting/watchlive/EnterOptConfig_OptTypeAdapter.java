package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class EnterOptConfig_OptTypeAdapter extends TypeAdapter<EnterOptConfig> {
    public final Gson LIZ;

    public EnterOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final EnterOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EnterOptConfig enterOptConfig = new EnterOptConfig(false, false, false, false, false, false, false, true, 2000, LivePreCreateNextRoomPlayer.ENABLE);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1554160045:
                        if (strLJJJJ.equals("enable_room_enter_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.enableRoomEnterHighPriority = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1345831700:
                        if (strLJJJJ.equals("enable_retry")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.enableRetry = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1196854782:
                        if (strLJJJJ.equals("room_enter_cpu_boost_timeout_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.roomEnterCpuBoostTimeoutMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -810429571:
                        if (strLJJJJ.equals("enable_room_enter_cpu_boost")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.enableRoomEnterCpuBoost = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -538593820:
                        if (strLJJJJ.equals("enable_thr_high_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.enableThrHighPriority = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 335257269:
                        if (strLJJJJ.equals("room_enter_bind_big_core")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.roomEnterBindBigCore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 494224990:
                        if (strLJJJJ.equals("room_enter_cpu_boost_debounce_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.roomEnterCpuBoostDebounceMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 994170734:
                        if (strLJJJJ.equals("enable_feed_api_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.enableFeedApiHighPriority = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1257035947:
                        if (strLJJJJ.equals("enable_main_thread_head")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.enableMainFirstOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2027164375:
                        if (strLJJJJ.equals("enable_feed_aip_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterOptConfig.enableFeedApiOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return enterOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnterOptConfig enterOptConfig) throws IOException {
        EnterOptConfig enterOptConfig2 = enterOptConfig;
        if (enterOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_thr_high_priority");
        c09dl.LJJJJJL(enterOptConfig2.enableThrHighPriority);
        c09dl.LJIILLIIL("enable_main_thread_head");
        c09dl.LJJJJJL(enterOptConfig2.enableMainFirstOpt);
        c09dl.LJIILLIIL("enable_retry");
        c09dl.LJJJJJL(enterOptConfig2.enableRetry);
        c09dl.LJIILLIIL("enable_feed_aip_opt");
        c09dl.LJJJJJL(enterOptConfig2.enableFeedApiOpt);
        c09dl.LJIILLIIL("enable_room_enter_priority");
        c09dl.LJJJJJL(enterOptConfig2.enableRoomEnterHighPriority);
        c09dl.LJIILLIIL("enable_feed_api_priority");
        c09dl.LJJJJJL(enterOptConfig2.enableFeedApiHighPriority);
        c09dl.LJIILLIIL("enable_room_enter_cpu_boost");
        c09dl.LJJJJJL(enterOptConfig2.enableRoomEnterCpuBoost);
        c09dl.LJIILLIIL("room_enter_bind_big_core");
        c09dl.LJJJJJL(enterOptConfig2.roomEnterBindBigCore);
        c09dl.LJIILLIIL("room_enter_cpu_boost_timeout_ms");
        c09dl.LJJJJ(Integer.valueOf(enterOptConfig2.roomEnterCpuBoostTimeoutMs));
        c09dl.LJIILLIIL("room_enter_cpu_boost_debounce_ms");
        c09dl.LJJJJ(Integer.valueOf(enterOptConfig2.roomEnterCpuBoostDebounceMs));
        c09dl.LJII();
    }
}
