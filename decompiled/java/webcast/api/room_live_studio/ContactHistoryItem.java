package webcast.api.room_live_studio;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ContactHistoryItem {

    @C09CT("created_at")
    public long createdAt;

    @C09CT("feedback_eligible")
    public boolean feedbackEligible;

    @C09CT("feedback_id")
    public long feedbackId;

    @C09CT("feedback_submitted")
    public boolean feedbackSubmitted;

    @C09CT("lead_id")
    public long leadId;

    @C09CT("logo")
    public ImageUrlSet logo;

    @C09CT("logo_url")
    public String logoUrl = "";

    @C09CT("product")
    public ProductCard product;
}
