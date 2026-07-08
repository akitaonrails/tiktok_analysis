package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PostOrderSchemaParams {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("mall_schema_params")
    public final MallSchemaBizParams mallSchemaParams;

    @C09CT("schema_common_context")
    public final SchemaCommonContext schemaCommonContext;

    public PostOrderSchemaParams() {
        this(null, null);
    }

    public PostOrderSchemaParams(MallSchemaBizParams mallSchemaBizParams, SchemaCommonContext schemaCommonContext) {
        this.mallSchemaParams = mallSchemaBizParams;
        this.schemaCommonContext = schemaCommonContext;
    }
}
