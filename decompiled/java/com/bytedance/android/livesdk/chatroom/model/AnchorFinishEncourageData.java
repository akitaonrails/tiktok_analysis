package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class AnchorFinishEncourageData {

    @C09CT("achievement_info")
    public AchievementInfo achievementInfo;

    @C09CT("live_journey_info")
    public LiveJourneyInfo liveJourneyInfo;

    @C09CT("lop_info")
    public LopInfo lopInfo;

    @C09CT("show_anchor_finish_encourage_page")
    public boolean showAnchorFinishEncouragePage;

    public static final class AchievementInfo {

        @C09CT("achievement_type")
        public int achievementType;

        @C09CT("task_list")
        public List<Task> taskList = new ArrayList();

        @C09CT("title")
        public String title = "";

        @C09CT("value")
        public long value;
    }

    public static final class LiveJourneyInfo {

        @C09CT("task_list")
        public List<Task> taskList = new ArrayList();

        @C09CT("title")
        public String title = "";

        @C09CT("upgrade_level_info")
        public UpgradeLevelInfo upgradeLevelInfo;
    }

    public static final class LopInfo {

        @C09CT("task_list")
        public List<Task> taskList = new ArrayList();

        @C09CT("title")
        public String title = "";

        @C09CT("upgrade_level_info")
        public UpgradeLevelInfo upgradeLevelInfo;
    }

    public static final class Task {

        @C09CT("aggregated")
        public boolean aggregated;

        @C09CT("current_num")
        public long currentNum;

        @C09CT("reward_num")
        public long rewardNum;

        @C09CT("target_num")
        public long targetNum;

        @C09CT("task_id_str")
        public String taskIdStr = "";

        @C09CT("title")
        public String title = "";
    }

    public static final class UpgradeLevelInfo {

        @C09CT("current_level")
        public long currentLevel;

        @C09CT("last_level")
        public long lastLevel;

        @C09CT("title")
        public String title = "";

        @C09CT("level_image_text")
        public String levelImageText = "";
    }
}
