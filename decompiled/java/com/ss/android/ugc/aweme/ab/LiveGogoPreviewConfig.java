package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveGogoPreviewConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("schema_black_list")
    public final List<String> schemaBlackList;

    public LiveGogoPreviewConfig() {
        this(false, null, 3, null);
    }

    public LiveGogoPreviewConfig(boolean z, List<String> list) {
        this.enable = z;
        this.schemaBlackList = list;
    }

    public LiveGogoPreviewConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
