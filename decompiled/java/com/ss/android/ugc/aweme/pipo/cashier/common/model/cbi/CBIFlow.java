package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIFlow {

    @C09CT("mid_page_schema")
    public final String midPageSchema;

    @C09CT("package_name")
    public final String packageName;

    @C09CT("supported_commute_type")
    public final List<CommuteType> supportedCommuteTypes;

    @C09CT("schema")
    public final String verifyAppSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public CBIFlow(String str, String str2, List<? extends CommuteType> list, String str3) {
        this.packageName = str;
        this.verifyAppSchema = str2;
        this.supportedCommuteTypes = list;
        this.midPageSchema = str3;
    }
}
