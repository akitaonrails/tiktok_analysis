package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGoLivePageContainer {

    @C09CT("go_live_page_style")
    public int goLivePageStyle;

    @C09CT("live_goal_style")
    public int liveGoalStyle;

    @C09CT("secondary_banner")
    public SecondaryBannerComponent secondaryBanner;

    @C09CT("special_mode_type")
    public int specialModeType;

    @C09CT("top_right_banner_container")
    public TopRightBannerContainerComponent topRightBannerContainer;

    @C09CT("top_right_container")
    public List<TopRightContainerComponent> topRightContainer = new ArrayList();

    @C09CT("bottom_container")
    public List<BottomContainerComponent> bottomContainer = new ArrayList();

    @C09CT("top_right_banner_container_priority")
    public Map<String, String> topRightBannerContainerPriority = new LinkedHashMap();

    @C09CT("item_type_name")
    public Map<String, String> itemTypeName = new LinkedHashMap();

    @C09CT("banner_type_name")
    public Map<String, String> bannerTypeName = new LinkedHashMap();

    @C09CT("clean_up_frequency_key")
    public List<String> cleanUpFrequencyKey = new ArrayList();

    @C09CT("above_go_live_button_container")
    public List<AboveGoLiveButtonComponent> aboveGoLiveButtonContainer = new ArrayList();
}
