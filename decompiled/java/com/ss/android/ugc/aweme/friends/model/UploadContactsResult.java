package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UploadContactsResult extends BaseResponse {

    @C09CT("unregistered_contact")
    public final List<ContactModel> contacts;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("registered_user")
    public final List<User> users;

    public final int getStatusCode() {
        return getStatusCode();
    }

    public final List<ContactModel> getContacts() {
        return this.contacts;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setStatusCode(int i) {
        this.status_code = i;
    }
}
