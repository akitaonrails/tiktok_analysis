package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class ButtonActionPayload implements Serializable {

    @C09CT("schema")
    public final String schema;

    public ButtonActionPayload() {
        this(null);
    }

    public ButtonActionPayload(String str) {
        this.schema = str;
    }
}
