package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TopFrameSummary implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("show_list")
    public List<ShowInfo> showList;

    @C09CT("title")
    public String title = "";

    @C09CT("scheme")
    public String scheme = "";

    public final long getId() {
        return this.id;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final List<ShowInfo> getShowList() {
        return this.showList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setShowList(List<ShowInfo> list) {
        this.showList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
