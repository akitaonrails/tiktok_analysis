package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorCertificationDetailPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("certification_type")
        public int certificationType;

        @C09CT("current_level")
        public int currentLevel;

        @C09CT("feedback")
        public Feedback feedback;

        @C09CT("ongoing_apply_record")
        public CertificationRecord ongoingApplyRecord;

        @C09CT("primary_show_level")
        public int primaryShowLevel;

        @C09CT("task_history")
        public TaskHistory taskHistory;

        @C09CT("pages")
        public List<DetailPage> pages = new ArrayList();

        @C09CT("rule_config")
        public Map<Long, CertificationRuleConfig> ruleConfig = new LinkedHashMap();
    }

    public static final class DetailPage {

        @C09CT("certification_days")
        public long certificationDays;

        @C09CT("certification_privileges")
        public List<CertificationPrivilege> certificationPrivileges = new ArrayList();

        @C09CT("feed_back")
        public Feedback feedBack;

        @C09CT("level")
        public int level;

        @C09CT("meet_requirement")
        public boolean meetRequirement;

        @C09CT("requirement")
        public CertificationRequirement requirement;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("tab")
        public Tab tab;

        @C09CT("task_module")
        public TaskModule taskModule;
    }

    public static final class Feedback {

        @C09CT("level_change_certification_record")
        public CertificationRecord levelChangeCertificationRecord;

        @C09CT(Scene.SCENE_SERVICE)
        public int scene;

        @C09CT("tips")
        public Text tips;

        @C09CT("task_infos")
        public List<CertificationTaskInfo> taskInfos = new ArrayList();

        @C09CT("requirement_detail_schema")
        public String requirementDetailSchema = "";
    }

    public static final class Tab {

        @C09CT("description")
        public Text description;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("title")
        public Text title;
    }

    public static final class TaskHistory {

        @C09CT("task_groups")
        public List<TaskGroup> taskGroups = new ArrayList();

        public static final class TaskGroup {

            @C09CT("end_timestamp")
            public long endTimestamp;

            @C09CT("level")
            public int level;

            @C09CT("start_timestamp")
            public long startTimestamp;

            @C09CT("task_infos")
            public List<CertificationTaskInfo> taskInfos = new ArrayList();
        }
    }

    public static final class TaskModule {

        @C09CT("hide_task_module")
        public boolean hideTaskModule;

        @C09CT("info")
        public List<CertificationTaskInfo> info = new ArrayList();

        @C09CT("remind")
        public TaskRemind remind;

        @C09CT("task_description")
        public Text taskDescription;

        @C09CT("task_title")
        public Text taskTitle;

        public static final class TaskRemind {

            @C09CT("warn")
            public boolean warn;
        }
    }
}
