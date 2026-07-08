package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class TabContentListItemData {

    @C09CT("bff_type")
    public final Integer bffType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("lynx_data")
    public final n lynxData;

    @C09CT("raven_data")
    public final RavenPage ravenData;

    @C09CT("schema")
    public final String schema;

    @C09CT("tab_type")
    public final Long tabType;

    public final boolean LIZ() {
        Integer num;
        Integer num2 = this.bffType;
        return ((num2 == null || num2.intValue() != 0 || this.lynxData == null) && ((num = this.bffType) == null || num.intValue() != 1 || this.ravenData == null)) ? false : true;
    }

    public TabContentListItemData(Integer num, Long l, String str, n nVar, String str2, RavenPage ravenPage) {
        this.bffType = num;
        this.tabType = l;
        this.id = str;
        this.lynxData = nVar;
        this.schema = str2;
        this.ravenData = ravenPage;
    }
}
