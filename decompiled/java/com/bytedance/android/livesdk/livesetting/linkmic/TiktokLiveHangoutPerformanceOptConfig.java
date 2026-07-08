package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class TiktokLiveHangoutPerformanceOptConfig {
    public static final TypeAdapter ADAPTER = new TiktokLiveHangoutPerformanceOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("dispatch_opt")
    public boolean dispatchOpt;

    @C09CT("enable")
    public boolean enable;

    @C09CT("hangout_fragment_v2_async_inflate_opt")
    public boolean hangoutFragmentV2AsyncInflateOpt;

    @C09CT("hangout_fragment_v2_staged_assemble_opt")
    public boolean hangoutFragmentV2StagedAssembleOpt;

    @C09CT("hangout_fragment_v2_x2c_inflate_opt")
    public boolean hangoutFragmentV2X2cInflateOpt;

    @C09CT("hot_path_log_reduce_opt")
    public boolean hotPathLogReduceOpt;

    @C09CT("interact_module_recycler_view_reuse_opt")
    public boolean interactModuleRecyclerViewReuseOpt;

    @C09CT("play_card_feed_cell_width_animator_opt")
    public boolean playCardFeedCellWidthAnimatorOpt;

    @C09CT("play_feed_lazy_center_loading_opt")
    public boolean playFeedLazyCenterLoadingOpt;

    @C09CT("play_feed_scroll_dedup_opt")
    public boolean playFeedScrollDedupOpt;

    @C09CT("random_match_enter_room_opt")
    public boolean randomMatchEnterRoomOpt;

    @C09CT("room_feed_fragment_async_commit_opt")
    public boolean roomFeedFragmentAsyncCommitOpt;

    @C09CT("room_feed_layout_change_throttle_opt")
    public boolean roomFeedLayoutChangeThrottleOpt;

    public TiktokLiveHangoutPerformanceOptConfig() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public TiktokLiveHangoutPerformanceOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.enable = z;
        this.interactModuleRecyclerViewReuseOpt = z2;
        this.hangoutFragmentV2AsyncInflateOpt = z3;
        this.hangoutFragmentV2StagedAssembleOpt = z4;
        this.playCardFeedCellWidthAnimatorOpt = z5;
        this.hangoutFragmentV2X2cInflateOpt = z6;
        this.roomFeedLayoutChangeThrottleOpt = z7;
        this.roomFeedFragmentAsyncCommitOpt = z8;
        this.playFeedScrollDedupOpt = z9;
        this.playFeedLazyCenterLoadingOpt = z10;
        this.hotPathLogReduceOpt = z11;
        this.dispatchOpt = z12;
        this.randomMatchEnterRoomOpt = z13;
    }
}
