package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class SMBBookingEvent {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("created_at_sec")
    public long createdAtSec;

    @C09CT("dm_status")
    public int dmStatus;

    @C09CT("event_end_time_sec")
    public long eventEndTimeSec;

    @C09CT("event_start_time_sec")
    public long eventStartTimeSec;

    @C09CT("event_status")
    public int eventStatus;

    @C09CT("payment")
    public SMBBookingPayment payment;

    @C09CT("sku_info")
    public SMBBookingEventSKUInfo skuInfo;

    @C09CT("updated_at_sec")
    public long updatedAtSec;

    @C09CT("user_info")
    public SMBBookingEventUserInfo userInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("user_id")
    public String userId = "";

    @C09CT("event_template_id")
    public String eventTemplateId = "";

    @C09CT("event_reference_id")
    public String eventReferenceId = "";

    @C09CT("event_url")
    public String eventUrl = "";

    @C09CT("event_template_name")
    public String eventTemplateName = "";
}
