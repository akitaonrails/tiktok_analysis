package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes.dex */
public final class MultiMatchPrepareResponse {

    @C09CT("abtest_setting")
    public Map<Long, BattleABTestList> abTestSettings;

    @C09CT("anchor_gift_mode_map_by_type")
    public Map<Integer, AnchorGiftModeMap> anchorGiftModeMapByType;

    @C09CT("anchors_permission")
    public Map<Long, Integer> anchorsPermission;

    @C09CT("available_match_options")
    public Map<Long, MatchGameplayPermission> availableMatchOptions;

    @C09CT("best_teammate_id")
    public long bestTeammateId;

    @C09CT("gift_event_desc")
    public Text giftEventDesc;

    @C09CT("gift_mode")
    public List<GiftMode> giftMode;

    @C09CT("league_info_map")
    public Map<Long, GiftGalleryBadgeInfo> leagueInfoMap;

    @C09CT("match_playbooks")
    public List<Playbook> matchPlaybooks;

    @C09CT("match_settings_info")
    public MatchSettingsInfo matchSettingsInfo;

    @C09CT("punish_end_timestamp")
    public long punishEndTimestamp;

    @C09CT("punished_anchor")
    public long punishedAnchor;

    @C09CT("recommend_teammate")
    public Long recommendTeamMate;

    @C09CT("rule_guide_url")
    public String ruleGuideUrl;

    public static final class MatchGameplayPermission {

        @C09CT("block_message")
        public String blockMessage = "";

        @C09CT("block_reason")
        public int blockReason;
    }

    public MultiMatchPrepareResponse() {
        this(null, null, null);
    }

    public MultiMatchPrepareResponse(Long l, Map<Long, Integer> map, Map<Long, BattleABTestList> map2) {
        this.recommendTeamMate = l;
        this.anchorsPermission = map;
        this.abTestSettings = map2;
        this.giftMode = C13BV.INSTANCE;
        this.ruleGuideUrl = "";
        this.leagueInfoMap = new LinkedHashMap();
        this.availableMatchOptions = new LinkedHashMap();
        this.matchPlaybooks = new ArrayList();
        this.anchorGiftModeMapByType = new LinkedHashMap();
    }
}
