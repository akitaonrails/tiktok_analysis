package com.ss.android.ugc.aweme.autofill;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillV2Model implements Serializable {

    @C09CT("fields")
    public List<AutofillDetailInfo> fields;

    public final List<AutofillDetailInfo> getFields() {
        return this.fields;
    }

    public final void setFields(List<AutofillDetailInfo> list) {
        this.fields = list;
    }
}
