package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingCombineDataModel {

    @C09CT("/aweme/v1/abtest/param/")
    public AbTestCombineModel abTestCombineModel;

    @C09CT("/aweme/v2/activity/settings/")
    public ActivitySettingCombineModel activitySetting;

    @C09CT("/aweme/v1/settings/")
    public AwemeSettingCombineModel awemeSetting;

    @C09CT("/aweme/v1/commerce/settings/")
    public CommerceSettingCombineModel commerceSettingCombineModel;

    @C09CT("/aweme/v1/compliance/settings/")
    public ComplianceSettingCombineModel complianceSetting;

    @C09CT("/webcast/setting/")
    public LiveSettingCombineModel liveSetting;

    @C09CT("/webcast/room/setting/")
    public LiveSettingCombineModel liveSettingMock;

    @C09CT("/webcast/setting/v2/")
    public LiveSettingCombineModelV2 liveSettingV2;

    @C09CT("/webcast/tab/")
    public LiveTabCombineModel liveTab;

    @C09CT("/aweme/v1/notice/count/")
    public NoticeCountCombineModel noticeCountModel;

    @C09CT("/tiktok/v1/efficiency_portrait/")
    public final PortraitCombineModel portraitCombineModel;

    @C09CT("/aweme/v1/rate/settings/")
    public RateSettingCombineModel rateSettingCombineModel;

    @C09CT("/aweme/v2/platform/share/settings/")
    public ShareSettingCombineModel shareSettingCombineModel;

    @C09CT("/service/settings/v3/")
    public UnifiedSettingCombineModel unifiedSetting;

    @C09CT("/aweme/v1/user/settings/")
    public UserSettingCombineModel userSettingCombineModel;

    public final void setAbTestCombineModel(AbTestCombineModel abTestCombineModel) {
        this.abTestCombineModel = abTestCombineModel;
    }

    public final void setActivitySetting(ActivitySettingCombineModel activitySettingCombineModel) {
        this.activitySetting = activitySettingCombineModel;
    }

    public final void setAwemeSetting(AwemeSettingCombineModel awemeSettingCombineModel) {
        this.awemeSetting = awemeSettingCombineModel;
    }

    public final void setCommerceSettingCombineModel(CommerceSettingCombineModel commerceSettingCombineModel) {
        this.commerceSettingCombineModel = commerceSettingCombineModel;
    }

    public final void setComplianceSetting(ComplianceSettingCombineModel complianceSettingCombineModel) {
        this.complianceSetting = complianceSettingCombineModel;
    }

    public final void setLiveSetting(LiveSettingCombineModel liveSettingCombineModel) {
        this.liveSetting = liveSettingCombineModel;
    }

    public final void setLiveSettingMock(LiveSettingCombineModel liveSettingCombineModel) {
        this.liveSettingMock = liveSettingCombineModel;
    }

    public final void setLiveSettingV2(LiveSettingCombineModelV2 liveSettingCombineModelV2) {
        this.liveSettingV2 = liveSettingCombineModelV2;
    }

    public final void setLiveTab(LiveTabCombineModel liveTabCombineModel) {
        this.liveTab = liveTabCombineModel;
    }

    public final void setNoticeCountModel(NoticeCountCombineModel noticeCountCombineModel) {
        this.noticeCountModel = noticeCountCombineModel;
    }

    public final void setRateSettingCombineModel(RateSettingCombineModel rateSettingCombineModel) {
        this.rateSettingCombineModel = rateSettingCombineModel;
    }

    public final void setShareSettingCombineModel(ShareSettingCombineModel shareSettingCombineModel) {
        this.shareSettingCombineModel = shareSettingCombineModel;
    }

    public final void setUnifiedSetting(UnifiedSettingCombineModel unifiedSettingCombineModel) {
        this.unifiedSetting = unifiedSettingCombineModel;
    }

    public final void setUserSettingCombineModel(UserSettingCombineModel userSettingCombineModel) {
        this.userSettingCombineModel = userSettingCombineModel;
    }

    public SettingCombineDataModel(UnifiedSettingCombineModel unifiedSettingCombineModel, AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel, CommerceSettingCombineModel commerceSettingCombineModel, AbTestCombineModel abTestCombineModel, ShareSettingCombineModel shareSettingCombineModel, RateSettingCombineModel rateSettingCombineModel, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, LiveSettingCombineModelV2 liveSettingCombineModelV2, LiveSettingCombineModel liveSettingCombineModel2, LiveTabCombineModel liveTabCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, ActivitySettingCombineModel activitySettingCombineModel, PortraitCombineModel portraitCombineModel) {
        this.unifiedSetting = unifiedSettingCombineModel;
        this.awemeSetting = awemeSettingCombineModel;
        this.userSettingCombineModel = userSettingCombineModel;
        this.commerceSettingCombineModel = commerceSettingCombineModel;
        this.abTestCombineModel = abTestCombineModel;
        this.shareSettingCombineModel = shareSettingCombineModel;
        this.rateSettingCombineModel = rateSettingCombineModel;
        this.noticeCountModel = noticeCountCombineModel;
        this.liveSetting = liveSettingCombineModel;
        this.liveSettingV2 = liveSettingCombineModelV2;
        this.liveSettingMock = liveSettingCombineModel2;
        this.liveTab = liveTabCombineModel;
        this.complianceSetting = complianceSettingCombineModel;
        this.activitySetting = activitySettingCombineModel;
        this.portraitCombineModel = portraitCombineModel;
    }
}
