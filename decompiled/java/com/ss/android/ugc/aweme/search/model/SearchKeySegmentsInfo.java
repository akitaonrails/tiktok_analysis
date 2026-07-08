package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SearchKeySegmentsInfo implements Serializable {

    @C09CT("key_segment_infos")
    public List<KeySegmentInfo> keySegmentInfos;

    public List<KeySegmentInfo> getKeySegmentInfos() {
        return this.keySegmentInfos;
    }

    public void setKeySegmentInfos(List<KeySegmentInfo> list) {
        this.keySegmentInfos = list;
    }
}
