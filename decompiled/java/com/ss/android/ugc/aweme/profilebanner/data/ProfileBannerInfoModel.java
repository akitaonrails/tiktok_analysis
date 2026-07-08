package com.ss.android.ugc.aweme.profilebanner.data;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ProfileBannerInfoModel {

    @C09CT("banner_key")
    public final String bannerKey;

    @C09CT("button_info")
    public final ButtonInfo buttonInfo;

    @C09CT("content")
    public final String content;

    @C09CT("dismiss_after_click")
    public final boolean dismissAfterClick;

    @C09CT("duration")
    public final int duration;

    @C09CT("event_params")
    public final List<EventParam> eventParams;

    @C09CT("highlight_info")
    public final HighLightInfo highLightInfo;

    @C09CT("icon_url")
    public final UrlModel iconUrl;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("close_button")
    public final boolean showCloseButton;

    @C09CT("strategy_key")
    public final String strategyKey;

    @C09CT("template_type")
    public final int templateType;

    @C09CT("title")
    public final String title;

    public ProfileBannerInfoModel() {
        this(null, null, null, null, null, null, null, null, 0, true, true, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileBannerInfoModel)) {
            return false;
        }
        ProfileBannerInfoModel profileBannerInfoModel = (ProfileBannerInfoModel) obj;
        return Intrinsics.LJFF(this.bannerKey, profileBannerInfoModel.bannerKey) && Intrinsics.LJFF(this.strategyKey, profileBannerInfoModel.strategyKey) && Intrinsics.LJFF(this.title, profileBannerInfoModel.title) && Intrinsics.LJFF(this.content, profileBannerInfoModel.content) && Intrinsics.LJFF(this.iconUrl, profileBannerInfoModel.iconUrl) && Intrinsics.LJFF(this.buttonInfo, profileBannerInfoModel.buttonInfo) && Intrinsics.LJFF(this.highLightInfo, profileBannerInfoModel.highLightInfo) && Intrinsics.LJFF(this.schemaUrl, profileBannerInfoModel.schemaUrl) && this.duration == profileBannerInfoModel.duration && this.showCloseButton == profileBannerInfoModel.showCloseButton && this.dismissAfterClick == profileBannerInfoModel.dismissAfterClick && this.templateType == profileBannerInfoModel.templateType && Intrinsics.LJFF(this.eventParams, profileBannerInfoModel.eventParams);
    }

    public final int hashCode() {
        String str = this.bannerKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.strategyKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel = this.iconUrl;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        ButtonInfo buttonInfo = this.buttonInfo;
        int iHashCode6 = (iHashCode5 + (buttonInfo == null ? 0 : buttonInfo.hashCode())) * 31;
        HighLightInfo highLightInfo = this.highLightInfo;
        int iHashCode7 = (iHashCode6 + (highLightInfo == null ? 0 : highLightInfo.hashCode())) * 31;
        String str5 = this.schemaUrl;
        int iHashCode8 = (((((((((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.duration) * 31) + C786410Ut5.Z2(this.showCloseButton)) * 31) + C786410Ut5.Z2(this.dismissAfterClick)) * 31) + this.templateType) * 31;
        List<EventParam> list = this.eventParams;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileBannerInfoModel(bannerKey=" + this.bannerKey + ", strategyKey=" + this.strategyKey + ", title=" + this.title + ", content=" + this.content + ", iconUrl=" + this.iconUrl + ", buttonInfo=" + this.buttonInfo + ", highLightInfo=" + this.highLightInfo + ", schemaUrl=" + this.schemaUrl + ", duration=" + this.duration + ", showCloseButton=" + this.showCloseButton + ", dismissAfterClick=" + this.dismissAfterClick + ", templateType=" + this.templateType + ", eventParams=" + this.eventParams + ')';
    }

    public ProfileBannerInfoModel(String str, String str2, String str3, String str4, UrlModel urlModel, ButtonInfo buttonInfo, HighLightInfo highLightInfo, String str5, int i, boolean z, boolean z2, int i2, List<EventParam> list) {
        this.bannerKey = str;
        this.strategyKey = str2;
        this.title = str3;
        this.content = str4;
        this.iconUrl = urlModel;
        this.buttonInfo = buttonInfo;
        this.highLightInfo = highLightInfo;
        this.schemaUrl = str5;
        this.duration = i;
        this.showCloseButton = z;
        this.dismissAfterClick = z2;
        this.templateType = i2;
        this.eventParams = list;
    }
}
