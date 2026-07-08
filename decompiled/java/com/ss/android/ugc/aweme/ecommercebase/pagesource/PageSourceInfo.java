package com.ss.android.ugc.aweme.ecommercebase.pagesource;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PageSourceInfo {

    @C09CT("ec_head")
    public final PageSource ecHead;

    @C09CT("page_source_list")
    public final List<PageSource> sourcePageList;

    @C09CT("use_bd_btm")
    public final Boolean useBdBtm;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageSourceInfo(sourcePageList=");
        sbLIZ.append(this.sourcePageList);
        sbLIZ.append(", ecHead=");
        sbLIZ.append(this.ecHead);
        sbLIZ.append(", useBdBtm=");
        sbLIZ.append(this.useBdBtm);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PageSourceInfo(List<PageSource> list, PageSource pageSource, Boolean bool) {
        this.sourcePageList = list;
        this.ecHead = pageSource;
        this.useBdBtm = bool;
    }
}
