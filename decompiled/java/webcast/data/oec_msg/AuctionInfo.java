package webcast.data.oec_msg;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionInfo {

    @C09CT("auction_card_bottom_text_type")
    public int auctionCardBottomTextType;

    @C09CT("auction_card_title_text_type")
    public int auctionCardTitleTextType;

    @C09CT("auction_config_id")
    public long auctionConfigId;

    @C09CT("auction_event_type_int")
    public int auctionEventTypeInt;

    @C09CT("auction_id")
    public long auctionId;

    @C09CT("auction_knock_perform_bottom_right_text_type")
    public int auctionKnockPerformBottomRightTextType;

    @C09CT("auction_knock_perform_middle_text_type")
    public int auctionKnockPerformMiddleTextType;

    @C09CT("auction_status")
    public int auctionStatus;

    @C09CT("auction_text_type")
    public int auctionTextType;

    @C09CT("auction_text_type_int")
    public int auctionTextTypeInt;

    @C09CT("auction_type")
    public int auctionType;

    @C09CT("auction_winner")
    public UserInfo auctionWinner;

    @C09CT("bid_panel")
    public BidPanel bidPanel;

    @C09CT("carousel_cfg")
    public CarouselCfg carouselCfg;

    @C09CT("drawing_state_text_type")
    public int drawingStateTextType;

    @C09CT("drawing_state_text_type_int")
    public int drawingStateTextTypeInt;

    @C09CT("easter_egg")
    public EasterEgg easterEgg;

    @C09CT("end_time")
    public long endTime;

    @C09CT("extend_auction_cfg")
    public ExtendAuctionCfg extendAuctionCfg;

    @C09CT("is_carousel")
    public boolean isCarousel;

    @C09CT("next_bid_price")
    public PriceItem nextBidPrice;

    @C09CT("product_id")
    public long productId;

    @C09CT("reward_item")
    public ScrollElement rewardItem;

    @C09CT("start_time")
    public long startTime;

    @C09CT("surprise_set_remain_item_count")
    public int surpriseSetRemainItemCount;

    @C09CT("version_time")
    public long versionTime;

    @C09CT("winner_bid_price")
    public PriceItem winnerBidPrice;

    @C09CT("suffix")
    public String suffix = "";

    @C09CT("scroll_element_list")
    public List<ScrollElement> scrollElementList = new ArrayList();

    @C09CT("version_time_str")
    public String versionTimeStr = "";

    @C09CT("trace_time_map")
    public Map<String, String> traceTimeMap = new LinkedHashMap();

    @C09CT("auction_id_str")
    public String auctionIdStr = "";

    @C09CT("auction_config_id_str")
    public String auctionConfigIdStr = "";

    @C09CT("lynx_card_info")
    public String lynxCardInfo = "";
}
