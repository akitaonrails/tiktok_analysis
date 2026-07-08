package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.livesdk.chatroom.api.PrivateEmoteDetail;
import com.bytedance.android.livesdk.chatroom.api.RedDot;
import com.bytedance.android.livesdk.chatroom.api.SubPackageEmote;
import com.bytedance.android.livesdk.chatroom.api.SubWaveCustomEmote;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCGetSubEmoteDetailResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("current_emote_detail")
        public EmoteListResult currentEmoteDetail;

        @C09CT("current_status")
        public int currentStatus;

        @C09CT("emote_config")
        public EmoteConfig emoteConfig;

        @C09CT("emotes_show_style")
        public int emotesShowStyle;

        @C09CT("extra_sticker_reward_popup")
        public PGCExtraStickerRewardPopup extraStickerRewardPopup;

        @C09CT("highest_sub_wave_strike_custom_emote")
        public EmoteListResult highestSubWaveStrikeCustomEmote;

        @C09CT("package_emote_list")
        public List<SubPackageEmote> packageEmoteList = new ArrayList();

        @C09CT("private_emote_detail")
        public PrivateEmoteDetail privateEmoteDetail;

        @C09CT("red_dot")
        public RedDot redDot;

        @C09CT("stable_emote_detail")
        public EmoteListResult stableEmoteDetail;

        @C09CT("sub_wave_custom_emote")
        public SubWaveCustomEmote subWaveCustomEmote;

        @C09CT("suggest_emotes_switch")
        public int suggestEmotesSwitch;

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
