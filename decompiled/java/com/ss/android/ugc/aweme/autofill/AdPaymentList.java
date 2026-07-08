package com.ss.android.ugc.aweme.autofill;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPaymentList implements Serializable {

    @C09CT("list")
    public List<AdPaymentModel> list = new ArrayList();

    public final List<AdPaymentModel> getList() {
        return this.list;
    }

    public final void setList(List<AdPaymentModel> list) {
        this.list = list;
    }
}
