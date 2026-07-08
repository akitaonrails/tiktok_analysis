package webcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FansTaskOperateRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("claim_points_param")
    public ClaimPointsParam claimPointsParam;

    @C09CT("gift_image")
    public GiftImage giftImage;

    @C09CT("im_message")
    public ImMessage imMessage;

    @C09CT("operate_type")
    public long operateType;

    @C09CT("room_id")
    public long roomId;

    public static final class ClaimPointsParam {

        @C09CT("task_type")
        public int taskType;

        @C09CT("new_task_type")
        public String newTaskType = "";

        @C09CT("auto_claim_task_type")
        public List<String> autoClaimTaskType = new ArrayList();
    }

    public static final class GiftImage {

        @C09CT("uri")
        public String uri = "";
    }

    public static final class ImMessage {

        @C09CT("message_type")
        public long messageType;
    }
}
