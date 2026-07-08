package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSMBCourseDetailResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("course")
        public SMBCourse course;

        @C09CT("is_target_anchor")
        public boolean isTargetAnchor;

        @C09CT("template_list")
        public List<TemplateInfo> templateList = new ArrayList();

        @C09CT("block_purchase_reason")
        public String blockPurchaseReason = "";

        @C09CT("block_price_change_reason")
        public String blockPriceChangeReason = "";
    }
}
