package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EntityCardLabel implements Serializable {

    @C09CT("label_color")
    public final String labelColor;

    @C09CT("label_color_dark")
    public final String labelColorDark;

    @C09CT("label_index")
    public Integer labelIndex;

    @C09CT("label_list")
    public final List<SearchLabel> labelList;

    @C09CT("top_height")
    public final Integer topHeight;

    public EntityCardLabel() {
        this(null, null, null, null, null);
    }

    public final void setLabelIndex(Integer num) {
        this.labelIndex = num;
    }

    public EntityCardLabel(List<SearchLabel> list, Integer num, String str, String str2, Integer num2) {
        this.labelList = list;
        this.labelIndex = num;
        this.labelColor = str;
        this.labelColorDark = str2;
        this.topHeight = num2;
    }
}
