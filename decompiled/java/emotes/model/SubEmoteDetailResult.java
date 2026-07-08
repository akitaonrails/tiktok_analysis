package emotes.model;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.livesdk.chatroom.api.PrivateEmoteDetail;
import com.bytedance.android.livesdk.chatroom.api.RedDot;
import com.bytedance.android.livesdk.chatroom.api.SubExtra;
import com.bytedance.android.livesdk.chatroom.api.SubPackageEmote;
import com.bytedance.android.livesdk.chatroom.api.SubWaveCustomEmote;
import com.bytedance.android.livesdk.subscribe.model.ExtraStickerRewardPopup;
import com.bytedance.android.livesdk.subscribe.model.FansEmote;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SubEmoteDetailResult {

    @C09CT("current_emote_detail")
    public EmoteListResult currentEmoteDetail;

    @C09CT("current_status")
    public int currentState;

    @C09CT("emote_config")
    public EmoteConfig emoteConfig;

    @C09CT("emotes_show_style")
    public int emotesShowStyle;

    @C09CT("extra")
    public SubExtra extra;

    @C09CT("extra_sticker_reward_popup")
    public ExtraStickerRewardPopup extraStickerRewardPopup;

    @C09CT("fans_emote_detail")
    public FansEmote fansEmoteDetail;

    @C09CT("highest_sub_wave_strike_custom_emote")
    public EmoteListResult highestSubWaveStrikeCustomEmote;

    @C09CT("package_emote_list")
    public List<SubPackageEmote> packageEmoteList;

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

    @C09CT("super_fan_emote_detail")
    public FansEmote superFanEmoteDetail;

    public EmoteListResult getCurrentEmoteDetail() {
        return this.currentEmoteDetail;
    }

    public int getCurrentState() {
        return this.currentState;
    }

    public EmoteConfig getEmoteConfig() {
        return this.emoteConfig;
    }

    public EmoteListResult getStableEmoteDetail() {
        return this.stableEmoteDetail;
    }

    public void setCurrentEmoteDetail(EmoteListResult emoteListResult) {
        this.currentEmoteDetail = emoteListResult;
    }

    public void setCurrentState(int i) {
        this.currentState = i;
    }

    public void setEmoteConfig(EmoteConfig emoteConfig) {
        this.emoteConfig = emoteConfig;
    }

    public void setStableEmoteDetail(EmoteListResult emoteListResult) {
        this.stableEmoteDetail = emoteListResult;
    }
}
