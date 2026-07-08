package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveMemberNotifyMessage extends AbstractC1136060ffY {

    @C09CT("host_user_id")
    public long hostUserId;

    @C09CT("member_info")
    public List<MemberInfo> memberInfo;

    public GroupLiveMemberNotifyMessage() {
        this.type = C001A.GROUP_LIVE_MEMBER_NOTIFY_MESSAGE;
        this.memberInfo = new ArrayList();
    }
}
