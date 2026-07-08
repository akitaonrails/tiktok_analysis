package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBDailyData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BusinessOverView {

    @C09CT("booking_info")
    public BookingInfo bookingInfo;

    @C09CT("dm_info")
    public DMInfo dmInfo;

    @C09CT("dm_intent_leads_info")
    public DMIntentLeadsInfo dmIntentLeadsInfo;

    @C09CT("income_info")
    public IncomeInfo incomeInfo;

    @C09CT("leads_info")
    public LeadsInfo leadsInfo;

    @C09CT("sub_info")
    public SubInfo subInfo;

    @C09CT("third_party_link_info")
    public ThirdPartyLinkInfo thirdPartyLinkInfo;

    public static final class BookingInfo {

        @C09CT("support_booking")
        public boolean supportBooking;

        @C09CT("booking_count")
        public String bookingCount = "";

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("daily_data")
        public List<SMBDailyData> dailyData = new ArrayList();
    }

    public static final class DMInfo {

        @C09CT("dm_count")
        public long dmCount;

        @C09CT("support_dm")
        public boolean supportDm;

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("daily_data")
        public List<SMBDailyData> dailyData = new ArrayList();
    }

    public static final class DMIntentLeadsInfo {

        @C09CT("count")
        public long count;

        @C09CT("enabled")
        public boolean enabled;

        @C09CT("schema")
        public String schema = "";

        @C09CT("daily_data")
        public List<SMBDailyData> dailyData = new ArrayList();

        @C09CT("display_text")
        public String displayText = "";
    }

    public static final class IncomeInfo {

        @C09CT("show_course_tab")
        public boolean showCourseTab;

        @C09CT("revenue_str")
        public String revenueStr = "";

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("currency_symbol")
        public String currencySymbol = "";

        @C09CT("daily_data")
        public List<SMBDailyData> dailyData = new ArrayList();
    }

    public static final class LeadsInfo {

        @C09CT("form_switch_on")
        public boolean formSwitchOn;

        @C09CT("is_ba")
        public boolean isBa;

        @C09CT("leads_count")
        public long leadsCount;

        @C09CT("support_form")
        public boolean supportForm;

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("daily_data")
        public List<SMBDailyData> dailyData = new ArrayList();
    }

    public static final class SubInfo {

        @C09CT("is_sub_opt_in")
        public boolean isSubOptIn;

        @C09CT("support_sub")
        public boolean supportSub;

        @C09CT("revenue_str")
        public String revenueStr = "";

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("currency_symbol")
        public String currencySymbol = "";
    }

    public static final class ThirdPartyLinkInfo {

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("has_active_link")
        public boolean hasActiveLink;

        @C09CT("has_pending_link")
        public boolean hasPendingLink;

        @C09CT("support_third_party_link")
        public boolean supportThirdPartyLink;
    }
}
