package com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.model;

import X.C09CT;
import X.C123100dR;
import X.C641930PFv;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicTabList extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("is_failed")
    public final Integer isRequestEngineFailed;

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    @C09CT("tab_list")
    public final List<SearchDynamicTabInfo> tabList;

    public SearchDynamicTabList() {
        this(null, null, null);
    }

    public final List<SearchTabInfo> getSearchTabList() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        List<SearchDynamicTabInfo> list = this.tabList;
        if (list != null) {
            for (SearchDynamicTabInfo searchDynamicTabInfo : list) {
                if (C123100dR.LIZ(searchDynamicTabInfo.getTabKey()) && (obj = C641930PFv.LIZJ().get(searchDynamicTabInfo.getTabKey())) != null) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final List<SearchDynamicTabInfo> getTabList() {
        return this.tabList;
    }

    public final Integer isRequestEngineFailed() {
        return this.isRequestEngineFailed;
    }

    public SearchDynamicTabList(List<SearchDynamicTabInfo> list, LogPbBean logPbBean, Integer num) {
        this.tabList = list;
        this.logPbBean = logPbBean;
        this.isRequestEngineFailed = num;
    }
}
