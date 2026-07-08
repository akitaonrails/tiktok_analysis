package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBServiceSwitchInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("booking_enabled")
        public boolean bookingEnabled;

        @C09CT("can_everyone_send_dm")
        public boolean canEveryoneSendDm;

        @C09CT("course_enabled")
        public boolean courseEnabled;

        @C09CT("dm_enabled")
        public boolean dmEnabled;

        @C09CT("dm_qualification")
        public boolean dmQualification;

        @C09CT("form_enabled")
        public boolean formEnabled;

        @C09CT("form_qualification")
        public boolean formQualification;

        @C09CT("sub_enabled")
        public boolean subEnabled;

        @C09CT("sub_qualification")
        public boolean subQualification;

        @C09CT("support_booking")
        public boolean supportBooking;

        @C09CT("support_course")
        public boolean supportCourse;

        @C09CT("support_dm")
        public boolean supportDm;

        @C09CT("support_form")
        public boolean supportForm;

        @C09CT("support_sub")
        public boolean supportSub;

        @C09CT("supported_services")
        public List<SupportedServiceInfo> supportedServices = new ArrayList();

        @C09CT("profile_biolink")
        public String profileBiolink = "";
    }
}
