package com.ss.android.ugc.aweme.api.resp;

import X.C09CT;
import X.C118J;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorSelectionResponse extends C118J<AnchorModule> {

    @C09CT("enable_load_more")
    public boolean enableLoadMore;

    @C09CT("enable_search")
    public boolean enableSearch;

    @C09CT("modules")
    public List<AnchorModule> modules;

    @C09CT("tabs")
    public List<Object> tabs;

    @C09CT("page_title")
    public String title = "";
}
