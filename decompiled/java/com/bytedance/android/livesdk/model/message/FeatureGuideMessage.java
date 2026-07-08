package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureGuideMessage extends AbstractC1136060ffY {

    @C09CT("feature_guide_type")
    public int featureGuideType;

    @C09CT("feature_guide_type_str")
    public String featureGuideTypeStr;

    @C09CT("schema")
    public String schema;

    @C09CT("stay_duration_ms")
    public long stayDurationMs;

    public FeatureGuideMessage() {
        this.type = C001A.FEATURE_GUIDE_MESSAGE;
        this.schema = "";
        this.featureGuideTypeStr = "";
    }
}
