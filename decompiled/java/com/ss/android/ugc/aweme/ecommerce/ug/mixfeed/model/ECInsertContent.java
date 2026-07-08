package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ECInsertContent {
    public String insertRequestInfo;
    public final Integer startCursor;

    @C09CT("top_content_id_list")
    public final List<ECCardInfo> topContentList;

    public ECInsertContent() {
        this(null, "{}", 0);
    }

    public final void setInsertRequestInfo(String str) {
        this.insertRequestInfo = str;
    }

    public ECInsertContent(List<ECCardInfo> list, String str, Integer num) {
        this.topContentList = list;
        this.insertRequestInfo = str;
        this.startCursor = num;
    }
}
