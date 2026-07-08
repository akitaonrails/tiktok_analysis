package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes13.dex */
public final class SMBSetupInfoResponse {

    @C09CT("data")
    public ResponseData data;

    /* JADX INFO: loaded from: classes28.dex */
    public static final class ResponseData {
        public boolean LIZ;

        @C09CT("campaign_reward_boost")
        public long campaignRewardBoost;

        @C09CT("industry_type")
        public int industryType;

        @C09CT("is_campaign_relevant")
        public boolean isCampaignRelevant;

        @C09CT("is_target_creator")
        public boolean isTargetCreator;

        @C09CT("setup_data")
        public SetupData setupData;

        @C09CT("setup_state")
        public int setupState;

        @C09CT("smb_has_leads_dm_enabled")
        public boolean smbHasLeadsDmEnabled;

        public static final class SetupData {

            @C09CT("is_service_plus_active")
            public boolean isServicePlusActive;

            @C09CT("op_task_reward")
            public OperationsTaskReward opTaskReward;

            @C09CT("opt_in_eligibility")
            public int optInEligibility;

            @C09CT("playbook_section")
            public PlaybookSection playbookSection;

            @C09CT(Scene.SCENE_SERVICE)
            public int scene;

            @C09CT("task_info")
            public CreatorTaskInfo taskInfo;

            @C09CT("secondary_page_sections")
            public List<SecondaryPageSection> secondaryPageSections = new ArrayList();

            @C09CT("qualification_info")
            public List<SMBOptInQualificationInfo> qualificationInfo = new ArrayList();

            public static final class CreatorTaskInfo {

                @C09CT("header")
                public String header = "";

                @C09CT("subtasks")
                public List<Subtask> subtasks = new ArrayList();

                public static final class Subtask {

                    @C09CT("challenge_type")
                    public int challengeType;

                    @C09CT("task_icon")
                    public ImageModel taskIcon;

                    @C09CT("task_icon_dark")
                    public ImageModel taskIconDark;

                    @C09CT("task_progress_current")
                    public long taskProgressCurrent;

                    @C09CT("task_progress_max")
                    public long taskProgressMax;

                    @C09CT("task_type")
                    public int taskType;

                    @C09CT("task_description")
                    public String taskDescription = "";

                    @C09CT("task_progress")
                    public String taskProgress = "";

                    @C09CT("task_title")
                    public String taskTitle = "";

                    @C09CT("challenge_id")
                    public String challengeId = "";
                }
            }

            public static final class OperationsTaskReward {

                @C09CT("traffic_card_icon")
                public ImageModel trafficCardIcon;

                @C09CT("traffic_card_description")
                public String trafficCardDescription = "";

                @C09CT("traffic_card_link_text")
                public String trafficCardLinkText = "";

                @C09CT("campaign_page_link")
                public String campaignPageLink = "";

                @C09CT("traffic_card_icon_text")
                public String trafficCardIconText = "";

                @C09CT("traffic_card_link_type")
                public String trafficCardLinkType = "";

                @C09CT("challenge_status")
                public String challengeStatus = "";
            }

            public static final class PlaybookSection {

                @C09CT("section_header")
                public String sectionHeader = "";

                @C09CT("playbook_list")
                public List<Playbook> playbookList = new ArrayList();
            }

            public static final class SecondaryPageSection {

                @C09CT("section_header")
                public String sectionHeader = "";

                @C09CT("pages")
                public List<SecondaryPage> pages = new ArrayList();

                public static final class SecondaryPage {

                    @C09CT("page_icon_dark_link")
                    public ImageModel pageIconDarkLink;

                    @C09CT("page_icon_link")
                    public ImageModel pageIconLink;

                    @C09CT("page_task_number")
                    public long pageTaskNumber;

                    @C09CT("page_header")
                    public String pageHeader = "";

                    @C09CT("page_description")
                    public String pageDescription = "";

                    @C09CT("page_schema_link")
                    public String pageSchemaLink = "";

                    @C09CT("page_module_name")
                    public String pageModuleName = "";

                    @C09CT("page_feature_name")
                    public String pageFeatureName = "";
                }
            }
        }
    }
}
