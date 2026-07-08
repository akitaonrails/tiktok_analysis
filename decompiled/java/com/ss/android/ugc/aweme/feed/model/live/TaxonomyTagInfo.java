package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TaxonomyTagInfo implements Serializable {

    @C09CT("level1_tag")
    public List<String> level1Tag = new ArrayList();

    @C09CT("level2_tag")
    public String level2Tag = "";

    public final List<String> getLevel1Tag() {
        return this.level1Tag;
    }

    public final String getLevel2Tag() {
        return this.level2Tag;
    }

    public final void setLevel1Tag(List<String> list) {
        this.level1Tag = list;
    }

    public final void setLevel2Tag(String str) {
        this.level2Tag = str;
    }
}
