package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class BusinessOverViewV2 {

    @C09CT("booking_info")
    public BusinessOverViewV2BookingInfo bookingInfo;

    @C09CT("dm_info")
    public BusinessOverViewV2DMInfo dmInfo;

    @C09CT("has_active_form")
    public boolean hasActiveForm;

    @C09CT("is_sub_opt_in")
    public boolean isSubOptIn;

    @C09CT("leads_info")
    public BusinessOverViewV2LeadsInfo leadsInfo;

    @C09CT("show_daily_challenges")
    public boolean showDailyChallenges;

    @C09CT("sub_info")
    public BusinessOverViewV2SubInfo subInfo;

    @C09CT("support_booking")
    public boolean supportBooking;

    @C09CT("support_dm")
    public boolean supportDm;

    @C09CT("support_form")
    public boolean supportForm;

    @C09CT("support_sub")
    public boolean supportSub;

    @C09CT("support_third_party_link")
    public boolean supportThirdPartyLink;

    @C09CT("third_party_link_info")
    public BusinessOverViewV2ThirdPartyLinkInfo thirdPartyLinkInfo;

    public static final class BusinessOverViewV2BookingInfo {

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("live_booking_count")
        public long liveBookingCount;
    }

    public static final class BusinessOverViewV2DMInfo {

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("dm_count")
        public long dmCount;

        @C09CT("live_dm_count")
        public long liveDmCount;
    }

    public static final class BusinessOverViewV2LeadsInfo {

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("leads_count")
        public long leadsCount;

        @C09CT("live_leads_count")
        public long liveLeadsCount;
    }

    public static final class BusinessOverViewV2SubInfo {

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("live_subscriber_count")
        public long liveSubscriberCount;

        @C09CT("subscriber_count")
        public long subscriberCount;
    }

    public static final class BusinessOverViewV2ThirdPartyLinkInfo {

        @C09CT("display_text")
        public String displayText = "";

        @C09CT("has_active_link")
        public boolean hasActiveLink;

        @C09CT("has_pending_link")
        public boolean hasPendingLink;
    }
}
