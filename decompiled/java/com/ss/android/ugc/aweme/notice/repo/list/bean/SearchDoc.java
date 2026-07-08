package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes20.dex */
public final class SearchDoc {

    @C09CT("doc_type")
    public final int docType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("raw_data")
    public final String rawData;

    public SearchDoc() {
        this(null, null, 0);
    }

    public SearchDoc(String str, String str2, int i) {
        this.id = str;
        this.rawData = str2;
        this.docType = i;
    }
}
