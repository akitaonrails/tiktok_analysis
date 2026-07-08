package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RankUpdateMessage extends AbstractC1136060ffY {

    @C09CT("animation_loop_for_off")
    public boolean animationLoopForOff;
    public int groupType;

    @C09CT("is_animation_loop_play")
    public boolean loop;
    public int opType;
    public long rankPriority;

    @C09CT("tab_info")
    public List<RankListTabInfo> tabInfo;
    public List<RankTabInfo> tabs;

    @C09CT("union_animation")
    public List<UnionAnimationInfo> unionAnimation;
    public List<RankUpdate> updates;

    @C09CT("valid_ranks")
    public ValidRanks validRanks;

    public static final class ValidRanks {

        @C09CT("is_effect")
        public boolean isEffect;

        @C09CT("rank_types")
        public List<Integer> rankTypes = new ArrayList();
    }

    public RankUpdateMessage() {
        this.type = C001A.RANK_UPDATE_MESSAGE;
        this.unionAnimation = new ArrayList();
        this.tabInfo = new ArrayList();
    }
}
