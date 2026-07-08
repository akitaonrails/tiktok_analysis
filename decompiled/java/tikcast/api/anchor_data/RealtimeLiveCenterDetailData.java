package tikcast.api.anchor_data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorReminderWordInfo;
import webcast.data.ColdStartStatData;
import webcast.data.DiamondDetail;
import webcast.data.RealtimeFlashCard;
import webcast.data.RealtimeLLM;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterLopInfo;
import webcast.data.RealtimeLiveCenterShopData;
import webcast.data.RealtimeLiveCenterTips;
import webcast.data.RealtimeViolationRecord;
import webcast.data.WhiteBoxData;

/* JADX INFO: loaded from: classes34.dex */
public final class RealtimeLiveCenterDetailData {

    @C09CT("anchor_grow_level_info")
    public LiveCenterDetailAnchorGrowLevelInfo anchorGrowLevelInfo;

    @C09CT("base_info")
    public RealtimeLiveCenterBaseData baseInfo;

    @C09CT("cold_start_stat_data")
    public ColdStartStatData coldStartStatData;

    @C09CT("flash_card")
    public RealtimeFlashCard flashCard;

    @C09CT("hide_overview_diamond")
    public boolean hideOverviewDiamond;

    @C09CT("host_first_gift_info")
    public HostFirstGiftInfo hostFirstGiftInfo;

    @C09CT("live_journey_info")
    public RealtimeLiveCenterLiveJourneyInfo liveJourneyInfo;

    @C09CT("llm")
    public RealtimeLLM llm;

    @C09CT("lop_info")
    public RealtimeLiveCenterLopInfo lopInfo;

    @C09CT("playbook")
    public Playbook playbook;

    @C09CT("reminder_word_info")
    public AnchorReminderWordInfo reminderWordInfo;

    @C09CT("shop_info")
    public RealtimeLiveCenterShopData shopInfo;

    @C09CT("tips_info")
    public RealtimeLiveCenterTips tipsInfo;

    @C09CT("traffic_tool_info")
    public RealtimeLiveCenterTrafficToolInfo trafficToolInfo;

    @C09CT("violation_record_info")
    public RealtimeLiveCenterViolationRecordInfo violationRecordInfo;

    @C09CT("white_box_data")
    public WhiteBoxData whiteBoxData;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("violation_records")
    public List<RealtimeViolationRecord> violationRecords = new ArrayList();

    @C09CT("diamond_detail")
    public List<DiamondDetail> diamondDetail = new ArrayList();

    @C09CT("web_instructions")
    public String webInstructions = "";
}
