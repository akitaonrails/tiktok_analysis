package com.ss.android.ugc.aweme.search.lynx.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxDisplayImageUrl implements Serializable {
    public static final int $stable = 8;

    @C09CT("hot_list")
    public List<LynxImageUrl> hotList = new ArrayList();

    @C09CT("image")
    public String imageUrl;

    public final List<LynxImageUrl> getHotList() {
        return this.hotList;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setHotList(List<LynxImageUrl> list) {
        this.hotList = list;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }
}
