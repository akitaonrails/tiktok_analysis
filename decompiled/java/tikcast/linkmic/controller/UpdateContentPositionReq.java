package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateContentPositionReq {

    @C09CT("channel_i_d")
    public long channelID;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("content_i_d")
    public String contentID = "";

    @C09CT("content_linkmic_i_d")
    public String contentLinkmicID = "";

    @C09CT("group_channel_i_d")
    public long groupChannelID;

    @C09CT("operator_user_i_d")
    public long operatorUserID;

    @C09CT("reallocated_content_type")
    public int reallocatedContentType;

    @C09CT("reallocated_position")
    public int reallocatedPosition;

    @C09CT("room_i_d")
    public long roomID;
}
