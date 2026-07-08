package com.bytedance.android.livesdkapi.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CommonMessageData {

    @C09CT("anchor_fold_type_for_web")
    public long anchorFoldTypeForWeb;

    @C09CT("create_time")
    public long createTime;

    @C09CT("depend_id")
    public LiveMessageID dependID;

    @C09CT("depend_root_id")
    public LiveMessageID dependRootID;

    @C09CT("dispatch_strategy")
    public int dispatchStrategy;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("filter_msg_tags")
    public List<String> filterTags;

    @C09CT("fold_type")
    public long foldType;

    @C09CT("fold_type_for_web")
    public long foldTypeForWeb;

    @C09CT("msg_id")
    public long messageId;

    @C09CT("sei")
    public LiveMessageSEI messageSEI;

    @C09CT("method")
    public String method;

    @C09CT("monitor")
    public int monitor;

    @C09CT("msg_process_filter_k")
    public String msgProcessFilterK;

    @C09CT("msg_process_filter_v")
    public String msgProcessFilterV;

    @C09CT("play_time")
    public long playTime;

    @C09CT("priority_score")
    public long priorityScore;

    @C09CT("room_id")
    public long roomId;

    @C09CT("is_show_msg")
    public boolean showMsg;

    @C09CT("to_dids")
    public List<String> toDids;

    @C09CT("to_idc")
    public String toIdc;

    @C09CT("describe")
    public String describe = "";

    @C09CT("log_id")
    public String logId = "";

    @C09CT("anchor_fold_type")
    public Long anchorFoldType = 0L;

    @C09CT("from_idc")
    public String fromIdc = "";

    @C09CT("anchor_priority_score")
    public long anchorPriorityScore = 0;

    @C09CT("room_message_heat_level")
    public long roomMessageHeatLevel = 0;

    @C09CT("client_send_time")
    public long clientSendTime = 0;
}
