package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorHolidayResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT(LiveCenterMockToolSwitch.LIVEJOURNEY)
        public LiveJourneyModule liveJourney;

        @C09CT("play_book")
        public PlayBookModule playBook;

        @C09CT("video")
        public VideoModule video;

        @C09CT("title")
        public String title = "";

        @C09CT("sub_title")
        public String subTitle = "";

        @C09CT("bg_image")
        public String bgImage = "";

        @C09CT("bg_color")
        public String bgColor = "";

        @C09CT("title_color")
        public String titleColor = "";

        @C09CT("module_title_color")
        public String moduleTitleColor = "";

        @C09CT("module_sub_title_color")
        public String moduleSubTitleColor = "";

        @C09CT("title_starling_key")
        public String titleStarlingKey = "";

        @C09CT("ui_ab_param")
        public String uiAbParam = "";
    }
}
