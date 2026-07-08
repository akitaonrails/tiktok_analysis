package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CreatorVideoItem {

    @C09CT("video_schema")
    public final String schema;

    public CreatorVideoItem() {
        this(null);
    }

    public final int hashCode() {
        String str = this.schema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public CreatorVideoItem(String str) {
        this.schema = str;
    }
}
