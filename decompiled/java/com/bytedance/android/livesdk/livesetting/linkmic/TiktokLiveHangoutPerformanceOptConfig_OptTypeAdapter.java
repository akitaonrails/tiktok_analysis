package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class TiktokLiveHangoutPerformanceOptConfig_OptTypeAdapter extends TypeAdapter<TiktokLiveHangoutPerformanceOptConfig> {
    public final Gson LIZ;

    public TiktokLiveHangoutPerformanceOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TiktokLiveHangoutPerformanceOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TiktokLiveHangoutPerformanceOptConfig tiktokLiveHangoutPerformanceOptConfig = new TiktokLiveHangoutPerformanceOptConfig(false, false, false, false, false, false, false, false, false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1315220114:
                        if (strLJJJJ.equals("dispatch_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.dispatchOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -755131884:
                        if (strLJJJJ.equals("play_card_feed_cell_width_animator_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.playCardFeedCellWidthAnimatorOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -450318495:
                        if (strLJJJJ.equals("hangout_fragment_v2_async_inflate_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.hangoutFragmentV2AsyncInflateOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -432012131:
                        if (strLJJJJ.equals("hot_path_log_reduce_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.hotPathLogReduceOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -271110002:
                        if (strLJJJJ.equals("hangout_fragment_v2_x2c_inflate_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.hangoutFragmentV2X2cInflateOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -96082292:
                        if (strLJJJJ.equals("random_match_enter_room_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.randomMatchEnterRoomOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -12144747:
                        if (strLJJJJ.equals("room_feed_layout_change_throttle_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.roomFeedLayoutChangeThrottleOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 268006368:
                        if (strLJJJJ.equals("room_feed_fragment_async_commit_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.roomFeedFragmentAsyncCommitOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 929003643:
                        if (strLJJJJ.equals("play_feed_lazy_center_loading_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.playFeedLazyCenterLoadingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1404414760:
                        if (strLJJJJ.equals("hangout_fragment_v2_staged_assemble_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.hangoutFragmentV2StagedAssembleOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1723881380:
                        if (strLJJJJ.equals("interact_module_recycler_view_reuse_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.interactModuleRecyclerViewReuseOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2051619734:
                        if (strLJJJJ.equals("play_feed_scroll_dedup_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tiktokLiveHangoutPerformanceOptConfig.playFeedScrollDedupOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return tiktokLiveHangoutPerformanceOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TiktokLiveHangoutPerformanceOptConfig tiktokLiveHangoutPerformanceOptConfig) throws IOException {
        TiktokLiveHangoutPerformanceOptConfig tiktokLiveHangoutPerformanceOptConfig2 = tiktokLiveHangoutPerformanceOptConfig;
        if (tiktokLiveHangoutPerformanceOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.enable);
        c09dl.LJIILLIIL("interact_module_recycler_view_reuse_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.interactModuleRecyclerViewReuseOpt);
        c09dl.LJIILLIIL("hangout_fragment_v2_async_inflate_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.hangoutFragmentV2AsyncInflateOpt);
        c09dl.LJIILLIIL("hangout_fragment_v2_staged_assemble_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.hangoutFragmentV2StagedAssembleOpt);
        c09dl.LJIILLIIL("play_card_feed_cell_width_animator_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.playCardFeedCellWidthAnimatorOpt);
        c09dl.LJIILLIIL("hangout_fragment_v2_x2c_inflate_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.hangoutFragmentV2X2cInflateOpt);
        c09dl.LJIILLIIL("room_feed_layout_change_throttle_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.roomFeedLayoutChangeThrottleOpt);
        c09dl.LJIILLIIL("room_feed_fragment_async_commit_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.roomFeedFragmentAsyncCommitOpt);
        c09dl.LJIILLIIL("play_feed_scroll_dedup_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.playFeedScrollDedupOpt);
        c09dl.LJIILLIIL("play_feed_lazy_center_loading_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.playFeedLazyCenterLoadingOpt);
        c09dl.LJIILLIIL("hot_path_log_reduce_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.hotPathLogReduceOpt);
        c09dl.LJIILLIIL("dispatch_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.dispatchOpt);
        c09dl.LJIILLIIL("random_match_enter_room_opt");
        c09dl.LJJJJJL(tiktokLiveHangoutPerformanceOptConfig2.randomMatchEnterRoomOpt);
        c09dl.LJII();
    }
}
