package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class SearchLiveStruct implements Serializable {
    public LogPbBean LL;

    @C09CT("lives")
    public Aweme liveAweme;

    @C09CT("type")
    public int type;

    public int hashCode() {
        int i = this.type * 31;
        Aweme aweme = this.liveAweme;
        return i + (aweme != null ? aweme.hashCode() : 0);
    }

    public Aweme getLiveAweme() {
        return this.liveAweme;
    }

    public LogPbBean getLogPbBean() {
        return this.LL;
    }

    public int getType() {
        return this.type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchLiveStruct searchLiveStruct = (SearchLiveStruct) obj;
        if (this.type != searchLiveStruct.type) {
            return false;
        }
        return this.liveAweme.equals(searchLiveStruct.liveAweme);
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.LL = logPbBean;
    }

    public void setType(int i) {
        this.type = i;
    }
}
