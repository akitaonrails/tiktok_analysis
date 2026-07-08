package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSpecialShapedCardExtraTrackConfigModel {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("enable_report_container_appear")
    public final Boolean enableReportContainerAppear;

    @C09CT("enable_report_load_process")
    public final Boolean enableReportLoadProcess;

    @C09CT("enable_report_register_biz_card")
    public final Boolean enableReportRegisterBizCard;

    public FeedSpecialShapedCardExtraTrackConfigModel() {
        this(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
    }

    public FeedSpecialShapedCardExtraTrackConfigModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.enable = bool;
        this.enableReportRegisterBizCard = bool2;
        this.enableReportContainerAppear = bool3;
        this.enableReportLoadProcess = bool4;
    }
}
