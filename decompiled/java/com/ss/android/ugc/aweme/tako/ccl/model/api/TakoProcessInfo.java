package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoProcessInfo {

    @C09CT("queries")
    public final List<String> queries;

    @C09CT("stage")
    public final int stage;

    @C09CT("stage_name")
    public final String stageName;

    public TakoProcessInfo() {
        this(0, null, null, 7, null);
    }

    public TakoProcessInfo(int i, String str, List<String> list) {
        this.stage = i;
        this.stageName = str;
        this.queries = list;
    }

    public TakoProcessInfo(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
