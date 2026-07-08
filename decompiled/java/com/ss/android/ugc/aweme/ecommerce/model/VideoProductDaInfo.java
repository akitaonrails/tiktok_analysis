package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class VideoProductDaInfo implements Serializable {

    @C09CT("logo_da_info")
    public final String logoDaInfo;

    @C09CT("trans_da_info")
    public final String transDaInfo;

    public VideoProductDaInfo() {
        this(null, null);
    }

    public VideoProductDaInfo(String str, String str2) {
        this.logoDaInfo = str;
        this.transDaInfo = str2;
    }
}
