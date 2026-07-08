package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEventTemplate;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEventTemplateAvailability;
import com.bytedance.android.livesdk.chatroom.api.SMBTemplateAvailabilityParams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBBookingEventTemplateListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("default_availability_params")
        public SMBTemplateAvailabilityParams defaultAvailabilityParams;

        @C09CT("event_template_list")
        public List<SMBBookingEventTemplate> eventTemplateList = new ArrayList();

        @C09CT("default_availability_list")
        public List<SMBBookingEventTemplateAvailability> defaultAvailabilityList = new ArrayList();
    }
}
