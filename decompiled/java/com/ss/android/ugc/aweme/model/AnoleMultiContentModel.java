package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleMultiContentModel implements Serializable {

    @C09CT("common_data")
    public final Map<String, Object> commonData;

    @C09CT("contents")
    public final List<AnoleMultiContentItemModel> contentList;

    public AnoleMultiContentModel() {
        this(null, null);
    }

    public final Map<String, Object> getCommonData() {
        return this.commonData;
    }

    public final List<AnoleMultiContentItemModel> getContentList() {
        return this.contentList;
    }

    public AnoleMultiContentModel(Map<String, ? extends Object> map, List<AnoleMultiContentItemModel> list) {
        this.commonData = map;
        this.contentList = list;
    }
}
