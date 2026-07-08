package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardReviewMessage extends AbstractC1136060ffY {

    @C09CT("media_node_id")
    public String mediaNodeId;

    @C09CT("message_type")
    public int messageType;

    @C09CT("official_material_type")
    public int officialMaterialType;

    @C09CT("post_review_status")
    public int postReviewStatus;

    @C09CT("pre_review_status")
    public int preReviewStatus;

    @C09CT("template_id")
    public long templateId;

    public NoticeboardReviewMessage() {
        this.type = C001A.NOTICEBOARD_REVIEW_MESSAGE;
        this.mediaNodeId = "";
    }
}
