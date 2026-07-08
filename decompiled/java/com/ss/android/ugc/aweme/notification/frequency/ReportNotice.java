package com.ss.android.ugc.aweme.notification.frequency;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.Behavior;
import com.ss.android.ugc.aweme.notice.repo.list.bean.Condition;

/* JADX INFO: loaded from: classes29.dex */
public final class ReportNotice {

    @C09CT("account_type")
    public String accountType;

    @C09CT("behavior")
    public Behavior behavior;

    @C09CT("condition")
    public Condition condition;

    @C09CT("nid")
    public String nid;

    @C09CT("to_user_id")
    public int toUserId;

    @C09CT("user_action")
    public int userAction;

    public ReportNotice() {
        this(null, 0, null, 0, null, null);
    }

    public ReportNotice(String str, int i, String str2, int i2, Condition condition, Behavior behavior) {
        this.nid = str;
        this.toUserId = i;
        this.accountType = str2;
        this.userAction = i2;
        this.condition = condition;
        this.behavior = behavior;
    }
}
