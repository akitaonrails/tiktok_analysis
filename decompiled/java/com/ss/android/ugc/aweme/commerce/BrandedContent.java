package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class BrandedContent implements Serializable {

    @C09CT("enter_from_list")
    public final List<String> enterFroms;

    @C09CT("new_content_num")
    public final int newContentNum;

    @C09CT("update_time")
    public final long updateTime;

    public final List<String> getEnterFroms() {
        return this.enterFroms;
    }

    public final int getNewContentNum() {
        return this.newContentNum;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }
}
