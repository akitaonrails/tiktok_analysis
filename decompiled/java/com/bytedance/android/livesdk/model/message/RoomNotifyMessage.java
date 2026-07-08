package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomNotifyMessage extends AbstractC1136060ffY {
    public long LL;
    public boolean LLILLJJLI;
    public ImageModel LLILLL;
    public boolean LLILZ;

    @C09CT("content")
    public String content;

    @C09CT("event_tracking")
    public EventTracking eventTracking;

    @C09CT("extra")
    public RoomNotifyMessageExtra extra;

    @C09CT("flex_setting")
    public List<Long> flexSetting;

    @C09CT("from_user_id")
    public long from_user_id;

    @C09CT("privilege_log_extra")
    public PrivilegeLogExtra logExtra;

    @C09CT("notify_class")
    public int notifyClass;

    @C09CT("notify_type")
    public long notifyType;

    @C09CT("schema")
    public String schema;

    @C09CT("source")
    public String source;

    @C09CT("to_anchor_id")
    public long to_anchor_id;

    @C09CT("user")
    public User user;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public RoomNotifyMessage() {
        this.type = C001A.ROOM_NOTIFY;
    }
}
