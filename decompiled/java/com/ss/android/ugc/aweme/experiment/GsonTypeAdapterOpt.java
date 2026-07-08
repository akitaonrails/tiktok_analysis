package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonTypeAdapterOpt {

    @C09CT("class_list")
    public final List<String> classList;

    @C09CT("enable_gson_opt")
    public final boolean enable;

    @C09CT("enable_gson_to_json_fix")
    public final boolean enableGsonToJsonFix;

    public GsonTypeAdapterOpt() {
        this(false, false, null, 7, null);
    }

    public GsonTypeAdapterOpt(boolean z, boolean z2, List<String> list) {
        this.enable = z;
        this.enableGsonToJsonFix = z2;
        this.classList = list;
    }

    public GsonTypeAdapterOpt(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
