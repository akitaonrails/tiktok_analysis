package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcAddressEditRefactorModel {

    @C09CT("enable_refactor")
    public final boolean enableRefactor;

    @C09CT("schema")
    public final String schema;

    @C09CT("schema_half")
    public final String schemaHalf;

    public EcAddressEditRefactorModel() {
        this(false, "", "");
    }

    public EcAddressEditRefactorModel(boolean z, String str, String str2) {
        this.enableRefactor = z;
        this.schema = str;
        this.schemaHalf = str2;
    }
}
