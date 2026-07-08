package com.bytedance.ies.ugc.aweme.commercialize.search.brandzone;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class OfficialAccount implements Serializable {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("user_info")
    public User userInfo;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final User getUserInfo() {
        return this.userInfo;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setUserInfo(User user) {
        this.userInfo = user;
    }
}
