package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchServerPerfInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("server_search_receive_timestamp")
    public final String receiveTimestamp;

    @C09CT("server_search_response_timestamp")
    public final String responseTimestamp;

    public PhotoSearchServerPerfInfo() {
        this(null, null);
    }

    public PhotoSearchServerPerfInfo(String str, String str2) {
        this.receiveTimestamp = str;
        this.responseTimestamp = str2;
    }
}
