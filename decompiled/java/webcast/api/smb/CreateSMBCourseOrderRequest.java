package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CreateSMBCourseOrderRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("course_id")
    public long courseId;

    @C09CT("plan_id")
    public long planId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("iap_country_code")
    public String iapCountryCode = "";
}
