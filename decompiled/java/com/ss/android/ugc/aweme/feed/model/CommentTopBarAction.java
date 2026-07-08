package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarAction implements Serializable {

    @C09CT("click_hot_area_type")
    public Integer clickHotAreaType;

    @C09CT("schema")
    public String schema;

    @C09CT("schema_type")
    public Integer schemaType;

    public CommentTopBarAction() {
        this(null, null, null);
    }

    public final void setClickHotAreaType(Integer num) {
        this.clickHotAreaType = num;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSchemaType(Integer num) {
        this.schemaType = num;
    }

    public CommentTopBarAction(String str, Integer num, Integer num2) {
        this.schema = str;
        this.schemaType = num;
        this.clickHotAreaType = num2;
    }
}
