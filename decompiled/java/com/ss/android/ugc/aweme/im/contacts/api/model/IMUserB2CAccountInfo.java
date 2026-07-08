package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C1724306p7;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class IMUserB2CAccountInfo implements Serializable {
    public static final C1724306p7 Companion = new Object() { // from class: X.06p7
    };

    @C09CT("biz_user_level")
    public Integer bizUserLevel;

    @C09CT("enable_inbox_permission")
    public final Integer enableDMPermissionInbox;

    @C09CT("enable_enter_business_inbox")
    public final Integer enableEnterBusinessInbox;

    @C09CT("fans_tags")
    public final String fansTags;

    @C09CT("inbox_mode")
    public final Integer inboxMode;

    @C09CT("last_update_time")
    public final long lastUpdateTime;

    @C09CT("org_account")
    public final IMUserOrgAccountInfo orgAccountInfo;

    @C09CT("relation")
    public final String relation;

    @C09CT("user_tags")
    public final String userTags;
    public transient Map<String, ? extends List<Integer>> userTagsMapCache;

    public final IMUserB2CAccountInfo copy(long j, String str, IMUserOrgAccountInfo iMUserOrgAccountInfo, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3) {
        return new IMUserB2CAccountInfo(j, str, iMUserOrgAccountInfo, str2, num, num2, num3, num4, str3);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserB2CAccountInfo(lastUpdateTime=");
        sbLIZ.append(this.lastUpdateTime);
        sbLIZ.append(", userTags=");
        sbLIZ.append(this.userTags);
        sbLIZ.append(", orgAccountInfo=");
        sbLIZ.append(this.orgAccountInfo);
        sbLIZ.append(", fansTags=");
        sbLIZ.append(this.fansTags);
        sbLIZ.append(", bizUserLevel=");
        sbLIZ.append(this.bizUserLevel);
        sbLIZ.append(", inboxMode=");
        sbLIZ.append(this.inboxMode);
        sbLIZ.append(", enableDMPermissionInbox=");
        sbLIZ.append(this.enableDMPermissionInbox);
        sbLIZ.append(", enableEnterBusinessInbox=");
        sbLIZ.append(this.enableEnterBusinessInbox);
        sbLIZ.append(", relation=");
        sbLIZ.append(this.relation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBizUserLevel(Integer num) {
        this.bizUserLevel = num;
    }

    public final void setUserTagsMapCache(Map<String, ? extends List<Integer>> map) {
        this.userTagsMapCache = map;
    }

    public IMUserB2CAccountInfo(long j, String str, IMUserOrgAccountInfo iMUserOrgAccountInfo, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3) {
        this.lastUpdateTime = j;
        this.userTags = str;
        this.orgAccountInfo = iMUserOrgAccountInfo;
        this.fansTags = str2;
        this.bizUserLevel = num;
        this.inboxMode = num2;
        this.enableDMPermissionInbox = num3;
        this.enableEnterBusinessInbox = num4;
        this.relation = str3;
    }
}
