package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveVideoClipCampaignTask;

/* JADX INFO: loaded from: classes.dex */
public final class LiveVideoClipCampaignTaskDetailPageForClipperResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_has_opt_out")
        public boolean anchorHasOptOut;

        @C09CT("cannot_join")
        public boolean cannotJoin;

        @C09CT("estimated_reward")
        public long estimatedReward;

        @C09CT("has_contribute_video")
        public boolean hasContributeVideo;

        @C09CT("rank")
        public long rank;

        @C09CT("share_with_viewers_switch")
        public int shareWithViewersSwitch;

        @C09CT("sign_in_status")
        public long signInStatus;

        @C09CT("task_detail")
        public LiveVideoClipCampaignTask taskDetail;

        @C09CT("vv")
        public long vv;

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

        @C09CT("clipper_name")
        public String clipperName = "";

        @C09CT("clipper_avatar")
        public String clipperAvatar = "";

        @C09CT("shared_room_id")
        public List<Long> sharedRoomId = new ArrayList();
    }
}
