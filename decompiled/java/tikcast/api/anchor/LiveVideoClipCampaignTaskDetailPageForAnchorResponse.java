package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveVideoClipCampaignTask;

/* JADX INFO: loaded from: classes.dex */
public final class LiveVideoClipCampaignTaskDetailPageForAnchorResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("cannot_join")
        public boolean cannotJoin;

        @C09CT("share_with_viewers_switch")
        public int shareWithViewersSwitch;

        @C09CT("sign_in_status")
        public long signInStatus;

        @C09CT("task_detail")
        public LiveVideoClipCampaignTask taskDetail;

        @C09CT("total_contribute_user_cnt")
        public long totalContributeUserCnt;

        @C09CT("total_contribute_video_cnt")
        public long totalContributeVideoCnt;

        @C09CT("total_contribute_video_vv_cnt")
        public long totalContributeVideoVvCnt;

        @C09CT("block_reason")
        public List<String> blockReason = new ArrayList();

        @C09CT("title")
        public String title = "";

        @C09CT("sub_title")
        public String subTitle = "";

        @C09CT("anchor_name")
        public String anchorName = "";

        @C09CT("anchor_avatar")
        public String anchorAvatar = "";
    }
}
