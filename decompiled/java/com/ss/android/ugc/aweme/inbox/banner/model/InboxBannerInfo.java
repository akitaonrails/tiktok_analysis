package com.ss.android.ugc.aweme.inbox.banner.model;

import X.C09CT;
import X.InterfaceC111300bX;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxBannerInfo implements InterfaceC111300bX {

    @C09CT("banner_key")
    public final String bannerKey;

    @C09CT("button_info")
    public final InboxBannerButtonInfo buttonInfo;

    @C09CT("close_button")
    public final Boolean closeButton;

    @C09CT("content")
    public final String content;

    @C09CT("dark_icon_url")
    public final UrlModel darkIconUrl;

    @C09CT("event_params")
    public final Map<String, String> eventParams;

    @C09CT("exit_strategy")
    public final List<InboxBannerExitStrategyData> exitStrategy;

    @C09CT("frequency_control")
    public final List<InboxBannerFrequencyControlData> frequencyControl;

    @C09CT("highlight_info")
    public final InboxBannerHighlightInfo highlightInfo;

    @C09CT("icon_size")
    public final Integer iconSizeStyle;

    @C09CT("icon_url")
    public final UrlModel iconUrl;

    @C09CT("template_icon_local")
    public final UrlModel localIconUrl;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("strategy_key")
    public final String strategyKey;

    @C09CT("template_type")
    public final Integer templateType;

    @C09CT("title")
    public final String title;

    public InboxBannerInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxBannerInfo)) {
            return false;
        }
        InboxBannerInfo inboxBannerInfo = (InboxBannerInfo) obj;
        return Intrinsics.LJFF(this.bannerKey, inboxBannerInfo.bannerKey) && Intrinsics.LJFF(this.closeButton, inboxBannerInfo.closeButton) && Intrinsics.LJFF(this.iconUrl, inboxBannerInfo.iconUrl) && Intrinsics.LJFF(this.title, inboxBannerInfo.title) && Intrinsics.LJFF(this.content, inboxBannerInfo.content) && Intrinsics.LJFF(this.buttonInfo, inboxBannerInfo.buttonInfo) && Intrinsics.LJFF(this.schemaUrl, inboxBannerInfo.schemaUrl) && Intrinsics.LJFF(this.frequencyControl, inboxBannerInfo.frequencyControl) && Intrinsics.LJFF(this.exitStrategy, inboxBannerInfo.exitStrategy) && Intrinsics.LJFF(this.strategyKey, inboxBannerInfo.strategyKey) && Intrinsics.LJFF(this.eventParams, inboxBannerInfo.eventParams) && Intrinsics.LJFF(this.templateType, inboxBannerInfo.templateType) && Intrinsics.LJFF(this.highlightInfo, inboxBannerInfo.highlightInfo) && Intrinsics.LJFF(this.darkIconUrl, inboxBannerInfo.darkIconUrl) && Intrinsics.LJFF(this.localIconUrl, inboxBannerInfo.localIconUrl) && Intrinsics.LJFF(this.iconSizeStyle, inboxBannerInfo.iconSizeStyle);
    }

    public final int hashCode() {
        String str = this.bannerKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.closeButton;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UrlModel urlModel = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InboxBannerButtonInfo inboxBannerButtonInfo = this.buttonInfo;
        int iHashCode6 = (iHashCode5 + (inboxBannerButtonInfo == null ? 0 : inboxBannerButtonInfo.hashCode())) * 31;
        String str4 = this.schemaUrl;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<InboxBannerFrequencyControlData> list = this.frequencyControl;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<InboxBannerExitStrategyData> list2 = this.exitStrategy;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.strategyKey;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.eventParams;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.templateType;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        InboxBannerHighlightInfo inboxBannerHighlightInfo = this.highlightInfo;
        int iHashCode13 = (iHashCode12 + (inboxBannerHighlightInfo == null ? 0 : inboxBannerHighlightInfo.hashCode())) * 31;
        UrlModel urlModel2 = this.darkIconUrl;
        int iHashCode14 = (iHashCode13 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        UrlModel urlModel3 = this.localIconUrl;
        int iHashCode15 = (iHashCode14 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        Integer num2 = this.iconSizeStyle;
        return iHashCode15 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "InboxBannerInfo(bannerKey=" + this.bannerKey + ", closeButton=" + this.closeButton + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", content=" + this.content + ", buttonInfo=" + this.buttonInfo + ", schemaUrl=" + this.schemaUrl + ", frequencyControl=" + this.frequencyControl + ", exitStrategy=" + this.exitStrategy + ", strategyKey=" + this.strategyKey + ", eventParams=" + this.eventParams + ", templateType=" + this.templateType + ", highlightInfo=" + this.highlightInfo + ", darkIconUrl=" + this.darkIconUrl + ", localIconUrl=" + this.localIconUrl + ", iconSizeStyle=" + this.iconSizeStyle + ')';
    }

    public InboxBannerInfo(String str, Boolean bool, UrlModel urlModel, String str2, String str3, InboxBannerButtonInfo inboxBannerButtonInfo, String str4, List<InboxBannerFrequencyControlData> list, List<InboxBannerExitStrategyData> list2, String str5, Map<String, String> map, Integer num, InboxBannerHighlightInfo inboxBannerHighlightInfo, UrlModel urlModel2, UrlModel urlModel3, Integer num2) {
        this.bannerKey = str;
        this.closeButton = bool;
        this.iconUrl = urlModel;
        this.title = str2;
        this.content = str3;
        this.buttonInfo = inboxBannerButtonInfo;
        this.schemaUrl = str4;
        this.frequencyControl = list;
        this.exitStrategy = list2;
        this.strategyKey = str5;
        this.eventParams = map;
        this.templateType = num;
        this.highlightInfo = inboxBannerHighlightInfo;
        this.darkIconUrl = urlModel2;
        this.localIconUrl = urlModel3;
        this.iconSizeStyle = num2;
    }
}
