package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class EnterRoomClickPerfOptConfig_OptTypeAdapter extends TypeAdapter<EnterRoomClickPerfOptConfig> {
    public final Gson LIZ;

    public EnterRoomClickPerfOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final EnterRoomClickPerfOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EnterRoomClickPerfOptConfig enterRoomClickPerfOptConfig = new EnterRoomClickPerfOptConfig(false, false, false, 1000L, false, false, false, false, false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2092167856:
                        if (strLJJJJ.equals("opt_reddot_manager_init_defer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptRedDotManagerInitDefer(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1936190398:
                        if (strLJJJJ.equals("opt_aab_check_on_enter_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptAabCheckOnEnterRoom(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1338003772:
                        if (strLJJJJ.equals("opt_live_room_ad_logger_lazy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptLiveRoomAdLoggerLazy(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -263550564:
                        if (strLJJJJ.equals("opt_stream_strategy_init_defer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptStreamStrategyInitDefer(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 11541401:
                        if (strLJJJJ.equals("opt_message_manager_init_defer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptMessageManagerInitDefer(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 252219041:
                        if (strLJJJJ.equals("opt_thread_priority_boost_watch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptThreadPriorityBoostWatch(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 473043409:
                        if (strLJJJJ.equals("opt_preload_audience_toolbar_lazy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptPreloadAudienceToolbarLazy(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1437108060:
                        if (strLJJJJ.equals("opt_user_attr_request_defer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptUserAttrRequestDefer(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1670014320:
                        if (strLJJJJ.equals("feed_load_more_delay_expired_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setFeedLoadMoreDelayExpiredTimeMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1676701165:
                        if (strLJJJJ.equals("opt_feed_loadmore_preload_defer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptFeedLoadMorePreloadDefer(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1811308534:
                        if (strLJJJJ.equals("opt_skip_gaussian_blur_background")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setOptSkipGaussianBlurBackground(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2078018317:
                        if (strLJJJJ.equals("xml_preload_dialog_live_drawer_feed_v3_draw_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomClickPerfOptConfig.setXmlPreloadDialogLiveDrawerFeedV3DrawOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return enterRoomClickPerfOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnterRoomClickPerfOptConfig enterRoomClickPerfOptConfig) throws IOException {
        EnterRoomClickPerfOptConfig enterRoomClickPerfOptConfig2 = enterRoomClickPerfOptConfig;
        if (enterRoomClickPerfOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getEnable());
        c09dl.LJIILLIIL("opt_preload_audience_toolbar_lazy");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptPreloadAudienceToolbarLazy());
        c09dl.LJIILLIIL("opt_feed_loadmore_preload_defer");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptFeedLoadMorePreloadDefer());
        c09dl.LJIILLIIL("feed_load_more_delay_expired_time_ms");
        c09dl.LJJIZ(enterRoomClickPerfOptConfig2.getFeedLoadMoreDelayExpiredTimeMs());
        c09dl.LJIILLIIL("opt_stream_strategy_init_defer");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptStreamStrategyInitDefer());
        c09dl.LJIILLIIL("opt_reddot_manager_init_defer");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptRedDotManagerInitDefer());
        c09dl.LJIILLIIL("opt_skip_gaussian_blur_background");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptSkipGaussianBlurBackground());
        c09dl.LJIILLIIL("opt_live_room_ad_logger_lazy");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptLiveRoomAdLoggerLazy());
        c09dl.LJIILLIIL("opt_message_manager_init_defer");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptMessageManagerInitDefer());
        c09dl.LJIILLIIL("opt_user_attr_request_defer");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptUserAttrRequestDefer());
        c09dl.LJIILLIIL("opt_thread_priority_boost_watch");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptThreadPriorityBoostWatch());
        c09dl.LJIILLIIL("opt_aab_check_on_enter_room");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getOptAabCheckOnEnterRoom());
        c09dl.LJIILLIIL("xml_preload_dialog_live_drawer_feed_v3_draw_opt");
        c09dl.LJJJJJL(enterRoomClickPerfOptConfig2.getXmlPreloadDialogLiveDrawerFeedV3DrawOpt());
        c09dl.LJII();
    }
}
