package com.ss.android.ugc.aweme.specact.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkPreloadModel {

    @C09CT("allowSchemaList")
    public final List<String> allowSchemaList;

    @C09CT("biz")
    public final String biz;

    @C09CT("denySchemaList")
    public final List<String> denySchemaList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enableJSBOpt")
    public final boolean enableJSBOpt;

    @C09CT("expiredTimeInSeconds")
    public final int expiredTimeInSeconds;

    @C09CT("preloadDelayInSeconds")
    public final int preloadDelayInSeconds;

    @C09CT("splitWebviewInit")
    public final boolean splitWebviewInit;

    @C09CT("volumn")
    public final int volumn;

    public SparkPreloadModel() {
        this(false, 0, 0, null, null, null, false, 0, false, 511, null);
    }

    public SparkPreloadModel(boolean z, int i, int i2, String str, List<String> list, List<String> list2, boolean z2, int i3, boolean z3) {
        this.enable = z;
        this.volumn = i;
        this.expiredTimeInSeconds = i2;
        this.biz = str;
        this.allowSchemaList = list;
        this.denySchemaList = list2;
        this.splitWebviewInit = z2;
        this.preloadDelayInSeconds = i3;
        this.enableJSBOpt = z3;
    }

    public SparkPreloadModel(boolean z, int i, int i2, String str, List list, List list2, boolean z2, int i3, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? Integer.MAX_VALUE : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? C13BV.INSTANCE : list, (i4 & 32) != 0 ? C13BV.INSTANCE : list2, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) == 0 ? z3 : false);
    }
}
