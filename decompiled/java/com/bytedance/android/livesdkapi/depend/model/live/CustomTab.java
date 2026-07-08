package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTab {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("tab_priority")
    public long tabPriority;

    @C09CT("tab_schema_type")
    public int tabSchemaType;

    @C09CT("tab_title")
    public String tabTitle = "";

    @C09CT("tab_schema")
    public String tabSchema = "";

    @C09CT("tab_biz_name")
    public String tabBizName = "";
}
