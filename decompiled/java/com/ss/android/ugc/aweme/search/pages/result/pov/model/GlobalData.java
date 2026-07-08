package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class GlobalData implements Serializable {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("op")
    public final String op;

    @C09CT("ref_source_list")
    public final List<RefSource> refSourceList;

    public GlobalData() {
        this(null, null, null, 7, null);
    }

    public int hashCode() {
        String str = this.op;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.awemeList.hashCode()) * 31) + this.refSourceList.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GlobalData(String str, List<? extends Aweme> list, List<RefSource> list2) {
        this.op = str;
        this.awemeList = list;
        this.refSourceList = list2;
    }

    public GlobalData(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
