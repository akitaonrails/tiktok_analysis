package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorSuffixInfo implements Serializable {

    @C09CT("anchor_suffix_da_info")
    public final String anchorSuffixDaInfo;

    @C09CT("anchor_suffix_text")
    public final String anchorSuffixText;

    public AnchorSuffixInfo() {
        this(null, null);
    }

    public AnchorSuffixInfo(String str, String str2) {
        this.anchorSuffixText = str;
        this.anchorSuffixDaInfo = str2;
    }
}
