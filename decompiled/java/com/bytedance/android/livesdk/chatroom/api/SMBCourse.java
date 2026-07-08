package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SMBCourse {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("course_id")
    public long courseId;

    @C09CT("course_review_status")
    public int courseReviewStatus;

    @C09CT("description")
    public ContentAuditStatus description;

    @C09CT("has_customers")
    public boolean hasCustomers;

    @C09CT("has_unsaved_changes")
    public boolean hasUnsavedChanges;

    @C09CT("is_fully_configured")
    public boolean isFullyConfigured;

    @C09CT("is_hidden")
    public boolean isHidden;

    @C09CT("is_purchased")
    public boolean isPurchased;

    @C09CT("name")
    public ContentAuditStatus name;

    @C09CT("pin_text")
    public ContentAuditStatus pinText;

    @C09CT("price_info")
    public SubPackagePriceInfo priceInfo;

    @C09CT("show_m2_guide")
    public boolean showM2Guide;

    @C09CT("valid_video_count")
    public int validVideoCount;

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("video_list")
    public List<SMBCourseVideo> videoList = new ArrayList();

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("course_id_str")
    public String courseIdStr = "";
}
