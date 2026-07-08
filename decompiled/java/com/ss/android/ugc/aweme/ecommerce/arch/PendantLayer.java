package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class PendantLayer {

    @C09CT("btm")
    public final String btm;

    @C09CT("popup")
    public final SearchBffItem popup;

    @C09CT("widgets")
    public final List<SearchBffItem> widgets;

    public PendantLayer() {
        this(null, null, "");
    }

    public PendantLayer(List<SearchBffItem> list, SearchBffItem searchBffItem, String str) {
        this.widgets = list;
        this.popup = searchBffItem;
        this.btm = str;
    }
}
