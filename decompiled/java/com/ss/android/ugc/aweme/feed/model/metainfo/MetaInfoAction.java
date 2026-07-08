package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class MetaInfoAction implements Serializable {

    @C09CT("schema")
    public String schema;

    @C09CT("type")
    public int type;

    public MetaInfoAction() {
        this(MetaInfoActionType.META_ACTION_TYPE_NONE.getType(), "");
    }

    public MetaInfoAction(int i, String str) {
        this.type = i;
        this.schema = str;
    }
}
