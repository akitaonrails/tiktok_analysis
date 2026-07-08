package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetCustomLoadOptConfig {
    public static final TypeAdapter ADAPTER = new WidgetCustomLoadOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_screen_shot_opt")
    public boolean enableScreenShotOpt;

    @C09CT("first_phase_load_strategy")
    public int firstPhaseLoadStrategy;

    @C09CT("phase_load_delay")
    public int phaseLoadDelay = 5000;

    @C09CT("show_slide_guide_execute_phase_index")
    public int showSlideGuideExecutePhaseIndex = -1;

    @C09CT("preload_match_anchor_resource_execute_phase_index")
    public int preloadMatchAnchorResourceExecutePhaseIndex = -1;

    @C09CT("orientation_switch_visible_execute_phase_index")
    public int orientationSwitchVisibleExecutePhaseIndex = -1;

    @C09CT("pre_create_player_execute_phase_index")
    public int preCreatePlayerExecutePhaseIndex = 1;

    @C09CT("init_widget_log_data_execute_phase_index")
    public int initWidgetLogDataExecutePhaseIndex = -1;

    @C09CT("p1_init_data")
    public int p1InitDataExecutePhaseIndex = -1;

    @C09CT("enter_interaction_room_execute_phase_index")
    public int enterInteractionRoomExecutePhaseIndex = -1;

    @C09CT("game_on_interact_show_execute_phase_index")
    public int gameOnInteractShowExecutePhaseIndex = -1;

    @C09CT("p2_end_execute_phase_index")
    public int p2EndExecutePhaseIndex = -1;

    @C09CT("loading_view_opt_execute_phase_index")
    public int loadingViewExecutePhaseIndex = -1;

    @C09CT("like_views_init_execute_phase_index")
    public int likeViewsInitExecutePhaseIndex = -1;

    @C09CT("star_comment_logic_execute_phase_index")
    public int starCommentLogicExecutePhaseIndex = -1;
}
