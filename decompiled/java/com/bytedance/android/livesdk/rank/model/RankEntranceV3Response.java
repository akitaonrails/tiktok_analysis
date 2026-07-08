package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.UnionAnimationInfo;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class RankEntranceV3Response {

    @C09CT("data")
    public List<EntranceGroup> entranceGroups;

    public static final class EntranceGroup {

        @C09CT("animation_loop_for_off")
        public boolean animationLoopForOff;

        @C09CT("data")
        public Data data;

        @C09CT("group_type")
        public int groupType;

        @C09CT("is_animation_loop_play")
        public boolean loop;

        @C09CT("Priority")
        public long priority;

        @C09CT("union_animation")
        public UnionAnimationInfo unionAnimation;

        public static final class Data {

            @C09CT("entrances")
            public List<RankEntrance> entrances;

            @C09CT("tabs")
            public List<RankTabInfo> tabs;
        }
    }
}
