package webcast.api.activity_advertising;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CardInfo {

    @C09CT("campaign_center_card_extra")
    public CampaignCenterCardExtra campaignCenterCardExtra;

    @C09CT("card_type")
    public int cardType;

    @C09CT("end_time")
    public long endTime;

    @C09CT("fest_card_extra")
    public FestCardExtra festCardExtra;

    @C09CT("image_content")
    public ImageContent imageContent;

    @C09CT("is_test")
    public boolean isTest;

    @C09CT("progress_info")
    public FeatureProgressInfo progressInfo;

    @C09CT("registration_card_extra")
    public RegistrationCardExtra registrationCardExtra;

    @C09CT("start_time")
    public long startTime;

    @C09CT("resource_id")
    public String resourceId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("image")
    public String image = "";

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("display_tags")
    public List<DisplayTag> displayTags = new ArrayList();

    @C09CT("activity_id_v2")
    public String activityIdV2 = "";

    @C09CT("button_text")
    public String buttonText = "";

    @C09CT("activity_name")
    public String activityName = "";

    @C09CT("video_content_list")
    public List<VideoContent> videoContentList = new ArrayList();

    @C09CT("pop_up_schema_url")
    public String popUpSchemaUrl = "";

    @C09CT("display_rewards")
    public List<DisplayReward> displayRewards = new ArrayList();
}
