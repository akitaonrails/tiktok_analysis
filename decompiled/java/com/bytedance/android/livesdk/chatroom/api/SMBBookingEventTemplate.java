package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBBookingEventTemplate {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("availability_params")
    public SMBTemplateAvailabilityParams availabilityParams;

    @C09CT("created_at_sec")
    public long createdAtSec;

    @C09CT("duration_seconds")
    public long durationSeconds;

    @C09CT("is_active")
    public boolean isActive;

    @C09CT("is_paid")
    public boolean isPaid;

    @C09CT("kind")
    public int kind;

    @C09CT("updated_at_sec")
    public long updatedAtSec;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("sku_id")
    public String skuId = "";

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("template_reference_id")
    public String templateReferenceId = "";

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("calendly_event_template_uri")
    public String calendlyEventTemplateUri = "";

    @C09CT("locations")
    public List<SMBBookingEventTemplateLocation> locations = new ArrayList();

    @C09CT("availability_list")
    public List<SMBBookingEventTemplateAvailability> availabilityList = new ArrayList();
}
