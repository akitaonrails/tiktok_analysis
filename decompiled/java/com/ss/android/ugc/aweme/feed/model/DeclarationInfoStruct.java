package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeclarationInfoStruct implements Serializable {

    @C09CT("declaration_type")
    public int option;

    @C09CT("declaration_payload")
    public DeclarationPayload payload;

    public DeclarationInfoStruct() {
        this(0, null);
    }

    public final void setOption(int i) {
        this.option = i;
    }

    public final void setPayload(DeclarationPayload declarationPayload) {
        this.payload = declarationPayload;
    }

    public DeclarationInfoStruct(int i, DeclarationPayload declarationPayload) {
        this.option = i;
        this.payload = declarationPayload;
    }
}
