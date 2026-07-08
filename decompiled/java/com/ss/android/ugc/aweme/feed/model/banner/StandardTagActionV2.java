package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardTagActionV2 implements Serializable {

    @C09CT("action_type")
    public int actionType;

    @C09CT("schema")
    public String schema;

    public StandardTagActionV2() {
        this(TagActionType.TAG_ACTION_TYPE_CUSTOMIZED.getType(), null);
    }

    public StandardTagActionV2(int i, String str) {
        this.actionType = i;
        this.schema = str;
    }
}
