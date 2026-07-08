package tikcast.api.anchor;

import X.C09CT;
import webcast.data.glip.GlipAwemeStruct;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGlipItemAppealMainPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("appeal_allow")
        public boolean appealAllow;

        @C09CT("glip_biz_scene")
        public int glipBizScene;

        @C09CT("item_audit_status")
        public int itemAuditStatus;

        @C09CT("show_resubmit")
        public boolean showResubmit;

        @C09CT("video_detail")
        public GlipAwemeStruct videoDetail;

        @C09CT("reject_reason")
        public String rejectReason = "";

        @C09CT("appeal_reason")
        public String appealReason = "";

        @C09CT("appeal_reject_reason")
        public String appealRejectReason = "";

        @C09CT("suggestion")
        public String suggestion = "";
    }
}
