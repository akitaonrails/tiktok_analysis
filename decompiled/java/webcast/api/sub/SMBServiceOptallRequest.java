package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBServiceOptallRequest {

    @C09CT("basic_info")
    public SMBServiceOptInInfo basicInfo;

    @C09CT("booking_info")
    public SMBServiceOptInInfo bookingInfo;

    @C09CT("contact_form_info")
    public SMBServiceOptInInfo contactFormInfo;

    @C09CT("dm_info")
    public SMBServiceOptInInfo dmInfo;

    @C09CT("paid_video_course_info")
    public SMBServiceOptInInfo paidVideoCourseInfo;

    public static final class SMBServiceOptInInfo {

        @C09CT("name")
        public String name = "";

        @C09CT("desc")
        public String desc = "";
    }
}
