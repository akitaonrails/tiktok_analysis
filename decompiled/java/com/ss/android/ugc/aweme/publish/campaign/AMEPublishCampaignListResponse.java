package com.ss.android.ugc.aweme.publish.campaign;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AMEPublishCampaignListResponse {

    @C09CT("activity_list")
    public final List<AMEPublishCampaignItem> activityList;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_message")
    public final String statusMessage;

    public AMEPublishCampaignListResponse() {
        this(0, "", 0, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMEPublishCampaignListResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMessage=");
        sbLIZ.append(this.statusMessage);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", activityList=");
        sbLIZ.append(this.activityList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AMEPublishCampaignListResponse(int i, String str, int i2, List<AMEPublishCampaignItem> list) {
        this.statusCode = i;
        this.statusMessage = str;
        this.errorCode = i2;
        this.activityList = list;
    }
}
