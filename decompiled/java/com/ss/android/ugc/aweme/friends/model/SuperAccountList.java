package com.ss.android.ugc.aweme.friends.model;

import X.C086I;
import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class SuperAccountList extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("user_list")
    public List<UserWithAweme> userList;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SuperAccountList m205clone() {
        SuperAccountList superAccountList = new SuperAccountList();
        ArrayList arrayList = new ArrayList();
        if (!C086I.LIZIZ(this.userList)) {
            for (UserWithAweme userWithAweme : this.userList) {
                if (userWithAweme != null) {
                    arrayList.add(userWithAweme.m206clone());
                }
            }
        }
        superAccountList.userList = arrayList;
        superAccountList.extra = this.extra;
        superAccountList.status_code = this.status_code;
        superAccountList.status_msg = this.status_msg;
        superAccountList.error_code = this.error_code;
        superAccountList.logPb = this.logPb;
        return superAccountList;
    }

    public List<UserWithAweme> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setUserList(List<UserWithAweme> list) {
        this.userList = list;
    }
}
