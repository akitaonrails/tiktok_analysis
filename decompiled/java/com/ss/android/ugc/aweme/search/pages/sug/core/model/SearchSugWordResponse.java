package com.ss.android.ugc.aweme.search.pages.sug.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSugWordResponse extends BaseResponse {

    @C09CT("log_pb")
    public Map<String, String> logPB;

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @C09CT("sug_word_list")
    public List<SearchSugInfo> sugWordList;

    public final String getImprId() {
        String str;
        Map<String, String> map = this.logPB;
        return (map == null || map.isEmpty() || (str = this.logPB.get("impr_id")) == null || str.length() == 0) ? "" : this.logPB.get("impr_id");
    }
}
