package com.ss.android.ugc.aweme.experiment.publishtest;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public class PublishTestSupportSetting$PublishTestSupportConfig {

    @C09CT("testTriggerProbability")
    public long testTriggerProbability;

    @C09CT("testTriggerRange")
    public int testTriggerRange;

    @C09CT("crashType")
    public String crashType = "java";

    @C09CT("crashStack")
    public String crashStack = "";

    @C09CT("testTriggerDelay")
    public long testTriggerDelay = -1;

    @C09CT("crashMsg")
    public String crashMsg = "PUBLISH_FUSED_TEST_EXCEPTION";

    @C09CT("customerDataTags")
    public String customerDataTags = "";

    @C09CT("customerFilters")
    public String customerFilters = "";

    @C09CT("logType")
    public String logType = "LOG_TYPE_PUBLISH_FUSED_TEST";

    @C09CT("appLogEvent")
    public String appLogEvent = "PUBLISH_TEST_DRILL";

    @C09CT("appLogWithDataTags")
    public String appLogWithDataTags = "";

    @C09CT("drillPath")
    public String drillPath = "";

    @C09CT("syncWithException")
    public boolean syncWithException = true;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishTestSupportConfig{crashType='");
        sbLIZ.append(this.crashType);
        sbLIZ.append('\'');
        sbLIZ.append(", crashStack='");
        sbLIZ.append(this.crashStack);
        sbLIZ.append('\'');
        sbLIZ.append(", testTriggerDelay=");
        sbLIZ.append(this.testTriggerDelay);
        sbLIZ.append(", testTriggerProbability=");
        sbLIZ.append(this.testTriggerProbability);
        sbLIZ.append(", testTriggerRange=");
        sbLIZ.append(this.testTriggerRange);
        sbLIZ.append(", crashMsg='");
        sbLIZ.append(this.crashMsg);
        sbLIZ.append('\'');
        sbLIZ.append(", customerDataTags='");
        sbLIZ.append(this.customerDataTags);
        sbLIZ.append('\'');
        sbLIZ.append(", customerFilters='");
        sbLIZ.append(this.customerFilters);
        sbLIZ.append('\'');
        sbLIZ.append(", logType='");
        sbLIZ.append(this.logType);
        sbLIZ.append('\'');
        sbLIZ.append(", appLogEvent='");
        sbLIZ.append(this.appLogEvent);
        sbLIZ.append('\'');
        sbLIZ.append(", drillPath='");
        sbLIZ.append(this.drillPath);
        sbLIZ.append('\'');
        sbLIZ.append(", syncWithException=");
        sbLIZ.append(this.syncWithException);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
