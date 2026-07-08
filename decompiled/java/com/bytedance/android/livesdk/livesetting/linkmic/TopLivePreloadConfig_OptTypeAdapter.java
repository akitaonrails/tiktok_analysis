package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLivePreloadConfig_OptTypeAdapter extends TypeAdapter<TopLivePreloadConfig> {
    public final Gson LIZ;

    public TopLivePreloadConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TopLivePreloadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TopLivePreloadConfig topLivePreloadConfig = new TopLivePreloadConfig(false, false, false, false, 1800, false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, C1697810uHb.LJIIJJI("hangout_mg_agg_playlabel_dating", "hangout_mg_agg_playlabel_debating"), 0, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1772437190:
                        if (strLJJJJ.equals("enable_cache_top_module_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.enableCacheTopModuleData = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -999890795:
                        if (strLJJJJ.equals("top_module_preload_room_data_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.topModulePreloadRoomDataInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -781712488:
                        if (strLJJJJ.equals("top_module_cache_timeout_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.topModuleCacheTimeoutDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -626852666:
                        if (strLJJJJ.equals("enable_fetch_top_module_room_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.enableFetchTopModuleRoomData = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -170299830:
                        if (strLJJJJ.equals("enable_top_live_tech_track_event")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.enableTopLiveTechTrackEvent = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -86822535:
                        if (strLJJJJ.equals("feed_data_timeout_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.feedDataTimeoutThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -43671874:
                        if (strLJJJJ.equals("top_module_preload_module_name_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.topModulePreloadNameList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1490358591:
                        if (strLJJJJ.equals("enable_init_top_tab_from_setting_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.enableInitTopLiveTabFromSetting = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1651115945:
                        if (strLJJJJ.equals("enable_opt_toplive_ui_fluency")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.enableOptTopLiveUIFluency = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1839066792:
                        if (strLJJJJ.equals("enable_remove_live_end_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.enableRemoveLiveEndCard = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1979931776:
                        if (strLJJJJ.equals("enable_preload_hangout_tab")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreloadConfig.enablePreloadHangoutTab = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return topLivePreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLivePreloadConfig topLivePreloadConfig) throws IOException {
        TopLivePreloadConfig topLivePreloadConfig2 = topLivePreloadConfig;
        if (topLivePreloadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_init_top_tab_from_setting_config");
        c09dl.LJJJJJL(topLivePreloadConfig2.enableInitTopLiveTabFromSetting);
        c09dl.LJIILLIIL("enable_opt_toplive_ui_fluency");
        c09dl.LJJJJJL(topLivePreloadConfig2.enableOptTopLiveUIFluency);
        c09dl.LJIILLIIL("enable_preload_hangout_tab");
        c09dl.LJJJJJL(topLivePreloadConfig2.enablePreloadHangoutTab);
        c09dl.LJIILLIIL("enable_cache_top_module_data");
        c09dl.LJJJJJL(topLivePreloadConfig2.enableCacheTopModuleData);
        c09dl.LJIILLIIL("top_module_cache_timeout_duration");
        c09dl.LJJJJ(Integer.valueOf(topLivePreloadConfig2.topModuleCacheTimeoutDuration));
        c09dl.LJIILLIIL("enable_fetch_top_module_room_data");
        c09dl.LJJJJJL(topLivePreloadConfig2.enableFetchTopModuleRoomData);
        c09dl.LJIILLIIL("top_module_preload_room_data_interval");
        c09dl.LJJJJ(Integer.valueOf(topLivePreloadConfig2.topModulePreloadRoomDataInterval));
        c09dl.LJIILLIIL("top_module_preload_module_name_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, topLivePreloadConfig2.topModulePreloadNameList, String.class);
        c09dl.LJIILLIIL("feed_data_timeout_threshold");
        c09dl.LJJJJ(Integer.valueOf(topLivePreloadConfig2.feedDataTimeoutThreshold));
        c09dl.LJIILLIIL("enable_remove_live_end_card");
        c09dl.LJJJJJL(topLivePreloadConfig2.enableRemoveLiveEndCard);
        c09dl.LJIILLIIL("enable_top_live_tech_track_event");
        c09dl.LJJJJJL(topLivePreloadConfig2.enableTopLiveTechTrackEvent);
        c09dl.LJII();
    }
}
