package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C15VN;
import X.C15VS;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreChatGroupStruct implements Serializable {

    @C09CT("audit_switch")
    public final Boolean auditSwitch;

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("group_desc")
    public final String groupDesc;

    @C09CT("group_id")
    public final Long groupId;

    @C09CT("group_member_count")
    public final Integer groupMemberCount;

    @C09CT("group_member_limit")
    public final Integer groupMemberLimit;

    @C09CT("group_member_online_count")
    public final Integer groupMemberOnlineCount;

    @C09CT("group_name")
    public final String groupName;

    @C09CT("group_owner_id")
    public final Long groupOwnerId;
    public LogPbBean logPbBean;
    public String requestId;

    @C09CT("verify_status")
    public final Integer verifyStatus;

    public ExploreChatGroupStruct() {
        this(null, null, null, null, null, null, null, null, Integer.valueOf(C15VN.EXPLORE_INSERT_CARD_TYPE_DEFAULT.getValue()), null);
    }

    public final C15VN getChatGroupVerifyStatus() {
        C15VS c15vs = C15VN.Companion;
        Integer num = this.verifyStatus;
        c15vs.getClass();
        return C15VS.LIZ(num);
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public ExploreChatGroupStruct(Long l, String str, String str2, Integer num, Integer num2, Integer num3, String str3, Boolean bool, Integer num4, Long l2) {
        this.groupId = l;
        this.groupName = str;
        this.avatarUrl = str2;
        this.groupMemberCount = num;
        this.groupMemberLimit = num2;
        this.groupMemberOnlineCount = num3;
        this.groupDesc = str3;
        this.auditSwitch = bool;
        this.verifyStatus = num4;
        this.groupOwnerId = l2;
    }
}
