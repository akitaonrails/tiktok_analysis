package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public final class EcomRankInfo {

    @C09CT("anonymous")
    public long anonymous;

    @C09CT("can_show_rank")
    public boolean canShowRank;

    @C09CT("display_config")
    public DisplayConfig displayConfig;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("ranks")
    public List<Rank> ranks = new ArrayList();

    @C09CT("rule_url")
    public String ruleUrl = "";

    @C09CT("self_info")
    public Rank selfInfo;

    public static final class DisplayConfig {

        @C09CT("avatar_count")
        public long avatarCount;

        @C09CT("can_panel_click")
        public boolean canPanelClick;

        @C09CT("show_avatar_list")
        public boolean showAvatarList;

        @C09CT("show_online_panel")
        public boolean showOnlinePanel;

        @C09CT("show_score")
        public boolean showScore;
    }

    public static final class Rank {

        @C09CT("rank")
        public long rank;

        @C09CT("rank_user")
        public RankUser rankUser;

        @C09CT("score")
        public long score;

        @C09CT("user")
        public User user;

        @C09CT("user_restriction_level")
        public long userRestrictionLevel;

        @C09CT("gap_description")
        public String gapDescription = "";

        @C09CT("score_display")
        public String scoreDisplay = "";
    }
}
