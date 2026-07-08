package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEventTemplateAvailability;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEventTemplateLocation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBEditBookingEventTemplateRequest {

    @C09CT("duration_seconds")
    public long durationSeconds;

    @C09CT("event_template_id")
    public String eventTemplateId = "";

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("locations")
    public List<SMBBookingEventTemplateLocation> locations = new ArrayList();

    @C09CT("availability_list")
    public List<SMBBookingEventTemplateAvailability> availabilityList = new ArrayList();

    @C09CT("availability_timezone")
    public String availabilityTimezone = "";
}
