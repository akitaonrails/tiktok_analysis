package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetCustomLoadOptConfig_OptTypeAdapter extends TypeAdapter<WidgetCustomLoadOptConfig> {
    public final Gson LIZ;

    public WidgetCustomLoadOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final WidgetCustomLoadOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = new WidgetCustomLoadOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1891589533:
                        if (strLJJJJ.equals("p2_end_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.p2EndExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1724904787:
                        if (strLJJJJ.equals("preload_match_anchor_resource_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.preloadMatchAnchorResourceExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1424873800:
                        if (strLJJJJ.equals("game_on_interact_show_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.gameOnInteractShowExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1399917715:
                        if (strLJJJJ.equals("pre_create_player_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.preCreatePlayerExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1185885130:
                        if (strLJJJJ.equals("init_widget_log_data_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.initWidgetLogDataExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1057512383:
                        if (strLJJJJ.equals("loading_view_opt_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.loadingViewExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -662473642:
                        if (strLJJJJ.equals("star_comment_logic_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.starCommentLogicExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -493042706:
                        if (strLJJJJ.equals("like_views_init_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.likeViewsInitExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 240446373:
                        if (strLJJJJ.equals("enable_screen_shot_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.enableScreenShotOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 998522414:
                        if (strLJJJJ.equals("phase_load_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.phaseLoadDelay = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1112953649:
                        if (strLJJJJ.equals("show_slide_guide_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.showSlideGuideExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1625696827:
                        if (strLJJJJ.equals("orientation_switch_visible_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.orientationSwitchVisibleExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1721008857:
                        if (strLJJJJ.equals("first_phase_load_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.firstPhaseLoadStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1968994427:
                        if (strLJJJJ.equals("p1_init_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.p1InitDataExecutePhaseIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2128799860:
                        if (strLJJJJ.equals("enter_interaction_room_execute_phase_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetCustomLoadOptConfig.enterInteractionRoomExecutePhaseIndex = c09cu.LJJIZ();
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
        return widgetCustomLoadOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetCustomLoadOptConfig widgetCustomLoadOptConfig) throws IOException {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig2 = widgetCustomLoadOptConfig;
        if (widgetCustomLoadOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(widgetCustomLoadOptConfig2.enable);
        c09dl.LJIILLIIL("phase_load_delay");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.phaseLoadDelay));
        c09dl.LJIILLIIL("show_slide_guide_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.showSlideGuideExecutePhaseIndex));
        c09dl.LJIILLIIL("preload_match_anchor_resource_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.preloadMatchAnchorResourceExecutePhaseIndex));
        c09dl.LJIILLIIL("orientation_switch_visible_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.orientationSwitchVisibleExecutePhaseIndex));
        c09dl.LJIILLIIL("pre_create_player_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.preCreatePlayerExecutePhaseIndex));
        c09dl.LJIILLIIL("init_widget_log_data_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.initWidgetLogDataExecutePhaseIndex));
        c09dl.LJIILLIIL("p1_init_data");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.p1InitDataExecutePhaseIndex));
        c09dl.LJIILLIIL("enter_interaction_room_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.enterInteractionRoomExecutePhaseIndex));
        c09dl.LJIILLIIL("game_on_interact_show_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.gameOnInteractShowExecutePhaseIndex));
        c09dl.LJIILLIIL("p2_end_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.p2EndExecutePhaseIndex));
        c09dl.LJIILLIIL("enable_screen_shot_opt");
        c09dl.LJJJJJL(widgetCustomLoadOptConfig2.enableScreenShotOpt);
        c09dl.LJIILLIIL("first_phase_load_strategy");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.firstPhaseLoadStrategy));
        c09dl.LJIILLIIL("loading_view_opt_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.loadingViewExecutePhaseIndex));
        c09dl.LJIILLIIL("like_views_init_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.likeViewsInitExecutePhaseIndex));
        c09dl.LJIILLIIL("star_comment_logic_execute_phase_index");
        c09dl.LJJJJ(Integer.valueOf(widgetCustomLoadOptConfig2.starCommentLogicExecutePhaseIndex));
        c09dl.LJII();
    }
}
