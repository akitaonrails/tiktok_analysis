package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: loaded from: classes.dex */
public final class LinkLayoutMessage extends AbstractC1136060ffY {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("layout_id")
    public String layoutId;

    @C09CT("layout_style")
    public int layoutStyle;

    @C09CT("max_position")
    public int maxPosition;

    @C09CT("message_type")
    public int messageType;

    @C09CT("operator_user_info")
    public LinkerMediaChangeOperator operatorUserInfo;

    @C09CT("room_id")
    public long roomId;

    public LinkLayoutMessage() {
        this.type = C001A.LINK_LAYOUT_MESSAGE;
        this.layoutId = "";
    }
}
