package com.ss.android.ugc.aweme.specact.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkReUseModel {

    @C09CT("allowSchemaList")
    public final List<String> allowSchemaList;

    @C09CT("biz")
    public final String biz;

    @C09CT("denySchemaList")
    public final List<String> denySchemaList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("expiredTimeInSeconds")
    public final int expiredTimeInSeconds;

    @C09CT("volumn")
    public final int volumn;

    public SparkReUseModel() {
        this(false, 0, 0, null, null, null, 63, null);
    }

    public SparkReUseModel(boolean z, int i, int i2, String str, List<String> list, List<String> list2) {
        this.enable = z;
        this.volumn = i;
        this.expiredTimeInSeconds = i2;
        this.biz = str;
        this.allowSchemaList = list;
        this.denySchemaList = list2;
    }

    public SparkReUseModel(boolean z, int i, int i2, String str, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? Integer.MAX_VALUE : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? C13BV.INSTANCE : list, (i3 & 32) != 0 ? C13BV.INSTANCE : list2);
    }
}
