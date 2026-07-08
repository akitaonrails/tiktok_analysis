package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardTemplate {

    @C09CT("author_info")
    public SimpleUser authorInfo;

    @C09CT("convert_noticeboard_material_info")
    public ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo;

    @C09CT("media_node_id")
    public String mediaNodeId = "";

    @C09CT("noticeboard_template_id")
    public long noticeboardTemplateId;

    @C09CT("private_status")
    public int privateStatus;

    @C09CT("review_status")
    public int reviewStatus;

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.noticeboardTemplateId) * 31) + this.mediaNodeId.hashCode()) * 31;
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = this.convertNoticeboardMaterialInfo;
        int iHashCode = (((((iY2 + (convertNoticeboardMaterialInfo != null ? convertNoticeboardMaterialInfo.hashCode() : 0)) * 31) + this.privateStatus) * 31) + this.reviewStatus) * 31;
        SimpleUser simpleUser = this.authorInfo;
        return iHashCode + (simpleUser != null ? simpleUser.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(NoticeboardTemplate.class, cls)) {
            return false;
        }
        NoticeboardTemplate noticeboardTemplate = (NoticeboardTemplate) obj;
        if (this.noticeboardTemplateId == noticeboardTemplate.noticeboardTemplateId && Intrinsics.LJFF(this.mediaNodeId, noticeboardTemplate.mediaNodeId) && Intrinsics.LJFF(this.convertNoticeboardMaterialInfo, noticeboardTemplate.convertNoticeboardMaterialInfo) && this.privateStatus == noticeboardTemplate.privateStatus && this.reviewStatus == noticeboardTemplate.reviewStatus && Intrinsics.LJFF(this.authorInfo, noticeboardTemplate.authorInfo)) {
            return true;
        }
        return false;
    }
}
