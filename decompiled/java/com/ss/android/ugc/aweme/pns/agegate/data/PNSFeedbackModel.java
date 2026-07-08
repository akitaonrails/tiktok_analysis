package com.ss.android.ugc.aweme.pns.agegate.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSFeedbackModel implements Serializable {

    @C09CT("business")
    public final String business;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    @C09CT("case")
    public final Integer f72case;

    @C09CT("dialog")
    public final PNSDialogModel dialogModel;

    @C09CT("error")
    public final PNSErrorModel errorModel;

    @C09CT("from_calculate")
    public final boolean fromCalculateAPI;

    public PNSFeedbackModel() {
        this(null, null, -1, null, false);
    }

    public final PNSFeedbackModel copy(PNSErrorModel pNSErrorModel, PNSDialogModel pNSDialogModel, Integer num, String str, boolean z) {
        return new PNSFeedbackModel(pNSErrorModel, pNSDialogModel, num, str, z);
    }

    public PNSFeedbackModel(PNSErrorModel pNSErrorModel, PNSDialogModel pNSDialogModel, Integer num, String str, boolean z) {
        this.errorModel = pNSErrorModel;
        this.dialogModel = pNSDialogModel;
        this.f72case = num;
        this.business = str;
        this.fromCalculateAPI = z;
    }
}
