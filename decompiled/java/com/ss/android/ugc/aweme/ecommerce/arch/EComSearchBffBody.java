package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EComSearchBffBody {

    @C09CT("sections")
    public final List<SearchBffSection> sections;

    public EComSearchBffBody() {
        this(null);
    }

    public EComSearchBffBody(List<SearchBffSection> list) {
        this.sections = list;
    }
}
